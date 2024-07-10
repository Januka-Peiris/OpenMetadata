
package org.openmetadata.schema.system;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * SystemValidationResponse
 * <p>
 * Define the system validation response
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "database",
    "searchInstance",
    "pipelineServiceClient",
    "jwks",
    "migrations"
})
@Generated("jsonschema2pojo")
public class ValidationResponse {

    @JsonProperty("database")
    @Valid
    private StepValidation database;
    @JsonProperty("searchInstance")
    @Valid
    private StepValidation searchInstance;
    @JsonProperty("pipelineServiceClient")
    @Valid
    private StepValidation pipelineServiceClient;
    @JsonProperty("jwks")
    @Valid
    private StepValidation jwks;
    @JsonProperty("migrations")
    @Valid
    private StepValidation migrations;

    @JsonProperty("database")
    public StepValidation getDatabase() {
        return database;
    }

    @JsonProperty("database")
    public void setDatabase(StepValidation database) {
        this.database = database;
    }

    public ValidationResponse withDatabase(StepValidation database) {
        this.database = database;
        return this;
    }

    @JsonProperty("searchInstance")
    public StepValidation getSearchInstance() {
        return searchInstance;
    }

    @JsonProperty("searchInstance")
    public void setSearchInstance(StepValidation searchInstance) {
        this.searchInstance = searchInstance;
    }

    public ValidationResponse withSearchInstance(StepValidation searchInstance) {
        this.searchInstance = searchInstance;
        return this;
    }

    @JsonProperty("pipelineServiceClient")
    public StepValidation getPipelineServiceClient() {
        return pipelineServiceClient;
    }

    @JsonProperty("pipelineServiceClient")
    public void setPipelineServiceClient(StepValidation pipelineServiceClient) {
        this.pipelineServiceClient = pipelineServiceClient;
    }

    public ValidationResponse withPipelineServiceClient(StepValidation pipelineServiceClient) {
        this.pipelineServiceClient = pipelineServiceClient;
        return this;
    }

    @JsonProperty("jwks")
    public StepValidation getJwks() {
        return jwks;
    }

    @JsonProperty("jwks")
    public void setJwks(StepValidation jwks) {
        this.jwks = jwks;
    }

    public ValidationResponse withJwks(StepValidation jwks) {
        this.jwks = jwks;
        return this;
    }

    @JsonProperty("migrations")
    public StepValidation getMigrations() {
        return migrations;
    }

    @JsonProperty("migrations")
    public void setMigrations(StepValidation migrations) {
        this.migrations = migrations;
    }

    public ValidationResponse withMigrations(StepValidation migrations) {
        this.migrations = migrations;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValidationResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("database");
        sb.append('=');
        sb.append(((this.database == null)?"<null>":this.database));
        sb.append(',');
        sb.append("searchInstance");
        sb.append('=');
        sb.append(((this.searchInstance == null)?"<null>":this.searchInstance));
        sb.append(',');
        sb.append("pipelineServiceClient");
        sb.append('=');
        sb.append(((this.pipelineServiceClient == null)?"<null>":this.pipelineServiceClient));
        sb.append(',');
        sb.append("jwks");
        sb.append('=');
        sb.append(((this.jwks == null)?"<null>":this.jwks));
        sb.append(',');
        sb.append("migrations");
        sb.append('=');
        sb.append(((this.migrations == null)?"<null>":this.migrations));
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
        result = ((result* 31)+((this.database == null)? 0 :this.database.hashCode()));
        result = ((result* 31)+((this.searchInstance == null)? 0 :this.searchInstance.hashCode()));
        result = ((result* 31)+((this.jwks == null)? 0 :this.jwks.hashCode()));
        result = ((result* 31)+((this.migrations == null)? 0 :this.migrations.hashCode()));
        result = ((result* 31)+((this.pipelineServiceClient == null)? 0 :this.pipelineServiceClient.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidationResponse) == false) {
            return false;
        }
        ValidationResponse rhs = ((ValidationResponse) other);
        return ((((((this.database == rhs.database)||((this.database!= null)&&this.database.equals(rhs.database)))&&((this.searchInstance == rhs.searchInstance)||((this.searchInstance!= null)&&this.searchInstance.equals(rhs.searchInstance))))&&((this.jwks == rhs.jwks)||((this.jwks!= null)&&this.jwks.equals(rhs.jwks))))&&((this.migrations == rhs.migrations)||((this.migrations!= null)&&this.migrations.equals(rhs.migrations))))&&((this.pipelineServiceClient == rhs.pipelineServiceClient)||((this.pipelineServiceClient!= null)&&this.pipelineServiceClient.equals(rhs.pipelineServiceClient))));
    }

}
