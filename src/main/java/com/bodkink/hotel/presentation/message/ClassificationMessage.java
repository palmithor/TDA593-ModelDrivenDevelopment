package com.bodkink.hotel.presentation.message;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class ClassificationMessage {


    private final String id;
    private final String title;
    private final String description;

    public ClassificationMessage() {
        this.id = null;
        this.title = null;
        this.description = null;
    }

    public ClassificationMessage(final String title, final String description) {
        this.id = null;
        this.title = title;
        this.description = description;
    }

    public ClassificationMessage(final String id, final String title, final String description) {
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
