
package org.openmetadata.schema.entity.app;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the type of application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "scheduleTimeline",
    "cronExpression"
})
@Generated("jsonschema2pojo")
public class AppSchedule {

    /**
     * This schema defines the Application ScheduleTimeline Options
     * (Required)
     * 
     */
    @JsonProperty("scheduleTimeline")
    @JsonPropertyDescription("This schema defines the Application ScheduleTimeline Options")
    @NotNull
    private ScheduleTimeline scheduleTimeline = ScheduleTimeline.fromValue("Weekly");
    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    @JsonPropertyDescription("Cron Expression in case of Custom scheduled Trigger")
    private String cronExpression;

    /**
     * This schema defines the Application ScheduleTimeline Options
     * (Required)
     * 
     */
    @JsonProperty("scheduleTimeline")
    public ScheduleTimeline getScheduleTimeline() {
        return scheduleTimeline;
    }

    /**
     * This schema defines the Application ScheduleTimeline Options
     * (Required)
     * 
     */
    @JsonProperty("scheduleTimeline")
    public void setScheduleTimeline(ScheduleTimeline scheduleTimeline) {
        this.scheduleTimeline = scheduleTimeline;
    }

    public AppSchedule withScheduleTimeline(ScheduleTimeline scheduleTimeline) {
        this.scheduleTimeline = scheduleTimeline;
        return this;
    }

    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    public String getCronExpression() {
        return cronExpression;
    }

    /**
     * Cron Expression in case of Custom scheduled Trigger
     * 
     */
    @JsonProperty("cronExpression")
    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public AppSchedule withCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppSchedule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("scheduleTimeline");
        sb.append('=');
        sb.append(((this.scheduleTimeline == null)?"<null>":this.scheduleTimeline));
        sb.append(',');
        sb.append("cronExpression");
        sb.append('=');
        sb.append(((this.cronExpression == null)?"<null>":this.cronExpression));
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
        result = ((result* 31)+((this.cronExpression == null)? 0 :this.cronExpression.hashCode()));
        result = ((result* 31)+((this.scheduleTimeline == null)? 0 :this.scheduleTimeline.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppSchedule) == false) {
            return false;
        }
        AppSchedule rhs = ((AppSchedule) other);
        return (((this.cronExpression == rhs.cronExpression)||((this.cronExpression!= null)&&this.cronExpression.equals(rhs.cronExpression)))&&((this.scheduleTimeline == rhs.scheduleTimeline)||((this.scheduleTimeline!= null)&&this.scheduleTimeline.equals(rhs.scheduleTimeline))));
    }

}
