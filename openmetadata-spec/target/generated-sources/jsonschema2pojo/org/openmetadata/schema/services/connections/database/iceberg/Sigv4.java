
package org.openmetadata.schema.services.connections.database.iceberg;

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
 * Sigv4
 * <p>
 * Sign requests to the REST Server using AWS SigV4 protocol.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "signingRegion",
    "signingName"
})
@Generated("jsonschema2pojo")
public class Sigv4 {

    /**
     * Signing AWS Region
     * <p>
     * AWS Region to use when SigV4 signs a request.
     * 
     */
    @JsonProperty("signingRegion")
    @JsonPropertyDescription("AWS Region to use when SigV4 signs a request.")
    private String signingRegion;
    /**
     * Signing Name
     * <p>
     * The service signing name to use when SigV4 signs a request.
     * 
     */
    @JsonProperty("signingName")
    @JsonPropertyDescription("The service signing name to use when SigV4 signs a request.")
    private String signingName;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Signing AWS Region
     * <p>
     * AWS Region to use when SigV4 signs a request.
     * 
     */
    @JsonProperty("signingRegion")
    public String getSigningRegion() {
        return signingRegion;
    }

    /**
     * Signing AWS Region
     * <p>
     * AWS Region to use when SigV4 signs a request.
     * 
     */
    @JsonProperty("signingRegion")
    public void setSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
    }

    public Sigv4 withSigningRegion(String signingRegion) {
        this.signingRegion = signingRegion;
        return this;
    }

    /**
     * Signing Name
     * <p>
     * The service signing name to use when SigV4 signs a request.
     * 
     */
    @JsonProperty("signingName")
    public String getSigningName() {
        return signingName;
    }

    /**
     * Signing Name
     * <p>
     * The service signing name to use when SigV4 signs a request.
     * 
     */
    @JsonProperty("signingName")
    public void setSigningName(String signingName) {
        this.signingName = signingName;
    }

    public Sigv4 withSigningName(String signingName) {
        this.signingName = signingName;
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

    public Sigv4 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sigv4 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("signingRegion");
        sb.append('=');
        sb.append(((this.signingRegion == null)?"<null>":this.signingRegion));
        sb.append(',');
        sb.append("signingName");
        sb.append('=');
        sb.append(((this.signingName == null)?"<null>":this.signingName));
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
        result = ((result* 31)+((this.signingRegion == null)? 0 :this.signingRegion.hashCode()));
        result = ((result* 31)+((this.signingName == null)? 0 :this.signingName.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sigv4) == false) {
            return false;
        }
        Sigv4 rhs = ((Sigv4) other);
        return ((((this.signingRegion == rhs.signingRegion)||((this.signingRegion!= null)&&this.signingRegion.equals(rhs.signingRegion)))&&((this.signingName == rhs.signingName)||((this.signingName!= null)&&this.signingName.equals(rhs.signingName))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
