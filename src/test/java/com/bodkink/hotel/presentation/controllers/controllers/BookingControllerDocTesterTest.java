package com.bodkink.hotel.presentation.controllers.controllers;

import com.bodkink.hotel.business.util.BookingCache;
import com.bodkink.hotel.persistence.dao.BookingDAO;
import com.bodkink.hotel.persistence.dao.RoomDAO;
import com.bodkink.hotel.persistence.model.RoomEntity;
import com.bodkink.hotel.presentation.message.*;
import com.google.inject.Injector;
import conf.StartupActions;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class BookingControllerDocTesterTest extends NinjaDocTester {

    public static final AddressMessage ADDRESS = new AddressMessage("Sweden", "Gothenburg", "45475", "Apt. 2", "Street 1");
    public static final CardInformationMessage CARD_INFORMATION = new CardInformationMessage("4000000000000002", "123", 10, 16, "Olof", "Palme",
            ADDRESS);
    String BASE_URL = "/api/booking";

    @Before
    public void setUp() throws Exception {
        assumeTrue(System.getProperty("ft") == null);
        Injector injector = getInjector();
        StartupActions startupActions = injector.getInstance(StartupActions.class);
        startupActions.generateDummyDataWhenInDev();
        AdministratorRequires.instance().addCreditCard(CARD_INFORMATION.getCcNumber(), CARD_INFORMATION.getCcv(),
                CARD_INFORMATION.getExpiryMonth(), CARD_INFORMATION.getExpiryYear(), CARD_INFORMATION.getFirstName(),
                CARD_INFORMATION.getLastName());
        AdministratorRequires.instance().makeDeposit(CARD_INFORMATION.getCcNumber(), CARD_INFORMATION.getCcv(),
                CARD_INFORMATION.getExpiryMonth(), CARD_INFORMATION.getExpiryYear(), CARD_INFORMATION.getFirstName(),
                CARD_INFORMATION.getLastName(), 20000);
    }

    @After
    public void tearDown() throws Exception {
        AdministratorRequires.instance().removeCreditCard(CARD_INFORMATION.getCcNumber(), CARD_INFORMATION.getCcv(),
                CARD_INFORMATION.getExpiryMonth(), CARD_INFORMATION.getExpiryYear(), CARD_INFORMATION.getFirstName(),
                CARD_INFORMATION.getLastName());
    }

    @Test
    public void testSuccessfulBooking() {
        BookingRequest request = getBookingRequest();

        Response response = makeRequest(
                Request.POST().contentTypeApplicationJson().payload(request).url(
                        testServerUrl().path(BASE_URL)));

        assertThat(response.httpStatus, is(200));
        verifyCache(1L);

        response = makeRequest(
                Request.POST().contentTypeApplicationJson().payload(response.payloadAs(BookingMessage.class)).url(
                        testServerUrl().path(BASE_URL + "/confirm")));
        assertThat(response.httpStatus, is(200));
        ReceiptMessage receipt = response.payloadAs(ReceiptMessage.class);
        assertThat(receipt, is(notNullValue()));
        assertThat(receipt.getItems().size(), is(1));
        verifyCache(0L);
        assertThatBookingIsSaved();
    }

    private void assertThatBookingIsSaved() {
        BookingDAO bookingDAO = new BookingDAO();
        assertThat(bookingDAO.find().asList().size(), is(1));
    }

    private void verifyCache(final Long expectedSize) {
        Injector injector = getInjector();
        BookingCache bookingCache = injector.getInstance(BookingCache.class);
        assertThat(bookingCache.getCache().size(), is(expectedSize));
    }


    private BookingRequest getBookingRequest() {
        RoomDAO roomDAO = new RoomDAO();
        List<RoomMessage> rooms = new ArrayList<>();
         RoomEntity roomEntity = roomDAO.find().asList().get(0);
        rooms.add(new RoomMessage(roomEntity.getId().toString(), roomEntity.getNumber(), roomEntity.getDescription(), roomEntity.getAllowedGuests(), roomEntity.getSize(),
                roomEntity.getNightPrice(), roomEntity.getPictures(), null, null, null));

        CustomerMessage customerMessage = new CustomerMessage("Olof", "Palme", 1927, "+46707235555", "olof.palme@mail.com", new ArrayList<>(),
                CARD_INFORMATION);

        return new BookingRequest(new Date(), DateTime.now().plusDays(1).toDate(),
                customerMessage, new ArrayList<>(), rooms);
    }

}
