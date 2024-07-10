
package org.openmetadata.schema.services.connections.dashboard;

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
 * MstrConnection
 * <p>
 * Mstr Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "username",
    "password",
    "hostPort",
    "projectName",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class MstrConnection {

    /**
     * Mstr service type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Mstr service type")
    private MstrConnection.MstrType type = MstrConnection.MstrType.fromValue("Mstr");
    /**
     * Username
     * <p>
     * Username to connect to MSTR. This user should have privileges to read all the metadata in MSTR.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to MSTR. This user should have privileges to read all the metadata in MSTR.")
    @NotNull
    private String username;
    /**
     * Password
     * <p>
     * Password to connect to MSTR.
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to MSTR.")
    @PasswordField
    private String password;
    /**
     * Host and Port
     * <p>
     * Host and Port of the Metabase instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and Port of the Metabase instance.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Project Name
     * <p>
     * MSTR Project Name
     * 
     */
    @JsonProperty("projectName")
    @JsonPropertyDescription("MSTR Project Name")
    private String projectName;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Mstr service type
     * 
     */
    @JsonProperty("type")
    public MstrConnection.MstrType getType() {
        return type;
    }

    /**
     * Mstr service type
     * 
     */
    @JsonProperty("type")
    public void setType(MstrConnection.MstrType type) {
        this.type = type;
    }

    public MstrConnection withType(MstrConnection.MstrType type) {
        this.type = type;
        return this;
    }

    /**
     * Username
     * <p>
     * Username to connect to MSTR. This user should have privileges to read all the metadata in MSTR.
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
     * Username to connect to MSTR. This user should have privileges to read all the metadata in MSTR.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public MstrConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password
     * <p>
     * Password to connect to MSTR.
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
     * Password to connect to MSTR.
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public MstrConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and Port of the Metabase instance.
     * (Required)
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
     * Host and Port of the Metabase instance.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public MstrConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Project Name
     * <p>
     * MSTR Project Name
     * 
     */
    @JsonProperty("projectName")
    public String getProjectName() {
        return projectName;
    }

    /**
     * Project Name
     * <p>
     * MSTR Project Name
     * 
     */
    @JsonProperty("projectName")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public MstrConnection withProjectName(String projectName) {
        this.projectName = projectName;
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

    public MstrConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MstrConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        sb.append("projectName");
        sb.append('=');
        sb.append(((this.projectName == null)?"<null>":this.projectName));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.projectName == null)? 0 :this.projectName.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MstrConnection) == false) {
            return false;
        }
        MstrConnection rhs = ((MstrConnection) other);
        return (((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.projectName == rhs.projectName)||((this.projectName!= null)&&this.projectName.equals(rhs.projectName))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Mstr service type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum MstrType {

        MSTR("Mstr");
        private final String value;
        private final static Map<String, MstrConnection.MstrType> CONSTANTS = new HashMap<String, MstrConnection.MstrType>();

        static {
            for (MstrConnection.MstrType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        MstrType(String value) {
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
        public static MstrConnection.MstrType fromValue(String value) {
            MstrConnection.MstrType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
