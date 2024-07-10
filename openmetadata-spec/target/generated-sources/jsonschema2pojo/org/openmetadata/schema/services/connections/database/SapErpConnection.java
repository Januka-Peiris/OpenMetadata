
package org.openmetadata.schema.services.connections.database;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.ExposedField;
import org.openmetadata.annotations.PasswordField;


/**
 * SapErpConnection
 * <p>
 * Sap ERP Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "apiKey",
    "databaseName",
    "databaseSchema",
    "paginationLimit",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class SapErpConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private SapErpConnection.SapErpType type = SapErpConnection.SapErpType.fromValue("SapErp");
    /**
     * Host and Port
     * <p>
     * Host and Port of the SAP ERP instance.
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and Port of the SAP ERP instance.")
    @ExposedField
    private URI hostPort;
    /**
     * API Key
     * <p>
     * API key to authenticate with the SAP ERP APIs.
     * 
     */
    @JsonProperty("apiKey")
    @JsonPropertyDescription("API key to authenticate with the SAP ERP APIs.")
    @PasswordField
    private String apiKey;
    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    @JsonPropertyDescription("Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.")
    private String databaseName;
    /**
     * Database Schema
     * <p>
     * Optional name to give to the schema in OpenMetadata. If left blank, we will use default as the schema name
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("Optional name to give to the schema in OpenMetadata. If left blank, we will use default as the schema name")
    private String databaseSchema;
    /**
     * Pagination Limit
     * <p>
     * Pagination limit used while querying the SAP ERP API for fetching the entities
     * 
     */
    @JsonProperty("paginationLimit")
    @JsonPropertyDescription("Pagination limit used while querying the SAP ERP API for fetching the entities")
    private Integer paginationLimit = 10;
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;
    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    @JsonPropertyDescription("Additional connection arguments such as security or protocol configs that can be sent to service during connection.")
    @Valid
    private ConnectionArguments connectionArguments;
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
    public SapErpConnection.SapErpType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(SapErpConnection.SapErpType type) {
        this.type = type;
    }

    public SapErpConnection withType(SapErpConnection.SapErpType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and Port of the SAP ERP instance.
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and Port of the SAP ERP instance.
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public SapErpConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * API Key
     * <p>
     * API key to authenticate with the SAP ERP APIs.
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public String getApiKey() {
        return apiKey;
    }

    /**
     * API Key
     * <p>
     * API key to authenticate with the SAP ERP APIs.
     * 
     */
    @JsonProperty("apiKey")
    @PasswordField
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public SapErpConnection withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Database Name
     * <p>
     * Optional name to give to the database in OpenMetadata. If left blank, we will use default as the database name.
     * 
     */
    @JsonProperty("databaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public SapErpConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Database Schema
     * <p>
     * Optional name to give to the schema in OpenMetadata. If left blank, we will use default as the schema name
     * 
     */
    @JsonProperty("databaseSchema")
    public String getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * Database Schema
     * <p>
     * Optional name to give to the schema in OpenMetadata. If left blank, we will use default as the schema name
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public SapErpConnection withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * Pagination Limit
     * <p>
     * Pagination limit used while querying the SAP ERP API for fetching the entities
     * 
     */
    @JsonProperty("paginationLimit")
    public Integer getPaginationLimit() {
        return paginationLimit;
    }

    /**
     * Pagination Limit
     * <p>
     * Pagination limit used while querying the SAP ERP API for fetching the entities
     * 
     */
    @JsonProperty("paginationLimit")
    public void setPaginationLimit(Integer paginationLimit) {
        this.paginationLimit = paginationLimit;
    }

    public SapErpConnection withPaginationLimit(Integer paginationLimit) {
        this.paginationLimit = paginationLimit;
        return this;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public ConnectionOptions getConnectionOptions() {
        return connectionOptions;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public void setConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public SapErpConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
        return this;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public ConnectionArguments getConnectionArguments() {
        return connectionArguments;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public void setConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
    }

    public SapErpConnection withConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
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

    public SapErpConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SapErpConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("apiKey");
        sb.append('=');
        sb.append(((this.apiKey == null)?"<null>":this.apiKey));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("paginationLimit");
        sb.append('=');
        sb.append(((this.paginationLimit == null)?"<null>":this.paginationLimit));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
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
        result = ((result* 31)+((this.databaseSchema == null)? 0 :this.databaseSchema.hashCode()));
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.apiKey == null)? 0 :this.apiKey.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.paginationLimit == null)? 0 :this.paginationLimit.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SapErpConnection) == false) {
            return false;
        }
        SapErpConnection rhs = ((SapErpConnection) other);
        return ((((((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction))))&&((this.apiKey == rhs.apiKey)||((this.apiKey!= null)&&this.apiKey.equals(rhs.apiKey))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.paginationLimit == rhs.paginationLimit)||((this.paginationLimit!= null)&&this.paginationLimit.equals(rhs.paginationLimit))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SapErpType {

        SAP_ERP("SapErp");
        private final String value;
        private final static Map<String, SapErpConnection.SapErpType> CONSTANTS = new HashMap<String, SapErpConnection.SapErpType>();

        static {
            for (SapErpConnection.SapErpType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SapErpType(String value) {
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
        public static SapErpConnection.SapErpType fromValue(String value) {
            SapErpConnection.SapErpType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
