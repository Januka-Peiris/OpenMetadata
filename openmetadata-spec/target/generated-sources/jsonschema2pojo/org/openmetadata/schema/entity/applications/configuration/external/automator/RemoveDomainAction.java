
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
 * RemoveDomainAction
 * <p>
 * Remove Owner Action Type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class RemoveDomainAction {

    /**
     * Remove Domain Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Remove Domain Action Type")
    @NotNull
    private RemoveDomainAction.RemoveDomainActionType type = RemoveDomainAction.RemoveDomainActionType.fromValue("RemoveDomainAction");

    /**
     * Remove Domain Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public RemoveDomainAction.RemoveDomainActionType getType() {
        return type;
    }

    /**
     * Remove Domain Action Type
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(RemoveDomainAction.RemoveDomainActionType type) {
        this.type = type;
    }

    public RemoveDomainAction withType(RemoveDomainAction.RemoveDomainActionType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoveDomainAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof RemoveDomainAction) == false) {
            return false;
        }
        RemoveDomainAction rhs = ((RemoveDomainAction) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Remove Domain Action Type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum RemoveDomainActionType {

        REMOVE_DOMAIN_ACTION("RemoveDomainAction");
        private final String value;
        private final static Map<String, RemoveDomainAction.RemoveDomainActionType> CONSTANTS = new HashMap<String, RemoveDomainAction.RemoveDomainActionType>();

        static {
            for (RemoveDomainAction.RemoveDomainActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        RemoveDomainActionType(String value) {
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
        public static RemoveDomainAction.RemoveDomainActionType fromValue(String value) {
            RemoveDomainAction.RemoveDomainActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
