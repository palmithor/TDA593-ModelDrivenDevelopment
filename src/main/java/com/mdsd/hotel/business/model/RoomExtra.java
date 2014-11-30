package com.mdsd.hotel.business.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class RoomExtra {

    private String title;
    private String description;

    public RoomExtra() {
    }

    public RoomExtra(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
