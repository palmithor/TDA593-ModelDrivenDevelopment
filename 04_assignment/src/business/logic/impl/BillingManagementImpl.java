/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BillingManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.Bill;
import com.bodkink.hotel.business.model.BillableItem;
import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.BookingBill;
import com.bodkink.hotel.business.model.BookingBillType;
import com.bodkink.hotel.business.model.CardInformation;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.RoomBill;
import com.bodkink.hotel.business.model.RoomReservation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billing Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BillingManagementImpl extends MinimalEObjectImpl.Container implements BillingManagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.BILLING_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBill createRoomBill(RoomReservation roomReservation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingBill createBookingBill(Booking booking, BookingBillType bookingBillType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean addBillableItem(RoomBill roomBill, BillableItem item, int quantity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomBill findRoomBill(long roomBillId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(Bill bill, CardInformation cardInformation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt generateReceipts(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt generateReceipt(Bill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(Bill bill, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makePayment(Booking booking, boolean result) {
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
			case LogicPackage.BILLING_MANAGEMENT___CREATE_ROOM_BILL__ROOMRESERVATION:
				return createRoomBill((RoomReservation)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___CREATE_BOOKING_BILL__BOOKING_BOOKINGBILLTYPE:
				return createBookingBill((Booking)arguments.get(0), (BookingBillType)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___ADD_BILLABLE_ITEM__ROOMBILL_BILLABLEITEM_INT:
				return addBillableItem((RoomBill)arguments.get(0), (BillableItem)arguments.get(1), (Integer)arguments.get(2));
			case LogicPackage.BILLING_MANAGEMENT___FIND_ROOM_BILL__LONG:
				return findRoomBill((Long)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CARDINFORMATION:
				return makePayment((Bill)arguments.get(0), (CardInformation)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING:
				return generateReceipts((Booking)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___GENERATE_RECEIPT__BILL:
				return generateReceipt((Bill)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__BILL_CUSTOMER:
				return makePayment((Bill)arguments.get(0), (Customer)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING_BOOLEAN:
				makePayment((Booking)arguments.get(0), (Boolean)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillingManagementImpl
