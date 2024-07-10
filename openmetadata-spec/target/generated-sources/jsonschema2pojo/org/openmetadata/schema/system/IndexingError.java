
package org.openmetadata.schema.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * IndexingAppError
 * <p>
 * This schema defines Event Publisher Job Error Schema.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "errorSource",
    "lastFailedCursor",
    "message",
    "failedEntities",
    "reason",
    "stackTrace",
    "submittedCount",
    "successCount",
    "failedCount"
})
@Generated("jsonschema2pojo")
public class IndexingError {

    @JsonProperty("errorSource")
    private IndexingError.ErrorSource errorSource;
    @JsonProperty("lastFailedCursor")
    private String lastFailedCursor;
    @JsonProperty("message")
    private String message;
    @JsonProperty("failedEntities")
    @Valid
    private List<EntityError> failedEntities = new ArrayList<EntityError>();
    @JsonProperty("reason")
    private String reason;
    @JsonProperty("stackTrace")
    private String stackTrace;
    @JsonProperty("submittedCount")
    private Integer submittedCount;
    @JsonProperty("successCount")
    private Integer successCount;
    @JsonProperty("failedCount")
    private Integer failedCount;

    @JsonProperty("errorSource")
    public IndexingError.ErrorSource getErrorSource() {
        return errorSource;
    }

    @JsonProperty("errorSource")
    public void setErrorSource(IndexingError.ErrorSource errorSource) {
        this.errorSource = errorSource;
    }

    public IndexingError withErrorSource(IndexingError.ErrorSource errorSource) {
        this.errorSource = errorSource;
        return this;
    }

    @JsonProperty("lastFailedCursor")
    public String getLastFailedCursor() {
        return lastFailedCursor;
    }

    @JsonProperty("lastFailedCursor")
    public void setLastFailedCursor(String lastFailedCursor) {
        this.lastFailedCursor = lastFailedCursor;
    }

    public IndexingError withLastFailedCursor(String lastFailedCursor) {
        this.lastFailedCursor = lastFailedCursor;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public IndexingError withMessage(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("failedEntities")
    public List<EntityError> getFailedEntities() {
        return failedEntities;
    }

    @JsonProperty("failedEntities")
    public void setFailedEntities(List<EntityError> failedEntities) {
        this.failedEntities = failedEntities;
    }

    public IndexingError withFailedEntities(List<EntityError> failedEntities) {
        this.failedEntities = failedEntities;
        return this;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    public IndexingError withReason(String reason) {
        this.reason = reason;
        return this;
    }

    @JsonProperty("stackTrace")
    public String getStackTrace() {
        return stackTrace;
    }

    @JsonProperty("stackTrace")
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public IndexingError withStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    @JsonProperty("submittedCount")
    public Integer getSubmittedCount() {
        return submittedCount;
    }

    @JsonProperty("submittedCount")
    public void setSubmittedCount(Integer submittedCount) {
        this.submittedCount = submittedCount;
    }

    public IndexingError withSubmittedCount(Integer submittedCount) {
        this.submittedCount = submittedCount;
        return this;
    }

    @JsonProperty("successCount")
    public Integer getSuccessCount() {
        return successCount;
    }

    @JsonProperty("successCount")
    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public IndexingError withSuccessCount(Integer successCount) {
        this.successCount = successCount;
        return this;
    }

    @JsonProperty("failedCount")
    public Integer getFailedCount() {
        return failedCount;
    }

    @JsonProperty("failedCount")
    public void setFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
    }

    public IndexingError withFailedCount(Integer failedCount) {
        this.failedCount = failedCount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IndexingError.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("errorSource");
        sb.append('=');
        sb.append(((this.errorSource == null)?"<null>":this.errorSource));
        sb.append(',');
        sb.append("lastFailedCursor");
        sb.append('=');
        sb.append(((this.lastFailedCursor == null)?"<null>":this.lastFailedCursor));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("failedEntities");
        sb.append('=');
        sb.append(((this.failedEntities == null)?"<null>":this.failedEntities));
        sb.append(',');
        sb.append("reason");
        sb.append('=');
        sb.append(((this.reason == null)?"<null>":this.reason));
        sb.append(',');
        sb.append("stackTrace");
        sb.append('=');
        sb.append(((this.stackTrace == null)?"<null>":this.stackTrace));
        sb.append(',');
        sb.append("submittedCount");
        sb.append('=');
        sb.append(((this.submittedCount == null)?"<null>":this.submittedCount));
        sb.append(',');
        sb.append("successCount");
        sb.append('=');
        sb.append(((this.successCount == null)?"<null>":this.successCount));
        sb.append(',');
        sb.append("failedCount");
        sb.append('=');
        sb.append(((this.failedCount == null)?"<null>":this.failedCount));
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
        result = ((result* 31)+((this.failedEntities == null)? 0 :this.failedEntities.hashCode()));
        result = ((result* 31)+((this.reason == null)? 0 :this.reason.hashCode()));
        result = ((result* 31)+((this.failedCount == null)? 0 :this.failedCount.hashCode()));
        result = ((result* 31)+((this.errorSource == null)? 0 :this.errorSource.hashCode()));
        result = ((result* 31)+((this.submittedCount == null)? 0 :this.submittedCount.hashCode()));
        result = ((result* 31)+((this.successCount == null)? 0 :this.successCount.hashCode()));
        result = ((result* 31)+((this.stackTrace == null)? 0 :this.stackTrace.hashCode()));
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+((this.lastFailedCursor == null)? 0 :this.lastFailedCursor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IndexingError) == false) {
            return false;
        }
        IndexingError rhs = ((IndexingError) other);
        return ((((((((((this.failedEntities == rhs.failedEntities)||((this.failedEntities!= null)&&this.failedEntities.equals(rhs.failedEntities)))&&((this.reason == rhs.reason)||((this.reason!= null)&&this.reason.equals(rhs.reason))))&&((this.failedCount == rhs.failedCount)||((this.failedCount!= null)&&this.failedCount.equals(rhs.failedCount))))&&((this.errorSource == rhs.errorSource)||((this.errorSource!= null)&&this.errorSource.equals(rhs.errorSource))))&&((this.submittedCount == rhs.submittedCount)||((this.submittedCount!= null)&&this.submittedCount.equals(rhs.submittedCount))))&&((this.successCount == rhs.successCount)||((this.successCount!= null)&&this.successCount.equals(rhs.successCount))))&&((this.stackTrace == rhs.stackTrace)||((this.stackTrace!= null)&&this.stackTrace.equals(rhs.stackTrace))))&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))))&&((this.lastFailedCursor == rhs.lastFailedCursor)||((this.lastFailedCursor!= null)&&this.lastFailedCursor.equals(rhs.lastFailedCursor))));
    }

    @Generated("jsonschema2pojo")
    public enum ErrorSource {

        JOB("Job"),
        READER("Reader"),
        PROCESSOR("Processor"),
        SINK("Sink");
        private final String value;
        private final static Map<String, IndexingError.ErrorSource> CONSTANTS = new HashMap<String, IndexingError.ErrorSource>();

        static {
            for (IndexingError.ErrorSource c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        ErrorSource(String value) {
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
        public static IndexingError.ErrorSource fromValue(String value) {
            IndexingError.ErrorSource constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
