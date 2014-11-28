package com.mdsd.hotel.presentation.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.mdsd.hotel.presentation.model.RoomExtra;
import ninja.NinjaDocTester;
import org.doctester.testbrowser.Request;
import org.doctester.testbrowser.Response;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


/**
 * @author palmithor
 * @since 27/11/14.
 */
public class ApiControllerDocTesterTest extends NinjaDocTester {

    String URL_INDEX = "/";
    String URL_ROOM_EXTRAS = "/room/extras";

    @Test
    public void testGetIndex() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_INDEX)));

        assertThat(response.payload, containsString("Hello World!"));
        assertThat(response.payload, containsString("BAM!"));


    }

    @Test
    public void testGetHelloWorldJson() {

        Response response = makeRequest(
                Request.GET().url(
                        testServerUrl().path(URL_ROOM_EXTRAS)));

        TypeReference ref = new TypeReference<List<RoomExtra>>() {
        };
        List<RoomExtra> roomExtras
                = (List<RoomExtra>) response.payloadJsonAs(ref);

        assertThat(roomExtras.size(), CoreMatchers.equalTo(2));


    }

}
