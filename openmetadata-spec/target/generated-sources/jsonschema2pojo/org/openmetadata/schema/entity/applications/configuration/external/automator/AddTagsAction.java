
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
 * AddTagsAction
 * <p>
 * Apply Tags to the selected assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "tags",
    "applyToChildren",
    "overwriteMetadata"
})
@Generated("jsonschema2pojo")
public class AddTagsAction {

    /**
     * Add Tags action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Add Tags action type.")
    @NotNull
    private AddTagsAction.AddTagsActionType type = AddTagsAction.AddTagsActionType.fromValue("AddTagsAction");
    /**
     * Tags to apply
     * (Required)
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags to apply")
    @Valid
    @NotNull
    private List<TagLabel> tags = new ArrayList<TagLabel>();
    /**
     * Apply to Children
     * <p>
     * Apply tags to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    @JsonPropertyDescription("Apply tags to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...")
    @Valid
    private List<String> applyToChildren = null;
    /**
     * Overwrite Metadata
     * <p>
     * Update tags even if they are already defined in the asset. By default, incoming tags are merged with the existing ones.
     * 
     */
    @JsonProperty("overwriteMetadata")
    @JsonPropertyDescription("Update tags even if they are already defined in the asset. By default, incoming tags are merged with the existing ones.")
    private Boolean overwriteMetadata = false;

    /**
     * Add Tags action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AddTagsAction.AddTagsActionType getType() {
        return type;
    }

    /**
     * Add Tags action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AddTagsAction.AddTagsActionType type) {
        this.type = type;
    }

    public AddTagsAction withType(AddTagsAction.AddTagsActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Tags to apply
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags to apply
     * (Required)
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public AddTagsAction withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Apply to Children
     * <p>
     * Apply tags to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public List<String> getApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Apply to Children
     * <p>
     * Apply tags to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public void setApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
    }

    public AddTagsAction withApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
        return this;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update tags even if they are already defined in the asset. By default, incoming tags are merged with the existing ones.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public Boolean getOverwriteMetadata() {
        return overwriteMetadata;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update tags even if they are already defined in the asset. By default, incoming tags are merged with the existing ones.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public void setOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
    }

    public AddTagsAction withOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddTagsAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("overwriteMetadata");
        sb.append('=');
        sb.append(((this.overwriteMetadata == null)?"<null>":this.overwriteMetadata));
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
        result = ((result* 31)+((this.applyToChildren == null)? 0 :this.applyToChildren.hashCode()));
        result = ((result* 31)+((this.overwriteMetadata == null)? 0 :this.overwriteMetadata.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddTagsAction) == false) {
            return false;
        }
        AddTagsAction rhs = ((AddTagsAction) other);
        return (((((this.applyToChildren == rhs.applyToChildren)||((this.applyToChildren!= null)&&this.applyToChildren.equals(rhs.applyToChildren)))&&((this.overwriteMetadata == rhs.overwriteMetadata)||((this.overwriteMetadata!= null)&&this.overwriteMetadata.equals(rhs.overwriteMetadata))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }


    /**
     * Add Tags action type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddTagsActionType {

        ADD_TAGS_ACTION("AddTagsAction");
        private final String value;
        private final static Map<String, AddTagsAction.AddTagsActionType> CONSTANTS = new HashMap<String, AddTagsAction.AddTagsActionType>();

        static {
            for (AddTagsAction.AddTagsActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddTagsActionType(String value) {
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
        public static AddTagsAction.AddTagsActionType fromValue(String value) {
            AddTagsAction.AddTagsActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
