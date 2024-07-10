
package org.openmetadata.schema.entity.feed;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * OwnerFeedInfo
 * <p>
 * This schema defines the schema for Ownership Updates for Feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "previousOwner",
    "updatedOwner"
})
@Generated("jsonschema2pojo")
public class OwnerFeedInfo {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("previousOwner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference previousOwner;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedOwner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference updatedOwner;

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("previousOwner")
    public EntityReference getPreviousOwner() {
        return previousOwner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("previousOwner")
    public void setPreviousOwner(EntityReference previousOwner) {
        this.previousOwner = previousOwner;
    }

    public OwnerFeedInfo withPreviousOwner(EntityReference previousOwner) {
        this.previousOwner = previousOwner;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedOwner")
    public EntityReference getUpdatedOwner() {
        return updatedOwner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedOwner")
    public void setUpdatedOwner(EntityReference updatedOwner) {
        this.updatedOwner = updatedOwner;
    }

    public OwnerFeedInfo withUpdatedOwner(EntityReference updatedOwner) {
        this.updatedOwner = updatedOwner;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OwnerFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("previousOwner");
        sb.append('=');
        sb.append(((this.previousOwner == null)?"<null>":this.previousOwner));
        sb.append(',');
        sb.append("updatedOwner");
        sb.append('=');
        sb.append(((this.updatedOwner == null)?"<null>":this.updatedOwner));
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
        result = ((result* 31)+((this.updatedOwner == null)? 0 :this.updatedOwner.hashCode()));
        result = ((result* 31)+((this.previousOwner == null)? 0 :this.previousOwner.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OwnerFeedInfo) == false) {
            return false;
        }
        OwnerFeedInfo rhs = ((OwnerFeedInfo) other);
        return (((this.updatedOwner == rhs.updatedOwner)||((this.updatedOwner!= null)&&this.updatedOwner.equals(rhs.updatedOwner)))&&((this.previousOwner == rhs.previousOwner)||((this.previousOwner!= null)&&this.previousOwner.equals(rhs.previousOwner))));
    }

}
