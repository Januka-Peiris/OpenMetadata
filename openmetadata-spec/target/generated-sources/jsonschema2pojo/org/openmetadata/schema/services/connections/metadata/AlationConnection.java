
package org.openmetadata.schema.services.connections.metadata;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.ExposedField;
import org.openmetadata.annotations.MaskedField;
import org.openmetadata.schema.services.connections.database.ConnectionArguments;
import org.openmetadata.schema.services.connections.database.ConnectionOptions;


/**
 * AlationConnection
 * <p>
 * Alation Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "hostPort",
    "authType",
    "connection",
    "projectName",
    "paginationLimit",
    "includeUndeployedDatasources",
    "includeHiddenDatasources",
    "ingestDatasources",
    "ingestUsersAndGroups",
    "ingestDomains",
    "ingestKnowledgeArticles",
    "ingestDashboards",
    "alationTagClassificationName",
    "connectionOptions",
    "connectionArguments",
    "supportsMetadataExtraction"
})
@Generated("jsonschema2pojo")
public class AlationConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private AlationConnection.AlationType type = AlationConnection.AlationType.fromValue("Alation");
    /**
     * Host and Port
     * <p>
     * Host and port of the Alation service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @JsonPropertyDescription("Host and port of the Alation service.")
    @ExposedField
    @NotNull
    private URI hostPort;
    /**
     * Authentication type for Alation
     * <p>
     * Types of methods used to authenticate to the alation instance
     * (Required)
     * 
     */
    @JsonProperty("authType")
    @JsonPropertyDescription("Types of methods used to authenticate to the alation instance")
    @MaskedField
    @NotNull
    private Object authType;
    /**
     * Alation Database Connection
     * <p>
     * Choose between mysql and postgres connection for alation database
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("Choose between mysql and postgres connection for alation database")
    private Object connection;
    /**
     * Project Name
     * <p>
     * Project name to create the refreshToken. Can be anything
     * 
     */
    @JsonProperty("projectName")
    @JsonPropertyDescription("Project name to create the refreshToken. Can be anything")
    private String projectName = "AlationAPI";
    /**
     * Pagination Limit
     * <p>
     * Pagination limit used for Alation APIs pagination
     * 
     */
    @JsonProperty("paginationLimit")
    @JsonPropertyDescription("Pagination limit used for Alation APIs pagination")
    private Integer paginationLimit = 10;
    /**
     * Include Undeployed Datasources
     * <p>
     * Specifies if undeployed datasources should be included while ingesting.
     * 
     */
    @JsonProperty("includeUndeployedDatasources")
    @JsonPropertyDescription("Specifies if undeployed datasources should be included while ingesting.")
    private Boolean includeUndeployedDatasources = false;
    /**
     * Include Hidden Datasources
     * <p>
     * Specifies if hidden datasources should be included while ingesting.
     * 
     */
    @JsonProperty("includeHiddenDatasources")
    @JsonPropertyDescription("Specifies if hidden datasources should be included while ingesting.")
    private Boolean includeHiddenDatasources = false;
    /**
     * Ingest Datasources
     * <p>
     * Specifies if Datasources are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDatasources")
    @JsonPropertyDescription("Specifies if Datasources are to be ingested while running the ingestion job.")
    private Boolean ingestDatasources = true;
    /**
     * Ingest Users and Groups
     * <p>
     * Specifies if Users and Groups are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestUsersAndGroups")
    @JsonPropertyDescription("Specifies if Users and Groups are to be ingested while running the ingestion job.")
    private Boolean ingestUsersAndGroups = true;
    /**
     * Ingest Domains
     * <p>
     * Specifies if Domains are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDomains")
    @JsonPropertyDescription("Specifies if Domains are to be ingested while running the ingestion job.")
    private Boolean ingestDomains = true;
    /**
     * Ingest Knowledge Articles
     * <p>
     * Specifies if Knowledge Articles are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestKnowledgeArticles")
    @JsonPropertyDescription("Specifies if Knowledge Articles are to be ingested while running the ingestion job.")
    private Boolean ingestKnowledgeArticles = true;
    /**
     * Ingest Dashboards
     * <p>
     * Specifies if Dashboards are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDashboards")
    @JsonPropertyDescription("Specifies if Dashboards are to be ingested while running the ingestion job.")
    private Boolean ingestDashboards = true;
    /**
     * Alation Tags Classification Name
     * <p>
     * Custom OpenMetadata Classification name for alation tags.
     * 
     */
    @JsonProperty("alationTagClassificationName")
    @JsonPropertyDescription("Custom OpenMetadata Classification name for alation tags.")
    private String alationTagClassificationName = "alationTags";
    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    @JsonPropertyDescription("Additional connection options to build the URL that can be sent to service during the connection.")
    @Valid
    private ConnectionOptions connectionOptions;
    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    @JsonPropertyDescription("Additional connection arguments such as security or protocol configs that can be sent to service during connection.")
    @Valid
    private ConnectionArguments connectionArguments;
    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    @JsonPropertyDescription("Supports Metadata Extraction.")
    private Boolean supportsMetadataExtraction = true;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public AlationConnection.AlationType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(AlationConnection.AlationType type) {
        this.type = type;
    }

    public AlationConnection withType(AlationConnection.AlationType type) {
        this.type = type;
        return this;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Alation service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public URI getHostPort() {
        return hostPort;
    }

    /**
     * Host and Port
     * <p>
     * Host and port of the Alation service.
     * (Required)
     * 
     */
    @JsonProperty("hostPort")
    @ExposedField
    public void setHostPort(URI hostPort) {
        this.hostPort = hostPort;
    }

    public AlationConnection withHostPort(URI hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Authentication type for Alation
     * <p>
     * Types of methods used to authenticate to the alation instance
     * (Required)
     * 
     */
    @JsonProperty("authType")
    @MaskedField
    public Object getAuthType() {
        return authType;
    }

    /**
     * Authentication type for Alation
     * <p>
     * Types of methods used to authenticate to the alation instance
     * (Required)
     * 
     */
    @JsonProperty("authType")
    @MaskedField
    public void setAuthType(Object authType) {
        this.authType = authType;
    }

    public AlationConnection withAuthType(Object authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Alation Database Connection
     * <p>
     * Choose between mysql and postgres connection for alation database
     * 
     */
    @JsonProperty("connection")
    public Object getConnection() {
        return connection;
    }

    /**
     * Alation Database Connection
     * <p>
     * Choose between mysql and postgres connection for alation database
     * 
     */
    @JsonProperty("connection")
    public void setConnection(Object connection) {
        this.connection = connection;
    }

    public AlationConnection withConnection(Object connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Project Name
     * <p>
     * Project name to create the refreshToken. Can be anything
     * 
     */
    @JsonProperty("projectName")
    public String getProjectName() {
        return projectName;
    }

    /**
     * Project Name
     * <p>
     * Project name to create the refreshToken. Can be anything
     * 
     */
    @JsonProperty("projectName")
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public AlationConnection withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Pagination Limit
     * <p>
     * Pagination limit used for Alation APIs pagination
     * 
     */
    @JsonProperty("paginationLimit")
    public Integer getPaginationLimit() {
        return paginationLimit;
    }

    /**
     * Pagination Limit
     * <p>
     * Pagination limit used for Alation APIs pagination
     * 
     */
    @JsonProperty("paginationLimit")
    public void setPaginationLimit(Integer paginationLimit) {
        this.paginationLimit = paginationLimit;
    }

    public AlationConnection withPaginationLimit(Integer paginationLimit) {
        this.paginationLimit = paginationLimit;
        return this;
    }

    /**
     * Include Undeployed Datasources
     * <p>
     * Specifies if undeployed datasources should be included while ingesting.
     * 
     */
    @JsonProperty("includeUndeployedDatasources")
    public Boolean getIncludeUndeployedDatasources() {
        return includeUndeployedDatasources;
    }

    /**
     * Include Undeployed Datasources
     * <p>
     * Specifies if undeployed datasources should be included while ingesting.
     * 
     */
    @JsonProperty("includeUndeployedDatasources")
    public void setIncludeUndeployedDatasources(Boolean includeUndeployedDatasources) {
        this.includeUndeployedDatasources = includeUndeployedDatasources;
    }

    public AlationConnection withIncludeUndeployedDatasources(Boolean includeUndeployedDatasources) {
        this.includeUndeployedDatasources = includeUndeployedDatasources;
        return this;
    }

    /**
     * Include Hidden Datasources
     * <p>
     * Specifies if hidden datasources should be included while ingesting.
     * 
     */
    @JsonProperty("includeHiddenDatasources")
    public Boolean getIncludeHiddenDatasources() {
        return includeHiddenDatasources;
    }

    /**
     * Include Hidden Datasources
     * <p>
     * Specifies if hidden datasources should be included while ingesting.
     * 
     */
    @JsonProperty("includeHiddenDatasources")
    public void setIncludeHiddenDatasources(Boolean includeHiddenDatasources) {
        this.includeHiddenDatasources = includeHiddenDatasources;
    }

    public AlationConnection withIncludeHiddenDatasources(Boolean includeHiddenDatasources) {
        this.includeHiddenDatasources = includeHiddenDatasources;
        return this;
    }

    /**
     * Ingest Datasources
     * <p>
     * Specifies if Datasources are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDatasources")
    public Boolean getIngestDatasources() {
        return ingestDatasources;
    }

    /**
     * Ingest Datasources
     * <p>
     * Specifies if Datasources are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDatasources")
    public void setIngestDatasources(Boolean ingestDatasources) {
        this.ingestDatasources = ingestDatasources;
    }

    public AlationConnection withIngestDatasources(Boolean ingestDatasources) {
        this.ingestDatasources = ingestDatasources;
        return this;
    }

    /**
     * Ingest Users and Groups
     * <p>
     * Specifies if Users and Groups are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestUsersAndGroups")
    public Boolean getIngestUsersAndGroups() {
        return ingestUsersAndGroups;
    }

    /**
     * Ingest Users and Groups
     * <p>
     * Specifies if Users and Groups are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestUsersAndGroups")
    public void setIngestUsersAndGroups(Boolean ingestUsersAndGroups) {
        this.ingestUsersAndGroups = ingestUsersAndGroups;
    }

    public AlationConnection withIngestUsersAndGroups(Boolean ingestUsersAndGroups) {
        this.ingestUsersAndGroups = ingestUsersAndGroups;
        return this;
    }

    /**
     * Ingest Domains
     * <p>
     * Specifies if Domains are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDomains")
    public Boolean getIngestDomains() {
        return ingestDomains;
    }

    /**
     * Ingest Domains
     * <p>
     * Specifies if Domains are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDomains")
    public void setIngestDomains(Boolean ingestDomains) {
        this.ingestDomains = ingestDomains;
    }

    public AlationConnection withIngestDomains(Boolean ingestDomains) {
        this.ingestDomains = ingestDomains;
        return this;
    }

    /**
     * Ingest Knowledge Articles
     * <p>
     * Specifies if Knowledge Articles are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestKnowledgeArticles")
    public Boolean getIngestKnowledgeArticles() {
        return ingestKnowledgeArticles;
    }

    /**
     * Ingest Knowledge Articles
     * <p>
     * Specifies if Knowledge Articles are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestKnowledgeArticles")
    public void setIngestKnowledgeArticles(Boolean ingestKnowledgeArticles) {
        this.ingestKnowledgeArticles = ingestKnowledgeArticles;
    }

    public AlationConnection withIngestKnowledgeArticles(Boolean ingestKnowledgeArticles) {
        this.ingestKnowledgeArticles = ingestKnowledgeArticles;
        return this;
    }

    /**
     * Ingest Dashboards
     * <p>
     * Specifies if Dashboards are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDashboards")
    public Boolean getIngestDashboards() {
        return ingestDashboards;
    }

    /**
     * Ingest Dashboards
     * <p>
     * Specifies if Dashboards are to be ingested while running the ingestion job.
     * 
     */
    @JsonProperty("ingestDashboards")
    public void setIngestDashboards(Boolean ingestDashboards) {
        this.ingestDashboards = ingestDashboards;
    }

    public AlationConnection withIngestDashboards(Boolean ingestDashboards) {
        this.ingestDashboards = ingestDashboards;
        return this;
    }

    /**
     * Alation Tags Classification Name
     * <p>
     * Custom OpenMetadata Classification name for alation tags.
     * 
     */
    @JsonProperty("alationTagClassificationName")
    public String getAlationTagClassificationName() {
        return alationTagClassificationName;
    }

    /**
     * Alation Tags Classification Name
     * <p>
     * Custom OpenMetadata Classification name for alation tags.
     * 
     */
    @JsonProperty("alationTagClassificationName")
    public void setAlationTagClassificationName(String alationTagClassificationName) {
        this.alationTagClassificationName = alationTagClassificationName;
    }

    public AlationConnection withAlationTagClassificationName(String alationTagClassificationName) {
        this.alationTagClassificationName = alationTagClassificationName;
        return this;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public ConnectionOptions getConnectionOptions() {
        return connectionOptions;
    }

    /**
     * Additional connection options to build the URL that can be sent to service during the connection.
     * 
     */
    @JsonProperty("connectionOptions")
    public void setConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
    }

    public AlationConnection withConnectionOptions(ConnectionOptions connectionOptions) {
        this.connectionOptions = connectionOptions;
        return this;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public ConnectionArguments getConnectionArguments() {
        return connectionArguments;
    }

    /**
     * Additional connection arguments such as security or protocol configs that can be sent to service during connection.
     * 
     */
    @JsonProperty("connectionArguments")
    public void setConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
    }

    public AlationConnection withConnectionArguments(ConnectionArguments connectionArguments) {
        this.connectionArguments = connectionArguments;
        return this;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public Boolean getSupportsMetadataExtraction() {
        return supportsMetadataExtraction;
    }

    /**
     * Supports Metadata Extraction.
     * 
     */
    @JsonProperty("supportsMetadataExtraction")
    public void setSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
    }

    public AlationConnection withSupportsMetadataExtraction(Boolean supportsMetadataExtraction) {
        this.supportsMetadataExtraction = supportsMetadataExtraction;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AlationConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("hostPort");
        sb.append('=');
        sb.append(((this.hostPort == null)?"<null>":this.hostPort));
        sb.append(',');
        sb.append("authType");
        sb.append('=');
        sb.append(((this.authType == null)?"<null>":this.authType));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("projectName");
        sb.append('=');
        sb.append(((this.projectName == null)?"<null>":this.projectName));
        sb.append(',');
        sb.append("paginationLimit");
        sb.append('=');
        sb.append(((this.paginationLimit == null)?"<null>":this.paginationLimit));
        sb.append(',');
        sb.append("includeUndeployedDatasources");
        sb.append('=');
        sb.append(((this.includeUndeployedDatasources == null)?"<null>":this.includeUndeployedDatasources));
        sb.append(',');
        sb.append("includeHiddenDatasources");
        sb.append('=');
        sb.append(((this.includeHiddenDatasources == null)?"<null>":this.includeHiddenDatasources));
        sb.append(',');
        sb.append("ingestDatasources");
        sb.append('=');
        sb.append(((this.ingestDatasources == null)?"<null>":this.ingestDatasources));
        sb.append(',');
        sb.append("ingestUsersAndGroups");
        sb.append('=');
        sb.append(((this.ingestUsersAndGroups == null)?"<null>":this.ingestUsersAndGroups));
        sb.append(',');
        sb.append("ingestDomains");
        sb.append('=');
        sb.append(((this.ingestDomains == null)?"<null>":this.ingestDomains));
        sb.append(',');
        sb.append("ingestKnowledgeArticles");
        sb.append('=');
        sb.append(((this.ingestKnowledgeArticles == null)?"<null>":this.ingestKnowledgeArticles));
        sb.append(',');
        sb.append("ingestDashboards");
        sb.append('=');
        sb.append(((this.ingestDashboards == null)?"<null>":this.ingestDashboards));
        sb.append(',');
        sb.append("alationTagClassificationName");
        sb.append('=');
        sb.append(((this.alationTagClassificationName == null)?"<null>":this.alationTagClassificationName));
        sb.append(',');
        sb.append("connectionOptions");
        sb.append('=');
        sb.append(((this.connectionOptions == null)?"<null>":this.connectionOptions));
        sb.append(',');
        sb.append("connectionArguments");
        sb.append('=');
        sb.append(((this.connectionArguments == null)?"<null>":this.connectionArguments));
        sb.append(',');
        sb.append("supportsMetadataExtraction");
        sb.append('=');
        sb.append(((this.supportsMetadataExtraction == null)?"<null>":this.supportsMetadataExtraction));
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
        result = ((result* 31)+((this.supportsMetadataExtraction == null)? 0 :this.supportsMetadataExtraction.hashCode()));
        result = ((result* 31)+((this.ingestKnowledgeArticles == null)? 0 :this.ingestKnowledgeArticles.hashCode()));
        result = ((result* 31)+((this.ingestDatasources == null)? 0 :this.ingestDatasources.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.connectionArguments == null)? 0 :this.connectionArguments.hashCode()));
        result = ((result* 31)+((this.includeUndeployedDatasources == null)? 0 :this.includeUndeployedDatasources.hashCode()));
        result = ((result* 31)+((this.connectionOptions == null)? 0 :this.connectionOptions.hashCode()));
        result = ((result* 31)+((this.ingestUsersAndGroups == null)? 0 :this.ingestUsersAndGroups.hashCode()));
        result = ((result* 31)+((this.ingestDashboards == null)? 0 :this.ingestDashboards.hashCode()));
        result = ((result* 31)+((this.alationTagClassificationName == null)? 0 :this.alationTagClassificationName.hashCode()));
        result = ((result* 31)+((this.hostPort == null)? 0 :this.hostPort.hashCode()));
        result = ((result* 31)+((this.connection == null)? 0 :this.connection.hashCode()));
        result = ((result* 31)+((this.paginationLimit == null)? 0 :this.paginationLimit.hashCode()));
        result = ((result* 31)+((this.authType == null)? 0 :this.authType.hashCode()));
        result = ((result* 31)+((this.projectName == null)? 0 :this.projectName.hashCode()));
        result = ((result* 31)+((this.ingestDomains == null)? 0 :this.ingestDomains.hashCode()));
        result = ((result* 31)+((this.includeHiddenDatasources == null)? 0 :this.includeHiddenDatasources.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AlationConnection) == false) {
            return false;
        }
        AlationConnection rhs = ((AlationConnection) other);
        return ((((((((((((((((((this.supportsMetadataExtraction == rhs.supportsMetadataExtraction)||((this.supportsMetadataExtraction!= null)&&this.supportsMetadataExtraction.equals(rhs.supportsMetadataExtraction)))&&((this.ingestKnowledgeArticles == rhs.ingestKnowledgeArticles)||((this.ingestKnowledgeArticles!= null)&&this.ingestKnowledgeArticles.equals(rhs.ingestKnowledgeArticles))))&&((this.ingestDatasources == rhs.ingestDatasources)||((this.ingestDatasources!= null)&&this.ingestDatasources.equals(rhs.ingestDatasources))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.connectionArguments == rhs.connectionArguments)||((this.connectionArguments!= null)&&this.connectionArguments.equals(rhs.connectionArguments))))&&((this.includeUndeployedDatasources == rhs.includeUndeployedDatasources)||((this.includeUndeployedDatasources!= null)&&this.includeUndeployedDatasources.equals(rhs.includeUndeployedDatasources))))&&((this.connectionOptions == rhs.connectionOptions)||((this.connectionOptions!= null)&&this.connectionOptions.equals(rhs.connectionOptions))))&&((this.ingestUsersAndGroups == rhs.ingestUsersAndGroups)||((this.ingestUsersAndGroups!= null)&&this.ingestUsersAndGroups.equals(rhs.ingestUsersAndGroups))))&&((this.ingestDashboards == rhs.ingestDashboards)||((this.ingestDashboards!= null)&&this.ingestDashboards.equals(rhs.ingestDashboards))))&&((this.alationTagClassificationName == rhs.alationTagClassificationName)||((this.alationTagClassificationName!= null)&&this.alationTagClassificationName.equals(rhs.alationTagClassificationName))))&&((this.hostPort == rhs.hostPort)||((this.hostPort!= null)&&this.hostPort.equals(rhs.hostPort))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.paginationLimit == rhs.paginationLimit)||((this.paginationLimit!= null)&&this.paginationLimit.equals(rhs.paginationLimit))))&&((this.authType == rhs.authType)||((this.authType!= null)&&this.authType.equals(rhs.authType))))&&((this.projectName == rhs.projectName)||((this.projectName!= null)&&this.projectName.equals(rhs.projectName))))&&((this.ingestDomains == rhs.ingestDomains)||((this.ingestDomains!= null)&&this.ingestDomains.equals(rhs.ingestDomains))))&&((this.includeHiddenDatasources == rhs.includeHiddenDatasources)||((this.includeHiddenDatasources!= null)&&this.includeHiddenDatasources.equals(rhs.includeHiddenDatasources))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum AlationType {

        ALATION("Alation");
        private final String value;
        private final static Map<String, AlationConnection.AlationType> CONSTANTS = new HashMap<String, AlationConnection.AlationType>();

        static {
            for (AlationConnection.AlationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        AlationType(String value) {
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
        public static AlationConnection.AlationType fromValue(String value) {
            AlationConnection.AlationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
