
package org.openmetadata.schema.services.connections.pipeline;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.ExposedField;


/**
 * KafkaConnectConnection
 * <p>
 * KafkaConnect Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "KafkaConnectConfig",
    "verifySSL",
    "messagingServiceName"
})
@Generated("jsonschema2pojo")
public class KafkaConnectConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private KafkaConnectConnection.KafkaConnectType type = KafkaConnectConnection.KafkaConnectType.fromValue("KafkaConnect");
    /**
     * Host And Port
     * <p>
     * KafkaConnect Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("KafkaConnect Service Management/UI URI.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Username/Password Authentication
     * <p>
     * username/password auth
     * 
     */
    @JsonProperty("KafkaConnectConfig")
    @JsonPropertyDescription("username/password auth")
    @Valid
    private BasicAuthentication kafkaConnectConfig;
    /**
     * Verify SSL
     * <p>
     * Boolean marking if we need to verify the SSL certs for KafkaConnect REST API. True by default.
     * 
     */
    @JsonProperty("verifySSL")
    @JsonPropertyDescription("Boolean marking if we need to verify the SSL certs for KafkaConnect REST API. True by default.")
    private Boolean verifySSL = true;
    /**
     * Kafka Service Name
     * <p>
     * Name of the Kafka Messaging Service associated with this KafkaConnect Pipeline Service. e.g. local_kafka
     * 
     */
    @JsonProperty("messagingServiceName")
    @JsonPropertyDescription("Name of the Kafka Messaging Service associated with this KafkaConnect Pipeline Service. e.g. local_kafka")
    private String messagingServiceName;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public KafkaConnectConnection.KafkaConnectType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(KafkaConnectConnection.KafkaConnectType type) {
        this.type = type;
    }

    public KafkaConnectConnection withType(KafkaConnectConnection.KafkaConnectType type) {
        this.type = type;
        return this;
    }

    /**
     * Host And Port
     * <p>
     * KafkaConnect Service Management/UI URI.
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
     * KafkaConnect Service Management/UI URI.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public KafkaConnectConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Username/Password Authentication
     * <p>
     * username/password auth
     * 
     */
    @JsonProperty("KafkaConnectConfig")
    public BasicAuthentication getKafkaConnectConfig() {
        return kafkaConnectConfig;
    }

    /**
     * Username/Password Authentication
     * <p>
     * username/password auth
     * 
     */
    @JsonProperty("KafkaConnectConfig")
    public void setKafkaConnectConfig(BasicAuthentication kafkaConnectConfig) {
        this.kafkaConnectConfig = kafkaConnectConfig;
    }

    public KafkaConnectConnection withKafkaConnectConfig(BasicAuthentication kafkaConnectConfig) {
        this.kafkaConnectConfig = kafkaConnectConfig;
        return this;
    }

    /**
     * Verify SSL
     * <p>
     * Boolean marking if we need to verify the SSL certs for KafkaConnect REST API. True by default.
     * 
     */
    @JsonProperty("verifySSL")
    public Boolean getVerifySSL() {
        return verifySSL;
    }

    /**
     * Verify SSL
     * <p>
     * Boolean marking if we need to verify the SSL certs for KafkaConnect REST API. True by default.
     * 
     */
    @JsonProperty("verifySSL")
    public void setVerifySSL(Boolean verifySSL) {
        this.verifySSL = verifySSL;
    }

    public KafkaConnectConnection withVerifySSL(Boolean verifySSL) {
        this.verifySSL = verifySSL;
        return this;
    }

    /**
     * Kafka Service Name
     * <p>
     * Name of the Kafka Messaging Service associated with this KafkaConnect Pipeline Service. e.g. local_kafka
     * 
     */
    @JsonProperty("messagingServiceName")
    public String getMessagingServiceName() {
        return messagingServiceName;
    }

    /**
     * Kafka Service Name
     * <p>
     * Name of the Kafka Messaging Service associated with this KafkaConnect Pipeline Service. e.g. local_kafka
     * 
     */
    @JsonProperty("messagingServiceName")
    public void setMessagingServiceName(String messagingServiceName) {
        this.messagingServiceName = messagingServiceName;
    }

    public KafkaConnectConnection withMessagingServiceName(String messagingServiceName) {
        this.messagingServiceName = messagingServiceName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(KafkaConnectConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("kafkaConnectConfig");
        sb.append('=');
        sb.append(((this.kafkaConnectConfig == null)?"<null>":this.kafkaConnectConfig));
        sb.append(',');
        sb.append("verifySSL");
        sb.append('=');
        sb.append(((this.verifySSL == null)?"<null>":this.verifySSL));
        sb.append(',');
        sb.append("messagingServiceName");
        sb.append('=');
        sb.append(((this.messagingServiceName == null)?"<null>":this.messagingServiceName));
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
        result = ((result* 31)+((this.kafkaConnectConfig == null)? 0 :this.kafkaConnectConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.messagingServiceName == null)? 0 :this.messagingServiceName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KafkaConnectConnection) == false) {
            return false;
        }
        KafkaConnectConnection rhs = ((KafkaConnectConnection) other);
        return ((((((this.verifySSL == rhs.verifySSL)||((this.verifySSL!= null)&&this.verifySSL.equals(rhs.verifySSL)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.kafkaConnectConfig == rhs.kafkaConnectConfig)||((this.kafkaConnectConfig!= null)&&this.kafkaConnectConfig.equals(rhs.kafkaConnectConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.messagingServiceName == rhs.messagingServiceName)||((this.messagingServiceName!= null)&&this.messagingServiceName.equals(rhs.messagingServiceName))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum KafkaConnectType {

        KAFKA_CONNECT("KafkaConnect");
        private final String value;
        private final static Map<String, KafkaConnectConnection.KafkaConnectType> CONSTANTS = new HashMap<String, KafkaConnectConnection.KafkaConnectType>();

        static {
            for (KafkaConnectConnection.KafkaConnectType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        KafkaConnectType(String value) {
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
        public static KafkaConnectConnection.KafkaConnectType fromValue(String value) {
            KafkaConnectConnection.KafkaConnectType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
