
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * PipelineServiceMetadataPipeline
 * <p>
 * PipelineService Metadata Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "includeLineage",
    "includeOwners",
    "pipelineFilterPattern",
    "lineageInformation",
    "markDeletedPipelines",
    "includeTags",
    "includeUnDeployedPipelines",
    "overrideMetadata"
})
@Generated("jsonschema2pojo")
public class PipelineServiceMetadataPipeline {

    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config Metadata Pipeline type")
    private PipelineServiceMetadataPipeline.PipelineMetadataConfigType type = PipelineServiceMetadataPipeline.PipelineMetadataConfigType.fromValue("PipelineMetadata");
    /**
     * Include Lineage
     * <p>
     * Optional configuration to turn off fetching lineage from pipelines.
     * 
     */
    @JsonProperty("includeLineage")
    @JsonPropertyDescription("Optional configuration to turn off fetching lineage from pipelines.")
    private Boolean includeLineage = true;
    /**
     * Include Owners
     * <p>
     * Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.
     * 
     */
    @JsonProperty("includeOwners")
    @JsonPropertyDescription("Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.")
    private Boolean includeOwners = true;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("pipelineFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern pipelineFilterPattern;
    /**
     * Lineage Information
     * <p>
     * Details required to generate Lineage
     * 
     */
    @JsonProperty("lineageInformation")
    @JsonPropertyDescription("Details required to generate Lineage")
    @Valid
    private LineageInformation__1 lineageInformation;
    /**
     * Mark Deleted Pipeline
     * <p>
     * Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted
     * 
     */
    @JsonProperty("markDeletedPipelines")
    @JsonPropertyDescription("Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted")
    private Boolean markDeletedPipelines = true;
    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    @JsonPropertyDescription("Optional configuration to toggle the tags ingestion.")
    private Boolean includeTags = true;
    /**
     * Include UnDeployed Pipelines
     * <p>
     * Optional configuration to toggle whether the un-deployed pipelines should be ingested or not. If set to false, only deployed pipelines will be ingested.
     * 
     */
    @JsonProperty("includeUnDeployedPipelines")
    @JsonPropertyDescription("Optional configuration to toggle whether the un-deployed pipelines should be ingested or not. If set to false, only deployed pipelines will be ingested.")
    private Boolean includeUnDeployedPipelines = true;
    /**
     * Override Metadata
     * <p>
     * Set the 'Override Metadata' toggle to control whether to override the existing metadata in the OpenMetadata server with the metadata fetched from the source. If the toggle is set to true, the metadata fetched from the source will override the existing metadata in the OpenMetadata server. If the toggle is set to false, the metadata fetched from the source will not override the existing metadata in the OpenMetadata server. This is applicable for fields like description, tags, owner and displayName
     * 
     */
    @JsonProperty("overrideMetadata")
    @JsonPropertyDescription("Set the 'Override Metadata' toggle to control whether to override the existing metadata in the OpenMetadata server with the metadata fetched from the source. If the toggle is set to true, the metadata fetched from the source will override the existing metadata in the OpenMetadata server. If the toggle is set to false, the metadata fetched from the source will not override the existing metadata in the OpenMetadata server. This is applicable for fields like description, tags, owner and displayName")
    private Boolean overrideMetadata = false;

    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public PipelineServiceMetadataPipeline.PipelineMetadataConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(PipelineServiceMetadataPipeline.PipelineMetadataConfigType type) {
        this.type = type;
    }

    public PipelineServiceMetadataPipeline withType(PipelineServiceMetadataPipeline.PipelineMetadataConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Include Lineage
     * <p>
     * Optional configuration to turn off fetching lineage from pipelines.
     * 
     */
    @JsonProperty("includeLineage")
    public Boolean getIncludeLineage() {
        return includeLineage;
    }

    /**
     * Include Lineage
     * <p>
     * Optional configuration to turn off fetching lineage from pipelines.
     * 
     */
    @JsonProperty("includeLineage")
    public void setIncludeLineage(Boolean includeLineage) {
        this.includeLineage = includeLineage;
    }

    public PipelineServiceMetadataPipeline withIncludeLineage(Boolean includeLineage) {
        this.includeLineage = includeLineage;
        return this;
    }

    /**
     * Include Owners
     * <p>
     * Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.
     * 
     */
    @JsonProperty("includeOwners")
    public Boolean getIncludeOwners() {
        return includeOwners;
    }

    /**
     * Include Owners
     * <p>
     * Set the 'Include Owners' toggle to control whether to include owners to the ingested entity if the owner email matches with a user stored in the OM server as part of metadata ingestion. If the ingested entity already exists and has an owner, the owner will not be overwritten.
     * 
     */
    @JsonProperty("includeOwners")
    public void setIncludeOwners(Boolean includeOwners) {
        this.includeOwners = includeOwners;
    }

    public PipelineServiceMetadataPipeline withIncludeOwners(Boolean includeOwners) {
        this.includeOwners = includeOwners;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("pipelineFilterPattern")
    public FilterPattern getPipelineFilterPattern() {
        return pipelineFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("pipelineFilterPattern")
    public void setPipelineFilterPattern(FilterPattern pipelineFilterPattern) {
        this.pipelineFilterPattern = pipelineFilterPattern;
    }

    public PipelineServiceMetadataPipeline withPipelineFilterPattern(FilterPattern pipelineFilterPattern) {
        this.pipelineFilterPattern = pipelineFilterPattern;
        return this;
    }

    /**
     * Lineage Information
     * <p>
     * Details required to generate Lineage
     * 
     */
    @JsonProperty("lineageInformation")
    public LineageInformation__1 getLineageInformation() {
        return lineageInformation;
    }

    /**
     * Lineage Information
     * <p>
     * Details required to generate Lineage
     * 
     */
    @JsonProperty("lineageInformation")
    public void setLineageInformation(LineageInformation__1 lineageInformation) {
        this.lineageInformation = lineageInformation;
    }

    public PipelineServiceMetadataPipeline withLineageInformation(LineageInformation__1 lineageInformation) {
        this.lineageInformation = lineageInformation;
        return this;
    }

    /**
     * Mark Deleted Pipeline
     * <p>
     * Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted
     * 
     */
    @JsonProperty("markDeletedPipelines")
    public Boolean getMarkDeletedPipelines() {
        return markDeletedPipelines;
    }

    /**
     * Mark Deleted Pipeline
     * <p>
     * Optional configuration to soft delete Pipelines in OpenMetadata if the source Pipelines are deleted. Also, if the Pipeline is deleted, all the associated entities like lineage, etc., with that Pipeline will be deleted
     * 
     */
    @JsonProperty("markDeletedPipelines")
    public void setMarkDeletedPipelines(Boolean markDeletedPipelines) {
        this.markDeletedPipelines = markDeletedPipelines;
    }

    public PipelineServiceMetadataPipeline withMarkDeletedPipelines(Boolean markDeletedPipelines) {
        this.markDeletedPipelines = markDeletedPipelines;
        return this;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public Boolean getIncludeTags() {
        return includeTags;
    }

    /**
     * Include Tags
     * <p>
     * Optional configuration to toggle the tags ingestion.
     * 
     */
    @JsonProperty("includeTags")
    public void setIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
    }

    public PipelineServiceMetadataPipeline withIncludeTags(Boolean includeTags) {
        this.includeTags = includeTags;
        return this;
    }

    /**
     * Include UnDeployed Pipelines
     * <p>
     * Optional configuration to toggle whether the un-deployed pipelines should be ingested or not. If set to false, only deployed pipelines will be ingested.
     * 
     */
    @JsonProperty("includeUnDeployedPipelines")
    public Boolean getIncludeUnDeployedPipelines() {
        return includeUnDeployedPipelines;
    }

    /**
     * Include UnDeployed Pipelines
     * <p>
     * Optional configuration to toggle whether the un-deployed pipelines should be ingested or not. If set to false, only deployed pipelines will be ingested.
     * 
     */
    @JsonProperty("includeUnDeployedPipelines")
    public void setIncludeUnDeployedPipelines(Boolean includeUnDeployedPipelines) {
        this.includeUnDeployedPipelines = includeUnDeployedPipelines;
    }

    public PipelineServiceMetadataPipeline withIncludeUnDeployedPipelines(Boolean includeUnDeployedPipelines) {
        this.includeUnDeployedPipelines = includeUnDeployedPipelines;
        return this;
    }

    /**
     * Override Metadata
     * <p>
     * Set the 'Override Metadata' toggle to control whether to override the existing metadata in the OpenMetadata server with the metadata fetched from the source. If the toggle is set to true, the metadata fetched from the source will override the existing metadata in the OpenMetadata server. If the toggle is set to false, the metadata fetched from the source will not override the existing metadata in the OpenMetadata server. This is applicable for fields like description, tags, owner and displayName
     * 
     */
    @JsonProperty("overrideMetadata")
    public Boolean getOverrideMetadata() {
        return overrideMetadata;
    }

    /**
     * Override Metadata
     * <p>
     * Set the 'Override Metadata' toggle to control whether to override the existing metadata in the OpenMetadata server with the metadata fetched from the source. If the toggle is set to true, the metadata fetched from the source will override the existing metadata in the OpenMetadata server. If the toggle is set to false, the metadata fetched from the source will not override the existing metadata in the OpenMetadata server. This is applicable for fields like description, tags, owner and displayName
     * 
     */
    @JsonProperty("overrideMetadata")
    public void setOverrideMetadata(Boolean overrideMetadata) {
        this.overrideMetadata = overrideMetadata;
    }

    public PipelineServiceMetadataPipeline withOverrideMetadata(Boolean overrideMetadata) {
        this.overrideMetadata = overrideMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PipelineServiceMetadataPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("includeLineage");
        sb.append('=');
        sb.append(((this.includeLineage == null)?"<null>":this.includeLineage));
        sb.append(',');
        sb.append("includeOwners");
        sb.append('=');
        sb.append(((this.includeOwners == null)?"<null>":this.includeOwners));
        sb.append(',');
        sb.append("pipelineFilterPattern");
        sb.append('=');
        sb.append(((this.pipelineFilterPattern == null)?"<null>":this.pipelineFilterPattern));
        sb.append(',');
        sb.append("lineageInformation");
        sb.append('=');
        sb.append(((this.lineageInformation == null)?"<null>":this.lineageInformation));
        sb.append(',');
        sb.append("markDeletedPipelines");
        sb.append('=');
        sb.append(((this.markDeletedPipelines == null)?"<null>":this.markDeletedPipelines));
        sb.append(',');
        sb.append("includeTags");
        sb.append('=');
        sb.append(((this.includeTags == null)?"<null>":this.includeTags));
        sb.append(',');
        sb.append("includeUnDeployedPipelines");
        sb.append('=');
        sb.append(((this.includeUnDeployedPipelines == null)?"<null>":this.includeUnDeployedPipelines));
        sb.append(',');
        sb.append("overrideMetadata");
        sb.append('=');
        sb.append(((this.overrideMetadata == null)?"<null>":this.overrideMetadata));
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
        result = ((result* 31)+((this.pipelineFilterPattern == null)? 0 :this.pipelineFilterPattern.hashCode()));
        result = ((result* 31)+((this.includeTags == null)? 0 :this.includeTags.hashCode()));
        result = ((result* 31)+((this.overrideMetadata == null)? 0 :this.overrideMetadata.hashCode()));
        result = ((result* 31)+((this.includeOwners == null)? 0 :this.includeOwners.hashCode()));
        result = ((result* 31)+((this.includeLineage == null)? 0 :this.includeLineage.hashCode()));
        result = ((result* 31)+((this.markDeletedPipelines == null)? 0 :this.markDeletedPipelines.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.lineageInformation == null)? 0 :this.lineageInformation.hashCode()));
        result = ((result* 31)+((this.includeUnDeployedPipelines == null)? 0 :this.includeUnDeployedPipelines.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PipelineServiceMetadataPipeline) == false) {
            return false;
        }
        PipelineServiceMetadataPipeline rhs = ((PipelineServiceMetadataPipeline) other);
        return ((((((((((this.pipelineFilterPattern == rhs.pipelineFilterPattern)||((this.pipelineFilterPattern!= null)&&this.pipelineFilterPattern.equals(rhs.pipelineFilterPattern)))&&((this.includeTags == rhs.includeTags)||((this.includeTags!= null)&&this.includeTags.equals(rhs.includeTags))))&&((this.overrideMetadata == rhs.overrideMetadata)||((this.overrideMetadata!= null)&&this.overrideMetadata.equals(rhs.overrideMetadata))))&&((this.includeOwners == rhs.includeOwners)||((this.includeOwners!= null)&&this.includeOwners.equals(rhs.includeOwners))))&&((this.includeLineage == rhs.includeLineage)||((this.includeLineage!= null)&&this.includeLineage.equals(rhs.includeLineage))))&&((this.markDeletedPipelines == rhs.markDeletedPipelines)||((this.markDeletedPipelines!= null)&&this.markDeletedPipelines.equals(rhs.markDeletedPipelines))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.lineageInformation == rhs.lineageInformation)||((this.lineageInformation!= null)&&this.lineageInformation.equals(rhs.lineageInformation))))&&((this.includeUnDeployedPipelines == rhs.includeUnDeployedPipelines)||((this.includeUnDeployedPipelines!= null)&&this.includeUnDeployedPipelines.equals(rhs.includeUnDeployedPipelines))));
    }


    /**
     * Pipeline Source Config Metadata Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PipelineMetadataConfigType {

        PIPELINE_METADATA("PipelineMetadata");
        private final String value;
        private final static Map<String, PipelineServiceMetadataPipeline.PipelineMetadataConfigType> CONSTANTS = new HashMap<String, PipelineServiceMetadataPipeline.PipelineMetadataConfigType>();

        static {
            for (PipelineServiceMetadataPipeline.PipelineMetadataConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PipelineMetadataConfigType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static PipelineServiceMetadataPipeline.PipelineMetadataConfigType fromValue(String value) {
            PipelineServiceMetadataPipeline.PipelineMetadataConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
