
package org.openmetadata.schema.security.ssl;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * Validate SSL Client Config
 * <p>
 * OpenMetadata Client configured to validate SSL certificates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "caCertificate",
    "sslCertificate",
    "sslKey"
})
@Generated("jsonschema2pojo")
public class ValidateSSLClientConfig {

    /**
     * CA Certificate
     * <p>
     * The CA certificate used for SSL validation.
     * 
     */
    @JsonProperty("caCertificate")
    @JsonPropertyDescription("The CA certificate used for SSL validation.")
    @PasswordField
    private String caCertificate;
    /**
     * SSL Certificate
     * <p>
     * The SSL certificate used for client authentication.
     * 
     */
    @JsonProperty("sslCertificate")
    @JsonPropertyDescription("The SSL certificate used for client authentication.")
    @PasswordField
    private String sslCertificate;
    /**
     * SSL Key
     * <p>
     * The private key associated with the SSL certificate.
     * 
     */
    @JsonProperty("sslKey")
    @JsonPropertyDescription("The private key associated with the SSL certificate.")
    @PasswordField
    private String sslKey;

    /**
     * CA Certificate
     * <p>
     * The CA certificate used for SSL validation.
     * 
     */
    @JsonProperty("caCertificate")
    @PasswordField
    public String getCaCertificate() {
        return caCertificate;
    }

    /**
     * CA Certificate
     * <p>
     * The CA certificate used for SSL validation.
     * 
     */
    @JsonProperty("caCertificate")
    @PasswordField
    public void setCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
    }

    public ValidateSSLClientConfig withCaCertificate(String caCertificate) {
        this.caCertificate = caCertificate;
        return this;
    }

    /**
     * SSL Certificate
     * <p>
     * The SSL certificate used for client authentication.
     * 
     */
    @JsonProperty("sslCertificate")
    @PasswordField
    public String getSslCertificate() {
        return sslCertificate;
    }

    /**
     * SSL Certificate
     * <p>
     * The SSL certificate used for client authentication.
     * 
     */
    @JsonProperty("sslCertificate")
    @PasswordField
    public void setSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
    }

    public ValidateSSLClientConfig withSslCertificate(String sslCertificate) {
        this.sslCertificate = sslCertificate;
        return this;
    }

    /**
     * SSL Key
     * <p>
     * The private key associated with the SSL certificate.
     * 
     */
    @JsonProperty("sslKey")
    @PasswordField
    public String getSslKey() {
        return sslKey;
    }

    /**
     * SSL Key
     * <p>
     * The private key associated with the SSL certificate.
     * 
     */
    @JsonProperty("sslKey")
    @PasswordField
    public void setSslKey(String sslKey) {
        this.sslKey = sslKey;
    }

    public ValidateSSLClientConfig withSslKey(String sslKey) {
        this.sslKey = sslKey;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValidateSSLClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("caCertificate");
        sb.append('=');
        sb.append(((this.caCertificate == null)?"<null>":this.caCertificate));
        sb.append(',');
        sb.append("sslCertificate");
        sb.append('=');
        sb.append(((this.sslCertificate == null)?"<null>":this.sslCertificate));
        sb.append(',');
        sb.append("sslKey");
        sb.append('=');
        sb.append(((this.sslKey == null)?"<null>":this.sslKey));
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
        result = ((result* 31)+((this.caCertificate == null)? 0 :this.caCertificate.hashCode()));
        result = ((result* 31)+((this.sslCertificate == null)? 0 :this.sslCertificate.hashCode()));
        result = ((result* 31)+((this.sslKey == null)? 0 :this.sslKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidateSSLClientConfig) == false) {
            return false;
        }
        ValidateSSLClientConfig rhs = ((ValidateSSLClientConfig) other);
        return ((((this.caCertificate == rhs.caCertificate)||((this.caCertificate!= null)&&this.caCertificate.equals(rhs.caCertificate)))&&((this.sslCertificate == rhs.sslCertificate)||((this.sslCertificate!= null)&&this.sslCertificate.equals(rhs.sslCertificate))))&&((this.sslKey == rhs.sslKey)||((this.sslKey!= null)&&this.sslKey.equals(rhs.sslKey))));
    }

}
