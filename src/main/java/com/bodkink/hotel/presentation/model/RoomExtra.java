package com.bodkink.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomExtra {

    private final String id;
    private final String title;
    private final String description;

    public RoomExtra() {
        this.description = null;
        this.title = null;
        this.id = null;
    }

    public RoomExtra(final String id, final String description, final String title) {
        this.description = description;
        this.title = title;
        this.id = id;
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
