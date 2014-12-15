/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomExtraManagement;
import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.persistence.IRoomExtraService;
import com.bodkink.hotel.persistence.model.RoomExtraEntity;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Extra Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class RoomExtraManagementImpl extends MinimalEObjectImpl.Container implements RoomExtraManagement {

	@Inject
	public IRoomExtraService roomExtraService;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomExtraManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.ROOM_EXTRA_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtra createRoomExtra(String name, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtra editRoomExtra(RoomExtra roomExtra) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<RoomExtra> listRoomExtras() {
		List<RoomExtraEntity> roomExtraEntityList = roomExtraService.listAll();
		EList<RoomExtra> roomExtras = new BasicEList<>(roomExtraEntityList.size());
		roomExtraEntityList.forEach(entity -> {
			roomExtras.add(EntityToModelConverter.convertRoomExtra(entity));
		});
		return roomExtras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING:
				return createRoomExtra((String)arguments.get(0), (String)arguments.get(1));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA:
				return editRoomExtra((RoomExtra)arguments.get(0));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS:
				return listRoomExtras();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomExtraManagementImpl
