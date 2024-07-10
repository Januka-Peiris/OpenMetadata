
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
 * AddDomainAction
 * <p>
 * Add an owner to the selected assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "domain",
    "overwriteMetadata"
})
@Generated("jsonschema2pojo")
public class AddDomainAction {

    /**
     * Add Owner Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Add Owner Action Type.")
    @NotNull
    private AddDomainAction.AddDomainActionType type = AddDomainAction.AddDomainActionType.fromValue("AddDomainAction");
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference domain;
    /**
     * Overwrite Metadata
     * <p>
     * Update the domain even if it is defined in the asset. By default, we will only apply the domain to assets without domain.
     * 
     */
    @JsonProperty("overwriteMetadata")
    @JsonPropertyDescription("Update the domain even if it is defined in the asset. By default, we will only apply the domain to assets without domain.")
    private Boolean overwriteMetadata = false;

    /**
     * Add Owner Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AddDomainAction.AddDomainActionType getType() {
        return type;
    }

    /**
     * Add Owner Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AddDomainAction.AddDomainActionType type) {
        this.type = type;
    }

    public AddDomainAction withType(AddDomainAction.AddDomainActionType type) {
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
    @JsonProperty("domain")
    public EntityReference getDomain() {
        return domain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("domain")
    public void setDomain(EntityReference domain) {
        this.domain = domain;
    }

    public AddDomainAction withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the domain even if it is defined in the asset. By default, we will only apply the domain to assets without domain.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public Boolean getOverwriteMetadata() {
        return overwriteMetadata;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the domain even if it is defined in the asset. By default, we will only apply the domain to assets without domain.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public void setOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
    }

    public AddDomainAction withOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddDomainAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
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
        result = ((result* 31)+((this.overwriteMetadata == null)? 0 :this.overwriteMetadata.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddDomainAction) == false) {
            return false;
        }
        AddDomainAction rhs = ((AddDomainAction) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.overwriteMetadata == rhs.overwriteMetadata)||((this.overwriteMetadata!= null)&&this.overwriteMetadata.equals(rhs.overwriteMetadata))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))));
    }


    /**
     * Add Owner Action Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddDomainActionType {

        ADD_DOMAIN_ACTION("AddDomainAction");
        private final String value;
        private final static Map<String, AddDomainAction.AddDomainActionType> CONSTANTS = new HashMap<String, AddDomainAction.AddDomainActionType>();

        static {
            for (AddDomainAction.AddDomainActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddDomainActionType(String value) {
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
        public static AddDomainAction.AddDomainActionType fromValue(String value) {
            AddDomainAction.AddDomainActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
