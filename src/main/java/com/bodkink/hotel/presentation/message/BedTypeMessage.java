package com.bodkink.hotel.presentation.message;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BedTypeMessage {

    private final String id;
    private final String name;
    private final Integer length;
    private final Integer width;
    private final Integer places; // Allowed number of people

    public BedTypeMessage() {
        this.places = null;
        this.width = null;
        this.length = null;
        this.name = null;
        this.id = null;
    }

    public BedTypeMessage(Integer places, Integer width, Integer length, String name) {
        this.places = places;
        this.width = width;
        this.length = length;
        this.name = name;
        this.id = null;
    }

    public BedTypeMessage(final String id, Integer places, Integer width, Integer length, String name) {
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
