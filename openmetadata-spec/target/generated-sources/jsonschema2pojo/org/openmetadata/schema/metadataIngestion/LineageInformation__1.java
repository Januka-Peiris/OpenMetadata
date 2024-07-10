
package org.openmetadata.schema.metadataIngestion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Lineage Information
 * <p>
 * Details required to generate Lineage
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dbServiceNames",
    "storageServiceNames"
})
@Generated("jsonschema2pojo")
public class LineageInformation__1 {

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    @JsonPropertyDescription("List of Database Service Names for creation of lineage")
    @Valid
    private List<String> dbServiceNames = new ArrayList<String>();
    /**
     * Storage Service Names List
     * <p>
     * List of Storage Service Names for creation of lineage
     * 
     */
    @JsonProperty("storageServiceNames")
    @JsonPropertyDescription("List of Storage Service Names for creation of lineage")
    @Valid
    private List<String> storageServiceNames = new ArrayList<String>();
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    public List<String> getDbServiceNames() {
        return dbServiceNames;
    }

    /**
     * Database Service Names List
     * <p>
     * List of Database Service Names for creation of lineage
     * 
     */
    @JsonProperty("dbServiceNames")
    public void setDbServiceNames(List<String> dbServiceNames) {
        this.dbServiceNames = dbServiceNames;
    }

    public LineageInformation__1 withDbServiceNames(List<String> dbServiceNames) {
        this.dbServiceNames = dbServiceNames;
        return this;
    }

    /**
     * Storage Service Names List
     * <p>
     * List of Storage Service Names for creation of lineage
     * 
     */
    @JsonProperty("storageServiceNames")
    public List<String> getStorageServiceNames() {
        return storageServiceNames;
    }

    /**
     * Storage Service Names List
     * <p>
     * List of Storage Service Names for creation of lineage
     * 
     */
    @JsonProperty("storageServiceNames")
    public void setStorageServiceNames(List<String> storageServiceNames) {
        this.storageServiceNames = storageServiceNames;
    }

    public LineageInformation__1 withStorageServiceNames(List<String> storageServiceNames) {
        this.storageServiceNames = storageServiceNames;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public LineageInformation__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LineageInformation__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dbServiceNames");
        sb.append('=');
        sb.append(((this.dbServiceNames == null)?"<null>":this.dbServiceNames));
        sb.append(',');
        sb.append("storageServiceNames");
        sb.append('=');
        sb.append(((this.storageServiceNames == null)?"<null>":this.storageServiceNames));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
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
        result = ((result* 31)+((this.storageServiceNames == null)? 0 :this.storageServiceNames.hashCode()));
        result = ((result* 31)+((this.dbServiceNames == null)? 0 :this.dbServiceNames.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineageInformation__1) == false) {
            return false;
        }
        LineageInformation__1 rhs = ((LineageInformation__1) other);
        return ((((this.storageServiceNames == rhs.storageServiceNames)||((this.storageServiceNames!= null)&&this.storageServiceNames.equals(rhs.storageServiceNames)))&&((this.dbServiceNames == rhs.dbServiceNames)||((this.dbServiceNames!= null)&&this.dbServiceNames.equals(rhs.dbServiceNames))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
