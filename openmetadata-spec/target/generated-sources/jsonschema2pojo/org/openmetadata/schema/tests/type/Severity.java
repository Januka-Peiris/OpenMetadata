
package org.openmetadata.schema.tests.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Test case resolution status type.
 * 
 */
@Generated("jsonschema2pojo")
public enum Severity {

    Severity1("Severity1"),
    Severity2("Severity2"),
    Severity3("Severity3"),
    Severity4("Severity4"),
    Severity5("Severity5");
    private final String value;
    private final static Map<String, Severity> CONSTANTS = new HashMap<String, Severity>();

    static {
        for (Severity c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    Severity(String value) {
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
    public static Severity fromValue(String value) {
        Severity constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
