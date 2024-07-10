
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
 * RemoveTierAction
 * <p>
 * Remove Owner Action Type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class RemoveTierAction {

    /**
     * Remove Tier Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Remove Tier Action Type")
    @NotNull
    private RemoveTierAction.RemoveTierActionType type = RemoveTierAction.RemoveTierActionType.fromValue("RemoveTierAction");

    /**
     * Remove Tier Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RemoveTierAction.RemoveTierActionType getType() {
        return type;
    }

    /**
     * Remove Tier Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RemoveTierAction.RemoveTierActionType type) {
        this.type = type;
    }

    public RemoveTierAction withType(RemoveTierAction.RemoveTierActionType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoveTierAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof RemoveTierAction) == false) {
            return false;
        }
        RemoveTierAction rhs = ((RemoveTierAction) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Remove Tier Action Type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RemoveTierActionType {

        REMOVE_TIER_ACTION("RemoveTierAction");
        private final String value;
        private final static Map<String, RemoveTierAction.RemoveTierActionType> CONSTANTS = new HashMap<String, RemoveTierAction.RemoveTierActionType>();

        static {
            for (RemoveTierAction.RemoveTierActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RemoveTierActionType(String value) {
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
        public static RemoveTierAction.RemoveTierActionType fromValue(String value) {
            RemoveTierAction.RemoveTierActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
