/**
 * Copyright (C) 2012 the original author or authors.
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

package conf;

import com.bodkink.hotel.business.*;
import com.bodkink.hotel.business.logic.impl.*;
import com.bodkink.hotel.business.util.BookingCache;
import com.bodkink.hotel.business.util.IBookingCache;
import com.bodkink.hotel.persistence.IBedTypeService;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.IRoomReservationService;
import com.bodkink.hotel.persistence.dao.AddressDAO;
import com.bodkink.hotel.persistence.service.BedTypeServiceImpl;
import com.bodkink.hotel.persistence.service.BookingServiceImpl;
import com.bodkink.hotel.persistence.service.RoomExtraServiceImpl;
import com.bodkink.hotel.persistence.service.RoomReservationServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.reflections.Reflections;

@Singleton
public class Module extends AbstractModule {


    protected void configure() {

        // on startup
        bind(StartupActions.class);

        // Management interfaces
        bind(IRoomReservationManagement.class).to(RoomReservationManagementImpl.class); // SIMON
        bind(IBookingManagement.class).to(BookingManagementImpl.class);                 // PALMITHOR
        bind(IGuestManagement.class).to(GuestManagementImpl.class);                     // MIKAEL
        bind(IBillingManagement.class).to(BillingManagementImpl.class);                 // CARL
        bind(IBillableItemManagement.class).to(BillableItemManagementImpl.class);       // Sara
        bind(IServiceManagement.class).to(ServiceManagementImpl.class);                 // Linnéa
        bind(IRoomManagement.class).to(RoomManagementImpl.class);                       // Erik
        bind(ICustomerManagement.class).to(CustomerManagementImpl.class);               // Caroline


        bind(IRoomExtraManagement.class).to(RoomExtraManagementImpl.class);
        bind(IBedTypeManagement.class).to(BedTypeManagementImpl.class);
        bind(IAccountManagement.class).to(AccountManagementImpl.class);

        // persistence services
        bind(IBookingService.class).to(BookingServiceImpl.class);
        bind(IRoomExtraService.class).to(RoomExtraServiceImpl.class);
        bind(IBedTypeService.class).to(BedTypeServiceImpl.class);
        bind(IRoomReservationService.class).to(RoomReservationServiceImpl.class);

        // persistence dao
        Reflections reflections = new Reflections(AddressDAO.class.getPackage().getName());

        for (String clazz : reflections.getStore().get("TypeAnnotationsScanner").asMap().get("com.google.inject.Singleton")) {
            try {
                bind(Class.forName(clazz));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        // Utility
        bind(IBookingCache.class).to(BookingCache.class);

    }

}
