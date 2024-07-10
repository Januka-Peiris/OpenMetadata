
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * type of partition interval
 * 
 */
@Generated("jsonschema2pojo")
public enum PartitionIntervalTypes {

    TIME_UNIT("TIME-UNIT"),
    INTEGER_RANGE("INTEGER-RANGE"),
    INGESTION_TIME("INGESTION-TIME"),
    COLUMN_VALUE("COLUMN-VALUE"),
    INJECTED("INJECTED"),
    ENUM("ENUM"),
    OTHER("OTHER");
    private final String value;
    private final static Map<String, PartitionIntervalTypes> CONSTANTS = new HashMap<String, PartitionIntervalTypes>();

    static {
        for (PartitionIntervalTypes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PartitionIntervalTypes(String value) {
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
    public static PartitionIntervalTypes fromValue(String value) {
        PartitionIntervalTypes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
