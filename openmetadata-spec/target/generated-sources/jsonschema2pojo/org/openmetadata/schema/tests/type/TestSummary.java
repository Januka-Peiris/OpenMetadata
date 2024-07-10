
package org.openmetadata.schema.tests.type;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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


/**
 * Schema to capture test case execution summary.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success",
    "failed",
    "aborted",
    "queued",
    "total",
    "columnTestSummary"
})
@Generated("jsonschema2pojo")
public class TestSummary {

    /**
     * Number of test cases that passed.
     * 
     */
    @JsonProperty("success")
    @JsonPropertyDescription("Number of test cases that passed.")
    private Integer success;
    /**
     * Number of test cases that failed.
     * 
     */
    @JsonProperty("failed")
    @JsonPropertyDescription("Number of test cases that failed.")
    private Integer failed;
    /**
     * Number of test cases that aborted.
     * 
     */
    @JsonProperty("aborted")
    @JsonPropertyDescription("Number of test cases that aborted.")
    private Integer aborted;
    /**
     * Number of test cases that are queued for execution.
     * 
     */
    @JsonProperty("queued")
    @JsonPropertyDescription("Number of test cases that are queued for execution.")
    private Integer queued;
    /**
     * Total number of test cases.
     * 
     */
    @JsonProperty("total")
    @JsonPropertyDescription("Total number of test cases.")
    private Integer total;
    @JsonProperty("columnTestSummary")
    @Valid
    private List<ColumnTestSummaryDefinition> columnTestSummary = new ArrayList<ColumnTestSummaryDefinition>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Number of test cases that passed.
     * 
     */
    @JsonProperty("success")
    public Integer getSuccess() {
        return success;
    }

    /**
     * Number of test cases that passed.
     * 
     */
    @JsonProperty("success")
    public void setSuccess(Integer success) {
        this.success = success;
    }

    public TestSummary withSuccess(Integer success) {
        this.success = success;
        return this;
    }

    /**
     * Number of test cases that failed.
     * 
     */
    @JsonProperty("failed")
    public Integer getFailed() {
        return failed;
    }

    /**
     * Number of test cases that failed.
     * 
     */
    @JsonProperty("failed")
    public void setFailed(Integer failed) {
        this.failed = failed;
    }

    public TestSummary withFailed(Integer failed) {
        this.failed = failed;
        return this;
    }

    /**
     * Number of test cases that aborted.
     * 
     */
    @JsonProperty("aborted")
    public Integer getAborted() {
        return aborted;
    }

    /**
     * Number of test cases that aborted.
     * 
     */
    @JsonProperty("aborted")
    public void setAborted(Integer aborted) {
        this.aborted = aborted;
    }

    public TestSummary withAborted(Integer aborted) {
        this.aborted = aborted;
        return this;
    }

    /**
     * Number of test cases that are queued for execution.
     * 
     */
    @JsonProperty("queued")
    public Integer getQueued() {
        return queued;
    }

    /**
     * Number of test cases that are queued for execution.
     * 
     */
    @JsonProperty("queued")
    public void setQueued(Integer queued) {
        this.queued = queued;
    }

    public TestSummary withQueued(Integer queued) {
        this.queued = queued;
        return this;
    }

    /**
     * Total number of test cases.
     * 
     */
    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    /**
     * Total number of test cases.
     * 
     */
    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public TestSummary withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("columnTestSummary")
    public List<ColumnTestSummaryDefinition> getColumnTestSummary() {
        return columnTestSummary;
    }

    @JsonProperty("columnTestSummary")
    public void setColumnTestSummary(List<ColumnTestSummaryDefinition> columnTestSummary) {
        this.columnTestSummary = columnTestSummary;
    }

    public TestSummary withColumnTestSummary(List<ColumnTestSummaryDefinition> columnTestSummary) {
        this.columnTestSummary = columnTestSummary;
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

    public TestSummary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestSummary.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        sb.append("failed");
        sb.append('=');
        sb.append(((this.failed == null)?"<null>":this.failed));
        sb.append(',');
        sb.append("aborted");
        sb.append('=');
        sb.append(((this.aborted == null)?"<null>":this.aborted));
        sb.append(',');
        sb.append("queued");
        sb.append('=');
        sb.append(((this.queued == null)?"<null>":this.queued));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("columnTestSummary");
        sb.append('=');
        sb.append(((this.columnTestSummary == null)?"<null>":this.columnTestSummary));
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
        result = ((result* 31)+((this.total == null)? 0 :this.total.hashCode()));
        result = ((result* 31)+((this.success == null)? 0 :this.success.hashCode()));
        result = ((result* 31)+((this.aborted == null)? 0 :this.aborted.hashCode()));
        result = ((result* 31)+((this.queued == null)? 0 :this.queued.hashCode()));
        result = ((result* 31)+((this.columnTestSummary == null)? 0 :this.columnTestSummary.hashCode()));
        result = ((result* 31)+((this.failed == null)? 0 :this.failed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestSummary) == false) {
            return false;
        }
        TestSummary rhs = ((TestSummary) other);
        return ((((((((this.total == rhs.total)||((this.total!= null)&&this.total.equals(rhs.total)))&&((this.success == rhs.success)||((this.success!= null)&&this.success.equals(rhs.success))))&&((this.aborted == rhs.aborted)||((this.aborted!= null)&&this.aborted.equals(rhs.aborted))))&&((this.queued == rhs.queued)||((this.queued!= null)&&this.queued.equals(rhs.queued))))&&((this.columnTestSummary == rhs.columnTestSummary)||((this.columnTestSummary!= null)&&this.columnTestSummary.equals(rhs.columnTestSummary))))&&((this.failed == rhs.failed)||((this.failed!= null)&&this.failed.equals(rhs.failed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
