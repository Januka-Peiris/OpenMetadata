
package org.openmetadata.schema.services.common;

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
 * SSL Config
 * <p>
 * SSL Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "certificates"
})
@Generated("jsonschema2pojo")
public class SSLConfig {

    /**
     * SSL Certificates
     * <p>
     * SSL Certificates
     * 
     */
    @JsonProperty("certificates")
    @JsonPropertyDescription("SSL Certificates")
    @Valid
    private Certificates certificates;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * SSL Certificates
     * <p>
     * SSL Certificates
     * 
     */
    @JsonProperty("certificates")
    public Certificates getCertificates() {
        return certificates;
    }

    /**
     * SSL Certificates
     * <p>
     * SSL Certificates
     * 
     */
    @JsonProperty("certificates")
    public void setCertificates(Certificates certificates) {
        this.certificates = certificates;
    }

    public SSLConfig withCertificates(Certificates certificates) {
        this.certificates = certificates;
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

    public SSLConfig withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SSLConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("certificates");
        sb.append('=');
        sb.append(((this.certificates == null)?"<null>":this.certificates));
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
        result = ((result* 31)+((this.certificates == null)? 0 :this.certificates.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SSLConfig) == false) {
            return false;
        }
        SSLConfig rhs = ((SSLConfig) other);
        return (((this.certificates == rhs.certificates)||((this.certificates!= null)&&this.certificates.equals(rhs.certificates)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
