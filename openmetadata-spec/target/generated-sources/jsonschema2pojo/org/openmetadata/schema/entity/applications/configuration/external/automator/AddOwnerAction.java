
package org.openmetadata.schema.entity.applications.configuration.external.automator;

import java.util.HashMap;
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
import org.openmetadata.schema.type.EntityReference;


/**
 * AddOwnerAction
 * <p>
 * Add an owner to the selected assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "owner",
    "overwriteMetadata"
})
@Generated("jsonschema2pojo")
public class AddOwnerAction {

    /**
     * Add Owner Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Add Owner Action Type.")
    @NotNull
    private AddOwnerAction.AddOwnerActionType type = AddOwnerAction.AddOwnerActionType.fromValue("AddOwnerAction");
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference owner;
    /**
     * Overwrite Metadata
     * <p>
     * Update the owner even if it is defined in the asset. By default, we will only apply the owner to assets without owner.
     * 
     */
    @JsonProperty("overwriteMetadata")
    @JsonPropertyDescription("Update the owner even if it is defined in the asset. By default, we will only apply the owner to assets without owner.")
    private Boolean overwriteMetadata = false;

    /**
     * Add Owner Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AddOwnerAction.AddOwnerActionType getType() {
        return type;
    }

    /**
     * Add Owner Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AddOwnerAction.AddOwnerActionType type) {
        this.type = type;
    }

    public AddOwnerAction withType(AddOwnerAction.AddOwnerActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public AddOwnerAction withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the owner even if it is defined in the asset. By default, we will only apply the owner to assets without owner.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public Boolean getOverwriteMetadata() {
        return overwriteMetadata;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the owner even if it is defined in the asset. By default, we will only apply the owner to assets without owner.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public void setOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
    }

    public AddOwnerAction withOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddOwnerAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("overwriteMetadata");
        sb.append('=');
        sb.append(((this.overwriteMetadata == null)?"<null>":this.overwriteMetadata));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.overwriteMetadata == null)? 0 :this.overwriteMetadata.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddOwnerAction) == false) {
            return false;
        }
        AddOwnerAction rhs = ((AddOwnerAction) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.overwriteMetadata == rhs.overwriteMetadata)||((this.overwriteMetadata!= null)&&this.overwriteMetadata.equals(rhs.overwriteMetadata))));
    }


    /**
     * Add Owner Action Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddOwnerActionType {

        ADD_OWNER_ACTION("AddOwnerAction");
        private final String value;
        private final static Map<String, AddOwnerAction.AddOwnerActionType> CONSTANTS = new HashMap<String, AddOwnerAction.AddOwnerActionType>();

        static {
            for (AddOwnerAction.AddOwnerActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddOwnerActionType(String value) {
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
        public static AddOwnerAction.AddOwnerActionType fromValue(String value) {
            AddOwnerAction.AddOwnerActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
