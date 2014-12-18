/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.ModelPackage;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.ReceiptItem;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.impl.ReceiptImpl#getReceiptItem <em>Receipt Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReceiptImpl extends MinimalEObjectImpl.Container implements Receipt {
	/**
	 * The cached value of the '{@link #getReceiptItem() <em>Receipt Item</em>}' reference listByDate.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiptItem()
	 * @generated
	 * @ordered
	 */
	protected EList<ReceiptItem> receiptItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.RECEIPT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReceiptItem> getReceiptItem() {
		if (receiptItem == null) {
			receiptItem = new EObjectResolvingEList<ReceiptItem>(ReceiptItem.class, this, ModelPackage.RECEIPT__RECEIPT_ITEM);
		}
		return receiptItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.RECEIPT__RECEIPT_ITEM:
				return getReceiptItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.RECEIPT__RECEIPT_ITEM:
				getReceiptItem().clear();
				getReceiptItem().addAll((Collection<? extends ReceiptItem>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.RECEIPT__RECEIPT_ITEM:
				getReceiptItem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.RECEIPT__RECEIPT_ITEM:
				return receiptItem != null && !receiptItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReceiptImpl
