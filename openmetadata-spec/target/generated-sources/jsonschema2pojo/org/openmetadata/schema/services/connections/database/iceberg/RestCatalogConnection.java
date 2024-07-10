
package org.openmetadata.schema.services.connections.database.iceberg;

import java.net.URI;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;
import org.openmetadata.schema.services.common.SSLCertPaths;


/**
 * RestCatalogConnection
 * <p>
 * Iceberg REST Catalog configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uri",
    "credential",
    "token",
    "ssl",
    "sigv4",
    "fileSystem"
})
@Generated("jsonschema2pojo")
public class RestCatalogConnection {

    /**
     * URI
     * <p>
     * Uri to the REST catalog. Example: 'http://rest-catalog/ws/'
     * (Required)
     * 
     */
    @JsonProperty("uri")
    @JsonPropertyDescription("Uri to the REST catalog. Example: 'http://rest-catalog/ws/'")
    @NotNull
    private URI uri;
    /**
     * OAuth2 Credential
     * <p>
     * OAuth2 credential to use when initializing the catalog.
     * 
     */
    @JsonProperty("credential")
    @JsonPropertyDescription("OAuth2 credential to use when initializing the catalog.")
    @Valid
    private Credential credential;
    /**
     * Token
     * <p>
     * Berarer token to use for the 'Authorization' header.
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("Berarer token to use for the 'Authorization' header.")
    @PasswordField
    private String token;
    /**
     * SSL Certificates By Path
     * <p>
     * SSL Certificates By Path
     * 
     */
    @JsonProperty("ssl")
    @JsonPropertyDescription("SSL Certificates By Path")
    @Valid
    private SSLCertPaths ssl;
    /**
     * Sigv4
     * <p>
     * Sign requests to the REST Server using AWS SigV4 protocol.
     * 
     */
    @JsonProperty("sigv4")
    @JsonPropertyDescription("Sign requests to the REST Server using AWS SigV4 protocol.")
    @Valid
    private Sigv4 sigv4;
    /**
     * IcebergFileSystem
     * <p>
     * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
     * 
     */
    @JsonProperty("fileSystem")
    @JsonPropertyDescription("Iceberg File System configuration, based on where the Iceberg Warehouse is located.")
    @Valid
    private IcebergFileSystem fileSystem;

    /**
     * URI
     * <p>
     * Uri to the REST catalog. Example: 'http://rest-catalog/ws/'
     * (Required)
     * 
     */
    @JsonProperty("uri")
    public URI getUri() {
        return uri;
    }

    /**
     * URI
     * <p>
     * Uri to the REST catalog. Example: 'http://rest-catalog/ws/'
     * (Required)
     * 
     */
    @JsonProperty("uri")
    public void setUri(URI uri) {
        this.uri = uri;
    }

    public RestCatalogConnection withUri(URI uri) {
        this.uri = uri;
        return this;
    }

    /**
     * OAuth2 Credential
     * <p>
     * OAuth2 credential to use when initializing the catalog.
     * 
     */
    @JsonProperty("credential")
    public Credential getCredential() {
        return credential;
    }

    /**
     * OAuth2 Credential
     * <p>
     * OAuth2 credential to use when initializing the catalog.
     * 
     */
    @JsonProperty("credential")
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    public RestCatalogConnection withCredential(Credential credential) {
        this.credential = credential;
        return this;
    }

    /**
     * Token
     * <p>
     * Berarer token to use for the 'Authorization' header.
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * Token
     * <p>
     * Berarer token to use for the 'Authorization' header.
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public RestCatalogConnection withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * SSL Certificates By Path
     * <p>
     * SSL Certificates By Path
     * 
     */
    @JsonProperty("ssl")
    public SSLCertPaths getSsl() {
        return ssl;
    }

    /**
     * SSL Certificates By Path
     * <p>
     * SSL Certificates By Path
     * 
     */
    @JsonProperty("ssl")
    public void setSsl(SSLCertPaths ssl) {
        this.ssl = ssl;
    }

    public RestCatalogConnection withSsl(SSLCertPaths ssl) {
        this.ssl = ssl;
        return this;
    }

    /**
     * Sigv4
     * <p>
     * Sign requests to the REST Server using AWS SigV4 protocol.
     * 
     */
    @JsonProperty("sigv4")
    public Sigv4 getSigv4() {
        return sigv4;
    }

    /**
     * Sigv4
     * <p>
     * Sign requests to the REST Server using AWS SigV4 protocol.
     * 
     */
    @JsonProperty("sigv4")
    public void setSigv4(Sigv4 sigv4) {
        this.sigv4 = sigv4;
    }

    public RestCatalogConnection withSigv4(Sigv4 sigv4) {
        this.sigv4 = sigv4;
        return this;
    }

    /**
     * IcebergFileSystem
     * <p>
     * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
     * 
     */
    @JsonProperty("fileSystem")
    public IcebergFileSystem getFileSystem() {
        return fileSystem;
    }

    /**
     * IcebergFileSystem
     * <p>
     * Iceberg File System configuration, based on where the Iceberg Warehouse is located.
     * 
     */
    @JsonProperty("fileSystem")
    public void setFileSystem(IcebergFileSystem fileSystem) {
        this.fileSystem = fileSystem;
    }

    public RestCatalogConnection withFileSystem(IcebergFileSystem fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RestCatalogConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uri");
        sb.append('=');
        sb.append(((this.uri == null)?"<null>":this.uri));
        sb.append(',');
        sb.append("credential");
        sb.append('=');
        sb.append(((this.credential == null)?"<null>":this.credential));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
        sb.append(',');
        sb.append("ssl");
        sb.append('=');
        sb.append(((this.ssl == null)?"<null>":this.ssl));
        sb.append(',');
        sb.append("sigv4");
        sb.append('=');
        sb.append(((this.sigv4 == null)?"<null>":this.sigv4));
        sb.append(',');
        sb.append("fileSystem");
        sb.append('=');
        sb.append(((this.fileSystem == null)?"<null>":this.fileSystem));
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
        result = ((result* 31)+((this.fileSystem == null)? 0 :this.fileSystem.hashCode()));
        result = ((result* 31)+((this.sigv4 == null)? 0 :this.sigv4 .hashCode()));
        result = ((result* 31)+((this.credential == null)? 0 :this.credential.hashCode()));
        result = ((result* 31)+((this.uri == null)? 0 :this.uri.hashCode()));
        result = ((result* 31)+((this.ssl == null)? 0 :this.ssl.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestCatalogConnection) == false) {
            return false;
        }
        RestCatalogConnection rhs = ((RestCatalogConnection) other);
        return (((((((this.fileSystem == rhs.fileSystem)||((this.fileSystem!= null)&&this.fileSystem.equals(rhs.fileSystem)))&&((this.sigv4 == rhs.sigv4)||((this.sigv4 != null)&&this.sigv4 .equals(rhs.sigv4))))&&((this.credential == rhs.credential)||((this.credential!= null)&&this.credential.equals(rhs.credential))))&&((this.uri == rhs.uri)||((this.uri!= null)&&this.uri.equals(rhs.uri))))&&((this.ssl == rhs.ssl)||((this.ssl!= null)&&this.ssl.equals(rhs.ssl))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }

}
