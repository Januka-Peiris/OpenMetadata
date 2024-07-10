
package org.openmetadata.schema.entity.feed;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DescriptionFeedInfo
 * <p>
 * This schema defines the schema for Description Updates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "previousDescription",
    "newDescription",
    "diffMessage"
})
@Generated("jsonschema2pojo")
public class DescriptionFeedInfo {

    /**
     * The previous description of the entity.
     * 
     */
    @JsonProperty("previousDescription")
    @JsonPropertyDescription("The previous description of the entity.")
    private String previousDescription;
    /**
     * The new description of the entity.
     * 
     */
    @JsonProperty("newDescription")
    @JsonPropertyDescription("The new description of the entity.")
    private String newDescription;
    /**
     * The difference between the previous and new descriptions.
     * 
     */
    @JsonProperty("diffMessage")
    @JsonPropertyDescription("The difference between the previous and new descriptions.")
    private String diffMessage;

    /**
     * The previous description of the entity.
     * 
     */
    @JsonProperty("previousDescription")
    public String getPreviousDescription() {
        return previousDescription;
    }

    /**
     * The previous description of the entity.
     * 
     */
    @JsonProperty("previousDescription")
    public void setPreviousDescription(String previousDescription) {
        this.previousDescription = previousDescription;
    }

    public DescriptionFeedInfo withPreviousDescription(String previousDescription) {
        this.previousDescription = previousDescription;
        return this;
    }

    /**
     * The new description of the entity.
     * 
     */
    @JsonProperty("newDescription")
    public String getNewDescription() {
        return newDescription;
    }

    /**
     * The new description of the entity.
     * 
     */
    @JsonProperty("newDescription")
    public void setNewDescription(String newDescription) {
        this.newDescription = newDescription;
    }

    public DescriptionFeedInfo withNewDescription(String newDescription) {
        this.newDescription = newDescription;
        return this;
    }

    /**
     * The difference between the previous and new descriptions.
     * 
     */
    @JsonProperty("diffMessage")
    public String getDiffMessage() {
        return diffMessage;
    }

    /**
     * The difference between the previous and new descriptions.
     * 
     */
    @JsonProperty("diffMessage")
    public void setDiffMessage(String diffMessage) {
        this.diffMessage = diffMessage;
    }

    public DescriptionFeedInfo withDiffMessage(String diffMessage) {
        this.diffMessage = diffMessage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DescriptionFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("previousDescription");
        sb.append('=');
        sb.append(((this.previousDescription == null)?"<null>":this.previousDescription));
        sb.append(',');
        sb.append("newDescription");
        sb.append('=');
        sb.append(((this.newDescription == null)?"<null>":this.newDescription));
        sb.append(',');
        sb.append("diffMessage");
        sb.append('=');
        sb.append(((this.diffMessage == null)?"<null>":this.diffMessage));
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
        result = ((result* 31)+((this.previousDescription == null)? 0 :this.previousDescription.hashCode()));
        result = ((result* 31)+((this.newDescription == null)? 0 :this.newDescription.hashCode()));
        result = ((result* 31)+((this.diffMessage == null)? 0 :this.diffMessage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DescriptionFeedInfo) == false) {
            return false;
        }
        DescriptionFeedInfo rhs = ((DescriptionFeedInfo) other);
        return ((((this.previousDescription == rhs.previousDescription)||((this.previousDescription!= null)&&this.previousDescription.equals(rhs.previousDescription)))&&((this.newDescription == rhs.newDescription)||((this.newDescription!= null)&&this.newDescription.equals(rhs.newDescription))))&&((this.diffMessage == rhs.diffMessage)||((this.diffMessage!= null)&&this.diffMessage.equals(rhs.diffMessage))));
    }

}
