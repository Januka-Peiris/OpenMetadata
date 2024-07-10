
package org.openmetadata.schema.services.connections.dashboard;

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
 * QlikCloudConnection
 * <p>
 * Qlik Cloud Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "token",
    "hostPort",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class QlikCloudConnection {

    /**
     * Qlik Cloud service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Qlik Cloud service type")
    private QlikCloudConnection.QlikCloudType type = QlikCloudConnection.QlikCloudType.fromValue("QlikCloud");
    /**
     * token
     * <p>
     * token to connect to Qlik Cloud.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("token to connect to Qlik Cloud.")
    @PasswordField
    @NotNull
    private String token;
    /**
     * Host and Port
     * <p>
     * Host and Port of the Qlik Cloud instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and Port of the Qlik Cloud instance.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Qlik Cloud service type
     * 
     */
    @JsonProperty("type")
    public QlikCloudConnection.QlikCloudType getType() {
        return type;
    }

    /**
     * Qlik Cloud service type
     * 
     */
    @JsonProperty("type")
    public void setType(QlikCloudConnection.QlikCloudType type) {
        this.type = type;
    }

    public QlikCloudConnection withType(QlikCloudConnection.QlikCloudType type) {
        this.type = type;
        return this;
    }

    /**
     * token
     * <p>
     * token to connect to Qlik Cloud.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * token
     * <p>
     * token to connect to Qlik Cloud.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public QlikCloudConnection withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and Port of the Qlik Cloud instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and Port of the Qlik Cloud instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public QlikCloudConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public QlikCloudConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QlikCloudConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QlikCloudConnection) == false) {
            return false;
        }
        QlikCloudConnection rhs = ((QlikCloudConnection) other);
        return (((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * Qlik Cloud service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum QlikCloudType {

        QLIK_CLOUD("QlikCloud");
        private final String value;
        private final static Map<String, QlikCloudConnection.QlikCloudType> CONSTANTS = new HashMap<String, QlikCloudConnection.QlikCloudType>();

        static {
            for (QlikCloudConnection.QlikCloudType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        QlikCloudType(String value) {
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
        public static QlikCloudConnection.QlikCloudType fromValue(String value) {
            QlikCloudConnection.QlikCloudType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
