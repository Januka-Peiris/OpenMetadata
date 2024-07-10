
package org.openmetadata.schema.type;

import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Location containing the ML Model. It can be a storage layer and/or a container repository.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "storage",
    "imageRepository"
})
@Generated("jsonschema2pojo")
public class MlStore {

    /**
     * Storage Layer containing the ML Model data.
     * 
     */
    @JsonProperty("storage")
    @JsonPropertyDescription("Storage Layer containing the ML Model data.")
    private String storage;
    /**
     * Container Repository with the ML Model image.
     * 
     */
    @JsonProperty("imageRepository")
    @JsonPropertyDescription("Container Repository with the ML Model image.")
    private String imageRepository;

    /**
     * Storage Layer containing the ML Model data.
     * 
     */
    @JsonProperty("storage")
    public String getStorage() {
        return storage;
    }

    /**
     * Storage Layer containing the ML Model data.
     * 
     */
    @JsonProperty("storage")
    public void setStorage(String storage) {
        this.storage = storage;
    }

    public MlStore withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Container Repository with the ML Model image.
     * 
     */
    @JsonProperty("imageRepository")
    public String getImageRepository() {
        return imageRepository;
    }

    /**
     * Container Repository with the ML Model image.
     * 
     */
    @JsonProperty("imageRepository")
    public void setImageRepository(String imageRepository) {
        this.imageRepository = imageRepository;
    }

    public MlStore withImageRepository(String imageRepository) {
        this.imageRepository = imageRepository;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MlStore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("storage");
        sb.append('=');
        sb.append(((this.storage == null)?"<null>":this.storage));
        sb.append(',');
        sb.append("imageRepository");
        sb.append('=');
        sb.append(((this.imageRepository == null)?"<null>":this.imageRepository));
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
        result = ((result* 31)+((this.imageRepository == null)? 0 :this.imageRepository.hashCode()));
        result = ((result* 31)+((this.storage == null)? 0 :this.storage.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MlStore) == false) {
            return false;
        }
        MlStore rhs = ((MlStore) other);
        return (((this.imageRepository == rhs.imageRepository)||((this.imageRepository!= null)&&this.imageRepository.equals(rhs.imageRepository)))&&((this.storage == rhs.storage)||((this.storage!= null)&&this.storage.equals(rhs.storage))));
    }

}
