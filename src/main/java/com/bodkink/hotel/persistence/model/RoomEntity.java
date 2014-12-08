package com.bodkink.hotel.persistence.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import javax.persistence.PrePersist;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 27/11/14.
 */
@Entity("Room")
public class RoomEntity {

    @Id
    private final ObjectId id;
    private final String number;
    private final String description;
    private final Integer allowedGuests;
    private final BigDecimal size;
    private final BigDecimal nightPrice;
    private final List<String> pictures;
    @Reference
    private final ClassificationEntity classification;
    @Reference
    private final List<RoomExtraEntity> roomExtras;
    private final Map<ObjectId, Integer> bedTypesCount;
    private Date created;
    private Date lastUpdated;

    public RoomEntity() {
        this.bedTypesCount = null;
        this.roomExtras = null;
        this.classification = null;
        this.pictures = null;
        this.nightPrice = null;
        this.size = null;
        this.allowedGuests = null;
        this.description = null;
        this.number = null;
        this.id = null;
    }

    public RoomEntity(ObjectId id, String number, String description, Integer allowedGuests, BigDecimal size, BigDecimal nightPrice, List<String> pictures, ClassificationEntity classification, List<RoomExtraEntity> roomExtras, Map<ObjectId, Integer> bedTypesCount) {
        this.id = id;
        this.number = number;
        this.description = description;
        this.allowedGuests = allowedGuests;
        this.size = size;
        this.nightPrice = nightPrice;
        this.pictures = pictures;
        this.classification = classification;
        this.roomExtras = roomExtras;
        this.bedTypesCount = bedTypesCount;
    }

    public RoomEntity(String number, String description, Integer allowedGuests, BigDecimal size, BigDecimal nightPrice, List<String> pictures, ClassificationEntity classification, List<RoomExtraEntity> roomExtras, Map<ObjectId, Integer> bedTypesCount) {
        this.id = null;
        this.number = number;
        this.description = description;
        this.allowedGuests = allowedGuests;
        this.size = size;
        this.nightPrice = nightPrice;
        this.pictures = pictures;
        this.classification = classification;
        this.roomExtras = roomExtras;
        this.bedTypesCount = bedTypesCount;
    }

    @PrePersist
    public void prePersist() {
        if (created == null) {
            created = new Date();
        }
        lastUpdated = new Date();
    }

    public ObjectId getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public Integer getAllowedGuests() {
        return allowedGuests;
    }

    public BigDecimal getSize() {
        return size;
    }

    public BigDecimal getNightPrice() {
        return nightPrice;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public ClassificationEntity getClassification() {
        return classification;
    }

    public List<RoomExtraEntity> getRoomExtras() {
        return roomExtras;
    }

    public Map<ObjectId, Integer> getBedTypesCount() {
        return bedTypesCount;
    }

    public Date getCreated() {
        return created;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
}
