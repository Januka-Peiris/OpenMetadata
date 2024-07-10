
package org.openmetadata.schema.entity.app;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the Application ScheduleTimeline Options
 * 
 */
@Generated("jsonschema2pojo")
public enum ScheduleTimeline {

    HOURLY("Hourly"),
    DAILY(" Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly"),
    CUSTOM("Custom"),
    NONE("None");
    private final String value;
    private final static Map<String, ScheduleTimeline> CONSTANTS = new HashMap<String, ScheduleTimeline>();

    static {
        for (ScheduleTimeline c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ScheduleTimeline(String value) {
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
    public static ScheduleTimeline fromValue(String value) {
        ScheduleTimeline constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
