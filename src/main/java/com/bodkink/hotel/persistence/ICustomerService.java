package com.bodkink.hotel.persistence;

import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.persistence.model.BedTypeEntity;
import com.bodkink.hotel.persistence.model.CustomerEntity;
import org.mongodb.morphia.Key;

import java.util.List;

/**
 * @author palmithor
 * @since 09/12/14.
 */
public interface ICustomerService {

    public List<CustomerEntity> listAll();

    public Key<CustomerEntity> persist(CustomerEntity customerEntity);

    public CustomerEntity edit(CustomerEntity customerEntity);
}
