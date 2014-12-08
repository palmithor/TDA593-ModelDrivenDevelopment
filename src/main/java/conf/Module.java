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

import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.logic.BookingManagementImpl;
import com.bodkink.hotel.persistence.dao.AddressDAO;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.reflections.Reflections;

@Singleton
public class Module extends AbstractModule {


    protected void configure() {

        bind(IBookingManagement.class).to(BookingManagementImpl.class);

        // persistence services
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
