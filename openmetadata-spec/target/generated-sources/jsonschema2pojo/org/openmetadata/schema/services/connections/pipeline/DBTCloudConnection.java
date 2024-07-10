
package org.openmetadata.schema.services.connections.pipeline;

import java.net.URI;
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
import org.openmetadata.annotations.ExposedField;
import org.openmetadata.annotations.PasswordField;


/**
 * DBTCloudConnection
 * <p>
 * DBTCloud Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "host",
    "discoveryAPI",
    "accountId",
    "jobId",
    "token"
})
@Generated("jsonschema2pojo")
public class DBTCloudConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private DBTCloudConnection.DBTCloudType type = DBTCloudConnection.DBTCloudType.fromValue("DBTCloud");
    /**
     * Host
     * <p>
     * DBT cloud Access URL.
     * (Required)
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("DBT cloud Access URL.")
    @ExposedField
    @NotNull
    private URI host;
    /**
     * Discovery API URL
     * <p>
     * DBT cloud Metadata API URL.
     * (Required)
     * 
     */
    @JsonProperty("discoveryAPI")
    @JsonPropertyDescription("DBT cloud Metadata API URL.")
    @ExposedField
    @NotNull
    private URI discoveryAPI;
    /**
     * Account Id
     * <p>
     * ID of your DBT cloud account
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    @JsonPropertyDescription("ID of your DBT cloud account")
    @NotNull
    private String accountId;
    /**
     * Job Id
     * <p>
     * ID of your DBT cloud job
     * 
     */
    @JsonProperty("jobId")
    @JsonPropertyDescription("ID of your DBT cloud job")
    private String jobId = null;
    /**
     * Token
     * <p>
     * Generated Token to connect to DBTCloud.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Generated Token to connect to DBTCloud.")
    @PasswordField
    @NotNull
    private String token;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public DBTCloudConnection.DBTCloudType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(DBTCloudConnection.DBTCloudType type) {
        this.type = type;
    }

    public DBTCloudConnection withType(DBTCloudConnection.DBTCloudType type) {
        this.type = type;
        return this;
    }

    /**
     * Host
     * <p>
     * DBT cloud Access URL.
     * (Required)
     * 
     */
    @JsonProperty("host")
    @ExposedField
    public URI getHost() {
        return host;
    }

    /**
     * Host
     * <p>
     * DBT cloud Access URL.
     * (Required)
     * 
     */
    @JsonProperty("host")
    @ExposedField
    public void setHost(URI host) {
        this.host = host;
    }

    public DBTCloudConnection withHost(URI host) {
        this.host = host;
        return this;
    }

    /**
     * Discovery API URL
     * <p>
     * DBT cloud Metadata API URL.
     * (Required)
     * 
     */
    @JsonProperty("discoveryAPI")
    @ExposedField
    public URI getDiscoveryAPI() {
        return discoveryAPI;
    }

    /**
     * Discovery API URL
     * <p>
     * DBT cloud Metadata API URL.
     * (Required)
     * 
     */
    @JsonProperty("discoveryAPI")
    @ExposedField
    public void setDiscoveryAPI(URI discoveryAPI) {
        this.discoveryAPI = discoveryAPI;
    }

    public DBTCloudConnection withDiscoveryAPI(URI discoveryAPI) {
        this.discoveryAPI = discoveryAPI;
        return this;
    }

    /**
     * Account Id
     * <p>
     * ID of your DBT cloud account
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    public String getAccountId() {
        return accountId;
    }

    /**
     * Account Id
     * <p>
     * ID of your DBT cloud account
     * (Required)
     * 
     */
    @JsonProperty("accountId")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public DBTCloudConnection withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Job Id
     * <p>
     * ID of your DBT cloud job
     * 
     */
    @JsonProperty("jobId")
    public String getJobId() {
        return jobId;
    }

    /**
     * Job Id
     * <p>
     * ID of your DBT cloud job
     * 
     */
    @JsonProperty("jobId")
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public DBTCloudConnection withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to DBTCloud.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * Token
     * <p>
     * Generated Token to connect to DBTCloud.
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public DBTCloudConnection withToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DBTCloudConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("discoveryAPI");
        sb.append('=');
        sb.append(((this.discoveryAPI == null)?"<null>":this.discoveryAPI));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("jobId");
        sb.append('=');
        sb.append(((this.jobId == null)?"<null>":this.jobId));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
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
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.jobId == null)? 0 :this.jobId.hashCode()));
        result = ((result* 31)+((this.discoveryAPI == null)? 0 :this.discoveryAPI.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBTCloudConnection) == false) {
            return false;
        }
        DBTCloudConnection rhs = ((DBTCloudConnection) other);
        return (((((((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.jobId == rhs.jobId)||((this.jobId!= null)&&this.jobId.equals(rhs.jobId))))&&((this.discoveryAPI == rhs.discoveryAPI)||((this.discoveryAPI!= null)&&this.discoveryAPI.equals(rhs.discoveryAPI))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DBTCloudType {

        DBT_CLOUD("DBTCloud");
        private final String value;
        private final static Map<String, DBTCloudConnection.DBTCloudType> CONSTANTS = new HashMap<String, DBTCloudConnection.DBTCloudType>();

        static {
            for (DBTCloudConnection.DBTCloudType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DBTCloudType(String value) {
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
        public static DBTCloudConnection.DBTCloudType fromValue(String value) {
            DBTCloudConnection.DBTCloudType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
