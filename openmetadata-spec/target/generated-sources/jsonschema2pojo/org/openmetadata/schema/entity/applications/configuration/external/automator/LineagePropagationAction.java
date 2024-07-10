
package org.openmetadata.schema.entity.applications.configuration.external.automator;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * LineagePropagationAction
 * <p>
 * Propagate description and tags via lineage
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "overwriteMetadata"
})
@Generated("jsonschema2pojo")
public class LineagePropagationAction {

    /**
     * Lineage propagation action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Lineage propagation action type.")
    @NotNull
    private LineagePropagationAction.LineagePropagationActionType type = LineagePropagationAction.LineagePropagationActionType.fromValue("LineagePropagationAction");
    /**
     * Overwrite Metadata
     * <p>
     * Update descriptions and tags via lineage even if they are already defined in the asset. By default, descriptions are only updated if they are not already defined in the asset, and incoming tags are merged with the existing ones.
     * 
     */
    @JsonProperty("overwriteMetadata")
    @JsonPropertyDescription("Update descriptions and tags via lineage even if they are already defined in the asset. By default, descriptions are only updated if they are not already defined in the asset, and incoming tags are merged with the existing ones.")
    private Boolean overwriteMetadata = false;

    /**
     * Lineage propagation action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public LineagePropagationAction.LineagePropagationActionType getType() {
        return type;
    }

    /**
     * Lineage propagation action type.
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(LineagePropagationAction.LineagePropagationActionType type) {
        this.type = type;
    }

    public LineagePropagationAction withType(LineagePropagationAction.LineagePropagationActionType type) {
        this.type = type;
        return this;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update descriptions and tags via lineage even if they are already defined in the asset. By default, descriptions are only updated if they are not already defined in the asset, and incoming tags are merged with the existing ones.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public Boolean getOverwriteMetadata() {
        return overwriteMetadata;
    }

    /**
     * Overwrite Metadata
     * <p>
     * Update descriptions and tags via lineage even if they are already defined in the asset. By default, descriptions are only updated if they are not already defined in the asset, and incoming tags are merged with the existing ones.
     * 
     */
    @JsonProperty("overwriteMetadata")
    public void setOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
    }

    public LineagePropagationAction withOverwriteMetadata(Boolean overwriteMetadata) {
        this.overwriteMetadata = overwriteMetadata;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineagePropagationAction.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineagePropagationAction) == false) {
            return false;
        }
        LineagePropagationAction rhs = ((LineagePropagationAction) other);
        return (((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.overwriteMetadata == rhs.overwriteMetadata)||((this.overwriteMetadata!= null)&&this.overwriteMetadata.equals(rhs.overwriteMetadata))));
    }


    /**
     * Lineage propagation action type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum LineagePropagationActionType {

        LINEAGE_PROPAGATION_ACTION("LineagePropagationAction");
        private final String value;
        private final static Map<String, LineagePropagationAction.LineagePropagationActionType> CONSTANTS = new HashMap<String, LineagePropagationAction.LineagePropagationActionType>();

        static {
            for (LineagePropagationAction.LineagePropagationActionType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        LineagePropagationActionType(String value) {
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
        public static LineagePropagationAction.LineagePropagationActionType fromValue(String value) {
            LineagePropagationAction.LineagePropagationActionType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
