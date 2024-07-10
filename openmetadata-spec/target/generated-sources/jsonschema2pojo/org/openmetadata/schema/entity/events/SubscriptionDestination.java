
package org.openmetadata.schema.entity.events;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Subscription which has a type and the config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "category",
    "type",
    "statusDetails",
    "timeout",
    "readTimeout",
    "enabled",
    "config"
})
@Generated("jsonschema2pojo")
public class SubscriptionDestination {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("category")
    @JsonPropertyDescription("Subscription Endpoint Type.")
    @NotNull
    private SubscriptionDestination.SubscriptionCategory category;
    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Subscription Endpoint Type.")
    @NotNull
    private SubscriptionDestination.SubscriptionType type;
    /**
     * Subscription Current Status
     * 
     */
    @JsonProperty("statusDetails")
    @JsonPropertyDescription("Subscription Current Status")
    @Valid
    private SubscriptionStatus statusDetails;
    /**
     * Connection timeout in seconds. (Default 10s).
     * 
     */
    @JsonProperty("timeout")
    @JsonPropertyDescription("Connection timeout in seconds. (Default 10s).")
    private Integer timeout = 10;
    /**
     * Read timeout in seconds. (Default 12s).
     * 
     */
    @JsonProperty("readTimeout")
    @JsonPropertyDescription("Read timeout in seconds. (Default 12s).")
    private Integer readTimeout = 12;
    /**
     * Is the subscription enabled.
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Is the subscription enabled.")
    private Boolean enabled = true;
    @JsonProperty("config")
    private Object config;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public SubscriptionDestination withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public SubscriptionDestination.SubscriptionCategory getCategory() {
        return category;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("category")
    public void setCategory(SubscriptionDestination.SubscriptionCategory category) {
        this.category = category;
    }

    public SubscriptionDestination withCategory(SubscriptionDestination.SubscriptionCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public SubscriptionDestination.SubscriptionType getType() {
        return type;
    }

    /**
     * Subscription Endpoint Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(SubscriptionDestination.SubscriptionType type) {
        this.type = type;
    }

    public SubscriptionDestination withType(SubscriptionDestination.SubscriptionType type) {
        this.type = type;
        return this;
    }

    /**
     * Subscription Current Status
     * 
     */
    @JsonProperty("statusDetails")
    public SubscriptionStatus getStatusDetails() {
        return statusDetails;
    }

    /**
     * Subscription Current Status
     * 
     */
    @JsonProperty("statusDetails")
    public void setStatusDetails(SubscriptionStatus statusDetails) {
        this.statusDetails = statusDetails;
    }

    public SubscriptionDestination withStatusDetails(SubscriptionStatus statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Connection timeout in seconds. (Default 10s).
     * 
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Connection timeout in seconds. (Default 10s).
     * 
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public SubscriptionDestination withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Read timeout in seconds. (Default 12s).
     * 
     */
    @JsonProperty("readTimeout")
    public Integer getReadTimeout() {
        return readTimeout;
    }

    /**
     * Read timeout in seconds. (Default 12s).
     * 
     */
    @JsonProperty("readTimeout")
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public SubscriptionDestination withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * Is the subscription enabled.
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Is the subscription enabled.
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SubscriptionDestination withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("config")
    public Object getConfig() {
        return config;
    }

    @JsonProperty("config")
    public void setConfig(Object config) {
        this.config = config;
    }

    public SubscriptionDestination withConfig(Object config) {
        this.config = config;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubscriptionDestination.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("statusDetails");
        sb.append('=');
        sb.append(((this.statusDetails == null)?"<null>":this.statusDetails));
        sb.append(',');
        sb.append("timeout");
        sb.append('=');
        sb.append(((this.timeout == null)?"<null>":this.timeout));
        sb.append(',');
        sb.append("readTimeout");
        sb.append('=');
        sb.append(((this.readTimeout == null)?"<null>":this.readTimeout));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null)?"<null>":this.config));
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
        result = ((result* 31)+((this.readTimeout == null)? 0 :this.readTimeout.hashCode()));
        result = ((result* 31)+((this.statusDetails == null)? 0 :this.statusDetails.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.config == null)? 0 :this.config.hashCode()));
        result = ((result* 31)+((this.timeout == null)? 0 :this.timeout.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionDestination) == false) {
            return false;
        }
        SubscriptionDestination rhs = ((SubscriptionDestination) other);
        return (((((((((this.readTimeout == rhs.readTimeout)||((this.readTimeout!= null)&&this.readTimeout.equals(rhs.readTimeout)))&&((this.statusDetails == rhs.statusDetails)||((this.statusDetails!= null)&&this.statusDetails.equals(rhs.statusDetails))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.config == rhs.config)||((this.config!= null)&&this.config.equals(rhs.config))))&&((this.timeout == rhs.timeout)||((this.timeout!= null)&&this.timeout.equals(rhs.timeout))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))));
    }


    /**
     * Subscription Endpoint Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SubscriptionCategory {

        USERS("Users"),
        TEAMS("Teams"),
        ADMINS("Admins"),
        ASSIGNEES("Assignees"),
        OWNERS("Owners"),
        MENTIONS("Mentions"),
        FOLLOWERS("Followers"),
        EXTERNAL("External");
        private final String value;
        private final static Map<String, SubscriptionDestination.SubscriptionCategory> CONSTANTS = new HashMap<String, SubscriptionDestination.SubscriptionCategory>();

        static {
            for (SubscriptionDestination.SubscriptionCategory c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SubscriptionCategory(String value) {
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
        public static SubscriptionDestination.SubscriptionCategory fromValue(String value) {
            SubscriptionDestination.SubscriptionCategory constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Subscription Endpoint Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SubscriptionType {

        WEBHOOK("Webhook"),
        SLACK("Slack"),
        MS_TEAMS("MsTeams"),
        G_CHAT("GChat"),
        EMAIL("Email"),
        ACTIVITY_FEED("ActivityFeed");
        private final String value;
        private final static Map<String, SubscriptionDestination.SubscriptionType> CONSTANTS = new HashMap<String, SubscriptionDestination.SubscriptionType>();

        static {
            for (SubscriptionDestination.SubscriptionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SubscriptionType(String value) {
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
        public static SubscriptionDestination.SubscriptionType fromValue(String value) {
            SubscriptionDestination.SubscriptionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
