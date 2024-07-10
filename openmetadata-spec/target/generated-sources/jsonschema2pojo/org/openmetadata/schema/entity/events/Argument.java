
package org.openmetadata.schema.entity.events;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Argument for the filter.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "input"
})
@Generated("jsonschema2pojo")
public class Argument {

    /**
     * Name of the Argument
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the Argument")
    private String name;
    /**
     * Value of the Argument
     * 
     */
    @JsonProperty("input")
    @JsonPropertyDescription("Value of the Argument")
    @Valid
    private List<String> input = new ArrayList<String>();

    /**
     * Name of the Argument
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the Argument
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Argument withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Value of the Argument
     * 
     */
    @JsonProperty("input")
    public List<String> getInput() {
        return input;
    }

    /**
     * Value of the Argument
     * 
     */
    @JsonProperty("input")
    public void setInput(List<String> input) {
        this.input = input;
    }

    public Argument withInput(List<String> input) {
        this.input = input;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Argument.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("input");
        sb.append('=');
        sb.append(((this.input == null)?"<null>":this.input));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.input == null)? 0 :this.input.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Argument) == false) {
            return false;
        }
        Argument rhs = ((Argument) other);
        return (((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.input == rhs.input)||((this.input!= null)&&this.input.equals(rhs.input))));
    }

}
