package com.mdsd.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BedType {

    private final String id;
    private final String name;
    private final Integer length;
    private final Integer width;
    private final Integer places; // Allowed number of people

    public BedType() {
        this.places = null;
        this.width = null;
        this.length = null;
        this.name = null;
        this.id = null;
    }

    public BedType(Integer places, Integer width, Integer length, String name, String id) {
        this.places = places;
        this.width = width;
        this.length = length;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getLength() {
        return length;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getPlaces() {
        return places;
    }
}
