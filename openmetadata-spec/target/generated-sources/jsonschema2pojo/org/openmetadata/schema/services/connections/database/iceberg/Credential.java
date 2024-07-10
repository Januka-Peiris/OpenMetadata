
package org.openmetadata.schema.services.connections.database.iceberg;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * OAuth2 Credential
 * <p>
 * OAuth2 credential to use when initializing the catalog.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "clientSecret"
})
@Generated("jsonschema2pojo")
public class Credential {

    /**
     * Client ID
     * <p>
     * OAuth2 Client ID.
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("OAuth2 Client ID.")
    @PasswordField
    private String clientId;
    /**
     * Client Secret
     * <p>
     * OAuth2 Client Secret
     * 
     */
    @JsonProperty("clientSecret")
    @JsonPropertyDescription("OAuth2 Client Secret")
    @PasswordField
    private String clientSecret;

    /**
     * Client ID
     * <p>
     * OAuth2 Client ID.
     * 
     */
    @JsonProperty("clientId")
    @PasswordField
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID
     * <p>
     * OAuth2 Client ID.
     * 
     */
    @JsonProperty("clientId")
    @PasswordField
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public Credential withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret
     * <p>
     * OAuth2 Client Secret
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Client Secret
     * <p>
     * OAuth2 Client Secret
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public Credential withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Credential.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
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
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Credential) == false) {
            return false;
        }
        Credential rhs = ((Credential) other);
        return (((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret)))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))));
    }

}
