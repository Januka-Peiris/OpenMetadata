
package org.openmetadata.schema.auth;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.auth.ldapTrustStoreConfig.TruststoreConfig;


/**
 * LdapConfiguration
 * <p>
 * LDAP Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "host",
    "port",
    "maxPoolSize",
    "isFullDn",
    "dnAdminPrincipal",
    "dnAdminPassword",
    "sslEnabled",
    "userBaseDN",
    "groupBaseDN",
    "roleAdminName",
    "allAttributeName",
    "mailAttributeName",
    "usernameAttributeName",
    "groupAttributeName",
    "groupAttributeValue",
    "groupMemberAttributeName",
    "authRolesMapping",
    "authReassignRoles",
    "truststoreFormat",
    "truststoreConfigType",
    "trustStoreConfig"
})
@Generated("jsonschema2pojo")
public class LdapConfiguration {

    /**
     * LDAP server address without scheme(Example :- localhost)
     * (Required)
     * 
     */
    @JsonProperty("host")
    @JsonPropertyDescription("LDAP server address without scheme(Example :- localhost)")
    @NotNull
    private String host;
    /**
     * Port of the server
     * (Required)
     * 
     */
    @JsonProperty("port")
    @JsonPropertyDescription("Port of the server")
    @NotNull
    private Integer port;
    /**
     * No of connection to create the pool with
     * 
     */
    @JsonProperty("maxPoolSize")
    @JsonPropertyDescription("No of connection to create the pool with")
    private Integer maxPoolSize = 3;
    /**
     * If enable need to give full dn to login
     * 
     */
    @JsonProperty("isFullDn")
    @JsonPropertyDescription("If enable need to give full dn to login")
    private Boolean isFullDn = false;
    /**
     * Distinguished Admin name with search capabilities
     * (Required)
     * 
     */
    @JsonProperty("dnAdminPrincipal")
    @JsonPropertyDescription("Distinguished Admin name with search capabilities")
    @NotNull
    private String dnAdminPrincipal;
    /**
     * Password for LDAP Admin
     * (Required)
     * 
     */
    @JsonProperty("dnAdminPassword")
    @JsonPropertyDescription("Password for LDAP Admin")
    @NotNull
    private String dnAdminPassword;
    /**
     * LDAPS (secure LDAP) or LDAP
     * 
     */
    @JsonProperty("sslEnabled")
    @JsonPropertyDescription("LDAPS (secure LDAP) or LDAP")
    private Boolean sslEnabled = false;
    /**
     * User base distinguished name
     * (Required)
     * 
     */
    @JsonProperty("userBaseDN")
    @JsonPropertyDescription("User base distinguished name")
    @NotNull
    private String userBaseDN;
    /**
     * Group base distinguished name
     * 
     */
    @JsonProperty("groupBaseDN")
    @JsonPropertyDescription("Group base distinguished name")
    private String groupBaseDN;
    /**
     * Admin role name
     * 
     */
    @JsonProperty("roleAdminName")
    @JsonPropertyDescription("Admin role name")
    private String roleAdminName;
    /**
     * All attribute name
     * 
     */
    @JsonProperty("allAttributeName")
    @JsonPropertyDescription("All attribute name")
    private String allAttributeName;
    /**
     * Email attribute name
     * (Required)
     * 
     */
    @JsonProperty("mailAttributeName")
    @JsonPropertyDescription("Email attribute name")
    @NotNull
    private String mailAttributeName;
    /**
     * User Name attribute name
     * 
     */
    @JsonProperty("usernameAttributeName")
    @JsonPropertyDescription("User Name attribute name")
    private String usernameAttributeName;
    /**
     * Group Name attribute name
     * 
     */
    @JsonProperty("groupAttributeName")
    @JsonPropertyDescription("Group Name attribute name")
    private String groupAttributeName;
    /**
     * Group attribute value
     * 
     */
    @JsonProperty("groupAttributeValue")
    @JsonPropertyDescription("Group attribute value")
    private String groupAttributeValue;
    /**
     * Group Member Name attribute name
     * 
     */
    @JsonProperty("groupMemberAttributeName")
    @JsonPropertyDescription("Group Member Name attribute name")
    private String groupMemberAttributeName;
    /**
     * Json string of roles mapping between LDAP roles and Ranger roles
     * 
     */
    @JsonProperty("authRolesMapping")
    @JsonPropertyDescription("Json string of roles mapping between LDAP roles and Ranger roles")
    private String authRolesMapping;
    /**
     * Roles should be reassign every time user login
     * 
     */
    @JsonProperty("authReassignRoles")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("Roles should be reassign every time user login")
    @Valid
    private Set<String> authReassignRoles = new LinkedHashSet<String>();
    /**
     * Truststore format e.g. PKCS12, JKS.
     * 
     */
    @JsonProperty("truststoreFormat")
    @JsonPropertyDescription("Truststore format e.g. PKCS12, JKS.")
    private String truststoreFormat;
    /**
     * Truststore Type e.g. TrustAll, HostName, JVMDefault, CustomTrustStore.
     * 
     */
    @JsonProperty("truststoreConfigType")
    @JsonPropertyDescription("Truststore Type e.g. TrustAll, HostName, JVMDefault, CustomTrustStore.")
    private LdapConfiguration.TruststoreConfigType truststoreConfigType;
    /**
     * TruststoreConfig
     * <p>
     * Truststore Configuration
     * 
     */
    @JsonProperty("trustStoreConfig")
    @JsonPropertyDescription("Truststore Configuration")
    @Valid
    private TruststoreConfig trustStoreConfig;

    /**
     * LDAP server address without scheme(Example :- localhost)
     * (Required)
     * 
     */
    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    /**
     * LDAP server address without scheme(Example :- localhost)
     * (Required)
     * 
     */
    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    public LdapConfiguration withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Port of the server
     * (Required)
     * 
     */
    @JsonProperty("port")
    public Integer getPort() {
        return port;
    }

    /**
     * Port of the server
     * (Required)
     * 
     */
    @JsonProperty("port")
    public void setPort(Integer port) {
        this.port = port;
    }

    public LdapConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * No of connection to create the pool with
     * 
     */
    @JsonProperty("maxPoolSize")
    public Integer getMaxPoolSize() {
        return maxPoolSize;
    }

    /**
     * No of connection to create the pool with
     * 
     */
    @JsonProperty("maxPoolSize")
    public void setMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
    }

    public LdapConfiguration withMaxPoolSize(Integer maxPoolSize) {
        this.maxPoolSize = maxPoolSize;
        return this;
    }

    /**
     * If enable need to give full dn to login
     * 
     */
    @JsonProperty("isFullDn")
    public Boolean getIsFullDn() {
        return isFullDn;
    }

    /**
     * If enable need to give full dn to login
     * 
     */
    @JsonProperty("isFullDn")
    public void setIsFullDn(Boolean isFullDn) {
        this.isFullDn = isFullDn;
    }

    public LdapConfiguration withIsFullDn(Boolean isFullDn) {
        this.isFullDn = isFullDn;
        return this;
    }

    /**
     * Distinguished Admin name with search capabilities
     * (Required)
     * 
     */
    @JsonProperty("dnAdminPrincipal")
    public String getDnAdminPrincipal() {
        return dnAdminPrincipal;
    }

    /**
     * Distinguished Admin name with search capabilities
     * (Required)
     * 
     */
    @JsonProperty("dnAdminPrincipal")
    public void setDnAdminPrincipal(String dnAdminPrincipal) {
        this.dnAdminPrincipal = dnAdminPrincipal;
    }

    public LdapConfiguration withDnAdminPrincipal(String dnAdminPrincipal) {
        this.dnAdminPrincipal = dnAdminPrincipal;
        return this;
    }

    /**
     * Password for LDAP Admin
     * (Required)
     * 
     */
    @JsonProperty("dnAdminPassword")
    public String getDnAdminPassword() {
        return dnAdminPassword;
    }

    /**
     * Password for LDAP Admin
     * (Required)
     * 
     */
    @JsonProperty("dnAdminPassword")
    public void setDnAdminPassword(String dnAdminPassword) {
        this.dnAdminPassword = dnAdminPassword;
    }

    public LdapConfiguration withDnAdminPassword(String dnAdminPassword) {
        this.dnAdminPassword = dnAdminPassword;
        return this;
    }

    /**
     * LDAPS (secure LDAP) or LDAP
     * 
     */
    @JsonProperty("sslEnabled")
    public Boolean getSslEnabled() {
        return sslEnabled;
    }

    /**
     * LDAPS (secure LDAP) or LDAP
     * 
     */
    @JsonProperty("sslEnabled")
    public void setSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
    }

    public LdapConfiguration withSslEnabled(Boolean sslEnabled) {
        this.sslEnabled = sslEnabled;
        return this;
    }

    /**
     * User base distinguished name
     * (Required)
     * 
     */
    @JsonProperty("userBaseDN")
    public String getUserBaseDN() {
        return userBaseDN;
    }

    /**
     * User base distinguished name
     * (Required)
     * 
     */
    @JsonProperty("userBaseDN")
    public void setUserBaseDN(String userBaseDN) {
        this.userBaseDN = userBaseDN;
    }

    public LdapConfiguration withUserBaseDN(String userBaseDN) {
        this.userBaseDN = userBaseDN;
        return this;
    }

    /**
     * Group base distinguished name
     * 
     */
    @JsonProperty("groupBaseDN")
    public String getGroupBaseDN() {
        return groupBaseDN;
    }

    /**
     * Group base distinguished name
     * 
     */
    @JsonProperty("groupBaseDN")
    public void setGroupBaseDN(String groupBaseDN) {
        this.groupBaseDN = groupBaseDN;
    }

    public LdapConfiguration withGroupBaseDN(String groupBaseDN) {
        this.groupBaseDN = groupBaseDN;
        return this;
    }

    /**
     * Admin role name
     * 
     */
    @JsonProperty("roleAdminName")
    public String getRoleAdminName() {
        return roleAdminName;
    }

    /**
     * Admin role name
     * 
     */
    @JsonProperty("roleAdminName")
    public void setRoleAdminName(String roleAdminName) {
        this.roleAdminName = roleAdminName;
    }

    public LdapConfiguration withRoleAdminName(String roleAdminName) {
        this.roleAdminName = roleAdminName;
        return this;
    }

    /**
     * All attribute name
     * 
     */
    @JsonProperty("allAttributeName")
    public String getAllAttributeName() {
        return allAttributeName;
    }

    /**
     * All attribute name
     * 
     */
    @JsonProperty("allAttributeName")
    public void setAllAttributeName(String allAttributeName) {
        this.allAttributeName = allAttributeName;
    }

    public LdapConfiguration withAllAttributeName(String allAttributeName) {
        this.allAttributeName = allAttributeName;
        return this;
    }

    /**
     * Email attribute name
     * (Required)
     * 
     */
    @JsonProperty("mailAttributeName")
    public String getMailAttributeName() {
        return mailAttributeName;
    }

    /**
     * Email attribute name
     * (Required)
     * 
     */
    @JsonProperty("mailAttributeName")
    public void setMailAttributeName(String mailAttributeName) {
        this.mailAttributeName = mailAttributeName;
    }

    public LdapConfiguration withMailAttributeName(String mailAttributeName) {
        this.mailAttributeName = mailAttributeName;
        return this;
    }

    /**
     * User Name attribute name
     * 
     */
    @JsonProperty("usernameAttributeName")
    public String getUsernameAttributeName() {
        return usernameAttributeName;
    }

    /**
     * User Name attribute name
     * 
     */
    @JsonProperty("usernameAttributeName")
    public void setUsernameAttributeName(String usernameAttributeName) {
        this.usernameAttributeName = usernameAttributeName;
    }

    public LdapConfiguration withUsernameAttributeName(String usernameAttributeName) {
        this.usernameAttributeName = usernameAttributeName;
        return this;
    }

    /**
     * Group Name attribute name
     * 
     */
    @JsonProperty("groupAttributeName")
    public String getGroupAttributeName() {
        return groupAttributeName;
    }

    /**
     * Group Name attribute name
     * 
     */
    @JsonProperty("groupAttributeName")
    public void setGroupAttributeName(String groupAttributeName) {
        this.groupAttributeName = groupAttributeName;
    }

    public LdapConfiguration withGroupAttributeName(String groupAttributeName) {
        this.groupAttributeName = groupAttributeName;
        return this;
    }

    /**
     * Group attribute value
     * 
     */
    @JsonProperty("groupAttributeValue")
    public String getGroupAttributeValue() {
        return groupAttributeValue;
    }

    /**
     * Group attribute value
     * 
     */
    @JsonProperty("groupAttributeValue")
    public void setGroupAttributeValue(String groupAttributeValue) {
        this.groupAttributeValue = groupAttributeValue;
    }

    public LdapConfiguration withGroupAttributeValue(String groupAttributeValue) {
        this.groupAttributeValue = groupAttributeValue;
        return this;
    }

    /**
     * Group Member Name attribute name
     * 
     */
    @JsonProperty("groupMemberAttributeName")
    public String getGroupMemberAttributeName() {
        return groupMemberAttributeName;
    }

    /**
     * Group Member Name attribute name
     * 
     */
    @JsonProperty("groupMemberAttributeName")
    public void setGroupMemberAttributeName(String groupMemberAttributeName) {
        this.groupMemberAttributeName = groupMemberAttributeName;
    }

    public LdapConfiguration withGroupMemberAttributeName(String groupMemberAttributeName) {
        this.groupMemberAttributeName = groupMemberAttributeName;
        return this;
    }

    /**
     * Json string of roles mapping between LDAP roles and Ranger roles
     * 
     */
    @JsonProperty("authRolesMapping")
    public String getAuthRolesMapping() {
        return authRolesMapping;
    }

    /**
     * Json string of roles mapping between LDAP roles and Ranger roles
     * 
     */
    @JsonProperty("authRolesMapping")
    public void setAuthRolesMapping(String authRolesMapping) {
        this.authRolesMapping = authRolesMapping;
    }

    public LdapConfiguration withAuthRolesMapping(String authRolesMapping) {
        this.authRolesMapping = authRolesMapping;
        return this;
    }

    /**
     * Roles should be reassign every time user login
     * 
     */
    @JsonProperty("authReassignRoles")
    public Set<String> getAuthReassignRoles() {
        return authReassignRoles;
    }

    /**
     * Roles should be reassign every time user login
     * 
     */
    @JsonProperty("authReassignRoles")
    public void setAuthReassignRoles(Set<String> authReassignRoles) {
        this.authReassignRoles = authReassignRoles;
    }

    public LdapConfiguration withAuthReassignRoles(Set<String> authReassignRoles) {
        this.authReassignRoles = authReassignRoles;
        return this;
    }

    /**
     * Truststore format e.g. PKCS12, JKS.
     * 
     */
    @JsonProperty("truststoreFormat")
    public String getTruststoreFormat() {
        return truststoreFormat;
    }

    /**
     * Truststore format e.g. PKCS12, JKS.
     * 
     */
    @JsonProperty("truststoreFormat")
    public void setTruststoreFormat(String truststoreFormat) {
        this.truststoreFormat = truststoreFormat;
    }

    public LdapConfiguration withTruststoreFormat(String truststoreFormat) {
        this.truststoreFormat = truststoreFormat;
        return this;
    }

    /**
     * Truststore Type e.g. TrustAll, HostName, JVMDefault, CustomTrustStore.
     * 
     */
    @JsonProperty("truststoreConfigType")
    public LdapConfiguration.TruststoreConfigType getTruststoreConfigType() {
        return truststoreConfigType;
    }

    /**
     * Truststore Type e.g. TrustAll, HostName, JVMDefault, CustomTrustStore.
     * 
     */
    @JsonProperty("truststoreConfigType")
    public void setTruststoreConfigType(LdapConfiguration.TruststoreConfigType truststoreConfigType) {
        this.truststoreConfigType = truststoreConfigType;
    }

    public LdapConfiguration withTruststoreConfigType(LdapConfiguration.TruststoreConfigType truststoreConfigType) {
        this.truststoreConfigType = truststoreConfigType;
        return this;
    }

    /**
     * TruststoreConfig
     * <p>
     * Truststore Configuration
     * 
     */
    @JsonProperty("trustStoreConfig")
    public TruststoreConfig getTrustStoreConfig() {
        return trustStoreConfig;
    }

    /**
     * TruststoreConfig
     * <p>
     * Truststore Configuration
     * 
     */
    @JsonProperty("trustStoreConfig")
    public void setTrustStoreConfig(TruststoreConfig trustStoreConfig) {
        this.trustStoreConfig = trustStoreConfig;
    }

    public LdapConfiguration withTrustStoreConfig(TruststoreConfig trustStoreConfig) {
        this.trustStoreConfig = trustStoreConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LdapConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("host");
        sb.append('=');
        sb.append(((this.host == null)?"<null>":this.host));
        sb.append(',');
        sb.append("port");
        sb.append('=');
        sb.append(((this.port == null)?"<null>":this.port));
        sb.append(',');
        sb.append("maxPoolSize");
        sb.append('=');
        sb.append(((this.maxPoolSize == null)?"<null>":this.maxPoolSize));
        sb.append(',');
        sb.append("isFullDn");
        sb.append('=');
        sb.append(((this.isFullDn == null)?"<null>":this.isFullDn));
        sb.append(',');
        sb.append("dnAdminPrincipal");
        sb.append('=');
        sb.append(((this.dnAdminPrincipal == null)?"<null>":this.dnAdminPrincipal));
        sb.append(',');
        sb.append("dnAdminPassword");
        sb.append('=');
        sb.append(((this.dnAdminPassword == null)?"<null>":this.dnAdminPassword));
        sb.append(',');
        sb.append("sslEnabled");
        sb.append('=');
        sb.append(((this.sslEnabled == null)?"<null>":this.sslEnabled));
        sb.append(',');
        sb.append("userBaseDN");
        sb.append('=');
        sb.append(((this.userBaseDN == null)?"<null>":this.userBaseDN));
        sb.append(',');
        sb.append("groupBaseDN");
        sb.append('=');
        sb.append(((this.groupBaseDN == null)?"<null>":this.groupBaseDN));
        sb.append(',');
        sb.append("roleAdminName");
        sb.append('=');
        sb.append(((this.roleAdminName == null)?"<null>":this.roleAdminName));
        sb.append(',');
        sb.append("allAttributeName");
        sb.append('=');
        sb.append(((this.allAttributeName == null)?"<null>":this.allAttributeName));
        sb.append(',');
        sb.append("mailAttributeName");
        sb.append('=');
        sb.append(((this.mailAttributeName == null)?"<null>":this.mailAttributeName));
        sb.append(',');
        sb.append("usernameAttributeName");
        sb.append('=');
        sb.append(((this.usernameAttributeName == null)?"<null>":this.usernameAttributeName));
        sb.append(',');
        sb.append("groupAttributeName");
        sb.append('=');
        sb.append(((this.groupAttributeName == null)?"<null>":this.groupAttributeName));
        sb.append(',');
        sb.append("groupAttributeValue");
        sb.append('=');
        sb.append(((this.groupAttributeValue == null)?"<null>":this.groupAttributeValue));
        sb.append(',');
        sb.append("groupMemberAttributeName");
        sb.append('=');
        sb.append(((this.groupMemberAttributeName == null)?"<null>":this.groupMemberAttributeName));
        sb.append(',');
        sb.append("authRolesMapping");
        sb.append('=');
        sb.append(((this.authRolesMapping == null)?"<null>":this.authRolesMapping));
        sb.append(',');
        sb.append("authReassignRoles");
        sb.append('=');
        sb.append(((this.authReassignRoles == null)?"<null>":this.authReassignRoles));
        sb.append(',');
        sb.append("truststoreFormat");
        sb.append('=');
        sb.append(((this.truststoreFormat == null)?"<null>":this.truststoreFormat));
        sb.append(',');
        sb.append("truststoreConfigType");
        sb.append('=');
        sb.append(((this.truststoreConfigType == null)?"<null>":this.truststoreConfigType));
        sb.append(',');
        sb.append("trustStoreConfig");
        sb.append('=');
        sb.append(((this.trustStoreConfig == null)?"<null>":this.trustStoreConfig));
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
        result = ((result* 31)+((this.allAttributeName == null)? 0 :this.allAttributeName.hashCode()));
        result = ((result* 31)+((this.truststoreConfigType == null)? 0 :this.truststoreConfigType.hashCode()));
        result = ((result* 31)+((this.usernameAttributeName == null)? 0 :this.usernameAttributeName.hashCode()));
        result = ((result* 31)+((this.authRolesMapping == null)? 0 :this.authRolesMapping.hashCode()));
        result = ((result* 31)+((this.groupAttributeName == null)? 0 :this.groupAttributeName.hashCode()));
        result = ((result* 31)+((this.groupBaseDN == null)? 0 :this.groupBaseDN.hashCode()));
        result = ((result* 31)+((this.port == null)? 0 :this.port.hashCode()));
        result = ((result* 31)+((this.roleAdminName == null)? 0 :this.roleAdminName.hashCode()));
        result = ((result* 31)+((this.mailAttributeName == null)? 0 :this.mailAttributeName.hashCode()));
        result = ((result* 31)+((this.truststoreFormat == null)? 0 :this.truststoreFormat.hashCode()));
        result = ((result* 31)+((this.trustStoreConfig == null)? 0 :this.trustStoreConfig.hashCode()));
        result = ((result* 31)+((this.dnAdminPassword == null)? 0 :this.dnAdminPassword.hashCode()));
        result = ((result* 31)+((this.sslEnabled == null)? 0 :this.sslEnabled.hashCode()));
        result = ((result* 31)+((this.host == null)? 0 :this.host.hashCode()));
        result = ((result* 31)+((this.dnAdminPrincipal == null)? 0 :this.dnAdminPrincipal.hashCode()));
        result = ((result* 31)+((this.authReassignRoles == null)? 0 :this.authReassignRoles.hashCode()));
        result = ((result* 31)+((this.groupMemberAttributeName == null)? 0 :this.groupMemberAttributeName.hashCode()));
        result = ((result* 31)+((this.maxPoolSize == null)? 0 :this.maxPoolSize.hashCode()));
        result = ((result* 31)+((this.isFullDn == null)? 0 :this.isFullDn.hashCode()));
        result = ((result* 31)+((this.userBaseDN == null)? 0 :this.userBaseDN.hashCode()));
        result = ((result* 31)+((this.groupAttributeValue == null)? 0 :this.groupAttributeValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LdapConfiguration) == false) {
            return false;
        }
        LdapConfiguration rhs = ((LdapConfiguration) other);
        return ((((((((((((((((((((((this.allAttributeName == rhs.allAttributeName)||((this.allAttributeName!= null)&&this.allAttributeName.equals(rhs.allAttributeName)))&&((this.truststoreConfigType == rhs.truststoreConfigType)||((this.truststoreConfigType!= null)&&this.truststoreConfigType.equals(rhs.truststoreConfigType))))&&((this.usernameAttributeName == rhs.usernameAttributeName)||((this.usernameAttributeName!= null)&&this.usernameAttributeName.equals(rhs.usernameAttributeName))))&&((this.authRolesMapping == rhs.authRolesMapping)||((this.authRolesMapping!= null)&&this.authRolesMapping.equals(rhs.authRolesMapping))))&&((this.groupAttributeName == rhs.groupAttributeName)||((this.groupAttributeName!= null)&&this.groupAttributeName.equals(rhs.groupAttributeName))))&&((this.groupBaseDN == rhs.groupBaseDN)||((this.groupBaseDN!= null)&&this.groupBaseDN.equals(rhs.groupBaseDN))))&&((this.port == rhs.port)||((this.port!= null)&&this.port.equals(rhs.port))))&&((this.roleAdminName == rhs.roleAdminName)||((this.roleAdminName!= null)&&this.roleAdminName.equals(rhs.roleAdminName))))&&((this.mailAttributeName == rhs.mailAttributeName)||((this.mailAttributeName!= null)&&this.mailAttributeName.equals(rhs.mailAttributeName))))&&((this.truststoreFormat == rhs.truststoreFormat)||((this.truststoreFormat!= null)&&this.truststoreFormat.equals(rhs.truststoreFormat))))&&((this.trustStoreConfig == rhs.trustStoreConfig)||((this.trustStoreConfig!= null)&&this.trustStoreConfig.equals(rhs.trustStoreConfig))))&&((this.dnAdminPassword == rhs.dnAdminPassword)||((this.dnAdminPassword!= null)&&this.dnAdminPassword.equals(rhs.dnAdminPassword))))&&((this.sslEnabled == rhs.sslEnabled)||((this.sslEnabled!= null)&&this.sslEnabled.equals(rhs.sslEnabled))))&&((this.host == rhs.host)||((this.host!= null)&&this.host.equals(rhs.host))))&&((this.dnAdminPrincipal == rhs.dnAdminPrincipal)||((this.dnAdminPrincipal!= null)&&this.dnAdminPrincipal.equals(rhs.dnAdminPrincipal))))&&((this.authReassignRoles == rhs.authReassignRoles)||((this.authReassignRoles!= null)&&this.authReassignRoles.equals(rhs.authReassignRoles))))&&((this.groupMemberAttributeName == rhs.groupMemberAttributeName)||((this.groupMemberAttributeName!= null)&&this.groupMemberAttributeName.equals(rhs.groupMemberAttributeName))))&&((this.maxPoolSize == rhs.maxPoolSize)||((this.maxPoolSize!= null)&&this.maxPoolSize.equals(rhs.maxPoolSize))))&&((this.isFullDn == rhs.isFullDn)||((this.isFullDn!= null)&&this.isFullDn.equals(rhs.isFullDn))))&&((this.userBaseDN == rhs.userBaseDN)||((this.userBaseDN!= null)&&this.userBaseDN.equals(rhs.userBaseDN))))&&((this.groupAttributeValue == rhs.groupAttributeValue)||((this.groupAttributeValue!= null)&&this.groupAttributeValue.equals(rhs.groupAttributeValue))));
    }


    /**
     * Truststore Type e.g. TrustAll, HostName, JVMDefault, CustomTrustStore.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum TruststoreConfigType {

        TRUST_ALL("TrustAll"),
        JVM_DEFAULT("JVMDefault"),
        HOST_NAME("HostName"),
        CUSTOM_TRUST_STORE("CustomTrustStore");
        private final String value;
        private final static Map<String, LdapConfiguration.TruststoreConfigType> CONSTANTS = new HashMap<String, LdapConfiguration.TruststoreConfigType>();

        static {
            for (LdapConfiguration.TruststoreConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        TruststoreConfigType(String value) {
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
        public static LdapConfiguration.TruststoreConfigType fromValue(String value) {
            LdapConfiguration.TruststoreConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
