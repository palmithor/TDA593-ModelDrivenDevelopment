package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBedTypeManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.BedType;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IBedTypeService;
import com.bodkink.hotel.persistence.model.BedTypeEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import org.bson.types.ObjectId;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class BedTypeManagementTest {

    @Mock
    IBedTypeService bedTypeServiceMock;

    List<BedTypeEntity> bedTypeEntities = DBTestDataMock.getBedTypeEntities();

    IBedTypeManagement bedTypeManagement = LogicFactory.eINSTANCE.createBedTypeManagement();

    @Before
    public void setUp() throws Exception {
        ((BedTypeManagementImpl)bedTypeManagement).bedTypeService = bedTypeServiceMock;
    }

    @Test
    public void testCreateBedType() throws Exception {
        assertThat(bedTypeEntities.size(), is(2));

        when(bedTypeServiceMock.persist(anyObject())).then(invocationOnMock -> {
            BedTypeEntity bedTypeEntityFromCall = (BedTypeEntity) invocationOnMock.getArguments()[0];
            BedTypeEntity bedTypeEntityCreated = new BedTypeEntity(
                    ObjectId.get(),
                    bedTypeEntityFromCall.getPlaces(),
                    bedTypeEntityFromCall.getWidth(),
                    bedTypeEntityFromCall.getLength(),
                    bedTypeEntityFromCall.getName()
            );
            bedTypeEntities.add(bedTypeEntityCreated);
            return bedTypeEntityCreated;
        });

        BedType bedType = bedTypeManagement.createBedType("Triple Bed", 240, 200, 3);

        assertThat(bedTypeEntities.size(), is(3));
    }

    @Test
    public void testEditBedType() throws Exception {
        assertThat(bedTypeEntities.get(0).getName(), is("Double Bed"));

        when(bedTypeServiceMock.edit(anyObject())).then(invocationOnMock -> {
            BedTypeEntity bedTypeEntityFromCall = (BedTypeEntity) invocationOnMock.getArguments()[0];
            BedTypeEntity bedTypeEntityCreated = new BedTypeEntity(
                    bedTypeEntityFromCall.getId(),
                    bedTypeEntityFromCall.getPlaces(),
                    bedTypeEntityFromCall.getWidth(),
                    bedTypeEntityFromCall.getLength(),
                    bedTypeEntityFromCall.getName()
            );
            bedTypeEntities.set(0, bedTypeEntityCreated);
            return bedTypeEntityCreated;
        });

        BedTypeEntity bedTypeEntity = bedTypeEntities.get(0);
        BedType bedType = EntityToModelConverter.convertBedType(bedTypeEntity);
        bedType.setName("2x Bed");
        bedTypeEntity = ModelToEntityConverter.convertBedType(bedType);
        bedTypeServiceMock.edit(bedTypeEntity);

        assertThat(bedTypeEntities.get(0).getName(), is("2x Bed"));
    }

    @Test
    public void testListBedTypes() throws Exception {
        List<BedTypeEntity> bedTypeEntities= DBTestDataMock.getBedTypeEntities();
        when(bedTypeServiceMock.listAll()).thenReturn(bedTypeEntities);
        assertThat(bedTypeManagement.listBedTypes().size(), is(bedTypeEntities.size()));
    }
}