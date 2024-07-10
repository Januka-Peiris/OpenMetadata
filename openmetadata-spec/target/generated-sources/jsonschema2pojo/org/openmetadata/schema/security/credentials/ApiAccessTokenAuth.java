
package org.openmetadata.schema.security.credentials;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * ApiAccessTokenAuth
 * <p>
 * API Access Token Auth Credentials
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accessToken"
})
@Generated("jsonschema2pojo")
public class ApiAccessTokenAuth {

    /**
     * Access Token
     * <p>
     * Access Token for the API
     * (Required)
     * 
     */
    @JsonProperty("accessToken")
    @JsonPropertyDescription("Access Token for the API")
    @PasswordField
    @NotNull
    private String accessToken;

    /**
     * Access Token
     * <p>
     * Access Token for the API
     * (Required)
     * 
     */
    @JsonProperty("accessToken")
    @PasswordField
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Access Token
     * <p>
     * Access Token for the API
     * (Required)
     * 
     */
    @JsonProperty("accessToken")
    @PasswordField
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public ApiAccessTokenAuth withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApiAccessTokenAuth.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessToken");
        sb.append('=');
        sb.append(((this.accessToken == null)?"<null>":this.accessToken));
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
        result = ((result* 31)+((this.accessToken == null)? 0 :this.accessToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiAccessTokenAuth) == false) {
            return false;
        }
        ApiAccessTokenAuth rhs = ((ApiAccessTokenAuth) other);
        return ((this.accessToken == rhs.accessToken)||((this.accessToken!= null)&&this.accessToken.equals(rhs.accessToken)));
    }

}
