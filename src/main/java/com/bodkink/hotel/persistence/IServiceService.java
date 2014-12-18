package com.bodkink.hotel.persistence;

import com.bodkink.hotel.persistence.model.ServiceEntity;

import java.util.List;

/**
 * @author linneaotterlind
 * @since 18/12/14.
 */
public interface IServiceService {

    public List<ServiceEntity> listAll();

    public ServiceEntity edit(ServiceEntity serviceEntity);

    public ServiceEntity persist(ServiceEntity serviceEntity);
    
}
