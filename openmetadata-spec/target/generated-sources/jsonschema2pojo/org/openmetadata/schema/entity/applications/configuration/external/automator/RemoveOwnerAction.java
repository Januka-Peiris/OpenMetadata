
package org.openmetadata.schema.entity.applications.configuration.external.automator;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * RemoveOwnerAction
 * <p>
 * Remove Owner Action Type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class RemoveOwnerAction {

    /**
     * Remove Owner Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Remove Owner Action Type")
    @NotNull
    private RemoveOwnerAction.RemoveOwnerActionType type = RemoveOwnerAction.RemoveOwnerActionType.fromValue("RemoveOwnerAction");

    /**
     * Remove Owner Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RemoveOwnerAction.RemoveOwnerActionType getType() {
        return type;
    }

    /**
     * Remove Owner Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RemoveOwnerAction.RemoveOwnerActionType type) {
        this.type = type;
    }

    public RemoveOwnerAction withType(RemoveOwnerAction.RemoveOwnerActionType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoveOwnerAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemoveOwnerAction) == false) {
            return false;
        }
        RemoveOwnerAction rhs = ((RemoveOwnerAction) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Remove Owner Action Type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RemoveOwnerActionType {

        REMOVE_OWNER_ACTION("RemoveOwnerAction");
        private final String value;
        private final static Map<String, RemoveOwnerAction.RemoveOwnerActionType> CONSTANTS = new HashMap<String, RemoveOwnerAction.RemoveOwnerActionType>();

        static {
            for (RemoveOwnerAction.RemoveOwnerActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RemoveOwnerActionType(String value) {
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
        public static RemoveOwnerAction.RemoveOwnerActionType fromValue(String value) {
            RemoveOwnerAction.RemoveOwnerActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
