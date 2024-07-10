
package org.openmetadata.schema.api.configuration.profiler;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.profiler.MetricType;
import org.openmetadata.schema.type.ColumnDataType;


/**
 * This schema defines the parameters that can be passed for a Test Case.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataType",
    "metrics",
    "disabled"
})
@Generated("jsonschema2pojo")
public class MetricConfigurationDefinition {

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("dataType")
    @JsonPropertyDescription("This enum defines the type of data stored in a column.")
    private ColumnDataType dataType;
    @JsonProperty("metrics")
    @Valid
    private List<MetricType> metrics = new ArrayList<MetricType>();
    /**
     * If true, the metric will not be computed for the data type.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("If true, the metric will not be computed for the data type.")
    private Boolean disabled = false;

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("dataType")
    public ColumnDataType getDataType() {
        return dataType;
    }

    /**
     * This enum defines the type of data stored in a column.
     * 
     */
    @JsonProperty("dataType")
    public void setDataType(ColumnDataType dataType) {
        this.dataType = dataType;
    }

    public MetricConfigurationDefinition withDataType(ColumnDataType dataType) {
        this.dataType = dataType;
        return this;
    }

    @JsonProperty("metrics")
    public List<MetricType> getMetrics() {
        return metrics;
    }

    @JsonProperty("metrics")
    public void setMetrics(List<MetricType> metrics) {
        this.metrics = metrics;
    }

    public MetricConfigurationDefinition withMetrics(List<MetricType> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * If true, the metric will not be computed for the data type.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * If true, the metric will not be computed for the data type.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public MetricConfigurationDefinition withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MetricConfigurationDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataType");
        sb.append('=');
        sb.append(((this.dataType == null)?"<null>":this.dataType));
        sb.append(',');
        sb.append("metrics");
        sb.append('=');
        sb.append(((this.metrics == null)?"<null>":this.metrics));
        sb.append(',');
        sb.append("disabled");
        sb.append('=');
        sb.append(((this.disabled == null)?"<null>":this.disabled));
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
        result = ((result* 31)+((this.disabled == null)? 0 :this.disabled.hashCode()));
        result = ((result* 31)+((this.dataType == null)? 0 :this.dataType.hashCode()));
        result = ((result* 31)+((this.metrics == null)? 0 :this.metrics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MetricConfigurationDefinition) == false) {
            return false;
        }
        MetricConfigurationDefinition rhs = ((MetricConfigurationDefinition) other);
        return ((((this.disabled == rhs.disabled)||((this.disabled!= null)&&this.disabled.equals(rhs.disabled)))&&((this.dataType == rhs.dataType)||((this.dataType!= null)&&this.dataType.equals(rhs.dataType))))&&((this.metrics == rhs.metrics)||((this.metrics!= null)&&this.metrics.equals(rhs.metrics))));
    }

}
