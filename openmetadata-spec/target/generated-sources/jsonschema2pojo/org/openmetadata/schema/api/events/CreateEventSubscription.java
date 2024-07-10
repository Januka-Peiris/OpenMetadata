
package org.openmetadata.schema.api.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.entity.events.SubscriptionDestination;
import org.openmetadata.schema.entity.events.TriggerConfig;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;


/**
 * CreateEventSubscription
 * <p>
 * This defines schema for sending alerts for OpenMetadata
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "enabled",
    "batchSize",
    "alertType",
    "trigger",
    "resources",
    "destinations",
    "provider",
    "retries",
    "pollInterval",
    "input"
})
@Generated("jsonschema2pojo")
public class CreateEventSubscription implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 256)
    @NotNull
    private String name;
    /**
     * Display name for this Alert.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display name for this Alert.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * Is the alert enabled.
     * 
     */
    @JsonProperty("enabled")
    @JsonPropertyDescription("Is the alert enabled.")
    private Boolean enabled = true;
    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events sent in a batch (Default 10).")
    private Integer batchSize = 10;
    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    @JsonPropertyDescription("Type of Alerts supported.")
    @NotNull
    private CreateEventSubscription.AlertType alertType = CreateEventSubscription.AlertType.fromValue("Notification");
    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @JsonProperty("trigger")
    @JsonPropertyDescription("Trigger Configuration for Alerts.")
    @Valid
    private TriggerConfig trigger;
    /**
     * Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.")
    @Valid
    private List<String> resources = new ArrayList<String>();
    /**
     * Subscription Config.
     * 
     */
    @JsonProperty("destinations")
    @JsonPropertyDescription("Subscription Config.")
    @Valid
    private List<SubscriptionDestination> destinations = new ArrayList<SubscriptionDestination>();
    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * Number of times to retry callback on failure. (Default 3).
     * 
     */
    @JsonProperty("retries")
    @JsonPropertyDescription("Number of times to retry callback on failure. (Default 3).")
    private Integer retries = 3;
    /**
     * Poll Interval in seconds.
     * 
     */
    @JsonProperty("pollInterval")
    @JsonPropertyDescription("Poll Interval in seconds.")
    private Integer pollInterval = 10;
    /**
     * Observability of the event subscription.
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("Observability of the event subscription.")
    @Valid
    private AlertFilteringInput input;

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateEventSubscription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display name for this Alert.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display name for this Alert.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateEventSubscription withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateEventSubscription withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public CreateEventSubscription withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Is the alert enabled.
     * 
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Is the alert enabled.
     * 
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateEventSubscription withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Maximum number of events sent in a batch (Default 10).
     * 
     */
    @JsonProperty("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public CreateEventSubscription withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    public CreateEventSubscription.AlertType getAlertType() {
        return alertType;
    }

    /**
     * Type of Alerts supported.
     * (Required)
     * 
     */
    @JsonProperty("alertType")
    public void setAlertType(CreateEventSubscription.AlertType alertType) {
        this.alertType = alertType;
    }

    public CreateEventSubscription withAlertType(CreateEventSubscription.AlertType alertType) {
        this.alertType = alertType;
        return this;
    }

    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @JsonProperty("trigger")
    public TriggerConfig getTrigger() {
        return trigger;
    }

    /**
     * Trigger Configuration for Alerts.
     * 
     */
    @JsonProperty("trigger")
    public void setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
    }

    public CreateEventSubscription withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.
     * 
     */
    @JsonProperty("resources")
    public List<String> getResources() {
        return resources;
    }

    /**
     * Defines a list of resources that triggers the Event Subscription, Eg All, User, Teams etc.
     * 
     */
    @JsonProperty("resources")
    public void setResources(List<String> resources) {
        this.resources = resources;
    }

    public CreateEventSubscription withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Subscription Config.
     * 
     */
    @JsonProperty("destinations")
    public List<SubscriptionDestination> getDestinations() {
        return destinations;
    }

    /**
     * Subscription Config.
     * 
     */
    @JsonProperty("destinations")
    public void setDestinations(List<SubscriptionDestination> destinations) {
        this.destinations = destinations;
    }

    public CreateEventSubscription withDestinations(List<SubscriptionDestination> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public CreateEventSubscription withProvider(ProviderType provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Number of times to retry callback on failure. (Default 3).
     * 
     */
    @JsonProperty("retries")
    public Integer getRetries() {
        return retries;
    }

    /**
     * Number of times to retry callback on failure. (Default 3).
     * 
     */
    @JsonProperty("retries")
    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public CreateEventSubscription withRetries(Integer retries) {
        this.retries = retries;
        return this;
    }

    /**
     * Poll Interval in seconds.
     * 
     */
    @JsonProperty("pollInterval")
    public Integer getPollInterval() {
        return pollInterval;
    }

    /**
     * Poll Interval in seconds.
     * 
     */
    @JsonProperty("pollInterval")
    public void setPollInterval(Integer pollInterval) {
        this.pollInterval = pollInterval;
    }

    public CreateEventSubscription withPollInterval(Integer pollInterval) {
        this.pollInterval = pollInterval;
        return this;
    }

    /**
     * Observability of the event subscription.
     * 
     */
    @JsonProperty("input")
    public AlertFilteringInput getInput() {
        return input;
    }

    /**
     * Observability of the event subscription.
     * 
     */
    @JsonProperty("input")
    public void setInput(AlertFilteringInput input) {
        this.input = input;
    }

    public CreateEventSubscription withInput(AlertFilteringInput input) {
        this.input = input;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateEventSubscription.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("enabled");
        sb.append('=');
        sb.append(((this.enabled == null)?"<null>":this.enabled));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("alertType");
        sb.append('=');
        sb.append(((this.alertType == null)?"<null>":this.alertType));
        sb.append(',');
        sb.append("trigger");
        sb.append('=');
        sb.append(((this.trigger == null)?"<null>":this.trigger));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("destinations");
        sb.append('=');
        sb.append(((this.destinations == null)?"<null>":this.destinations));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("retries");
        sb.append('=');
        sb.append(((this.retries == null)?"<null>":this.retries));
        sb.append(',');
        sb.append("pollInterval");
        sb.append('=');
        sb.append(((this.pollInterval == null)?"<null>":this.pollInterval));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.alertType == null)? 0 :this.alertType.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.destinations == null)? 0 :this.destinations.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.trigger == null)? 0 :this.trigger.hashCode()));
        result = ((result* 31)+((this.enabled == null)? 0 :this.enabled.hashCode()));
        result = ((result* 31)+((this.retries == null)? 0 :this.retries.hashCode()));
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        result = ((result* 31)+((this.pollInterval == null)? 0 :this.pollInterval.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateEventSubscription) == false) {
            return false;
        }
        CreateEventSubscription rhs = ((CreateEventSubscription) other);
        return (((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.alertType == rhs.alertType)||((this.alertType!= null)&&this.alertType.equals(rhs.alertType))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.destinations == rhs.destinations)||((this.destinations!= null)&&this.destinations.equals(rhs.destinations))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.trigger == rhs.trigger)||((this.trigger!= null)&&this.trigger.equals(rhs.trigger))))&&((this.enabled == rhs.enabled)||((this.enabled!= null)&&this.enabled.equals(rhs.enabled))))&&((this.retries == rhs.retries)||((this.retries!= null)&&this.retries.equals(rhs.retries))))&&((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input))))&&((this.pollInterval == rhs.pollInterval)||((this.pollInterval!= null)&&this.pollInterval.equals(rhs.pollInterval))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))));
    }


    /**
     * Type of Alerts supported.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AlertType {

        NOTIFICATION("Notification"),
        OBSERVABILITY("Observability"),
        ACTIVITY_FEED("ActivityFeed");
        private final String value;
        private final static Map<String, CreateEventSubscription.AlertType> CONSTANTS = new HashMap<String, CreateEventSubscription.AlertType>();

        static {
            for (CreateEventSubscription.AlertType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AlertType(String value) {
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
        public static CreateEventSubscription.AlertType fromValue(String value) {
            CreateEventSubscription.AlertType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
