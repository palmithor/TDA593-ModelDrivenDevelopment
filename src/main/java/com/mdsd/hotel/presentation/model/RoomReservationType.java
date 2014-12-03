package com.mdsd.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomReservationType {

    private final String id;
    private final String type;


    public RoomReservationType() {
        this.id = null;
        this.type = null;
    }

    public RoomReservationType(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
