
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
 * TeradataConnection
 * <p>
 * Teradata Database Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "scheme",
    "username",
    "password",
    "logmech",
    "logdata",
    "hostPort",
    "tmode",
    "account",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction",
    "supportsProfiler",
    "supportsQueryComment",
    "sampleDataStorageConfig"
})
@Generated("jsonschema2pojo")
public class TeradataConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private TeradataConnection.TeradataType type = TeradataConnection.TeradataType.fromValue("Teradata");
    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    @JsonPropertyDescription("SQLAlchemy driver scheme options.")
    private TeradataConnection.TeradataScheme scheme = TeradataConnection.TeradataScheme.fromValue("teradatasql");
    /**
     * Username
     * <p>
     * Username to connect to Teradata. This user should have privileges to read all the metadata in Teradata.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to Teradata. This user should have privileges to read all the metadata in Teradata.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to Teradata.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to Teradata.")
    @PasswordField
    private String password;
    /**
     * LOGMECH
     * <p>
     * Specifies the logon authentication method. Possible values are TD2 (the default), JWT, LDAP, KRB5 for Kerberos, or TDNEGO
     * 
     */
    @JsonProperty("logmech")
    @JsonPropertyDescription("Specifies the logon authentication method. Possible values are TD2 (the default), JWT, LDAP, KRB5 for Kerberos, or TDNEGO")
    private TeradataConnection.Logmech logmech = TeradataConnection.Logmech.fromValue("TD2");
    /**
     * Extra data for the chosen logon authentication method (LOGDATA)
     * <p>
     * Specifies additional data needed by a logon mechanism, such as a secure token, Distinguished Name, or a domain/realm name. LOGDATA values are specific to each logon mechanism.
     * 
     */
    @JsonProperty("logdata")
    @JsonPropertyDescription("Specifies additional data needed by a logon mechanism, such as a secure token, Distinguished Name, or a domain/realm name. LOGDATA values are specific to each logon mechanism.")
    private String logdata;
    /**
     * Host and Port
     * <p>
     * Host and port of the Teradata service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Teradata service.")
    @NotNull
    private String hostPort;
    /**
     * Transaction mode
     * <p>
     * Specifies the transaction mode for the connection
     * 
     */
    @JsonProperty("tmode")
    @JsonPropertyDescription("Specifies the transaction mode for the connection")
    private TeradataConnection.Tmode tmode = TeradataConnection.Tmode.fromValue("DEFAULT");
    /**
     * Teradata Database account
     * <p>
     * Specifies an account string to override the default account string defined for the database user. Accounts are used by the database for workload management and resource usage monitoring.
     * 
     */
    @JsonProperty("account")
    @JsonPropertyDescription("Specifies an account string to override the default account string defined for the database user. Accounts are used by the database for workload management and resource usage monitoring.")
    private String account;
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
     * Supports Profiler
     * 
     */
    @JsonProperty("supportsProfiler")
    @JsonPropertyDescription("Supports Profiler")
    private Boolean supportsProfiler = true;
    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    @JsonPropertyDescription("For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.")
    private Boolean supportsQueryComment = true;
    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    @JsonPropertyDescription("Storage config to store sample data")
    @Valid
    private SampleDataStorageConfig sampleDataStorageConfig;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public TeradataConnection.TeradataType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(TeradataConnection.TeradataType type) {
        this.type = type;
    }

    public TeradataConnection withType(TeradataConnection.TeradataType type) {
        this.type = type;
        return this;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public TeradataConnection.TeradataScheme getScheme() {
        return scheme;
    }

    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @JsonProperty("scheme")
    public void setScheme(TeradataConnection.TeradataScheme scheme) {
        this.scheme = scheme;
    }

    public TeradataConnection withScheme(TeradataConnection.TeradataScheme scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to Teradata. This user should have privileges to read all the metadata in Teradata.
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
     * Username to connect to Teradata. This user should have privileges to read all the metadata in Teradata.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public TeradataConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to Teradata.
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
     * Password to connect to Teradata.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public TeradataConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * LOGMECH
     * <p>
     * Specifies the logon authentication method. Possible values are TD2 (the default), JWT, LDAP, KRB5 for Kerberos, or TDNEGO
     * 
     */
    @JsonProperty("logmech")
    public TeradataConnection.Logmech getLogmech() {
        return logmech;
    }

    /**
     * LOGMECH
     * <p>
     * Specifies the logon authentication method. Possible values are TD2 (the default), JWT, LDAP, KRB5 for Kerberos, or TDNEGO
     * 
     */
    @JsonProperty("logmech")
    public void setLogmech(TeradataConnection.Logmech logmech) {
        this.logmech = logmech;
    }

    public TeradataConnection withLogmech(TeradataConnection.Logmech logmech) {
        this.logmech = logmech;
        return this;
    }

    /**
     * Extra data for the chosen logon authentication method (LOGDATA)
     * <p>
     * Specifies additional data needed by a logon mechanism, such as a secure token, Distinguished Name, or a domain/realm name. LOGDATA values are specific to each logon mechanism.
     * 
     */
    @JsonProperty("logdata")
    public String getLogdata() {
        return logdata;
    }

    /**
     * Extra data for the chosen logon authentication method (LOGDATA)
     * <p>
     * Specifies additional data needed by a logon mechanism, such as a secure token, Distinguished Name, or a domain/realm name. LOGDATA values are specific to each logon mechanism.
     * 
     */
    @JsonProperty("logdata")
    public void setLogdata(String logdata) {
        this.logdata = logdata;
    }

    public TeradataConnection withLogdata(String logdata) {
        this.logdata = logdata;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Teradata service.
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
     * Host and port of the Teradata service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    public void setHostPort(String hostPort) {
        this.hostPort = hostPort;
    }

    public TeradataConnection withHostPort(String hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Transaction mode
     * <p>
     * Specifies the transaction mode for the connection
     * 
     */
    @JsonProperty("tmode")
    public TeradataConnection.Tmode getTmode() {
        return tmode;
    }

    /**
     * Transaction mode
     * <p>
     * Specifies the transaction mode for the connection
     * 
     */
    @JsonProperty("tmode")
    public void setTmode(TeradataConnection.Tmode tmode) {
        this.tmode = tmode;
    }

    public TeradataConnection withTmode(TeradataConnection.Tmode tmode) {
        this.tmode = tmode;
        return this;
    }

    /**
     * Teradata Database account
     * <p>
     * Specifies an account string to override the default account string defined for the database user. Accounts are used by the database for workload management and resource usage monitoring.
     * 
     */
    @JsonProperty("account")
    public String getAccount() {
        return account;
    }

    /**
     * Teradata Database account
     * <p>
     * Specifies an account string to override the default account string defined for the database user. Accounts are used by the database for workload management and resource usage monitoring.
     * 
     */
    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    public TeradataConnection withAccount(String account) {
        this.account = account;
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

    public TeradataConnection withConnectionOptions(ConnectionOptions connectionOptions) {
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

    public TeradataConnection withConnectionArguments(ConnectionArguments connectionArguments) {
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

    public TeradataConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
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

    public TeradataConnection withSupportsProfiler(Boolean supportsProfiler) {
        this.supportsProfiler = supportsProfiler;
        return this;
    }

    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    public Boolean getSupportsQueryComment() {
        return supportsQueryComment;
    }

    /**
     * For Database Services using SQLAlchemy, True to enable running a comment for all queries run from OpenMetadata.
     * 
     */
    @JsonProperty("supportsQueryComment")
    public void setSupportsQueryComment(Boolean supportsQueryComment) {
        this.supportsQueryComment = supportsQueryComment;
    }

    public TeradataConnection withSupportsQueryComment(Boolean supportsQueryComment) {
        this.supportsQueryComment = supportsQueryComment;
        return this;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public SampleDataStorageConfig getSampleDataStorageConfig() {
        return sampleDataStorageConfig;
    }

    /**
     * Storage config to store sample data
     * 
     */
    @JsonProperty("sampleDataStorageConfig")
    public void setSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
    }

    public TeradataConnection withSampleDataStorageConfig(SampleDataStorageConfig sampleDataStorageConfig) {
        this.sampleDataStorageConfig = sampleDataStorageConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TeradataConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("logmech");
        sb.append('=');
        sb.append(((this.logmech == null)?"<null>":this.logmech));
        sb.append(',');
        sb.append("logdata");
        sb.append('=');
        sb.append(((this.logdata == null)?"<null>":this.logdata));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("tmode");
        sb.append('=');
        sb.append(((this.tmode == null)?"<null>":this.tmode));
        sb.append(',');
        sb.append("account");
        sb.append('=');
        sb.append(((this.account == null)?"<null>":this.account));
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
        sb.append("supportsProfiler");
        sb.append('=');
        sb.append(((this.supportsProfiler == null)?"<null>":this.supportsProfiler));
        sb.append(',');
        sb.append("supportsQueryComment");
        sb.append('=');
        sb.append(((this.supportsQueryComment == null)?"<null>":this.supportsQueryComment));
        sb.append(',');
        sb.append("sampleDataStorageConfig");
        sb.append('=');
        sb.append(((this.sampleDataStorageConfig == null)?"<null>":this.sampleDataStorageConfig));
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
        result = ((result* 31)+((this.tmode == null)? 0 :this.tmode.hashCode()));
        result = ((result* 31)+((this.scheme == null)? 0 :this.scheme.hashCode()));
        result = ((result* 31)+((this.supportsProfiler == null)? 0 :this.supportsProfiler.hashCode()));
        result = ((result* 31)+((this.logmech == null)? 0 :this.logmech.hashCode()));
        result = ((result* 31)+((this.sampleDataStorageConfig == null)? 0 :this.sampleDataStorageConfig.hashCode()));
        result = ((result* 31)+((this.logdata == null)? 0 :this.logdata.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.supportsQueryComment == null)? 0 :this.supportsQueryComment.hashCode()));
        result = ((result* 31)+((this.account == null)? 0 :this.account.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeradataConnection) == false) {
            return false;
        }
        TeradataConnection rhs = ((TeradataConnection) other);
        return ((((((((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.tmode == rhs.tmode)||((this.tmode!= null)&&this.tmode.equals(rhs.tmode))))&&((this.scheme == rhs.scheme)||((this.scheme!= null)&&this.scheme.equals(rhs.scheme))))&&((this.supportsProfiler == rhs.supportsProfiler)||((this.supportsProfiler!= null)&&this.supportsProfiler.equals(rhs.supportsProfiler))))&&((this.logmech == rhs.logmech)||((this.logmech!= null)&&this.logmech.equals(rhs.logmech))))&&((this.sampleDataStorageConfig == rhs.sampleDataStorageConfig)||((this.sampleDataStorageConfig!= null)&&this.sampleDataStorageConfig.equals(rhs.sampleDataStorageConfig))))&&((this.logdata == rhs.logdata)||((this.logdata!= null)&&this.logdata.equals(rhs.logdata))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.supportsQueryComment == rhs.supportsQueryComment)||((this.supportsQueryComment!= null)&&this.supportsQueryComment.equals(rhs.supportsQueryComment))))&&((this.account == rhs.account)||((this.account!= null)&&this.account.equals(rhs.account))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * LOGMECH
     * <p>
     * Specifies the logon authentication method. Possible values are TD2 (the default), JWT, LDAP, KRB5 for Kerberos, or TDNEGO
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Logmech {

        TD_2("TD2"),
        JWT("JWT"),
        KRB_5("KRB5"),
        CUSTOM("CUSTOM"),
        TDNEGO("TDNEGO");
        private final String value;
        private final static Map<String, TeradataConnection.Logmech> CONSTANTS = new HashMap<String, TeradataConnection.Logmech>();

        static {
            for (TeradataConnection.Logmech c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Logmech(String value) {
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
        public static TeradataConnection.Logmech fromValue(String value) {
            TeradataConnection.Logmech constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * SQLAlchemy driver scheme options.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TeradataScheme {

        TERADATASQL("teradatasql");
        private final String value;
        private final static Map<String, TeradataConnection.TeradataScheme> CONSTANTS = new HashMap<String, TeradataConnection.TeradataScheme>();

        static {
            for (TeradataConnection.TeradataScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TeradataScheme(String value) {
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
        public static TeradataConnection.TeradataScheme fromValue(String value) {
            TeradataConnection.TeradataScheme constant = CONSTANTS.get(value);
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
    public enum TeradataType {

        TERADATA("Teradata");
        private final String value;
        private final static Map<String, TeradataConnection.TeradataType> CONSTANTS = new HashMap<String, TeradataConnection.TeradataType>();

        static {
            for (TeradataConnection.TeradataType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TeradataType(String value) {
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
        public static TeradataConnection.TeradataType fromValue(String value) {
            TeradataConnection.TeradataType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }


    /**
     * Transaction mode
     * <p>
     * Specifies the transaction mode for the connection
     * 
     */
    @Generated("jsonschema2pojo")
    public enum Tmode {

        ANSI("ANSI"),
        TERA("TERA"),
        DEFAULT("DEFAULT");
        private final String value;
        private final static Map<String, TeradataConnection.Tmode> CONSTANTS = new HashMap<String, TeradataConnection.Tmode>();

        static {
            for (TeradataConnection.Tmode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        Tmode(String value) {
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
        public static TeradataConnection.Tmode fromValue(String value) {
            TeradataConnection.Tmode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
