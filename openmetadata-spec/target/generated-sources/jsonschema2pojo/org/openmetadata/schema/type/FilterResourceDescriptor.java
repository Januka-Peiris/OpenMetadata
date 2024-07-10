
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.entity.events.EventFilterRule;


/**
 * FilterResourceDescriptor
 * <p>
 * Filter descriptor
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "supportedFilters",
    "supportedActions"
})
@Generated("jsonschema2pojo")
public class FilterResourceDescriptor {

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.")
    private String name;
    /**
     * List of operations supported filters by the resource.
     * 
     */
    @JsonProperty("supportedFilters")
    @JsonPropertyDescription("List of operations supported filters by the resource.")
    @Valid
    private List<EventFilterRule> supportedFilters = new ArrayList<EventFilterRule>();
    /**
     * List of actions supported filters by the resource.
     * 
     */
    @JsonProperty("supportedActions")
    @JsonPropertyDescription("List of actions supported filters by the resource.")
    @Valid
    private List<EventFilterRule> supportedActions = new ArrayList<EventFilterRule>();

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the resource. For entity related resources, resource name is same as the entity name. Some resources such as lineage are not entities but are resources.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public FilterResourceDescriptor withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * List of operations supported filters by the resource.
     * 
     */
    @JsonProperty("supportedFilters")
    public List<EventFilterRule> getSupportedFilters() {
        return supportedFilters;
    }

    /**
     * List of operations supported filters by the resource.
     * 
     */
    @JsonProperty("supportedFilters")
    public void setSupportedFilters(List<EventFilterRule> supportedFilters) {
        this.supportedFilters = supportedFilters;
    }

    public FilterResourceDescriptor withSupportedFilters(List<EventFilterRule> supportedFilters) {
        this.supportedFilters = supportedFilters;
        return this;
    }

    /**
     * List of actions supported filters by the resource.
     * 
     */
    @JsonProperty("supportedActions")
    public List<EventFilterRule> getSupportedActions() {
        return supportedActions;
    }

    /**
     * List of actions supported filters by the resource.
     * 
     */
    @JsonProperty("supportedActions")
    public void setSupportedActions(List<EventFilterRule> supportedActions) {
        this.supportedActions = supportedActions;
    }

    public FilterResourceDescriptor withSupportedActions(List<EventFilterRule> supportedActions) {
        this.supportedActions = supportedActions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FilterResourceDescriptor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("supportedFilters");
        sb.append('=');
        sb.append(((this.supportedFilters == null)?"<null>":this.supportedFilters));
        sb.append(',');
        sb.append("supportedActions");
        sb.append('=');
        sb.append(((this.supportedActions == null)?"<null>":this.supportedActions));
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
        result = ((result* 31)+((this.supportedFilters == null)? 0 :this.supportedFilters.hashCode()));
        result = ((result* 31)+((this.supportedActions == null)? 0 :this.supportedActions.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilterResourceDescriptor) == false) {
            return false;
        }
        FilterResourceDescriptor rhs = ((FilterResourceDescriptor) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.supportedFilters == rhs.supportedFilters)||((this.supportedFilters!= null)&&this.supportedFilters.equals(rhs.supportedFilters))))&&((this.supportedActions == rhs.supportedActions)||((this.supportedActions!= null)&&this.supportedActions.equals(rhs.supportedActions))));
    }

}
