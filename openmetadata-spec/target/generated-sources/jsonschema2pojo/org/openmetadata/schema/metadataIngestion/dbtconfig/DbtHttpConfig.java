
package org.openmetadata.schema.metadataIngestion.dbtconfig;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DBT HTTP Config
 * <p>
 * DBT Catalog, Manifest and Run Results HTTP path configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbtConfigType",
    "dbtCatalogHttpPath",
    "dbtManifestHttpPath",
    "dbtRunResultsHttpPath"
})
@Generated("jsonschema2pojo")
public class DbtHttpConfig {

    /**
     * dbt Configuration type
     * (Required)
     * 
     */
    @JsonProperty("dbtConfigType")
    @JsonPropertyDescription("dbt Configuration type")
    @NotNull
    private DbtHttpConfig.DbtConfigType dbtConfigType = DbtHttpConfig.DbtConfigType.fromValue("http");
    /**
     * DBT Catalog HTTP File Path
     * <p>
     * DBT catalog http file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogHttpPath")
    @JsonPropertyDescription("DBT catalog http file path to extract dbt models with their column schemas.")
    private String dbtCatalogHttpPath;
    /**
     * DBT Manifest HTTP File Path
     * <p>
     * DBT manifest http file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestHttpPath")
    @JsonPropertyDescription("DBT manifest http file path to extract dbt models and associate with tables.")
    @NotNull
    private String dbtManifestHttpPath;
    /**
     * DBT Run Results HTTP File Path
     * <p>
     * DBT run results http file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsHttpPath")
    @JsonPropertyDescription("DBT run results http file path to extract the test results information.")
    private String dbtRunResultsHttpPath;

    /**
     * dbt Configuration type
     * (Required)
     * 
     */
    @JsonProperty("dbtConfigType")
    public DbtHttpConfig.DbtConfigType getDbtConfigType() {
        return dbtConfigType;
    }

    /**
     * dbt Configuration type
     * (Required)
     * 
     */
    @JsonProperty("dbtConfigType")
    public void setDbtConfigType(DbtHttpConfig.DbtConfigType dbtConfigType) {
        this.dbtConfigType = dbtConfigType;
    }

    public DbtHttpConfig withDbtConfigType(DbtHttpConfig.DbtConfigType dbtConfigType) {
        this.dbtConfigType = dbtConfigType;
        return this;
    }

    /**
     * DBT Catalog HTTP File Path
     * <p>
     * DBT catalog http file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogHttpPath")
    public String getDbtCatalogHttpPath() {
        return dbtCatalogHttpPath;
    }

    /**
     * DBT Catalog HTTP File Path
     * <p>
     * DBT catalog http file path to extract dbt models with their column schemas.
     * 
     */
    @JsonProperty("dbtCatalogHttpPath")
    public void setDbtCatalogHttpPath(String dbtCatalogHttpPath) {
        this.dbtCatalogHttpPath = dbtCatalogHttpPath;
    }

    public DbtHttpConfig withDbtCatalogHttpPath(String dbtCatalogHttpPath) {
        this.dbtCatalogHttpPath = dbtCatalogHttpPath;
        return this;
    }

    /**
     * DBT Manifest HTTP File Path
     * <p>
     * DBT manifest http file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestHttpPath")
    public String getDbtManifestHttpPath() {
        return dbtManifestHttpPath;
    }

    /**
     * DBT Manifest HTTP File Path
     * <p>
     * DBT manifest http file path to extract dbt models and associate with tables.
     * (Required)
     * 
     */
    @JsonProperty("dbtManifestHttpPath")
    public void setDbtManifestHttpPath(String dbtManifestHttpPath) {
        this.dbtManifestHttpPath = dbtManifestHttpPath;
    }

    public DbtHttpConfig withDbtManifestHttpPath(String dbtManifestHttpPath) {
        this.dbtManifestHttpPath = dbtManifestHttpPath;
        return this;
    }

    /**
     * DBT Run Results HTTP File Path
     * <p>
     * DBT run results http file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsHttpPath")
    public String getDbtRunResultsHttpPath() {
        return dbtRunResultsHttpPath;
    }

    /**
     * DBT Run Results HTTP File Path
     * <p>
     * DBT run results http file path to extract the test results information.
     * 
     */
    @JsonProperty("dbtRunResultsHttpPath")
    public void setDbtRunResultsHttpPath(String dbtRunResultsHttpPath) {
        this.dbtRunResultsHttpPath = dbtRunResultsHttpPath;
    }

    public DbtHttpConfig withDbtRunResultsHttpPath(String dbtRunResultsHttpPath) {
        this.dbtRunResultsHttpPath = dbtRunResultsHttpPath;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DbtHttpConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbtConfigType");
        sb.append('=');
        sb.append(((this.dbtConfigType == null)?"<null>":this.dbtConfigType));
        sb.append(',');
        sb.append("dbtCatalogHttpPath");
        sb.append('=');
        sb.append(((this.dbtCatalogHttpPath == null)?"<null>":this.dbtCatalogHttpPath));
        sb.append(',');
        sb.append("dbtManifestHttpPath");
        sb.append('=');
        sb.append(((this.dbtManifestHttpPath == null)?"<null>":this.dbtManifestHttpPath));
        sb.append(',');
        sb.append("dbtRunResultsHttpPath");
        sb.append('=');
        sb.append(((this.dbtRunResultsHttpPath == null)?"<null>":this.dbtRunResultsHttpPath));
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
        result = ((result* 31)+((this.dbtManifestHttpPath == null)? 0 :this.dbtManifestHttpPath.hashCode()));
        result = ((result* 31)+((this.dbtCatalogHttpPath == null)? 0 :this.dbtCatalogHttpPath.hashCode()));
        result = ((result* 31)+((this.dbtRunResultsHttpPath == null)? 0 :this.dbtRunResultsHttpPath.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DbtHttpConfig) == false) {
            return false;
        }
        DbtHttpConfig rhs = ((DbtHttpConfig) other);
        return (((((this.dbtConfigType == rhs.dbtConfigType)||((this.dbtConfigType!= null)&&this.dbtConfigType.equals(rhs.dbtConfigType)))&&((this.dbtManifestHttpPath == rhs.dbtManifestHttpPath)||((this.dbtManifestHttpPath!= null)&&this.dbtManifestHttpPath.equals(rhs.dbtManifestHttpPath))))&&((this.dbtCatalogHttpPath == rhs.dbtCatalogHttpPath)||((this.dbtCatalogHttpPath!= null)&&this.dbtCatalogHttpPath.equals(rhs.dbtCatalogHttpPath))))&&((this.dbtRunResultsHttpPath == rhs.dbtRunResultsHttpPath)||((this.dbtRunResultsHttpPath!= null)&&this.dbtRunResultsHttpPath.equals(rhs.dbtRunResultsHttpPath))));
    }


    /**
     * dbt Configuration type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DbtConfigType {

        HTTP("http");
        private final String value;
        private final static Map<String, DbtHttpConfig.DbtConfigType> CONSTANTS = new HashMap<String, DbtHttpConfig.DbtConfigType>();

        static {
            for (DbtHttpConfig.DbtConfigType c: values()) {
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
        public static DbtHttpConfig.DbtConfigType fromValue(String value) {
            DbtHttpConfig.DbtConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
