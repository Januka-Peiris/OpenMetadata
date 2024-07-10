
package org.openmetadata.schema.api.feed;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.tests.type.TestCaseFailureReasonType;


/**
 * ResolveTaskRequest
 * <p>
 * Resolve Task request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "newValue",
    "testCaseFailureReason",
    "testCaseFQN"
})
@Generated("jsonschema2pojo")
public class ResolveTask {

    /**
     * The new value object that needs to be updated to resolve the task.
     * (Required)
     * 
     */
    @JsonProperty("newValue")
    @JsonPropertyDescription("The new value object that needs to be updated to resolve the task.")
    @NotNull
    private String newValue;
    /**
     * Reason of Test Case initial failure.
     * 
     */
    @JsonProperty("testCaseFailureReason")
    @JsonPropertyDescription("Reason of Test Case initial failure.")
    private TestCaseFailureReasonType testCaseFailureReason;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("testCaseFQN")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String testCaseFQN;

    /**
     * The new value object that needs to be updated to resolve the task.
     * (Required)
     * 
     */
    @JsonProperty("newValue")
    public String getNewValue() {
        return newValue;
    }

    /**
     * The new value object that needs to be updated to resolve the task.
     * (Required)
     * 
     */
    @JsonProperty("newValue")
    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ResolveTask withNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    /**
     * Reason of Test Case initial failure.
     * 
     */
    @JsonProperty("testCaseFailureReason")
    public TestCaseFailureReasonType getTestCaseFailureReason() {
        return testCaseFailureReason;
    }

    /**
     * Reason of Test Case initial failure.
     * 
     */
    @JsonProperty("testCaseFailureReason")
    public void setTestCaseFailureReason(TestCaseFailureReasonType testCaseFailureReason) {
        this.testCaseFailureReason = testCaseFailureReason;
    }

    public ResolveTask withTestCaseFailureReason(TestCaseFailureReasonType testCaseFailureReason) {
        this.testCaseFailureReason = testCaseFailureReason;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("testCaseFQN")
    public String getTestCaseFQN() {
        return testCaseFQN;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("testCaseFQN")
    public void setTestCaseFQN(String testCaseFQN) {
        this.testCaseFQN = testCaseFQN;
    }

    public ResolveTask withTestCaseFQN(String testCaseFQN) {
        this.testCaseFQN = testCaseFQN;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ResolveTask.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("newValue");
        sb.append('=');
        sb.append(((this.newValue == null)?"<null>":this.newValue));
        sb.append(',');
        sb.append("testCaseFailureReason");
        sb.append('=');
        sb.append(((this.testCaseFailureReason == null)?"<null>":this.testCaseFailureReason));
        sb.append(',');
        sb.append("testCaseFQN");
        sb.append('=');
        sb.append(((this.testCaseFQN == null)?"<null>":this.testCaseFQN));
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
        result = ((result* 31)+((this.newValue == null)? 0 :this.newValue.hashCode()));
        result = ((result* 31)+((this.testCaseFailureReason == null)? 0 :this.testCaseFailureReason.hashCode()));
        result = ((result* 31)+((this.testCaseFQN == null)? 0 :this.testCaseFQN.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResolveTask) == false) {
            return false;
        }
        ResolveTask rhs = ((ResolveTask) other);
        return ((((this.newValue == rhs.newValue)||((this.newValue!= null)&&this.newValue.equals(rhs.newValue)))&&((this.testCaseFailureReason == rhs.testCaseFailureReason)||((this.testCaseFailureReason!= null)&&this.testCaseFailureReason.equals(rhs.testCaseFailureReason))))&&((this.testCaseFQN == rhs.testCaseFQN)||((this.testCaseFQN!= null)&&this.testCaseFQN.equals(rhs.testCaseFQN))));
    }

}
