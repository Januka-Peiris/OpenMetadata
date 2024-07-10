
package org.openmetadata.schema.api.configuration.profiler;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ProfilerConfiguration
 * <p>
 * This schema defines the profiler configuration. It is used to configure globally the metrics to compute for specific data types.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "metricConfiguration"
})
@Generated("jsonschema2pojo")
public class ProfilerConfiguration {

    @JsonProperty("metricConfiguration")
    @Valid
    private List<MetricConfigurationDefinition> metricConfiguration = new ArrayList<MetricConfigurationDefinition>();

    @JsonProperty("metricConfiguration")
    public List<MetricConfigurationDefinition> getMetricConfiguration() {
        return metricConfiguration;
    }

    @JsonProperty("metricConfiguration")
    public void setMetricConfiguration(List<MetricConfigurationDefinition> metricConfiguration) {
        this.metricConfiguration = metricConfiguration;
    }

    public ProfilerConfiguration withMetricConfiguration(List<MetricConfigurationDefinition> metricConfiguration) {
        this.metricConfiguration = metricConfiguration;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ProfilerConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metricConfiguration");
        sb.append('=');
        sb.append(((this.metricConfiguration == null)?"<null>":this.metricConfiguration));
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
        result = ((result* 31)+((this.metricConfiguration == null)? 0 :this.metricConfiguration.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProfilerConfiguration) == false) {
            return false;
        }
        ProfilerConfiguration rhs = ((ProfilerConfiguration) other);
        return ((this.metricConfiguration == rhs.metricConfiguration)||((this.metricConfiguration!= null)&&this.metricConfiguration.equals(rhs.metricConfiguration)));
    }

}
