
package org.openmetadata.schema.entity.services.ingestionPipelines;

import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * StackTraceError
 * <p>
 * Represents a failure status
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "error",
    "stackTrace"
})
@Generated("jsonschema2pojo")
public class StackTraceError {

    /**
     * Name of the asset with the error
     * (Required)
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the asset with the error")
    @NotNull
    private String name;
    /**
     * Error being handled
     * (Required)
     * 
     */
    @JsonProperty("error")
    @JsonPropertyDescription("Error being handled")
    @NotNull
    private String error;
    /**
     * Exception stack trace
     * 
     */
    @JsonProperty("stackTrace")
    @JsonPropertyDescription("Exception stack trace")
    private String stackTrace;

    /**
     * Name of the asset with the error
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the asset with the error
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public StackTraceError withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Error being handled
     * (Required)
     * 
     */
    @JsonProperty("error")
    public String getError() {
        return error;
    }

    /**
     * Error being handled
     * (Required)
     * 
     */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    public StackTraceError withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Exception stack trace
     * 
     */
    @JsonProperty("stackTrace")
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Exception stack trace
     * 
     */
    @JsonProperty("stackTrace")
    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

    public StackTraceError withStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StackTraceError.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null)?"<null>":this.error));
        sb.append(',');
        sb.append("stackTrace");
        sb.append('=');
        sb.append(((this.stackTrace == null)?"<null>":this.stackTrace));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.error == null)? 0 :this.error.hashCode()));
        result = ((result* 31)+((this.stackTrace == null)? 0 :this.stackTrace.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackTraceError) == false) {
            return false;
        }
        StackTraceError rhs = ((StackTraceError) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.error == rhs.error)||((this.error!= null)&&this.error.equals(rhs.error))))&&((this.stackTrace == rhs.stackTrace)||((this.stackTrace!= null)&&this.stackTrace.equals(rhs.stackTrace))));
    }

}
