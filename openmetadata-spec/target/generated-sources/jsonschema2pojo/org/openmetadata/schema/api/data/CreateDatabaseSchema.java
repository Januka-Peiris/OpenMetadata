
package org.openmetadata.schema.api.data;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateDatabaseSchemaRequest
 * <p>
 * Create Database Schema entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "owner",
    "database",
    "dataProducts",
    "tags",
    "retentionPeriod",
    "extension",
    "sourceUrl",
    "domain",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateDatabaseSchema implements CreateEntity
{

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name that identifies an entity.")
    @Pattern(regexp = "^((?!::).)*$")
    @Size(min = 1, max = 256)
    @NotNull
    private String name;
    /**
     * Display Name that identifies this database schema.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this database schema.")
    private String displayName;
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
     * 
     */
    @JsonProperty("owner")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference owner;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("database")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String database;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
    /**
     * Tags for this table
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this table")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("retentionPeriod")
    @JsonPropertyDescription("Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.")
    private String retentionPeriod;
    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    @JsonPropertyDescription("Entity extension data with custom attributes added to the entity.")
    private Object extension;
    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    @JsonPropertyDescription("Source Url of the respective entity.")
    private String sourceUrl;
    /**
     * Fully qualified name of the domain the Database Schema belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Database Schema belongs to.")
    private String domain;
    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    @JsonPropertyDescription("This schema defines Life Cycle Properties.")
    @Valid
    private LifeCycle lifeCycle;
    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    @JsonPropertyDescription("Source hash of the entity")
    @Size(min = 1, max = 32)
    private String sourceHash;

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name that identifies an entity.
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public CreateDatabaseSchema withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this database schema.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this database schema.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDatabaseSchema withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public CreateDatabaseSchema withDescription(String description) {
        this.description = description;
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

    public CreateDatabaseSchema withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("database")
    public String getDatabase() {
        return database;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("database")
    public void setDatabase(String database) {
        this.database = database;
    }

    public CreateDatabaseSchema withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public List<String> getDataProducts() {
        return dataProducts;
    }

    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    public void setDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
    }

    public CreateDatabaseSchema withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * Tags for this table
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this table
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateDatabaseSchema withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("retentionPeriod")
    public String getRetentionPeriod() {
        return retentionPeriod;
    }

    /**
     * Duration in ISO 8601 format in UTC. Example - 'P23DT23H'.@om-field-type
     * 
     */
    @JsonProperty("retentionPeriod")
    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    public CreateDatabaseSchema withRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public Object getExtension() {
        return extension;
    }

    /**
     * Entity extension data with custom attributes added to the entity.
     * 
     */
    @JsonProperty("extension")
    public void setExtension(Object extension) {
        this.extension = extension;
    }

    public CreateDatabaseSchema withExtension(Object extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public String getSourceUrl() {
        return sourceUrl;
    }

    /**
     * Source Url of the respective entity.
     * 
     */
    @JsonProperty("sourceUrl")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public CreateDatabaseSchema withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * Fully qualified name of the domain the Database Schema belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Database Schema belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateDatabaseSchema withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public LifeCycle getLifeCycle() {
        return lifeCycle;
    }

    /**
     * Life Cycle
     * <p>
     * This schema defines Life Cycle Properties.
     * 
     */
    @JsonProperty("lifeCycle")
    public void setLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    public CreateDatabaseSchema withLifeCycle(LifeCycle lifeCycle) {
        this.lifeCycle = lifeCycle;
        return this;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public String getSourceHash() {
        return sourceHash;
    }

    /**
     * Source hash of the entity
     * 
     */
    @JsonProperty("sourceHash")
    public void setSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
    }

    public CreateDatabaseSchema withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDatabaseSchema.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("retentionPeriod");
        sb.append('=');
        sb.append(((this.retentionPeriod == null)?"<null>":this.retentionPeriod));
        sb.append(',');
        sb.append("extension");
        sb.append('=');
        sb.append(((this.extension == null)?"<null>":this.extension));
        sb.append(',');
        sb.append("sourceUrl");
        sb.append('=');
        sb.append(((this.sourceUrl == null)?"<null>":this.sourceUrl));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
        sb.append(',');
        sb.append("lifeCycle");
        sb.append('=');
        sb.append(((this.lifeCycle == null)?"<null>":this.lifeCycle));
        sb.append(',');
        sb.append("sourceHash");
        sb.append('=');
        sb.append(((this.sourceHash == null)?"<null>":this.sourceHash));
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
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        result = ((result* 31)+((this.retentionPeriod == null)? 0 :this.retentionPeriod.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDatabaseSchema) == false) {
            return false;
        }
        CreateDatabaseSchema rhs = ((CreateDatabaseSchema) other);
        return ((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))))&&((this.retentionPeriod == rhs.retentionPeriod)||((this.retentionPeriod!= null)&&this.retentionPeriod.equals(rhs.retentionPeriod))));
    }

}
