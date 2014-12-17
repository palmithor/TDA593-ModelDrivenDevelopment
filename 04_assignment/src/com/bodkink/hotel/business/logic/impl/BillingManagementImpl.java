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
	public RoomBill findRoomBill(String roomReservationId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(RoomBill bill, CardInformation cardInformation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Receipt> generateReceipts(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Receipt generateReceipt(RoomBill bill) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(RoomBill bill, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean makePayment(Booking booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void markPaid(Bill bill) {
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
			case LogicPackage.BILLING_MANAGEMENT___FIND_ROOM_BILL__STRING:
				return findRoomBill((String)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__ROOMBILL_CARDINFORMATION:
				return makePayment((RoomBill)arguments.get(0), (CardInformation)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___GENERATE_RECEIPTS__BOOKING:
				return generateReceipts((Booking)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___GENERATE_RECEIPT__ROOMBILL:
				return generateReceipt((RoomBill)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__ROOMBILL_CUSTOMER:
				return makePayment((RoomBill)arguments.get(0), (Customer)arguments.get(1));
			case LogicPackage.BILLING_MANAGEMENT___MAKE_PAYMENT__BOOKING:
				return makePayment((Booking)arguments.get(0));
			case LogicPackage.BILLING_MANAGEMENT___MARK_PAID__BILL:
				markPaid((Bill)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillingManagementImpl
