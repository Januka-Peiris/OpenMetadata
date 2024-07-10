
package org.openmetadata.schema.services.connections.dashboard.powerbi;

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
import org.openmetadata.schema.security.credentials.AWSCredentials;


/**
 * S3Config
 * <p>
 * S3 storage config for pbit files
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
public class S3Config {

    /**
     * pbit File Configuration type
     * 
     */
    @JsonProperty("pbitFileConfigType")
    @JsonPropertyDescription("pbit File Configuration type")
    private S3Config.PbitFileConfigType pbitFileConfigType = S3Config.PbitFileConfigType.fromValue("s3");
    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("securityConfig")
    @JsonPropertyDescription("AWS credentials configs.")
    @Valid
    @NotNull
    private AWSCredentials securityConfig;
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
    public S3Config.PbitFileConfigType getPbitFileConfigType() {
        return pbitFileConfigType;
    }

    /**
     * pbit File Configuration type
     * 
     */
    @JsonProperty("pbitFileConfigType")
    public void setPbitFileConfigType(S3Config.PbitFileConfigType pbitFileConfigType) {
        this.pbitFileConfigType = pbitFileConfigType;
    }

    public S3Config withPbitFileConfigType(S3Config.PbitFileConfigType pbitFileConfigType) {
        this.pbitFileConfigType = pbitFileConfigType;
        return this;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("securityConfig")
    public AWSCredentials getSecurityConfig() {
        return securityConfig;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("securityConfig")
    public void setSecurityConfig(AWSCredentials securityConfig) {
        this.securityConfig = securityConfig;
    }

    public S3Config withSecurityConfig(AWSCredentials securityConfig) {
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

    public S3Config withPrefixConfig(bucketDetails prefixConfig) {
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

    public S3Config withPbitFilesExtractDir(String pbitFilesExtractDir) {
        this.pbitFilesExtractDir = pbitFilesExtractDir;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(S3Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof S3Config) == false) {
            return false;
        }
        S3Config rhs = ((S3Config) other);
        return (((((this.securityConfig == rhs.securityConfig)||((this.securityConfig!= null)&&this.securityConfig.equals(rhs.securityConfig)))&&((this.pbitFilesExtractDir == rhs.pbitFilesExtractDir)||((this.pbitFilesExtractDir!= null)&&this.pbitFilesExtractDir.equals(rhs.pbitFilesExtractDir))))&&((this.prefixConfig == rhs.prefixConfig)||((this.prefixConfig!= null)&&this.prefixConfig.equals(rhs.prefixConfig))))&&((this.pbitFileConfigType == rhs.pbitFileConfigType)||((this.pbitFileConfigType!= null)&&this.pbitFileConfigType.equals(rhs.pbitFileConfigType))));
    }


    /**
     * pbit File Configuration type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum PbitFileConfigType {

        S_3("s3");
        private final String value;
        private final static Map<String, S3Config.PbitFileConfigType> CONSTANTS = new HashMap<String, S3Config.PbitFileConfigType>();

        static {
            for (S3Config.PbitFileConfigType c: values()) {
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
        public static S3Config.PbitFileConfigType fromValue(String value) {
            S3Config.PbitFileConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
