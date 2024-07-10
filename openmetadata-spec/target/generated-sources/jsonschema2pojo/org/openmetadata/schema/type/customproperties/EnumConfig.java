
package org.openmetadata.schema.type.customproperties;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EnumConfig
 * <p>
 * Applies to Enum type, this config is used to define list of enum values
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "multiSelect",
    "values"
})
@Generated("jsonschema2pojo")
public class EnumConfig {

    @JsonProperty("multiSelect")
    private Boolean multiSelect = false;
    @JsonProperty("values")
    @Valid
    private List<String> values = new ArrayList<String>();

    @JsonProperty("multiSelect")
    public Boolean getMultiSelect() {
        return multiSelect;
    }

    @JsonProperty("multiSelect")
    public void setMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
    }

    public EnumConfig withMultiSelect(Boolean multiSelect) {
        this.multiSelect = multiSelect;
        return this;
    }

    @JsonProperty("values")
    public List<String> getValues() {
        return values;
    }

    @JsonProperty("values")
    public void setValues(List<String> values) {
        this.values = values;
    }

    public EnumConfig withValues(List<String> values) {
        this.values = values;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EnumConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("multiSelect");
        sb.append('=');
        sb.append(((this.multiSelect == null)?"<null>":this.multiSelect));
        sb.append(',');
        sb.append("values");
        sb.append('=');
        sb.append(((this.values == null)?"<null>":this.values));
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
        result = ((result* 31)+((this.multiSelect == null)? 0 :this.multiSelect.hashCode()));
        result = ((result* 31)+((this.values == null)? 0 :this.values.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnumConfig) == false) {
            return false;
        }
        EnumConfig rhs = ((EnumConfig) other);
        return (((this.multiSelect == rhs.multiSelect)||((this.multiSelect!= null)&&this.multiSelect.equals(rhs.multiSelect)))&&((this.values == rhs.values)||((this.values!= null)&&this.values.equals(rhs.values))));
    }

}
