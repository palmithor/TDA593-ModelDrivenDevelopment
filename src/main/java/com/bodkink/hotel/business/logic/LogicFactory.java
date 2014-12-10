/**
 */
package com.bodkink.hotel.business.logic;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.logic.LogicPackage
 * @generated
 */
public interface LogicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicFactory eINSTANCE = com.bodkink.hotel.business.logic.impl.LogicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Guest Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guest Management</em>'.
	 * @generated
	 */
	GuestManagement createGuestManagement();

	/**
	 * Returns a new object of class '<em>Room Extra Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Extra Management</em>'.
	 * @generated
	 */
	RoomExtraManagement createRoomExtraManagement();

	/**
	 * Returns a new object of class '<em>Room Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Management</em>'.
	 * @generated
	 */
	RoomManagement createRoomManagement();

	/**
	 * Returns a new object of class '<em>Room Reservation Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Reservation Management</em>'.
	 * @generated
	 */
	RoomReservationManagement createRoomReservationManagement();

	/**
	 * Returns a new object of class '<em>Service Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Management</em>'.
	 * @generated
	 */
	ServiceManagement createServiceManagement();

	/**
	 * Returns a new object of class '<em>Bed Type Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bed Type Management</em>'.
	 * @generated
	 */
	BedTypeManagement createBedTypeManagement();

	/**
	 * Returns a new object of class '<em>Billable Item Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billable Item Management</em>'.
	 * @generated
	 */
	BillableItemManagement createBillableItemManagement();

	/**
	 * Returns a new object of class '<em>Billing Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Billing Management</em>'.
	 * @generated
	 */
	BillingManagement createBillingManagement();

	/**
	 * Returns a new object of class '<em>Booking Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Booking Management</em>'.
	 * @generated
	 */
	BookingManagement createBookingManagement();

	/**
	 * Returns a new object of class '<em>Customer Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Customer Management</em>'.
	 * @generated
	 */
	CustomerManagement createCustomerManagement();

	/**
	 * Returns a new object of class '<em>Account Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Management</em>'.
	 * @generated
	 */
	AccountManagement createAccountManagement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LogicPackage getLogicPackage();

} //LogicFactory
