
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Status of a Suggestion.
 * 
 */
@Generated("jsonschema2pojo")
public enum SuggestionStatus {

    Open("Open"),
    Accepted("Accepted"),
    Rejected("Rejected");
    private final String value;
    private final static Map<String, SuggestionStatus> CONSTANTS = new HashMap<String, SuggestionStatus>();

    static {
        for (SuggestionStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SuggestionStatus(String value) {
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
    public static SuggestionStatus fromValue(String value) {
        SuggestionStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
