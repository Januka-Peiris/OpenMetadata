
package org.openmetadata.schema.entity.applications.configuration.internal;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DataInsightsReportAppConfig
 * <p>
 * This schema defines configuration for Data Insights Report Application.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "sendToAdmins",
    "sendToTeams"
})
@Generated("jsonschema2pojo")
public class DataInsightsReportAppConfig {

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Application type.")
    private DataInsightsReportAppConfig.DataInsightsReportAppType type = DataInsightsReportAppConfig.DataInsightsReportAppType.fromValue("DataInsightsReport");
    /**
     * Send To Admins
     * <p>
     * 
     * 
     */
    @JsonProperty("sendToAdmins")
    private Boolean sendToAdmins = true;
    /**
     * Send To Teams
     * <p>
     * 
     * 
     */
    @JsonProperty("sendToTeams")
    private Boolean sendToTeams = true;

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    public DataInsightsReportAppConfig.DataInsightsReportAppType getType() {
        return type;
    }

    /**
     * Application type.
     * 
     */
    @JsonProperty("type")
    public void setType(DataInsightsReportAppConfig.DataInsightsReportAppType type) {
        this.type = type;
    }

    public DataInsightsReportAppConfig withType(DataInsightsReportAppConfig.DataInsightsReportAppType type) {
        this.type = type;
        return this;
    }

    /**
     * Send To Admins
     * <p>
     * 
     * 
     */
    @JsonProperty("sendToAdmins")
    public Boolean getSendToAdmins() {
        return sendToAdmins;
    }

    /**
     * Send To Admins
     * <p>
     * 
     * 
     */
    @JsonProperty("sendToAdmins")
    public void setSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
    }

    public DataInsightsReportAppConfig withSendToAdmins(Boolean sendToAdmins) {
        this.sendToAdmins = sendToAdmins;
        return this;
    }

    /**
     * Send To Teams
     * <p>
     * 
     * 
     */
    @JsonProperty("sendToTeams")
    public Boolean getSendToTeams() {
        return sendToTeams;
    }

    /**
     * Send To Teams
     * <p>
     * 
     * 
     */
    @JsonProperty("sendToTeams")
    public void setSendToTeams(Boolean sendToTeams) {
        this.sendToTeams = sendToTeams;
    }

    public DataInsightsReportAppConfig withSendToTeams(Boolean sendToTeams) {
        this.sendToTeams = sendToTeams;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataInsightsReportAppConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("sendToAdmins");
        sb.append('=');
        sb.append(((this.sendToAdmins == null)?"<null>":this.sendToAdmins));
        sb.append(',');
        sb.append("sendToTeams");
        sb.append('=');
        sb.append(((this.sendToTeams == null)?"<null>":this.sendToTeams));
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
        result = ((result* 31)+((this.sendToAdmins == null)? 0 :this.sendToAdmins.hashCode()));
        result = ((result* 31)+((this.sendToTeams == null)? 0 :this.sendToTeams.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataInsightsReportAppConfig) == false) {
            return false;
        }
        DataInsightsReportAppConfig rhs = ((DataInsightsReportAppConfig) other);
        return ((((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)))&&((this.sendToAdmins == rhs.sendToAdmins)||((this.sendToAdmins!= null)&&this.sendToAdmins.equals(rhs.sendToAdmins))))&&((this.sendToTeams == rhs.sendToTeams)||((this.sendToTeams!= null)&&this.sendToTeams.equals(rhs.sendToTeams))));
    }


    /**
     * Application type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum DataInsightsReportAppType {

        DATA_INSIGHTS_REPORT("DataInsightsReport");
        private final String value;
        private final static Map<String, DataInsightsReportAppConfig.DataInsightsReportAppType> CONSTANTS = new HashMap<String, DataInsightsReportAppConfig.DataInsightsReportAppType>();

        static {
            for (DataInsightsReportAppConfig.DataInsightsReportAppType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        DataInsightsReportAppType(String value) {
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
        public static DataInsightsReportAppConfig.DataInsightsReportAppType fromValue(String value) {
            DataInsightsReportAppConfig.DataInsightsReportAppType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
