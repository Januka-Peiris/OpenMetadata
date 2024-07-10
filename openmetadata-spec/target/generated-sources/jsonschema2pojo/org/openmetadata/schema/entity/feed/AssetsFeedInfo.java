
package org.openmetadata.schema.entity.feed;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * AssetsFeedInfo
 * <p>
 * This schema defines the schema for Assets addition/deletion Updates.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "updatedAssets"
})
@Generated("jsonschema2pojo")
public class AssetsFeedInfo {

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedAssets")
    @JsonPropertyDescription("This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private List<EntityReference> updatedAssets = null;

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedAssets")
    public List<EntityReference> getUpdatedAssets() {
        return updatedAssets;
    }

    /**
     * Entity Reference List
     * <p>
     * This schema defines the EntityReferenceList type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedAssets")
    public void setUpdatedAssets(List<EntityReference> updatedAssets) {
        this.updatedAssets = updatedAssets;
    }

    public AssetsFeedInfo withUpdatedAssets(List<EntityReference> updatedAssets) {
        this.updatedAssets = updatedAssets;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AssetsFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("updatedAssets");
        sb.append('=');
        sb.append(((this.updatedAssets == null)?"<null>":this.updatedAssets));
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
        result = ((result* 31)+((this.updatedAssets == null)? 0 :this.updatedAssets.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AssetsFeedInfo) == false) {
            return false;
        }
        AssetsFeedInfo rhs = ((AssetsFeedInfo) other);
        return ((this.updatedAssets == rhs.updatedAssets)||((this.updatedAssets!= null)&&this.updatedAssets.equals(rhs.updatedAssets)));
    }

}
