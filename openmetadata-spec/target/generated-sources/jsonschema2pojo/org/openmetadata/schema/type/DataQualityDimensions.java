
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the dimension a test case belongs to.
 * 
 */
@Generated("jsonschema2pojo")
public enum DataQualityDimensions {

    COMPLETENESS("Completeness"),
    ACCURACY("Accuracy"),
    CONSISTENCY("Consistency"),
    VALIDITY("Validity"),
    UNIQUENESS("Uniqueness"),
    INTEGRITY("Integrity"),
    SQL("SQL");
    private final String value;
    private final static Map<String, DataQualityDimensions> CONSTANTS = new HashMap<String, DataQualityDimensions>();

    static {
        for (DataQualityDimensions c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DataQualityDimensions(String value) {
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
    public static DataQualityDimensions fromValue(String value) {
        DataQualityDimensions constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
