
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * APISchema
 * <p>
 * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "schemaType",
    "schemaFields"
})
@Generated("jsonschema2pojo")
public class APISchema {

    /**
     * Schema type used for the message.
     * 
     */
    @JsonProperty("schemaType")
    @JsonPropertyDescription("Schema type used for the message.")
    private SchemaType schemaType;
    /**
     * Columns in this schema.
     * 
     */
    @JsonProperty("schemaFields")
    @JsonPropertyDescription("Columns in this schema.")
    @Valid
    private List<Field> schemaFields = new ArrayList<Field>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Schema type used for the message.
     * 
     */
    @JsonProperty("schemaType")
    public SchemaType getSchemaType() {
        return schemaType;
    }

    /**
     * Schema type used for the message.
     * 
     */
    @JsonProperty("schemaType")
    public void setSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
    }

    public APISchema withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * Columns in this schema.
     * 
     */
    @JsonProperty("schemaFields")
    public List<Field> getSchemaFields() {
        return schemaFields;
    }

    /**
     * Columns in this schema.
     * 
     */
    @JsonProperty("schemaFields")
    public void setSchemaFields(List<Field> schemaFields) {
        this.schemaFields = schemaFields;
    }

    public APISchema withSchemaFields(List<Field> schemaFields) {
        this.schemaFields = schemaFields;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public APISchema withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(APISchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("schemaType");
        sb.append('=');
        sb.append(((this.schemaType == null)?"<null>":this.schemaType));
        sb.append(',');
        sb.append("schemaFields");
        sb.append('=');
        sb.append(((this.schemaFields == null)?"<null>":this.schemaFields));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.schemaType == null)? 0 :this.schemaType.hashCode()));
        result = ((result* 31)+((this.schemaFields == null)? 0 :this.schemaFields.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof APISchema) == false) {
            return false;
        }
        APISchema rhs = ((APISchema) other);
        return ((((this.schemaType == rhs.schemaType)||((this.schemaType!= null)&&this.schemaType.equals(rhs.schemaType)))&&((this.schemaFields == rhs.schemaFields)||((this.schemaFields!= null)&&this.schemaFields.equals(rhs.schemaFields))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
