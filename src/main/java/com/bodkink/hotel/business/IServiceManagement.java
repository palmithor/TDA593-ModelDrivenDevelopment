package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Service;

import java.math.BigDecimal;
import java.util.List;

public interface IServiceManagement {

    /**
     * @param name
     * @param description
     * @param width
     * @return
     */
    public Service createService(String name, String description, BigDecimal width);

    /**
     * @param service
     * @return
     */
    public Service editService(Service service);

    /**
     * @return
     */
    public List<Service> listServices();

}
