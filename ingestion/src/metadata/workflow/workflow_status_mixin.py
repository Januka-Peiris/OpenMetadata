#  Copyright 2021 Collate
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#  http://www.apache.org/licenses/LICENSE-2.0
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.
"""
Add methods to the workflows for updating the IngestionPipeline status
"""
import traceback
import uuid
from datetime import datetime
from typing import Optional, Tuple

from metadata.config.common import WorkflowExecutionError
from metadata.generated.schema.entity.services.ingestionPipelines.ingestionPipeline import (
    IngestionPipeline,
    PipelineState,
    PipelineStatus,
)
from metadata.generated.schema.entity.services.ingestionPipelines.status import (
    IngestionStatus,
    StepSummary,
)
from metadata.generated.schema.metadataIngestion.workflow import (
    OpenMetadataWorkflowConfig,
)
from metadata.ingestion.api.step import Step, Summary
from metadata.ingestion.ometa.ometa_api import OpenMetadata
from metadata.utils.logger import ometa_logger

logger = ometa_logger()

SUCCESS_THRESHOLD_VALUE = 90


class WorkflowStatusMixin:
    """
    Helper methods to manage IngestionPipeline status
    and workflow run ID.

    To be inherited by the Base Workflow
    """

    config: OpenMetadataWorkflowConfig
    _run_id: Optional[str] = None
    metadata: OpenMetadata
    _start_ts: int
    ingestion_pipeline: Optional[IngestionPipeline]

    # All workflows execute a series of steps, aside from the source
    steps: Tuple[Step]

    @property
    def run_id(self) -> str:
        """
        If the config does not have an informed run id, we'll
        generate and assign one here.
        """
        if not self._run_id:
            if self.config.pipelineRunId:
                self._run_id = str(self.config.pipelineRunId.__root__)
            else:
                self._run_id = str(uuid.uuid4())

        return self._run_id

    def _new_pipeline_status(self, state: PipelineState) -> PipelineStatus:
        """Create new Pipeline Status"""
        return PipelineStatus(
            runId=self.run_id,
            pipelineState=state,
            startDate=self._start_ts,
            timestamp=self._start_ts,
        )

    def set_ingestion_pipeline_status(
        self,
        state: PipelineState,
        ingestion_status: Optional[IngestionStatus] = None,
    ) -> None:
        """
        Method to set the pipeline status of current ingestion pipeline
        """

        try:
            # if we don't have a related Ingestion Pipeline FQN, no status is set.
            if self.config.ingestionPipelineFQN and self.ingestion_pipeline:
                pipeline_status = self.metadata.get_pipeline_status(
                    self.ingestion_pipeline.fullyQualifiedName.__root__, self.run_id
                )
                if not pipeline_status:
                    # We need to crete the status
                    pipeline_status = self._new_pipeline_status(state)
                else:
                    # if workflow is ended then update the end date in status
                    pipeline_status.endDate = datetime.now().timestamp() * 1000
                    pipeline_status.pipelineState = state

                pipeline_status.status = (
                    ingestion_status if ingestion_status else pipeline_status.status
                )
                self.metadata.create_or_update_pipeline_status(
                    self.ingestion_pipeline.fullyQualifiedName.__root__, pipeline_status
                )
        except Exception as err:
            logger.debug(traceback.format_exc())
            logger.error(
                f"Unhandled error trying to update Ingestion Pipeline status [{err}]"
            )

    def raise_from_status(self, raise_warnings=False):
        """
        Method to raise error if failed execution
        and updating Ingestion Pipeline Status
        """
        try:
            self.raise_from_status_internal(raise_warnings)
        except WorkflowExecutionError as err:
            self.set_ingestion_pipeline_status(PipelineState.failed)
            raise err

    def result_status(self) -> int:
        """
        Returns 1 if source status is failed, 0 otherwise.
        """
        if self.get_failures():
            return 1
        return 0

    def build_ingestion_status(self) -> Optional[IngestionStatus]:
        """
        Get the results from the steps and prep the payload
        we'll send to the API
        """

        return IngestionStatus(
            __root__=[
                StepSummary.parse_obj(Summary.from_step(step).dict())
                for step in self.workflow_steps()
            ]
        )
