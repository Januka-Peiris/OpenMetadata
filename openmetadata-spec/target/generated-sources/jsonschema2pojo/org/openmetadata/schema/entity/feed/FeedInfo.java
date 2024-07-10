
package org.openmetadata.schema.entity.feed;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Entity Id of the entity in `about` that the thread belongs to.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "headerMessage",
    "fieldName",
    "entitySpecificInfo"
})
@Generated("jsonschema2pojo")
public class FeedInfo {

    /**
     * Header message for the feed.
     * 
     */
    @JsonProperty("headerMessage")
    @JsonPropertyDescription("Header message for the feed.")
    private String headerMessage;
    /**
     * Field Name message for the feed.
     * 
     */
    @JsonProperty("fieldName")
    @JsonPropertyDescription("Field Name message for the feed.")
    private String fieldName;
    @JsonProperty("entitySpecificInfo")
    private Object entitySpecificInfo;

    /**
     * Header message for the feed.
     * 
     */
    @JsonProperty("headerMessage")
    public String getHeaderMessage() {
        return headerMessage;
    }

    /**
     * Header message for the feed.
     * 
     */
    @JsonProperty("headerMessage")
    public void setHeaderMessage(String headerMessage) {
        this.headerMessage = headerMessage;
    }

    public FeedInfo withHeaderMessage(String headerMessage) {
        this.headerMessage = headerMessage;
        return this;
    }

    /**
     * Field Name message for the feed.
     * 
     */
    @JsonProperty("fieldName")
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Field Name message for the feed.
     * 
     */
    @JsonProperty("fieldName")
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public FeedInfo withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    @JsonProperty("entitySpecificInfo")
    public Object getEntitySpecificInfo() {
        return entitySpecificInfo;
    }

    @JsonProperty("entitySpecificInfo")
    public void setEntitySpecificInfo(Object entitySpecificInfo) {
        this.entitySpecificInfo = entitySpecificInfo;
    }

    public FeedInfo withEntitySpecificInfo(Object entitySpecificInfo) {
        this.entitySpecificInfo = entitySpecificInfo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeedInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("headerMessage");
        sb.append('=');
        sb.append(((this.headerMessage == null)?"<null>":this.headerMessage));
        sb.append(',');
        sb.append("fieldName");
        sb.append('=');
        sb.append(((this.fieldName == null)?"<null>":this.fieldName));
        sb.append(',');
        sb.append("entitySpecificInfo");
        sb.append('=');
        sb.append(((this.entitySpecificInfo == null)?"<null>":this.entitySpecificInfo));
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
        result = ((result* 31)+((this.headerMessage == null)? 0 :this.headerMessage.hashCode()));
        result = ((result* 31)+((this.entitySpecificInfo == null)? 0 :this.entitySpecificInfo.hashCode()));
        result = ((result* 31)+((this.fieldName == null)? 0 :this.fieldName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FeedInfo) == false) {
            return false;
        }
        FeedInfo rhs = ((FeedInfo) other);
        return ((((this.headerMessage == rhs.headerMessage)||((this.headerMessage!= null)&&this.headerMessage.equals(rhs.headerMessage)))&&((this.entitySpecificInfo == rhs.entitySpecificInfo)||((this.entitySpecificInfo!= null)&&this.entitySpecificInfo.equals(rhs.entitySpecificInfo))))&&((this.fieldName == rhs.fieldName)||((this.fieldName!= null)&&this.fieldName.equals(rhs.fieldName))));
    }

}
