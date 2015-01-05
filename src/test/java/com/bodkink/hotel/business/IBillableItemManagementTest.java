package com.bodkink.hotel.business;

import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.logic.impl.BillableItemManagementImpl;
import com.bodkink.hotel.business.model.BillableItem;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IBillableItemService;
import com.bodkink.hotel.persistence.model.BillableItemEntity;
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
public class IBillableItemManagementTest {

    @Mock
    IBillableItemService billableItemServiceMock;

    List<BillableItemEntity> billableItemEntities = DBTestDataMock.getBillableItemEntities();

    IBillableItemManagement billableItemManagement = LogicFactory.eINSTANCE.createBillableItemManagement();

    @Before
    public void setUp() throws Exception {
        ((BillableItemManagementImpl)billableItemManagement).billableItemService = billableItemServiceMock;
    }


    @Test
    public void testCreateBillableItem() throws Exception {
        assertThat(billableItemEntities.size(), is(2));

        when(billableItemServiceMock.persist(anyObject())).then(invocationOnMock -> {
            BillableItemEntity billableItemEntityFromCall = (BillableItemEntity) invocationOnMock.getArguments()[0];
            BillableItemEntity billableItemEntityCreated = new BillableItemEntity(
                    ObjectId.get(),
                    billableItemEntityFromCall.getName(),
                    billableItemEntityFromCall.getPrice()
            );
            billableItemEntities.add(billableItemEntityCreated);
            return billableItemEntityCreated;
        });

        BillableItem billableItem = billableItemManagement.createBillableItem("Apple", new BigDecimal(10));
        assertThat(billableItemEntities.size(), is(3));
    }

    @Test
    public void testEditBillableItem() throws Exception {
        assertThat(billableItemEntities.get(0).getPrice(), is(new BigDecimal(30)));

        when(billableItemServiceMock.edit(anyObject())).then(invocationOnMock -> {
            BillableItemEntity billableItemEntityFromCall = (BillableItemEntity) invocationOnMock.getArguments()[0];
            BillableItemEntity billableItemEntityCreated = new BillableItemEntity(
                    ObjectId.get(),
                    billableItemEntityFromCall.getName(),
                    billableItemEntityFromCall.getPrice()
            );
            billableItemEntities.set(0, billableItemEntityCreated);
            return billableItemEntityCreated;
        });

        BillableItemEntity billableItemEntity = billableItemEntities.get(0);
        BillableItem billableItem = EntityToModelConverter.convertBillableItem(billableItemEntity);
        billableItem.setPrice(new BigDecimal(25));
        billableItemEntity = ModelToEntityConverter.convertBillableItem(billableItem);
        billableItemServiceMock.edit(billableItemEntity);

        assertThat(billableItemEntities.get(0).getPrice(), is(new BigDecimal(25)));
    }

    @Test
    public void testListBillableItems() throws Exception {
        when(billableItemServiceMock.listAll()).thenReturn(billableItemEntities);
        assertThat(billableItemManagement.listBillableItems().size(), is(billableItemEntities.size()));
    }
}