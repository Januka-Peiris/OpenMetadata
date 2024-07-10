
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
import org.openmetadata.schema.type.APIServiceConnection;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateAPIServiceRequest
 * <p>
 * Create API Service entity request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "displayName",
    "description",
    "serviceType",
    "connection",
    "tags",
    "owner",
    "dataProducts",
    "domain"
})
@Generated("jsonschema2pojo")
public class CreateAPIService implements CreateEntity
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
     * Display Name that identifies this API service. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Display Name that identifies this API service. It could be title or label from the source services.")
    private String displayName;
    /**
     * Text in Markdown format.@om-field-type
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Text in Markdown format.")
    private String description;
    /**
     * Type of api service such as REST, Webhook,...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    @JsonPropertyDescription("Type of api service such as REST, Webhook,...")
    @NotNull
    private CreateAPIService.ApiServiceType serviceType;
    /**
     * API Service Connection.
     * 
     */
    @JsonProperty("connection")
    @JsonPropertyDescription("API Service Connection.")
    @Valid
    private APIServiceConnection connection;
    /**
     * Tags for this API Service.
     * 
     */
    @JsonProperty("tags")
    @JsonPropertyDescription("Tags for this API Service.")
    @Valid
    private List<TagLabel> tags = null;
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
     * Fully qualified name of the domain the API Service belongs to.
     * 
     */
    @JsonProperty("domain")
    @JsonPropertyDescription("Fully qualified name of the domain the API Service belongs to.")
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

    public CreateAPIService withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Display Name that identifies this API service. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Display Name that identifies this API service. It could be title or label from the source services.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateAPIService withDisplayName(String displayName) {
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

    public CreateAPIService withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Type of api service such as REST, Webhook,...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    public CreateAPIService.ApiServiceType getServiceType() {
        return serviceType;
    }

    /**
     * Type of api service such as REST, Webhook,...
     * (Required)
     * 
     */
    @JsonProperty("serviceType")
    public void setServiceType(CreateAPIService.ApiServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public CreateAPIService withServiceType(CreateAPIService.ApiServiceType serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /**
     * API Service Connection.
     * 
     */
    @JsonProperty("connection")
    public APIServiceConnection getConnection() {
        return connection;
    }

    /**
     * API Service Connection.
     * 
     */
    @JsonProperty("connection")
    public void setConnection(APIServiceConnection connection) {
        this.connection = connection;
    }

    public CreateAPIService withConnection(APIServiceConnection connection) {
        this.connection = connection;
        return this;
    }

    /**
     * Tags for this API Service.
     * 
     */
    @JsonProperty("tags")
    public List<TagLabel> getTags() {
        return tags;
    }

    /**
     * Tags for this API Service.
     * 
     */
    @JsonProperty("tags")
    public void setTags(List<TagLabel> tags) {
        this.tags = tags;
    }

    public CreateAPIService withTags(List<TagLabel> tags) {
        this.tags = tags;
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

    public CreateAPIService withOwner(EntityReference owner) {
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

    public CreateAPIService withDataProducts(List<String> dataProducts) {
        this.dataProducts = dataProducts;
        return this;
    }

    /**
     * Fully qualified name of the domain the API Service belongs to.
     * 
     */
    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    /**
     * Fully qualified name of the domain the API Service belongs to.
     * 
     */
    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateAPIService withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateAPIService.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("serviceType");
        sb.append('=');
        sb.append(((this.serviceType == null)?"<null>":this.serviceType));
        sb.append(',');
        sb.append("connection");
        sb.append('=');
        sb.append(((this.connection == null)?"<null>":this.connection));
        sb.append(',');
        sb.append("tags");
        sb.append('=');
        sb.append(((this.tags == null)?"<null>":this.tags));
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
        if ((other instanceof CreateAPIService) == false) {
            return false;
        }
        CreateAPIService rhs = ((CreateAPIService) other);
        return ((((((((((this.serviceType == rhs.serviceType)||((this.serviceType!= null)&&this.serviceType.equals(rhs.serviceType)))&&((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.domain == rhs.domain)||((this.domain!= null)&&this.domain.equals(rhs.domain))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.dataProducts == rhs.dataProducts)||((this.dataProducts!= null)&&this.dataProducts.equals(rhs.dataProducts))))&&((this.connection == rhs.connection)||((this.connection!= null)&&this.connection.equals(rhs.connection))))&&((this.tags == rhs.tags)||((this.tags!= null)&&this.tags.equals(rhs.tags))));
    }


    /**
     * Type of api service such as REST, Webhook,...
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ApiServiceType
        implements EnumInterface
    {

        REST("REST"),
        WEBHOOK("WEBHOOK");
        private final String value;
        private final static Map<String, CreateAPIService.ApiServiceType> CONSTANTS = new HashMap<String, CreateAPIService.ApiServiceType>();

        static {
            for (CreateAPIService.ApiServiceType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ApiServiceType(String value) {
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
        public static CreateAPIService.ApiServiceType fromValue(String value) {
            CreateAPIService.ApiServiceType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
