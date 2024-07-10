
package org.openmetadata.schema.api.events;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.entity.events.ArgumentsInput;


/**
 * Observability of the event subscription.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "filters",
    "actions"
})
@Generated("jsonschema2pojo")
public class AlertFilteringInput {

    /**
     * List of filters for the event subscription.
     * 
     */
    @JsonProperty("filters")
    @JsonPropertyDescription("List of filters for the event subscription.")
    @Valid
    private List<ArgumentsInput> filters = new ArrayList<ArgumentsInput>();
    /**
     * List of filters for the event subscription.
     * 
     */
    @JsonProperty("actions")
    @JsonPropertyDescription("List of filters for the event subscription.")
    @Valid
    private List<ArgumentsInput> actions = new ArrayList<ArgumentsInput>();

    /**
     * List of filters for the event subscription.
     * 
     */
    @JsonProperty("filters")
    public List<ArgumentsInput> getFilters() {
        return filters;
    }

    /**
     * List of filters for the event subscription.
     * 
     */
    @JsonProperty("filters")
    public void setFilters(List<ArgumentsInput> filters) {
        this.filters = filters;
    }

    public AlertFilteringInput withFilters(List<ArgumentsInput> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * List of filters for the event subscription.
     * 
     */
    @JsonProperty("actions")
    public List<ArgumentsInput> getActions() {
        return actions;
    }

    /**
     * List of filters for the event subscription.
     * 
     */
    @JsonProperty("actions")
    public void setActions(List<ArgumentsInput> actions) {
        this.actions = actions;
    }

    public AlertFilteringInput withActions(List<ArgumentsInput> actions) {
        this.actions = actions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlertFilteringInput.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("filters");
        sb.append('=');
        sb.append(((this.filters == null)?"<null>":this.filters));
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
        result = ((result* 31)+((this.actions == null)? 0 :this.actions.hashCode()));
        result = ((result* 31)+((this.filters == null)? 0 :this.filters.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlertFilteringInput) == false) {
            return false;
        }
        AlertFilteringInput rhs = ((AlertFilteringInput) other);
        return (((this.actions == rhs.actions)||((this.actions!= null)&&this.actions.equals(rhs.actions)))&&((this.filters == rhs.filters)||((this.filters!= null)&&this.filters.equals(rhs.filters))));
    }

}
