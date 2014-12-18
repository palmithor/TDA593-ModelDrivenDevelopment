package com.bodkink.hotel.presentation.controllers.controllers;

import com.bodkink.hotel.business.util.BookingCache;
import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.presentation.message.*;
import com.google.inject.Injector;
import conf.StartupActions;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BookingControllerDocTesterTest extends NinjaDocTester {

    String BASE_URL = "/api/booking";

    @Before
    public void setUp() throws Exception {
        Injector injector = getInjector();
        StartupActions startupActions = injector.getInstance(StartupActions.class);
        startupActions.generateDummyDataWhenInDev();
    }

    @Test
    public void testCreateBooking() {
        BookingRequest request = getBookingRequest();

        Response response = makeRequest(
                Request.POST().contentTypeApplicationJson().payload(request).url(
                        testServerUrl().path(BASE_URL)));

        assertThat(response.httpStatus, is(200));
        verifyCache();

        response = makeRequest(
                Request.POST().contentTypeApplicationJson().payload(response.payloadAs(BookingMessage.class)).url(
                        testServerUrl().path(BASE_URL + "/confirm")));
        System.out.println("woohoo");
    }

    private void verifyCache() {
        Injector injector = getInjector();
        BookingCache bookingCache = injector.getInstance(BookingCache.class);
        assertThat(bookingCache.getCache().size(), is(1L));
    }


    private BookingRequest getBookingRequest() {
        RoomDAO roomDAO = new RoomDAO();
        List<RoomMessage> rooms = new ArrayList<>();
         RoomEntity roomEntity = roomDAO.find().asList().get(0);
        rooms.add(new RoomMessage(roomEntity.getId().toString(), roomEntity.getNumber(), roomEntity.getDescription(), roomEntity.getAllowedGuests(), roomEntity.getSize(),
                roomEntity.getNightPrice(), roomEntity.getPictures(), null, null, null)); // TODO CONVERTER FOR THESE THREE
        CustomerMessage customerMessage = new CustomerMessage("Olof", "Palme", 1927, "+46707235555", "olof.palme@mail.com", new ArrayList<>(),
                new CardInformationMessage("4000000000000002", "123", 10, 2014, "Olof", "Palme",
                        new AddressMessage("Sweden", "Gothenburg", "45475", "Apt. 2", "Street 1")));

        return new BookingRequest(new Date(), DateTime.now().plusDays(1).toDate(),
                customerMessage, new ArrayList<>(), rooms);
    }

}
