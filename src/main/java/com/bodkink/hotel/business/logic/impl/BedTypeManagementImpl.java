/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BedTypeManagement;
import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.model.BedType;
import com.bodkink.hotel.business.util.EntityToModelConverter;
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
	 * @generated
	 */
	protected BedTypeManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.BED_TYPE_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedType createBedType(String name, int length, int width, int noOfSleepingSpots) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedType editBedType(BedType bedType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.BED_TYPE_MANAGEMENT___CREATE_BED_TYPE__STRING_INT_INT_INT:
				return createBedType((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case LogicPackage.BED_TYPE_MANAGEMENT___EDIT_BED_TYPE__BEDTYPE:
				return editBedType((BedType)arguments.get(0));
			case LogicPackage.BED_TYPE_MANAGEMENT___LIST_BED_TYPES:
				return listBedTypes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BedTypeManagementImpl
