package com.bodkink.hotel.business.model;

import java.math.BigDecimal;
import java.util.List;

public class Room {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String number;
    /**
     *
     */
    private String description;
    /**
     *
     */
    private Integer allowedGuests;
    /**
     *
     */
    private BigDecimal size;
    /**
     *
     */
    private BigDecimal nightPrice;
    /**
     *
     */
    private List<String> pictures;
    /**
     *
     */
    private Classification classification;
    /**
     *
     */
    private List<BedType> bedType;
    /**
     *
     */
    private List<RoomExtra> roomExtra;

    /**
     * Getter of id
     */
    public String getId() {
        return id;
    }

    /**
     * Setter of id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter of number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Setter of number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Getter of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter of description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter of allowedGuests
     */
    public Integer getAllowedGuests() {
        return allowedGuests;
    }

    /**
     * Setter of allowedGuests
     */
    public void setAllowedGuests(Integer allowedGuests) {
        this.allowedGuests = allowedGuests;
    }

    /**
     * Getter of size
     */
    public BigDecimal getSize() {
        return size;
    }

    /**
     * Setter of size
     */
    public void setSize(BigDecimal size) {
        this.size = size;
    }

    /**
     * Getter of nightPrice
     */
    public BigDecimal getNightPrice() {
        return nightPrice;
    }

    /**
     * Setter of nightPrice
     */
    public void setNightPrice(BigDecimal nightPrice) {
        this.nightPrice = nightPrice;
    }

    /**
     * Getter of pictures
     */
    public List<String> getPictures() {
        return pictures;
    }

    /**
     * Setter of pictures
     */
    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    /**
     * Getter of classification
     */
    public Classification getClassification() {
        return classification;
    }

    /**
     * Setter of classification
     */
    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    /**
     * Getter of bedType
     */
    public List<BedType> getBedType() {
        return bedType;
    }

    /**
     * Setter of bedType
     */
    public void setBedType(List<BedType> bedType) {
        this.bedType = bedType;
    }

    /**
     * Getter of roomExtra
     */
    public List<RoomExtra> getRoomExtra() {
        return roomExtra;
    }

    /**
     * Setter of roomExtra
     */
    public void setRoomExtra(List<RoomExtra> roomExtra) {
        this.roomExtra = roomExtra;
    }

}
