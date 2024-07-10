
package org.openmetadata.schema.entity.applications.configuration.external.automator;

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


/**
 * AddDescriptionAction
 * <p>
 * Apply Tags to the selected assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "description",
    "applyToChildren",
    "overwriteMetadata"
})
@Generated("jsonschema2pojo")
public class AddDescriptionAction {

    /**
     * Add Description Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Add Description Action Type.")
    @NotNull
    private AddDescriptionAction.AddDescriptionActionType type = AddDescriptionAction.AddDescriptionActionType.fromValue("AddDescriptionAction");
    /**
     * Description to apply
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Description to apply")
    @NotNull
    private String description;
    /**
     * Apply to Children
     * <p>
     * Apply the description to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    @JsonPropertyDescription("Apply the description to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...")
    @Valid
    private List<String> applyToChildren = null;
    /**
     * Overwrite Metadata
     * <p>
     * Update the description even if they are already defined in the asset. By default, we'll only add the descriptions to assets without the description set.
     * 
     */
    @JsonProperty("overwriteMetadata")
    @JsonPropertyDescription("Update the description even if they are already defined in the asset. By default, we'll only add the descriptions to assets without the description set.")
    private Boolean overwriteMetadata = false;

    /**
     * Add Description Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AddDescriptionAction.AddDescriptionActionType getType() {
        return type;
    }

    /**
     * Add Description Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AddDescriptionAction.AddDescriptionActionType type) {
        this.type = type;
    }

    public AddDescriptionAction withType(AddDescriptionAction.AddDescriptionActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Description to apply
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Description to apply
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public AddDescriptionAction withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Apply to Children
     * <p>
     * Apply the description to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public List<String> getApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Apply to Children
     * <p>
     * Apply the description to the children of the selected assets that match the criteria. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public void setApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
    }

    public AddDescriptionAction withApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
        return this;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the description even if they are already defined in the asset. By default, we'll only add the descriptions to assets without the description set.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public Boolean getOverwriteMetadata() {
        return overwriteMetadata;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the description even if they are already defined in the asset. By default, we'll only add the descriptions to assets without the description set.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public void setOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
    }

    public AddDescriptionAction withOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddDescriptionAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.applyToChildren == null)? 0 :this.applyToChildren.hashCode()));
        result = ((result* 31)+((this.overwriteMetadata == null)? 0 :this.overwriteMetadata.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddDescriptionAction) == false) {
            return false;
        }
        AddDescriptionAction rhs = ((AddDescriptionAction) other);
        return (((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.applyToChildren == rhs.applyToChildren)||((this.applyToChildren!= null)&&this.applyToChildren.equals(rhs.applyToChildren))))&&((this.overwriteMetadata == rhs.overwriteMetadata)||((this.overwriteMetadata!= null)&&this.overwriteMetadata.equals(rhs.overwriteMetadata))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }


    /**
     * Add Description Action Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddDescriptionActionType {

        ADD_DESCRIPTION_ACTION("AddDescriptionAction");
        private final String value;
        private final static Map<String, AddDescriptionAction.AddDescriptionActionType> CONSTANTS = new HashMap<String, AddDescriptionAction.AddDescriptionActionType>();

        static {
            for (AddDescriptionAction.AddDescriptionActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddDescriptionActionType(String value) {
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
        public static AddDescriptionAction.AddDescriptionActionType fromValue(String value) {
            AddDescriptionAction.AddDescriptionActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
