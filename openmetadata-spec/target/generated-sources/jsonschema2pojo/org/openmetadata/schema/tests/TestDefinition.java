
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
import org.openmetadata.schema.type.ChangeDescription;
import org.openmetadata.schema.type.ColumnDataType;
import org.openmetadata.schema.type.DataQualityDimensions;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.ProviderType;
import org.openmetadata.schema.type.TestDefinitionEntityType;


/**
 * TestDefinition
 * <p>
 * Test Definition is a type of test using which test cases are created to capture data quality tests against data entities.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "name",
    "displayName",
    "fullyQualifiedName",
    "description",
    "entityType",
    "testPlatforms",
    "supportedDataTypes",
    "parameterDefinition",
    "datatQualityDimension",
    "owner",
    "provider",
    "version",
    "updatedAt",
    "updatedBy",
    "href",
    "changeDescription",
    "deleted",
    "supportsRowLevelPassedFailed",
    "supportsDynamicAssertion"
})
@Generated("jsonschema2pojo")
public class TestDefinition implements EntityInterface
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
     * Display Name that identifies this test case.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this test case.")
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
     * (Required)
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    @NotNull
    private String description;
    /**
     * This enum defines the type for which this test definition applies to.
     * 
     */
    @JsonProperty("entityType")
    @JsonPropertyDescription("This enum defines the type for which this test definition applies to.")
    private TestDefinitionEntityType entityType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("testPlatforms")
    @Valid
    @NotNull
    private List<TestPlatform> testPlatforms = new ArrayList<TestPlatform>();
    @JsonProperty("supportedDataTypes")
    @Valid
    private List<ColumnDataType> supportedDataTypes = new ArrayList<ColumnDataType>();
    @JsonProperty("parameterDefinition")
    @Valid
    private List<TestCaseParameter> parameterDefinition = new ArrayList<TestCaseParameter>();
    /**
     * This enum defines the dimension a test case belongs to.
     * 
     */
    @JsonProperty("datatQualityDimension")
    @JsonPropertyDescription("This enum defines the dimension a test case belongs to.")
    private DataQualityDimensions datatQualityDimension;
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
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    @JsonPropertyDescription("Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.")
    private ProviderType provider = ProviderType.fromValue("user");
    /**
     * Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.
     * 
     */
    @JsonProperty("version")
    @JsonPropertyDescription("Metadata version of the entity in the form `Major.Minor`. First version always starts from `0.1` when the entity is created. When the backward compatible changes are made to the entity, only the `Minor` version is incremented - example `1.0` is changed to `1.1`. When backward incompatible changes are made the `Major` version is incremented - example `1.1` to `2.0`.")
    private Double version = 0.1D;
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
     * When `true` indicates the test case supports row level passed/failed.
     * 
     */
    @JsonProperty("supportsRowLevelPassedFailed")
    @JsonPropertyDescription("When `true` indicates the test case supports row level passed/failed.")
    private Boolean supportsRowLevelPassedFailed = false;
    /**
     * When `true` indicates the test case supports dynamic assertions.
     * 
     */
    @JsonProperty("supportsDynamicAssertion")
    @JsonPropertyDescription("When `true` indicates the test case supports dynamic assertions.")
    private Boolean supportsDynamicAssertion = false;

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

    public TestDefinition withId(UUID id) {
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

    public TestDefinition withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this test case.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this test case.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TestDefinition withDisplayName(String displayName) {
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

    public TestDefinition withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Text in Markdown format.@om-field-type
     * (Required)
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TestDefinition withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * This enum defines the type for which this test definition applies to.
     * 
     */
    @JsonProperty("entityType")
    public TestDefinitionEntityType getEntityType() {
        return entityType;
    }

    /**
     * This enum defines the type for which this test definition applies to.
     * 
     */
    @JsonProperty("entityType")
    public void setEntityType(TestDefinitionEntityType entityType) {
        this.entityType = entityType;
    }

    public TestDefinition withEntityType(TestDefinitionEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("testPlatforms")
    public List<TestPlatform> getTestPlatforms() {
        return testPlatforms;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("testPlatforms")
    public void setTestPlatforms(List<TestPlatform> testPlatforms) {
        this.testPlatforms = testPlatforms;
    }

    public TestDefinition withTestPlatforms(List<TestPlatform> testPlatforms) {
        this.testPlatforms = testPlatforms;
        return this;
    }

    @JsonProperty("supportedDataTypes")
    public List<ColumnDataType> getSupportedDataTypes() {
        return supportedDataTypes;
    }

    @JsonProperty("supportedDataTypes")
    public void setSupportedDataTypes(List<ColumnDataType> supportedDataTypes) {
        this.supportedDataTypes = supportedDataTypes;
    }

    public TestDefinition withSupportedDataTypes(List<ColumnDataType> supportedDataTypes) {
        this.supportedDataTypes = supportedDataTypes;
        return this;
    }

    @JsonProperty("parameterDefinition")
    public List<TestCaseParameter> getParameterDefinition() {
        return parameterDefinition;
    }

    @JsonProperty("parameterDefinition")
    public void setParameterDefinition(List<TestCaseParameter> parameterDefinition) {
        this.parameterDefinition = parameterDefinition;
    }

    public TestDefinition withParameterDefinition(List<TestCaseParameter> parameterDefinition) {
        this.parameterDefinition = parameterDefinition;
        return this;
    }

    /**
     * This enum defines the dimension a test case belongs to.
     * 
     */
    @JsonProperty("datatQualityDimension")
    public DataQualityDimensions getDatatQualityDimension() {
        return datatQualityDimension;
    }

    /**
     * This enum defines the dimension a test case belongs to.
     * 
     */
    @JsonProperty("datatQualityDimension")
    public void setDatatQualityDimension(DataQualityDimensions datatQualityDimension) {
        this.datatQualityDimension = datatQualityDimension;
    }

    public TestDefinition withDatatQualityDimension(DataQualityDimensions datatQualityDimension) {
        this.datatQualityDimension = datatQualityDimension;
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

    public TestDefinition withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Type of provider of an entity. Some entities are provided by the `system`. Some are entities created and provided by the `user`. Typically `system` provide entities can't be deleted and can only be disabled.
     * 
     */
    @JsonProperty("provider")
    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public TestDefinition withProvider(ProviderType provider) {
        this.provider = provider;
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

    public TestDefinition withVersion(Double version) {
        this.version = version;
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

    public TestDefinition withUpdatedAt(Long updatedAt) {
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

    public TestDefinition withUpdatedBy(String updatedBy) {
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

    public TestDefinition withHref(URI href) {
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

    public TestDefinition withChangeDescription(ChangeDescription changeDescription) {
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

    public TestDefinition withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * When `true` indicates the test case supports row level passed/failed.
     * 
     */
    @JsonProperty("supportsRowLevelPassedFailed")
    public Boolean getSupportsRowLevelPassedFailed() {
        return supportsRowLevelPassedFailed;
    }

    /**
     * When `true` indicates the test case supports row level passed/failed.
     * 
     */
    @JsonProperty("supportsRowLevelPassedFailed")
    public void setSupportsRowLevelPassedFailed(Boolean supportsRowLevelPassedFailed) {
        this.supportsRowLevelPassedFailed = supportsRowLevelPassedFailed;
    }

    public TestDefinition withSupportsRowLevelPassedFailed(Boolean supportsRowLevelPassedFailed) {
        this.supportsRowLevelPassedFailed = supportsRowLevelPassedFailed;
        return this;
    }

    /**
     * When `true` indicates the test case supports dynamic assertions.
     * 
     */
    @JsonProperty("supportsDynamicAssertion")
    public Boolean getSupportsDynamicAssertion() {
        return supportsDynamicAssertion;
    }

    /**
     * When `true` indicates the test case supports dynamic assertions.
     * 
     */
    @JsonProperty("supportsDynamicAssertion")
    public void setSupportsDynamicAssertion(Boolean supportsDynamicAssertion) {
        this.supportsDynamicAssertion = supportsDynamicAssertion;
    }

    public TestDefinition withSupportsDynamicAssertion(Boolean supportsDynamicAssertion) {
        this.supportsDynamicAssertion = supportsDynamicAssertion;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TestDefinition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("testPlatforms");
        sb.append('=');
        sb.append(((this.testPlatforms == null)?"<null>":this.testPlatforms));
        sb.append(',');
        sb.append("supportedDataTypes");
        sb.append('=');
        sb.append(((this.supportedDataTypes == null)?"<null>":this.supportedDataTypes));
        sb.append(',');
        sb.append("parameterDefinition");
        sb.append('=');
        sb.append(((this.parameterDefinition == null)?"<null>":this.parameterDefinition));
        sb.append(',');
        sb.append("datatQualityDimension");
        sb.append('=');
        sb.append(((this.datatQualityDimension == null)?"<null>":this.datatQualityDimension));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("provider");
        sb.append('=');
        sb.append(((this.provider == null)?"<null>":this.provider));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
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
        sb.append("supportsRowLevelPassedFailed");
        sb.append('=');
        sb.append(((this.supportsRowLevelPassedFailed == null)?"<null>":this.supportsRowLevelPassedFailed));
        sb.append(',');
        sb.append("supportsDynamicAssertion");
        sb.append('=');
        sb.append(((this.supportsDynamicAssertion == null)?"<null>":this.supportsDynamicAssertion));
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
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.supportsDynamicAssertion == null)? 0 :this.supportsDynamicAssertion.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.changeDescription == null)? 0 :this.changeDescription.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.entityType == null)? 0 :this.entityType.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.parameterDefinition == null)? 0 :this.parameterDefinition.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.deleted == null)? 0 :this.deleted.hashCode()));
        result = ((result* 31)+((this.testPlatforms == null)? 0 :this.testPlatforms.hashCode()));
        result = ((result* 31)+((this.supportsRowLevelPassedFailed == null)? 0 :this.supportsRowLevelPassedFailed.hashCode()));
        result = ((result* 31)+((this.provider == null)? 0 :this.provider.hashCode()));
        result = ((result* 31)+((this.datatQualityDimension == null)? 0 :this.datatQualityDimension.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.supportedDataTypes == null)? 0 :this.supportedDataTypes.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TestDefinition) == false) {
            return false;
        }
        TestDefinition rhs = ((TestDefinition) other);
        return (((((((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.supportsDynamicAssertion == rhs.supportsDynamicAssertion)||((this.supportsDynamicAssertion!= null)&&this.supportsDynamicAssertion.equals(rhs.supportsDynamicAssertion))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.changeDescription == rhs.changeDescription)||((this.changeDescription!= null)&&this.changeDescription.equals(rhs.changeDescription))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.entityType == rhs.entityType)||((this.entityType!= null)&&this.entityType.equals(rhs.entityType))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.parameterDefinition == rhs.parameterDefinition)||((this.parameterDefinition!= null)&&this.parameterDefinition.equals(rhs.parameterDefinition))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.deleted == rhs.deleted)||((this.deleted!= null)&&this.deleted.equals(rhs.deleted))))&&((this.testPlatforms == rhs.testPlatforms)||((this.testPlatforms!= null)&&this.testPlatforms.equals(rhs.testPlatforms))))&&((this.supportsRowLevelPassedFailed == rhs.supportsRowLevelPassedFailed)||((this.supportsRowLevelPassedFailed!= null)&&this.supportsRowLevelPassedFailed.equals(rhs.supportsRowLevelPassedFailed))))&&((this.provider == rhs.provider)||((this.provider!= null)&&this.provider.equals(rhs.provider))))&&((this.datatQualityDimension == rhs.datatQualityDimension)||((this.datatQualityDimension!= null)&&this.datatQualityDimension.equals(rhs.datatQualityDimension))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.supportedDataTypes == rhs.supportedDataTypes)||((this.supportedDataTypes!= null)&&this.supportedDataTypes.equals(rhs.supportedDataTypes))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
