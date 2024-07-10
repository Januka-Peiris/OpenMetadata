
package org.openmetadata.schema.security.sasl;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.services.connections.messaging.SaslMechanismType;


/**
 * SASL Client Config
 * <p>
 * SASL client configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "saslMechanism",
    "saslUsername",
    "saslPassword"
})
@Generated("jsonschema2pojo")
public class SASLClientConfig {

    /**
     * SaslMechanismType
     * <p>
     * SASL Mechanism consumer config property
     * 
     */
    @JsonProperty("saslMechanism")
    @JsonPropertyDescription("SASL Mechanism consumer config property")
    private SaslMechanismType saslMechanism = SaslMechanismType.fromValue("PLAIN");
    /**
     * SASL Username
     * <p>
     * The SASL authentication username.
     * 
     */
    @JsonProperty("saslUsername")
    @JsonPropertyDescription("The SASL authentication username.")
    private String saslUsername;
    /**
     * SASL Password
     * <p>
     * The SASL authentication password.
     * 
     */
    @JsonProperty("saslPassword")
    @JsonPropertyDescription("The SASL authentication password.")
    private String saslPassword;

    /**
     * SaslMechanismType
     * <p>
     * SASL Mechanism consumer config property
     * 
     */
    @JsonProperty("saslMechanism")
    public SaslMechanismType getSaslMechanism() {
        return saslMechanism;
    }

    /**
     * SaslMechanismType
     * <p>
     * SASL Mechanism consumer config property
     * 
     */
    @JsonProperty("saslMechanism")
    public void setSaslMechanism(SaslMechanismType saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public SASLClientConfig withSaslMechanism(SaslMechanismType saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * SASL Username
     * <p>
     * The SASL authentication username.
     * 
     */
    @JsonProperty("saslUsername")
    public String getSaslUsername() {
        return saslUsername;
    }

    /**
     * SASL Username
     * <p>
     * The SASL authentication username.
     * 
     */
    @JsonProperty("saslUsername")
    public void setSaslUsername(String saslUsername) {
        this.saslUsername = saslUsername;
    }

    public SASLClientConfig withSaslUsername(String saslUsername) {
        this.saslUsername = saslUsername;
        return this;
    }

    /**
     * SASL Password
     * <p>
     * The SASL authentication password.
     * 
     */
    @JsonProperty("saslPassword")
    public String getSaslPassword() {
        return saslPassword;
    }

    /**
     * SASL Password
     * <p>
     * The SASL authentication password.
     * 
     */
    @JsonProperty("saslPassword")
    public void setSaslPassword(String saslPassword) {
        this.saslPassword = saslPassword;
    }

    public SASLClientConfig withSaslPassword(String saslPassword) {
        this.saslPassword = saslPassword;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SASLClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("saslMechanism");
        sb.append('=');
        sb.append(((this.saslMechanism == null)?"<null>":this.saslMechanism));
        sb.append(',');
        sb.append("saslUsername");
        sb.append('=');
        sb.append(((this.saslUsername == null)?"<null>":this.saslUsername));
        sb.append(',');
        sb.append("saslPassword");
        sb.append('=');
        sb.append(((this.saslPassword == null)?"<null>":this.saslPassword));
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
        result = ((result* 31)+((this.saslUsername == null)? 0 :this.saslUsername.hashCode()));
        result = ((result* 31)+((this.saslMechanism == null)? 0 :this.saslMechanism.hashCode()));
        result = ((result* 31)+((this.saslPassword == null)? 0 :this.saslPassword.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SASLClientConfig) == false) {
            return false;
        }
        SASLClientConfig rhs = ((SASLClientConfig) other);
        return ((((this.saslUsername == rhs.saslUsername)||((this.saslUsername!= null)&&this.saslUsername.equals(rhs.saslUsername)))&&((this.saslMechanism == rhs.saslMechanism)||((this.saslMechanism!= null)&&this.saslMechanism.equals(rhs.saslMechanism))))&&((this.saslPassword == rhs.saslPassword)||((this.saslPassword!= null)&&this.saslPassword.equals(rhs.saslPassword))));
    }

}
