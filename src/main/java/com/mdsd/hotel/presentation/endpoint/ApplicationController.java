/**
 * Copyright (C) 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.mdsd.hotel.presentation.endpoint;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mdsd.hotel.business.logic.BookingController;
import com.mdsd.hotel.presentation.model.RoomExtra;
import ninja.Result;
import ninja.Results;

import java.util.Arrays;
import java.util.List;


@Singleton
public class ApplicationController {

    @Inject
    BookingController bookingController;


    public Result index() {

        return Results.html();

    }

    public Result listRoomExtras() {

        List<RoomExtra> roomExtras = Arrays.asList(
                new RoomExtra("1", "TV", "Television including three stations"),
                new RoomExtra("2", "Hairdryer", "Top of the line hairdryer")
        );

        bookingController.ble();
        return Results.json().render(roomExtras);

    }
}
