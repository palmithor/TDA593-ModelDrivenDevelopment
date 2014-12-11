/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = com.bodkink.hotel.business.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Bed Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bed Type</em>'.
	 * @generated
	 */
	BedType createBedType();

	/**
	 * Returns a new object of class '<em>Card Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Information</em>'.
	 * @generated
	 */
	CardInformation createCardInformation();

	/**
	 * Returns a new object of class '<em>Billable Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billable Item</em>'.
	 * @generated
	 */
	BillableItem createBillableItem();

	/**
	 * Returns a new object of class '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking</em>'.
	 * @generated
	 */
	Booking createBooking();

	/**
	 * Returns a new object of class '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer</em>'.
	 * @generated
	 */
	Customer createCustomer();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Room Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Reservation</em>'.
	 * @generated
	 */
	RoomReservation createRoomReservation();

	/**
	 * Returns a new object of class '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest</em>'.
	 * @generated
	 */
	Guest createGuest();

	/**
	 * Returns a new object of class '<em>Room Reservation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Reservation Type</em>'.
	 * @generated
	 */
	RoomReservationType createRoomReservationType();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	Room createRoom();

	/**
	 * Returns a new object of class '<em>Classification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classification</em>'.
	 * @generated
	 */
	Classification createClassification();

	/**
	 * Returns a new object of class '<em>Room Extra</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Extra</em>'.
	 * @generated
	 */
	RoomExtra createRoomExtra();

	/**
	 * Returns a new object of class '<em>Room Bill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Bill</em>'.
	 * @generated
	 */
	RoomBill createRoomBill();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Booking Bill</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Bill</em>'.
	 * @generated
	 */
	BookingBill createBookingBill();

	/**
	 * Returns a new object of class '<em>Room Extra Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Extra Template</em>'.
	 * @generated
	 */
	RoomExtraTemplate createRoomExtraTemplate();

	/**
	 * Returns a new object of class '<em>Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receipt</em>'.
	 * @generated
	 */
	Receipt createReceipt();

	/**
	 * Returns a new object of class '<em>Receipt Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receipt Item</em>'.
	 * @generated
	 */
	ReceiptItem createReceiptItem();

	/**
	 * Returns a new object of class '<em>User Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Account</em>'.
	 * @generated
	 */
	UserAccount createUserAccount();

	/**
	 * Returns a new object of class '<em>Customer User Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer User Account</em>'.
	 * @generated
	 */
	CustomerUserAccount createCustomerUserAccount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
