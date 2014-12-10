/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.Bill;
import com.bodkink.hotel.business.model.BillStatusEnum;
import com.bodkink.hotel.business.model.CardInformation;
import com.bodkink.hotel.business.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.impl.BillImpl#getBillStatusEnum <em>Bill Status Enum</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.BillImpl#getCardInformation <em>Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The default value of the '{@link #getBillStatusEnum() <em>Bill Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected static final BillStatusEnum BILL_STATUS_ENUM_EDEFAULT = BillStatusEnum.PAID;

	/**
	 * The cached value of the '{@link #getBillStatusEnum() <em>Bill Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillStatusEnum()
	 * @generated
	 * @ordered
	 */
	protected BillStatusEnum billStatusEnum = BILL_STATUS_ENUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCardInformation() <em>Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardInformation()
	 * @generated
	 * @ordered
	 */
	protected CardInformation cardInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillStatusEnum getBillStatusEnum() {
		return billStatusEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBillStatusEnum(BillStatusEnum newBillStatusEnum) {
		BillStatusEnum oldBillStatusEnum = billStatusEnum;
		billStatusEnum = newBillStatusEnum == null ? BILL_STATUS_ENUM_EDEFAULT : newBillStatusEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BILL__BILL_STATUS_ENUM, oldBillStatusEnum, billStatusEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInformation getCardInformation() {
		if (cardInformation != null && cardInformation.eIsProxy()) {
			InternalEObject oldCardInformation = (InternalEObject)cardInformation;
			cardInformation = (CardInformation)eResolveProxy(oldCardInformation);
			if (cardInformation != oldCardInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.BILL__CARD_INFORMATION, oldCardInformation, cardInformation));
			}
		}
		return cardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInformation basicGetCardInformation() {
		return cardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardInformation(CardInformation newCardInformation) {
		CardInformation oldCardInformation = cardInformation;
		cardInformation = newCardInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BILL__CARD_INFORMATION, oldCardInformation, cardInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BILL__BILL_STATUS_ENUM:
				return getBillStatusEnum();
			case ModelPackage.BILL__CARD_INFORMATION:
				if (resolve) return getCardInformation();
				return basicGetCardInformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.BILL__BILL_STATUS_ENUM:
				setBillStatusEnum((BillStatusEnum)newValue);
				return;
			case ModelPackage.BILL__CARD_INFORMATION:
				setCardInformation((CardInformation)newValue);
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
			case ModelPackage.BILL__BILL_STATUS_ENUM:
				setBillStatusEnum(BILL_STATUS_ENUM_EDEFAULT);
				return;
			case ModelPackage.BILL__CARD_INFORMATION:
				setCardInformation((CardInformation)null);
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
			case ModelPackage.BILL__BILL_STATUS_ENUM:
				return billStatusEnum != BILL_STATUS_ENUM_EDEFAULT;
			case ModelPackage.BILL__CARD_INFORMATION:
				return cardInformation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (billStatusEnum: ");
		result.append(billStatusEnum);
		result.append(')');
		return result.toString();
	}

} //BillImpl
