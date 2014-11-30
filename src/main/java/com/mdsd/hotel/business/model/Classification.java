package com.mdsd.hotel.business.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Classification {

    private String title;
    private String description;

    public Classification() {
    }

    public Classification(final String title, final String description) {
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
