
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Count of threads related to an entity
 * <p>
 * This schema defines the type for reporting the count of threads related to an entity.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "conversationCount",
    "openTaskCount",
    "closedTaskCount",
    "totalTaskCount",
    "mentionCount",
    "entityLink"
})
@Generated("jsonschema2pojo")
public class ThreadCount {

    /**
     * Total count of all the threads of type Conversation.
     * 
     */
    @JsonProperty("conversationCount")
    @JsonPropertyDescription("Total count of all the threads of type Conversation.")
    @DecimalMin("0")
    private Integer conversationCount;
    /**
     * Total count of all the open tasks.
     * 
     */
    @JsonProperty("openTaskCount")
    @JsonPropertyDescription("Total count of all the open tasks.")
    @DecimalMin("0")
    private Integer openTaskCount;
    /**
     * Total count of all the tasks.
     * 
     */
    @JsonProperty("closedTaskCount")
    @JsonPropertyDescription("Total count of all the tasks.")
    @DecimalMin("0")
    private Integer closedTaskCount;
    /**
     * Total count of all the tasks.
     * 
     */
    @JsonProperty("totalTaskCount")
    @JsonPropertyDescription("Total count of all the tasks.")
    @DecimalMin("0")
    private Integer totalTaskCount;
    /**
     * Total count of all the mentions of a user.
     * 
     */
    @JsonProperty("mentionCount")
    @JsonPropertyDescription("Total count of all the mentions of a user.")
    @DecimalMin("0")
    private Integer mentionCount;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "(?U)^<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    private String entityLink;

    /**
     * Total count of all the threads of type Conversation.
     * 
     */
    @JsonProperty("conversationCount")
    public Integer getConversationCount() {
        return conversationCount;
    }

    /**
     * Total count of all the threads of type Conversation.
     * 
     */
    @JsonProperty("conversationCount")
    public void setConversationCount(Integer conversationCount) {
        this.conversationCount = conversationCount;
    }

    public ThreadCount withConversationCount(Integer conversationCount) {
        this.conversationCount = conversationCount;
        return this;
    }

    /**
     * Total count of all the open tasks.
     * 
     */
    @JsonProperty("openTaskCount")
    public Integer getOpenTaskCount() {
        return openTaskCount;
    }

    /**
     * Total count of all the open tasks.
     * 
     */
    @JsonProperty("openTaskCount")
    public void setOpenTaskCount(Integer openTaskCount) {
        this.openTaskCount = openTaskCount;
    }

    public ThreadCount withOpenTaskCount(Integer openTaskCount) {
        this.openTaskCount = openTaskCount;
        return this;
    }

    /**
     * Total count of all the tasks.
     * 
     */
    @JsonProperty("closedTaskCount")
    public Integer getClosedTaskCount() {
        return closedTaskCount;
    }

    /**
     * Total count of all the tasks.
     * 
     */
    @JsonProperty("closedTaskCount")
    public void setClosedTaskCount(Integer closedTaskCount) {
        this.closedTaskCount = closedTaskCount;
    }

    public ThreadCount withClosedTaskCount(Integer closedTaskCount) {
        this.closedTaskCount = closedTaskCount;
        return this;
    }

    /**
     * Total count of all the tasks.
     * 
     */
    @JsonProperty("totalTaskCount")
    public Integer getTotalTaskCount() {
        return totalTaskCount;
    }

    /**
     * Total count of all the tasks.
     * 
     */
    @JsonProperty("totalTaskCount")
    public void setTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
    }

    public ThreadCount withTotalTaskCount(Integer totalTaskCount) {
        this.totalTaskCount = totalTaskCount;
        return this;
    }

    /**
     * Total count of all the mentions of a user.
     * 
     */
    @JsonProperty("mentionCount")
    public Integer getMentionCount() {
        return mentionCount;
    }

    /**
     * Total count of all the mentions of a user.
     * 
     */
    @JsonProperty("mentionCount")
    public void setMentionCount(Integer mentionCount) {
        this.mentionCount = mentionCount;
    }

    public ThreadCount withMentionCount(Integer mentionCount) {
        this.mentionCount = mentionCount;
        return this;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    public String getEntityLink() {
        return entityLink;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    public void setEntityLink(String entityLink) {
        this.entityLink = entityLink;
    }

    public ThreadCount withEntityLink(String entityLink) {
        this.entityLink = entityLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThreadCount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("conversationCount");
        sb.append('=');
        sb.append(((this.conversationCount == null)?"<null>":this.conversationCount));
        sb.append(',');
        sb.append("openTaskCount");
        sb.append('=');
        sb.append(((this.openTaskCount == null)?"<null>":this.openTaskCount));
        sb.append(',');
        sb.append("closedTaskCount");
        sb.append('=');
        sb.append(((this.closedTaskCount == null)?"<null>":this.closedTaskCount));
        sb.append(',');
        sb.append("totalTaskCount");
        sb.append('=');
        sb.append(((this.totalTaskCount == null)?"<null>":this.totalTaskCount));
        sb.append(',');
        sb.append("mentionCount");
        sb.append('=');
        sb.append(((this.mentionCount == null)?"<null>":this.mentionCount));
        sb.append(',');
        sb.append("entityLink");
        sb.append('=');
        sb.append(((this.entityLink == null)?"<null>":this.entityLink));
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
        result = ((result* 31)+((this.totalTaskCount == null)? 0 :this.totalTaskCount.hashCode()));
        result = ((result* 31)+((this.mentionCount == null)? 0 :this.mentionCount.hashCode()));
        result = ((result* 31)+((this.entityLink == null)? 0 :this.entityLink.hashCode()));
        result = ((result* 31)+((this.conversationCount == null)? 0 :this.conversationCount.hashCode()));
        result = ((result* 31)+((this.closedTaskCount == null)? 0 :this.closedTaskCount.hashCode()));
        result = ((result* 31)+((this.openTaskCount == null)? 0 :this.openTaskCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThreadCount) == false) {
            return false;
        }
        ThreadCount rhs = ((ThreadCount) other);
        return (((((((this.totalTaskCount == rhs.totalTaskCount)||((this.totalTaskCount!= null)&&this.totalTaskCount.equals(rhs.totalTaskCount)))&&((this.mentionCount == rhs.mentionCount)||((this.mentionCount!= null)&&this.mentionCount.equals(rhs.mentionCount))))&&((this.entityLink == rhs.entityLink)||((this.entityLink!= null)&&this.entityLink.equals(rhs.entityLink))))&&((this.conversationCount == rhs.conversationCount)||((this.conversationCount!= null)&&this.conversationCount.equals(rhs.conversationCount))))&&((this.closedTaskCount == rhs.closedTaskCount)||((this.closedTaskCount!= null)&&this.closedTaskCount.equals(rhs.closedTaskCount))))&&((this.openTaskCount == rhs.openTaskCount)||((this.openTaskCount!= null)&&this.openTaskCount.equals(rhs.openTaskCount))));
    }

}
