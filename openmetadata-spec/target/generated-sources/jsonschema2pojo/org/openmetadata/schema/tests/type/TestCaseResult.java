
package org.openmetadata.schema.tests.type;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Schema to capture test case result.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "timestamp",
    "testCaseStatus",
    "result",
    "sampleData",
    "testResultValue",
    "passedRows",
    "failedRows",
    "passedRowsPercentage",
    "failedRowsPercentage",
    "incidentId",
    "maxBound",
    "minBound"
})
@Generated("jsonschema2pojo")
public class TestCaseResult {

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
    /**
     * Status of Test Case run.
     * 
     */
    @JsonProperty("testCaseStatus")
    @JsonPropertyDescription("Status of Test Case run.")
    private TestCaseStatus testCaseStatus;
    /**
     * Details of test case results.
     * 
     */
    @JsonProperty("result")
    @JsonPropertyDescription("Details of test case results.")
    private String result;
    /**
     * sample data to capture rows/columns that didn't match the expressed testcase.
     * 
     */
    @JsonProperty("sampleData")
    @JsonPropertyDescription("sample data to capture rows/columns that didn't match the expressed testcase.")
    private String sampleData;
    @JsonProperty("testResultValue")
    @Valid
    private List<TestResultValue> testResultValue = new ArrayList<TestResultValue>();
    /**
     * Number of rows that passed.
     * 
     */
    @JsonProperty("passedRows")
    @JsonPropertyDescription("Number of rows that passed.")
    private Integer passedRows;
    /**
     * Number of rows that failed.
     * 
     */
    @JsonProperty("failedRows")
    @JsonPropertyDescription("Number of rows that failed.")
    private Integer failedRows;
    /**
     * Percentage of rows that passed.
     * 
     */
    @JsonProperty("passedRowsPercentage")
    @JsonPropertyDescription("Percentage of rows that passed.")
    private Double passedRowsPercentage;
    /**
     * Percentage of rows that failed.
     * 
     */
    @JsonProperty("failedRowsPercentage")
    @JsonPropertyDescription("Percentage of rows that failed.")
    private Double failedRowsPercentage;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("incidentId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID incidentId;
    /**
     * Upper bound limit for the test case result as defined in the test definition.
     * 
     */
    @JsonProperty("maxBound")
    @JsonPropertyDescription("Upper bound limit for the test case result as defined in the test definition.")
    private Double maxBound;
    /**
     * Lower bound limit for the test case result as defined in the test definition.
     * 
     */
    @JsonProperty("minBound")
    @JsonPropertyDescription("Lower bound limit for the test case result as defined in the test definition.")
    private Double minBound;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public Long getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public TestCaseResult withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Status of Test Case run.
     * 
     */
    @JsonProperty("testCaseStatus")
    public TestCaseStatus getTestCaseStatus() {
        return testCaseStatus;
    }

    /**
     * Status of Test Case run.
     * 
     */
    @JsonProperty("testCaseStatus")
    public void setTestCaseStatus(TestCaseStatus testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
    }

    public TestCaseResult withTestCaseStatus(TestCaseStatus testCaseStatus) {
        this.testCaseStatus = testCaseStatus;
        return this;
    }

    /**
     * Details of test case results.
     * 
     */
    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    /**
     * Details of test case results.
     * 
     */
    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    public TestCaseResult withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * sample data to capture rows/columns that didn't match the expressed testcase.
     * 
     */
    @JsonProperty("sampleData")
    public String getSampleData() {
        return sampleData;
    }

    /**
     * sample data to capture rows/columns that didn't match the expressed testcase.
     * 
     */
    @JsonProperty("sampleData")
    public void setSampleData(String sampleData) {
        this.sampleData = sampleData;
    }

    public TestCaseResult withSampleData(String sampleData) {
        this.sampleData = sampleData;
        return this;
    }

    @JsonProperty("testResultValue")
    public List<TestResultValue> getTestResultValue() {
        return testResultValue;
    }

    @JsonProperty("testResultValue")
    public void setTestResultValue(List<TestResultValue> testResultValue) {
        this.testResultValue = testResultValue;
    }

    public TestCaseResult withTestResultValue(List<TestResultValue> testResultValue) {
        this.testResultValue = testResultValue;
        return this;
    }

    /**
     * Number of rows that passed.
     * 
     */
    @JsonProperty("passedRows")
    public Integer getPassedRows() {
        return passedRows;
    }

    /**
     * Number of rows that passed.
     * 
     */
    @JsonProperty("passedRows")
    public void setPassedRows(Integer passedRows) {
        this.passedRows = passedRows;
    }

    public TestCaseResult withPassedRows(Integer passedRows) {
        this.passedRows = passedRows;
        return this;
    }

    /**
     * Number of rows that failed.
     * 
     */
    @JsonProperty("failedRows")
    public Integer getFailedRows() {
        return failedRows;
    }

    /**
     * Number of rows that failed.
     * 
     */
    @JsonProperty("failedRows")
    public void setFailedRows(Integer failedRows) {
        this.failedRows = failedRows;
    }

    public TestCaseResult withFailedRows(Integer failedRows) {
        this.failedRows = failedRows;
        return this;
    }

    /**
     * Percentage of rows that passed.
     * 
     */
    @JsonProperty("passedRowsPercentage")
    public Double getPassedRowsPercentage() {
        return passedRowsPercentage;
    }

    /**
     * Percentage of rows that passed.
     * 
     */
    @JsonProperty("passedRowsPercentage")
    public void setPassedRowsPercentage(Double passedRowsPercentage) {
        this.passedRowsPercentage = passedRowsPercentage;
    }

    public TestCaseResult withPassedRowsPercentage(Double passedRowsPercentage) {
        this.passedRowsPercentage = passedRowsPercentage;
        return this;
    }

    /**
     * Percentage of rows that failed.
     * 
     */
    @JsonProperty("failedRowsPercentage")
    public Double getFailedRowsPercentage() {
        return failedRowsPercentage;
    }

    /**
     * Percentage of rows that failed.
     * 
     */
    @JsonProperty("failedRowsPercentage")
    public void setFailedRowsPercentage(Double failedRowsPercentage) {
        this.failedRowsPercentage = failedRowsPercentage;
    }

    public TestCaseResult withFailedRowsPercentage(Double failedRowsPercentage) {
        this.failedRowsPercentage = failedRowsPercentage;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("incidentId")
    public UUID getIncidentId() {
        return incidentId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("incidentId")
    public void setIncidentId(UUID incidentId) {
        this.incidentId = incidentId;
    }

    public TestCaseResult withIncidentId(UUID incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * Upper bound limit for the test case result as defined in the test definition.
     * 
     */
    @JsonProperty("maxBound")
    public Double getMaxBound() {
        return maxBound;
    }

    /**
     * Upper bound limit for the test case result as defined in the test definition.
     * 
     */
    @JsonProperty("maxBound")
    public void setMaxBound(Double maxBound) {
        this.maxBound = maxBound;
    }

    public TestCaseResult withMaxBound(Double maxBound) {
        this.maxBound = maxBound;
        return this;
    }

    /**
     * Lower bound limit for the test case result as defined in the test definition.
     * 
     */
    @JsonProperty("minBound")
    public Double getMinBound() {
        return minBound;
    }

    /**
     * Lower bound limit for the test case result as defined in the test definition.
     * 
     */
    @JsonProperty("minBound")
    public void setMinBound(Double minBound) {
        this.minBound = minBound;
    }

    public TestCaseResult withMinBound(Double minBound) {
        this.minBound = minBound;
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

    public TestCaseResult withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseResult.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("testCaseStatus");
        sb.append('=');
        sb.append(((this.testCaseStatus == null)?"<null>":this.testCaseStatus));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("sampleData");
        sb.append('=');
        sb.append(((this.sampleData == null)?"<null>":this.sampleData));
        sb.append(',');
        sb.append("testResultValue");
        sb.append('=');
        sb.append(((this.testResultValue == null)?"<null>":this.testResultValue));
        sb.append(',');
        sb.append("passedRows");
        sb.append('=');
        sb.append(((this.passedRows == null)?"<null>":this.passedRows));
        sb.append(',');
        sb.append("failedRows");
        sb.append('=');
        sb.append(((this.failedRows == null)?"<null>":this.failedRows));
        sb.append(',');
        sb.append("passedRowsPercentage");
        sb.append('=');
        sb.append(((this.passedRowsPercentage == null)?"<null>":this.passedRowsPercentage));
        sb.append(',');
        sb.append("failedRowsPercentage");
        sb.append('=');
        sb.append(((this.failedRowsPercentage == null)?"<null>":this.failedRowsPercentage));
        sb.append(',');
        sb.append("incidentId");
        sb.append('=');
        sb.append(((this.incidentId == null)?"<null>":this.incidentId));
        sb.append(',');
        sb.append("maxBound");
        sb.append('=');
        sb.append(((this.maxBound == null)?"<null>":this.maxBound));
        sb.append(',');
        sb.append("minBound");
        sb.append('=');
        sb.append(((this.minBound == null)?"<null>":this.minBound));
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
        result = ((result* 31)+((this.testCaseStatus == null)? 0 :this.testCaseStatus.hashCode()));
        result = ((result* 31)+((this.maxBound == null)? 0 :this.maxBound.hashCode()));
        result = ((result* 31)+((this.passedRowsPercentage == null)? 0 :this.passedRowsPercentage.hashCode()));
        result = ((result* 31)+((this.testResultValue == null)? 0 :this.testResultValue.hashCode()));
        result = ((result* 31)+((this.failedRowsPercentage == null)? 0 :this.failedRowsPercentage.hashCode()));
        result = ((result* 31)+((this.passedRows == null)? 0 :this.passedRows.hashCode()));
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.sampleData == null)? 0 :this.sampleData.hashCode()));
        result = ((result* 31)+((this.minBound == null)? 0 :this.minBound.hashCode()));
        result = ((result* 31)+((this.failedRows == null)? 0 :this.failedRows.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.incidentId == null)? 0 :this.incidentId.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseResult) == false) {
            return false;
        }
        TestCaseResult rhs = ((TestCaseResult) other);
        return ((((((((((((((this.testCaseStatus == rhs.testCaseStatus)||((this.testCaseStatus!= null)&&this.testCaseStatus.equals(rhs.testCaseStatus)))&&((this.maxBound == rhs.maxBound)||((this.maxBound!= null)&&this.maxBound.equals(rhs.maxBound))))&&((this.passedRowsPercentage == rhs.passedRowsPercentage)||((this.passedRowsPercentage!= null)&&this.passedRowsPercentage.equals(rhs.passedRowsPercentage))))&&((this.testResultValue == rhs.testResultValue)||((this.testResultValue!= null)&&this.testResultValue.equals(rhs.testResultValue))))&&((this.failedRowsPercentage == rhs.failedRowsPercentage)||((this.failedRowsPercentage!= null)&&this.failedRowsPercentage.equals(rhs.failedRowsPercentage))))&&((this.passedRows == rhs.passedRows)||((this.passedRows!= null)&&this.passedRows.equals(rhs.passedRows))))&&((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result))))&&((this.sampleData == rhs.sampleData)||((this.sampleData!= null)&&this.sampleData.equals(rhs.sampleData))))&&((this.minBound == rhs.minBound)||((this.minBound!= null)&&this.minBound.equals(rhs.minBound))))&&((this.failedRows == rhs.failedRows)||((this.failedRows!= null)&&this.failedRows.equals(rhs.failedRows))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.incidentId == rhs.incidentId)||((this.incidentId!= null)&&this.incidentId.equals(rhs.incidentId))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
