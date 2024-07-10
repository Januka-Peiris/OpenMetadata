
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This enum defines the type to use for a parameter validation rule.
 * 
 */
@Generated("jsonschema2pojo")
public enum TestCaseParameterValidationRuleType {

    EQUALS("EQUALS"),
    NOT_EQUALS("NOT_EQUALS"),
    GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
    LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");
    private final String value;
    private final static Map<String, TestCaseParameterValidationRuleType> CONSTANTS = new HashMap<String, TestCaseParameterValidationRuleType>();

    static {
        for (TestCaseParameterValidationRuleType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TestCaseParameterValidationRuleType(String value) {
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
    public static TestCaseParameterValidationRuleType fromValue(String value) {
        TestCaseParameterValidationRuleType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
