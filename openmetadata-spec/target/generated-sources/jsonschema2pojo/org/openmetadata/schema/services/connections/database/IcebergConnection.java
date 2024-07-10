
package org.openmetadata.schema.services.connections.database;

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
import org.openmetadata.schema.services.connections.database.iceberg.IcebergCatalog;


/**
 * IcebergConnection
 * <p>
 * Iceberg Catalog Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "catalog",
    "ownershipProperty",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class IcebergConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private IcebergConnection.IcebergType type = IcebergConnection.IcebergType.fromValue("Iceberg");
    /**
     * IcebergCatalog
     * <p>
     * Iceberg Catalog configuration.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    @JsonPropertyDescription("Iceberg Catalog configuration.")
    @Valid
    @NotNull
    private IcebergCatalog catalog;
    /**
     * Ownership Property
     * <p>
     * Table property to look for the Owner.
     * 
     */
    @JsonProperty("ownershipProperty")
    @JsonPropertyDescription("Table property to look for the Owner.")
    private String ownershipProperty = "owner";
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public IcebergConnection.IcebergType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(IcebergConnection.IcebergType type) {
        this.type = type;
    }

    public IcebergConnection withType(IcebergConnection.IcebergType type) {
        this.type = type;
        return this;
    }

    /**
     * IcebergCatalog
     * <p>
     * Iceberg Catalog configuration.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public IcebergCatalog getCatalog() {
        return catalog;
    }

    /**
     * IcebergCatalog
     * <p>
     * Iceberg Catalog configuration.
     * (Required)
     * 
     */
    @JsonProperty("catalog")
    public void setCatalog(IcebergCatalog catalog) {
        this.catalog = catalog;
    }

    public IcebergConnection withCatalog(IcebergCatalog catalog) {
        this.catalog = catalog;
        return this;
    }

    /**
     * Ownership Property
     * <p>
     * Table property to look for the Owner.
     * 
     */
    @JsonProperty("ownershipProperty")
    public String getOwnershipProperty() {
        return ownershipProperty;
    }

    /**
     * Ownership Property
     * <p>
     * Table property to look for the Owner.
     * 
     */
    @JsonProperty("ownershipProperty")
    public void setOwnershipProperty(String ownershipProperty) {
        this.ownershipProperty = ownershipProperty;
    }

    public IcebergConnection withOwnershipProperty(String ownershipProperty) {
        this.ownershipProperty = ownershipProperty;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public IcebergConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IcebergConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("catalog");
        sb.append('=');
        sb.append(((this.catalog == null)?"<null>":this.catalog));
        sb.append(',');
        sb.append("ownershipProperty");
        sb.append('=');
        sb.append(((this.ownershipProperty == null)?"<null>":this.ownershipProperty));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.ownershipProperty == null)? 0 :this.ownershipProperty.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.catalog == null)? 0 :this.catalog.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IcebergConnection) == false) {
            return false;
        }
        IcebergConnection rhs = ((IcebergConnection) other);
        return (((((this.ownershipProperty == rhs.ownershipProperty)||((this.ownershipProperty!= null)&&this.ownershipProperty.equals(rhs.ownershipProperty)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.catalog == rhs.catalog)||((this.catalog!= null)&&this.catalog.equals(rhs.catalog))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum IcebergType {

        ICEBERG("Iceberg");
        private final String value;
        private final static Map<String, IcebergConnection.IcebergType> CONSTANTS = new HashMap<String, IcebergConnection.IcebergType>();

        static {
            for (IcebergConnection.IcebergType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        IcebergType(String value) {
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
        public static IcebergConnection.IcebergType fromValue(String value) {
            IcebergConnection.IcebergType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
