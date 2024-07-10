
package org.openmetadata.schema.entity.app.external;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.annotations.PasswordField;


/**
 * MetaPilotAppPrivateConfig
 * <p>
 * PRivate Configuration for the MetaPilot External Application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "waiiInstance",
    "collateURL",
    "token"
})
@Generated("jsonschema2pojo")
public class MetaPilotAppPrivateConfig {

    /**
     * WAII Instance
     * <p>
     * WAII API host URL
     * (Required)
     * 
     */
    @JsonProperty("waiiInstance")
    @JsonPropertyDescription("WAII API host URL")
    @NotNull
    private String waiiInstance = "https://tweakit.waii.ai/api/";
    /**
     * Collate URL
     * <p>
     * Collate Server public URL. WAII will use this information to interact with the server. E.g., https://sandbox.getcollate.io
     * (Required)
     * 
     */
    @JsonProperty("collateURL")
    @JsonPropertyDescription("Collate Server public URL. WAII will use this information to interact with the server. E.g., https://sandbox.getcollate.io")
    @NotNull
    private String collateURL;
    /**
     * WAII API Token
     * <p>
     * WAII API Token
     * (Required)
     * 
     */
    @JsonProperty("token")
    @JsonPropertyDescription("WAII API Token")
    @PasswordField
    @NotNull
    private String token;

    /**
     * WAII Instance
     * <p>
     * WAII API host URL
     * (Required)
     * 
     */
    @JsonProperty("waiiInstance")
    public String getWaiiInstance() {
        return waiiInstance;
    }

    /**
     * WAII Instance
     * <p>
     * WAII API host URL
     * (Required)
     * 
     */
    @JsonProperty("waiiInstance")
    public void setWaiiInstance(String waiiInstance) {
        this.waiiInstance = waiiInstance;
    }

    public MetaPilotAppPrivateConfig withWaiiInstance(String waiiInstance) {
        this.waiiInstance = waiiInstance;
        return this;
    }

    /**
     * Collate URL
     * <p>
     * Collate Server public URL. WAII will use this information to interact with the server. E.g., https://sandbox.getcollate.io
     * (Required)
     * 
     */
    @JsonProperty("collateURL")
    public String getCollateURL() {
        return collateURL;
    }

    /**
     * Collate URL
     * <p>
     * Collate Server public URL. WAII will use this information to interact with the server. E.g., https://sandbox.getcollate.io
     * (Required)
     * 
     */
    @JsonProperty("collateURL")
    public void setCollateURL(String collateURL) {
        this.collateURL = collateURL;
    }

    public MetaPilotAppPrivateConfig withCollateURL(String collateURL) {
        this.collateURL = collateURL;
        return this;
    }

    /**
     * WAII API Token
     * <p>
     * WAII API Token
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public String getToken() {
        return token;
    }

    /**
     * WAII API Token
     * <p>
     * WAII API Token
     * (Required)
     * 
     */
    @JsonProperty("token")
    @PasswordField
    public void setToken(String token) {
        this.token = token;
    }

    public MetaPilotAppPrivateConfig withToken(String token) {
        this.token = token;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetaPilotAppPrivateConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("waiiInstance");
        sb.append('=');
        sb.append(((this.waiiInstance == null)?"<null>":this.waiiInstance));
        sb.append(',');
        sb.append("collateURL");
        sb.append('=');
        sb.append(((this.collateURL == null)?"<null>":this.collateURL));
        sb.append(',');
        sb.append("token");
        sb.append('=');
        sb.append(((this.token == null)?"<null>":this.token));
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
        result = ((result* 31)+((this.waiiInstance == null)? 0 :this.waiiInstance.hashCode()));
        result = ((result* 31)+((this.collateURL == null)? 0 :this.collateURL.hashCode()));
        result = ((result* 31)+((this.token == null)? 0 :this.token.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetaPilotAppPrivateConfig) == false) {
            return false;
        }
        MetaPilotAppPrivateConfig rhs = ((MetaPilotAppPrivateConfig) other);
        return ((((this.waiiInstance == rhs.waiiInstance)||((this.waiiInstance!= null)&&this.waiiInstance.equals(rhs.waiiInstance)))&&((this.collateURL == rhs.collateURL)||((this.collateURL!= null)&&this.collateURL.equals(rhs.collateURL))))&&((this.token == rhs.token)||((this.token!= null)&&this.token.equals(rhs.token))));
    }

}
