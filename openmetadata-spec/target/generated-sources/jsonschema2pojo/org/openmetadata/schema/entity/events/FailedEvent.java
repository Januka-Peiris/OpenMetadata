
package org.openmetadata.schema.entity.events;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.ChangeEvent;


/**
 * FailedEvents
 * <p>
 * Failed Events Schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "failingSubscriptionId",
    "changeEvent",
    "reason",
    "retriesLeft",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class FailedEvent {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("failingSubscriptionId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID failingSubscriptionId;
    /**
     * ChangeEvent
     * <p>
     * This schema defines the change event type to capture the changes to entities. Entities change due to user activity, such as updating description of a dataset, changing ownership, or adding new tags. Entity also changes due to activities at the metadata sources, such as a new dataset was created, a datasets was deleted, or schema of a dataset is modified. When state of entity changes, an event is produced. These events can be used to build apps and bots that respond to the change from activities.
     * 
     */
    @JsonProperty("changeEvent")
    @JsonPropertyDescription("This schema defines the change event type to capture the changes to entities. Entities change due to user activity, such as updating description of a dataset, changing ownership, or adding new tags. Entity also changes due to activities at the metadata sources, such as a new dataset was created, a datasets was deleted, or schema of a dataset is modified. When state of entity changes, an event is produced. These events can be used to build apps and bots that respond to the change from activities.")
    @Valid
    private ChangeEvent changeEvent;
    /**
     * Reason for failure
     * 
     */
    @JsonProperty("reason")
    @JsonPropertyDescription("Reason for failure")
    private String reason;
    /**
     * Retries Left for the event
     * 
     */
    @JsonProperty("retriesLeft")
    @JsonPropertyDescription("Retries Left for the event")
    private Integer retriesLeft;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("failingSubscriptionId")
    public UUID getFailingSubscriptionId() {
        return failingSubscriptionId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("failingSubscriptionId")
    public void setFailingSubscriptionId(UUID failingSubscriptionId) {
        this.failingSubscriptionId = failingSubscriptionId;
    }

    public FailedEvent withFailingSubscriptionId(UUID failingSubscriptionId) {
        this.failingSubscriptionId = failingSubscriptionId;
        return this;
    }

    /**
     * ChangeEvent
     * <p>
     * This schema defines the change event type to capture the changes to entities. Entities change due to user activity, such as updating description of a dataset, changing ownership, or adding new tags. Entity also changes due to activities at the metadata sources, such as a new dataset was created, a datasets was deleted, or schema of a dataset is modified. When state of entity changes, an event is produced. These events can be used to build apps and bots that respond to the change from activities.
     * 
     */
    @JsonProperty("changeEvent")
    public ChangeEvent getChangeEvent() {
        return changeEvent;
    }

    /**
     * ChangeEvent
     * <p>
     * This schema defines the change event type to capture the changes to entities. Entities change due to user activity, such as updating description of a dataset, changing ownership, or adding new tags. Entity also changes due to activities at the metadata sources, such as a new dataset was created, a datasets was deleted, or schema of a dataset is modified. When state of entity changes, an event is produced. These events can be used to build apps and bots that respond to the change from activities.
     * 
     */
    @JsonProperty("changeEvent")
    public void setChangeEvent(ChangeEvent changeEvent) {
        this.changeEvent = changeEvent;
    }

    public FailedEvent withChangeEvent(ChangeEvent changeEvent) {
        this.changeEvent = changeEvent;
        return this;
    }

    /**
     * Reason for failure
     * 
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Reason for failure
     * 
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public FailedEvent withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Retries Left for the event
     * 
     */
    @JsonProperty("retriesLeft")
    public Integer getRetriesLeft() {
        return retriesLeft;
    }

    /**
     * Retries Left for the event
     * 
     */
    @JsonProperty("retriesLeft")
    public void setRetriesLeft(Integer retriesLeft) {
        this.retriesLeft = retriesLeft;
    }

    public FailedEvent withRetriesLeft(Integer retriesLeft) {
        this.retriesLeft = retriesLeft;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public FailedEvent withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FailedEvent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("failingSubscriptionId");
        sb.append('=');
        sb.append(((this.failingSubscriptionId == null)?"<null>":this.failingSubscriptionId));
        sb.append(',');
        sb.append("changeEvent");
        sb.append('=');
        sb.append(((this.changeEvent == null)?"<null>":this.changeEvent));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("retriesLeft");
        sb.append('=');
        sb.append(((this.retriesLeft == null)?"<null>":this.retriesLeft));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.failingSubscriptionId == null)? 0 :this.failingSubscriptionId.hashCode()));
        result = ((result* 31)+((this.retriesLeft == null)? 0 :this.retriesLeft.hashCode()));
        result = ((result* 31)+((this.changeEvent == null)? 0 :this.changeEvent.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FailedEvent) == false) {
            return false;
        }
        FailedEvent rhs = ((FailedEvent) other);
        return ((((((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason)))&&((this.failingSubscriptionId == rhs.failingSubscriptionId)||((this.failingSubscriptionId!= null)&&this.failingSubscriptionId.equals(rhs.failingSubscriptionId))))&&((this.retriesLeft == rhs.retriesLeft)||((this.retriesLeft!= null)&&this.retriesLeft.equals(rhs.retriesLeft))))&&((this.changeEvent == rhs.changeEvent)||((this.changeEvent!= null)&&this.changeEvent.equals(rhs.changeEvent))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
