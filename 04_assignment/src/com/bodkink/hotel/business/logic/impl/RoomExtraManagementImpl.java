/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.RoomExtraManagement;

import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.business.model.RoomExtraTemplate;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * @generated
	 */
	public EList<RoomExtra> listRoomExtras() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtraTemplate createRoomExtraTemplate(String name, EList<RoomExtra> roomExtras) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtraTemplate editRoomExtraTemplate(RoomExtraTemplate roomExtraTemplate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtraTemplate deleteRoomExtraTemplate(RoomExtraTemplate roomExtraTemplate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomExtraTemplate> listRoomExtraTemplates() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA__STRING_STRING:
				return createRoomExtra((String)arguments.get(0), (String)arguments.get(1));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA__ROOMEXTRA:
				return editRoomExtra((RoomExtra)arguments.get(0));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRAS:
				return listRoomExtras();
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___CREATE_ROOM_EXTRA_TEMPLATE__STRING_ELIST:
				return createRoomExtraTemplate((String)arguments.get(0), (EList<RoomExtra>)arguments.get(1));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___EDIT_ROOM_EXTRA_TEMPLATE__ROOMEXTRATEMPLATE:
				return editRoomExtraTemplate((RoomExtraTemplate)arguments.get(0));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___DELETE_ROOM_EXTRA_TEMPLATE__ROOMEXTRATEMPLATE:
				return deleteRoomExtraTemplate((RoomExtraTemplate)arguments.get(0));
			case LogicPackage.ROOM_EXTRA_MANAGEMENT___LIST_ROOM_EXTRA_TEMPLATES:
				return listRoomExtraTemplates();
		}
		return super.eInvoke(operationID, arguments);
	}

} //RoomExtraManagementImpl
