
package org.openmetadata.schema.tests.type;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;


/**
 * Resolved
 * <p>
 * test case failure details for resolved failures
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "testCaseFailureReason",
    "testCaseFailureComment",
    "resolvedBy"
})
@Generated("jsonschema2pojo")
public class Resolved {

    /**
     * Reason of Test Case initial failure.
     * (Required)
     * 
     */
    @JsonProperty("testCaseFailureReason")
    @JsonPropertyDescription("Reason of Test Case initial failure.")
    @NotNull
    private TestCaseFailureReasonType testCaseFailureReason;
    /**
     * Test case failure resolution comment.
     * (Required)
     * 
     */
    @JsonProperty("testCaseFailureComment")
    @JsonPropertyDescription("Test case failure resolution comment.")
    @NotNull
    private String testCaseFailureComment;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("resolvedBy")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference resolvedBy;

    /**
     * Reason of Test Case initial failure.
     * (Required)
     * 
     */
    @JsonProperty("testCaseFailureReason")
    public TestCaseFailureReasonType getTestCaseFailureReason() {
        return testCaseFailureReason;
    }

    /**
     * Reason of Test Case initial failure.
     * (Required)
     * 
     */
    @JsonProperty("testCaseFailureReason")
    public void setTestCaseFailureReason(TestCaseFailureReasonType testCaseFailureReason) {
        this.testCaseFailureReason = testCaseFailureReason;
    }

    public Resolved withTestCaseFailureReason(TestCaseFailureReasonType testCaseFailureReason) {
        this.testCaseFailureReason = testCaseFailureReason;
        return this;
    }

    /**
     * Test case failure resolution comment.
     * (Required)
     * 
     */
    @JsonProperty("testCaseFailureComment")
    public String getTestCaseFailureComment() {
        return testCaseFailureComment;
    }

    /**
     * Test case failure resolution comment.
     * (Required)
     * 
     */
    @JsonProperty("testCaseFailureComment")
    public void setTestCaseFailureComment(String testCaseFailureComment) {
        this.testCaseFailureComment = testCaseFailureComment;
    }

    public Resolved withTestCaseFailureComment(String testCaseFailureComment) {
        this.testCaseFailureComment = testCaseFailureComment;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("resolvedBy")
    public EntityReference getResolvedBy() {
        return resolvedBy;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("resolvedBy")
    public void setResolvedBy(EntityReference resolvedBy) {
        this.resolvedBy = resolvedBy;
    }

    public Resolved withResolvedBy(EntityReference resolvedBy) {
        this.resolvedBy = resolvedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resolved.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("testCaseFailureReason");
        sb.append('=');
        sb.append(((this.testCaseFailureReason == null)?"<null>":this.testCaseFailureReason));
        sb.append(',');
        sb.append("testCaseFailureComment");
        sb.append('=');
        sb.append(((this.testCaseFailureComment == null)?"<null>":this.testCaseFailureComment));
        sb.append(',');
        sb.append("resolvedBy");
        sb.append('=');
        sb.append(((this.resolvedBy == null)?"<null>":this.resolvedBy));
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
        result = ((result* 31)+((this.testCaseFailureReason == null)? 0 :this.testCaseFailureReason.hashCode()));
        result = ((result* 31)+((this.testCaseFailureComment == null)? 0 :this.testCaseFailureComment.hashCode()));
        result = ((result* 31)+((this.resolvedBy == null)? 0 :this.resolvedBy.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resolved) == false) {
            return false;
        }
        Resolved rhs = ((Resolved) other);
        return ((((this.testCaseFailureReason == rhs.testCaseFailureReason)||((this.testCaseFailureReason!= null)&&this.testCaseFailureReason.equals(rhs.testCaseFailureReason)))&&((this.testCaseFailureComment == rhs.testCaseFailureComment)||((this.testCaseFailureComment!= null)&&this.testCaseFailureComment.equals(rhs.testCaseFailureComment))))&&((this.resolvedBy == rhs.resolvedBy)||((this.resolvedBy!= null)&&this.resolvedBy.equals(rhs.resolvedBy))));
    }

}
