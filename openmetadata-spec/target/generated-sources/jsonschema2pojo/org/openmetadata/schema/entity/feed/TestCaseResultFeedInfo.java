
package org.openmetadata.schema.entity.feed;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.tests.ResultSummary;
import org.openmetadata.schema.tests.TestCaseParameterValue;
import org.openmetadata.schema.tests.type.TestCaseResult;


/**
 * TestCaseResultFeedInfo
 * <p>
 * This schema defines the schema for Test Case Result Updates for Feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parameterValues",
    "entityTestResultSummary",
    "testCaseResult"
})
@Generated("jsonschema2pojo")
public class TestCaseResultFeedInfo {

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("parameterValues")
    @JsonPropertyDescription("Summary of test case execution")
    @Valid
    private List<TestCaseParameterValue> parameterValues = new ArrayList<TestCaseParameterValue>();
    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("entityTestResultSummary")
    @JsonPropertyDescription("Summary of test case execution")
    @Valid
    private List<ResultSummary> entityTestResultSummary = new ArrayList<ResultSummary>();
    /**
     * Test Case Result for last 7 days.
     * 
     */
    @JsonProperty("testCaseResult")
    @JsonPropertyDescription("Test Case Result for last 7 days.")
    @Valid
    private List<TestCaseResult> testCaseResult = new ArrayList<TestCaseResult>();

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("parameterValues")
    public List<TestCaseParameterValue> getParameterValues() {
        return parameterValues;
    }

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("parameterValues")
    public void setParameterValues(List<TestCaseParameterValue> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public TestCaseResultFeedInfo withParameterValues(List<TestCaseParameterValue> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("entityTestResultSummary")
    public List<ResultSummary> getEntityTestResultSummary() {
        return entityTestResultSummary;
    }

    /**
     * Summary of test case execution
     * 
     */
    @JsonProperty("entityTestResultSummary")
    public void setEntityTestResultSummary(List<ResultSummary> entityTestResultSummary) {
        this.entityTestResultSummary = entityTestResultSummary;
    }

    public TestCaseResultFeedInfo withEntityTestResultSummary(List<ResultSummary> entityTestResultSummary) {
        this.entityTestResultSummary = entityTestResultSummary;
        return this;
    }

    /**
     * Test Case Result for last 7 days.
     * 
     */
    @JsonProperty("testCaseResult")
    public List<TestCaseResult> getTestCaseResult() {
        return testCaseResult;
    }

    /**
     * Test Case Result for last 7 days.
     * 
     */
    @JsonProperty("testCaseResult")
    public void setTestCaseResult(List<TestCaseResult> testCaseResult) {
        this.testCaseResult = testCaseResult;
    }

    public TestCaseResultFeedInfo withTestCaseResult(List<TestCaseResult> testCaseResult) {
        this.testCaseResult = testCaseResult;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseResultFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("parameterValues");
        sb.append('=');
        sb.append(((this.parameterValues == null)?"<null>":this.parameterValues));
        sb.append(',');
        sb.append("entityTestResultSummary");
        sb.append('=');
        sb.append(((this.entityTestResultSummary == null)?"<null>":this.entityTestResultSummary));
        sb.append(',');
        sb.append("testCaseResult");
        sb.append('=');
        sb.append(((this.testCaseResult == null)?"<null>":this.testCaseResult));
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
        result = ((result* 31)+((this.testCaseResult == null)? 0 :this.testCaseResult.hashCode()));
        result = ((result* 31)+((this.parameterValues == null)? 0 :this.parameterValues.hashCode()));
        result = ((result* 31)+((this.entityTestResultSummary == null)? 0 :this.entityTestResultSummary.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseResultFeedInfo) == false) {
            return false;
        }
        TestCaseResultFeedInfo rhs = ((TestCaseResultFeedInfo) other);
        return ((((this.testCaseResult == rhs.testCaseResult)||((this.testCaseResult!= null)&&this.testCaseResult.equals(rhs.testCaseResult)))&&((this.parameterValues == rhs.parameterValues)||((this.parameterValues!= null)&&this.parameterValues.equals(rhs.parameterValues))))&&((this.entityTestResultSummary == rhs.entityTestResultSummary)||((this.entityTestResultSummary!= null)&&this.entityTestResultSummary.equals(rhs.entityTestResultSummary))));
    }

}
