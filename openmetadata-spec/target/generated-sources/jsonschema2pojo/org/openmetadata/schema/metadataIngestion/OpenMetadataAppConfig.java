
package org.openmetadata.schema.metadataIngestion;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * OpenMetadataApplicationConfig
 * <p>
 * OpenMetadata Ingestion Framework definition for Applications, i.e., the YAML shape we require.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "workflowConfig",
    "sourcePythonClass",
    "appConfig",
    "appPrivateConfig",
    "ingestionPipelineFQN",
    "pipelineRunId"
})
@Generated("jsonschema2pojo")
public class OpenMetadataAppConfig {

    /**
     * Configuration for the entire Ingestion Workflow.
     * (Required)
     * 
     */
    @JsonProperty("workflowConfig")
    @JsonPropertyDescription("Configuration for the entire Ingestion Workflow.")
    @Valid
    @NotNull
    private WorkflowConfig workflowConfig;
    /**
     * Source Python Class Name to run the application
     * 
     */
    @JsonProperty("sourcePythonClass")
    @JsonPropertyDescription("Source Python Class Name to run the application")
    private String sourcePythonClass;
    @JsonProperty("appConfig")
    private Object appConfig;
    @JsonProperty("appPrivateConfig")
    private Object appPrivateConfig;
    /**
     * Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline
     * 
     */
    @JsonProperty("ingestionPipelineFQN")
    @JsonPropertyDescription("Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline")
    private String ingestionPipelineFQN;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("pipelineRunId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID pipelineRunId;

    /**
     * Configuration for the entire Ingestion Workflow.
     * (Required)
     * 
     */
    @JsonProperty("workflowConfig")
    public WorkflowConfig getWorkflowConfig() {
        return workflowConfig;
    }

    /**
     * Configuration for the entire Ingestion Workflow.
     * (Required)
     * 
     */
    @JsonProperty("workflowConfig")
    public void setWorkflowConfig(WorkflowConfig workflowConfig) {
        this.workflowConfig = workflowConfig;
    }

    public OpenMetadataAppConfig withWorkflowConfig(WorkflowConfig workflowConfig) {
        this.workflowConfig = workflowConfig;
        return this;
    }

    /**
     * Source Python Class Name to run the application
     * 
     */
    @JsonProperty("sourcePythonClass")
    public String getSourcePythonClass() {
        return sourcePythonClass;
    }

    /**
     * Source Python Class Name to run the application
     * 
     */
    @JsonProperty("sourcePythonClass")
    public void setSourcePythonClass(String sourcePythonClass) {
        this.sourcePythonClass = sourcePythonClass;
    }

    public OpenMetadataAppConfig withSourcePythonClass(String sourcePythonClass) {
        this.sourcePythonClass = sourcePythonClass;
        return this;
    }

    @JsonProperty("appConfig")
    public Object getAppConfig() {
        return appConfig;
    }

    @JsonProperty("appConfig")
    public void setAppConfig(Object appConfig) {
        this.appConfig = appConfig;
    }

    public OpenMetadataAppConfig withAppConfig(Object appConfig) {
        this.appConfig = appConfig;
        return this;
    }

    @JsonProperty("appPrivateConfig")
    public Object getAppPrivateConfig() {
        return appPrivateConfig;
    }

    @JsonProperty("appPrivateConfig")
    public void setAppPrivateConfig(Object appPrivateConfig) {
        this.appPrivateConfig = appPrivateConfig;
    }

    public OpenMetadataAppConfig withAppPrivateConfig(Object appPrivateConfig) {
        this.appPrivateConfig = appPrivateConfig;
        return this;
    }

    /**
     * Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline
     * 
     */
    @JsonProperty("ingestionPipelineFQN")
    public String getIngestionPipelineFQN() {
        return ingestionPipelineFQN;
    }

    /**
     * Fully qualified name of ingestion pipeline, used to identify the current ingestion pipeline
     * 
     */
    @JsonProperty("ingestionPipelineFQN")
    public void setIngestionPipelineFQN(String ingestionPipelineFQN) {
        this.ingestionPipelineFQN = ingestionPipelineFQN;
    }

    public OpenMetadataAppConfig withIngestionPipelineFQN(String ingestionPipelineFQN) {
        this.ingestionPipelineFQN = ingestionPipelineFQN;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("pipelineRunId")
    public UUID getPipelineRunId() {
        return pipelineRunId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("pipelineRunId")
    public void setPipelineRunId(UUID pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
    }

    public OpenMetadataAppConfig withPipelineRunId(UUID pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenMetadataAppConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("workflowConfig");
        sb.append('=');
        sb.append(((this.workflowConfig == null)?"<null>":this.workflowConfig));
        sb.append(',');
        sb.append("sourcePythonClass");
        sb.append('=');
        sb.append(((this.sourcePythonClass == null)?"<null>":this.sourcePythonClass));
        sb.append(',');
        sb.append("appConfig");
        sb.append('=');
        sb.append(((this.appConfig == null)?"<null>":this.appConfig));
        sb.append(',');
        sb.append("appPrivateConfig");
        sb.append('=');
        sb.append(((this.appPrivateConfig == null)?"<null>":this.appPrivateConfig));
        sb.append(',');
        sb.append("ingestionPipelineFQN");
        sb.append('=');
        sb.append(((this.ingestionPipelineFQN == null)?"<null>":this.ingestionPipelineFQN));
        sb.append(',');
        sb.append("pipelineRunId");
        sb.append('=');
        sb.append(((this.pipelineRunId == null)?"<null>":this.pipelineRunId));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.workflowConfig == null)? 0 :this.workflowConfig.hashCode()));
        result = ((result* 31)+((this.sourcePythonClass == null)? 0 :this.sourcePythonClass.hashCode()));
        result = ((result* 31)+((this.appConfig == null)? 0 :this.appConfig.hashCode()));
        result = ((result* 31)+((this.ingestionPipelineFQN == null)? 0 :this.ingestionPipelineFQN.hashCode()));
        result = ((result* 31)+((this.appPrivateConfig == null)? 0 :this.appPrivateConfig.hashCode()));
        result = ((result* 31)+((this.pipelineRunId == null)? 0 :this.pipelineRunId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenMetadataAppConfig) == false) {
            return false;
        }
        OpenMetadataAppConfig rhs = ((OpenMetadataAppConfig) other);
        return (((((((this.workflowConfig == rhs.workflowConfig)||((this.workflowConfig!= null)&&this.workflowConfig.equals(rhs.workflowConfig)))&&((this.sourcePythonClass == rhs.sourcePythonClass)||((this.sourcePythonClass!= null)&&this.sourcePythonClass.equals(rhs.sourcePythonClass))))&&((this.appConfig == rhs.appConfig)||((this.appConfig!= null)&&this.appConfig.equals(rhs.appConfig))))&&((this.ingestionPipelineFQN == rhs.ingestionPipelineFQN)||((this.ingestionPipelineFQN!= null)&&this.ingestionPipelineFQN.equals(rhs.ingestionPipelineFQN))))&&((this.appPrivateConfig == rhs.appPrivateConfig)||((this.appPrivateConfig!= null)&&this.appPrivateConfig.equals(rhs.appPrivateConfig))))&&((this.pipelineRunId == rhs.pipelineRunId)||((this.pipelineRunId!= null)&&this.pipelineRunId.equals(rhs.pipelineRunId))));
    }

}
