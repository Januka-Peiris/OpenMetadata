
package org.openmetadata.schema.entity.feed;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * DomainFeedInfo
 * <p>
 * This schema defines the schema for Assets addition/deletion Updates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "previousDomain",
    "updatedDomain"
})
@Generated("jsonschema2pojo")
public class DomainFeedInfo {

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("previousDomain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference previousDomain;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedDomain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference updatedDomain;

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("previousDomain")
    public EntityReference getPreviousDomain() {
        return previousDomain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("previousDomain")
    public void setPreviousDomain(EntityReference previousDomain) {
        this.previousDomain = previousDomain;
    }

    public DomainFeedInfo withPreviousDomain(EntityReference previousDomain) {
        this.previousDomain = previousDomain;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedDomain")
    public EntityReference getUpdatedDomain() {
        return updatedDomain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedDomain")
    public void setUpdatedDomain(EntityReference updatedDomain) {
        this.updatedDomain = updatedDomain;
    }

    public DomainFeedInfo withUpdatedDomain(EntityReference updatedDomain) {
        this.updatedDomain = updatedDomain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DomainFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("previousDomain");
        sb.append('=');
        sb.append(((this.previousDomain == null)?"<null>":this.previousDomain));
        sb.append(',');
        sb.append("updatedDomain");
        sb.append('=');
        sb.append(((this.updatedDomain == null)?"<null>":this.updatedDomain));
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
        result = ((result* 31)+((this.previousDomain == null)? 0 :this.previousDomain.hashCode()));
        result = ((result* 31)+((this.updatedDomain == null)? 0 :this.updatedDomain.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainFeedInfo) == false) {
            return false;
        }
        DomainFeedInfo rhs = ((DomainFeedInfo) other);
        return (((this.previousDomain == rhs.previousDomain)||((this.previousDomain!= null)&&this.previousDomain.equals(rhs.previousDomain)))&&((this.updatedDomain == rhs.updatedDomain)||((this.updatedDomain!= null)&&this.updatedDomain.equals(rhs.updatedDomain))));
    }

}
