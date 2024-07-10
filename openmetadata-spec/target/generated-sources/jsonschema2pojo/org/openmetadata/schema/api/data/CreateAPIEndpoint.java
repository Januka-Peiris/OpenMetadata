
package org.openmetadata.schema.api.data;

import java.net.URI;
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
import org.openmetadata.schema.type.APIRequestMethod;
import org.openmetadata.schema.type.APISchema;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.LifeCycle;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateAPIEndpointRequest
 * <p>
 * Create a APIEndpoint entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "apiCollection",
    "endpointURL",
    "requestMethod",
    "requestSchema",
    "responseSchema",
    "owner",
    "tags",
    "extension",
    "sourceUrl",
    "domain",
    "dataProducts",
    "lifeCycle",
    "sourceHash"
})
@Generated("jsonschema2pojo")
public class CreateAPIEndpoint implements CreateEntity
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
     * Display Name that identifies this APIEndpoint.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this APIEndpoint.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("apiCollection")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    @NotNull
    private String apiCollection;
    /**
     * Endpoint URL
     * <p>
     * EndPoint URL for the API Collection. Capture the Root URL of the collection.
     * (Required)
     * 
     */
    @JsonProperty("endpointURL")
    @JsonPropertyDescription("EndPoint URL for the API Collection. Capture the Root URL of the collection.")
    @NotNull
    private URI endpointURL;
    /**
     * This schema defines the Request Method type for APIs .
     * 
     */
    @JsonProperty("requestMethod")
    @JsonPropertyDescription("This schema defines the Request Method type for APIs .")
    private APIRequestMethod requestMethod = APIRequestMethod.fromValue("GET");
    /**
     * APISchema
     * <p>
     * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
     * 
     */
    @JsonProperty("requestSchema")
    @JsonPropertyDescription("This schema defines the API Endpoint entity's request/response schema.")
    @Valid
    private APISchema requestSchema;
    /**
     * APISchema
     * <p>
     * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
     * 
     */
    @JsonProperty("responseSchema")
    @JsonPropertyDescription("This schema defines the API Endpoint entity's request/response schema.")
    @Valid
    private APISchema responseSchema;
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
     * Tags for this topic
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this topic")
    @Valid
    private List<TagLabel> tags = null;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String domain;
    /**
     * List of fully qualified names of data products this entity is part of.
     * 
     */
    @JsonProperty("dataProducts")
    @JsonPropertyDescription("List of fully qualified names of data products this entity is part of.")
    @Valid
    private List<String> dataProducts = new ArrayList<String>();
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

    public CreateAPIEndpoint withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this APIEndpoint.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this APIEndpoint.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateAPIEndpoint withDisplayName(String displayName) {
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

    public CreateAPIEndpoint withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("apiCollection")
    public String getApiCollection() {
        return apiCollection;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * (Required)
     * 
     */
    @JsonProperty("apiCollection")
    public void setApiCollection(String apiCollection) {
        this.apiCollection = apiCollection;
    }

    public CreateAPIEndpoint withApiCollection(String apiCollection) {
        this.apiCollection = apiCollection;
        return this;
    }

    /**
     * Endpoint URL
     * <p>
     * EndPoint URL for the API Collection. Capture the Root URL of the collection.
     * (Required)
     * 
     */
    @JsonProperty("endpointURL")
    public URI getEndpointURL() {
        return endpointURL;
    }

    /**
     * Endpoint URL
     * <p>
     * EndPoint URL for the API Collection. Capture the Root URL of the collection.
     * (Required)
     * 
     */
    @JsonProperty("endpointURL")
    public void setEndpointURL(URI endpointURL) {
        this.endpointURL = endpointURL;
    }

    public CreateAPIEndpoint withEndpointURL(URI endpointURL) {
        this.endpointURL = endpointURL;
        return this;
    }

    /**
     * This schema defines the Request Method type for APIs .
     * 
     */
    @JsonProperty("requestMethod")
    public APIRequestMethod getRequestMethod() {
        return requestMethod;
    }

    /**
     * This schema defines the Request Method type for APIs .
     * 
     */
    @JsonProperty("requestMethod")
    public void setRequestMethod(APIRequestMethod requestMethod) {
        this.requestMethod = requestMethod;
    }

    public CreateAPIEndpoint withRequestMethod(APIRequestMethod requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * APISchema
     * <p>
     * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
     * 
     */
    @JsonProperty("requestSchema")
    public APISchema getRequestSchema() {
        return requestSchema;
    }

    /**
     * APISchema
     * <p>
     * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
     * 
     */
    @JsonProperty("requestSchema")
    public void setRequestSchema(APISchema requestSchema) {
        this.requestSchema = requestSchema;
    }

    public CreateAPIEndpoint withRequestSchema(APISchema requestSchema) {
        this.requestSchema = requestSchema;
        return this;
    }

    /**
     * APISchema
     * <p>
     * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
     * 
     */
    @JsonProperty("responseSchema")
    public APISchema getResponseSchema() {
        return responseSchema;
    }

    /**
     * APISchema
     * <p>
     * This schema defines the API Endpoint entity's request/response schema.@om-entity-type
     * 
     */
    @JsonProperty("responseSchema")
    public void setResponseSchema(APISchema responseSchema) {
        this.responseSchema = responseSchema;
    }

    public CreateAPIEndpoint withResponseSchema(APISchema responseSchema) {
        this.responseSchema = responseSchema;
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

    public CreateAPIEndpoint withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Tags for this topic
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this topic
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateAPIEndpoint withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateAPIEndpoint withExtension(Object extension) {
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

    public CreateAPIEndpoint withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateAPIEndpoint withDomain(String domain) {
        this.domain = domain;
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

    public CreateAPIEndpoint withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
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

    public CreateAPIEndpoint withLifeCycle(LifeCycle lifeCycle) {
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

    public CreateAPIEndpoint withSourceHash(String sourceHash) {
        this.sourceHash = sourceHash;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateAPIEndpoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("apiCollection");
        sb.append('=');
        sb.append(((this.apiCollection == null)?"<null>":this.apiCollection));
        sb.append(',');
        sb.append("endpointURL");
        sb.append('=');
        sb.append(((this.endpointURL == null)?"<null>":this.endpointURL));
        sb.append(',');
        sb.append("requestMethod");
        sb.append('=');
        sb.append(((this.requestMethod == null)?"<null>":this.requestMethod));
        sb.append(',');
        sb.append("requestSchema");
        sb.append('=');
        sb.append(((this.requestSchema == null)?"<null>":this.requestSchema));
        sb.append(',');
        sb.append("responseSchema");
        sb.append('=');
        sb.append(((this.responseSchema == null)?"<null>":this.responseSchema));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        sb.append("dataProducts");
        sb.append('=');
        sb.append(((this.dataProducts == null)?"<null>":this.dataProducts));
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
        result = ((result* 31)+((this.requestSchema == null)? 0 :this.requestSchema.hashCode()));
        result = ((result* 31)+((this.extension == null)? 0 :this.extension.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.requestMethod == null)? 0 :this.requestMethod.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.dataProducts == null)? 0 :this.dataProducts.hashCode()));
        result = ((result* 31)+((this.apiCollection == null)? 0 :this.apiCollection.hashCode()));
        result = ((result* 31)+((this.tags == null)? 0 :this.tags.hashCode()));
        result = ((result* 31)+((this.sourceUrl == null)? 0 :this.sourceUrl.hashCode()));
        result = ((result* 31)+((this.responseSchema == null)? 0 :this.responseSchema.hashCode()));
        result = ((result* 31)+((this.sourceHash == null)? 0 :this.sourceHash.hashCode()));
        result = ((result* 31)+((this.endpointURL == null)? 0 :this.endpointURL.hashCode()));
        result = ((result* 31)+((this.domain == null)? 0 :this.domain.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.lifeCycle == null)? 0 :this.lifeCycle.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateAPIEndpoint) == false) {
            return false;
        }
        CreateAPIEndpoint rhs = ((CreateAPIEndpoint) other);
        return (((((((((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.requestSchema == rhs.requestSchema)||((this.requestSchema!= null)&&this.requestSchema.equals(rhs.requestSchema))))&&((this.extension == rhs.extension)||((this.extension!= null)&&this.extension.equals(rhs.extension))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.requestMethod == rhs.requestMethod)||((this.requestMethod!= null)&&this.requestMethod.equals(rhs.requestMethod))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.apiCollection == rhs.apiCollection)||((this.apiCollection!= null)&&this.apiCollection.equals(rhs.apiCollection))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))))&&((this.sourceUrl == rhs.sourceUrl)||((this.sourceUrl!= null)&&this.sourceUrl.equals(rhs.sourceUrl))))&&((this.responseSchema == rhs.responseSchema)||((this.responseSchema!= null)&&this.responseSchema.equals(rhs.responseSchema))))&&((this.sourceHash == rhs.sourceHash)||((this.sourceHash!= null)&&this.sourceHash.equals(rhs.sourceHash))))&&((this.endpointURL == rhs.endpointURL)||((this.endpointURL!= null)&&this.endpointURL.equals(rhs.endpointURL))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.lifeCycle == rhs.lifeCycle)||((this.lifeCycle!= null)&&this.lifeCycle.equals(rhs.lifeCycle))));
    }

}
