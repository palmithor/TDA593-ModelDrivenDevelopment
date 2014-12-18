package com.bodkink.hotel.presentation.message;


import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
public class RoomExtrasTemplateMessage {


    private final String id;
    private final String name;
    private final List<RoomExtraMessage> roomExtraEntities;


    public RoomExtrasTemplateMessage() {
        this.id = null;
        this.name = null;
        this.roomExtraEntities = null;
    }

    public RoomExtrasTemplateMessage(String id, String name, List<RoomExtraMessage> roomExtraEntities) {
        this.id = id;
        this.name = name;
        this.roomExtraEntities = roomExtraEntities;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<RoomExtraMessage> getRoomExtraEntities() {
        return roomExtraEntities;
    }
}
