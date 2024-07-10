
package org.openmetadata.schema.metadataIngestion.storage;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.GCPCredentials;


/**
 * Storage Metadata GCS Config
 * <p>
 * Storage Metadata Manifest file GCS path config.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "securityConfig",
    "prefixConfig"
})
@Generated("jsonschema2pojo")
public class StorageMetadataGCSConfig {

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("GCP credentials configs.")
    @Valid
    private GCPCredentials securityConfig;
    /**
     * Storage Metadata Bucket Details
     * <p>
     * Details of the bucket where the storage metadata manifest file is stored
     * (Required)
     * 
     */
    @JsonProperty("prefixConfig")
    @JsonPropertyDescription("Details of the bucket where the storage metadata manifest file is stored")
    @Valid
    @NotNull
    private StorageMetadataBucketDetails prefixConfig;

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    public GCPCredentials getSecurityConfig() {
        return securityConfig;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * 
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(GCPCredentials securityConfig) {
        this.securityConfig = securityConfig;
    }

    public StorageMetadataGCSConfig withSecurityConfig(GCPCredentials securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    /**
     * Storage Metadata Bucket Details
     * <p>
     * Details of the bucket where the storage metadata manifest file is stored
     * (Required)
     * 
     */
    @JsonProperty("prefixConfig")
    public StorageMetadataBucketDetails getPrefixConfig() {
        return prefixConfig;
    }

    /**
     * Storage Metadata Bucket Details
     * <p>
     * Details of the bucket where the storage metadata manifest file is stored
     * (Required)
     * 
     */
    @JsonProperty("prefixConfig")
    public void setPrefixConfig(StorageMetadataBucketDetails prefixConfig) {
        this.prefixConfig = prefixConfig;
    }

    public StorageMetadataGCSConfig withPrefixConfig(StorageMetadataBucketDetails prefixConfig) {
        this.prefixConfig = prefixConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StorageMetadataGCSConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("securityConfig");
        sb.append('=');
        sb.append(((this.securityConfig == null)?"<null>":this.securityConfig));
        sb.append(',');
        sb.append("prefixConfig");
        sb.append('=');
        sb.append(((this.prefixConfig == null)?"<null>":this.prefixConfig));
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
        result = ((result* 31)+((this.prefixConfig == null)? 0 :this.prefixConfig.hashCode()));
        result = ((result* 31)+((this.securityConfig == null)? 0 :this.securityConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StorageMetadataGCSConfig) == false) {
            return false;
        }
        StorageMetadataGCSConfig rhs = ((StorageMetadataGCSConfig) other);
        return (((this.prefixConfig == rhs.prefixConfig)||((this.prefixConfig!= null)&&this.prefixConfig.equals(rhs.prefixConfig)))&&((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig))));
    }

}
