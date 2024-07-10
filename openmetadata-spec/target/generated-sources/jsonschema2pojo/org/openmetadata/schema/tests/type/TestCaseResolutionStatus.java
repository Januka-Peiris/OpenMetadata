
package org.openmetadata.schema.tests.type;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.EntityTimeSeriesInterface;
import org.openmetadata.schema.type.EntityReference;


/**
 * TestCaseResolutionStatus
 * <p>
 * Schema to capture test case resolution status.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "stateId",
    "timestamp",
    "testCaseResolutionStatusType",
    "testCaseResolutionStatusDetails",
    "updatedBy",
    "updatedAt",
    "testCaseReference",
    "severity"
})
@Generated("jsonschema2pojo")
public class TestCaseResolutionStatus implements EntityTimeSeriesInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("stateId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID stateId;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("timestamp")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long timestamp;
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
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference updatedBy;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("testCaseReference")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference testCaseReference;
    /**
     * Test case resolution status type.
     * 
     */
    @JsonProperty("severity")
    @JsonPropertyDescription("Test case resolution status type.")
    private Severity severity;

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    public TestCaseResolutionStatus withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("stateId")
    public UUID getStateId() {
        return stateId;
    }

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("stateId")
    public void setStateId(UUID stateId) {
        this.stateId = stateId;
    }

    public TestCaseResolutionStatus withStateId(UUID stateId) {
        this.stateId = stateId;
        return this;
    }

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

    public TestCaseResolutionStatus withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

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

    public TestCaseResolutionStatus withTestCaseResolutionStatusType(TestCaseResolutionStatusTypes testCaseResolutionStatusType) {
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

    public TestCaseResolutionStatus withTestCaseResolutionStatusDetails(Object testCaseResolutionStatusDetails) {
        this.testCaseResolutionStatusDetails = testCaseResolutionStatusDetails;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedBy")
    public EntityReference getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(EntityReference updatedBy) {
        this.updatedBy = updatedBy;
    }

    public TestCaseResolutionStatus withUpdatedBy(EntityReference updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TestCaseResolutionStatus withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("testCaseReference")
    public EntityReference getTestCaseReference() {
        return testCaseReference;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("testCaseReference")
    public void setTestCaseReference(EntityReference testCaseReference) {
        this.testCaseReference = testCaseReference;
    }

    public TestCaseResolutionStatus withTestCaseReference(EntityReference testCaseReference) {
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

    public TestCaseResolutionStatus withSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCaseResolutionStatus.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("stateId");
        sb.append('=');
        sb.append(((this.stateId == null)?"<null>":this.stateId));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("testCaseResolutionStatusType");
        sb.append('=');
        sb.append(((this.testCaseResolutionStatusType == null)?"<null>":this.testCaseResolutionStatusType));
        sb.append(',');
        sb.append("testCaseResolutionStatusDetails");
        sb.append('=');
        sb.append(((this.testCaseResolutionStatusDetails == null)?"<null>":this.testCaseResolutionStatusDetails));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
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
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.stateId == null)? 0 :this.stateId.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.testCaseReference == null)? 0 :this.testCaseReference.hashCode()));
        result = ((result* 31)+((this.testCaseResolutionStatusDetails == null)? 0 :this.testCaseResolutionStatusDetails.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCaseResolutionStatus) == false) {
            return false;
        }
        TestCaseResolutionStatus rhs = ((TestCaseResolutionStatus) other);
        return ((((((((((this.severity == rhs.severity)||((this.severity!= null)&&this.severity.equals(rhs.severity)))&&((this.testCaseResolutionStatusType == rhs.testCaseResolutionStatusType)||((this.testCaseResolutionStatusType!= null)&&this.testCaseResolutionStatusType.equals(rhs.testCaseResolutionStatusType))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.stateId == rhs.stateId)||((this.stateId!= null)&&this.stateId.equals(rhs.stateId))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.testCaseReference == rhs.testCaseReference)||((this.testCaseReference!= null)&&this.testCaseReference.equals(rhs.testCaseReference))))&&((this.testCaseResolutionStatusDetails == rhs.testCaseResolutionStatusDetails)||((this.testCaseResolutionStatusDetails!= null)&&this.testCaseResolutionStatusDetails.equals(rhs.testCaseResolutionStatusDetails))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
