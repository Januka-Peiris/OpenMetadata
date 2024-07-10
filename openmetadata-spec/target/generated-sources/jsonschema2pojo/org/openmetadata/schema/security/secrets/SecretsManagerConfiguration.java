
package org.openmetadata.schema.security.secrets;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SecretsManagerConfiguration
 * <p>
 * OpenMetadata server configuration for the Secrets Manager feature.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "secretsManager",
    "prefix",
    "tags",
    "parameters"
})
@Generated("jsonschema2pojo")
public class SecretsManagerConfiguration {

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManager")
    @JsonPropertyDescription("OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.")
    private SecretsManagerProvider secretsManager = SecretsManagerProvider.fromValue("db");
    /**
     * Secret ID Prefix
     * <p>
     * Prefix to be added to the secret key ID: `/<prefix>/<clusterName>/<key>`
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Prefix to be added to the secret key ID: `/<prefix>/<clusterName>/<key>`")
    private String prefix;
    /**
     * Secret Resource Tags
     * <p>
     * Add tags to the created resource, e.g., in AWS. Format is `[key1:value1,key2:value2,...]`
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Add tags to the created resource, e.g., in AWS. Format is `[key1:value1,key2:value2,...]`")
    @Valid
    private List<String> tags = null;
    /**
     * Parameters
     * <p>
     * Extra parameters used by the Secrets Manager implementation.
     * 
     */
    @JsonProperty("parameters")
    @JsonPropertyDescription("Extra parameters used by the Secrets Manager implementation.")
    @Valid
    private Parameters parameters;

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManager")
    public SecretsManagerProvider getSecretsManager() {
        return secretsManager;
    }

    /**
     * Secrets Manager Provider
     * <p>
     * OpenMetadata Secrets Manager Provider. Make sure to configure the same secrets manager providers as the ones configured on the OpenMetadata server.
     * 
     */
    @JsonProperty("secretsManager")
    public void setSecretsManager(SecretsManagerProvider secretsManager) {
        this.secretsManager = secretsManager;
    }

    public SecretsManagerConfiguration withSecretsManager(SecretsManagerProvider secretsManager) {
        this.secretsManager = secretsManager;
        return this;
    }

    /**
     * Secret ID Prefix
     * <p>
     * Prefix to be added to the secret key ID: `/<prefix>/<clusterName>/<key>`
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Secret ID Prefix
     * <p>
     * Prefix to be added to the secret key ID: `/<prefix>/<clusterName>/<key>`
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public SecretsManagerConfiguration withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Secret Resource Tags
     * <p>
     * Add tags to the created resource, e.g., in AWS. Format is `[key1:value1,key2:value2,...]`
     * 
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * Secret Resource Tags
     * <p>
     * Add tags to the created resource, e.g., in AWS. Format is `[key1:value1,key2:value2,...]`
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public SecretsManagerConfiguration withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Parameters
     * <p>
     * Extra parameters used by the Secrets Manager implementation.
     * 
     */
    @JsonProperty("parameters")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Parameters
     * <p>
     * Extra parameters used by the Secrets Manager implementation.
     * 
     */
    @JsonProperty("parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public SecretsManagerConfiguration withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecretsManagerConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("secretsManager");
        sb.append('=');
        sb.append(((this.secretsManager == null)?"<null>":this.secretsManager));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.secretsManager == null)? 0 :this.secretsManager.hashCode()));
        result = ((result* 31)+((this.parameters == null)? 0 :this.parameters.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecretsManagerConfiguration) == false) {
            return false;
        }
        SecretsManagerConfiguration rhs = ((SecretsManagerConfiguration) other);
        return (((((this.secretsManager == rhs.secretsManager)||((this.secretsManager!= null)&&this.secretsManager.equals(rhs.secretsManager)))&&((this.parameters == rhs.parameters)||((this.parameters!= null)&&this.parameters.equals(rhs.parameters))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }

}
