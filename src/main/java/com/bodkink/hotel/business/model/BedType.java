package com.bodkink.hotel.business.model;

public class BedType {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Integer length;
    /**
     *
     */
    private Integer width;
    /**
     *
     */
    private Integer places;

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
     * Getter of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter of length
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Setter of length
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * Getter of width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Setter of width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Getter of places
     */
    public Integer getPlaces() {
        return places;
    }

    /**
     * Setter of places
     */
    public void setPlaces(Integer places) {
        this.places = places;
    }

}
