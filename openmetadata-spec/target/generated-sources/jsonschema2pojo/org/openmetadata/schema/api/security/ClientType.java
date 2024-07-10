
package org.openmetadata.schema.api.security;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Client Type
 * 
 */
@Generated("jsonschema2pojo")
public enum ClientType {

    PUBLIC("public"),
    CONFIDENTIAL("confidential");
    private final String value;
    private final static Map<String, ClientType> CONSTANTS = new HashMap<String, ClientType>();

    static {
        for (ClientType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ClientType(String value) {
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
    public static ClientType fromValue(String value) {
        ClientType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
