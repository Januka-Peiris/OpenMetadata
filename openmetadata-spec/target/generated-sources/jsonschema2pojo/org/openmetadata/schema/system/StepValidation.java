
package org.openmetadata.schema.system;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "passed",
    "message"
})
@Generated("jsonschema2pojo")
public class StepValidation {

    /**
     * Validation description. What is being tested?
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Validation description. What is being tested?")
    private String description;
    /**
     * Did the step validation successfully?
     * 
     */
    @JsonProperty("passed")
    @JsonPropertyDescription("Did the step validation successfully?")
    private Boolean passed;
    /**
     * Results or exceptions to be shared after running the test.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Results or exceptions to be shared after running the test.")
    private String message = null;

    /**
     * Validation description. What is being tested?
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Validation description. What is being tested?
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public StepValidation withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Did the step validation successfully?
     * 
     */
    @JsonProperty("passed")
    public Boolean getPassed() {
        return passed;
    }

    /**
     * Did the step validation successfully?
     * 
     */
    @JsonProperty("passed")
    public void setPassed(Boolean passed) {
        this.passed = passed;
    }

    public StepValidation withPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    /**
     * Results or exceptions to be shared after running the test.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Results or exceptions to be shared after running the test.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public StepValidation withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StepValidation.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("passed");
        sb.append('=');
        sb.append(((this.passed == null)?"<null>":this.passed));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.passed == null)? 0 :this.passed.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StepValidation) == false) {
            return false;
        }
        StepValidation rhs = ((StepValidation) other);
        return ((((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message)))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.passed == rhs.passed)||((this.passed!= null)&&this.passed.equals(rhs.passed))));
    }

}
