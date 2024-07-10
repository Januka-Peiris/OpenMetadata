
package org.openmetadata.api.configuration;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * UiThemePreference
 * <p>
 * This schema defines  UI related configuration and settings.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customLogoConfig",
    "customTheme"
})
@Generated("jsonschema2pojo")
public class UiThemePreference {

    /**
     * LogoConfiguration
     * <p>
     * This schema defines the Logo Configuration.
     * (Required)
     * 
     */
    @JsonProperty("customLogoConfig")
    @JsonPropertyDescription("This schema defines the Logo Configuration.")
    @Valid
    @NotNull
    private LogoConfiguration customLogoConfig;
    /**
     * ThemeConfiguration
     * <p>
     * This schema defines the Theme Configuration for UI elements.
     * (Required)
     * 
     */
    @JsonProperty("customTheme")
    @JsonPropertyDescription("This schema defines the Theme Configuration for UI elements.")
    @Valid
    @NotNull
    private ThemeConfiguration customTheme;

    /**
     * LogoConfiguration
     * <p>
     * This schema defines the Logo Configuration.
     * (Required)
     * 
     */
    @JsonProperty("customLogoConfig")
    public LogoConfiguration getCustomLogoConfig() {
        return customLogoConfig;
    }

    /**
     * LogoConfiguration
     * <p>
     * This schema defines the Logo Configuration.
     * (Required)
     * 
     */
    @JsonProperty("customLogoConfig")
    public void setCustomLogoConfig(LogoConfiguration customLogoConfig) {
        this.customLogoConfig = customLogoConfig;
    }

    public UiThemePreference withCustomLogoConfig(LogoConfiguration customLogoConfig) {
        this.customLogoConfig = customLogoConfig;
        return this;
    }

    /**
     * ThemeConfiguration
     * <p>
     * This schema defines the Theme Configuration for UI elements.
     * (Required)
     * 
     */
    @JsonProperty("customTheme")
    public ThemeConfiguration getCustomTheme() {
        return customTheme;
    }

    /**
     * ThemeConfiguration
     * <p>
     * This schema defines the Theme Configuration for UI elements.
     * (Required)
     * 
     */
    @JsonProperty("customTheme")
    public void setCustomTheme(ThemeConfiguration customTheme) {
        this.customTheme = customTheme;
    }

    public UiThemePreference withCustomTheme(ThemeConfiguration customTheme) {
        this.customTheme = customTheme;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UiThemePreference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("customLogoConfig");
        sb.append('=');
        sb.append(((this.customLogoConfig == null)?"<null>":this.customLogoConfig));
        sb.append(',');
        sb.append("customTheme");
        sb.append('=');
        sb.append(((this.customTheme == null)?"<null>":this.customTheme));
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
        result = ((result* 31)+((this.customLogoConfig == null)? 0 :this.customLogoConfig.hashCode()));
        result = ((result* 31)+((this.customTheme == null)? 0 :this.customTheme.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UiThemePreference) == false) {
            return false;
        }
        UiThemePreference rhs = ((UiThemePreference) other);
        return (((this.customLogoConfig == rhs.customLogoConfig)||((this.customLogoConfig!= null)&&this.customLogoConfig.equals(rhs.customLogoConfig)))&&((this.customTheme == rhs.customTheme)||((this.customTheme!= null)&&this.customTheme.equals(rhs.customTheme))));
    }

}
