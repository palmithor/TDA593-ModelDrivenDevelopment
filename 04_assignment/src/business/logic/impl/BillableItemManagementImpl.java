/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BillableItemManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.BillableItem;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billable Item Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BillableItemManagementImpl extends MinimalEObjectImpl.Container implements BillableItemManagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillableItemManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.BILLABLE_ITEM_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillableItem createBillableItem(String name, BigDecimal price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillableItem editBillableItem(BillableItem billableItem) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void listBillableItems(BillableItem items) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL:
				return createBillableItem((String)arguments.get(0), (BigDecimal)arguments.get(1));
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM:
				return editBillableItem((BillableItem)arguments.get(0));
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS__BILLABLEITEM:
				listBillableItems((BillableItem)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillableItemManagementImpl
