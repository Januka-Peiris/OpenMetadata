
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
public enum TestCaseResolutionStatusTypes {

    New("New"),
    Ack("Ack"),
    Assigned("Assigned"),
    Resolved("Resolved");
    private final String value;
    private final static Map<String, TestCaseResolutionStatusTypes> CONSTANTS = new HashMap<String, TestCaseResolutionStatusTypes>();

    static {
        for (TestCaseResolutionStatusTypes c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestCaseResolutionStatusTypes(String value) {
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
    public static TestCaseResolutionStatusTypes fromValue(String value) {
        TestCaseResolutionStatusTypes constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
