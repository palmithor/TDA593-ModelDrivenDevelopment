package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("RoomReservationType")
public class RoomReservationTypeEntity {

    @Id
    private final ObjectId id;
    private final String type;


    public RoomReservationTypeEntity() {
        this.id = null;
        this.type = null;
    }

    public RoomReservationTypeEntity(String type) {
        this.id = null;
        this.type = type;
    }

    public RoomReservationTypeEntity(ObjectId id, String type) {
        this.id = id;
        this.type = type;
    }

    public ObjectId getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
