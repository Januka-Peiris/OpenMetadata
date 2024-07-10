
package org.openmetadata.schema.api.tests;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.tests.type.Severity;
import org.openmetadata.schema.tests.type.TestCaseResolutionStatusTypes;


/**
 * CreateTestCaseResolutionStatus
 * <p>
 * Schema to create a new test case result resolution status.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "testCaseResolutionStatusType",
    "testCaseResolutionStatusDetails",
    "testCaseReference",
    "severity"
})
@Generated("jsonschema2pojo")
public class CreateTestCaseResolutionStatus {

    /**
     * Test case resolution status type.
     * (Required)
     * 
     */
    @JsonProperty("testCaseResolutionStatusType")
    @JsonPropertyDescription("Test case resolution status type.")
    @NotNull
    private TestCaseResolutionStatusTypes testCaseResolutionStatusType;
    /**
     * Details of the test case failure status.
     * 
     */
    @JsonProperty("testCaseResolutionStatusDetails")
    @JsonPropertyDescription("Details of the test case failure status.")
    private Object testCaseResolutionStatusDetails = null;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("testCaseReference")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String testCaseReference;
    /**
     * Test case resolution status type.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Test case resolution status type.")
    private Severity severity;

    /**
     * Test case resolution status type.
     * (Required)
     * 
     */
    @JsonProperty("testCaseResolutionStatusType")
    public TestCaseResolutionStatusTypes getTestCaseResolutionStatusType() {
        return testCaseResolutionStatusType;
    }

    /**
     * Test case resolution status type.
     * (Required)
     * 
     */
    @JsonProperty("testCaseResolutionStatusType")
    public void setTestCaseResolutionStatusType(TestCaseResolutionStatusTypes testCaseResolutionStatusType) {
        this.testCaseResolutionStatusType = testCaseResolutionStatusType;
    }

    public CreateTestCaseResolutionStatus withTestCaseResolutionStatusType(TestCaseResolutionStatusTypes testCaseResolutionStatusType) {
        this.testCaseResolutionStatusType = testCaseResolutionStatusType;
        return this;
    }

    /**
     * Details of the test case failure status.
     * 
     */
    @JsonProperty("testCaseResolutionStatusDetails")
    public Object getTestCaseResolutionStatusDetails() {
        return testCaseResolutionStatusDetails;
    }

    /**
     * Details of the test case failure status.
     * 
     */
    @JsonProperty("testCaseResolutionStatusDetails")
    public void setTestCaseResolutionStatusDetails(Object testCaseResolutionStatusDetails) {
        this.testCaseResolutionStatusDetails = testCaseResolutionStatusDetails;
    }

    public CreateTestCaseResolutionStatus withTestCaseResolutionStatusDetails(Object testCaseResolutionStatusDetails) {
        this.testCaseResolutionStatusDetails = testCaseResolutionStatusDetails;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("testCaseReference")
    public String getTestCaseReference() {
        return testCaseReference;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("testCaseReference")
    public void setTestCaseReference(String testCaseReference) {
        this.testCaseReference = testCaseReference;
    }

    public CreateTestCaseResolutionStatus withTestCaseReference(String testCaseReference) {
        this.testCaseReference = testCaseReference;
        return this;
    }

    /**
     * Test case resolution status type.
     * 
     */
    @JsonProperty("severity")
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Test case resolution status type.
     * 
     */
    @JsonProperty("severity")
    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public CreateTestCaseResolutionStatus withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateTestCaseResolutionStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("testCaseResolutionStatusType");
        sb.append('=');
        sb.append(((this.testCaseResolutionStatusType == null)?"<null>":this.testCaseResolutionStatusType));
        sb.append(',');
        sb.append("testCaseResolutionStatusDetails");
        sb.append('=');
        sb.append(((this.testCaseResolutionStatusDetails == null)?"<null>":this.testCaseResolutionStatusDetails));
        sb.append(',');
        sb.append("testCaseReference");
        sb.append('=');
        sb.append(((this.testCaseReference == null)?"<null>":this.testCaseReference));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
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
        result = ((result* 31)+((this.severity == null)? 0 :this.severity.hashCode()));
        result = ((result* 31)+((this.testCaseResolutionStatusType == null)? 0 :this.testCaseResolutionStatusType.hashCode()));
        result = ((result* 31)+((this.testCaseReference == null)? 0 :this.testCaseReference.hashCode()));
        result = ((result* 31)+((this.testCaseResolutionStatusDetails == null)? 0 :this.testCaseResolutionStatusDetails.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateTestCaseResolutionStatus) == false) {
            return false;
        }
        CreateTestCaseResolutionStatus rhs = ((CreateTestCaseResolutionStatus) other);
        return (((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.testCaseResolutionStatusType == rhs.testCaseResolutionStatusType)||((this.testCaseResolutionStatusType!= null)&&this.testCaseResolutionStatusType.equals(rhs.testCaseResolutionStatusType))))&&((this.testCaseReference == rhs.testCaseReference)||((this.testCaseReference!= null)&&this.testCaseReference.equals(rhs.testCaseReference))))&&((this.testCaseResolutionStatusDetails == rhs.testCaseResolutionStatusDetails)||((this.testCaseResolutionStatusDetails!= null)&&this.testCaseResolutionStatusDetails.equals(rhs.testCaseResolutionStatusDetails))));
    }

}
