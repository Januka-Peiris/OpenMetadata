
package org.openmetadata.schema.security.credentials;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * GCP External Account
 * <p>
 * Pass the raw credential values provided by GCP
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "externalType",
    "audience",
    "subjectTokenType",
    "tokenURL",
    "credentialSource"
})
@Generated("jsonschema2pojo")
public class GCPExternalAccount {

    /**
     * Credentials Type
     * <p>
     * Google Cloud Platform account type.
     * 
     */
    @JsonProperty("externalType")
    @JsonPropertyDescription("Google Cloud Platform account type.")
    private String externalType = "external_account";
    /**
     * Audience
     * <p>
     * Google Security Token Service audience which contains the resource name for the workload identity pool and the provider identifier in that pool.
     * 
     */
    @JsonProperty("audience")
    @JsonPropertyDescription("Google Security Token Service audience which contains the resource name for the workload identity pool and the provider identifier in that pool.")
    private String audience;
    /**
     * Subject Token Type
     * <p>
     * Google Security Token Service subject token type based on the OAuth 2.0 token exchange spec.
     * 
     */
    @JsonProperty("subjectTokenType")
    @JsonPropertyDescription("Google Security Token Service subject token type based on the OAuth 2.0 token exchange spec.")
    private String subjectTokenType;
    /**
     * Token URL
     * <p>
     * Google Security Token Service token exchange endpoint.
     * 
     */
    @JsonProperty("tokenURL")
    @JsonPropertyDescription("Google Security Token Service token exchange endpoint.")
    private String tokenURL;
    /**
     * Credential Source
     * <p>
     * This object defines the mechanism used to retrieve the external credential from the local environment so that it can be exchanged for a GCP access token via the STS endpoint
     * 
     */
    @JsonProperty("credentialSource")
    @JsonPropertyDescription("This object defines the mechanism used to retrieve the external credential from the local environment so that it can be exchanged for a GCP access token via the STS endpoint")
    @Valid
    private org.openmetadata.schema.security.credentials.credentialSource credentialSource;

    /**
     * Credentials Type
     * <p>
     * Google Cloud Platform account type.
     * 
     */
    @JsonProperty("externalType")
    public String getExternalType() {
        return externalType;
    }

    /**
     * Credentials Type
     * <p>
     * Google Cloud Platform account type.
     * 
     */
    @JsonProperty("externalType")
    public void setExternalType(String externalType) {
        this.externalType = externalType;
    }

    public GCPExternalAccount withExternalType(String externalType) {
        this.externalType = externalType;
        return this;
    }

    /**
     * Audience
     * <p>
     * Google Security Token Service audience which contains the resource name for the workload identity pool and the provider identifier in that pool.
     * 
     */
    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    /**
     * Audience
     * <p>
     * Google Security Token Service audience which contains the resource name for the workload identity pool and the provider identifier in that pool.
     * 
     */
    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
    }

    public GCPExternalAccount withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * Subject Token Type
     * <p>
     * Google Security Token Service subject token type based on the OAuth 2.0 token exchange spec.
     * 
     */
    @JsonProperty("subjectTokenType")
    public String getSubjectTokenType() {
        return subjectTokenType;
    }

    /**
     * Subject Token Type
     * <p>
     * Google Security Token Service subject token type based on the OAuth 2.0 token exchange spec.
     * 
     */
    @JsonProperty("subjectTokenType")
    public void setSubjectTokenType(String subjectTokenType) {
        this.subjectTokenType = subjectTokenType;
    }

    public GCPExternalAccount withSubjectTokenType(String subjectTokenType) {
        this.subjectTokenType = subjectTokenType;
        return this;
    }

    /**
     * Token URL
     * <p>
     * Google Security Token Service token exchange endpoint.
     * 
     */
    @JsonProperty("tokenURL")
    public String getTokenURL() {
        return tokenURL;
    }

    /**
     * Token URL
     * <p>
     * Google Security Token Service token exchange endpoint.
     * 
     */
    @JsonProperty("tokenURL")
    public void setTokenURL(String tokenURL) {
        this.tokenURL = tokenURL;
    }

    public GCPExternalAccount withTokenURL(String tokenURL) {
        this.tokenURL = tokenURL;
        return this;
    }

    /**
     * Credential Source
     * <p>
     * This object defines the mechanism used to retrieve the external credential from the local environment so that it can be exchanged for a GCP access token via the STS endpoint
     * 
     */
    @JsonProperty("credentialSource")
    public org.openmetadata.schema.security.credentials.credentialSource getCredentialSource() {
        return credentialSource;
    }

    /**
     * Credential Source
     * <p>
     * This object defines the mechanism used to retrieve the external credential from the local environment so that it can be exchanged for a GCP access token via the STS endpoint
     * 
     */
    @JsonProperty("credentialSource")
    public void setCredentialSource(org.openmetadata.schema.security.credentials.credentialSource credentialSource) {
        this.credentialSource = credentialSource;
    }

    public GCPExternalAccount withCredentialSource(org.openmetadata.schema.security.credentials.credentialSource credentialSource) {
        this.credentialSource = credentialSource;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GCPExternalAccount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("externalType");
        sb.append('=');
        sb.append(((this.externalType == null)?"<null>":this.externalType));
        sb.append(',');
        sb.append("audience");
        sb.append('=');
        sb.append(((this.audience == null)?"<null>":this.audience));
        sb.append(',');
        sb.append("subjectTokenType");
        sb.append('=');
        sb.append(((this.subjectTokenType == null)?"<null>":this.subjectTokenType));
        sb.append(',');
        sb.append("tokenURL");
        sb.append('=');
        sb.append(((this.tokenURL == null)?"<null>":this.tokenURL));
        sb.append(',');
        sb.append("credentialSource");
        sb.append('=');
        sb.append(((this.credentialSource == null)?"<null>":this.credentialSource));
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
        result = ((result* 31)+((this.externalType == null)? 0 :this.externalType.hashCode()));
        result = ((result* 31)+((this.audience == null)? 0 :this.audience.hashCode()));
        result = ((result* 31)+((this.subjectTokenType == null)? 0 :this.subjectTokenType.hashCode()));
        result = ((result* 31)+((this.tokenURL == null)? 0 :this.tokenURL.hashCode()));
        result = ((result* 31)+((this.credentialSource == null)? 0 :this.credentialSource.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GCPExternalAccount) == false) {
            return false;
        }
        GCPExternalAccount rhs = ((GCPExternalAccount) other);
        return ((((((this.externalType == rhs.externalType)||((this.externalType!= null)&&this.externalType.equals(rhs.externalType)))&&((this.audience == rhs.audience)||((this.audience!= null)&&this.audience.equals(rhs.audience))))&&((this.subjectTokenType == rhs.subjectTokenType)||((this.subjectTokenType!= null)&&this.subjectTokenType.equals(rhs.subjectTokenType))))&&((this.tokenURL == rhs.tokenURL)||((this.tokenURL!= null)&&this.tokenURL.equals(rhs.tokenURL))))&&((this.credentialSource == rhs.credentialSource)||((this.credentialSource!= null)&&this.credentialSource.equals(rhs.credentialSource))));
    }

}
