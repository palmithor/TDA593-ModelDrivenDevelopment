package com.bodkink.hotel.presentation.message;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomExtraMessage {


    private final String id;
    private final String title;
    private final String description;

    public RoomExtraMessage() {
        this.description = null;
        this.title = null;
        this.id = null;
    }

    public RoomExtraMessage(final String id, final String title, final String description) {
        this.description = description;
        this.title = title;
        this.id = id;
    }

    public RoomExtraMessage(final String title, final String description) {
        this.description = description;
        this.title = title;
        this.id = null;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
