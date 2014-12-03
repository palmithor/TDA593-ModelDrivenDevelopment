package com.mdsd.hotel.presentation.model;

/**
 * @author palmithor
 * @since 27/11/14.
 */
public class Classification {

    private final String id;
    private final String title;
    private final String description;

    public Classification() {
        this.id = null;
        this.title = null;
        this.description = null;
    }

    public Classification(final String id, final String title, final String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
