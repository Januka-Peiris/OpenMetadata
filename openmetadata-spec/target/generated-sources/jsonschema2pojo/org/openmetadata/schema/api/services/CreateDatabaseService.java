
package org.openmetadata.schema.api.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.schema.CreateEntity;
import org.openmetadata.schema.EnumInterface;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateDatabaseServiceRequest
 * <p>
 * Create Database service entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "tags",
    "serviceType",
    "connection",
    "owner",
    "dataProducts",
    "domain"
})
@Generated("jsonschema2pojo")
public class CreateDatabaseService implements CreateEntity
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
     * Display Name that identifies this database service.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this database service.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Tags for this Database Service.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this Database Service.")
    @Valid
    private List<TagLabel> tags = null;
    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...")
    @NotNull
    private CreateDatabaseService.DatabaseServiceType serviceType;
    /**
     * Database Connection.
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Database Connection.")
    @Valid
    private DatabaseConnection connection;
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
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
    /**
     * Fully qualified name of the domain the Database Service belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the Database Service belongs to.")
    private String domain;

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

    public CreateDatabaseService withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this database service.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this database service.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDatabaseService withDisplayName(String displayName) {
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

    public CreateDatabaseService withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Tags for this Database Service.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this Database Service.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateDatabaseService withTags(List<TagLabel> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    public CreateDatabaseService.DatabaseServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(CreateDatabaseService.DatabaseServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public CreateDatabaseService withServiceType(CreateDatabaseService.DatabaseServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * Database Connection.
     * 
     */
    @JsonProperty("connection")
    public DatabaseConnection getConnection() {
        return connection;
    }

    /**
     * Database Connection.
     * 
     */
    @JsonProperty("connection")
    public void setConnection(DatabaseConnection connection) {
        this.connection = connection;
    }

    public CreateDatabaseService withConnection(DatabaseConnection connection) {
        this.connection = connection;
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

    public CreateDatabaseService withOwner(EntityReference owner) {
        this.owner = owner;
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

    public CreateDatabaseService withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * Fully qualified name of the domain the Database Service belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the Database Service belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateDatabaseService withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDatabaseService.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
        sb.append(',');
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
        sb.append(',');
        sb.append("domain");
        sb.append('=');
        sb.append(((this.domain == null)?"<null>":this.domain));
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
        result = ((result* 31)+((this.serviceType == null)? 0 :this.serviceType.hashCode()));
        result = ((result* 31)+((this.owner == null)? 0 :this.owner.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDatabaseService) == false) {
            return false;
        }
        CreateDatabaseService rhs = ((CreateDatabaseService) other);
        return ((((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }


    /**
     * Type of database service such as MySQL, BigQuery, Snowflake, Redshift, Postgres...
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DatabaseServiceType
        implements EnumInterface
    {

        BigQuery("BigQuery"),
        BigTable("BigTable"),
        Mysql("Mysql"),
        Redshift("Redshift"),
        Snowflake("Snowflake"),
        Postgres("Postgres"),
        Mssql("Mssql"),
        Oracle("Oracle"),
        Athena("Athena"),
        Hive("Hive"),
        Impala("Impala"),
        Presto("Presto"),
        Trino("Trino"),
        Vertica("Vertica"),
        Glue("Glue"),
        MariaDB("MariaDB"),
        Druid("Druid"),
        Db2("Db2"),
        Clickhouse("Clickhouse"),
        Databricks("Databricks"),
        AzureSQL("AzureSQL"),
        DynamoDB("DynamoDB"),
        SingleStore("SingleStore"),
        SQLite("SQLite"),
        DeltaLake("DeltaLake"),
        Salesforce("Salesforce"),
        PinotDB("PinotDB"),
        Datalake("Datalake"),
        DomoDatabase("DomoDatabase"),
        QueryLog("QueryLog"),
        CustomDatabase("CustomDatabase"),
        Dbt("Dbt"),
        SapHana("SapHana"),
        MongoDB("MongoDB"),
        Couchbase("Couchbase"),
        Greenplum("Greenplum"),
        Doris("Doris"),
        UnityCatalog("UnityCatalog"),
        SAS("SAS"),
        Iceberg("Iceberg"),
        Teradata("Teradata"),
        SapErp("SapErp");
        private final String value;
        private final static Map<String, CreateDatabaseService.DatabaseServiceType> CONSTANTS = new HashMap<String, CreateDatabaseService.DatabaseServiceType>();

        static {
            for (CreateDatabaseService.DatabaseServiceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DatabaseServiceType(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static CreateDatabaseService.DatabaseServiceType fromValue(String value) {
            CreateDatabaseService.DatabaseServiceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
