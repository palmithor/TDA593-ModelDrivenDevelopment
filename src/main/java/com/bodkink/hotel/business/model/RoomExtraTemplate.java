package com.bodkink.hotel.business.model;

import java.util.List;

public class RoomExtraTemplate {

    /**
     *
     */
    private String id;
    /**
     *
     */
    private String templateName;
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
     * Getter of templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Setter of templateName
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
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
