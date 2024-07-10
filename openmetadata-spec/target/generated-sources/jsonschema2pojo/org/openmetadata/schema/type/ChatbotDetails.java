
package org.openmetadata.schema.type;

import java.util.LinkedHashMap;
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
 * Details about the Chatbot conversation. This is only applicable if thread is of type Chatbot.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "query"
})
@Generated("jsonschema2pojo")
public class ChatbotDetails {

    /**
     * The query being discussed with the Chatbot
     * 
     */
    @JsonProperty("query")
    @JsonPropertyDescription("The query being discussed with the Chatbot")
    private String query;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * The query being discussed with the Chatbot
     * 
     */
    @JsonProperty("query")
    public String getQuery() {
        return query;
    }

    /**
     * The query being discussed with the Chatbot
     * 
     */
    @JsonProperty("query")
    public void setQuery(String query) {
        this.query = query;
    }

    public ChatbotDetails withQuery(String query) {
        this.query = query;
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

    public ChatbotDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChatbotDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("query");
        sb.append('=');
        sb.append(((this.query == null)?"<null>":this.query));
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
        result = ((result* 31)+((this.query == null)? 0 :this.query.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChatbotDetails) == false) {
            return false;
        }
        ChatbotDetails rhs = ((ChatbotDetails) other);
        return (((this.query == rhs.query)||((this.query!= null)&&this.query.equals(rhs.query)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
