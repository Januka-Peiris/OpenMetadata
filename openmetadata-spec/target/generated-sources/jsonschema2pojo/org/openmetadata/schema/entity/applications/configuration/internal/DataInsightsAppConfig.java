
package org.openmetadata.schema.entity.applications.configuration.internal;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * DataInsightsAppConfig
 * <p>
 * No configuration needed to instantiate the Data Insights Pipeline. The logic is handled in the backend.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@Generated("jsonschema2pojo")
public class DataInsightsAppConfig {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DataInsightsAppConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataInsightsAppConfig) == false) {
            return false;
        }
        DataInsightsAppConfig rhs = ((DataInsightsAppConfig) other);
        return true;
    }

}
