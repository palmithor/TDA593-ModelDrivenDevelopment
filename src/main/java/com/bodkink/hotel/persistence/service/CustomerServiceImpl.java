package com.bodkink.hotel.persistence.service;

import com.bodkink.hotel.persistence.ICustomerService;
import com.bodkink.hotel.persistence.dao.CardInformationDAO;
import com.bodkink.hotel.persistence.dao.CustomerDAO;
import com.bodkink.hotel.persistence.model.CustomerEntity;
import com.google.inject.Inject;
import org.mongodb.morphia.Key;

import java.util.List;

/**
 * @author palmithor
 * @since 08/12/14.
 */
public class CustomerServiceImpl implements ICustomerService {

    @Inject
    CustomerDAO customerDAO;

    @Inject
    CardInformationDAO cardInformationDAO;

    @Override
    public List<CustomerEntity> listAll() {
        return customerDAO.find().asList();
    }

    @Override
    public Key<CustomerEntity> persist(CustomerEntity customerEntity) {
        cardInformationDAO.save(customerEntity.getCardInformation());
        return customerDAO.save(customerEntity);
    }
}
