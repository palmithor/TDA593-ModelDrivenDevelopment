package com.mdsd.hotel.business.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class RoomExtrasTemplate {

    private String name;
    private List<RoomExtra> roomExtras;


    public RoomExtrasTemplate() {
        this.roomExtras = new ArrayList<>();
    }

    public RoomExtrasTemplate(String name, List<RoomExtra> roomExtras) {
        this.name = name;
        this.roomExtras = roomExtras;
    }

    public void addRoomExtra(final RoomExtra roomExtra) {
        if (roomExtras == null) {
            this.roomExtras = new ArrayList<>();
        }
        this.roomExtras.add(roomExtra);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<RoomExtra> getRoomExtras() {
        return roomExtras;
    }

    public void setRoomExtras(List<RoomExtra> roomExtras) {
        this.roomExtras = roomExtras;
    }
}
