
package org.openmetadata.schema.services.connections.database.deltalake;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MetastoreConfig
 * <p>
 * Deltalake Metastore configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "connection",
    "appName"
})
@Generated("jsonschema2pojo")
public class MetastoreConfig {

    /**
     * Connection
     * <p>
     * Metastore connection configuration, depending on your metastore type.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Metastore connection configuration, depending on your metastore type.")
    @NotNull
    private Object connection;
    /**
     * Application Name
     * <p>
     * pySpark App Name.
     * 
     */
    @JsonProperty("appName")
    @JsonPropertyDescription("pySpark App Name.")
    private String appName = "OpenMetadata";

    /**
     * Connection
     * <p>
     * Metastore connection configuration, depending on your metastore type.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * Connection
     * <p>
     * Metastore connection configuration, depending on your metastore type.
     * (Required)
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public MetastoreConfig withConnection(Object connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Application Name
     * <p>
     * pySpark App Name.
     * 
     */
    @JsonProperty("appName")
    public String getAppName() {
        return appName;
    }

    /**
     * Application Name
     * <p>
     * pySpark App Name.
     * 
     */
    @JsonProperty("appName")
    public void setAppName(String appName) {
        this.appName = appName;
    }

    public MetastoreConfig withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetastoreConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("appName");
        sb.append('=');
        sb.append(((this.appName == null)?"<null>":this.appName));
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
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.appName == null)? 0 :this.appName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetastoreConfig) == false) {
            return false;
        }
        MetastoreConfig rhs = ((MetastoreConfig) other);
        return (((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection)))&&((this.appName == rhs.appName)||((this.appName!= null)&&this.appName.equals(rhs.appName))));
    }

}
