package com.mdsd.hotel.presentation.model;

import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class RoomExtrasTemplate {

    private final String id;
    private final String name;
    private final List<RoomExtra> roomExtras;

    public RoomExtrasTemplate() {
        this.roomExtras = null;
        this.name = null;
        this.id = null;
    }

    public RoomExtrasTemplate(List<RoomExtra> roomExtras, String name, String id) {
        this.roomExtras = roomExtras;
        this.name = name;
        this.id = id;
    }


}
