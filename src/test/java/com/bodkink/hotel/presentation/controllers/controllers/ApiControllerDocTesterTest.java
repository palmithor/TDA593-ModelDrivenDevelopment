package com.bodkink.hotel.presentation.controllers.controllers;

import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class ApiControllerDocTesterTest extends NinjaDocTester {

    String URL_INDEX = "/";

    @Test
    public void testGetIndex() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_INDEX)));
        assertThat(response.httpStatus, is(200));
    }

    /*@Test
    public void testGetHelloWorldJson() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_ROOM_EXTRAS)));

        TypeReference ref = new TypeReference<List<RoomExtra>>() {
        };
        List<RoomExtra> roomExtras
                = (List<RoomExtra>) response.payloadJsonAs(ref);

        assertThat(roomExtras.size(), CoreMatchers.equalTo(2));


    }*/

}
