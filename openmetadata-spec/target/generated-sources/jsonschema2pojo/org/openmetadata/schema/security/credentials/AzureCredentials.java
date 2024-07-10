
package org.openmetadata.schema.security.credentials;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * AzureCredentials
 * <p>
 * Azure Cloud Credentials
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clientId",
    "clientSecret",
    "tenantId",
    "accountName",
    "vaultName",
    "scopes"
})
@Generated("jsonschema2pojo")
public class AzureCredentials {

    /**
     * Client ID
     * <p>
     * Your Service Principal App ID (Client ID)
     * 
     */
    @JsonProperty("clientId")
    @JsonPropertyDescription("Your Service Principal App ID (Client ID)")
    private String clientId;
    /**
     * Client Secret
     * <p>
     * Your Service Principal Password (Client Secret)
     * 
     */
    @JsonProperty("clientSecret")
    @JsonPropertyDescription("Your Service Principal Password (Client Secret)")
    @PasswordField
    private String clientSecret;
    /**
     * Tenant ID
     * <p>
     * Tenant ID of your Azure Subscription
     * 
     */
    @JsonProperty("tenantId")
    @JsonPropertyDescription("Tenant ID of your Azure Subscription")
    private String tenantId;
    /**
     * Storage Account Name
     * <p>
     * Account Name of your storage account
     * 
     */
    @JsonProperty("accountName")
    @JsonPropertyDescription("Account Name of your storage account")
    private String accountName;
    /**
     * Key Vault Name
     * <p>
     * Key Vault Name
     * 
     */
    @JsonProperty("vaultName")
    @JsonPropertyDescription("Key Vault Name")
    private String vaultName;
    /**
     * Scopes
     * <p>
     * Scopes to get access token, for e.g. api://6dfX33ab-XXXX-49df-XXXX-3459eX817d3e/.default
     * 
     */
    @JsonProperty("scopes")
    @JsonPropertyDescription("Scopes to get access token, for e.g. api://6dfX33ab-XXXX-49df-XXXX-3459eX817d3e/.default")
    private String scopes;

    /**
     * Client ID
     * <p>
     * Your Service Principal App ID (Client ID)
     * 
     */
    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * Client ID
     * <p>
     * Your Service Principal App ID (Client ID)
     * 
     */
    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public AzureCredentials withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Client Secret
     * <p>
     * Your Service Principal Password (Client Secret)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Client Secret
     * <p>
     * Your Service Principal Password (Client Secret)
     * 
     */
    @JsonProperty("clientSecret")
    @PasswordField
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public AzureCredentials withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Tenant ID
     * <p>
     * Tenant ID of your Azure Subscription
     * 
     */
    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    /**
     * Tenant ID
     * <p>
     * Tenant ID of your Azure Subscription
     * 
     */
    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public AzureCredentials withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Storage Account Name
     * <p>
     * Account Name of your storage account
     * 
     */
    @JsonProperty("accountName")
    public String getAccountName() {
        return accountName;
    }

    /**
     * Storage Account Name
     * <p>
     * Account Name of your storage account
     * 
     */
    @JsonProperty("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AzureCredentials withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Key Vault Name
     * <p>
     * Key Vault Name
     * 
     */
    @JsonProperty("vaultName")
    public String getVaultName() {
        return vaultName;
    }

    /**
     * Key Vault Name
     * <p>
     * Key Vault Name
     * 
     */
    @JsonProperty("vaultName")
    public void setVaultName(String vaultName) {
        this.vaultName = vaultName;
    }

    public AzureCredentials withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Scopes
     * <p>
     * Scopes to get access token, for e.g. api://6dfX33ab-XXXX-49df-XXXX-3459eX817d3e/.default
     * 
     */
    @JsonProperty("scopes")
    public String getScopes() {
        return scopes;
    }

    /**
     * Scopes
     * <p>
     * Scopes to get access token, for e.g. api://6dfX33ab-XXXX-49df-XXXX-3459eX817d3e/.default
     * 
     */
    @JsonProperty("scopes")
    public void setScopes(String scopes) {
        this.scopes = scopes;
    }

    public AzureCredentials withScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AzureCredentials.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clientId");
        sb.append('=');
        sb.append(((this.clientId == null)?"<null>":this.clientId));
        sb.append(',');
        sb.append("clientSecret");
        sb.append('=');
        sb.append(((this.clientSecret == null)?"<null>":this.clientSecret));
        sb.append(',');
        sb.append("tenantId");
        sb.append('=');
        sb.append(((this.tenantId == null)?"<null>":this.tenantId));
        sb.append(',');
        sb.append("accountName");
        sb.append('=');
        sb.append(((this.accountName == null)?"<null>":this.accountName));
        sb.append(',');
        sb.append("vaultName");
        sb.append('=');
        sb.append(((this.vaultName == null)?"<null>":this.vaultName));
        sb.append(',');
        sb.append("scopes");
        sb.append('=');
        sb.append(((this.scopes == null)?"<null>":this.scopes));
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
        result = ((result* 31)+((this.tenantId == null)? 0 :this.tenantId.hashCode()));
        result = ((result* 31)+((this.clientSecret == null)? 0 :this.clientSecret.hashCode()));
        result = ((result* 31)+((this.clientId == null)? 0 :this.clientId.hashCode()));
        result = ((result* 31)+((this.scopes == null)? 0 :this.scopes.hashCode()));
        result = ((result* 31)+((this.vaultName == null)? 0 :this.vaultName.hashCode()));
        result = ((result* 31)+((this.accountName == null)? 0 :this.accountName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AzureCredentials) == false) {
            return false;
        }
        AzureCredentials rhs = ((AzureCredentials) other);
        return (((((((this.tenantId == rhs.tenantId)||((this.tenantId!= null)&&this.tenantId.equals(rhs.tenantId)))&&((this.clientSecret == rhs.clientSecret)||((this.clientSecret!= null)&&this.clientSecret.equals(rhs.clientSecret))))&&((this.clientId == rhs.clientId)||((this.clientId!= null)&&this.clientId.equals(rhs.clientId))))&&((this.scopes == rhs.scopes)||((this.scopes!= null)&&this.scopes.equals(rhs.scopes))))&&((this.vaultName == rhs.vaultName)||((this.vaultName!= null)&&this.vaultName.equals(rhs.vaultName))))&&((this.accountName == rhs.accountName)||((this.accountName!= null)&&this.accountName.equals(rhs.accountName))));
    }

}
