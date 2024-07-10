
package org.openmetadata.schema.services.connections.database.sapHana;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * SapHanaSQLConnection
 * <p>
 * Sap Hana Database SQL Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "hostPort",
    "username",
    "password",
    "databaseSchema",
    "database"
})
@Generated("jsonschema2pojo")
public class SapHanaSQLConnection {

    /**
     * Host and Port
     * <p>
     * Host and port of the Hana service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Hana service.")
    @NotNull
    private String hostPort;
    /**
     * Username
     * <p>
     * Username to connect to Hana. This user should have privileges to read all the metadata.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Hana. This user should have privileges to read all the metadata.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to Hana.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to Hana.")
    @PasswordField
    @NotNull
    private String password;
    /**
     * Database Schema
     * <p>
     * Database Schema of the data source. This is an optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.
     * 
     */
    @JsonProperty("databaseSchema")
    @JsonPropertyDescription("Database Schema of the data source. This is an optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.")
    private String databaseSchema;
    /**
     * Database
     * <p>
     * Database of the data source.
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("Database of the data source.")
    private String database;

    /**
     * Host and Port
     * <p>
     * Host and port of the Hana service.
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
     * Host and port of the Hana service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public SapHanaSQLConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Hana. This user should have privileges to read all the metadata.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username
     * <p>
     * Username to connect to Hana. This user should have privileges to read all the metadata.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public SapHanaSQLConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to Hana.
     * (Required)
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
     * Password to connect to Hana.
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public SapHanaSQLConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Database Schema
     * <p>
     * Database Schema of the data source. This is an optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.
     * 
     */
    @JsonProperty("databaseSchema")
    public String getDatabaseSchema() {
        return databaseSchema;
    }

    /**
     * Database Schema
     * <p>
     * Database Schema of the data source. This is an optional parameter, if you would like to restrict the metadata reading to a single schema. When left blank, OpenMetadata Ingestion attempts to scan all the schemas.
     * 
     */
    @JsonProperty("databaseSchema")
    public void setDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
    }

    public SapHanaSQLConnection withDatabaseSchema(String databaseSchema) {
        this.databaseSchema = databaseSchema;
        return this;
    }

    /**
     * Database
     * <p>
     * Database of the data source.
     * 
     */
    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    /**
     * Database
     * <p>
     * Database of the data source.
     * 
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public SapHanaSQLConnection withDatabase(String database) {
        this.database = database;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SapHanaSQLConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("databaseSchema");
        sb.append('=');
        sb.append(((this.databaseSchema == null)?"<null>":this.databaseSchema));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
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
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SapHanaSQLConnection) == false) {
            return false;
        }
        SapHanaSQLConnection rhs = ((SapHanaSQLConnection) other);
        return ((((((this.databaseSchema == rhs.databaseSchema)||((this.databaseSchema!= null)&&this.databaseSchema.equals(rhs.databaseSchema)))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
