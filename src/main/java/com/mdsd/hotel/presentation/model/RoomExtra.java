package com.mdsd.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomExtra {

    private final String id;
    private final String name;
    private final String description;

    public RoomExtra() {
        this.id = null;
        this.name = null;
        this.description = null;
    }

    public RoomExtra(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
