
package org.openmetadata.schema.security.ssl;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SSL Mode
 * <p>
 * SSL Mode to connect to database.
 * 
 */
@Generated("jsonschema2pojo")
public enum SSLMode {

    DISABLE("disable"),
    ALLOW("allow"),
    PREFER("prefer"),
    REQUIRE("require"),
    VERIFY_CA("verify-ca"),
    VERIFY_FULL("verify-full");
    private final String value;
    private final static Map<String, SSLMode> CONSTANTS = new HashMap<String, SSLMode>();

    static {
        for (SSLMode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SSLMode(String value) {
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
    public static SSLMode fromValue(String value) {
        SSLMode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
