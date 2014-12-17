package com.bodkink.hotel.presentation.message;


import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomMessage {


    private final String id;
    private final String number;
    private final String description;
    private final Integer allowedGuests;
    private final BigDecimal size;
    private final BigDecimal nightPrice;
    private final List<String> pictures;
    private final ClassificationMessage classification;
    private final List<RoomExtraMessage> roomExtras;
    private final Map<String, Integer> bedTypesCount;

    public RoomMessage() {
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

    public RoomMessage(String id, String number, String description, Integer allowedGuests, BigDecimal size, BigDecimal nightPrice, List<String> pictures, ClassificationMessage classification, List<RoomExtraMessage> roomExtras, Map<String, Integer> bedTypesCount) {
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

    public RoomMessage(String number, String description, Integer allowedGuests, BigDecimal size, BigDecimal nightPrice, List<String> pictures, ClassificationMessage classification, List<RoomExtraMessage> roomExtras, Map<String, Integer> bedTypesCount) {
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

    public ClassificationMessage getClassification() {
        return classification;
    }

    public List<RoomExtraMessage> getRoomExtras() {
        return roomExtras;
    }

    public Map<String, Integer> getBedTypesCount() {
        return bedTypesCount;
    }
}
