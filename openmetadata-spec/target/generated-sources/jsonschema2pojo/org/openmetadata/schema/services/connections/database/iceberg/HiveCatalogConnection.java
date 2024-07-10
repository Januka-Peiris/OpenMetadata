
package org.openmetadata.schema.services.connections.database.iceberg;

import java.net.URI;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * HiveCatalogConnection
 * <p>
 * Iceberg Hive Catalog configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uri",
    "fileSystem"
})
@Generated("jsonschema2pojo")
public class HiveCatalogConnection {

    /**
     * URI
     * <p>
     * Uri to the Hive Metastore. Example: 'thrift://localhost:9083'
     * (Required)
     * 
     */
    @JsonProperty("uri")
    @JsonPropertyDescription("Uri to the Hive Metastore. Example: 'thrift://localhost:9083'")
    @NotNull
    private URI uri;
    /**
     * IcebergFileSystem
     * <p>
     * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
     * 
     */
    @JsonProperty("fileSystem")
    @JsonPropertyDescription("Iceberg File System configuration, based on where the Iceberg Warehouse is located.")
    @Valid
    private IcebergFileSystem fileSystem;

    /**
     * URI
     * <p>
     * Uri to the Hive Metastore. Example: 'thrift://localhost:9083'
     * (Required)
     * 
     */
    @JsonProperty("uri")
    public URI getUri() {
        return uri;
    }

    /**
     * URI
     * <p>
     * Uri to the Hive Metastore. Example: 'thrift://localhost:9083'
     * (Required)
     * 
     */
    @JsonProperty("uri")
    public void setUri(URI uri) {
        this.uri = uri;
    }

    public HiveCatalogConnection withUri(URI uri) {
        this.uri = uri;
        return this;
    }

    /**
     * IcebergFileSystem
     * <p>
     * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
     * 
     */
    @JsonProperty("fileSystem")
    public IcebergFileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * IcebergFileSystem
     * <p>
     * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
     * 
     */
    @JsonProperty("fileSystem")
    public void setFileSystem(IcebergFileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public HiveCatalogConnection withFileSystem(IcebergFileSystem fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HiveCatalogConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("fileSystem");
        sb.append('=');
        sb.append(((this.fileSystem == null)?"<null>":this.fileSystem));
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
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.fileSystem == null)? 0 :this.fileSystem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HiveCatalogConnection) == false) {
            return false;
        }
        HiveCatalogConnection rhs = ((HiveCatalogConnection) other);
        return (((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri)))&&((this.fileSystem == rhs.fileSystem)||((this.fileSystem!= null)&&this.fileSystem.equals(rhs.fileSystem))));
    }

}
