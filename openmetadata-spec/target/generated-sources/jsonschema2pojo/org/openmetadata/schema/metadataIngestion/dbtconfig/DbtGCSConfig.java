
package org.openmetadata.schema.metadataIngestion.dbtconfig;

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


/**
 * DBT GCS Config
 * <p>
 * DBT Catalog, Manifest and Run Results files in GCS storage. We will search for catalog.json, manifest.json and run_results.json.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtConfigType",
    "dbtSecurityConfig",
    "dbtPrefixConfig"
})
@Generated("jsonschema2pojo")
public class DbtGCSConfig {

    /**
     * dbt Configuration type
     * (Required)
     * 
     */
    @JsonProperty("dbtConfigType")
    @JsonPropertyDescription("dbt Configuration type")
    @NotNull
    private DbtGCSConfig.DbtConfigType dbtConfigType = DbtGCSConfig.DbtConfigType.fromValue("gcs");
    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("dbtSecurityConfig")
    @JsonPropertyDescription("GCP credentials configs.")
    @Valid
    @NotNull
    private GCPCredentials dbtSecurityConfig;
    /**
     * DBT Prefix Config
     * <p>
     * Details of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtPrefixConfig")
    @JsonPropertyDescription("Details of the bucket where the dbt files are stored")
    @Valid
    private DbtPrefixConfig__1 dbtPrefixConfig;

    /**
     * dbt Configuration type
     * (Required)
     * 
     */
    @JsonProperty("dbtConfigType")
    public DbtGCSConfig.DbtConfigType getDbtConfigType() {
        return dbtConfigType;
    }

    /**
     * dbt Configuration type
     * (Required)
     * 
     */
    @JsonProperty("dbtConfigType")
    public void setDbtConfigType(DbtGCSConfig.DbtConfigType dbtConfigType) {
        this.dbtConfigType = dbtConfigType;
    }

    public DbtGCSConfig withDbtConfigType(DbtGCSConfig.DbtConfigType dbtConfigType) {
        this.dbtConfigType = dbtConfigType;
        return this;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("dbtSecurityConfig")
    public GCPCredentials getDbtSecurityConfig() {
        return dbtSecurityConfig;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("dbtSecurityConfig")
    public void setDbtSecurityConfig(GCPCredentials dbtSecurityConfig) {
        this.dbtSecurityConfig = dbtSecurityConfig;
    }

    public DbtGCSConfig withDbtSecurityConfig(GCPCredentials dbtSecurityConfig) {
        this.dbtSecurityConfig = dbtSecurityConfig;
        return this;
    }

    /**
     * DBT Prefix Config
     * <p>
     * Details of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtPrefixConfig")
    public DbtPrefixConfig__1 getDbtPrefixConfig() {
        return dbtPrefixConfig;
    }

    /**
     * DBT Prefix Config
     * <p>
     * Details of the bucket where the dbt files are stored
     * 
     */
    @JsonProperty("dbtPrefixConfig")
    public void setDbtPrefixConfig(DbtPrefixConfig__1 dbtPrefixConfig) {
        this.dbtPrefixConfig = dbtPrefixConfig;
    }

    public DbtGCSConfig withDbtPrefixConfig(DbtPrefixConfig__1 dbtPrefixConfig) {
        this.dbtPrefixConfig = dbtPrefixConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtGCSConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtConfigType");
        sb.append('=');
        sb.append(((this.dbtConfigType == null)?"<null>":this.dbtConfigType));
        sb.append(',');
        sb.append("dbtSecurityConfig");
        sb.append('=');
        sb.append(((this.dbtSecurityConfig == null)?"<null>":this.dbtSecurityConfig));
        sb.append(',');
        sb.append("dbtPrefixConfig");
        sb.append('=');
        sb.append(((this.dbtPrefixConfig == null)?"<null>":this.dbtPrefixConfig));
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
        result = ((result* 31)+((this.dbtConfigType == null)? 0 :this.dbtConfigType.hashCode()));
        result = ((result* 31)+((this.dbtSecurityConfig == null)? 0 :this.dbtSecurityConfig.hashCode()));
        result = ((result* 31)+((this.dbtPrefixConfig == null)? 0 :this.dbtPrefixConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtGCSConfig) == false) {
            return false;
        }
        DbtGCSConfig rhs = ((DbtGCSConfig) other);
        return ((((this.dbtConfigType == rhs.dbtConfigType)||((this.dbtConfigType!= null)&&this.dbtConfigType.equals(rhs.dbtConfigType)))&&((this.dbtSecurityConfig == rhs.dbtSecurityConfig)||((this.dbtSecurityConfig!= null)&&this.dbtSecurityConfig.equals(rhs.dbtSecurityConfig))))&&((this.dbtPrefixConfig == rhs.dbtPrefixConfig)||((this.dbtPrefixConfig!= null)&&this.dbtPrefixConfig.equals(rhs.dbtPrefixConfig))));
    }


    /**
     * dbt Configuration type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DbtConfigType {

        GCS("gcs");
        private final String value;
        private final static Map<String, DbtGCSConfig.DbtConfigType> CONSTANTS = new HashMap<String, DbtGCSConfig.DbtConfigType>();

        static {
            for (DbtGCSConfig.DbtConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DbtConfigType(String value) {
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
        public static DbtGCSConfig.DbtConfigType fromValue(String value) {
            DbtGCSConfig.DbtConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
