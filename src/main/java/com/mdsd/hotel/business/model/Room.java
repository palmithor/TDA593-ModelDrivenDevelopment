package com.mdsd.hotel.business.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Room {

    private String number;
    private String description;
    private Integer allowedGuests;
    private BigDecimal size;
    private BigDecimal nightPrice;
    private List<String> pictures;
    private Classification classification;
    private List<RoomExtra> roomExtras;
    private Map<BedType, Integer> bedTypesCount;

    public Room() {
        this.pictures = new ArrayList<>();
        this.roomExtras = new ArrayList<>();
        this.bedTypesCount = new HashMap<>();
    }

    public Room(final String number, final String description, final Integer allowedGuests, final BigDecimal size,
                final BigDecimal nightPrice, final List<String> pictures, final Classification classification,
                final List<RoomExtra> roomExtras, final Map<BedType, Integer> bedTypesCount) {
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

    public void addBedType(final BedType bedType, final Integer numberOfBeds) {
        if (bedTypesCount == null) {
            bedTypesCount = new HashMap<>();
        }
        bedTypesCount.putIfAbsent(bedType, numberOfBeds);
    }

    public Integer getBedTypeCount(final BedType bedType) {
        Integer result = 0;
        if (bedTypesCount != null) {
            if (bedTypesCount.containsKey(bedType)) {
                result = bedTypesCount.get(bedType);
            }
        }
        return result;
    }

    public void addPicture(final String pictureUrl) {
        // TODO should we verify that this is a url?
        if (pictures == null) {
            pictures = new ArrayList<>();
        }
        pictures.add(pictureUrl);
    }

    public void addRoomExtra(final RoomExtra roomExtra) {
        if (roomExtras == null) {
            roomExtras = new ArrayList<>();
        }
        roomExtras.add(roomExtra);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAllowedGuests() {
        return allowedGuests;
    }

    public void setAllowedGuests(Integer allowedGuests) {
        this.allowedGuests = allowedGuests;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public BigDecimal getNightPrice() {
        return nightPrice;
    }

    public void setNightPrice(BigDecimal nightPrice) {
        this.nightPrice = nightPrice;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public List<RoomExtra> getRoomExtras() {
        return roomExtras;
    }

    public void setRoomExtras(List<RoomExtra> roomExtras) {
        this.roomExtras = roomExtras;
    }

    public Map<BedType, Integer> getBedTypesCount() {
        return bedTypesCount;
    }

    public void setBedTypesCount(Map<BedType, Integer> bedTypesCount) {
        this.bedTypesCount = bedTypesCount;
    }
}
