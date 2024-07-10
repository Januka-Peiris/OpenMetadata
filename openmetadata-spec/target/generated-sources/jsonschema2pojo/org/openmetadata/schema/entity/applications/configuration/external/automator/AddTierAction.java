
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
import org.openmetadata.schema.type.TagLabel;


/**
 * AddTierAction
 * <p>
 * Add an owner to the selected assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "tier",
    "overwriteMetadata"
})
@Generated("jsonschema2pojo")
public class AddTierAction {

    /**
     * Add Tier Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Add Tier Action Type.")
    @NotNull
    private AddTierAction.AddTierActionType type = AddTierAction.AddTierActionType.fromValue("AddTierAction");
    /**
     * TagLabel
     * <p>
     * This schema defines the type for labeling an entity with a Tag.
     * (Required)
     * 
     */
    @JsonProperty("tier")
    @JsonPropertyDescription("This schema defines the type for labeling an entity with a Tag.")
    @Valid
    @NotNull
    private TagLabel tier;
    /**
     * Overwrite Metadata
     * <p>
     * Update the tier even if it is defined in the asset. By default, we will only apply the tier to assets without tier.
     * 
     */
    @JsonProperty("overwriteMetadata")
    @JsonPropertyDescription("Update the tier even if it is defined in the asset. By default, we will only apply the tier to assets without tier.")
    private Boolean overwriteMetadata = false;

    /**
     * Add Tier Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public AddTierAction.AddTierActionType getType() {
        return type;
    }

    /**
     * Add Tier Action Type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(AddTierAction.AddTierActionType type) {
        this.type = type;
    }

    public AddTierAction withType(AddTierAction.AddTierActionType type) {
        this.type = type;
        return this;
    }

    /**
     * TagLabel
     * <p>
     * This schema defines the type for labeling an entity with a Tag.
     * (Required)
     * 
     */
    @JsonProperty("tier")
    public TagLabel getTier() {
        return tier;
    }

    /**
     * TagLabel
     * <p>
     * This schema defines the type for labeling an entity with a Tag.
     * (Required)
     * 
     */
    @JsonProperty("tier")
    public void setTier(TagLabel tier) {
        this.tier = tier;
    }

    public AddTierAction withTier(TagLabel tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the tier even if it is defined in the asset. By default, we will only apply the tier to assets without tier.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public Boolean getOverwriteMetadata() {
        return overwriteMetadata;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update the tier even if it is defined in the asset. By default, we will only apply the tier to assets without tier.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public void setOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
    }

    public AddTierAction withOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AddTierAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("tier");
        sb.append('=');
        sb.append(((this.tier == null)?"<null>":this.tier));
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
        result = ((result* 31)+((this.tier == null)? 0 :this.tier.hashCode()));
        result = ((result* 31)+((this.overwriteMetadata == null)? 0 :this.overwriteMetadata.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AddTierAction) == false) {
            return false;
        }
        AddTierAction rhs = ((AddTierAction) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.tier == rhs.tier)||((this.tier!= null)&&this.tier.equals(rhs.tier))))&&((this.overwriteMetadata == rhs.overwriteMetadata)||((this.overwriteMetadata!= null)&&this.overwriteMetadata.equals(rhs.overwriteMetadata))));
    }


    /**
     * Add Tier Action Type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AddTierActionType {

        ADD_TIER_ACTION("AddTierAction");
        private final String value;
        private final static Map<String, AddTierAction.AddTierActionType> CONSTANTS = new HashMap<String, AddTierAction.AddTierActionType>();

        static {
            for (AddTierAction.AddTierActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AddTierActionType(String value) {
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
        public static AddTierAction.AddTierActionType fromValue(String value) {
            AddTierAction.AddTierActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
