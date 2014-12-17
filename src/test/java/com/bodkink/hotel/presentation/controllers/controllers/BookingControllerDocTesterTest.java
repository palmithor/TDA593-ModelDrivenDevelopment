package com.bodkink.hotel.presentation.controllers.controllers;

import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.presentation.message.*;
import com.google.gson.Gson;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.joda.time.DateTime;
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
    Gson gson = new Gson();

    @Test
    public void testCreateBooking() {
        RoomDAO roomDAO = new RoomDAO();
        List<RoomMessage> rooms = new ArrayList<>();
        RoomEntity roomEntity = roomDAO.find().asList().get(0);
        rooms.add(new RoomMessage(roomEntity.getId().toString(), roomEntity.getNumber(), roomEntity.getDescription(), roomEntity.getAllowedGuests(), roomEntity.getSize(),
                roomEntity.getNightPrice(), roomEntity.getPictures(), null, null, null)); // TODO CONVERTER FOR THESE THREE
        CustomerMessage customerMessage = new CustomerMessage("Olof", "Palme", 1927, "+46707235555", "olof.palme@mail.com", new ArrayList<>(),
                new CardInformationMessage("4000000000000002", "123", 10, 2014, "Olof", "Palme",
                        new AddressMessage("Sweden", "Gothenburg", "45475", "Apt. 2", "Street 1")));

        BookingRequest request = new BookingRequest(new Date(), DateTime.now().plusDays(1).toDate(),
                customerMessage, new ArrayList<>(), rooms);

        Response response = makeRequest(
                Request.POST().contentTypeApplicationJson().payload(request).url(
                        testServerUrl().path(BASE_URL)));
        assertThat(response.httpStatus, is(200));
    }

}
