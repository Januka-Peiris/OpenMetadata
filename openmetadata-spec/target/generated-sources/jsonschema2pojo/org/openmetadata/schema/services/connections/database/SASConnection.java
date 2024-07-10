
package org.openmetadata.schema.services.connections.database;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openmetadata.annotations.PasswordField;


/**
 * SASConnection
 * <p>
 * SAS Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "username",
    "password",
    "serverHost",
    "datatables",
    "dataTablesCustomFilter",
    "reports",
    "reportsCustomFilter",
    "dataflows",
    "dataflowsCustomFilter"
})
@Generated("jsonschema2pojo")
public class SASConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private SASConnection.SasType type = SASConnection.SasType.fromValue("SAS");
    /**
     * Username to connect to SAS Viya.
     * (Required)
     * 
     */
    @JsonProperty("username")
    @JsonPropertyDescription("Username to connect to SAS Viya.")
    @NotNull
    private String username;
    /**
     * Password to connect to SAS Viya
     * (Required)
     * 
     */
    @JsonProperty("password")
    @JsonPropertyDescription("Password to connect to SAS Viya")
    @PasswordField
    @NotNull
    private String password;
    /**
     * Hostname of SAS Viya deployment.
     * (Required)
     * 
     */
    @JsonProperty("serverHost")
    @JsonPropertyDescription("Hostname of SAS Viya deployment.")
    @NotNull
    private URI serverHost;
    /**
     * Enable datatables for ingestion
     * 
     */
    @JsonProperty("datatables")
    @JsonPropertyDescription("Enable datatables for ingestion")
    private Boolean datatables = true;
    /**
     * Custom Filter for datatables
     * <p>
     * Custom filter for datatables
     * 
     */
    @JsonProperty("dataTablesCustomFilter")
    @JsonPropertyDescription("Custom filter for datatables")
    private Object dataTablesCustomFilter;
    /**
     * Enable report for ingestion
     * 
     */
    @JsonProperty("reports")
    @JsonPropertyDescription("Enable report for ingestion")
    private Boolean reports = false;
    /**
     * Custom Filter for reports
     * <p>
     * Custom filter for reports
     * 
     */
    @JsonProperty("reportsCustomFilter")
    @JsonPropertyDescription("Custom filter for reports")
    private Object reportsCustomFilter;
    /**
     * Enable dataflow for ingestion
     * 
     */
    @JsonProperty("dataflows")
    @JsonPropertyDescription("Enable dataflow for ingestion")
    private Boolean dataflows = false;
    /**
     * Custom Filter for dataflows
     * <p>
     * Custom filter for dataflows
     * 
     */
    @JsonProperty("dataflowsCustomFilter")
    @JsonPropertyDescription("Custom filter for dataflows")
    private Object dataflowsCustomFilter;

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public SASConnection.SasType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(SASConnection.SasType type) {
        this.type = type;
    }

    public SASConnection withType(SASConnection.SasType type) {
        this.type = type;
        return this;
    }

    /**
     * Username to connect to SAS Viya.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Username to connect to SAS Viya.
     * (Required)
     * 
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    public SASConnection withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Password to connect to SAS Viya
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public String getPassword() {
        return password;
    }

    /**
     * Password to connect to SAS Viya
     * (Required)
     * 
     */
    @JsonProperty("password")
    @PasswordField
    public void setPassword(String password) {
        this.password = password;
    }

    public SASConnection withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Hostname of SAS Viya deployment.
     * (Required)
     * 
     */
    @JsonProperty("serverHost")
    public URI getServerHost() {
        return serverHost;
    }

    /**
     * Hostname of SAS Viya deployment.
     * (Required)
     * 
     */
    @JsonProperty("serverHost")
    public void setServerHost(URI serverHost) {
        this.serverHost = serverHost;
    }

    public SASConnection withServerHost(URI serverHost) {
        this.serverHost = serverHost;
        return this;
    }

    /**
     * Enable datatables for ingestion
     * 
     */
    @JsonProperty("datatables")
    public Boolean getDatatables() {
        return datatables;
    }

    /**
     * Enable datatables for ingestion
     * 
     */
    @JsonProperty("datatables")
    public void setDatatables(Boolean datatables) {
        this.datatables = datatables;
    }

    public SASConnection withDatatables(Boolean datatables) {
        this.datatables = datatables;
        return this;
    }

    /**
     * Custom Filter for datatables
     * <p>
     * Custom filter for datatables
     * 
     */
    @JsonProperty("dataTablesCustomFilter")
    public Object getDataTablesCustomFilter() {
        return dataTablesCustomFilter;
    }

    /**
     * Custom Filter for datatables
     * <p>
     * Custom filter for datatables
     * 
     */
    @JsonProperty("dataTablesCustomFilter")
    public void setDataTablesCustomFilter(Object dataTablesCustomFilter) {
        this.dataTablesCustomFilter = dataTablesCustomFilter;
    }

    public SASConnection withDataTablesCustomFilter(Object dataTablesCustomFilter) {
        this.dataTablesCustomFilter = dataTablesCustomFilter;
        return this;
    }

    /**
     * Enable report for ingestion
     * 
     */
    @JsonProperty("reports")
    public Boolean getReports() {
        return reports;
    }

    /**
     * Enable report for ingestion
     * 
     */
    @JsonProperty("reports")
    public void setReports(Boolean reports) {
        this.reports = reports;
    }

    public SASConnection withReports(Boolean reports) {
        this.reports = reports;
        return this;
    }

    /**
     * Custom Filter for reports
     * <p>
     * Custom filter for reports
     * 
     */
    @JsonProperty("reportsCustomFilter")
    public Object getReportsCustomFilter() {
        return reportsCustomFilter;
    }

    /**
     * Custom Filter for reports
     * <p>
     * Custom filter for reports
     * 
     */
    @JsonProperty("reportsCustomFilter")
    public void setReportsCustomFilter(Object reportsCustomFilter) {
        this.reportsCustomFilter = reportsCustomFilter;
    }

    public SASConnection withReportsCustomFilter(Object reportsCustomFilter) {
        this.reportsCustomFilter = reportsCustomFilter;
        return this;
    }

    /**
     * Enable dataflow for ingestion
     * 
     */
    @JsonProperty("dataflows")
    public Boolean getDataflows() {
        return dataflows;
    }

    /**
     * Enable dataflow for ingestion
     * 
     */
    @JsonProperty("dataflows")
    public void setDataflows(Boolean dataflows) {
        this.dataflows = dataflows;
    }

    public SASConnection withDataflows(Boolean dataflows) {
        this.dataflows = dataflows;
        return this;
    }

    /**
     * Custom Filter for dataflows
     * <p>
     * Custom filter for dataflows
     * 
     */
    @JsonProperty("dataflowsCustomFilter")
    public Object getDataflowsCustomFilter() {
        return dataflowsCustomFilter;
    }

    /**
     * Custom Filter for dataflows
     * <p>
     * Custom filter for dataflows
     * 
     */
    @JsonProperty("dataflowsCustomFilter")
    public void setDataflowsCustomFilter(Object dataflowsCustomFilter) {
        this.dataflowsCustomFilter = dataflowsCustomFilter;
    }

    public SASConnection withDataflowsCustomFilter(Object dataflowsCustomFilter) {
        this.dataflowsCustomFilter = dataflowsCustomFilter;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SASConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("password");
        sb.append('=');
        sb.append(((this.password == null)?"<null>":this.password));
        sb.append(',');
        sb.append("serverHost");
        sb.append('=');
        sb.append(((this.serverHost == null)?"<null>":this.serverHost));
        sb.append(',');
        sb.append("datatables");
        sb.append('=');
        sb.append(((this.datatables == null)?"<null>":this.datatables));
        sb.append(',');
        sb.append("dataTablesCustomFilter");
        sb.append('=');
        sb.append(((this.dataTablesCustomFilter == null)?"<null>":this.dataTablesCustomFilter));
        sb.append(',');
        sb.append("reports");
        sb.append('=');
        sb.append(((this.reports == null)?"<null>":this.reports));
        sb.append(',');
        sb.append("reportsCustomFilter");
        sb.append('=');
        sb.append(((this.reportsCustomFilter == null)?"<null>":this.reportsCustomFilter));
        sb.append(',');
        sb.append("dataflows");
        sb.append('=');
        sb.append(((this.dataflows == null)?"<null>":this.dataflows));
        sb.append(',');
        sb.append("dataflowsCustomFilter");
        sb.append('=');
        sb.append(((this.dataflowsCustomFilter == null)?"<null>":this.dataflowsCustomFilter));
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
        result = ((result* 31)+((this.reports == null)? 0 :this.reports.hashCode()));
        result = ((result* 31)+((this.password == null)? 0 :this.password.hashCode()));
        result = ((result* 31)+((this.reportsCustomFilter == null)? 0 :this.reportsCustomFilter.hashCode()));
        result = ((result* 31)+((this.datatables == null)? 0 :this.datatables.hashCode()));
        result = ((result* 31)+((this.dataTablesCustomFilter == null)? 0 :this.dataTablesCustomFilter.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.dataflowsCustomFilter == null)? 0 :this.dataflowsCustomFilter.hashCode()));
        result = ((result* 31)+((this.dataflows == null)? 0 :this.dataflows.hashCode()));
        result = ((result* 31)+((this.serverHost == null)? 0 :this.serverHost.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SASConnection) == false) {
            return false;
        }
        SASConnection rhs = ((SASConnection) other);
        return (((((((((((this.reports == rhs.reports)||((this.reports!= null)&&this.reports.equals(rhs.reports)))&&((this.password == rhs.password)||((this.password!= null)&&this.password.equals(rhs.password))))&&((this.reportsCustomFilter == rhs.reportsCustomFilter)||((this.reportsCustomFilter!= null)&&this.reportsCustomFilter.equals(rhs.reportsCustomFilter))))&&((this.datatables == rhs.datatables)||((this.datatables!= null)&&this.datatables.equals(rhs.datatables))))&&((this.dataTablesCustomFilter == rhs.dataTablesCustomFilter)||((this.dataTablesCustomFilter!= null)&&this.dataTablesCustomFilter.equals(rhs.dataTablesCustomFilter))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.dataflowsCustomFilter == rhs.dataflowsCustomFilter)||((this.dataflowsCustomFilter!= null)&&this.dataflowsCustomFilter.equals(rhs.dataflowsCustomFilter))))&&((this.dataflows == rhs.dataflows)||((this.dataflows!= null)&&this.dataflows.equals(rhs.dataflows))))&&((this.serverHost == rhs.serverHost)||((this.serverHost!= null)&&this.serverHost.equals(rhs.serverHost))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SasType {

        SAS("SAS");
        private final String value;
        private final static Map<String, SASConnection.SasType> CONSTANTS = new HashMap<String, SASConnection.SasType>();

        static {
            for (SASConnection.SasType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SasType(String value) {
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
        public static SASConnection.SasType fromValue(String value) {
            SASConnection.SasType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
