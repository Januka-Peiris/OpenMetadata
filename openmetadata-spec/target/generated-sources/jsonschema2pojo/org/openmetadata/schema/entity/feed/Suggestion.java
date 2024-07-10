
package org.openmetadata.schema.entity.feed;

import java.net.URI;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.EntityReference;
import org.openmetadata.schema.type.SuggestionStatus;
import org.openmetadata.schema.type.SuggestionType;
import org.openmetadata.schema.type.TagLabel;


/**
 * Suggestion
 * <p>
 * This schema defines the Suggestion entity. A suggestion can be applied to an asset to give the owner context about possible changes or improvements to descriptions, tags,...
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "type",
    "href",
    "entityLink",
    "createdAt",
    "createdBy",
    "updatedAt",
    "updatedBy",
    "status",
    "description",
    "tagLabels"
})
@Generated("jsonschema2pojo")
public class Suggestion {

    /**
     * Unique id used to identify an entity.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Unique id used to identify an entity.")
    private UUID id;
    /**
     * Type of a Suggestion.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of a Suggestion.")
    private SuggestionType type;
    /**
     * URI that points to a resource.
     * 
     */
    @JsonProperty("href")
    @JsonPropertyDescription("URI that points to a resource.")
    private URI href;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "(?U)^<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    private String entityLink;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("createdAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long createdAt;
    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("createdBy")
    @JsonPropertyDescription("This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.")
    @Valid
    private EntityReference createdBy;
    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("updatedAt")
    @JsonPropertyDescription("Timestamp in Unix epoch time milliseconds.")
    private Long updatedAt;
    /**
     * User or Bot who updated the suggestion.
     * 
     */
    @JsonProperty("updatedBy")
    @JsonPropertyDescription("User or Bot who updated the suggestion.")
    private String updatedBy;
    /**
     * Status of a Suggestion.
     * 
     */
    @JsonProperty("status")
    @JsonPropertyDescription("Status of a Suggestion.")
    private SuggestionStatus status = SuggestionStatus.fromValue("Open");
    /**
     * The main message of the thread in Markdown format.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("The main message of the thread in Markdown format.")
    private String description;
    /**
     * Tags or Glossary Terms.
     * 
     */
    @JsonProperty("tagLabels")
    @JsonPropertyDescription("Tags or Glossary Terms.")
    @Valid
    private List<TagLabel> tagLabels = null;

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

    public Suggestion withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Type of a Suggestion.
     * 
     */
    @JsonProperty("type")
    public SuggestionType getType() {
        return type;
    }

    /**
     * Type of a Suggestion.
     * 
     */
    @JsonProperty("type")
    public void setType(SuggestionType type) {
        this.type = type;
    }

    public Suggestion withType(SuggestionType type) {
        this.type = type;
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

    public Suggestion withHref(URI href) {
        this.href = href;
        return this;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    public String getEntityLink() {
        return entityLink;
    }

    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    public void setEntityLink(String entityLink) {
        this.entityLink = entityLink;
    }

    public Suggestion withEntityLink(String entityLink) {
        this.entityLink = entityLink;
        return this;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("createdAt")
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * Timestamp in Unix epoch time milliseconds.@om-field-type
     * 
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public Suggestion withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("createdBy")
    public EntityReference getCreatedBy() {
        return createdBy;
    }

    /**
     * Entity Reference
     * <p>
     * This schema defines the EntityReference type used for referencing an entity. EntityReference is used for capturing relationships from one entity to another. For example, a table has an attribute called database of type EntityReference that captures the relationship of a table `belongs to a` database.
     * 
     */
    @JsonProperty("createdBy")
    public void setCreatedBy(EntityReference createdBy) {
        this.createdBy = createdBy;
    }

    public Suggestion withCreatedBy(EntityReference createdBy) {
        this.createdBy = createdBy;
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

    public Suggestion withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User or Bot who updated the suggestion.
     * 
     */
    @JsonProperty("updatedBy")
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * User or Bot who updated the suggestion.
     * 
     */
    @JsonProperty("updatedBy")
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Suggestion withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Status of a Suggestion.
     * 
     */
    @JsonProperty("status")
    public SuggestionStatus getStatus() {
        return status;
    }

    /**
     * Status of a Suggestion.
     * 
     */
    @JsonProperty("status")
    public void setStatus(SuggestionStatus status) {
        this.status = status;
    }

    public Suggestion withStatus(SuggestionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * The main message of the thread in Markdown format.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * The main message of the thread in Markdown format.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Suggestion withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Tags or Glossary Terms.
     * 
     */
    @JsonProperty("tagLabels")
    public List<TagLabel> getTagLabels() {
        return tagLabels;
    }

    /**
     * Tags or Glossary Terms.
     * 
     */
    @JsonProperty("tagLabels")
    public void setTagLabels(List<TagLabel> tagLabels) {
        this.tagLabels = tagLabels;
    }

    public Suggestion withTagLabels(List<TagLabel> tagLabels) {
        this.tagLabels = tagLabels;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Suggestion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("entityLink");
        sb.append('=');
        sb.append(((this.entityLink == null)?"<null>":this.entityLink));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("updatedBy");
        sb.append('=');
        sb.append(((this.updatedBy == null)?"<null>":this.updatedBy));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("tagLabels");
        sb.append('=');
        sb.append(((this.tagLabels == null)?"<null>":this.tagLabels));
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
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.tagLabels == null)? 0 :this.tagLabels.hashCode()));
        result = ((result* 31)+((this.updatedBy == null)? 0 :this.updatedBy.hashCode()));
        result = ((result* 31)+((this.createdBy == null)? 0 :this.createdBy.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.entityLink == null)? 0 :this.entityLink.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Suggestion) == false) {
            return false;
        }
        Suggestion rhs = ((Suggestion) other);
        return ((((((((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.tagLabels == rhs.tagLabels)||((this.tagLabels!= null)&&this.tagLabels.equals(rhs.tagLabels))))&&((this.updatedBy == rhs.updatedBy)||((this.updatedBy!= null)&&this.updatedBy.equals(rhs.updatedBy))))&&((this.createdBy == rhs.createdBy)||((this.createdBy!= null)&&this.createdBy.equals(rhs.createdBy))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.entityLink == rhs.entityLink)||((this.entityLink!= null)&&this.entityLink.equals(rhs.entityLink))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
