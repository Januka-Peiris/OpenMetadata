
package org.openmetadata.schema.tests;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.TestCaseParameterValidationRuleType;


/**
 * Validation for the test parameter value.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parameterField",
    "rule"
})
@Generated("jsonschema2pojo")
public class TestCaseParameterValidationRule {

    /**
     * Name of the parameter to validate against.
     * 
     */
    @JsonProperty("parameterField")
    @JsonPropertyDescription("Name of the parameter to validate against.")
    private String parameterField;
    /**
     * This enum defines the type to use for a parameter validation rule.
     * 
     */
    @JsonProperty("rule")
    @JsonPropertyDescription("This enum defines the type to use for a parameter validation rule.")
    private TestCaseParameterValidationRuleType rule;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Name of the parameter to validate against.
     * 
     */
    @JsonProperty("parameterField")
    public String getParameterField() {
        return parameterField;
    }

    /**
     * Name of the parameter to validate against.
     * 
     */
    @JsonProperty("parameterField")
    public void setParameterField(String parameterField) {
        this.parameterField = parameterField;
    }

    public TestCaseParameterValidationRule withParameterField(String parameterField) {
        this.parameterField = parameterField;
        return this;
    }

    /**
     * This enum defines the type to use for a parameter validation rule.
     * 
     */
    @JsonProperty("rule")
    public TestCaseParameterValidationRuleType getRule() {
        return rule;
    }

    /**
     * This enum defines the type to use for a parameter validation rule.
     * 
     */
    @JsonProperty("rule")
    public void setRule(TestCaseParameterValidationRuleType rule) {
        this.rule = rule;
    }

    public TestCaseParameterValidationRule withRule(TestCaseParameterValidationRuleType rule) {
        this.rule = rule;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TestCaseParameterValidationRule withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseParameterValidationRule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parameterField");
        sb.append('=');
        sb.append(((this.parameterField == null)?"<null>":this.parameterField));
        sb.append(',');
        sb.append("rule");
        sb.append('=');
        sb.append(((this.rule == null)?"<null>":this.rule));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.rule == null)? 0 :this.rule.hashCode()));
        result = ((result* 31)+((this.parameterField == null)? 0 :this.parameterField.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseParameterValidationRule) == false) {
            return false;
        }
        TestCaseParameterValidationRule rhs = ((TestCaseParameterValidationRule) other);
        return ((((this.rule == rhs.rule)||((this.rule!= null)&&this.rule.equals(rhs.rule)))&&((this.parameterField == rhs.parameterField)||((this.parameterField!= null)&&this.parameterField.equals(rhs.parameterField))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
