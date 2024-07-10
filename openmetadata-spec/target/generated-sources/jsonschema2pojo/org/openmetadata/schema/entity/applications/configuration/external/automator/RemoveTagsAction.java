
package org.openmetadata.schema.entity.applications.configuration.external.automator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.type.TagLabel;


/**
 * RemoveTagsAction
 * <p>
 * Remove Tags Action Type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "tags",
    "applyToChildren"
})
@Generated("jsonschema2pojo")
public class RemoveTagsAction {

    /**
     * Remove Tags Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Remove Tags Action Type.")
    @NotNull
    private RemoveTagsAction.RemoveTagsActionType type = RemoveTagsAction.RemoveTagsActionType.fromValue("RemoveTagsAction");
    /**
     * Tags to remove
     * (Required)
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags to remove")
    @Valid
    @NotNull
    private List<TagLabel> tags = new ArrayList<TagLabel>();
    /**
     * Apply to Children
     * <p>
     * Remove tags from all the children of the selected assets. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    @JsonPropertyDescription("Remove tags from all the children of the selected assets. E.g., columns, tasks, topic fields,...")
    @Valid
    private List<String> applyToChildren = null;

    /**
     * Remove Tags Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RemoveTagsAction.RemoveTagsActionType getType() {
        return type;
    }

    /**
     * Remove Tags Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RemoveTagsAction.RemoveTagsActionType type) {
        this.type = type;
    }

    public RemoveTagsAction withType(RemoveTagsAction.RemoveTagsActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Tags to remove
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags to remove
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public RemoveTagsAction withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Apply to Children
     * <p>
     * Remove tags from all the children of the selected assets. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public List<String> getApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Apply to Children
     * <p>
     * Remove tags from all the children of the selected assets. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public void setApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
    }

    public RemoveTagsAction withApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoveTagsAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("applyToChildren");
        sb.append('=');
        sb.append(((this.applyToChildren == null)?"<null>":this.applyToChildren));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.applyToChildren == null)? 0 :this.applyToChildren.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemoveTagsAction) == false) {
            return false;
        }
        RemoveTagsAction rhs = ((RemoveTagsAction) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.applyToChildren == rhs.applyToChildren)||((this.applyToChildren!= null)&&this.applyToChildren.equals(rhs.applyToChildren))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }


    /**
     * Remove Tags Action Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RemoveTagsActionType {

        REMOVE_TAGS_ACTION("RemoveTagsAction");
        private final String value;
        private final static Map<String, RemoveTagsAction.RemoveTagsActionType> CONSTANTS = new HashMap<String, RemoveTagsAction.RemoveTagsActionType>();

        static {
            for (RemoveTagsAction.RemoveTagsActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RemoveTagsActionType(String value) {
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
        public static RemoveTagsAction.RemoveTagsActionType fromValue(String value) {
            RemoveTagsAction.RemoveTagsActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
