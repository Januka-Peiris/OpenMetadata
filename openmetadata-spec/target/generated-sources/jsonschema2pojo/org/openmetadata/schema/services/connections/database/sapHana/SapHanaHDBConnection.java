
package org.openmetadata.schema.services.connections.database.sapHana;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SapHanaHDBConnection
 * <p>
 * Sap Hana Database HDB User Store Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "userKey"
})
@Generated("jsonschema2pojo")
public class SapHanaHDBConnection {

    /**
     * User Key
     * <p>
     * HDB Store User Key generated from the command `hdbuserstore SET <KEY> <host:port> <USERNAME> <PASSWORD>`
     * 
     */
    @JsonProperty("userKey")
    @JsonPropertyDescription("HDB Store User Key generated from the command `hdbuserstore SET <KEY> <host:port> <USERNAME> <PASSWORD>`")
    private String userKey;

    /**
     * User Key
     * <p>
     * HDB Store User Key generated from the command `hdbuserstore SET <KEY> <host:port> <USERNAME> <PASSWORD>`
     * 
     */
    @JsonProperty("userKey")
    public String getUserKey() {
        return userKey;
    }

    /**
     * User Key
     * <p>
     * HDB Store User Key generated from the command `hdbuserstore SET <KEY> <host:port> <USERNAME> <PASSWORD>`
     * 
     */
    @JsonProperty("userKey")
    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public SapHanaHDBConnection withUserKey(String userKey) {
        this.userKey = userKey;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SapHanaHDBConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("userKey");
        sb.append('=');
        sb.append(((this.userKey == null)?"<null>":this.userKey));
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
        result = ((result* 31)+((this.userKey == null)? 0 :this.userKey.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SapHanaHDBConnection) == false) {
            return false;
        }
        SapHanaHDBConnection rhs = ((SapHanaHDBConnection) other);
        return ((this.userKey == rhs.userKey)||((this.userKey!= null)&&this.userKey.equals(rhs.userKey)));
    }

}
