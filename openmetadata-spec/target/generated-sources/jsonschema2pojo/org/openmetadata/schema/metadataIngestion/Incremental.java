
package org.openmetadata.schema.metadataIngestion;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Incremental Metadata Extraction Configuration
 * <p>
 * Use incremental Metadata extraction after the first execution. This is commonly done by getting the changes from Audit tables on the supporting databases.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enabled",
    "lookbackDays",
    "safetyMarginDays"
})
@Generated("jsonschema2pojo")
public class Incremental {

    /**
     * Enabled
     * <p>
     * If True, enables Metadata Extraction to be incremental
     * (Required)
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("If True, enables Metadata Extraction to be incremental")
    @NotNull
    private Boolean enabled = false;
    /**
     * Successful Pipeline Run Lookback Days
     * <p>
     * Number os days to search back for a successful pipeline run. The timestamp of the last found successful pipeline run will be used as a base to search for updated entities.
     * 
     */
    @JsonProperty("lookbackDays")
    @JsonPropertyDescription("Number os days to search back for a successful pipeline run. The timestamp of the last found successful pipeline run will be used as a base to search for updated entities.")
    private Integer lookbackDays = 7;
    /**
     * Safety Margin Days
     * <p>
     * Number of days to add to the last successful pipeline run timestamp to search for updated entities.
     * 
     */
    @JsonProperty("safetyMarginDays")
    @JsonPropertyDescription("Number of days to add to the last successful pipeline run timestamp to search for updated entities.")
    private Integer safetyMarginDays = 1;

    /**
     * Enabled
     * <p>
     * If True, enables Metadata Extraction to be incremental
     * (Required)
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Enabled
     * <p>
     * If True, enables Metadata Extraction to be incremental
     * (Required)
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Incremental withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Successful Pipeline Run Lookback Days
     * <p>
     * Number os days to search back for a successful pipeline run. The timestamp of the last found successful pipeline run will be used as a base to search for updated entities.
     * 
     */
    @JsonProperty("lookbackDays")
    public Integer getLookbackDays() {
        return lookbackDays;
    }

    /**
     * Successful Pipeline Run Lookback Days
     * <p>
     * Number os days to search back for a successful pipeline run. The timestamp of the last found successful pipeline run will be used as a base to search for updated entities.
     * 
     */
    @JsonProperty("lookbackDays")
    public void setLookbackDays(Integer lookbackDays) {
        this.lookbackDays = lookbackDays;
    }

    public Incremental withLookbackDays(Integer lookbackDays) {
        this.lookbackDays = lookbackDays;
        return this;
    }

    /**
     * Safety Margin Days
     * <p>
     * Number of days to add to the last successful pipeline run timestamp to search for updated entities.
     * 
     */
    @JsonProperty("safetyMarginDays")
    public Integer getSafetyMarginDays() {
        return safetyMarginDays;
    }

    /**
     * Safety Margin Days
     * <p>
     * Number of days to add to the last successful pipeline run timestamp to search for updated entities.
     * 
     */
    @JsonProperty("safetyMarginDays")
    public void setSafetyMarginDays(Integer safetyMarginDays) {
        this.safetyMarginDays = safetyMarginDays;
    }

    public Incremental withSafetyMarginDays(Integer safetyMarginDays) {
        this.safetyMarginDays = safetyMarginDays;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Incremental.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("lookbackDays");
        sb.append('=');
        sb.append(((this.lookbackDays == null)?"<null>":this.lookbackDays));
        sb.append(',');
        sb.append("safetyMarginDays");
        sb.append('=');
        sb.append(((this.safetyMarginDays == null)?"<null>":this.safetyMarginDays));
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
        result = ((result* 31)+((this.lookbackDays == null)? 0 :this.lookbackDays.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.safetyMarginDays == null)? 0 :this.safetyMarginDays.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Incremental) == false) {
            return false;
        }
        Incremental rhs = ((Incremental) other);
        return ((((this.lookbackDays == rhs.lookbackDays)||((this.lookbackDays!= null)&&this.lookbackDays.equals(rhs.lookbackDays)))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.safetyMarginDays == rhs.safetyMarginDays)||((this.safetyMarginDays!= null)&&this.safetyMarginDays.equals(rhs.safetyMarginDays))));
    }

}
