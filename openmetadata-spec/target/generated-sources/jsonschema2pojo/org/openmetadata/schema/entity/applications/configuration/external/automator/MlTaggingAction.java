
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
 * MLTaggingAction
 * <p>
 * ML Tagging action configuration for external automator.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class MlTaggingAction {

    /**
     * ML PII Tagging action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("ML PII Tagging action type.")
    @NotNull
    private MlTaggingAction.MlTaggingActionType type = MlTaggingAction.MlTaggingActionType.fromValue("MLTaggingAction");

    /**
     * ML PII Tagging action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public MlTaggingAction.MlTaggingActionType getType() {
        return type;
    }

    /**
     * ML PII Tagging action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(MlTaggingAction.MlTaggingActionType type) {
        this.type = type;
    }

    public MlTaggingAction withType(MlTaggingAction.MlTaggingActionType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlTaggingAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof MlTaggingAction) == false) {
            return false;
        }
        MlTaggingAction rhs = ((MlTaggingAction) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * ML PII Tagging action type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MlTaggingActionType {

        ML_TAGGING_ACTION("MLTaggingAction");
        private final String value;
        private final static Map<String, MlTaggingAction.MlTaggingActionType> CONSTANTS = new HashMap<String, MlTaggingAction.MlTaggingActionType>();

        static {
            for (MlTaggingAction.MlTaggingActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MlTaggingActionType(String value) {
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
        public static MlTaggingAction.MlTaggingActionType fromValue(String value) {
            MlTaggingAction.MlTaggingActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
