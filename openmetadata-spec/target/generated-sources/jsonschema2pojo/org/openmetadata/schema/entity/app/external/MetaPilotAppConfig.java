
package org.openmetadata.schema.entity.app.external;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.type.EntityReference;


/**
 * MetaPilotAppConfig
 * <p>
 * Configuration for the MetaPilot External Application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "descriptionDatabases",
    "defaultScope"
})
@Generated("jsonschema2pojo")
public class MetaPilotAppConfig {

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Application type.")
    private MetaPilotAppConfig.MetaPilotAppType type = MetaPilotAppConfig.MetaPilotAppType.fromValue("MetaPilot");
    /**
     * Databases for Automated Description Generation
     * <p>
     * Services and Databases configured to get the descriptions from.
     * 
     */
    @JsonProperty("descriptionDatabases")
    @JsonPropertyDescription("Services and Databases configured to get the descriptions from.")
    @Valid
    private List<EntityReference> descriptionDatabases = new ArrayList<EntityReference>();
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("defaultScope")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference defaultScope;

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    public MetaPilotAppConfig.MetaPilotAppType getType() {
        return type;
    }

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    public void setType(MetaPilotAppConfig.MetaPilotAppType type) {
        this.type = type;
    }

    public MetaPilotAppConfig withType(MetaPilotAppConfig.MetaPilotAppType type) {
        this.type = type;
        return this;
    }

    /**
     * Databases for Automated Description Generation
     * <p>
     * Services and Databases configured to get the descriptions from.
     * 
     */
    @JsonProperty("descriptionDatabases")
    public List<EntityReference> getDescriptionDatabases() {
        return descriptionDatabases;
    }

    /**
     * Databases for Automated Description Generation
     * <p>
     * Services and Databases configured to get the descriptions from.
     * 
     */
    @JsonProperty("descriptionDatabases")
    public void setDescriptionDatabases(List<EntityReference> descriptionDatabases) {
        this.descriptionDatabases = descriptionDatabases;
    }

    public MetaPilotAppConfig withDescriptionDatabases(List<EntityReference> descriptionDatabases) {
        this.descriptionDatabases = descriptionDatabases;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("defaultScope")
    public EntityReference getDefaultScope() {
        return defaultScope;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("defaultScope")
    public void setDefaultScope(EntityReference defaultScope) {
        this.defaultScope = defaultScope;
    }

    public MetaPilotAppConfig withDefaultScope(EntityReference defaultScope) {
        this.defaultScope = defaultScope;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetaPilotAppConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("descriptionDatabases");
        sb.append('=');
        sb.append(((this.descriptionDatabases == null)?"<null>":this.descriptionDatabases));
        sb.append(',');
        sb.append("defaultScope");
        sb.append('=');
        sb.append(((this.defaultScope == null)?"<null>":this.defaultScope));
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
        result = ((result* 31)+((this.descriptionDatabases == null)? 0 :this.descriptionDatabases.hashCode()));
        result = ((result* 31)+((this.defaultScope == null)? 0 :this.defaultScope.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaPilotAppConfig) == false) {
            return false;
        }
        MetaPilotAppConfig rhs = ((MetaPilotAppConfig) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.descriptionDatabases == rhs.descriptionDatabases)||((this.descriptionDatabases!= null)&&this.descriptionDatabases.equals(rhs.descriptionDatabases))))&&((this.defaultScope == rhs.defaultScope)||((this.defaultScope!= null)&&this.defaultScope.equals(rhs.defaultScope))));
    }


    /**
     * Application type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MetaPilotAppType {

        META_PILOT("MetaPilot");
        private final String value;
        private final static Map<String, MetaPilotAppConfig.MetaPilotAppType> CONSTANTS = new HashMap<String, MetaPilotAppConfig.MetaPilotAppType>();

        static {
            for (MetaPilotAppConfig.MetaPilotAppType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MetaPilotAppType(String value) {
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
        public static MetaPilotAppConfig.MetaPilotAppType fromValue(String value) {
            MetaPilotAppConfig.MetaPilotAppType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
