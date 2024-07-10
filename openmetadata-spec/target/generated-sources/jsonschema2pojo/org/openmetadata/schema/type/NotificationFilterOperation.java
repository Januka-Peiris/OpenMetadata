
package org.openmetadata.schema.type;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * This schema defines all possible filter operations on metadata of entities in OpenMetadata.
 * 
 */
@Generated("jsonschema2pojo")
public enum NotificationFilterOperation {

    FILTER_BY_SOURCE("filterBySource"),
    FILTER_BY_ENTITY_ID("filterByEntityId"),
    FILTER_BY_OWNER_NAME("filterByOwnerName"),
    FILTER_BY_FQN("filterByFqn"),
    FILTER_BY_EVENT_TYPE("filterByEventType"),
    FILTER_BY_UPDATER_NAME("filterByUpdaterName"),
    FILTER_BY_FIELD_CHANGE("filterByFieldChange"),
    FILTER_BY_DOMAIN("filterByDomain"),
    FILTER_BY_MENTIONED_NAME("filterByMentionedName"),
    FILTER_BY_GENERAL_METADATA_EVENTS("filterByGeneralMetadataEvents");
    private final String value;
    private final static Map<String, NotificationFilterOperation> CONSTANTS = new HashMap<String, NotificationFilterOperation>();

    static {
        for (NotificationFilterOperation c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    NotificationFilterOperation(String value) {
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
    public static NotificationFilterOperation fromValue(String value) {
        NotificationFilterOperation constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
