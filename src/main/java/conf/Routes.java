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


import com.bodkink.hotel.presentation.controllers.BedTypesController;
import com.bodkink.hotel.presentation.controllers.RoomExtrasController;
import com.bodkink.hotel.presentation.controllers.WebApp;
import ninja.AssetsController;
import ninja.Router;
import ninja.application.ApplicationRoutes;

public class Routes implements ApplicationRoutes {

    @Override
    public void init(Router router) {


        ///////////////////////////////////////////////////////////////////////
        // Assets (pictures / javascript)
        ///////////////////////////////////////////////////////////////////////    
        router.GET().route("/assets/webjars/{fileName: .*}").with(AssetsController.class, "serveWebJars");
        router.GET().route("/assets/{fileName: .*}").with(AssetsController.class, "serveStatic");


        // WEB APP
        router.GET().route("/").with(WebApp.class, "index");

        // Room extras endpoint
        router.GET().route("/api/room/extras").with(RoomExtrasController.class, "list");

        // Bed types endpoint
        router.GET().route("/api/bed/types").with(BedTypesController.class, "list");
    }

}
