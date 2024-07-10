
package org.openmetadata.schema.services.connections.database.iceberg;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * IcebergCatalog
 * <p>
 * Iceberg Catalog configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "connection",
    "databaseName",
    "warehouseLocation"
})
@Generated("jsonschema2pojo")
public class IcebergCatalog {

    /**
     * Name
     * <p>
     * Catalog Name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Catalog Name.")
    @NotNull
    private String name;
    /**
     * Connection
     * <p>
     * Catalog connection configuration, depending on your catalog type.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Catalog connection configuration, depending on your catalog type.")
    @NotNull
    private Object connection;
    /**
     * Database Name
     * <p>
     * Custom Database Name for your Iceberg Service. If not set it will be 'default'.
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Custom Database Name for your Iceberg Service. If not set it will be 'default'.")
    private String databaseName;
    /**
     * Warehouse Location
     * <p>
     * Warehouse Location. Used to specify a custom warehouse location if needed.
     * 
     */
    @JsonProperty("warehouseLocation")
    @JsonPropertyDescription("Warehouse Location. Used to specify a custom warehouse location if needed.")
    private String warehouseLocation;

    /**
     * Name
     * <p>
     * Catalog Name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Catalog Name.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public IcebergCatalog withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Connection
     * <p>
     * Catalog connection configuration, depending on your catalog type.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * Connection
     * <p>
     * Catalog connection configuration, depending on your catalog type.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public IcebergCatalog withConnection(Object connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Database Name
     * <p>
     * Custom Database Name for your Iceberg Service. If not set it will be 'default'.
     * 
     */
    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database Name
     * <p>
     * Custom Database Name for your Iceberg Service. If not set it will be 'default'.
     * 
     */
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public IcebergCatalog withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Warehouse Location
     * <p>
     * Warehouse Location. Used to specify a custom warehouse location if needed.
     * 
     */
    @JsonProperty("warehouseLocation")
    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    /**
     * Warehouse Location
     * <p>
     * Warehouse Location. Used to specify a custom warehouse location if needed.
     * 
     */
    @JsonProperty("warehouseLocation")
    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    public IcebergCatalog withWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IcebergCatalog.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("warehouseLocation");
        sb.append('=');
        sb.append(((this.warehouseLocation == null)?"<null>":this.warehouseLocation));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.warehouseLocation == null)? 0 :this.warehouseLocation.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IcebergCatalog) == false) {
            return false;
        }
        IcebergCatalog rhs = ((IcebergCatalog) other);
        return (((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.warehouseLocation == rhs.warehouseLocation)||((this.warehouseLocation!= null)&&this.warehouseLocation.equals(rhs.warehouseLocation))));
    }

}
