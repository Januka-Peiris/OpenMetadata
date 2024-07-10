
package org.openmetadata.schema.entity.feed;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EntityInfo
 * <p>
 * EntityInfo In case of Entity Created, Updated Or Deleted.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "entity"
})
@Generated("jsonschema2pojo")
public class EntityInfo {

    /**
     * Entity Details in case of Creation , Soft Deletion and Deletion.
     * 
     */
    @JsonProperty("entity")
    @JsonPropertyDescription("Entity Details in case of Creation , Soft Deletion and Deletion.")
    private Object entity;

    /**
     * Entity Details in case of Creation , Soft Deletion and Deletion.
     * 
     */
    @JsonProperty("entity")
    public Object getEntity() {
        return entity;
    }

    /**
     * Entity Details in case of Creation , Soft Deletion and Deletion.
     * 
     */
    @JsonProperty("entity")
    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public EntityInfo withEntity(Object entity) {
        this.entity = entity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("entity");
        sb.append('=');
        sb.append(((this.entity == null)?"<null>":this.entity));
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
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityInfo) == false) {
            return false;
        }
        EntityInfo rhs = ((EntityInfo) other);
        return ((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity)));
    }

}
