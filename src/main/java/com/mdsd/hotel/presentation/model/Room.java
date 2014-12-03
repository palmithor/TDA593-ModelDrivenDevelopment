package com.mdsd.hotel.presentation.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Room {

    private final String id;
    private final String number;
    private final String description;
    private final Integer allowedGuests;
    private final BigDecimal size;
    private final BigDecimal nightPrice;
    private final List<String> pictures;
    private final Classification classification;
    private final List<RoomExtra> roomExtras;
    private final Map<BedType, Integer> bedTypesCount;

    public Room() {
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

    public Room(final Map<BedType, Integer> bedTypesCount, final List<RoomExtra> roomExtras, final Classification classification,
                final List<String> pictures, final BigDecimal nightPrice, final BigDecimal size, final Integer allowedGuests,
                final String description, final String number, final String id) {
        this.bedTypesCount = bedTypesCount;
        this.roomExtras = roomExtras;
        this.classification = classification;
        this.pictures = pictures;
        this.nightPrice = nightPrice;
        this.size = size;
        this.allowedGuests = allowedGuests;
        this.description = description;
        this.number = number;
        this.id = id;
    }

    public String getId() {
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

    public Classification getClassification() {
        return classification;
    }

    public List<RoomExtra> getRoomExtras() {
        return roomExtras;
    }

    public Map<BedType, Integer> getBedTypesCount() {
        return bedTypesCount;
    }
}
