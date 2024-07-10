
package org.openmetadata.schema.services.connections.database.common;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.AzureCredentials;


/**
 * Azure Configuration Source
 * <p>
 * Azure Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "azureConfig"
})
@Generated("jsonschema2pojo")
public class AzureConfig {

    /**
     * AzureCredentials
     * <p>
     * Azure Cloud Credentials
     * 
     */
    @JsonProperty("azureConfig")
    @JsonPropertyDescription("Azure Cloud Credentials")
    @Valid
    private AzureCredentials azureConfig;

    /**
     * AzureCredentials
     * <p>
     * Azure Cloud Credentials
     * 
     */
    @JsonProperty("azureConfig")
    public AzureCredentials getAzureConfig() {
        return azureConfig;
    }

    /**
     * AzureCredentials
     * <p>
     * Azure Cloud Credentials
     * 
     */
    @JsonProperty("azureConfig")
    public void setAzureConfig(AzureCredentials azureConfig) {
        this.azureConfig = azureConfig;
    }

    public AzureConfig withAzureConfig(AzureCredentials azureConfig) {
        this.azureConfig = azureConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AzureConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("azureConfig");
        sb.append('=');
        sb.append(((this.azureConfig == null)?"<null>":this.azureConfig));
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
        result = ((result* 31)+((this.azureConfig == null)? 0 :this.azureConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AzureConfig) == false) {
            return false;
        }
        AzureConfig rhs = ((AzureConfig) other);
        return ((this.azureConfig == rhs.azureConfig)||((this.azureConfig!= null)&&this.azureConfig.equals(rhs.azureConfig)));
    }

}
