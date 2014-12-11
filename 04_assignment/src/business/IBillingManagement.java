/**
 */
package com.bodkink.hotel.business;

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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBilling Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIBillingManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBillingManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomReservationRequired="true" roomReservationOrdered="false"
	 * @generated
	 */
	RoomBill createRoomBill(RoomReservation roomReservation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false" bookingBillTypeRequired="true" bookingBillTypeOrdered="false"
	 * @generated
	 */
	BookingBill createBookingBill(Booking booking, BookingBillType bookingBillType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomBillRequired="true" roomBillOrdered="false" itemRequired="true" itemOrdered="false" quantityDataType="org.eclipse.uml2.types.Integer" quantityRequired="true" quantityOrdered="false"
	 * @generated
	 */
	boolean addBillableItem(RoomBill roomBill, BillableItem item, int quantity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomReservationIdRequired="true" roomReservationIdOrdered="false"
	 * @generated
	 */
	RoomBill findRoomBill(String roomReservationId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billRequired="true" billOrdered="false" cardInformationRequired="true" cardInformationOrdered="false"
	 * @generated
	 */
	boolean makePayment(Bill bill, CardInformation cardInformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	EList<Receipt> generateReceipts(Booking booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billRequired="true" billOrdered="false"
	 * @generated
	 */
	Receipt generateReceipt(Bill bill);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billRequired="true" billOrdered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	boolean makePayment(Bill bill, Customer customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	boolean makePayment(Booking booking);

} // IBillingManagement
