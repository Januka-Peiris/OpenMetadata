
package org.openmetadata.schema.services.connections.pipeline;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * SparkConnection
 * <p>
 * Spark Metadata Pipeline Connection Config
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type"
})
@Generated("jsonschema2pojo")
public class SparkConnection {

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Service type.")
    private SparkConnection.SparkType type = SparkConnection.SparkType.fromValue("Spark");

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public SparkConnection.SparkType getType() {
        return type;
    }

    /**
     * Service type.
     * 
     */
    @JsonProperty("type")
    public void setType(SparkConnection.SparkType type) {
        this.type = type;
    }

    public SparkConnection withType(SparkConnection.SparkType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SparkConnection.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SparkConnection) == false) {
            return false;
        }
        SparkConnection rhs = ((SparkConnection) other);
        return ((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type)));
    }


    /**
     * Service type.
     * 
     */
    @Generated("jsonschema2pojo")
    public enum SparkType {

        SPARK("Spark");
        private final String value;
        private final static Map<String, SparkConnection.SparkType> CONSTANTS = new HashMap<String, SparkConnection.SparkType>();

        static {
            for (SparkConnection.SparkType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        SparkType(String value) {
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
        public static SparkConnection.SparkType fromValue(String value) {
            SparkConnection.SparkType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
