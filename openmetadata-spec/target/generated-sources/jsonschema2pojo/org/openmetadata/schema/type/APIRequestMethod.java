
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines the Request Method type for APIs .
 * 
 */
@Generated("jsonschema2pojo")
public enum APIRequestMethod {

    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    HEAD("HEAD"),
    CONNECT("CONNECT"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");
    private final String value;
    private final static Map<String, APIRequestMethod> CONSTANTS = new HashMap<String, APIRequestMethod>();

    static {
        for (APIRequestMethod c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    APIRequestMethod(String value) {
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
    public static APIRequestMethod fromValue(String value) {
        APIRequestMethod constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
