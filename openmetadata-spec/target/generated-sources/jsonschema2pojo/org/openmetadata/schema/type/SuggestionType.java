
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Type of a Suggestion.
 * 
 */
@Generated("jsonschema2pojo")
public enum SuggestionType {

    SuggestDescription("SuggestDescription"),
    SuggestTagLabel("SuggestTagLabel");
    private final String value;
    private final static Map<String, SuggestionType> CONSTANTS = new HashMap<String, SuggestionType>();

    static {
        for (SuggestionType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SuggestionType(String value) {
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
    public static SuggestionType fromValue(String value) {
        SuggestionType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
