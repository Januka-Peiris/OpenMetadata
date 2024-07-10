
package org.openmetadata.schema.services.connections.dasboard.powerbi;

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
import org.openmetadata.schema.security.credentials.GCPCredentials;
import org.openmetadata.schema.services.connections.dashboard.powerbi.bucketDetails;


/**
 * GCSConfig
 * <p>
 * GCS storage config for pbit files
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pbitFileConfigType",
    "securityConfig",
    "prefixConfig",
    "pbitFilesExtractDir"
})
@Generated("jsonschema2pojo")
public class GCSConfig {

    /**
     * pbit File Configuration type
     * 
     */
    @JsonProperty("pbitFileConfigType")
    @JsonPropertyDescription("pbit File Configuration type")
    private GCSConfig.PbitFileConfigType pbitFileConfigType = GCSConfig.PbitFileConfigType.fromValue("gcs");
    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("GCP credentials configs.")
    @Valid
    @NotNull
    private GCPCredentials securityConfig;
    /**
     * Bucket Details
     * <p>
     * Details of the bucket where the .pbit files are stored
     * 
     */
    @JsonProperty("prefixConfig")
    @JsonPropertyDescription("Details of the bucket where the .pbit files are stored")
    @Valid
    private bucketDetails prefixConfig;
    /**
     * pbit Files Extraction Directory
     * <p>
     * Path of the folder where the .pbit files will be unzipped and datamodel schema will be extracted
     * 
     */
    @JsonProperty("pbitFilesExtractDir")
    @JsonPropertyDescription("Path of the folder where the .pbit files will be unzipped and datamodel schema will be extracted")
    private String pbitFilesExtractDir = "/tmp/pbitFiles";

    /**
     * pbit File Configuration type
     * 
     */
    @JsonProperty("pbitFileConfigType")
    public GCSConfig.PbitFileConfigType getPbitFileConfigType() {
        return pbitFileConfigType;
    }

    /**
     * pbit File Configuration type
     * 
     */
    @JsonProperty("pbitFileConfigType")
    public void setPbitFileConfigType(GCSConfig.PbitFileConfigType pbitFileConfigType) {
        this.pbitFileConfigType = pbitFileConfigType;
    }

    public GCSConfig withPbitFileConfigType(GCSConfig.PbitFileConfigType pbitFileConfigType) {
        this.pbitFileConfigType = pbitFileConfigType;
        return this;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
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
     * (Required)
     * 
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(GCPCredentials securityConfig) {
        this.securityConfig = securityConfig;
    }

    public GCSConfig withSecurityConfig(GCPCredentials securityConfig) {
        this.securityConfig = securityConfig;
        return this;
    }

    /**
     * Bucket Details
     * <p>
     * Details of the bucket where the .pbit files are stored
     * 
     */
    @JsonProperty("prefixConfig")
    public bucketDetails getPrefixConfig() {
        return prefixConfig;
    }

    /**
     * Bucket Details
     * <p>
     * Details of the bucket where the .pbit files are stored
     * 
     */
    @JsonProperty("prefixConfig")
    public void setPrefixConfig(bucketDetails prefixConfig) {
        this.prefixConfig = prefixConfig;
    }

    public GCSConfig withPrefixConfig(bucketDetails prefixConfig) {
        this.prefixConfig = prefixConfig;
        return this;
    }

    /**
     * pbit Files Extraction Directory
     * <p>
     * Path of the folder where the .pbit files will be unzipped and datamodel schema will be extracted
     * 
     */
    @JsonProperty("pbitFilesExtractDir")
    public String getPbitFilesExtractDir() {
        return pbitFilesExtractDir;
    }

    /**
     * pbit Files Extraction Directory
     * <p>
     * Path of the folder where the .pbit files will be unzipped and datamodel schema will be extracted
     * 
     */
    @JsonProperty("pbitFilesExtractDir")
    public void setPbitFilesExtractDir(String pbitFilesExtractDir) {
        this.pbitFilesExtractDir = pbitFilesExtractDir;
    }

    public GCSConfig withPbitFilesExtractDir(String pbitFilesExtractDir) {
        this.pbitFilesExtractDir = pbitFilesExtractDir;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCSConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("pbitFileConfigType");
        sb.append('=');
        sb.append(((this.pbitFileConfigType == null)?"<null>":this.pbitFileConfigType));
        sb.append(',');
        sb.append("securityConfig");
        sb.append('=');
        sb.append(((this.securityConfig == null)?"<null>":this.securityConfig));
        sb.append(',');
        sb.append("prefixConfig");
        sb.append('=');
        sb.append(((this.prefixConfig == null)?"<null>":this.prefixConfig));
        sb.append(',');
        sb.append("pbitFilesExtractDir");
        sb.append('=');
        sb.append(((this.pbitFilesExtractDir == null)?"<null>":this.pbitFilesExtractDir));
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
        result = ((result* 31)+((this.securityConfig == null)? 0 :this.securityConfig.hashCode()));
        result = ((result* 31)+((this.pbitFilesExtractDir == null)? 0 :this.pbitFilesExtractDir.hashCode()));
        result = ((result* 31)+((this.prefixConfig == null)? 0 :this.prefixConfig.hashCode()));
        result = ((result* 31)+((this.pbitFileConfigType == null)? 0 :this.pbitFileConfigType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GCSConfig) == false) {
            return false;
        }
        GCSConfig rhs = ((GCSConfig) other);
        return (((((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig)))&&((this.pbitFilesExtractDir == rhs.pbitFilesExtractDir)||((this.pbitFilesExtractDir!= null)&&this.pbitFilesExtractDir.equals(rhs.pbitFilesExtractDir))))&&((this.prefixConfig == rhs.prefixConfig)||((this.prefixConfig!= null)&&this.prefixConfig.equals(rhs.prefixConfig))))&&((this.pbitFileConfigType == rhs.pbitFileConfigType)||((this.pbitFileConfigType!= null)&&this.pbitFileConfigType.equals(rhs.pbitFileConfigType))));
    }


    /**
     * pbit File Configuration type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PbitFileConfigType {

        GCS("gcs");
        private final String value;
        private final static Map<String, GCSConfig.PbitFileConfigType> CONSTANTS = new HashMap<String, GCSConfig.PbitFileConfigType>();

        static {
            for (GCSConfig.PbitFileConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        PbitFileConfigType(String value) {
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
        public static GCSConfig.PbitFileConfigType fromValue(String value) {
            GCSConfig.PbitFileConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
