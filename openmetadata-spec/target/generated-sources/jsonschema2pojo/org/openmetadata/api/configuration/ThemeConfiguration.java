
package org.openmetadata.api.configuration;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ThemeConfiguration
 * <p>
 * This schema defines the Theme Configuration for UI elements.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "primaryColor",
    "errorColor",
    "successColor",
    "warningColor",
    "infoColor"
})
@Generated("jsonschema2pojo")
public class ThemeConfiguration {

    /**
     * Primary color used in the UI, in hex code format or empty.
     * (Required)
     * 
     */
    @JsonProperty("primaryColor")
    @JsonPropertyDescription("Primary color used in the UI, in hex code format or empty.")
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$|^$")
    @NotNull
    private String primaryColor;
    /**
     * Color used to indicate errors in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("errorColor")
    @JsonPropertyDescription("Color used to indicate errors in the UI, in hex code format or empty")
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$|^$")
    @NotNull
    private String errorColor;
    /**
     * Color used to indicate success in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("successColor")
    @JsonPropertyDescription("Color used to indicate success in the UI, in hex code format or empty")
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$|^$")
    @NotNull
    private String successColor;
    /**
     * Color used to indicate warnings in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("warningColor")
    @JsonPropertyDescription("Color used to indicate warnings in the UI, in hex code format or empty")
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$|^$")
    @NotNull
    private String warningColor;
    /**
     * Color used for informational messages in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("infoColor")
    @JsonPropertyDescription("Color used for informational messages in the UI, in hex code format or empty")
    @Pattern(regexp = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$|^$")
    @NotNull
    private String infoColor;

    /**
     * Primary color used in the UI, in hex code format or empty.
     * (Required)
     * 
     */
    @JsonProperty("primaryColor")
    public String getPrimaryColor() {
        return primaryColor;
    }

    /**
     * Primary color used in the UI, in hex code format or empty.
     * (Required)
     * 
     */
    @JsonProperty("primaryColor")
    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public ThemeConfiguration withPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
        return this;
    }

    /**
     * Color used to indicate errors in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("errorColor")
    public String getErrorColor() {
        return errorColor;
    }

    /**
     * Color used to indicate errors in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("errorColor")
    public void setErrorColor(String errorColor) {
        this.errorColor = errorColor;
    }

    public ThemeConfiguration withErrorColor(String errorColor) {
        this.errorColor = errorColor;
        return this;
    }

    /**
     * Color used to indicate success in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("successColor")
    public String getSuccessColor() {
        return successColor;
    }

    /**
     * Color used to indicate success in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("successColor")
    public void setSuccessColor(String successColor) {
        this.successColor = successColor;
    }

    public ThemeConfiguration withSuccessColor(String successColor) {
        this.successColor = successColor;
        return this;
    }

    /**
     * Color used to indicate warnings in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("warningColor")
    public String getWarningColor() {
        return warningColor;
    }

    /**
     * Color used to indicate warnings in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("warningColor")
    public void setWarningColor(String warningColor) {
        this.warningColor = warningColor;
    }

    public ThemeConfiguration withWarningColor(String warningColor) {
        this.warningColor = warningColor;
        return this;
    }

    /**
     * Color used for informational messages in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("infoColor")
    public String getInfoColor() {
        return infoColor;
    }

    /**
     * Color used for informational messages in the UI, in hex code format or empty
     * (Required)
     * 
     */
    @JsonProperty("infoColor")
    public void setInfoColor(String infoColor) {
        this.infoColor = infoColor;
    }

    public ThemeConfiguration withInfoColor(String infoColor) {
        this.infoColor = infoColor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ThemeConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("primaryColor");
        sb.append('=');
        sb.append(((this.primaryColor == null)?"<null>":this.primaryColor));
        sb.append(',');
        sb.append("errorColor");
        sb.append('=');
        sb.append(((this.errorColor == null)?"<null>":this.errorColor));
        sb.append(',');
        sb.append("successColor");
        sb.append('=');
        sb.append(((this.successColor == null)?"<null>":this.successColor));
        sb.append(',');
        sb.append("warningColor");
        sb.append('=');
        sb.append(((this.warningColor == null)?"<null>":this.warningColor));
        sb.append(',');
        sb.append("infoColor");
        sb.append('=');
        sb.append(((this.infoColor == null)?"<null>":this.infoColor));
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
        result = ((result* 31)+((this.primaryColor == null)? 0 :this.primaryColor.hashCode()));
        result = ((result* 31)+((this.warningColor == null)? 0 :this.warningColor.hashCode()));
        result = ((result* 31)+((this.infoColor == null)? 0 :this.infoColor.hashCode()));
        result = ((result* 31)+((this.errorColor == null)? 0 :this.errorColor.hashCode()));
        result = ((result* 31)+((this.successColor == null)? 0 :this.successColor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ThemeConfiguration) == false) {
            return false;
        }
        ThemeConfiguration rhs = ((ThemeConfiguration) other);
        return ((((((this.primaryColor == rhs.primaryColor)||((this.primaryColor!= null)&&this.primaryColor.equals(rhs.primaryColor)))&&((this.warningColor == rhs.warningColor)||((this.warningColor!= null)&&this.warningColor.equals(rhs.warningColor))))&&((this.infoColor == rhs.infoColor)||((this.infoColor!= null)&&this.infoColor.equals(rhs.infoColor))))&&((this.errorColor == rhs.errorColor)||((this.errorColor!= null)&&this.errorColor.equals(rhs.errorColor))))&&((this.successColor == rhs.successColor)||((this.successColor!= null)&&this.successColor.equals(rhs.successColor))));
    }

}
