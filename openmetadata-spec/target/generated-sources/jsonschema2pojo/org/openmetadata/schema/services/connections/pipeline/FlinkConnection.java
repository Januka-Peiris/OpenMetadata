
package org.openmetadata.schema.services.connections.pipeline;

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
import org.openmetadata.annotations.MaskedField;
import org.openmetadata.schema.security.ssl.VerifySSL;


/**
 * FlinkConnection
 * <p>
 * Flink Metadata Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "verifySSL",
    "sslConfig"
})
@Generated("jsonschema2pojo")
public class FlinkConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private FlinkConnection.FlinkType type = FlinkConnection.FlinkType.fromValue("Flink");
    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Pipeline Service Management/UI URI.")
    @ExposedField
    @NotNull
    private URI hostPort = URI.create("https://api.flink.com");
    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    @JsonPropertyDescription("Client SSL verification. Make sure to configure the SSLConfig if enabled.")
    private VerifySSL verifySSL = VerifySSL.fromValue("no-ssl");
    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @JsonPropertyDescription("Client SSL configuration")
    @MaskedField
    private Object sslConfig;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public FlinkConnection.FlinkType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(FlinkConnection.FlinkType type) {
        this.type = type;
    }

    public FlinkConnection withType(FlinkConnection.FlinkType type) {
        this.type = type;
        return this;
    }

    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host And Port
     * <p>
     * Pipeline Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public FlinkConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public VerifySSL getVerifySSL() {
        return verifySSL;
    }

    /**
     * Verify SSL
     * <p>
     * Client SSL verification. Make sure to configure the SSLConfig if enabled.
     * 
     */
    @JsonProperty("verifySSL")
    public void setVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
    }

    public FlinkConnection withVerifySSL(VerifySSL verifySSL) {
        this.verifySSL = verifySSL;
        return this;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @MaskedField
    public Object getSslConfig() {
        return sslConfig;
    }

    /**
     * SSL Config
     * <p>
     * Client SSL configuration
     * 
     */
    @JsonProperty("sslConfig")
    @MaskedField
    public void setSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
    }

    public FlinkConnection withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FlinkConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("verifySSL");
        sb.append('=');
        sb.append(((this.verifySSL == null)?"<null>":this.verifySSL));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
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
        result = ((result* 31)+((this.verifySSL == null)? 0 :this.verifySSL.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlinkConnection) == false) {
            return false;
        }
        FlinkConnection rhs = ((FlinkConnection) other);
        return (((((this.verifySSL == rhs.verifySSL)||((this.verifySSL!= null)&&this.verifySSL.equals(rhs.verifySSL)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum FlinkType {

        FLINK("Flink");
        private final String value;
        private final static Map<String, FlinkConnection.FlinkType> CONSTANTS = new HashMap<String, FlinkConnection.FlinkType>();

        static {
            for (FlinkConnection.FlinkType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        FlinkType(String value) {
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
        public static FlinkConnection.FlinkType fromValue(String value) {
            FlinkConnection.FlinkType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
