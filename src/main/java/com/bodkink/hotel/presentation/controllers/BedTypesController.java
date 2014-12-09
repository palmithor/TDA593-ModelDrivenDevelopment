package com.bodkink.hotel.presentation.controllers;

import com.bodkink.hotel.business.IBedTypeManagement;
import com.bodkink.hotel.business.model.BedType;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import ninja.Result;
import ninja.Results;

import java.util.List;

/**
 * @author palmithor
 * @since 08/12/14.
 */
@Singleton
public class BedTypesController {

    @Inject
    IBedTypeManagement bedTypeManagement;


    public Result list() {
        List<BedType> bedTypes = bedTypeManagement.listBedTypes();
        return Results.json().render(bedTypes);
    }
}
