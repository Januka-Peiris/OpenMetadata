
package org.openmetadata.schema.entity.services.connections;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Service Connection
 * <p>
 * Groups source connection configurations.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "serviceConnection"
})
@Generated("jsonschema2pojo")
public class ServiceConnection {

    /**
     * Supported services
     * 
     */
    @JsonProperty("serviceConnection")
    @JsonPropertyDescription("Supported services")
    private Object serviceConnection;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Supported services
     * 
     */
    @JsonProperty("serviceConnection")
    public Object getServiceConnection() {
        return serviceConnection;
    }

    /**
     * Supported services
     * 
     */
    @JsonProperty("serviceConnection")
    public void setServiceConnection(Object serviceConnection) {
        this.serviceConnection = serviceConnection;
    }

    public ServiceConnection withServiceConnection(Object serviceConnection) {
        this.serviceConnection = serviceConnection;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ServiceConnection withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("serviceConnection");
        sb.append('=');
        sb.append(((this.serviceConnection == null)?"<null>":this.serviceConnection));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.serviceConnection == null)? 0 :this.serviceConnection.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceConnection) == false) {
            return false;
        }
        ServiceConnection rhs = ((ServiceConnection) other);
        return (((this.serviceConnection == rhs.serviceConnection)||((this.serviceConnection!= null)&&this.serviceConnection.equals(rhs.serviceConnection)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
