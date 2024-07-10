
package org.openmetadata.schema.services.connections.dashboard.powerbi;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Bucket Details
 * <p>
 * Details of the bucket where the .pbit files are stored
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "bucketName",
    "objectPrefix"
})
@Generated("jsonschema2pojo")
public class bucketDetails {

    /**
     * Bucket Name
     * <p>
     * Name of the bucket where the .pbit files are stored
     * 
     */
    @JsonProperty("bucketName")
    @JsonPropertyDescription("Name of the bucket where the .pbit files are stored")
    private String bucketName;
    /**
     * Object Prefix
     * <p>
     * Path of the folder where the .pbit files are stored
     * 
     */
    @JsonProperty("objectPrefix")
    @JsonPropertyDescription("Path of the folder where the .pbit files are stored")
    private String objectPrefix;

    /**
     * Bucket Name
     * <p>
     * Name of the bucket where the .pbit files are stored
     * 
     */
    @JsonProperty("bucketName")
    public String getBucketName() {
        return bucketName;
    }

    /**
     * Bucket Name
     * <p>
     * Name of the bucket where the .pbit files are stored
     * 
     */
    @JsonProperty("bucketName")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public bucketDetails withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Object Prefix
     * <p>
     * Path of the folder where the .pbit files are stored
     * 
     */
    @JsonProperty("objectPrefix")
    public String getObjectPrefix() {
        return objectPrefix;
    }

    /**
     * Object Prefix
     * <p>
     * Path of the folder where the .pbit files are stored
     * 
     */
    @JsonProperty("objectPrefix")
    public void setObjectPrefix(String objectPrefix) {
        this.objectPrefix = objectPrefix;
    }

    public bucketDetails withObjectPrefix(String objectPrefix) {
        this.objectPrefix = objectPrefix;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bucketDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bucketName");
        sb.append('=');
        sb.append(((this.bucketName == null)?"<null>":this.bucketName));
        sb.append(',');
        sb.append("objectPrefix");
        sb.append('=');
        sb.append(((this.objectPrefix == null)?"<null>":this.objectPrefix));
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
        result = ((result* 31)+((this.objectPrefix == null)? 0 :this.objectPrefix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof bucketDetails) == false) {
            return false;
        }
        bucketDetails rhs = ((bucketDetails) other);
        return (((this.bucketName == rhs.bucketName)||((this.bucketName!= null)&&this.bucketName.equals(rhs.bucketName)))&&((this.objectPrefix == rhs.objectPrefix)||((this.objectPrefix!= null)&&this.objectPrefix.equals(rhs.objectPrefix))));
    }

}
