
package org.openmetadata.schema.entity.applications.configuration.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.openmetadata.schema.type.IndexMappingLanguage;


/**
 * SearchIndexingApp
 * <p>
 * Search Indexing App.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "entities",
    "recreateIndex",
    "batchSize",
    "searchIndexMappingLanguage"
})
@Generated("jsonschema2pojo")
public class SearchIndexingAppConfig {

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Application type.")
    private SearchIndexingAppConfig.SearchIndexingType type = SearchIndexingAppConfig.SearchIndexingType.fromValue("SearchIndexing");
    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("List of Entities to Reindex")
    @Valid
    private Set<String> entities = new LinkedHashSet<String>(Arrays.asList("all"));
    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    @JsonPropertyDescription("This schema publisher run modes.")
    private Boolean recreateIndex = false;
    /**
     * Maximum number of events sent in a batch (Default 100).
     * 
     */
    @JsonProperty("batchSize")
    @JsonPropertyDescription("Maximum number of events sent in a batch (Default 100).")
    private Integer batchSize = 100;
    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    @JsonPropertyDescription("This schema defines the language options available for search index mappings.")
    private IndexMappingLanguage searchIndexMappingLanguage = IndexMappingLanguage.fromValue("EN");

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    public SearchIndexingAppConfig.SearchIndexingType getType() {
        return type;
    }

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    public void setType(SearchIndexingAppConfig.SearchIndexingType type) {
        this.type = type;
    }

    public SearchIndexingAppConfig withType(SearchIndexingAppConfig.SearchIndexingType type) {
        this.type = type;
        return this;
    }

    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    public Set<String> getEntities() {
        return entities;
    }

    /**
     * List of Entities to Reindex
     * 
     */
    @JsonProperty("entities")
    public void setEntities(Set<String> entities) {
        this.entities = entities;
    }

    public SearchIndexingAppConfig withEntities(Set<String> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    public Boolean getRecreateIndex() {
        return recreateIndex;
    }

    /**
     * This schema publisher run modes.
     * 
     */
    @JsonProperty("recreateIndex")
    public void setRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
    }

    public SearchIndexingAppConfig withRecreateIndex(Boolean recreateIndex) {
        this.recreateIndex = recreateIndex;
        return this;
    }

    /**
     * Maximum number of events sent in a batch (Default 100).
     * 
     */
    @JsonProperty("batchSize")
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Maximum number of events sent in a batch (Default 100).
     * 
     */
    @JsonProperty("batchSize")
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public SearchIndexingAppConfig withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public IndexMappingLanguage getSearchIndexMappingLanguage() {
        return searchIndexMappingLanguage;
    }

    /**
     * This schema defines the language options available for search index mappings.
     * 
     */
    @JsonProperty("searchIndexMappingLanguage")
    public void setSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
    }

    public SearchIndexingAppConfig withSearchIndexMappingLanguage(IndexMappingLanguage searchIndexMappingLanguage) {
        this.searchIndexMappingLanguage = searchIndexMappingLanguage;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SearchIndexingAppConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("entities");
        sb.append('=');
        sb.append(((this.entities == null)?"<null>":this.entities));
        sb.append(',');
        sb.append("recreateIndex");
        sb.append('=');
        sb.append(((this.recreateIndex == null)?"<null>":this.recreateIndex));
        sb.append(',');
        sb.append("batchSize");
        sb.append('=');
        sb.append(((this.batchSize == null)?"<null>":this.batchSize));
        sb.append(',');
        sb.append("searchIndexMappingLanguage");
        sb.append('=');
        sb.append(((this.searchIndexMappingLanguage == null)?"<null>":this.searchIndexMappingLanguage));
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
        result = ((result* 31)+((this.recreateIndex == null)? 0 :this.recreateIndex.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.batchSize == null)? 0 :this.batchSize.hashCode()));
        result = ((result* 31)+((this.entities == null)? 0 :this.entities.hashCode()));
        result = ((result* 31)+((this.searchIndexMappingLanguage == null)? 0 :this.searchIndexMappingLanguage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SearchIndexingAppConfig) == false) {
            return false;
        }
        SearchIndexingAppConfig rhs = ((SearchIndexingAppConfig) other);
        return ((((((this.recreateIndex == rhs.recreateIndex)||((this.recreateIndex!= null)&&this.recreateIndex.equals(rhs.recreateIndex)))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.batchSize == rhs.batchSize)||((this.batchSize!= null)&&this.batchSize.equals(rhs.batchSize))))&&((this.entities == rhs.entities)||((this.entities!= null)&&this.entities.equals(rhs.entities))))&&((this.searchIndexMappingLanguage == rhs.searchIndexMappingLanguage)||((this.searchIndexMappingLanguage!= null)&&this.searchIndexMappingLanguage.equals(rhs.searchIndexMappingLanguage))));
    }


    /**
     * Application type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SearchIndexingType {

        SEARCH_INDEXING("SearchIndexing");
        private final String value;
        private final static Map<String, SearchIndexingAppConfig.SearchIndexingType> CONSTANTS = new HashMap<String, SearchIndexingAppConfig.SearchIndexingType>();

        static {
            for (SearchIndexingAppConfig.SearchIndexingType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SearchIndexingType(String value) {
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
        public static SearchIndexingAppConfig.SearchIndexingType fromValue(String value) {
            SearchIndexingAppConfig.SearchIndexingType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
