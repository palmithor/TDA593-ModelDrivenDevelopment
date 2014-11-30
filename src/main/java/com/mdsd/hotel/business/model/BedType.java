package com.mdsd.hotel.business.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BedType {

    private String name;
    private Integer length;
    private Integer width;
    private Integer places; // Allowed number of people


    public BedType() {
    }

    public BedType(String name, Integer length, Integer width, Integer places) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(final Integer length) {
        this.length = length;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(final Integer width) {
        this.width = width;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(final Integer places) {
        this.places = places;
    }
}
