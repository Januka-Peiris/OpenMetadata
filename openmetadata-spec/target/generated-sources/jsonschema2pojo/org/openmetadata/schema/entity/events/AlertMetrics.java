
package org.openmetadata.schema.entity.events;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * AlertMetrics
 * <p>
 * Alert Metrics Schema
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "totalEvents",
    "successEvents",
    "failedEvents",
    "timestamp"
})
@Generated("jsonschema2pojo")
public class AlertMetrics {

    /**
     * Total number of events.
     * 
     */
    @JsonProperty("totalEvents")
    @JsonPropertyDescription("Total number of events.")
    private Integer totalEvents;
    /**
     * Number of events that were successfully processed.
     * 
     */
    @JsonProperty("successEvents")
    @JsonPropertyDescription("Number of events that were successfully processed.")
    private Integer successEvents;
    /**
     * Number of events that failed to be processed.
     * 
     */
    @JsonProperty("failedEvents")
    @JsonPropertyDescription("Number of events that failed to be processed.")
    private Integer failedEvents;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;

    /**
     * Total number of events.
     * 
     */
    @JsonProperty("totalEvents")
    public Integer getTotalEvents() {
        return totalEvents;
    }

    /**
     * Total number of events.
     * 
     */
    @JsonProperty("totalEvents")
    public void setTotalEvents(Integer totalEvents) {
        this.totalEvents = totalEvents;
    }

    public AlertMetrics withTotalEvents(Integer totalEvents) {
        this.totalEvents = totalEvents;
        return this;
    }

    /**
     * Number of events that were successfully processed.
     * 
     */
    @JsonProperty("successEvents")
    public Integer getSuccessEvents() {
        return successEvents;
    }

    /**
     * Number of events that were successfully processed.
     * 
     */
    @JsonProperty("successEvents")
    public void setSuccessEvents(Integer successEvents) {
        this.successEvents = successEvents;
    }

    public AlertMetrics withSuccessEvents(Integer successEvents) {
        this.successEvents = successEvents;
        return this;
    }

    /**
     * Number of events that failed to be processed.
     * 
     */
    @JsonProperty("failedEvents")
    public Integer getFailedEvents() {
        return failedEvents;
    }

    /**
     * Number of events that failed to be processed.
     * 
     */
    @JsonProperty("failedEvents")
    public void setFailedEvents(Integer failedEvents) {
        this.failedEvents = failedEvents;
    }

    public AlertMetrics withFailedEvents(Integer failedEvents) {
        this.failedEvents = failedEvents;
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

    public AlertMetrics withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlertMetrics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("totalEvents");
        sb.append('=');
        sb.append(((this.totalEvents == null)?"<null>":this.totalEvents));
        sb.append(',');
        sb.append("successEvents");
        sb.append('=');
        sb.append(((this.successEvents == null)?"<null>":this.successEvents));
        sb.append(',');
        sb.append("failedEvents");
        sb.append('=');
        sb.append(((this.failedEvents == null)?"<null>":this.failedEvents));
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
        result = ((result* 31)+((this.successEvents == null)? 0 :this.successEvents.hashCode()));
        result = ((result* 31)+((this.totalEvents == null)? 0 :this.totalEvents.hashCode()));
        result = ((result* 31)+((this.failedEvents == null)? 0 :this.failedEvents.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlertMetrics) == false) {
            return false;
        }
        AlertMetrics rhs = ((AlertMetrics) other);
        return (((((this.successEvents == rhs.successEvents)||((this.successEvents!= null)&&this.successEvents.equals(rhs.successEvents)))&&((this.totalEvents == rhs.totalEvents)||((this.totalEvents!= null)&&this.totalEvents.equals(rhs.totalEvents))))&&((this.failedEvents == rhs.failedEvents)||((this.failedEvents!= null)&&this.failedEvents.equals(rhs.failedEvents))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
