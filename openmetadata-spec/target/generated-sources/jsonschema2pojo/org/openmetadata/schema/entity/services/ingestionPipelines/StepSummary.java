
package org.openmetadata.schema.entity.services.ingestionPipelines;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Defines the summary status of each step executed in an Ingestion Pipeline.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "records",
    "updated_records",
    "warnings",
    "errors",
    "filtered",
    "failures"
})
@Generated("jsonschema2pojo")
public class StepSummary {

    /**
     * Step name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Step name")
    @NotNull
    private String name;
    /**
     * Number of successfully processed records.
     * 
     */
    @JsonProperty("records")
    @JsonPropertyDescription("Number of successfully processed records.")
    private Integer records = 0;
    /**
     * Number of successfully updated records.
     * 
     */
    @JsonProperty("updated_records")
    @JsonPropertyDescription("Number of successfully updated records.")
    private Integer updatedRecords = 0;
    /**
     * Number of records raising warnings.
     * 
     */
    @JsonProperty("warnings")
    @JsonPropertyDescription("Number of records raising warnings.")
    private Integer warnings = 0;
    /**
     * Number of records with errors.
     * 
     */
    @JsonProperty("errors")
    @JsonPropertyDescription("Number of records with errors.")
    private Integer errors = 0;
    /**
     * Number of filtered records.
     * 
     */
    @JsonProperty("filtered")
    @JsonPropertyDescription("Number of filtered records.")
    private Integer filtered = 0;
    /**
     * Sample of errors encountered in the step
     * 
     */
    @JsonProperty("failures")
    @JsonPropertyDescription("Sample of errors encountered in the step")
    @Valid
    private List<StackTraceError> failures = new ArrayList<StackTraceError>();

    /**
     * Step name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Step name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StepSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Number of successfully processed records.
     * 
     */
    @JsonProperty("records")
    public Integer getRecords() {
        return records;
    }

    /**
     * Number of successfully processed records.
     * 
     */
    @JsonProperty("records")
    public void setRecords(Integer records) {
        this.records = records;
    }

    public StepSummary withRecords(Integer records) {
        this.records = records;
        return this;
    }

    /**
     * Number of successfully updated records.
     * 
     */
    @JsonProperty("updated_records")
    public Integer getUpdatedRecords() {
        return updatedRecords;
    }

    /**
     * Number of successfully updated records.
     * 
     */
    @JsonProperty("updated_records")
    public void setUpdatedRecords(Integer updatedRecords) {
        this.updatedRecords = updatedRecords;
    }

    public StepSummary withUpdatedRecords(Integer updatedRecords) {
        this.updatedRecords = updatedRecords;
        return this;
    }

    /**
     * Number of records raising warnings.
     * 
     */
    @JsonProperty("warnings")
    public Integer getWarnings() {
        return warnings;
    }

    /**
     * Number of records raising warnings.
     * 
     */
    @JsonProperty("warnings")
    public void setWarnings(Integer warnings) {
        this.warnings = warnings;
    }

    public StepSummary withWarnings(Integer warnings) {
        this.warnings = warnings;
        return this;
    }

    /**
     * Number of records with errors.
     * 
     */
    @JsonProperty("errors")
    public Integer getErrors() {
        return errors;
    }

    /**
     * Number of records with errors.
     * 
     */
    @JsonProperty("errors")
    public void setErrors(Integer errors) {
        this.errors = errors;
    }

    public StepSummary withErrors(Integer errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Number of filtered records.
     * 
     */
    @JsonProperty("filtered")
    public Integer getFiltered() {
        return filtered;
    }

    /**
     * Number of filtered records.
     * 
     */
    @JsonProperty("filtered")
    public void setFiltered(Integer filtered) {
        this.filtered = filtered;
    }

    public StepSummary withFiltered(Integer filtered) {
        this.filtered = filtered;
        return this;
    }

    /**
     * Sample of errors encountered in the step
     * 
     */
    @JsonProperty("failures")
    public List<StackTraceError> getFailures() {
        return failures;
    }

    /**
     * Sample of errors encountered in the step
     * 
     */
    @JsonProperty("failures")
    public void setFailures(List<StackTraceError> failures) {
        this.failures = failures;
    }

    public StepSummary withFailures(List<StackTraceError> failures) {
        this.failures = failures;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StepSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("records");
        sb.append('=');
        sb.append(((this.records == null)?"<null>":this.records));
        sb.append(',');
        sb.append("updatedRecords");
        sb.append('=');
        sb.append(((this.updatedRecords == null)?"<null>":this.updatedRecords));
        sb.append(',');
        sb.append("warnings");
        sb.append('=');
        sb.append(((this.warnings == null)?"<null>":this.warnings));
        sb.append(',');
        sb.append("errors");
        sb.append('=');
        sb.append(((this.errors == null)?"<null>":this.errors));
        sb.append(',');
        sb.append("filtered");
        sb.append('=');
        sb.append(((this.filtered == null)?"<null>":this.filtered));
        sb.append(',');
        sb.append("failures");
        sb.append('=');
        sb.append(((this.failures == null)?"<null>":this.failures));
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
        result = ((result* 31)+((this.failures == null)? 0 :this.failures.hashCode()));
        result = ((result* 31)+((this.filtered == null)? 0 :this.filtered.hashCode()));
        result = ((result* 31)+((this.records == null)? 0 :this.records.hashCode()));
        result = ((result* 31)+((this.warnings == null)? 0 :this.warnings.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.errors == null)? 0 :this.errors.hashCode()));
        result = ((result* 31)+((this.updatedRecords == null)? 0 :this.updatedRecords.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepSummary) == false) {
            return false;
        }
        StepSummary rhs = ((StepSummary) other);
        return ((((((((this.failures == rhs.failures)||((this.failures!= null)&&this.failures.equals(rhs.failures)))&&((this.filtered == rhs.filtered)||((this.filtered!= null)&&this.filtered.equals(rhs.filtered))))&&((this.records == rhs.records)||((this.records!= null)&&this.records.equals(rhs.records))))&&((this.warnings == rhs.warnings)||((this.warnings!= null)&&this.warnings.equals(rhs.warnings))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.errors == rhs.errors)||((this.errors!= null)&&this.errors.equals(rhs.errors))))&&((this.updatedRecords == rhs.updatedRecords)||((this.updatedRecords!= null)&&this.updatedRecords.equals(rhs.updatedRecords))));
    }

}
