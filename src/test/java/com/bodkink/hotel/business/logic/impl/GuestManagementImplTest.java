package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.logic.LogicFactory;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.test.DBTestDataMock;
import com.bodkink.hotel.test.ModelTestDataMock;
import org.eclipse.emf.common.util.BasicEList;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class GuestManagementImplTest {

    @Mock
    IRoomReservationManagement roomReservationMock;
    @Mock
    IRoomManagement roomManagementMock;
    @Mock
    IBookingService bookingServiceMock;

    List<RoomEntity> roomEntities = DBTestDataMock.getRoomEntities();
    List<Room> rooms;
    Customer customer = ModelTestDataMock.getCustomer();
    IBookingManagement bookingManagement;

    public void setUp() throws Exception {
        setUpBooking();
        setUpPayment();
    }

    private void setUpBooking(){
        bookingManagement = LogicFactory.eINSTANCE.createBookingManagement();

        rooms = new BasicEList<>();
        roomEntities.forEach(entity -> {
            rooms.add(EntityToModelConverter.convertRoom(entity));
        });

        ((BookingManagementImpl) bookingManagement).roomReservationManagement = roomReservationMock;
        ((BookingManagementImpl) bookingManagement).roomManagement = roomManagementMock;
        ((BookingManagementImpl) bookingManagement).bookingService = bookingServiceMock;

    }

    private void setUpPayment(){

    }

    public void tearDown() throws Exception {

    }

    public void testCheckOut() throws Exception {

    }

    public void testCheckIn() throws Exception {

    }

    public void testCheckOut1() throws Exception {

    }
}