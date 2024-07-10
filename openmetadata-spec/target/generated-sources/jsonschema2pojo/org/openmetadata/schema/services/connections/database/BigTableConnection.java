
package org.openmetadata.schema.services.connections.database;

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
 * BigTableConnection
 * <p>
 * Google BigTable Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "credentials",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsDatabase"
})
@Generated("jsonschema2pojo")
public class BigTableConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private BigTableConnection.BigtableType type = BigTableConnection.BigtableType.fromValue("BigTable");
    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    @JsonPropertyDescription("GCP credentials configs.")
    @Valid
    @NotNull
    private GCPCredentials credentials;
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
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    @JsonPropertyDescription("The source service supports the database concept in its hierarchy")
    private Boolean supportsDatabase = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public BigTableConnection.BigtableType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(BigTableConnection.BigtableType type) {
        this.type = type;
    }

    public BigTableConnection withType(BigTableConnection.BigtableType type) {
        this.type = type;
        return this;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    public GCPCredentials getCredentials() {
        return credentials;
    }

    /**
     * GCPCredentials
     * <p>
     * GCP credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("credentials")
    public void setCredentials(GCPCredentials credentials) {
        this.credentials = credentials;
    }

    public BigTableConnection withCredentials(GCPCredentials credentials) {
        this.credentials = credentials;
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

    public BigTableConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public BigTableConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public BigTableConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    public Boolean getSupportsDatabase() {
        return supportsDatabase;
    }

    /**
     * The source service supports the database concept in its hierarchy
     * 
     */
    @JsonProperty("supportsDatabase")
    public void setSupportsDatabase(Boolean supportsDatabase) {
        this.supportsDatabase = supportsDatabase;
    }

    public BigTableConnection withSupportsDatabase(Boolean supportsDatabase) {
        this.supportsDatabase = supportsDatabase;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(BigTableConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("credentials");
        sb.append('=');
        sb.append(((this.credentials == null)?"<null>":this.credentials));
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
        sb.append("supportsDatabase");
        sb.append('=');
        sb.append(((this.supportsDatabase == null)?"<null>":this.supportsDatabase));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.credentials == null)? 0 :this.credentials.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.supportsDatabase == null)? 0 :this.supportsDatabase.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BigTableConnection) == false) {
            return false;
        }
        BigTableConnection rhs = ((BigTableConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.credentials == rhs.credentials)||((this.credentials!= null)&&this.credentials.equals(rhs.credentials))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.supportsDatabase == rhs.supportsDatabase)||((this.supportsDatabase!= null)&&this.supportsDatabase.equals(rhs.supportsDatabase))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum BigtableType {

        BIG_TABLE("BigTable");
        private final String value;
        private final static Map<String, BigTableConnection.BigtableType> CONSTANTS = new HashMap<String, BigTableConnection.BigtableType>();

        static {
            for (BigTableConnection.BigtableType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        BigtableType(String value) {
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
        public static BigTableConnection.BigtableType fromValue(String value) {
            BigTableConnection.BigtableType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
