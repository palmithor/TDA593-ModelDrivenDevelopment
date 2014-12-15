/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BedTypeManagement;
import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.model.BedType;
import com.bodkink.hotel.business.model.ModelFactory;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IBedTypeService;
import com.bodkink.hotel.persistence.model.BedTypeEntity;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bed Type Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BedTypeManagementImpl extends MinimalEObjectImpl.Container implements BedTypeManagement {

    @Inject
    IBedTypeService bedTypeService;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BedTypeManagementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LogicPackage.Literals.BED_TYPE_MANAGEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * Create a new bed type.
     *
     * @param name              The name of the bed type
     * @param length            The length of the bed type
     * @param width             The width of the bed type
     * @param noOfSleepingSpots The number of sleeping spots that the bed type has
     * @return A newly created bed type with the given parameters
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public BedType createBedType(String name, int length, int width, int noOfSleepingSpots) {
        BedType result = ModelFactory.eINSTANCE.createBedType();
        result.setName(name);
        result.setLength(length);
        result.setWidth(width);
        result.setPlaces(noOfSleepingSpots);

        BedTypeEntity bedTypeEntity = ModelToEntityConverter.convertBedType(result);
        bedTypeService.persist(bedTypeEntity);

        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * Edit an existing bed type
     *
     * @param bedType The edited bed type
     * @return The bed type, now edited and saved
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public BedType editBedType(BedType bedType) {
        BedTypeEntity bedTypeEntity = ModelToEntityConverter.convertBedType(bedType);
        bedTypeService.edit(bedTypeEntity);
        return bedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated NOT
     */
    public EList<BedType> listBedTypes() {
        List<BedTypeEntity> bedTypeEntityList = bedTypeService.listAll();
        EList<BedType> bedTypes = new BasicEList<>(bedTypeEntityList.size());
        bedTypeEntityList.forEach(entity -> {
            bedTypes.add(EntityToModelConverter.convertBedType(entity));
        });
        return bedTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case LogicPackage.BED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT:
                return createBedType((String) arguments.get(0), (Integer) arguments.get(1), (Integer) arguments.get(2), (Integer) arguments.get(3));
            case LogicPackage.BED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE:
                return editBedType((BedType) arguments.get(0));
            case LogicPackage.BED_TYPE_MANAGEMENT___LIST_BED_TYPES:
                return listBedTypes();
        }
        return super.eInvoke(operationID, arguments);
    }

} //BedTypeManagementImpl
