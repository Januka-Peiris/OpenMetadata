
package org.openmetadata.schema.type;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
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
    "columns"
})
@Generated("jsonschema2pojo")
public class TablePartition {

    /**
     * List of column partitions with their type and interval.
     * 
     */
    @JsonProperty("columns")
    @JsonPropertyDescription("List of column partitions with their type and interval.")
    @Valid
    private List<PartitionColumnDetails> columns = new ArrayList<PartitionColumnDetails>();

    /**
     * List of column partitions with their type and interval.
     * 
     */
    @JsonProperty("columns")
    public List<PartitionColumnDetails> getColumns() {
        return columns;
    }

    /**
     * List of column partitions with their type and interval.
     * 
     */
    @JsonProperty("columns")
    public void setColumns(List<PartitionColumnDetails> columns) {
        this.columns = columns;
    }

    public TablePartition withColumns(List<PartitionColumnDetails> columns) {
        this.columns = columns;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TablePartition.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
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
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TablePartition) == false) {
            return false;
        }
        TablePartition rhs = ((TablePartition) other);
        return ((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns)));
    }

}
