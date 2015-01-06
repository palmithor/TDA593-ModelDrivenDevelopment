package com.bodkink.hotel.presentation.controllers.controllers;

import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.RoomReservationType;
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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class ReceptionControllerDocTesterTest extends NinjaDocTester {

    public final AddressMessage address = new AddressMessage("Sweden", "Gothenburg", "45475", "Apt. 2", "Street 1");
    public final CardInformationMessage cardWithFunds = new CardInformationMessage("4000000000000002", "123", 10, 16, "Olof", "Palme", address);
    public final CardInformationMessage cardWithNoFunds = new CardInformationMessage("378282246310005", "123", 10, 16, "Olof", "Palme", address);

    private final String CHECK_IN_URL = "/api/reception/checkin";
    private final String CHECK_OUT_URL = "/api/reception/checkout";

    @Before
    public void setUp() throws Exception {
        Injector injector = getInjector();
        StartupActions startupActions = injector.getInstance(StartupActions.class);
        startupActions.generateDummyDataWhenInDev();
        injector.getInstance(BookingCache.class).getCache().invalidateAll();
        if (System.getProperty("ft") == null) {
            AdministratorRequires.instance().addCreditCard(cardWithFunds.getCcNumber(), cardWithFunds.getCcv(),
                    cardWithFunds.getExpiryMonth(), cardWithFunds.getExpiryYear(), cardWithFunds.getFirstName(),
                    cardWithFunds.getLastName());
            AdministratorRequires.instance().addCreditCard(cardWithNoFunds.getCcNumber(), cardWithNoFunds.getCcv(),
                    cardWithNoFunds.getExpiryMonth(), cardWithNoFunds.getExpiryYear(), cardWithNoFunds.getFirstName(),
                    cardWithNoFunds.getLastName());
            AdministratorRequires.instance().makeDeposit(cardWithFunds.getCcNumber(), cardWithFunds.getCcv(),
                    cardWithFunds.getExpiryMonth(), cardWithFunds.getExpiryYear(), cardWithFunds.getFirstName(),
                    cardWithFunds.getLastName(), 20000);
        }
    }

    @After
    public void tearDown() throws Exception {
        if (System.getProperty("ft") == null) {
            AdministratorRequires.instance().removeCreditCard(cardWithFunds.getCcNumber(), cardWithFunds.getCcv(),
                    cardWithFunds.getExpiryMonth(), cardWithFunds.getExpiryYear(), cardWithFunds.getFirstName(),
                    cardWithFunds.getLastName());
        }
    }

    @Test
    public void testSuccessfulCheckIn() {
        if (System.getProperty("ft") == null) {
            CheckInOutRequest request = getCheckinRequest(ReservationStatusEnum.RESERVED);

            Response response = makeRequest(
                    Request.POST().contentTypeApplicationJson().payload(request).url(
                            testServerUrl().path(CHECK_IN_URL)));

            assertThat(response.httpStatus, is(200));
        } else {
            System.out.println("Test is ignored as there is no connection to Chalmers server");
        }
    }

    @Test
    public void testCheckInOnIncorrectStatus() {
        if (System.getProperty("ft") == null) {
            CheckInOutRequest request = getCheckinRequest(ReservationStatusEnum.CHECKED_IN);

            Response response = makeRequest(
                    Request.POST().contentTypeApplicationJson().payload(request).url(
                            testServerUrl().path(CHECK_IN_URL)));

            assertThat(response.httpStatus, is(403));
        } else {
            System.out.println("Test is ignored as there is no connection to Chalmers server");
        }
    }

    @Test
    public void testSuccessfulCheckOut() {
        if (System.getProperty("ft") == null) {
            CheckInOutRequest request = getCheckinRequest(ReservationStatusEnum.CHECKED_IN);

            Response response = makeRequest(
                    Request.POST().contentTypeApplicationJson().payload(request).url(
                            testServerUrl().path(CHECK_OUT_URL)));

            assertThat(response.httpStatus, is(200));
        } else {
            System.out.println("Test is ignored as there is no connection to Chalmers server");
        }
    }

    @Test
    public void testCheckOutOnIncorrectStatus() {
        if (System.getProperty("ft") == null) {
            CheckInOutRequest request = getCheckinRequest(ReservationStatusEnum.CHECKED_OUT);

            Response response = makeRequest(
                    Request.POST().contentTypeApplicationJson().payload(request).url(
                            testServerUrl().path(CHECK_OUT_URL)));

            assertThat(response.httpStatus, is(403));
        } else {
            System.out.println("Test is ignored as there is no connection to Chalmers server");
        }
    }

    private CheckInOutRequest getCheckinRequest(ReservationStatusEnum status) {
        RoomDAO roomDAO = new RoomDAO();
        RoomEntity roomEntity = roomDAO.find().asList().get(0);
        RoomMessage roomMessage = new RoomMessage(roomEntity.getId().toString(), roomEntity.getNumber(), roomEntity.getDescription(), roomEntity.getAllowedGuests(), roomEntity.getSize(),
                roomEntity.getNightPrice(), roomEntity.getPictures(), null, null, null);

        List<String> guests = new ArrayList<>();
        guests.add("Olof Palme");
        return new CheckInOutRequest(
                new RoomReservationMessage(
                        DateTime.now().toDate(),
                        DateTime.now().plusDays(3).toDate(),
                        RoomReservationType.BOOKING,
                        roomMessage,
                        null,
                        null,
                        status
                ),
                new GuestMessage("Olof", "Palme", 1927)
        );
    }

}
