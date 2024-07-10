
package org.openmetadata.schema.entity.events;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EventSubscriptionOffset
 * <p>
 * Event Subscription Offset
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offset",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class EventSubscriptionOffset {

    /**
     * Name of this Event Filter.
     * (Required)
     * 
     */
    @JsonProperty("offset")
    @JsonPropertyDescription("Name of this Event Filter.")
    @NotNull
    private Long offset;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private java.lang.Long timestamp;

    /**
     * Name of this Event Filter.
     * (Required)
     * 
     */
    @JsonProperty("offset")
    public Long getOffset() {
        return offset;
    }

    /**
     * Name of this Event Filter.
     * (Required)
     * 
     */
    @JsonProperty("offset")
    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public EventSubscriptionOffset withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public java.lang.Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(java.lang.Long timestamp) {
        this.timestamp = timestamp;
    }

    public EventSubscriptionOffset withTimestamp(java.lang.Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventSubscriptionOffset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("offset");
        sb.append('=');
        sb.append(((this.offset == null)?"<null>":this.offset));
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
        result = ((result* 31)+((this.offset == null)? 0 :this.offset.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventSubscriptionOffset) == false) {
            return false;
        }
        EventSubscriptionOffset rhs = ((EventSubscriptionOffset) other);
        return (((this.offset == rhs.offset)||((this.offset!= null)&&this.offset.equals(rhs.offset)))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
