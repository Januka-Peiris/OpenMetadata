
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
 * RemoveDescriptionAction
 * <p>
 * Remove Owner Action Type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "applyToChildren"
})
@Generated("jsonschema2pojo")
public class RemoveDescriptionAction {

    /**
     * Remove Description Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Remove Description Action Type")
    @NotNull
    private RemoveDescriptionAction.RemoveDescriptionActionType type = RemoveDescriptionAction.RemoveDescriptionActionType.fromValue("RemoveDescriptionAction");
    /**
     * Apply to Children
     * <p>
     * Remove descriptions from all children of the selected assets. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    @JsonPropertyDescription("Remove descriptions from all children of the selected assets. E.g., columns, tasks, topic fields,...")
    @Valid
    private List<String> applyToChildren = null;

    /**
     * Remove Description Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RemoveDescriptionAction.RemoveDescriptionActionType getType() {
        return type;
    }

    /**
     * Remove Description Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RemoveDescriptionAction.RemoveDescriptionActionType type) {
        this.type = type;
    }

    public RemoveDescriptionAction withType(RemoveDescriptionAction.RemoveDescriptionActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Apply to Children
     * <p>
     * Remove descriptions from all children of the selected assets. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public List<String> getApplyToChildren() {
        return applyToChildren;
    }

    /**
     * Apply to Children
     * <p>
     * Remove descriptions from all children of the selected assets. E.g., columns, tasks, topic fields,...
     * 
     */
    @JsonProperty("applyToChildren")
    public void setApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
    }

    public RemoveDescriptionAction withApplyToChildren(List<String> applyToChildren) {
        this.applyToChildren = applyToChildren;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoveDescriptionAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemoveDescriptionAction) == false) {
            return false;
        }
        RemoveDescriptionAction rhs = ((RemoveDescriptionAction) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.applyToChildren == rhs.applyToChildren)||((this.applyToChildren!= null)&&this.applyToChildren.equals(rhs.applyToChildren))));
    }


    /**
     * Remove Description Action Type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RemoveDescriptionActionType {

        REMOVE_DESCRIPTION_ACTION("RemoveDescriptionAction");
        private final String value;
        private final static Map<String, RemoveDescriptionAction.RemoveDescriptionActionType> CONSTANTS = new HashMap<String, RemoveDescriptionAction.RemoveDescriptionActionType>();

        static {
            for (RemoveDescriptionAction.RemoveDescriptionActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RemoveDescriptionActionType(String value) {
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
        public static RemoveDescriptionAction.RemoveDescriptionActionType fromValue(String value) {
            RemoveDescriptionAction.RemoveDescriptionActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
