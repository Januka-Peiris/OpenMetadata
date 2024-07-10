
package org.openmetadata.schema.entity.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Observability Filters for Event Subscription.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "effect",
    "prefixCondition",
    "arguments"
})
@Generated("jsonschema2pojo")
public class ArgumentsInput {

    /**
     * Name of the filter
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the filter")
    private String name;
    @JsonProperty("effect")
    private ArgumentsInput.Effect effect = ArgumentsInput.Effect.fromValue("include");
    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @JsonProperty("prefixCondition")
    @JsonPropertyDescription("Prefix Condition to be applied to the Condition.")
    private ArgumentsInput.PrefixCondition prefixCondition = ArgumentsInput.PrefixCondition.fromValue("AND");
    /**
     * Arguments List
     * 
     */
    @JsonProperty("arguments")
    @JsonPropertyDescription("Arguments List")
    @Valid
    private List<Argument> arguments = new ArrayList<Argument>();

    /**
     * Name of the filter
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the filter
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public ArgumentsInput withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("effect")
    public ArgumentsInput.Effect getEffect() {
        return effect;
    }

    @JsonProperty("effect")
    public void setEffect(ArgumentsInput.Effect effect) {
        this.effect = effect;
    }

    public ArgumentsInput withEffect(ArgumentsInput.Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @JsonProperty("prefixCondition")
    public ArgumentsInput.PrefixCondition getPrefixCondition() {
        return prefixCondition;
    }

    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @JsonProperty("prefixCondition")
    public void setPrefixCondition(ArgumentsInput.PrefixCondition prefixCondition) {
        this.prefixCondition = prefixCondition;
    }

    public ArgumentsInput withPrefixCondition(ArgumentsInput.PrefixCondition prefixCondition) {
        this.prefixCondition = prefixCondition;
        return this;
    }

    /**
     * Arguments List
     * 
     */
    @JsonProperty("arguments")
    public List<Argument> getArguments() {
        return arguments;
    }

    /**
     * Arguments List
     * 
     */
    @JsonProperty("arguments")
    public void setArguments(List<Argument> arguments) {
        this.arguments = arguments;
    }

    public ArgumentsInput withArguments(List<Argument> arguments) {
        this.arguments = arguments;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ArgumentsInput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("prefixCondition");
        sb.append('=');
        sb.append(((this.prefixCondition == null)?"<null>":this.prefixCondition));
        sb.append(',');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null)?"<null>":this.arguments));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.prefixCondition == null)? 0 :this.prefixCondition.hashCode()));
        result = ((result* 31)+((this.arguments == null)? 0 :this.arguments.hashCode()));
        result = ((result* 31)+((this.effect == null)? 0 :this.effect.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArgumentsInput) == false) {
            return false;
        }
        ArgumentsInput rhs = ((ArgumentsInput) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.prefixCondition == rhs.prefixCondition)||((this.prefixCondition!= null)&&this.prefixCondition.equals(rhs.prefixCondition))))&&((this.arguments == rhs.arguments)||((this.arguments!= null)&&this.arguments.equals(rhs.arguments))))&&((this.effect == rhs.effect)||((this.effect!= null)&&this.effect.equals(rhs.effect))));
    }

    @Generated("jsonschema2pojo")
    public enum Effect {

        INCLUDE("include"),
        EXCLUDE("exclude");
        private final String value;
        private final static Map<String, ArgumentsInput.Effect> CONSTANTS = new HashMap<String, ArgumentsInput.Effect>();

        static {
            for (ArgumentsInput.Effect c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Effect(String value) {
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
        public static ArgumentsInput.Effect fromValue(String value) {
            ArgumentsInput.Effect constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PrefixCondition {

        AND("AND"),
        OR("OR");
        private final String value;
        private final static Map<String, ArgumentsInput.PrefixCondition> CONSTANTS = new HashMap<String, ArgumentsInput.PrefixCondition>();

        static {
            for (ArgumentsInput.PrefixCondition c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PrefixCondition(String value) {
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
        public static ArgumentsInput.PrefixCondition fromValue(String value) {
            ArgumentsInput.PrefixCondition constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
