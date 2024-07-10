
package org.openmetadata.schema.api.feed;

import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.type.SuggestionType;
import org.openmetadata.schema.type.TagLabel;


/**
 * CreateSuggestionRequest
 * <p>
 * Create Suggestion request
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "tagLabels",
    "type",
    "entityLink"
})
@Generated("jsonschema2pojo")
public class CreateSuggestion {

    /**
     * Message in Markdown format. See markdown support for more details.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("Message in Markdown format. See markdown support for more details.")
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
     * Type of a Suggestion.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of a Suggestion.")
    private SuggestionType type;
    /**
     * Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.
     * 
     */
    @JsonProperty("entityLink")
    @JsonPropertyDescription("Link to an entity or field within an entity using this format `<#E::{entities}::{entityType}::{field}::{arrayFieldName}::{arrayFieldValue}`.")
    @Pattern(regexp = "(?U)^<#E::\\w+::[\\w'\\- .&/:+\"\\\\()$#%]+>$")
    private String entityLink;

    /**
     * Message in Markdown format. See markdown support for more details.
     * 
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Message in Markdown format. See markdown support for more details.
     * 
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSuggestion withDescription(String description) {
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

    public CreateSuggestion withTagLabels(List<TagLabel> tagLabels) {
        this.tagLabels = tagLabels;
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

    public CreateSuggestion withType(SuggestionType type) {
        this.type = type;
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

    public CreateSuggestion withEntityLink(String entityLink) {
        this.entityLink = entityLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CreateSuggestion.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("tagLabels");
        sb.append('=');
        sb.append(((this.tagLabels == null)?"<null>":this.tagLabels));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("entityLink");
        sb.append('=');
        sb.append(((this.entityLink == null)?"<null>":this.entityLink));
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
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.tagLabels == null)? 0 :this.tagLabels.hashCode()));
        result = ((result* 31)+((this.entityLink == null)? 0 :this.entityLink.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CreateSuggestion) == false) {
            return false;
        }
        CreateSuggestion rhs = ((CreateSuggestion) other);
        return (((((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description)))&&((this.tagLabels == rhs.tagLabels)||((this.tagLabels!= null)&&this.tagLabels.equals(rhs.tagLabels))))&&((this.entityLink == rhs.entityLink)||((this.entityLink!= null)&&this.entityLink.equals(rhs.entityLink))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
