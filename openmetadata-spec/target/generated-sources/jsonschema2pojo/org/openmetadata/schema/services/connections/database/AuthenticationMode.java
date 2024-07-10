
package org.openmetadata.schema.services.connections.database;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Authentication Mode
 * <p>
 * This parameter determines the mode of authentication for connecting to AzureSQL using ODBC. If 'Active Directory Password' is selected, you need to provide the password. If 'Active Directory Integrated' is selected, password is not required as it uses the logged-in user's credentials. This mode is useful for establishing secure and seamless connections with AzureSQL.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "authentication",
    "encrypt",
    "trustServerCertificate",
    "connectionTimeout"
})
@Generated("jsonschema2pojo")
public class AuthenticationMode {

    /**
     * Authentication
     * <p>
     * Authentication from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("authentication")
    @JsonPropertyDescription("Authentication from Connection String for AzureSQL.")
    private AuthenticationMode.Authentication authentication;
    /**
     * Encrypt
     * <p>
     * Encrypt from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("encrypt")
    @JsonPropertyDescription("Encrypt from Connection String for AzureSQL.")
    private Boolean encrypt;
    /**
     * Trust Server Certificate
     * <p>
     * Trust Server Certificate from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("trustServerCertificate")
    @JsonPropertyDescription("Trust Server Certificate from Connection String for AzureSQL.")
    private Boolean trustServerCertificate;
    /**
     * Connection Timeout
     * <p>
     * Connection Timeout from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("connectionTimeout")
    @JsonPropertyDescription("Connection Timeout from Connection String for AzureSQL.")
    private Integer connectionTimeout = 30;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Authentication
     * <p>
     * Authentication from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("authentication")
    public AuthenticationMode.Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Authentication
     * <p>
     * Authentication from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("authentication")
    public void setAuthentication(AuthenticationMode.Authentication authentication) {
        this.authentication = authentication;
    }

    public AuthenticationMode withAuthentication(AuthenticationMode.Authentication authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * Encrypt
     * <p>
     * Encrypt from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("encrypt")
    public Boolean getEncrypt() {
        return encrypt;
    }

    /**
     * Encrypt
     * <p>
     * Encrypt from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("encrypt")
    public void setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
    }

    public AuthenticationMode withEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }

    /**
     * Trust Server Certificate
     * <p>
     * Trust Server Certificate from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("trustServerCertificate")
    public Boolean getTrustServerCertificate() {
        return trustServerCertificate;
    }

    /**
     * Trust Server Certificate
     * <p>
     * Trust Server Certificate from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("trustServerCertificate")
    public void setTrustServerCertificate(Boolean trustServerCertificate) {
        this.trustServerCertificate = trustServerCertificate;
    }

    public AuthenticationMode withTrustServerCertificate(Boolean trustServerCertificate) {
        this.trustServerCertificate = trustServerCertificate;
        return this;
    }

    /**
     * Connection Timeout
     * <p>
     * Connection Timeout from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("connectionTimeout")
    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * Connection Timeout
     * <p>
     * Connection Timeout from Connection String for AzureSQL.
     * 
     */
    @JsonProperty("connectionTimeout")
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public AuthenticationMode withConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public AuthenticationMode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AuthenticationMode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("authentication");
        sb.append('=');
        sb.append(((this.authentication == null)?"<null>":this.authentication));
        sb.append(',');
        sb.append("encrypt");
        sb.append('=');
        sb.append(((this.encrypt == null)?"<null>":this.encrypt));
        sb.append(',');
        sb.append("trustServerCertificate");
        sb.append('=');
        sb.append(((this.trustServerCertificate == null)?"<null>":this.trustServerCertificate));
        sb.append(',');
        sb.append("connectionTimeout");
        sb.append('=');
        sb.append(((this.connectionTimeout == null)?"<null>":this.connectionTimeout));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.trustServerCertificate == null)? 0 :this.trustServerCertificate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.connectionTimeout == null)? 0 :this.connectionTimeout.hashCode()));
        result = ((result* 31)+((this.encrypt == null)? 0 :this.encrypt.hashCode()));
        result = ((result* 31)+((this.authentication == null)? 0 :this.authentication.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthenticationMode) == false) {
            return false;
        }
        AuthenticationMode rhs = ((AuthenticationMode) other);
        return ((((((this.trustServerCertificate == rhs.trustServerCertificate)||((this.trustServerCertificate!= null)&&this.trustServerCertificate.equals(rhs.trustServerCertificate)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.connectionTimeout == rhs.connectionTimeout)||((this.connectionTimeout!= null)&&this.connectionTimeout.equals(rhs.connectionTimeout))))&&((this.encrypt == rhs.encrypt)||((this.encrypt!= null)&&this.encrypt.equals(rhs.encrypt))))&&((this.authentication == rhs.authentication)||((this.authentication!= null)&&this.authentication.equals(rhs.authentication))));
    }


    /**
     * Authentication
     * <p>
     * Authentication from Connection String for AzureSQL.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Authentication {

        ACTIVE_DIRECTORY_INTEGRATED("ActiveDirectoryIntegrated"),
        ACTIVE_DIRECTORY_PASSWORD("ActiveDirectoryPassword");
        private final String value;
        private final static Map<String, AuthenticationMode.Authentication> CONSTANTS = new HashMap<String, AuthenticationMode.Authentication>();

        static {
            for (AuthenticationMode.Authentication c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Authentication(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static AuthenticationMode.Authentication fromValue(String value) {
            AuthenticationMode.Authentication constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
