
package org.openmetadata.schema.security.client;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * OidcClientConfig
 * <p>
 * Oidc client security configs.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "id",
    "secret",
    "scope",
    "discoveryUri",
    "useNonce",
    "preferredJwsAlgorithm",
    "responseType",
    "disablePkce",
    "maxClockSkew",
    "clientAuthenticationMethod",
    "customParams",
    "tenant",
    "serverUrl",
    "callbackUrl"
})
@Generated("jsonschema2pojo")
public class OidcClientConfig {

    /**
     * IDP type (Example Google,Azure).
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("IDP type (Example Google,Azure).")
    private java.lang.String type;
    /**
     * Client ID.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Client ID.")
    private java.lang.String id;
    /**
     * Client Secret.
     * 
     */
    @JsonProperty("secret")
    @JsonPropertyDescription("Client Secret.")
    private java.lang.String secret;
    /**
     * Oidc Request Scopes.
     * 
     */
    @JsonProperty("scope")
    @JsonPropertyDescription("Oidc Request Scopes.")
    private java.lang.String scope = "openid email profile";
    /**
     * Discovery Uri for the Client.
     * 
     */
    @JsonProperty("discoveryUri")
    @JsonPropertyDescription("Discovery Uri for the Client.")
    private java.lang.String discoveryUri;
    /**
     * Use Nonce.
     * 
     */
    @JsonProperty("useNonce")
    @JsonPropertyDescription("Use Nonce.")
    private java.lang.String useNonce = "true";
    /**
     * Preferred Jws Algorithm.
     * 
     */
    @JsonProperty("preferredJwsAlgorithm")
    @JsonPropertyDescription("Preferred Jws Algorithm.")
    private java.lang.String preferredJwsAlgorithm = "RS256";
    /**
     * Auth0 Client Secret Key.
     * 
     */
    @JsonProperty("responseType")
    @JsonPropertyDescription("Auth0 Client Secret Key.")
    private java.lang.String responseType = "code";
    /**
     * Disable PKCE.
     * 
     */
    @JsonProperty("disablePkce")
    @JsonPropertyDescription("Disable PKCE.")
    private Boolean disablePkce = true;
    /**
     * Max Clock Skew
     * 
     */
    @JsonProperty("maxClockSkew")
    @JsonPropertyDescription("Max Clock Skew")
    private java.lang.String maxClockSkew;
    /**
     * Client Authentication Method.
     * 
     */
    @JsonProperty("clientAuthenticationMethod")
    @JsonPropertyDescription("Client Authentication Method.")
    private OidcClientConfig.ClientAuthenticationMethod clientAuthenticationMethod;
    /**
     * Custom Params.
     * 
     */
    @JsonProperty("customParams")
    @JsonPropertyDescription("Custom Params.")
    @Valid
    private Map<String, String> customParams;
    /**
     * Tenant in case of Azure.
     * 
     */
    @JsonProperty("tenant")
    @JsonPropertyDescription("Tenant in case of Azure.")
    private java.lang.String tenant;
    /**
     * Server Url.
     * 
     */
    @JsonProperty("serverUrl")
    @JsonPropertyDescription("Server Url.")
    private java.lang.String serverUrl;
    /**
     * Callback Url.
     * 
     */
    @JsonProperty("callbackUrl")
    @JsonPropertyDescription("Callback Url.")
    private java.lang.String callbackUrl;

    /**
     * IDP type (Example Google,Azure).
     * 
     */
    @JsonProperty("type")
    public java.lang.String getType() {
        return type;
    }

    /**
     * IDP type (Example Google,Azure).
     * 
     */
    @JsonProperty("type")
    public void setType(java.lang.String type) {
        this.type = type;
    }

    public OidcClientConfig withType(java.lang.String type) {
        this.type = type;
        return this;
    }

    /**
     * Client ID.
     * 
     */
    @JsonProperty("id")
    public java.lang.String getId() {
        return id;
    }

    /**
     * Client ID.
     * 
     */
    @JsonProperty("id")
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public OidcClientConfig withId(java.lang.String id) {
        this.id = id;
        return this;
    }

    /**
     * Client Secret.
     * 
     */
    @JsonProperty("secret")
    public java.lang.String getSecret() {
        return secret;
    }

    /**
     * Client Secret.
     * 
     */
    @JsonProperty("secret")
    public void setSecret(java.lang.String secret) {
        this.secret = secret;
    }

    public OidcClientConfig withSecret(java.lang.String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Oidc Request Scopes.
     * 
     */
    @JsonProperty("scope")
    public java.lang.String getScope() {
        return scope;
    }

    /**
     * Oidc Request Scopes.
     * 
     */
    @JsonProperty("scope")
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }

    public OidcClientConfig withScope(java.lang.String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Discovery Uri for the Client.
     * 
     */
    @JsonProperty("discoveryUri")
    public java.lang.String getDiscoveryUri() {
        return discoveryUri;
    }

    /**
     * Discovery Uri for the Client.
     * 
     */
    @JsonProperty("discoveryUri")
    public void setDiscoveryUri(java.lang.String discoveryUri) {
        this.discoveryUri = discoveryUri;
    }

    public OidcClientConfig withDiscoveryUri(java.lang.String discoveryUri) {
        this.discoveryUri = discoveryUri;
        return this;
    }

    /**
     * Use Nonce.
     * 
     */
    @JsonProperty("useNonce")
    public java.lang.String getUseNonce() {
        return useNonce;
    }

    /**
     * Use Nonce.
     * 
     */
    @JsonProperty("useNonce")
    public void setUseNonce(java.lang.String useNonce) {
        this.useNonce = useNonce;
    }

    public OidcClientConfig withUseNonce(java.lang.String useNonce) {
        this.useNonce = useNonce;
        return this;
    }

    /**
     * Preferred Jws Algorithm.
     * 
     */
    @JsonProperty("preferredJwsAlgorithm")
    public java.lang.String getPreferredJwsAlgorithm() {
        return preferredJwsAlgorithm;
    }

    /**
     * Preferred Jws Algorithm.
     * 
     */
    @JsonProperty("preferredJwsAlgorithm")
    public void setPreferredJwsAlgorithm(java.lang.String preferredJwsAlgorithm) {
        this.preferredJwsAlgorithm = preferredJwsAlgorithm;
    }

    public OidcClientConfig withPreferredJwsAlgorithm(java.lang.String preferredJwsAlgorithm) {
        this.preferredJwsAlgorithm = preferredJwsAlgorithm;
        return this;
    }

    /**
     * Auth0 Client Secret Key.
     * 
     */
    @JsonProperty("responseType")
    public java.lang.String getResponseType() {
        return responseType;
    }

    /**
     * Auth0 Client Secret Key.
     * 
     */
    @JsonProperty("responseType")
    public void setResponseType(java.lang.String responseType) {
        this.responseType = responseType;
    }

    public OidcClientConfig withResponseType(java.lang.String responseType) {
        this.responseType = responseType;
        return this;
    }

    /**
     * Disable PKCE.
     * 
     */
    @JsonProperty("disablePkce")
    public Boolean getDisablePkce() {
        return disablePkce;
    }

    /**
     * Disable PKCE.
     * 
     */
    @JsonProperty("disablePkce")
    public void setDisablePkce(Boolean disablePkce) {
        this.disablePkce = disablePkce;
    }

    public OidcClientConfig withDisablePkce(Boolean disablePkce) {
        this.disablePkce = disablePkce;
        return this;
    }

    /**
     * Max Clock Skew
     * 
     */
    @JsonProperty("maxClockSkew")
    public java.lang.String getMaxClockSkew() {
        return maxClockSkew;
    }

    /**
     * Max Clock Skew
     * 
     */
    @JsonProperty("maxClockSkew")
    public void setMaxClockSkew(java.lang.String maxClockSkew) {
        this.maxClockSkew = maxClockSkew;
    }

    public OidcClientConfig withMaxClockSkew(java.lang.String maxClockSkew) {
        this.maxClockSkew = maxClockSkew;
        return this;
    }

    /**
     * Client Authentication Method.
     * 
     */
    @JsonProperty("clientAuthenticationMethod")
    public OidcClientConfig.ClientAuthenticationMethod getClientAuthenticationMethod() {
        return clientAuthenticationMethod;
    }

    /**
     * Client Authentication Method.
     * 
     */
    @JsonProperty("clientAuthenticationMethod")
    public void setClientAuthenticationMethod(OidcClientConfig.ClientAuthenticationMethod clientAuthenticationMethod) {
        this.clientAuthenticationMethod = clientAuthenticationMethod;
    }

    public OidcClientConfig withClientAuthenticationMethod(OidcClientConfig.ClientAuthenticationMethod clientAuthenticationMethod) {
        this.clientAuthenticationMethod = clientAuthenticationMethod;
        return this;
    }

    /**
     * Custom Params.
     * 
     */
    @JsonProperty("customParams")
    public Map<String, String> getCustomParams() {
        return customParams;
    }

    /**
     * Custom Params.
     * 
     */
    @JsonProperty("customParams")
    public void setCustomParams(Map<String, String> customParams) {
        this.customParams = customParams;
    }

    public OidcClientConfig withCustomParams(Map<String, String> customParams) {
        this.customParams = customParams;
        return this;
    }

    /**
     * Tenant in case of Azure.
     * 
     */
    @JsonProperty("tenant")
    public java.lang.String getTenant() {
        return tenant;
    }

    /**
     * Tenant in case of Azure.
     * 
     */
    @JsonProperty("tenant")
    public void setTenant(java.lang.String tenant) {
        this.tenant = tenant;
    }

    public OidcClientConfig withTenant(java.lang.String tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Server Url.
     * 
     */
    @JsonProperty("serverUrl")
    public java.lang.String getServerUrl() {
        return serverUrl;
    }

    /**
     * Server Url.
     * 
     */
    @JsonProperty("serverUrl")
    public void setServerUrl(java.lang.String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public OidcClientConfig withServerUrl(java.lang.String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    /**
     * Callback Url.
     * 
     */
    @JsonProperty("callbackUrl")
    public java.lang.String getCallbackUrl() {
        return callbackUrl;
    }

    /**
     * Callback Url.
     * 
     */
    @JsonProperty("callbackUrl")
    public void setCallbackUrl(java.lang.String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public OidcClientConfig withCallbackUrl(java.lang.String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(OidcClientConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("secret");
        sb.append('=');
        sb.append(((this.secret == null)?"<null>":this.secret));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null)?"<null>":this.scope));
        sb.append(',');
        sb.append("discoveryUri");
        sb.append('=');
        sb.append(((this.discoveryUri == null)?"<null>":this.discoveryUri));
        sb.append(',');
        sb.append("useNonce");
        sb.append('=');
        sb.append(((this.useNonce == null)?"<null>":this.useNonce));
        sb.append(',');
        sb.append("preferredJwsAlgorithm");
        sb.append('=');
        sb.append(((this.preferredJwsAlgorithm == null)?"<null>":this.preferredJwsAlgorithm));
        sb.append(',');
        sb.append("responseType");
        sb.append('=');
        sb.append(((this.responseType == null)?"<null>":this.responseType));
        sb.append(',');
        sb.append("disablePkce");
        sb.append('=');
        sb.append(((this.disablePkce == null)?"<null>":this.disablePkce));
        sb.append(',');
        sb.append("maxClockSkew");
        sb.append('=');
        sb.append(((this.maxClockSkew == null)?"<null>":this.maxClockSkew));
        sb.append(',');
        sb.append("clientAuthenticationMethod");
        sb.append('=');
        sb.append(((this.clientAuthenticationMethod == null)?"<null>":this.clientAuthenticationMethod));
        sb.append(',');
        sb.append("customParams");
        sb.append('=');
        sb.append(((this.customParams == null)?"<null>":this.customParams));
        sb.append(',');
        sb.append("tenant");
        sb.append('=');
        sb.append(((this.tenant == null)?"<null>":this.tenant));
        sb.append(',');
        sb.append("serverUrl");
        sb.append('=');
        sb.append(((this.serverUrl == null)?"<null>":this.serverUrl));
        sb.append(',');
        sb.append("callbackUrl");
        sb.append('=');
        sb.append(((this.callbackUrl == null)?"<null>":this.callbackUrl));
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
        result = ((result* 31)+((this.customParams == null)? 0 :this.customParams.hashCode()));
        result = ((result* 31)+((this.useNonce == null)? 0 :this.useNonce.hashCode()));
        result = ((result* 31)+((this.secret == null)? 0 :this.secret.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.disablePkce == null)? 0 :this.disablePkce.hashCode()));
        result = ((result* 31)+((this.responseType == null)? 0 :this.responseType.hashCode()));
        result = ((result* 31)+((this.preferredJwsAlgorithm == null)? 0 :this.preferredJwsAlgorithm.hashCode()));
        result = ((result* 31)+((this.scope == null)? 0 :this.scope.hashCode()));
        result = ((result* 31)+((this.serverUrl == null)? 0 :this.serverUrl.hashCode()));
        result = ((result* 31)+((this.maxClockSkew == null)? 0 :this.maxClockSkew.hashCode()));
        result = ((result* 31)+((this.callbackUrl == null)? 0 :this.callbackUrl.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.discoveryUri == null)? 0 :this.discoveryUri.hashCode()));
        result = ((result* 31)+((this.clientAuthenticationMethod == null)? 0 :this.clientAuthenticationMethod.hashCode()));
        result = ((result* 31)+((this.tenant == null)? 0 :this.tenant.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OidcClientConfig) == false) {
            return false;
        }
        OidcClientConfig rhs = ((OidcClientConfig) other);
        return ((((((((((((((((this.customParams == rhs.customParams)||((this.customParams!= null)&&this.customParams.equals(rhs.customParams)))&&((this.useNonce == rhs.useNonce)||((this.useNonce!= null)&&this.useNonce.equals(rhs.useNonce))))&&((this.secret == rhs.secret)||((this.secret!= null)&&this.secret.equals(rhs.secret))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.disablePkce == rhs.disablePkce)||((this.disablePkce!= null)&&this.disablePkce.equals(rhs.disablePkce))))&&((this.responseType == rhs.responseType)||((this.responseType!= null)&&this.responseType.equals(rhs.responseType))))&&((this.preferredJwsAlgorithm == rhs.preferredJwsAlgorithm)||((this.preferredJwsAlgorithm!= null)&&this.preferredJwsAlgorithm.equals(rhs.preferredJwsAlgorithm))))&&((this.scope == rhs.scope)||((this.scope!= null)&&this.scope.equals(rhs.scope))))&&((this.serverUrl == rhs.serverUrl)||((this.serverUrl!= null)&&this.serverUrl.equals(rhs.serverUrl))))&&((this.maxClockSkew == rhs.maxClockSkew)||((this.maxClockSkew!= null)&&this.maxClockSkew.equals(rhs.maxClockSkew))))&&((this.callbackUrl == rhs.callbackUrl)||((this.callbackUrl!= null)&&this.callbackUrl.equals(rhs.callbackUrl))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.discoveryUri == rhs.discoveryUri)||((this.discoveryUri!= null)&&this.discoveryUri.equals(rhs.discoveryUri))))&&((this.clientAuthenticationMethod == rhs.clientAuthenticationMethod)||((this.clientAuthenticationMethod!= null)&&this.clientAuthenticationMethod.equals(rhs.clientAuthenticationMethod))))&&((this.tenant == rhs.tenant)||((this.tenant!= null)&&this.tenant.equals(rhs.tenant))));
    }


    /**
     * Client Authentication Method.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ClientAuthenticationMethod {

        CLIENT_SECRET_BASIC("client_secret_basic"),
        CLIENT_SECRET_POST("client_secret_post"),
        CLIENT_SECRET_JWT("client_secret_jwt"),
        PRIVATE_KEY_JWT("private_key_jwt");
        private final java.lang.String value;
        private final static Map<java.lang.String, OidcClientConfig.ClientAuthenticationMethod> CONSTANTS = new HashMap<java.lang.String, OidcClientConfig.ClientAuthenticationMethod>();

        static {
            for (OidcClientConfig.ClientAuthenticationMethod c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ClientAuthenticationMethod(java.lang.String value) {
            this.value = value;
        }

        @Override
        public java.lang.String toString() {
            return this.value;
        }

        @JsonValue
        public java.lang.String value() {
            return this.value;
        }

        @JsonCreator
        public static OidcClientConfig.ClientAuthenticationMethod fromValue(java.lang.String value) {
            OidcClientConfig.ClientAuthenticationMethod constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
