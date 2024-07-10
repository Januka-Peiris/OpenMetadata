
package org.openmetadata.schema.services.connections.database.iceberg;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IcebergFileSystem
 * <p>
 * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class IcebergFileSystem {

    @JsonProperty("type")
    private Object type;

    @JsonProperty("type")
    public Object getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Object type) {
        this.type = type;
    }

    public IcebergFileSystem withType(Object type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IcebergFileSystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IcebergFileSystem) == false) {
            return false;
        }
        IcebergFileSystem rhs = ((IcebergFileSystem) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }

}
