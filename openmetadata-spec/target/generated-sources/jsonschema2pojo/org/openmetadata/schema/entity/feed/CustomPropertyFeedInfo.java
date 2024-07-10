
package org.openmetadata.schema.entity.feed;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * CustomPropertyFeedInfo
 * <p>
 * This schema defines the custom properties addition/deltion schema on feed.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "previousValue",
    "updatedValue"
})
@Generated("jsonschema2pojo")
public class CustomPropertyFeedInfo {

    /**
     * Previous Custom Property.
     * 
     */
    @JsonProperty("previousValue")
    @JsonPropertyDescription("Previous Custom Property.")
    private Object previousValue;
    /**
     * Updated Custom Property.
     * 
     */
    @JsonProperty("updatedValue")
    @JsonPropertyDescription("Updated Custom Property.")
    private Object updatedValue;

    /**
     * Previous Custom Property.
     * 
     */
    @JsonProperty("previousValue")
    public Object getPreviousValue() {
        return previousValue;
    }

    /**
     * Previous Custom Property.
     * 
     */
    @JsonProperty("previousValue")
    public void setPreviousValue(Object previousValue) {
        this.previousValue = previousValue;
    }

    public CustomPropertyFeedInfo withPreviousValue(Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * Updated Custom Property.
     * 
     */
    @JsonProperty("updatedValue")
    public Object getUpdatedValue() {
        return updatedValue;
    }

    /**
     * Updated Custom Property.
     * 
     */
    @JsonProperty("updatedValue")
    public void setUpdatedValue(Object updatedValue) {
        this.updatedValue = updatedValue;
    }

    public CustomPropertyFeedInfo withUpdatedValue(Object updatedValue) {
        this.updatedValue = updatedValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CustomPropertyFeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("previousValue");
        sb.append('=');
        sb.append(((this.previousValue == null)?"<null>":this.previousValue));
        sb.append(',');
        sb.append("updatedValue");
        sb.append('=');
        sb.append(((this.updatedValue == null)?"<null>":this.updatedValue));
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
        result = ((result* 31)+((this.previousValue == null)? 0 :this.previousValue.hashCode()));
        result = ((result* 31)+((this.updatedValue == null)? 0 :this.updatedValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomPropertyFeedInfo) == false) {
            return false;
        }
        CustomPropertyFeedInfo rhs = ((CustomPropertyFeedInfo) other);
        return (((this.previousValue == rhs.previousValue)||((this.previousValue!= null)&&this.previousValue.equals(rhs.previousValue)))&&((this.updatedValue == rhs.updatedValue)||((this.updatedValue!= null)&&this.updatedValue.equals(rhs.updatedValue))));
    }

}
