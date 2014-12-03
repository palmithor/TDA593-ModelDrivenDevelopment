package com.mdsd.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

/**
 * @author palmithor
 * @since 01/12/14.
 */
@Entity("RoomExtrasTemplate")
public class RoomExtrasTemplateEntity {

    @Id
    private final ObjectId id;
    private final String name;
    @Reference
    private final List<RoomExtraEntity> roomExtraEntities;


    public RoomExtrasTemplateEntity() {
        this.id = null;
        this.name = null;
        this.roomExtraEntities = null;
    }

    public RoomExtrasTemplateEntity(ObjectId id, String name, List<RoomExtraEntity> roomExtraEntities) {
        this.id = id;
        this.name = name;
        this.roomExtraEntities = roomExtraEntities;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<RoomExtraEntity> getRoomExtraEntities() {
        return roomExtraEntities;
    }
}
