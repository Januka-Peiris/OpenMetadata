
package org.openmetadata.schema.api.configuration.apps;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AppPrivateConfig
 * <p>
 * Single Application Configuration Definition
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "preview",
    "parameters"
})
@Generated("jsonschema2pojo")
public class AppPrivateConfig {

    /**
     * Application Name
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Application Name")
    @NotNull
    private String name;
    /**
     * Flag to enable/disable preview for the application. If the app is in preview mode, it can't be installed.
     * 
     */
    @JsonProperty("preview")
    @JsonPropertyDescription("Flag to enable/disable preview for the application. If the app is in preview mode, it can't be installed.")
    private Boolean preview = false;
    /**
     * Parameters to initialize the Applications.
     * (Required)
     * 
     */
    @JsonProperty("parameters")
    @JsonPropertyDescription("Parameters to initialize the Applications.")
    @Valid
    @NotNull
    private Parameters parameters;

    /**
     * Application Name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Application Name
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public AppPrivateConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Flag to enable/disable preview for the application. If the app is in preview mode, it can't be installed.
     * 
     */
    @JsonProperty("preview")
    public Boolean getPreview() {
        return preview;
    }

    /**
     * Flag to enable/disable preview for the application. If the app is in preview mode, it can't be installed.
     * 
     */
    @JsonProperty("preview")
    public void setPreview(Boolean preview) {
        this.preview = preview;
    }

    public AppPrivateConfig withPreview(Boolean preview) {
        this.preview = preview;
        return this;
    }

    /**
     * Parameters to initialize the Applications.
     * (Required)
     * 
     */
    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Parameters to initialize the Applications.
     * (Required)
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public AppPrivateConfig withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppPrivateConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("preview");
        sb.append('=');
        sb.append(((this.preview == null)?"<null>":this.preview));
        sb.append(',');
        sb.append("parameters");
        sb.append('=');
        sb.append(((this.parameters == null)?"<null>":this.parameters));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.preview == null)? 0 :this.preview.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppPrivateConfig) == false) {
            return false;
        }
        AppPrivateConfig rhs = ((AppPrivateConfig) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.preview == rhs.preview)||((this.preview!= null)&&this.preview.equals(rhs.preview))))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))));
    }

}
