
package org.openmetadata.schema.configuration;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * FernetConfiguration
 * <p>
 * This schema defines the Limits Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "className",
    "enable",
    "limitsConfigFile"
})
@Generated("jsonschema2pojo")
public class LimitsConfiguration {

    /**
     * Class Name for authorizer.
     * 
     */
    @JsonProperty("className")
    @JsonPropertyDescription("Class Name for authorizer.")
    private String className = "org.openmetadata.service.limits.DefaultLimits";
    /**
     * Limits Enabled or Disabled.
     * (Required)
     * 
     */
    @JsonProperty("enable")
    @JsonPropertyDescription("Limits Enabled or Disabled.")
    @NotNull
    private Boolean enable = false;
    /**
     * Limits Configuration File.
     * 
     */
    @JsonProperty("limitsConfigFile")
    @JsonPropertyDescription("Limits Configuration File.")
    private String limitsConfigFile = "limits-config.yaml";

    /**
     * Class Name for authorizer.
     * 
     */
    @JsonProperty("className")
    public String getClassName() {
        return className;
    }

    /**
     * Class Name for authorizer.
     * 
     */
    @JsonProperty("className")
    public void setClassName(String className) {
        this.className = className;
    }

    public LimitsConfiguration withClassName(String className) {
        this.className = className;
        return this;
    }

    /**
     * Limits Enabled or Disabled.
     * (Required)
     * 
     */
    @JsonProperty("enable")
    public Boolean getEnable() {
        return enable;
    }

    /**
     * Limits Enabled or Disabled.
     * (Required)
     * 
     */
    @JsonProperty("enable")
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LimitsConfiguration withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Limits Configuration File.
     * 
     */
    @JsonProperty("limitsConfigFile")
    public String getLimitsConfigFile() {
        return limitsConfigFile;
    }

    /**
     * Limits Configuration File.
     * 
     */
    @JsonProperty("limitsConfigFile")
    public void setLimitsConfigFile(String limitsConfigFile) {
        this.limitsConfigFile = limitsConfigFile;
    }

    public LimitsConfiguration withLimitsConfigFile(String limitsConfigFile) {
        this.limitsConfigFile = limitsConfigFile;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LimitsConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("className");
        sb.append('=');
        sb.append(((this.className == null)?"<null>":this.className));
        sb.append(',');
        sb.append("enable");
        sb.append('=');
        sb.append(((this.enable == null)?"<null>":this.enable));
        sb.append(',');
        sb.append("limitsConfigFile");
        sb.append('=');
        sb.append(((this.limitsConfigFile == null)?"<null>":this.limitsConfigFile));
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
        result = ((result* 31)+((this.limitsConfigFile == null)? 0 :this.limitsConfigFile.hashCode()));
        result = ((result* 31)+((this.className == null)? 0 :this.className.hashCode()));
        result = ((result* 31)+((this.enable == null)? 0 :this.enable.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LimitsConfiguration) == false) {
            return false;
        }
        LimitsConfiguration rhs = ((LimitsConfiguration) other);
        return ((((this.limitsConfigFile == rhs.limitsConfigFile)||((this.limitsConfigFile!= null)&&this.limitsConfigFile.equals(rhs.limitsConfigFile)))&&((this.className == rhs.className)||((this.className!= null)&&this.className.equals(rhs.className))))&&((this.enable == rhs.enable)||((this.enable!= null)&&this.enable.equals(rhs.enable))));
    }

}
