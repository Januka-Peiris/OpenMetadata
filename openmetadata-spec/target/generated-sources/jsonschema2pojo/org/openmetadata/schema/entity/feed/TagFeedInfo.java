
package org.openmetadata.schema.entity.feed;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.TagLabel;


/**
 * TagFeedInfo
 * <p>
 * This schema defines the schema for Tag Updates for Feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "previousTags",
    "updatedTags"
})
@Generated("jsonschema2pojo")
public class TagFeedInfo {

    /**
     * List of previous tags.
     * 
     */
    @JsonProperty("previousTags")
    @JsonPropertyDescription("List of previous tags.")
    @Valid
    private List<TagLabel> previousTags = new ArrayList<TagLabel>();
    /**
     * List of updated tags.
     * 
     */
    @JsonProperty("updatedTags")
    @JsonPropertyDescription("List of updated tags.")
    @Valid
    private List<TagLabel> updatedTags = new ArrayList<TagLabel>();

    /**
     * List of previous tags.
     * 
     */
    @JsonProperty("previousTags")
    public List<TagLabel> getPreviousTags() {
        return previousTags;
    }

    /**
     * List of previous tags.
     * 
     */
    @JsonProperty("previousTags")
    public void setPreviousTags(List<TagLabel> previousTags) {
        this.previousTags = previousTags;
    }

    public TagFeedInfo withPreviousTags(List<TagLabel> previousTags) {
        this.previousTags = previousTags;
        return this;
    }

    /**
     * List of updated tags.
     * 
     */
    @JsonProperty("updatedTags")
    public List<TagLabel> getUpdatedTags() {
        return updatedTags;
    }

    /**
     * List of updated tags.
     * 
     */
    @JsonProperty("updatedTags")
    public void setUpdatedTags(List<TagLabel> updatedTags) {
        this.updatedTags = updatedTags;
    }

    public TagFeedInfo withUpdatedTags(List<TagLabel> updatedTags) {
        this.updatedTags = updatedTags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TagFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("previousTags");
        sb.append('=');
        sb.append(((this.previousTags == null)?"<null>":this.previousTags));
        sb.append(',');
        sb.append("updatedTags");
        sb.append('=');
        sb.append(((this.updatedTags == null)?"<null>":this.updatedTags));
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
        result = ((result* 31)+((this.updatedTags == null)? 0 :this.updatedTags.hashCode()));
        result = ((result* 31)+((this.previousTags == null)? 0 :this.previousTags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TagFeedInfo) == false) {
            return false;
        }
        TagFeedInfo rhs = ((TagFeedInfo) other);
        return (((this.updatedTags == rhs.updatedTags)||((this.updatedTags!= null)&&this.updatedTags.equals(rhs.updatedTags)))&&((this.previousTags == rhs.previousTags)||((this.previousTags!= null)&&this.previousTags.equals(rhs.previousTags))));
    }

}
