
package org.openmetadata.schema.tests;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.EntityInterface;
import org.openmetadata.schema.tests.type.TestCaseResult;
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TableData;
import org.openmetadata.schema.type.TagLabel;


/**
 * TestCase
 * <p>
 * Test case is a test definition to capture data quality tests against tables, columns, and other data assets.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "testDefinition",
    "entityLink",
    "entityFQN",
    "testSuite",
    "testSuites",
    "parameterValues",
    "testCaseResult",
    "version",
    "owner",
    "updatedAt",
    "updatedBy",
    "href",
    "changeDescription",
    "deleted",
    "computePassedFailedRowCount",
    "incidentId",
    "failedRowsSample",
    "inspectionQuery",
    "domain",
    "useDynamicAssertion",
    "tags"
})
@Generated("jsonschema2pojo")
public class TestCase implements EntityInterface
{

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Name that identifies a test definition and test case.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies a test definition and test case.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this test.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this test.")
    private String displayName;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("testDefinition")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference testDefinition;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("entityLink")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "(?U)^<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    @NotNull
    private String entityLink;
    @JsonProperty("entityFQN")
    private String entityFQN;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("testSuite")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    @NotNull
    private EntityReference testSuite;
    @JsonProperty("testSuites")
    @Valid
    private List<TestSuite> testSuites = new ArrayList<TestSuite>();
    @JsonProperty("parameterValues")
    @Valid
    private List<TestCaseParameterValue> parameterValues = new ArrayList<TestCaseParameterValue>();
    /**
     * Schema to capture test case result.
     * 
     */
    @JsonProperty("testCaseResult")
    @JsonPropertyDescription("Schema to capture test case result.")
    @Valid
    private TestCaseResult testCaseResult;
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double version = 0.1D;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User who made the update.")
    private String updatedBy;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    @JsonPropertyDescription("Description of the change.")
    @Valid
    private ChangeDescription changeDescription;
    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    @JsonPropertyDescription("When `true` indicates the entity has been soft deleted.")
    private Boolean deleted = false;
    /**
     * Compute the passed and failed row count for the test case.
     * 
     */
    @JsonProperty("computePassedFailedRowCount")
    @JsonPropertyDescription("Compute the passed and failed row count for the test case.")
    private Boolean computePassedFailedRowCount = false;
    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("incidentId")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID incidentId;
    /**
     * This schema defines the type to capture rows of sample data for a table.
     * 
     */
    @JsonProperty("failedRowsSample")
    @JsonPropertyDescription("This schema defines the type to capture rows of sample data for a table.")
    @Valid
    private TableData failedRowsSample;
    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("inspectionQuery")
    @JsonPropertyDescription("SQL query statement. Example - 'select * from orders'.")
    private String inspectionQuery;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference domain;
    /**
     * If the test definition supports it, use dynamic assertion to evaluate the test case.
     * 
     */
    @JsonProperty("useDynamicAssertion")
    @JsonPropertyDescription("If the test definition supports it, use dynamic assertion to evaluate the test case.")
    private Boolean useDynamicAssertion = false;
    /**
     * Tags for this test case. This is an inherited field from the parent entity and is not set directly on the test case.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this test case. This is an inherited field from the parent entity and is not set directly on the test case.")
    @Valid
    private List<TagLabel> tags = null;

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

    public TestCase withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Name that identifies a test definition and test case.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies a test definition and test case.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public TestCase withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this test.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this test.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TestCase withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    public void setFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
    }

    public TestCase withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TestCase withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("testDefinition")
    public EntityReference getTestDefinition() {
        return testDefinition;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("testDefinition")
    public void setTestDefinition(EntityReference testDefinition) {
        this.testDefinition = testDefinition;
    }

    public TestCase withTestDefinition(EntityReference testDefinition) {
        this.testDefinition = testDefinition;
        return this;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("entityLink")
    public String getEntityLink() {
        return entityLink;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * (Required)
     * 
     */
    @JsonProperty("entityLink")
    public void setEntityLink(String entityLink) {
        this.entityLink = entityLink;
    }

    public TestCase withEntityLink(String entityLink) {
        this.entityLink = entityLink;
        return this;
    }

    @JsonProperty("entityFQN")
    public String getEntityFQN() {
        return entityFQN;
    }

    @JsonProperty("entityFQN")
    public void setEntityFQN(String entityFQN) {
        this.entityFQN = entityFQN;
    }

    public TestCase withEntityFQN(String entityFQN) {
        this.entityFQN = entityFQN;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("testSuite")
    public EntityReference getTestSuite() {
        return testSuite;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * (Required)
     * 
     */
    @JsonProperty("testSuite")
    public void setTestSuite(EntityReference testSuite) {
        this.testSuite = testSuite;
    }

    public TestCase withTestSuite(EntityReference testSuite) {
        this.testSuite = testSuite;
        return this;
    }

    @JsonProperty("testSuites")
    public List<TestSuite> getTestSuites() {
        return testSuites;
    }

    @JsonProperty("testSuites")
    public void setTestSuites(List<TestSuite> testSuites) {
        this.testSuites = testSuites;
    }

    public TestCase withTestSuites(List<TestSuite> testSuites) {
        this.testSuites = testSuites;
        return this;
    }

    @JsonProperty("parameterValues")
    public List<TestCaseParameterValue> getParameterValues() {
        return parameterValues;
    }

    @JsonProperty("parameterValues")
    public void setParameterValues(List<TestCaseParameterValue> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public TestCase withParameterValues(List<TestCaseParameterValue> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    /**
     * Schema to capture test case result.
     * 
     */
    @JsonProperty("testCaseResult")
    public TestCaseResult getTestCaseResult() {
        return testCaseResult;
    }

    /**
     * Schema to capture test case result.
     * 
     */
    @JsonProperty("testCaseResult")
    public void setTestCaseResult(TestCaseResult testCaseResult) {
        this.testCaseResult = testCaseResult;
    }

    public TestCase withTestCaseResult(TestCaseResult testCaseResult) {
        this.testCaseResult = testCaseResult;
        return this;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public Double getVersion() {
        return version;
    }

    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    public void setVersion(Double version) {
        this.version = version;
    }

    public TestCase withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public EntityReference getOwner() {
        return owner;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("owner")
    public void setOwner(EntityReference owner) {
        this.owner = owner;
    }

    public TestCase withOwner(EntityReference owner) {
        this.owner = owner;
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

    public TestCase withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User who made the update.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public TestCase withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public URI getHref() {
        return href;
    }

    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    public void setHref(URI href) {
        this.href = href;
    }

    public TestCase withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public ChangeDescription getChangeDescription() {
        return changeDescription;
    }

    /**
     * Description of the change.
     * 
     */
    @JsonProperty("changeDescription")
    public void setChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
    }

    public TestCase withChangeDescription(ChangeDescription changeDescription) {
        this.changeDescription = changeDescription;
        return this;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * When `true` indicates the entity has been soft deleted.
     * 
     */
    @JsonProperty("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public TestCase withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Compute the passed and failed row count for the test case.
     * 
     */
    @JsonProperty("computePassedFailedRowCount")
    public Boolean getComputePassedFailedRowCount() {
        return computePassedFailedRowCount;
    }

    /**
     * Compute the passed and failed row count for the test case.
     * 
     */
    @JsonProperty("computePassedFailedRowCount")
    public void setComputePassedFailedRowCount(Boolean computePassedFailedRowCount) {
        this.computePassedFailedRowCount = computePassedFailedRowCount;
    }

    public TestCase withComputePassedFailedRowCount(Boolean computePassedFailedRowCount) {
        this.computePassedFailedRowCount = computePassedFailedRowCount;
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

    public TestCase withIncidentId(UUID incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * This schema defines the type to capture rows of sample data for a table.
     * 
     */
    @JsonProperty("failedRowsSample")
    public TableData getFailedRowsSample() {
        return failedRowsSample;
    }

    /**
     * This schema defines the type to capture rows of sample data for a table.
     * 
     */
    @JsonProperty("failedRowsSample")
    public void setFailedRowsSample(TableData failedRowsSample) {
        this.failedRowsSample = failedRowsSample;
    }

    public TestCase withFailedRowsSample(TableData failedRowsSample) {
        this.failedRowsSample = failedRowsSample;
        return this;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("inspectionQuery")
    public String getInspectionQuery() {
        return inspectionQuery;
    }

    /**
     * SQL query statement. Example - 'select * from orders'.@om-field-type
     * 
     */
    @JsonProperty("inspectionQuery")
    public void setInspectionQuery(String inspectionQuery) {
        this.inspectionQuery = inspectionQuery;
    }

    public TestCase withInspectionQuery(String inspectionQuery) {
        this.inspectionQuery = inspectionQuery;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public EntityReference getDomain() {
        return domain;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(EntityReference domain) {
        this.domain = domain;
    }

    public TestCase withDomain(EntityReference domain) {
        this.domain = domain;
        return this;
    }

    /**
     * If the test definition supports it, use dynamic assertion to evaluate the test case.
     * 
     */
    @JsonProperty("useDynamicAssertion")
    public Boolean getUseDynamicAssertion() {
        return useDynamicAssertion;
    }

    /**
     * If the test definition supports it, use dynamic assertion to evaluate the test case.
     * 
     */
    @JsonProperty("useDynamicAssertion")
    public void setUseDynamicAssertion(Boolean useDynamicAssertion) {
        this.useDynamicAssertion = useDynamicAssertion;
    }

    public TestCase withUseDynamicAssertion(Boolean useDynamicAssertion) {
        this.useDynamicAssertion = useDynamicAssertion;
        return this;
    }

    /**
     * Tags for this test case. This is an inherited field from the parent entity and is not set directly on the test case.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this test case. This is an inherited field from the parent entity and is not set directly on the test case.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public TestCase withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestCase.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("testDefinition");
        sb.append('=');
        sb.append(((this.testDefinition == null)?"<null>":this.testDefinition));
        sb.append(',');
        sb.append("entityLink");
        sb.append('=');
        sb.append(((this.entityLink == null)?"<null>":this.entityLink));
        sb.append(',');
        sb.append("entityFQN");
        sb.append('=');
        sb.append(((this.entityFQN == null)?"<null>":this.entityFQN));
        sb.append(',');
        sb.append("testSuite");
        sb.append('=');
        sb.append(((this.testSuite == null)?"<null>":this.testSuite));
        sb.append(',');
        sb.append("testSuites");
        sb.append('=');
        sb.append(((this.testSuites == null)?"<null>":this.testSuites));
        sb.append(',');
        sb.append("parameterValues");
        sb.append('=');
        sb.append(((this.parameterValues == null)?"<null>":this.parameterValues));
        sb.append(',');
        sb.append("testCaseResult");
        sb.append('=');
        sb.append(((this.testCaseResult == null)?"<null>":this.testCaseResult));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("changeDescription");
        sb.append('=');
        sb.append(((this.changeDescription == null)?"<null>":this.changeDescription));
        sb.append(',');
        sb.append("deleted");
        sb.append('=');
        sb.append(((this.deleted == null)?"<null>":this.deleted));
        sb.append(',');
        sb.append("computePassedFailedRowCount");
        sb.append('=');
        sb.append(((this.computePassedFailedRowCount == null)?"<null>":this.computePassedFailedRowCount));
        sb.append(',');
        sb.append("incidentId");
        sb.append('=');
        sb.append(((this.incidentId == null)?"<null>":this.incidentId));
        sb.append(',');
        sb.append("failedRowsSample");
        sb.append('=');
        sb.append(((this.failedRowsSample == null)?"<null>":this.failedRowsSample));
        sb.append(',');
        sb.append("inspectionQuery");
        sb.append('=');
        sb.append(((this.inspectionQuery == null)?"<null>":this.inspectionQuery));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("useDynamicAssertion");
        sb.append('=');
        sb.append(((this.useDynamicAssertion == null)?"<null>":this.useDynamicAssertion));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.testSuite == null)? 0 :this.testSuite.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.useDynamicAssertion == null)? 0 :this.useDynamicAssertion.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.parameterValues == null)? 0 :this.parameterValues.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.failedRowsSample == null)? 0 :this.failedRowsSample.hashCode()));
        result = ((result* 31)+((this.inspectionQuery == null)? 0 :this.inspectionQuery.hashCode()));
        result = ((result* 31)+((this.testSuites == null)? 0 :this.testSuites.hashCode()));
        result = ((result* 31)+((this.entityLink == null)? 0 :this.entityLink.hashCode()));
        result = ((result* 31)+((this.testCaseResult == null)? 0 :this.testCaseResult.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.computePassedFailedRowCount == null)? 0 :this.computePassedFailedRowCount.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.entityFQN == null)? 0 :this.entityFQN.hashCode()));
        result = ((result* 31)+((this.incidentId == null)? 0 :this.incidentId.hashCode()));
        result = ((result* 31)+((this.testDefinition == null)? 0 :this.testDefinition.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestCase) == false) {
            return false;
        }
        TestCase rhs = ((TestCase) other);
        return (((((((((((((((((((((((((((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName)))&&((this.testSuite == rhs.testSuite)||((this.testSuite!= null)&&this.testSuite.equals(rhs.testSuite))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.useDynamicAssertion == rhs.useDynamicAssertion)||((this.useDynamicAssertion!= null)&&this.useDynamicAssertion.equals(rhs.useDynamicAssertion))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.parameterValues == rhs.parameterValues)||((this.parameterValues!= null)&&this.parameterValues.equals(rhs.parameterValues))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.failedRowsSample == rhs.failedRowsSample)||((this.failedRowsSample!= null)&&this.failedRowsSample.equals(rhs.failedRowsSample))))&&((this.inspectionQuery == rhs.inspectionQuery)||((this.inspectionQuery!= null)&&this.inspectionQuery.equals(rhs.inspectionQuery))))&&((this.testSuites == rhs.testSuites)||((this.testSuites!= null)&&this.testSuites.equals(rhs.testSuites))))&&((this.entityLink == rhs.entityLink)||((this.entityLink!= null)&&this.entityLink.equals(rhs.entityLink))))&&((this.testCaseResult == rhs.testCaseResult)||((this.testCaseResult!= null)&&this.testCaseResult.equals(rhs.testCaseResult))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.computePassedFailedRowCount == rhs.computePassedFailedRowCount)||((this.computePassedFailedRowCount!= null)&&this.computePassedFailedRowCount.equals(rhs.computePassedFailedRowCount))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.entityFQN == rhs.entityFQN)||((this.entityFQN!= null)&&this.entityFQN.equals(rhs.entityFQN))))&&((this.incidentId == rhs.incidentId)||((this.incidentId!= null)&&this.incidentId.equals(rhs.incidentId))))&&((this.testDefinition == rhs.testDefinition)||((this.testDefinition!= null)&&this.testDefinition.equals(rhs.testDefinition))));
    }

}
