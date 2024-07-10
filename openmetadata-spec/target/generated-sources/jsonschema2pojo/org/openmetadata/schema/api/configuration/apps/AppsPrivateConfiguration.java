
package org.openmetadata.schema.api.configuration.apps;

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
 * AppsPrivateConfiguration
 * <p>
 * This schema defines a list of configurations for the Application Framework
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "appsPrivateConfiguration"
})
@Generated("jsonschema2pojo")
public class AppsPrivateConfiguration {

    /**
     * List of configuration for apps
     * (Required)
     * 
     */
    @JsonProperty("appsPrivateConfiguration")
    @JsonPropertyDescription("List of configuration for apps")
    @Valid
    @NotNull
    private List<AppPrivateConfig> appsPrivateConfiguration = new ArrayList<AppPrivateConfig>();

    /**
     * List of configuration for apps
     * (Required)
     * 
     */
    @JsonProperty("appsPrivateConfiguration")
    public List<AppPrivateConfig> getAppsPrivateConfiguration() {
        return appsPrivateConfiguration;
    }

    /**
     * List of configuration for apps
     * (Required)
     * 
     */
    @JsonProperty("appsPrivateConfiguration")
    public void setAppsPrivateConfiguration(List<AppPrivateConfig> appsPrivateConfiguration) {
        this.appsPrivateConfiguration = appsPrivateConfiguration;
    }

    public AppsPrivateConfiguration withAppsPrivateConfiguration(List<AppPrivateConfig> appsPrivateConfiguration) {
        this.appsPrivateConfiguration = appsPrivateConfiguration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppsPrivateConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appsPrivateConfiguration");
        sb.append('=');
        sb.append(((this.appsPrivateConfiguration == null)?"<null>":this.appsPrivateConfiguration));
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
        result = ((result* 31)+((this.appsPrivateConfiguration == null)? 0 :this.appsPrivateConfiguration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppsPrivateConfiguration) == false) {
            return false;
        }
        AppsPrivateConfiguration rhs = ((AppsPrivateConfiguration) other);
        return ((this.appsPrivateConfiguration == rhs.appsPrivateConfiguration)||((this.appsPrivateConfiguration!= null)&&this.appsPrivateConfiguration.equals(rhs.appsPrivateConfiguration)));
    }

}
