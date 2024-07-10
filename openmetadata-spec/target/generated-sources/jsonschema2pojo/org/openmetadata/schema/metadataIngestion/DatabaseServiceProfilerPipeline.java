
package org.openmetadata.schema.metadataIngestion;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * DatabaseServiceProfilerPipeline
 * <p>
 * DatabaseService Profiler Pipeline Configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "schemaFilterPattern",
    "tableFilterPattern",
    "databaseFilterPattern",
    "includeViews",
    "useFqnForFiltering",
    "generateSampleData",
    "computeMetrics",
    "processPiiSensitive",
    "confidence",
    "profileSampleType",
    "profileSample",
    "sampleDataCount",
    "threadCount",
    "timeoutSeconds"
})
@Generated("jsonschema2pojo")
public class DatabaseServiceProfilerPipeline {

    /**
     * Profiler Source Config Pipeline type
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Profiler Source Config Pipeline type")
    private DatabaseServiceProfilerPipeline.ProfilerConfigType type = DatabaseServiceProfilerPipeline.ProfilerConfigType.fromValue("Profiler");
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("schemaFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern schemaFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("tableFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern tableFilterPattern;
    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    @JsonPropertyDescription("Regex to only fetch dashboards or charts that matches the pattern.")
    @Valid
    private FilterPattern databaseFilterPattern;
    /**
     * Include Views
     * <p>
     * Optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    @JsonPropertyDescription("Optional configuration to turn off fetching metadata for views.")
    private Boolean includeViews = true;
    /**
     * Use FQN For Filtering
     * <p>
     * Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)
     * 
     */
    @JsonProperty("useFqnForFiltering")
    @JsonPropertyDescription("Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)")
    private Boolean useFqnForFiltering = false;
    /**
     * Generate Sample Data
     * <p>
     * Option to turn on/off generating sample data. If enabled, profiler will ingest sample data for each table.
     * 
     */
    @JsonProperty("generateSampleData")
    @JsonPropertyDescription("Option to turn on/off generating sample data. If enabled, profiler will ingest sample data for each table.")
    private Boolean generateSampleData = true;
    /**
     * Compute Metrics
     * <p>
     * Option to turn on/off computing profiler metrics.
     * 
     */
    @JsonProperty("computeMetrics")
    @JsonPropertyDescription("Option to turn on/off computing profiler metrics.")
    private Boolean computeMetrics = true;
    /**
     * Auto Tag PII
     * <p>
     * Optional configuration to automatically tag columns that might contain sensitive information
     * 
     */
    @JsonProperty("processPiiSensitive")
    @JsonPropertyDescription("Optional configuration to automatically tag columns that might contain sensitive information")
    private Boolean processPiiSensitive = false;
    /**
     * PII Inference Confidence Level
     * <p>
     * Set the Confidence value for which you want the column to be tagged as PII. Confidence value ranges from 0 to 100. A higher number will yield less false positives but more false negatives. A lower number will yield more false positives but less false negatives.
     * 
     */
    @JsonProperty("confidence")
    @JsonPropertyDescription("Set the Confidence value for which you want the column to be tagged as PII. Confidence value ranges from 0 to 100. A higher number will yield less false positives but more false negatives. A lower number will yield more false positives but less false negatives.")
    private Double confidence = 80.0D;
    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    @JsonPropertyDescription("Type of Profile Sample (percentage or rows)")
    private org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType = org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType.fromValue("PERCENTAGE");
    /**
     * Profile Sample
     * <p>
     * Percentage of data or no. of rows used to compute the profiler metrics and run data quality tests
     * 
     */
    @JsonProperty("profileSample")
    @JsonPropertyDescription("Percentage of data or no. of rows used to compute the profiler metrics and run data quality tests")
    private Double profileSample = null;
    /**
     * Sample Data Rows Count
     * <p>
     * Number of sample rows to ingest when 'Generate Sample Data' is enabled
     * 
     */
    @JsonProperty("sampleDataCount")
    @JsonPropertyDescription("Number of sample rows to ingest when 'Generate Sample Data' is enabled")
    private Integer sampleDataCount = 50;
    /**
     * Thread Count
     * <p>
     * Number of threads to use during metric computations
     * 
     */
    @JsonProperty("threadCount")
    @JsonPropertyDescription("Number of threads to use during metric computations")
    private Double threadCount = 5.0D;
    /**
     * Timeout (in sec.)
     * <p>
     * Profiler Timeout in Seconds
     * 
     */
    @JsonProperty("timeoutSeconds")
    @JsonPropertyDescription("Profiler Timeout in Seconds")
    private Integer timeoutSeconds = 43200;

    /**
     * Profiler Source Config Pipeline type
     * 
     */
    @JsonProperty("type")
    public DatabaseServiceProfilerPipeline.ProfilerConfigType getType() {
        return type;
    }

    /**
     * Profiler Source Config Pipeline type
     * 
     */
    @JsonProperty("type")
    public void setType(DatabaseServiceProfilerPipeline.ProfilerConfigType type) {
        this.type = type;
    }

    public DatabaseServiceProfilerPipeline withType(DatabaseServiceProfilerPipeline.ProfilerConfigType type) {
        this.type = type;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("schemaFilterPattern")
    public FilterPattern getSchemaFilterPattern() {
        return schemaFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("schemaFilterPattern")
    public void setSchemaFilterPattern(FilterPattern schemaFilterPattern) {
        this.schemaFilterPattern = schemaFilterPattern;
    }

    public DatabaseServiceProfilerPipeline withSchemaFilterPattern(FilterPattern schemaFilterPattern) {
        this.schemaFilterPattern = schemaFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("tableFilterPattern")
    public FilterPattern getTableFilterPattern() {
        return tableFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("tableFilterPattern")
    public void setTableFilterPattern(FilterPattern tableFilterPattern) {
        this.tableFilterPattern = tableFilterPattern;
    }

    public DatabaseServiceProfilerPipeline withTableFilterPattern(FilterPattern tableFilterPattern) {
        this.tableFilterPattern = tableFilterPattern;
        return this;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    public FilterPattern getDatabaseFilterPattern() {
        return databaseFilterPattern;
    }

    /**
     * Regex to only fetch dashboards or charts that matches the pattern.
     * 
     */
    @JsonProperty("databaseFilterPattern")
    public void setDatabaseFilterPattern(FilterPattern databaseFilterPattern) {
        this.databaseFilterPattern = databaseFilterPattern;
    }

    public DatabaseServiceProfilerPipeline withDatabaseFilterPattern(FilterPattern databaseFilterPattern) {
        this.databaseFilterPattern = databaseFilterPattern;
        return this;
    }

    /**
     * Include Views
     * <p>
     * Optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    public Boolean getIncludeViews() {
        return includeViews;
    }

    /**
     * Include Views
     * <p>
     * Optional configuration to turn off fetching metadata for views.
     * 
     */
    @JsonProperty("includeViews")
    public void setIncludeViews(Boolean includeViews) {
        this.includeViews = includeViews;
    }

    public DatabaseServiceProfilerPipeline withIncludeViews(Boolean includeViews) {
        this.includeViews = includeViews;
        return this;
    }

    /**
     * Use FQN For Filtering
     * <p>
     * Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)
     * 
     */
    @JsonProperty("useFqnForFiltering")
    public Boolean getUseFqnForFiltering() {
        return useFqnForFiltering;
    }

    /**
     * Use FQN For Filtering
     * <p>
     * Regex will be applied on fully qualified name (e.g service_name.db_name.schema_name.table_name) instead of raw name (e.g. table_name)
     * 
     */
    @JsonProperty("useFqnForFiltering")
    public void setUseFqnForFiltering(Boolean useFqnForFiltering) {
        this.useFqnForFiltering = useFqnForFiltering;
    }

    public DatabaseServiceProfilerPipeline withUseFqnForFiltering(Boolean useFqnForFiltering) {
        this.useFqnForFiltering = useFqnForFiltering;
        return this;
    }

    /**
     * Generate Sample Data
     * <p>
     * Option to turn on/off generating sample data. If enabled, profiler will ingest sample data for each table.
     * 
     */
    @JsonProperty("generateSampleData")
    public Boolean getGenerateSampleData() {
        return generateSampleData;
    }

    /**
     * Generate Sample Data
     * <p>
     * Option to turn on/off generating sample data. If enabled, profiler will ingest sample data for each table.
     * 
     */
    @JsonProperty("generateSampleData")
    public void setGenerateSampleData(Boolean generateSampleData) {
        this.generateSampleData = generateSampleData;
    }

    public DatabaseServiceProfilerPipeline withGenerateSampleData(Boolean generateSampleData) {
        this.generateSampleData = generateSampleData;
        return this;
    }

    /**
     * Compute Metrics
     * <p>
     * Option to turn on/off computing profiler metrics.
     * 
     */
    @JsonProperty("computeMetrics")
    public Boolean getComputeMetrics() {
        return computeMetrics;
    }

    /**
     * Compute Metrics
     * <p>
     * Option to turn on/off computing profiler metrics.
     * 
     */
    @JsonProperty("computeMetrics")
    public void setComputeMetrics(Boolean computeMetrics) {
        this.computeMetrics = computeMetrics;
    }

    public DatabaseServiceProfilerPipeline withComputeMetrics(Boolean computeMetrics) {
        this.computeMetrics = computeMetrics;
        return this;
    }

    /**
     * Auto Tag PII
     * <p>
     * Optional configuration to automatically tag columns that might contain sensitive information
     * 
     */
    @JsonProperty("processPiiSensitive")
    public Boolean getProcessPiiSensitive() {
        return processPiiSensitive;
    }

    /**
     * Auto Tag PII
     * <p>
     * Optional configuration to automatically tag columns that might contain sensitive information
     * 
     */
    @JsonProperty("processPiiSensitive")
    public void setProcessPiiSensitive(Boolean processPiiSensitive) {
        this.processPiiSensitive = processPiiSensitive;
    }

    public DatabaseServiceProfilerPipeline withProcessPiiSensitive(Boolean processPiiSensitive) {
        this.processPiiSensitive = processPiiSensitive;
        return this;
    }

    /**
     * PII Inference Confidence Level
     * <p>
     * Set the Confidence value for which you want the column to be tagged as PII. Confidence value ranges from 0 to 100. A higher number will yield less false positives but more false negatives. A lower number will yield more false positives but less false negatives.
     * 
     */
    @JsonProperty("confidence")
    public Double getConfidence() {
        return confidence;
    }

    /**
     * PII Inference Confidence Level
     * <p>
     * Set the Confidence value for which you want the column to be tagged as PII. Confidence value ranges from 0 to 100. A higher number will yield less false positives but more false negatives. A lower number will yield more false positives but less false negatives.
     * 
     */
    @JsonProperty("confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public DatabaseServiceProfilerPipeline withConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType getProfileSampleType() {
        return profileSampleType;
    }

    /**
     * Type of Profile Sample (percentage or rows)
     * 
     */
    @JsonProperty("profileSampleType")
    public void setProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
    }

    public DatabaseServiceProfilerPipeline withProfileSampleType(org.openmetadata.schema.type.TableProfilerConfig.ProfileSampleType profileSampleType) {
        this.profileSampleType = profileSampleType;
        return this;
    }

    /**
     * Profile Sample
     * <p>
     * Percentage of data or no. of rows used to compute the profiler metrics and run data quality tests
     * 
     */
    @JsonProperty("profileSample")
    public Double getProfileSample() {
        return profileSample;
    }

    /**
     * Profile Sample
     * <p>
     * Percentage of data or no. of rows used to compute the profiler metrics and run data quality tests
     * 
     */
    @JsonProperty("profileSample")
    public void setProfileSample(Double profileSample) {
        this.profileSample = profileSample;
    }

    public DatabaseServiceProfilerPipeline withProfileSample(Double profileSample) {
        this.profileSample = profileSample;
        return this;
    }

    /**
     * Sample Data Rows Count
     * <p>
     * Number of sample rows to ingest when 'Generate Sample Data' is enabled
     * 
     */
    @JsonProperty("sampleDataCount")
    public Integer getSampleDataCount() {
        return sampleDataCount;
    }

    /**
     * Sample Data Rows Count
     * <p>
     * Number of sample rows to ingest when 'Generate Sample Data' is enabled
     * 
     */
    @JsonProperty("sampleDataCount")
    public void setSampleDataCount(Integer sampleDataCount) {
        this.sampleDataCount = sampleDataCount;
    }

    public DatabaseServiceProfilerPipeline withSampleDataCount(Integer sampleDataCount) {
        this.sampleDataCount = sampleDataCount;
        return this;
    }

    /**
     * Thread Count
     * <p>
     * Number of threads to use during metric computations
     * 
     */
    @JsonProperty("threadCount")
    public Double getThreadCount() {
        return threadCount;
    }

    /**
     * Thread Count
     * <p>
     * Number of threads to use during metric computations
     * 
     */
    @JsonProperty("threadCount")
    public void setThreadCount(Double threadCount) {
        this.threadCount = threadCount;
    }

    public DatabaseServiceProfilerPipeline withThreadCount(Double threadCount) {
        this.threadCount = threadCount;
        return this;
    }

    /**
     * Timeout (in sec.)
     * <p>
     * Profiler Timeout in Seconds
     * 
     */
    @JsonProperty("timeoutSeconds")
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * Timeout (in sec.)
     * <p>
     * Profiler Timeout in Seconds
     * 
     */
    @JsonProperty("timeoutSeconds")
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public DatabaseServiceProfilerPipeline withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DatabaseServiceProfilerPipeline.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("schemaFilterPattern");
        sb.append('=');
        sb.append(((this.schemaFilterPattern == null)?"<null>":this.schemaFilterPattern));
        sb.append(',');
        sb.append("tableFilterPattern");
        sb.append('=');
        sb.append(((this.tableFilterPattern == null)?"<null>":this.tableFilterPattern));
        sb.append(',');
        sb.append("databaseFilterPattern");
        sb.append('=');
        sb.append(((this.databaseFilterPattern == null)?"<null>":this.databaseFilterPattern));
        sb.append(',');
        sb.append("includeViews");
        sb.append('=');
        sb.append(((this.includeViews == null)?"<null>":this.includeViews));
        sb.append(',');
        sb.append("useFqnForFiltering");
        sb.append('=');
        sb.append(((this.useFqnForFiltering == null)?"<null>":this.useFqnForFiltering));
        sb.append(',');
        sb.append("generateSampleData");
        sb.append('=');
        sb.append(((this.generateSampleData == null)?"<null>":this.generateSampleData));
        sb.append(',');
        sb.append("computeMetrics");
        sb.append('=');
        sb.append(((this.computeMetrics == null)?"<null>":this.computeMetrics));
        sb.append(',');
        sb.append("processPiiSensitive");
        sb.append('=');
        sb.append(((this.processPiiSensitive == null)?"<null>":this.processPiiSensitive));
        sb.append(',');
        sb.append("confidence");
        sb.append('=');
        sb.append(((this.confidence == null)?"<null>":this.confidence));
        sb.append(',');
        sb.append("profileSampleType");
        sb.append('=');
        sb.append(((this.profileSampleType == null)?"<null>":this.profileSampleType));
        sb.append(',');
        sb.append("profileSample");
        sb.append('=');
        sb.append(((this.profileSample == null)?"<null>":this.profileSample));
        sb.append(',');
        sb.append("sampleDataCount");
        sb.append('=');
        sb.append(((this.sampleDataCount == null)?"<null>":this.sampleDataCount));
        sb.append(',');
        sb.append("threadCount");
        sb.append('=');
        sb.append(((this.threadCount == null)?"<null>":this.threadCount));
        sb.append(',');
        sb.append("timeoutSeconds");
        sb.append('=');
        sb.append(((this.timeoutSeconds == null)?"<null>":this.timeoutSeconds));
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
        result = ((result* 31)+((this.tableFilterPattern == null)? 0 :this.tableFilterPattern.hashCode()));
        result = ((result* 31)+((this.includeViews == null)? 0 :this.includeViews.hashCode()));
        result = ((result* 31)+((this.generateSampleData == null)? 0 :this.generateSampleData.hashCode()));
        result = ((result* 31)+((this.profileSampleType == null)? 0 :this.profileSampleType.hashCode()));
        result = ((result* 31)+((this.confidence == null)? 0 :this.confidence.hashCode()));
        result = ((result* 31)+((this.databaseFilterPattern == null)? 0 :this.databaseFilterPattern.hashCode()));
        result = ((result* 31)+((this.useFqnForFiltering == null)? 0 :this.useFqnForFiltering.hashCode()));
        result = ((result* 31)+((this.threadCount == null)? 0 :this.threadCount.hashCode()));
        result = ((result* 31)+((this.processPiiSensitive == null)? 0 :this.processPiiSensitive.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.computeMetrics == null)? 0 :this.computeMetrics.hashCode()));
        result = ((result* 31)+((this.schemaFilterPattern == null)? 0 :this.schemaFilterPattern.hashCode()));
        result = ((result* 31)+((this.sampleDataCount == null)? 0 :this.sampleDataCount.hashCode()));
        result = ((result* 31)+((this.timeoutSeconds == null)? 0 :this.timeoutSeconds.hashCode()));
        result = ((result* 31)+((this.profileSample == null)? 0 :this.profileSample.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatabaseServiceProfilerPipeline) == false) {
            return false;
        }
        DatabaseServiceProfilerPipeline rhs = ((DatabaseServiceProfilerPipeline) other);
        return ((((((((((((((((this.tableFilterPattern == rhs.tableFilterPattern)||((this.tableFilterPattern!= null)&&this.tableFilterPattern.equals(rhs.tableFilterPattern)))&&((this.includeViews == rhs.includeViews)||((this.includeViews!= null)&&this.includeViews.equals(rhs.includeViews))))&&((this.generateSampleData == rhs.generateSampleData)||((this.generateSampleData!= null)&&this.generateSampleData.equals(rhs.generateSampleData))))&&((this.profileSampleType == rhs.profileSampleType)||((this.profileSampleType!= null)&&this.profileSampleType.equals(rhs.profileSampleType))))&&((this.confidence == rhs.confidence)||((this.confidence!= null)&&this.confidence.equals(rhs.confidence))))&&((this.databaseFilterPattern == rhs.databaseFilterPattern)||((this.databaseFilterPattern!= null)&&this.databaseFilterPattern.equals(rhs.databaseFilterPattern))))&&((this.useFqnForFiltering == rhs.useFqnForFiltering)||((this.useFqnForFiltering!= null)&&this.useFqnForFiltering.equals(rhs.useFqnForFiltering))))&&((this.threadCount == rhs.threadCount)||((this.threadCount!= null)&&this.threadCount.equals(rhs.threadCount))))&&((this.processPiiSensitive == rhs.processPiiSensitive)||((this.processPiiSensitive!= null)&&this.processPiiSensitive.equals(rhs.processPiiSensitive))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.computeMetrics == rhs.computeMetrics)||((this.computeMetrics!= null)&&this.computeMetrics.equals(rhs.computeMetrics))))&&((this.schemaFilterPattern == rhs.schemaFilterPattern)||((this.schemaFilterPattern!= null)&&this.schemaFilterPattern.equals(rhs.schemaFilterPattern))))&&((this.sampleDataCount == rhs.sampleDataCount)||((this.sampleDataCount!= null)&&this.sampleDataCount.equals(rhs.sampleDataCount))))&&((this.timeoutSeconds == rhs.timeoutSeconds)||((this.timeoutSeconds!= null)&&this.timeoutSeconds.equals(rhs.timeoutSeconds))))&&((this.profileSample == rhs.profileSample)||((this.profileSample!= null)&&this.profileSample.equals(rhs.profileSample))));
    }


    /**
     * Profiler Source Config Pipeline type
     * 
     */
    @Generated("jsonschema2pojo")
    public enum ProfilerConfigType {

        PROFILER("Profiler");
        private final String value;
        private final static Map<String, DatabaseServiceProfilerPipeline.ProfilerConfigType> CONSTANTS = new HashMap<String, DatabaseServiceProfilerPipeline.ProfilerConfigType>();

        static {
            for (DatabaseServiceProfilerPipeline.ProfilerConfigType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ProfilerConfigType(String value) {
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
        public static DatabaseServiceProfilerPipeline.ProfilerConfigType fromValue(String value) {
            DatabaseServiceProfilerPipeline.ProfilerConfigType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
