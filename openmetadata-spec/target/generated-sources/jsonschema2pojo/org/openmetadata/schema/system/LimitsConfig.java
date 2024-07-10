
package org.openmetadata.schema.system;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * LimitsResponse
 * <p>
 * Limits Config schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "enable",
    "limits"
})
@Generated("jsonschema2pojo")
public class LimitsConfig {

    /**
     * Limits Enabled
     * 
     */
    @JsonProperty("enable")
    @JsonPropertyDescription("Limits Enabled")
    private Boolean enable = false;
    /**
     * Limits
     * 
     */
    @JsonProperty("limits")
    @JsonPropertyDescription("Limits")
    @Valid
    private Limits limits;

    /**
     * Limits Enabled
     * 
     */
    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    /**
     * Limits Enabled
     * 
     */
    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LimitsConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Limits
     * 
     */
    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    /**
     * Limits
     * 
     */
    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    public LimitsConfig withLimits(Limits limits) {
        this.limits = limits;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LimitsConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("enable");
        sb.append('=');
        sb.append(((this.enable == null)?"<null>":this.enable));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
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
        result = ((result* 31)+((this.enable == null)? 0 :this.enable.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LimitsConfig) == false) {
            return false;
        }
        LimitsConfig rhs = ((LimitsConfig) other);
        return (((this.enable == rhs.enable)||((this.enable!= null)&&this.enable.equals(rhs.enable)))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))));
    }

}
