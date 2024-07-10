
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
import org.openmetadata.annotations.PasswordField;


/**
 * MongoDBConnection
 * <p>
 * MongoDB Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "username",
    "password",
    "hostPort",
    "connectionOptions",
    "databaseName",
    "supportsMetadataExtraction",
    "supportsProfiler"
})
@Generated("jsonschema2pojo")
public class MongoDBConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private MongoDBConnection.MongoDBType type = MongoDBConnection.MongoDBType.fromValue("MongoDB");
    /**
     * Mongo connection scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("Mongo connection scheme options.")
    private MongoDBConnection.MongoDBScheme scheme = MongoDBConnection.MongoDBScheme.fromValue("mongodb");
    /**
     * Username
     * <p>
     * Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.")
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to MongoDB.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to MongoDB.")
    @PasswordField
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and port of the MongoDB service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the MongoDB service.")
    @NotNull
    private String hostPort;
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;
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
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;
    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    @JsonPropertyDescription("Supports Profiler")
    private Boolean supportsProfiler = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public MongoDBConnection.MongoDBType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(MongoDBConnection.MongoDBType type) {
        this.type = type;
    }

    public MongoDBConnection withType(MongoDBConnection.MongoDBType type) {
        this.type = type;
        return this;
    }

    /**
     * Mongo connection scheme options.
     * 
     */
    @JsonProperty("scheme")
    public MongoDBConnection.MongoDBScheme getScheme() {
        return scheme;
    }

    /**
     * Mongo connection scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(MongoDBConnection.MongoDBScheme scheme) {
        this.scheme = scheme;
    }

    public MongoDBConnection withScheme(MongoDBConnection.MongoDBScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to MongoDB. This user should have privileges to read all the metadata in MongoDB.
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public MongoDBConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to MongoDB.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password
     * <p>
     * Password to connect to MongoDB.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public MongoDBConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the MongoDB service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public String getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the MongoDB service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public MongoDBConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
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

    public MongoDBConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
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

    public MongoDBConnection withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
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

    public MongoDBConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    public Boolean getSupportsProfiler() {
        return supportsProfiler;
    }

    /**
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    public void setSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
    }

    public MongoDBConnection withSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MongoDBConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("scheme");
        sb.append('=');
        sb.append(((this.scheme == null)?"<null>":this.scheme));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
        sb.append(',');
        sb.append("databaseName");
        sb.append('=');
        sb.append(((this.databaseName == null)?"<null>":this.databaseName));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
        sb.append(',');
        sb.append("supportsProfiler");
        sb.append('=');
        sb.append(((this.supportsProfiler == null)?"<null>":this.supportsProfiler));
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
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.databaseName == null)? 0 :this.databaseName.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MongoDBConnection) == false) {
            return false;
        }
        MongoDBConnection rhs = ((MongoDBConnection) other);
        return ((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.databaseName == rhs.databaseName)||((this.databaseName!= null)&&this.databaseName.equals(rhs.databaseName))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Mongo connection scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MongoDBScheme {

        MONGODB("mongodb"),
        MONGODB_SRV("mongodb+srv");
        private final String value;
        private final static Map<String, MongoDBConnection.MongoDBScheme> CONSTANTS = new HashMap<String, MongoDBConnection.MongoDBScheme>();

        static {
            for (MongoDBConnection.MongoDBScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MongoDBScheme(String value) {
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
        public static MongoDBConnection.MongoDBScheme fromValue(String value) {
            MongoDBConnection.MongoDBScheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MongoDBType {

        MONGO_DB("MongoDB");
        private final String value;
        private final static Map<String, MongoDBConnection.MongoDBType> CONSTANTS = new HashMap<String, MongoDBConnection.MongoDBType>();

        static {
            for (MongoDBConnection.MongoDBType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MongoDBType(String value) {
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
        public static MongoDBConnection.MongoDBType fromValue(String value) {
            MongoDBConnection.MongoDBType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
