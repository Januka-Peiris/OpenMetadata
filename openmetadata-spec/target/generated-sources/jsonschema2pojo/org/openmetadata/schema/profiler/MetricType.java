
package org.openmetadata.schema.profiler;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines all possible metric types in OpenMetadata.
 * 
 */
@Generated("jsonschema2pojo")
public enum MetricType {

    MEAN("mean"),
    VALUES_COUNT("valuesCount"),
    COUNT_IN_SET("countInSet"),
    COLUMN_COUNT("columnCount"),
    DISTINCT_COUNT("distinctCount"),
    DISTINCT_PROPORTION("distinctProportion"),
    I_LIKE_COUNT("iLikeCount"),
    LIKE_COUNT("likeCount"),
    NOT_LIKE_COUNT("notLikeCount"),
    REGEX_COUNT("regexCount"),
    NOT_REGEX_COUNT("notRegexCount"),
    MAX("max"),
    MAX_LENGTH("maxLength"),
    MIN("min"),
    MIN_LENGTH("minLength"),
    NULL_COUNT("nullCount"),
    ROW_COUNT("rowCount"),
    STDDEV("stddev"),
    SUM("sum"),
    UNIQUE_COUNT("uniqueCount"),
    UNIQUE_PROPORTION("uniqueProportion"),
    COLUMN_NAMES("columnNames"),
    DUPLICATE_COUNT("duplicateCount"),
    I_LIKE_RATIO("iLikeRatio"),
    LIKE_RATIO("likeRatio"),
    NULL_PROPORTION("nullProportion"),
    INTER_QUARTILE_RANGE("interQuartileRange"),
    NON_PARAMETRIC_SKEW("nonParametricSkew"),
    MEDIAN("median"),
    FIRST_QUARTILE("firstQuartile"),
    THIRD_QUARTILE("thirdQuartile"),
    SYSTEM("system"),
    HISTOGRAM("histogram");
    private final String value;
    private final static Map<String, MetricType> CONSTANTS = new HashMap<String, MetricType>();

    static {
        for (MetricType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MetricType(String value) {
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
    public static MetricType fromValue(String value) {
        MetricType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
