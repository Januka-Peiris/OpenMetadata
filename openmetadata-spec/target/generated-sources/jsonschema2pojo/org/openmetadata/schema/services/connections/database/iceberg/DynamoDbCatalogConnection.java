
package org.openmetadata.schema.services.connections.database.iceberg;

import javax.annotation.processing.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openmetadata.schema.security.credentials.AWSCredentials;


/**
 * DynamoDbCatalogConnection
 * <p>
 * Iceberg DynamoDB Catalog configuration.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tableName",
    "awsConfig"
})
@Generated("jsonschema2pojo")
public class DynamoDbCatalogConnection {

    /**
     * Table Name
     * <p>
     * DynamoDB table name.
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    @JsonPropertyDescription("DynamoDB table name.")
    @NotNull
    private String tableName = "iceberg";
    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("awsConfig")
    @JsonPropertyDescription("AWS credentials configs.")
    @Valid
    @NotNull
    private AWSCredentials awsConfig;

    /**
     * Table Name
     * <p>
     * DynamoDB table name.
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    public String getTableName() {
        return tableName;
    }

    /**
     * Table Name
     * <p>
     * DynamoDB table name.
     * (Required)
     * 
     */
    @JsonProperty("tableName")
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public DynamoDbCatalogConnection withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("awsConfig")
    public AWSCredentials getAwsConfig() {
        return awsConfig;
    }

    /**
     * AWSCredentials
     * <p>
     * AWS credentials configs.
     * (Required)
     * 
     */
    @JsonProperty("awsConfig")
    public void setAwsConfig(AWSCredentials awsConfig) {
        this.awsConfig = awsConfig;
    }

    public DynamoDbCatalogConnection withAwsConfig(AWSCredentials awsConfig) {
        this.awsConfig = awsConfig;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DynamoDbCatalogConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("tableName");
        sb.append('=');
        sb.append(((this.tableName == null)?"<null>":this.tableName));
        sb.append(',');
        sb.append("awsConfig");
        sb.append('=');
        sb.append(((this.awsConfig == null)?"<null>":this.awsConfig));
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
        result = ((result* 31)+((this.awsConfig == null)? 0 :this.awsConfig.hashCode()));
        result = ((result* 31)+((this.tableName == null)? 0 :this.tableName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DynamoDbCatalogConnection) == false) {
            return false;
        }
        DynamoDbCatalogConnection rhs = ((DynamoDbCatalogConnection) other);
        return (((this.awsConfig == rhs.awsConfig)||((this.awsConfig!= null)&&this.awsConfig.equals(rhs.awsConfig)))&&((this.tableName == rhs.tableName)||((this.tableName!= null)&&this.tableName.equals(rhs.tableName))));
    }

}
