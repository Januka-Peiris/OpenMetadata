
package org.openmetadata.schema.system;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EntityError
 * <p>
 * Entity And Message Scehma in case of failures.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "entity"
})
@Generated("jsonschema2pojo")
public class EntityError {

    @JsonProperty("message")
    private String message;
    @JsonProperty("entity")
    private Object entity;

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public EntityError withMessage(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("entity")
    public Object getEntity() {
        return entity;
    }

    @JsonProperty("entity")
    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public EntityError withEntity(Object entity) {
        this.entity = entity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EntityError.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.entity == null)? 0 :this.entity.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityError) == false) {
            return false;
        }
        EntityError rhs = ((EntityError) other);
        return (((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.entity == rhs.entity)||((this.entity!= null)&&this.entity.equals(rhs.entity))));
    }

}
