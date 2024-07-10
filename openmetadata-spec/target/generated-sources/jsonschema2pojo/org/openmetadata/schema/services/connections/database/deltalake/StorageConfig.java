
package org.openmetadata.schema.services.connections.database.deltalake;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StorageConfig
 * <p>
 * DeltaLake Storage Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connection",
    "bucketName",
    "prefix"
})
@Generated("jsonschema2pojo")
public class StorageConfig {

    /**
     * DeltaLake Storage Configuration Source
     * <p>
     * Available sources to fetch files.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Available sources to fetch files.")
    @NotNull
    private Object connection;
    /**
     * Bucket Name
     * <p>
     * Bucket Name of the data source.
     * 
     */
    @JsonProperty("bucketName")
    @JsonPropertyDescription("Bucket Name of the data source.")
    private String bucketName = "";
    /**
     * Prefix
     * <p>
     * Prefix of the data source.
     * 
     */
    @JsonProperty("prefix")
    @JsonPropertyDescription("Prefix of the data source.")
    private String prefix = "";

    /**
     * DeltaLake Storage Configuration Source
     * <p>
     * Available sources to fetch files.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * DeltaLake Storage Configuration Source
     * <p>
     * Available sources to fetch files.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public StorageConfig withConnection(Object connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Bucket Name
     * <p>
     * Bucket Name of the data source.
     * 
     */
    @JsonProperty("bucketName")
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Bucket Name
     * <p>
     * Bucket Name of the data source.
     * 
     */
    @JsonProperty("bucketName")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public StorageConfig withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Prefix
     * <p>
     * Prefix of the data source.
     * 
     */
    @JsonProperty("prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * Prefix
     * <p>
     * Prefix of the data source.
     * 
     */
    @JsonProperty("prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public StorageConfig withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("bucketName");
        sb.append('=');
        sb.append(((this.bucketName == null)?"<null>":this.bucketName));
        sb.append(',');
        sb.append("prefix");
        sb.append('=');
        sb.append(((this.prefix == null)?"<null>":this.prefix));
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
        result = ((result* 31)+((this.bucketName == null)? 0 :this.bucketName.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.prefix == null)? 0 :this.prefix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageConfig) == false) {
            return false;
        }
        StorageConfig rhs = ((StorageConfig) other);
        return ((((this.bucketName == rhs.bucketName)||((this.bucketName!= null)&&this.bucketName.equals(rhs.bucketName)))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.prefix == rhs.prefix)||((this.prefix!= null)&&this.prefix.equals(rhs.prefix))));
    }

}
