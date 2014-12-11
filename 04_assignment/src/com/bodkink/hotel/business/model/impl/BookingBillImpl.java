/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.BookingBill;
import com.bodkink.hotel.business.model.BookingBillType;
import com.bodkink.hotel.business.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.impl.BookingBillImpl#getBookingBillType <em>Booking Bill Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingBillImpl extends BillImpl implements BookingBill {
	/**
	 * The default value of the '{@link #getBookingBillType() <em>Booking Bill Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingBillType()
	 * @generated
	 * @ordered
	 */
	protected static final BookingBillType BOOKING_BILL_TYPE_EDEFAULT = BookingBillType.RESERVATION_FEE;

	/**
	 * The cached value of the '{@link #getBookingBillType() <em>Booking Bill Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingBillType()
	 * @generated
	 * @ordered
	 */
	protected BookingBillType bookingBillType = BOOKING_BILL_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingBillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.BOOKING_BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBillType getBookingBillType() {
		return bookingBillType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingBillType(BookingBillType newBookingBillType) {
		BookingBillType oldBookingBillType = bookingBillType;
		bookingBillType = newBookingBillType == null ? BOOKING_BILL_TYPE_EDEFAULT : newBookingBillType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BOOKING_BILL__BOOKING_BILL_TYPE, oldBookingBillType, bookingBillType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.BOOKING_BILL__BOOKING_BILL_TYPE:
				return getBookingBillType();
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
			case ModelPackage.BOOKING_BILL__BOOKING_BILL_TYPE:
				setBookingBillType((BookingBillType)newValue);
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
			case ModelPackage.BOOKING_BILL__BOOKING_BILL_TYPE:
				setBookingBillType(BOOKING_BILL_TYPE_EDEFAULT);
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
			case ModelPackage.BOOKING_BILL__BOOKING_BILL_TYPE:
				return bookingBillType != BOOKING_BILL_TYPE_EDEFAULT;
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
		result.append(" (bookingBillType: ");
		result.append(bookingBillType);
		result.append(')');
		return result.toString();
	}

} //BookingBillImpl
