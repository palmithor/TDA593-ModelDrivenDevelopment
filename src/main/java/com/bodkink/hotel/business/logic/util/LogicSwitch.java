/**
 */
package com.bodkink.hotel.business.logic.util;

import com.bodkink.hotel.business.IAccountManagement;
import com.bodkink.hotel.business.IBedTypeManagement;
import com.bodkink.hotel.business.IBillableItemManagement;
import com.bodkink.hotel.business.IBillingManagement;
import com.bodkink.hotel.business.IBookingManagement;
import com.bodkink.hotel.business.ICustomerManagement;
import com.bodkink.hotel.business.IGuestManagement;
import com.bodkink.hotel.business.IRoomExtraManagement;
import com.bodkink.hotel.business.IRoomManagement;
import com.bodkink.hotel.business.IRoomReservationManagement;
import com.bodkink.hotel.business.IServiceManagement;

import com.bodkink.hotel.business.logic.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.logic.LogicPackage
 * @generated
 */
public class LogicSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicPackage.GUEST_MANAGEMENT: {
				GuestManagement guestManagement = (GuestManagement)theEObject;
				T result = caseGuestManagement(guestManagement);
				if (result == null) result = caseIGuestManagement(guestManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ROOM_EXTRA_MANAGEMENT: {
				RoomExtraManagement roomExtraManagement = (RoomExtraManagement)theEObject;
				T result = caseRoomExtraManagement(roomExtraManagement);
				if (result == null) result = caseIRoomExtraManagement(roomExtraManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ROOM_MANAGEMENT: {
				RoomManagement roomManagement = (RoomManagement)theEObject;
				T result = caseRoomManagement(roomManagement);
				if (result == null) result = caseIRoomManagement(roomManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT: {
				RoomReservationManagement roomReservationManagement = (RoomReservationManagement)theEObject;
				T result = caseRoomReservationManagement(roomReservationManagement);
				if (result == null) result = caseIRoomReservationManagement(roomReservationManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.SERVICE_MANAGEMENT: {
				ServiceManagement serviceManagement = (ServiceManagement)theEObject;
				T result = caseServiceManagement(serviceManagement);
				if (result == null) result = caseIServiceManagement(serviceManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BED_TYPE_MANAGEMENT: {
				BedTypeManagement bedTypeManagement = (BedTypeManagement)theEObject;
				T result = caseBedTypeManagement(bedTypeManagement);
				if (result == null) result = caseIBedTypeManagement(bedTypeManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT: {
				BillableItemManagement billableItemManagement = (BillableItemManagement)theEObject;
				T result = caseBillableItemManagement(billableItemManagement);
				if (result == null) result = caseIBillableItemManagement(billableItemManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BILLING_MANAGEMENT: {
				BillingManagement billingManagement = (BillingManagement)theEObject;
				T result = caseBillingManagement(billingManagement);
				if (result == null) result = caseIBillingManagement(billingManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BOOKING_MANAGEMENT: {
				BookingManagement bookingManagement = (BookingManagement)theEObject;
				T result = caseBookingManagement(bookingManagement);
				if (result == null) result = caseIBookingManagement(bookingManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.CUSTOMER_MANAGEMENT: {
				CustomerManagement customerManagement = (CustomerManagement)theEObject;
				T result = caseCustomerManagement(customerManagement);
				if (result == null) result = caseICustomerManagement(customerManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ACCOUNT_MANAGEMENT: {
				AccountManagement accountManagement = (AccountManagement)theEObject;
				T result = caseAccountManagement(accountManagement);
				if (result == null) result = caseIAccountManagement(accountManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestManagement(GuestManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Extra Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Extra Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomExtraManagement(RoomExtraManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomManagement(RoomManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Reservation Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Reservation Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomReservationManagement(RoomReservationManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceManagement(ServiceManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bed Type Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bed Type Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBedTypeManagement(BedTypeManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billable Item Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billable Item Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillableItemManagement(BillableItemManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billing Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBillingManagement(BillingManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookingManagement(BookingManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerManagement(CustomerManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccountManagement(AccountManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IGuest Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IGuest Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIGuestManagement(IGuestManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Extra Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Extra Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomExtraManagement(IRoomExtraManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomManagement(IRoomManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IRoom Reservation Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IRoom Reservation Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIRoomReservationManagement(IRoomReservationManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IService Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IService Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIServiceManagement(IServiceManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBed Type Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBed Type Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBedTypeManagement(IBedTypeManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBillable Item Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBillable Item Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBillableItemManagement(IBillableItemManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBilling Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBilling Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBillingManagement(IBillingManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IBooking Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IBooking Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIBookingManagement(IBookingManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ICustomer Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ICustomer Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseICustomerManagement(ICustomerManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAccount Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAccount Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAccountManagement(IAccountManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogicSwitch
