
package org.openmetadata.schema.entity.app.external;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Entities selected to run the automation.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "queryFilter"
})
@Generated("jsonschema2pojo")
public class Resource {

    /**
     * Type of the entity. E.g., 'table', 'chart',...
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Type of the entity. E.g., 'table', 'chart',...")
    @Valid
    private List<String> type = new ArrayList<String>();
    /**
     * Query filter to be passed to ES. E.g., `{"query":{"bool":{"must":[{"bool":{"should":[{"term":{"domain.displayName.keyword":"DG Anim"}}]}}]}}}`. This is the same payload as in the Explore page.
     * 
     */
    @JsonProperty("queryFilter")
    @JsonPropertyDescription("Query filter to be passed to ES. E.g., `{\"query\":{\"bool\":{\"must\":[{\"bool\":{\"should\":[{\"term\":{\"domain.displayName.keyword\":\"DG Anim\"}}]}}]}}}`. This is the same payload as in the Explore page.")
    private String queryFilter;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Type of the entity. E.g., 'table', 'chart',...
     * 
     */
    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    /**
     * Type of the entity. E.g., 'table', 'chart',...
     * 
     */
    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    public Resource withType(List<String> type) {
        this.type = type;
        return this;
    }

    /**
     * Query filter to be passed to ES. E.g., `{"query":{"bool":{"must":[{"bool":{"should":[{"term":{"domain.displayName.keyword":"DG Anim"}}]}}]}}}`. This is the same payload as in the Explore page.
     * 
     */
    @JsonProperty("queryFilter")
    public String getQueryFilter() {
        return queryFilter;
    }

    /**
     * Query filter to be passed to ES. E.g., `{"query":{"bool":{"must":[{"bool":{"should":[{"term":{"domain.displayName.keyword":"DG Anim"}}]}}]}}}`. This is the same payload as in the Explore page.
     * 
     */
    @JsonProperty("queryFilter")
    public void setQueryFilter(String queryFilter) {
        this.queryFilter = queryFilter;
    }

    public Resource withQueryFilter(String queryFilter) {
        this.queryFilter = queryFilter;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Resource withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resource.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("queryFilter");
        sb.append('=');
        sb.append(((this.queryFilter == null)?"<null>":this.queryFilter));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.queryFilter == null)? 0 :this.queryFilter.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.queryFilter == rhs.queryFilter)||((this.queryFilter!= null)&&this.queryFilter.equals(rhs.queryFilter))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
