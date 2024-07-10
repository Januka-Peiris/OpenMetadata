
package org.openmetadata.schema.api.configuration.dataQuality;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DataQualityConfiguration
 * <p>
 * This schema defines the Data Quality Configuration
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "severityIncidentClassifier"
})
@Generated("jsonschema2pojo")
public class DataQualityConfiguration {

    /**
     * Class Name for the severity incident classifier.
     * (Required)
     * 
     */
    @JsonProperty("severityIncidentClassifier")
    @JsonPropertyDescription("Class Name for the severity incident classifier.")
    @NotNull
    private String severityIncidentClassifier;

    /**
     * Class Name for the severity incident classifier.
     * (Required)
     * 
     */
    @JsonProperty("severityIncidentClassifier")
    public String getSeverityIncidentClassifier() {
        return severityIncidentClassifier;
    }

    /**
     * Class Name for the severity incident classifier.
     * (Required)
     * 
     */
    @JsonProperty("severityIncidentClassifier")
    public void setSeverityIncidentClassifier(String severityIncidentClassifier) {
        this.severityIncidentClassifier = severityIncidentClassifier;
    }

    public DataQualityConfiguration withSeverityIncidentClassifier(String severityIncidentClassifier) {
        this.severityIncidentClassifier = severityIncidentClassifier;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataQualityConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("severityIncidentClassifier");
        sb.append('=');
        sb.append(((this.severityIncidentClassifier == null)?"<null>":this.severityIncidentClassifier));
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
        result = ((result* 31)+((this.severityIncidentClassifier == null)? 0 :this.severityIncidentClassifier.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataQualityConfiguration) == false) {
            return false;
        }
        DataQualityConfiguration rhs = ((DataQualityConfiguration) other);
        return ((this.severityIncidentClassifier == rhs.severityIncidentClassifier)||((this.severityIncidentClassifier!= null)&&this.severityIncidentClassifier.equals(rhs.severityIncidentClassifier)));
    }

}
