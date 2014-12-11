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
import com.bodkink.hotel.persistence.IBedTypeService;
import com.bodkink.hotel.persistence.IBookingService;
import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.dao.AddressDAO;
import com.bodkink.hotel.persistence.service.BedTypeServiceImpl;
import com.bodkink.hotel.persistence.service.BookingServiceImpl;
import com.bodkink.hotel.persistence.service.RoomExtraServiceImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.reflections.Reflections;

@Singleton
public class Module extends AbstractModule {


    protected void configure() {

        // on startup
        bind(StartupActions.class);

        // Management interfaces
        bind(IRoomExtraManagement.class).to(RoomExtraManagementImpl.class);
        bind(IBookingManagement.class).to(BookingManagementImpl.class);
        bind(IBedTypeManagement.class).to(BedTypeManagementImpl.class);
        bind(IRoomReservationManagement.class).to(RoomReservationManagementImpl.class);
        bind(IRoomManagement.class).to(RoomManagementImpl.class);
        bind(IGuestManagement.class).to(GuestManagementImpl.class);
        bind(IBillingManagement.class).to(BillingManagementImpl.class);
        bind(IAccountManagement.class).to(AccountManagementImpl.class);
        bind(ICustomerManagement.class).to(CustomerManagementImpl.class);
        bind(IBillableItemManagement.class).to(BillableItemManagementImpl.class);
        bind(IServiceManagement.class).to(ServiceManagementImpl.class);

        // persistence services
        bind(IBookingService.class).to(BookingServiceImpl.class);
        bind(IRoomExtraService.class).to(RoomExtraServiceImpl.class);
        bind(IBedTypeService.class).to(BedTypeServiceImpl.class);



        // persistence dao
        Reflections reflections = new Reflections(AddressDAO.class.getPackage().getName());

        for (String clazz : reflections.getStore().get("TypeAnnotationsScanner").asMap().get("com.google.inject.Singleton")) {
            try {
                bind(Class.forName(clazz));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }


    }

}
