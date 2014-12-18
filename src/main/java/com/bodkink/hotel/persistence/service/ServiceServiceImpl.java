package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.IServiceService;
import com.bodkink.hotel.persistence.dao.ServiceDAO;
import com.bodkink.hotel.persistence.model.ServiceEntity;
import com.google.inject.Inject;

import java.util.List;

/**
 * @author linneaotterlind
 * @since 18/12/14.
 */
public class ServiceServiceImpl implements IServiceService {

    @Inject
    ServiceDAO serviceDAO;

    @Override
    public List<ServiceEntity> listAll() { return serviceDAO.find().asList(); }

    @Override
    public ServiceEntity edit(ServiceEntity serviceEntity) {
        ServiceEntity old = serviceDAO.get(serviceEntity.getId());
        if(old != null) {
            serviceDAO.save(serviceEntity);
            return serviceEntity;
        } else {
            return null;
        }
    }

    @Override
    public ServiceEntity persist(ServiceEntity serviceEntity) {
        serviceDAO.save(serviceEntity);
        return serviceEntity;
    }
}
