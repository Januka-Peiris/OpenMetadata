
package org.openmetadata.schema.entity.app.external;

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


/**
 * AutomatorAppConfig
 * <p>
 * Configuration for the Automator External Application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "resources",
    "actions"
})
@Generated("jsonschema2pojo")
public class AutomatorAppConfig {

    /**
     * Application type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Application type.")
    @NotNull
    private AutomatorAppConfig.AutomatorAppType type = AutomatorAppConfig.AutomatorAppType.fromValue("Automator");
    /**
     * Entities selected to run the automation.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    @JsonPropertyDescription("Entities selected to run the automation.")
    @Valid
    @NotNull
    private Resource resources;
    /**
     * Action to take on those entities. E.g., propagate description through lineage, auto tagging, etc.
     * (Required)
     * 
     */
    @JsonProperty("actions")
    @JsonPropertyDescription("Action to take on those entities. E.g., propagate description through lineage, auto tagging, etc.")
    @Valid
    @NotNull
    private List<Object> actions = new ArrayList<Object>();

    /**
     * Application type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AutomatorAppConfig.AutomatorAppType getType() {
        return type;
    }

    /**
     * Application type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AutomatorAppConfig.AutomatorAppType type) {
        this.type = type;
    }

    public AutomatorAppConfig withType(AutomatorAppConfig.AutomatorAppType type) {
        this.type = type;
        return this;
    }

    /**
     * Entities selected to run the automation.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public Resource getResources() {
        return resources;
    }

    /**
     * Entities selected to run the automation.
     * (Required)
     * 
     */
    @JsonProperty("resources")
    public void setResources(Resource resources) {
        this.resources = resources;
    }

    public AutomatorAppConfig withResources(Resource resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Action to take on those entities. E.g., propagate description through lineage, auto tagging, etc.
     * (Required)
     * 
     */
    @JsonProperty("actions")
    public List<Object> getActions() {
        return actions;
    }

    /**
     * Action to take on those entities. E.g., propagate description through lineage, auto tagging, etc.
     * (Required)
     * 
     */
    @JsonProperty("actions")
    public void setActions(List<Object> actions) {
        this.actions = actions;
    }

    public AutomatorAppConfig withActions(List<Object> actions) {
        this.actions = actions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AutomatorAppConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("resources");
        sb.append('=');
        sb.append(((this.resources == null)?"<null>":this.resources));
        sb.append(',');
        sb.append("actions");
        sb.append('=');
        sb.append(((this.actions == null)?"<null>":this.actions));
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
        result = ((result* 31)+((this.resources == null)? 0 :this.resources.hashCode()));
        result = ((result* 31)+((this.actions == null)? 0 :this.actions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutomatorAppConfig) == false) {
            return false;
        }
        AutomatorAppConfig rhs = ((AutomatorAppConfig) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.resources == rhs.resources)||((this.resources!= null)&&this.resources.equals(rhs.resources))))&&((this.actions == rhs.actions)||((this.actions!= null)&&this.actions.equals(rhs.actions))));
    }


    /**
     * Application type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AutomatorAppType {

        AUTOMATOR("Automator");
        private final String value;
        private final static Map<String, AutomatorAppConfig.AutomatorAppType> CONSTANTS = new HashMap<String, AutomatorAppConfig.AutomatorAppType>();

        static {
            for (AutomatorAppConfig.AutomatorAppType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AutomatorAppType(String value) {
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
        public static AutomatorAppConfig.AutomatorAppType fromValue(String value) {
            AutomatorAppConfig.AutomatorAppType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
