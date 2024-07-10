
package org.openmetadata.schema.services.connections.pipeline;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.MaskedField;
import org.openmetadata.schema.security.sasl.SASLClientConfig;


/**
 * OpenLineageConnection
 * <p>
 * OpenLineage Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "brokersUrl",
    "topicName",
    "consumerGroupName",
    "consumerOffsets",
    "poolTimeout",
    "sessionTimeout",
    "securityProtocol",
    "sslConfig",
    "saslConfig",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class OpenLineageConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private OpenLineageConnection.OpenLineageType type = OpenLineageConnection.OpenLineageType.fromValue("OpenLineage");
    /**
     * Kafka brokers list
     * <p>
     * service type of the messaging source
     * 
     */
    @JsonProperty("brokersUrl")
    @JsonPropertyDescription("service type of the messaging source")
    private String brokersUrl;
    /**
     * Topic Name
     * <p>
     * topic from where Open lineage events will be pulled 
     * 
     */
    @JsonProperty("topicName")
    @JsonPropertyDescription("topic from where Open lineage events will be pulled ")
    private String topicName;
    /**
     * Consumer Group
     * <p>
     * consumer group name 
     * 
     */
    @JsonProperty("consumerGroupName")
    @JsonPropertyDescription("consumer group name ")
    private String consumerGroupName;
    /**
     * Initial consumer offsets
     * <p>
     * initial Kafka consumer offset
     * 
     */
    @JsonProperty("consumerOffsets")
    @JsonPropertyDescription("initial Kafka consumer offset")
    private OpenLineageConnection.ConsumerOffsets consumerOffsets = OpenLineageConnection.ConsumerOffsets.fromValue("earliest");
    /**
     * Single pool call timeout
     * <p>
     * max allowed wait time
     * 
     */
    @JsonProperty("poolTimeout")
    @JsonPropertyDescription("max allowed wait time")
    private Double poolTimeout = 1.0D;
    /**
     * Broker inactive session timeout
     * <p>
     * max allowed inactivity time
     * 
     */
    @JsonProperty("sessionTimeout")
    @JsonPropertyDescription("max allowed inactivity time")
    private Integer sessionTimeout = 30;
    /**
     * Kafka security protocol
     * <p>
     * Kafka security protocol config
     * 
     */
    @JsonProperty("securityProtocol")
    @JsonPropertyDescription("Kafka security protocol config")
    private OpenLineageConnection.SecurityProtocol securityProtocol = OpenLineageConnection.SecurityProtocol.fromValue("PLAINTEXT");
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
     * SASL Client Config
     * <p>
     * SASL client configuration.
     * 
     */
    @JsonProperty("saslConfig")
    @JsonPropertyDescription("SASL client configuration.")
    @Valid
    private SASLClientConfig saslConfig;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public OpenLineageConnection.OpenLineageType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(OpenLineageConnection.OpenLineageType type) {
        this.type = type;
    }

    public OpenLineageConnection withType(OpenLineageConnection.OpenLineageType type) {
        this.type = type;
        return this;
    }

    /**
     * Kafka brokers list
     * <p>
     * service type of the messaging source
     * 
     */
    @JsonProperty("brokersUrl")
    public String getBrokersUrl() {
        return brokersUrl;
    }

    /**
     * Kafka brokers list
     * <p>
     * service type of the messaging source
     * 
     */
    @JsonProperty("brokersUrl")
    public void setBrokersUrl(String brokersUrl) {
        this.brokersUrl = brokersUrl;
    }

    public OpenLineageConnection withBrokersUrl(String brokersUrl) {
        this.brokersUrl = brokersUrl;
        return this;
    }

    /**
     * Topic Name
     * <p>
     * topic from where Open lineage events will be pulled 
     * 
     */
    @JsonProperty("topicName")
    public String getTopicName() {
        return topicName;
    }

    /**
     * Topic Name
     * <p>
     * topic from where Open lineage events will be pulled 
     * 
     */
    @JsonProperty("topicName")
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public OpenLineageConnection withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * Consumer Group
     * <p>
     * consumer group name 
     * 
     */
    @JsonProperty("consumerGroupName")
    public String getConsumerGroupName() {
        return consumerGroupName;
    }

    /**
     * Consumer Group
     * <p>
     * consumer group name 
     * 
     */
    @JsonProperty("consumerGroupName")
    public void setConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
    }

    public OpenLineageConnection withConsumerGroupName(String consumerGroupName) {
        this.consumerGroupName = consumerGroupName;
        return this;
    }

    /**
     * Initial consumer offsets
     * <p>
     * initial Kafka consumer offset
     * 
     */
    @JsonProperty("consumerOffsets")
    public OpenLineageConnection.ConsumerOffsets getConsumerOffsets() {
        return consumerOffsets;
    }

    /**
     * Initial consumer offsets
     * <p>
     * initial Kafka consumer offset
     * 
     */
    @JsonProperty("consumerOffsets")
    public void setConsumerOffsets(OpenLineageConnection.ConsumerOffsets consumerOffsets) {
        this.consumerOffsets = consumerOffsets;
    }

    public OpenLineageConnection withConsumerOffsets(OpenLineageConnection.ConsumerOffsets consumerOffsets) {
        this.consumerOffsets = consumerOffsets;
        return this;
    }

    /**
     * Single pool call timeout
     * <p>
     * max allowed wait time
     * 
     */
    @JsonProperty("poolTimeout")
    public Double getPoolTimeout() {
        return poolTimeout;
    }

    /**
     * Single pool call timeout
     * <p>
     * max allowed wait time
     * 
     */
    @JsonProperty("poolTimeout")
    public void setPoolTimeout(Double poolTimeout) {
        this.poolTimeout = poolTimeout;
    }

    public OpenLineageConnection withPoolTimeout(Double poolTimeout) {
        this.poolTimeout = poolTimeout;
        return this;
    }

    /**
     * Broker inactive session timeout
     * <p>
     * max allowed inactivity time
     * 
     */
    @JsonProperty("sessionTimeout")
    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    /**
     * Broker inactive session timeout
     * <p>
     * max allowed inactivity time
     * 
     */
    @JsonProperty("sessionTimeout")
    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

    public OpenLineageConnection withSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
        return this;
    }

    /**
     * Kafka security protocol
     * <p>
     * Kafka security protocol config
     * 
     */
    @JsonProperty("securityProtocol")
    public OpenLineageConnection.SecurityProtocol getSecurityProtocol() {
        return securityProtocol;
    }

    /**
     * Kafka security protocol
     * <p>
     * Kafka security protocol config
     * 
     */
    @JsonProperty("securityProtocol")
    public void setSecurityProtocol(OpenLineageConnection.SecurityProtocol securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    public OpenLineageConnection withSecurityProtocol(OpenLineageConnection.SecurityProtocol securityProtocol) {
        this.securityProtocol = securityProtocol;
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

    public OpenLineageConnection withSslConfig(Object sslConfig) {
        this.sslConfig = sslConfig;
        return this;
    }

    /**
     * SASL Client Config
     * <p>
     * SASL client configuration.
     * 
     */
    @JsonProperty("saslConfig")
    public SASLClientConfig getSaslConfig() {
        return saslConfig;
    }

    /**
     * SASL Client Config
     * <p>
     * SASL client configuration.
     * 
     */
    @JsonProperty("saslConfig")
    public void setSaslConfig(SASLClientConfig saslConfig) {
        this.saslConfig = saslConfig;
    }

    public OpenLineageConnection withSaslConfig(SASLClientConfig saslConfig) {
        this.saslConfig = saslConfig;
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

    public OpenLineageConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OpenLineageConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("brokersUrl");
        sb.append('=');
        sb.append(((this.brokersUrl == null)?"<null>":this.brokersUrl));
        sb.append(',');
        sb.append("topicName");
        sb.append('=');
        sb.append(((this.topicName == null)?"<null>":this.topicName));
        sb.append(',');
        sb.append("consumerGroupName");
        sb.append('=');
        sb.append(((this.consumerGroupName == null)?"<null>":this.consumerGroupName));
        sb.append(',');
        sb.append("consumerOffsets");
        sb.append('=');
        sb.append(((this.consumerOffsets == null)?"<null>":this.consumerOffsets));
        sb.append(',');
        sb.append("poolTimeout");
        sb.append('=');
        sb.append(((this.poolTimeout == null)?"<null>":this.poolTimeout));
        sb.append(',');
        sb.append("sessionTimeout");
        sb.append('=');
        sb.append(((this.sessionTimeout == null)?"<null>":this.sessionTimeout));
        sb.append(',');
        sb.append("securityProtocol");
        sb.append('=');
        sb.append(((this.securityProtocol == null)?"<null>":this.securityProtocol));
        sb.append(',');
        sb.append("sslConfig");
        sb.append('=');
        sb.append(((this.sslConfig == null)?"<null>":this.sslConfig));
        sb.append(',');
        sb.append("saslConfig");
        sb.append('=');
        sb.append(((this.saslConfig == null)?"<null>":this.saslConfig));
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
        result = ((result* 31)+((this.saslConfig == null)? 0 :this.saslConfig.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.securityProtocol == null)? 0 :this.securityProtocol.hashCode()));
        result = ((result* 31)+((this.sslConfig == null)? 0 :this.sslConfig.hashCode()));
        result = ((result* 31)+((this.consumerOffsets == null)? 0 :this.consumerOffsets.hashCode()));
        result = ((result* 31)+((this.topicName == null)? 0 :this.topicName.hashCode()));
        result = ((result* 31)+((this.sessionTimeout == null)? 0 :this.sessionTimeout.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.brokersUrl == null)? 0 :this.brokersUrl.hashCode()));
        result = ((result* 31)+((this.consumerGroupName == null)? 0 :this.consumerGroupName.hashCode()));
        result = ((result* 31)+((this.poolTimeout == null)? 0 :this.poolTimeout.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OpenLineageConnection) == false) {
            return false;
        }
        OpenLineageConnection rhs = ((OpenLineageConnection) other);
        return ((((((((((((this.saslConfig == rhs.saslConfig)||((this.saslConfig!= null)&&this.saslConfig.equals(rhs.saslConfig)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.securityProtocol == rhs.securityProtocol)||((this.securityProtocol!= null)&&this.securityProtocol.equals(rhs.securityProtocol))))&&((this.sslConfig == rhs.sslConfig)||((this.sslConfig!= null)&&this.sslConfig.equals(rhs.sslConfig))))&&((this.consumerOffsets == rhs.consumerOffsets)||((this.consumerOffsets!= null)&&this.consumerOffsets.equals(rhs.consumerOffsets))))&&((this.topicName == rhs.topicName)||((this.topicName!= null)&&this.topicName.equals(rhs.topicName))))&&((this.sessionTimeout == rhs.sessionTimeout)||((this.sessionTimeout!= null)&&this.sessionTimeout.equals(rhs.sessionTimeout))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.brokersUrl == rhs.brokersUrl)||((this.brokersUrl!= null)&&this.brokersUrl.equals(rhs.brokersUrl))))&&((this.consumerGroupName == rhs.consumerGroupName)||((this.consumerGroupName!= null)&&this.consumerGroupName.equals(rhs.consumerGroupName))))&&((this.poolTimeout == rhs.poolTimeout)||((this.poolTimeout!= null)&&this.poolTimeout.equals(rhs.poolTimeout))));
    }


    /**
     * Initial consumer offsets
     * <p>
     * initial Kafka consumer offset
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ConsumerOffsets {

        earliest("earliest"),
        latest("latest");
        private final String value;
        private final static Map<String, OpenLineageConnection.ConsumerOffsets> CONSTANTS = new HashMap<String, OpenLineageConnection.ConsumerOffsets>();

        static {
            for (OpenLineageConnection.ConsumerOffsets c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ConsumerOffsets(String value) {
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
        public static OpenLineageConnection.ConsumerOffsets fromValue(String value) {
            OpenLineageConnection.ConsumerOffsets constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum OpenLineageType {

        OPEN_LINEAGE("OpenLineage");
        private final String value;
        private final static Map<String, OpenLineageConnection.OpenLineageType> CONSTANTS = new HashMap<String, OpenLineageConnection.OpenLineageType>();

        static {
            for (OpenLineageConnection.OpenLineageType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        OpenLineageType(String value) {
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
        public static OpenLineageConnection.OpenLineageType fromValue(String value) {
            OpenLineageConnection.OpenLineageType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Kafka security protocol
     * <p>
     * Kafka security protocol config
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SecurityProtocol {

        PLAINTEXT("PLAINTEXT"),
        SSL("SSL"),
        SASL_SSL("SASL_SSL");
        private final String value;
        private final static Map<String, OpenLineageConnection.SecurityProtocol> CONSTANTS = new HashMap<String, OpenLineageConnection.SecurityProtocol>();

        static {
            for (OpenLineageConnection.SecurityProtocol c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SecurityProtocol(String value) {
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
        public static OpenLineageConnection.SecurityProtocol fromValue(String value) {
            OpenLineageConnection.SecurityProtocol constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
