
package org.openmetadata.schema.services.connections.api;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.ExposedField;
import org.openmetadata.annotations.PasswordField;


/**
 * RESTConnection
 * <p>
 * REST Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "openAPISchemaURL",
    "token"
})
@Generated("jsonschema2pojo")
public class RESTConnection {

    /**
     * REST API type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("REST API type")
    private RESTConnection.RESTAPIType type = RESTConnection.RESTAPIType.fromValue("REST");
    /**
     * OpenAPISchemaURL
     * <p>
     * Open API Schema URL.
     * (Required)
     * 
     */
    @JsonProperty("openAPISchemaURL")
    @JsonPropertyDescription("Open API Schema URL.")
    @ExposedField
    @NotNull
    private URI openAPISchemaURL;
    /**
     * Token
     * <p>
     * Generated Token to connect to OpenAPI Schema.
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Generated Token to connect to OpenAPI Schema.")
    @PasswordField
    private String token;

    /**
     * REST API type
     * 
     */
    @JsonProperty("type")
    public RESTConnection.RESTAPIType getType() {
        return type;
    }

    /**
     * REST API type
     * 
     */
    @JsonProperty("type")
    public void setType(RESTConnection.RESTAPIType type) {
        this.type = type;
    }

    public RESTConnection withType(RESTConnection.RESTAPIType type) {
        this.type = type;
        return this;
    }

    /**
     * OpenAPISchemaURL
     * <p>
     * Open API Schema URL.
     * (Required)
     * 
     */
    @JsonProperty("openAPISchemaURL")
    @ExposedField
    public URI getOpenAPISchemaURL() {
        return openAPISchemaURL;
    }

    /**
     * OpenAPISchemaURL
     * <p>
     * Open API Schema URL.
     * (Required)
     * 
     */
    @JsonProperty("openAPISchemaURL")
    @ExposedField
    public void setOpenAPISchemaURL(URI openAPISchemaURL) {
        this.openAPISchemaURL = openAPISchemaURL;
    }

    public RESTConnection withOpenAPISchemaURL(URI openAPISchemaURL) {
        this.openAPISchemaURL = openAPISchemaURL;
        return this;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to OpenAPI Schema.
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to OpenAPI Schema.
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public RESTConnection withToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RESTConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("openAPISchemaURL");
        sb.append('=');
        sb.append(((this.openAPISchemaURL == null)?"<null>":this.openAPISchemaURL));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.openAPISchemaURL == null)? 0 :this.openAPISchemaURL.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RESTConnection) == false) {
            return false;
        }
        RESTConnection rhs = ((RESTConnection) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.openAPISchemaURL == rhs.openAPISchemaURL)||((this.openAPISchemaURL!= null)&&this.openAPISchemaURL.equals(rhs.openAPISchemaURL))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * REST API type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RESTAPIType {

        REST("REST");
        private final String value;
        private final static Map<String, RESTConnection.RESTAPIType> CONSTANTS = new HashMap<String, RESTConnection.RESTAPIType>();

        static {
            for (RESTConnection.RESTAPIType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RESTAPIType(String value) {
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
        public static RESTConnection.RESTAPIType fromValue(String value) {
            RESTConnection.RESTAPIType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
