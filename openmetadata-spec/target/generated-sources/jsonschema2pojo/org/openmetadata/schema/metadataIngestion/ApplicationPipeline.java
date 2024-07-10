
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * ApplicationPipeline
 * <p>
 * Application Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "sourcePythonClass",
    "appConfig",
    "appPrivateConfig"
})
@Generated("jsonschema2pojo")
public class ApplicationPipeline {

    /**
     * Pipeline Source Config For Application Pipeline type. Nothing is required.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Pipeline Source Config For Application Pipeline type. Nothing is required.")
    private ApplicationPipeline.ApplicationConfigType type = ApplicationPipeline.ApplicationConfigType.fromValue("Application");
    /**
     * Source Python Class Name to run the application
     * 
     */
    @JsonProperty("sourcePythonClass")
    @JsonPropertyDescription("Source Python Class Name to run the application")
    private String sourcePythonClass;
    @JsonProperty("appConfig")
    private Object appConfig;
    @JsonProperty("appPrivateConfig")
    private Object appPrivateConfig;

    /**
     * Pipeline Source Config For Application Pipeline type. Nothing is required.
     * 
     */
    @JsonProperty("type")
    public ApplicationPipeline.ApplicationConfigType getType() {
        return type;
    }

    /**
     * Pipeline Source Config For Application Pipeline type. Nothing is required.
     * 
     */
    @JsonProperty("type")
    public void setType(ApplicationPipeline.ApplicationConfigType type) {
        this.type = type;
    }

    public ApplicationPipeline withType(ApplicationPipeline.ApplicationConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Source Python Class Name to run the application
     * 
     */
    @JsonProperty("sourcePythonClass")
    public String getSourcePythonClass() {
        return sourcePythonClass;
    }

    /**
     * Source Python Class Name to run the application
     * 
     */
    @JsonProperty("sourcePythonClass")
    public void setSourcePythonClass(String sourcePythonClass) {
        this.sourcePythonClass = sourcePythonClass;
    }

    public ApplicationPipeline withSourcePythonClass(String sourcePythonClass) {
        this.sourcePythonClass = sourcePythonClass;
        return this;
    }

    @JsonProperty("appConfig")
    public Object getAppConfig() {
        return appConfig;
    }

    @JsonProperty("appConfig")
    public void setAppConfig(Object appConfig) {
        this.appConfig = appConfig;
    }

    public ApplicationPipeline withAppConfig(Object appConfig) {
        this.appConfig = appConfig;
        return this;
    }

    @JsonProperty("appPrivateConfig")
    public Object getAppPrivateConfig() {
        return appPrivateConfig;
    }

    @JsonProperty("appPrivateConfig")
    public void setAppPrivateConfig(Object appPrivateConfig) {
        this.appPrivateConfig = appPrivateConfig;
    }

    public ApplicationPipeline withAppPrivateConfig(Object appPrivateConfig) {
        this.appPrivateConfig = appPrivateConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ApplicationPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("sourcePythonClass");
        sb.append('=');
        sb.append(((this.sourcePythonClass == null)?"<null>":this.sourcePythonClass));
        sb.append(',');
        sb.append("appConfig");
        sb.append('=');
        sb.append(((this.appConfig == null)?"<null>":this.appConfig));
        sb.append(',');
        sb.append("appPrivateConfig");
        sb.append('=');
        sb.append(((this.appPrivateConfig == null)?"<null>":this.appPrivateConfig));
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
        result = ((result* 31)+((this.sourcePythonClass == null)? 0 :this.sourcePythonClass.hashCode()));
        result = ((result* 31)+((this.appConfig == null)? 0 :this.appConfig.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.appPrivateConfig == null)? 0 :this.appPrivateConfig.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationPipeline) == false) {
            return false;
        }
        ApplicationPipeline rhs = ((ApplicationPipeline) other);
        return (((((this.sourcePythonClass == rhs.sourcePythonClass)||((this.sourcePythonClass!= null)&&this.sourcePythonClass.equals(rhs.sourcePythonClass)))&&((this.appConfig == rhs.appConfig)||((this.appConfig!= null)&&this.appConfig.equals(rhs.appConfig))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.appPrivateConfig == rhs.appPrivateConfig)||((this.appPrivateConfig!= null)&&this.appPrivateConfig.equals(rhs.appPrivateConfig))));
    }


    /**
     * Pipeline Source Config For Application Pipeline type. Nothing is required.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ApplicationConfigType {

        APPLICATION("Application");
        private final String value;
        private final static Map<String, ApplicationPipeline.ApplicationConfigType> CONSTANTS = new HashMap<String, ApplicationPipeline.ApplicationConfigType>();

        static {
            for (ApplicationPipeline.ApplicationConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ApplicationConfigType(String value) {
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
        public static ApplicationPipeline.ApplicationConfigType fromValue(String value) {
            ApplicationPipeline.ApplicationConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
