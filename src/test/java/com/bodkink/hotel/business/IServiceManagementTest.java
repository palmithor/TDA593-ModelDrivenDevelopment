package com.bodkink.hotel.business;

import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.logic.impl.ServiceManagementImpl;
import com.bodkink.hotel.business.model.Service;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IServiceService;
import com.bodkink.hotel.persistence.model.ServiceEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class IServiceManagementTest {

    @Mock
    IServiceService serviceServiceMock;

    List<ServiceEntity> serviceEntities = DBTestDataMock.getServiceEntities();

    IServiceManagement serviceManagement = LogicFactory.eINSTANCE.createServiceManagement();

    @Before
    public void setUp() throws Exception {
        ((ServiceManagementImpl)serviceManagement).serviceService = serviceServiceMock;
    }


    @Test
    public void testCreateService() throws Exception {
        assertThat(serviceEntities.size(), is(2));

        when(serviceServiceMock.persist(anyObject())).then(invocationOnMock -> {
            ServiceEntity serviceEntityFromCall = (ServiceEntity) invocationOnMock.getArguments()[0];
            ServiceEntity serviceEntityCreated = new ServiceEntity(
                    ObjectId.get(),
                    serviceEntityFromCall.getTitle(),
                    serviceEntityFromCall.getDescription(),
                    serviceEntityFromCall.getPrice()
            );
            serviceEntities.add(serviceEntityCreated);
            return serviceEntityCreated;
        });

        Service service = serviceManagement.createService("Gym", "24 hour acces to the gym.", new BigDecimal(150));
        assertThat(serviceEntities.size(), is(3));
    }

    @Test
    public void testEditService() throws Exception {
        assertThat(serviceEntities.get(0).getPrice(), is(new BigDecimal(200)));

        when(serviceServiceMock.edit(anyObject())).then(invocationOnMock -> {
            ServiceEntity serviceEntityFromCall = (ServiceEntity) invocationOnMock.getArguments()[0];
            ServiceEntity serviceEntityCreated = new ServiceEntity(
                    ObjectId.get(),
                    serviceEntityFromCall.getTitle(),
                    serviceEntityFromCall.getDescription(),
                    serviceEntityFromCall.getPrice()
            );
            serviceEntities.set(0, serviceEntityCreated);
            return serviceEntityCreated;
        });

        ServiceEntity serviceEntity = serviceEntities.get(0);
        Service service = EntityToModelConverter.convertService(serviceEntity);
        service.setPrice(new BigDecimal(250));
        serviceEntity = ModelToEntityConverter.convertService(service);
        serviceServiceMock.edit(serviceEntity);

        assertThat(serviceEntities.get(0).getPrice(), is(new BigDecimal(250)));
    }

    @Test
    public void testListServices() throws Exception {
        when(serviceServiceMock.listAll()).thenReturn(serviceEntities);
        assertThat(serviceManagement.listServices().size(), is(serviceEntities.size()));
    }
}
