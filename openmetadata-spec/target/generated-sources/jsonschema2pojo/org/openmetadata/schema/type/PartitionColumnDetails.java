
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * This schema defines the partition column of a table and format the partition is created.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "columnName",
    "intervalType",
    "interval"
})
@Generated("jsonschema2pojo")
public class PartitionColumnDetails {

    /**
     * List of column names corresponding to the partition.
     * 
     */
    @JsonProperty("columnName")
    @JsonPropertyDescription("List of column names corresponding to the partition.")
    private String columnName;
    /**
     * type of partition interval
     * 
     */
    @JsonProperty("intervalType")
    @JsonPropertyDescription("type of partition interval")
    private PartitionIntervalTypes intervalType;
    /**
     * partition interval , example hourly, daily, monthly.
     * 
     */
    @JsonProperty("interval")
    @JsonPropertyDescription("partition interval , example hourly, daily, monthly.")
    private String interval;

    /**
     * List of column names corresponding to the partition.
     * 
     */
    @JsonProperty("columnName")
    public String getColumnName() {
        return columnName;
    }

    /**
     * List of column names corresponding to the partition.
     * 
     */
    @JsonProperty("columnName")
    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public PartitionColumnDetails withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * type of partition interval
     * 
     */
    @JsonProperty("intervalType")
    public PartitionIntervalTypes getIntervalType() {
        return intervalType;
    }

    /**
     * type of partition interval
     * 
     */
    @JsonProperty("intervalType")
    public void setIntervalType(PartitionIntervalTypes intervalType) {
        this.intervalType = intervalType;
    }

    public PartitionColumnDetails withIntervalType(PartitionIntervalTypes intervalType) {
        this.intervalType = intervalType;
        return this;
    }

    /**
     * partition interval , example hourly, daily, monthly.
     * 
     */
    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    /**
     * partition interval , example hourly, daily, monthly.
     * 
     */
    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public PartitionColumnDetails withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PartitionColumnDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columnName");
        sb.append('=');
        sb.append(((this.columnName == null)?"<null>":this.columnName));
        sb.append(',');
        sb.append("intervalType");
        sb.append('=');
        sb.append(((this.intervalType == null)?"<null>":this.intervalType));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
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
        result = ((result* 31)+((this.intervalType == null)? 0 :this.intervalType.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.columnName == null)? 0 :this.columnName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PartitionColumnDetails) == false) {
            return false;
        }
        PartitionColumnDetails rhs = ((PartitionColumnDetails) other);
        return ((((this.intervalType == rhs.intervalType)||((this.intervalType!= null)&&this.intervalType.equals(rhs.intervalType)))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.columnName == rhs.columnName)||((this.columnName!= null)&&this.columnName.equals(rhs.columnName))));
    }

}
