
package org.openmetadata.schema.api.domains;

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
import org.openmetadata.schema.entity.type.Style;
import org.openmetadata.schema.type.EntityReference;


/**
 * CreateDomainRequest
 * <p>
 * Create Domain API request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "domainType",
    "name",
    "fullyQualifiedName",
    "displayName",
    "description",
    "style",
    "parent",
    "owner",
    "experts"
})
@Generated("jsonschema2pojo")
public class CreateDomain implements CreateEntity
{

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    @JsonPropertyDescription("Type of a domain")
    @NotNull
    private CreateDomain.DomainType domainType;
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
     * A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.
     * 
     */
    @JsonProperty("fullyQualifiedName")
    @JsonPropertyDescription("A unique name that identifies an entity. Example for table 'DatabaseService.Database.Schema.Table'.")
    @Size(min = 1, max = 3072)
    private String fullyQualifiedName;
    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    @JsonPropertyDescription("Name used for display purposes. Example 'Marketing', 'Payments', etc.")
    private String displayName;
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
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    @JsonPropertyDescription("UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.")
    @Valid
    private Style style;
    /**
     * Fully qualified name of parent domain.
     * 
     */
    @JsonProperty("parent")
    @JsonPropertyDescription("Fully qualified name of parent domain.")
    private String parent;
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
     * List of user/login names of users who are experts in this Domain.
     * 
     */
    @JsonProperty("experts")
    @JsonPropertyDescription("List of user/login names of users who are experts in this Domain.")
    @Valid
    private List<String> experts = null;

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    public CreateDomain.DomainType getDomainType() {
        return domainType;
    }

    /**
     * Type of a domain
     * (Required)
     * 
     */
    @JsonProperty("domainType")
    public void setDomainType(CreateDomain.DomainType domainType) {
        this.domainType = domainType;
    }

    public CreateDomain withDomainType(CreateDomain.DomainType domainType) {
        this.domainType = domainType;
        return this;
    }

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

    public CreateDomain withName(String name) {
        this.name = name;
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

    public CreateDomain withFullyQualifiedName(String fullyQualifiedName) {
        this.fullyQualifiedName = fullyQualifiedName;
        return this;
    }

    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Name used for display purposes. Example 'Marketing', 'Payments', etc.
     * 
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CreateDomain withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public CreateDomain withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    public Style getStyle() {
        return style;
    }

    /**
     * UI Style is used to associate a color code and/or icon to entity to customize the look of that entity in UI.
     * 
     */
    @JsonProperty("style")
    public void setStyle(Style style) {
        this.style = style;
    }

    public CreateDomain withStyle(Style style) {
        this.style = style;
        return this;
    }

    /**
     * Fully qualified name of parent domain.
     * 
     */
    @JsonProperty("parent")
    public String getParent() {
        return parent;
    }

    /**
     * Fully qualified name of parent domain.
     * 
     */
    @JsonProperty("parent")
    public void setParent(String parent) {
        this.parent = parent;
    }

    public CreateDomain withParent(String parent) {
        this.parent = parent;
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

    public CreateDomain withOwner(EntityReference owner) {
        this.owner = owner;
        return this;
    }

    /**
     * List of user/login names of users who are experts in this Domain.
     * 
     */
    @JsonProperty("experts")
    public List<String> getExperts() {
        return experts;
    }

    /**
     * List of user/login names of users who are experts in this Domain.
     * 
     */
    @JsonProperty("experts")
    public void setExperts(List<String> experts) {
        this.experts = experts;
    }

    public CreateDomain withExperts(List<String> experts) {
        this.experts = experts;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateDomain.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("domainType");
        sb.append('=');
        sb.append(((this.domainType == null)?"<null>":this.domainType));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("fullyQualifiedName");
        sb.append('=');
        sb.append(((this.fullyQualifiedName == null)?"<null>":this.fullyQualifiedName));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("style");
        sb.append('=');
        sb.append(((this.style == null)?"<null>":this.style));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null)?"<null>":this.parent));
        sb.append(',');
        sb.append("owner");
        sb.append('=');
        sb.append(((this.owner == null)?"<null>":this.owner));
        sb.append(',');
        sb.append("experts");
        sb.append('=');
        sb.append(((this.experts == null)?"<null>":this.experts));
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
        result = ((result* 31)+((this.parent == null)? 0 :this.parent.hashCode()));
        result = ((result* 31)+((this.domainType == null)? 0 :this.domainType.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.style == null)? 0 :this.style.hashCode()));
        result = ((result* 31)+((this.fullyQualifiedName == null)? 0 :this.fullyQualifiedName.hashCode()));
        result = ((result* 31)+((this.experts == null)? 0 :this.experts.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateDomain) == false) {
            return false;
        }
        CreateDomain rhs = ((CreateDomain) other);
        return ((((((((((this.owner == rhs.owner)||((this.owner!= null)&&this.owner.equals(rhs.owner)))&&((this.parent == rhs.parent)||((this.parent!= null)&&this.parent.equals(rhs.parent))))&&((this.domainType == rhs.domainType)||((this.domainType!= null)&&this.domainType.equals(rhs.domainType))))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.style == rhs.style)||((this.style!= null)&&this.style.equals(rhs.style))))&&((this.fullyQualifiedName == rhs.fullyQualifiedName)||((this.fullyQualifiedName!= null)&&this.fullyQualifiedName.equals(rhs.fullyQualifiedName))))&&((this.experts == rhs.experts)||((this.experts!= null)&&this.experts.equals(rhs.experts))));
    }


    /**
     * Type of a domain
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DomainType {

        SOURCE_ALIGNED("Source-aligned"),
        CONSUMER_ALIGNED("Consumer-aligned"),
        AGGREGATE("Aggregate");
        private final String value;
        private final static Map<String, CreateDomain.DomainType> CONSTANTS = new HashMap<String, CreateDomain.DomainType>();

        static {
            for (CreateDomain.DomainType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DomainType(String value) {
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
        public static CreateDomain.DomainType fromValue(String value) {
            CreateDomain.DomainType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
