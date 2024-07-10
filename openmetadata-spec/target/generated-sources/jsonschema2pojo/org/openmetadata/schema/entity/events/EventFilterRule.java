
package org.openmetadata.schema.entity.events;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * EventFilterRule
 * <p>
 * Describes an Event Filter Rule
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "effect",
    "condition",
    "arguments",
    "inputType",
    "prefixCondition"
})
@Generated("jsonschema2pojo")
public class EventFilterRule {

    /**
     * Name of this Event Filter.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of this Event Filter.")
    private String name;
    /**
     * Display Name of the Filter.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name of the Filter.")
    private String displayName;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    @NotNull
    private org.openmetadata.schema.entity.events.ArgumentsInput.Effect effect = org.openmetadata.schema.entity.events.ArgumentsInput.Effect.fromValue("include");
    /**
     * Expression in SpEL.
     * (Required)
     * 
     */
    @JsonProperty("condition")
    @JsonPropertyDescription("Expression in SpEL.")
    @NotNull
    private String condition;
    /**
     * Arguments to the Condition.
     * 
     */
    @JsonProperty("arguments")
    @JsonPropertyDescription("Arguments to the Condition.")
    @Valid
    private List<String> arguments = new ArrayList<String>();
    @JsonProperty("inputType")
    private EventFilterRule.InputType inputType;
    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @JsonProperty("prefixCondition")
    @JsonPropertyDescription("Prefix Condition to be applied to the Condition.")
    private org.openmetadata.schema.entity.events.ArgumentsInput.PrefixCondition prefixCondition = org.openmetadata.schema.entity.events.ArgumentsInput.PrefixCondition.fromValue("AND");

    /**
     * Name of this Event Filter.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of this Event Filter.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public EventFilterRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name of the Filter.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name of the Filter.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public EventFilterRule withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public EventFilterRule withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public EventFilterRule withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    public org.openmetadata.schema.entity.events.ArgumentsInput.Effect getEffect() {
        return effect;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("effect")
    public void setEffect(org.openmetadata.schema.entity.events.ArgumentsInput.Effect effect) {
        this.effect = effect;
    }

    public EventFilterRule withEffect(org.openmetadata.schema.entity.events.ArgumentsInput.Effect effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Expression in SpEL.
     * (Required)
     * 
     */
    @JsonProperty("condition")
    public String getCondition() {
        return condition;
    }

    /**
     * Expression in SpEL.
     * (Required)
     * 
     */
    @JsonProperty("condition")
    public void setCondition(String condition) {
        this.condition = condition;
    }

    public EventFilterRule withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Arguments to the Condition.
     * 
     */
    @JsonProperty("arguments")
    public List<String> getArguments() {
        return arguments;
    }

    /**
     * Arguments to the Condition.
     * 
     */
    @JsonProperty("arguments")
    public void setArguments(List<String> arguments) {
        this.arguments = arguments;
    }

    public EventFilterRule withArguments(List<String> arguments) {
        this.arguments = arguments;
        return this;
    }

    @JsonProperty("inputType")
    public EventFilterRule.InputType getInputType() {
        return inputType;
    }

    @JsonProperty("inputType")
    public void setInputType(EventFilterRule.InputType inputType) {
        this.inputType = inputType;
    }

    public EventFilterRule withInputType(EventFilterRule.InputType inputType) {
        this.inputType = inputType;
        return this;
    }

    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @JsonProperty("prefixCondition")
    public org.openmetadata.schema.entity.events.ArgumentsInput.PrefixCondition getPrefixCondition() {
        return prefixCondition;
    }

    /**
     * Prefix Condition to be applied to the Condition.
     * 
     */
    @JsonProperty("prefixCondition")
    public void setPrefixCondition(org.openmetadata.schema.entity.events.ArgumentsInput.PrefixCondition prefixCondition) {
        this.prefixCondition = prefixCondition;
    }

    public EventFilterRule withPrefixCondition(org.openmetadata.schema.entity.events.ArgumentsInput.PrefixCondition prefixCondition) {
        this.prefixCondition = prefixCondition;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EventFilterRule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("effect");
        sb.append('=');
        sb.append(((this.effect == null)?"<null>":this.effect));
        sb.append(',');
        sb.append("condition");
        sb.append('=');
        sb.append(((this.condition == null)?"<null>":this.condition));
        sb.append(',');
        sb.append("arguments");
        sb.append('=');
        sb.append(((this.arguments == null)?"<null>":this.arguments));
        sb.append(',');
        sb.append("inputType");
        sb.append('=');
        sb.append(((this.inputType == null)?"<null>":this.inputType));
        sb.append(',');
        sb.append("prefixCondition");
        sb.append('=');
        sb.append(((this.prefixCondition == null)?"<null>":this.prefixCondition));
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
        result = ((result* 31)+((this.condition == null)? 0 :this.condition.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.effect == null)? 0 :this.effect.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.prefixCondition == null)? 0 :this.prefixCondition.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.arguments == null)? 0 :this.arguments.hashCode()));
        result = ((result* 31)+((this.inputType == null)? 0 :this.inputType.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventFilterRule) == false) {
            return false;
        }
        EventFilterRule rhs = ((EventFilterRule) other);
        return ((((((((((this.condition == rhs.condition)||((this.condition!= null)&&this.condition.equals(rhs.condition)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.effect == rhs.effect)||((this.effect!= null)&&this.effect.equals(rhs.effect))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.prefixCondition == rhs.prefixCondition)||((this.prefixCondition!= null)&&this.prefixCondition.equals(rhs.prefixCondition))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.arguments == rhs.arguments)||((this.arguments!= null)&&this.arguments.equals(rhs.arguments))))&&((this.inputType == rhs.inputType)||((this.inputType!= null)&&this.inputType.equals(rhs.inputType))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))));
    }

    @Generated("jsonschema2pojo")
    public enum InputType {

        STATIC("static"),
        RUNTIME("runtime"),
        NONE("none");
        private final String value;
        private final static Map<String, EventFilterRule.InputType> CONSTANTS = new HashMap<String, EventFilterRule.InputType>();

        static {
            for (EventFilterRule.InputType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        InputType(String value) {
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
        public static EventFilterRule.InputType fromValue(String value) {
            EventFilterRule.InputType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
