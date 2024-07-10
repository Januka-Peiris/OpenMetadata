
package org.openmetadata.schema.tests.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * Assigned
 * <p>
 * test case failure details for assigned failures
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "assignee"
})
@Generated("jsonschema2pojo")
public class Assigned {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference assignee;

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public EntityReference getAssignee() {
        return assignee;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("assignee")
    public void setAssignee(EntityReference assignee) {
        this.assignee = assignee;
    }

    public Assigned withAssignee(EntityReference assignee) {
        this.assignee = assignee;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Assigned.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
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
        result = ((result* 31)+((this.assignee == null)? 0 :this.assignee.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Assigned) == false) {
            return false;
        }
        Assigned rhs = ((Assigned) other);
        return ((this.assignee == rhs.assignee)||((this.assignee!= null)&&this.assignee.equals(rhs.assignee)));
    }

}
