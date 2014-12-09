/**
 */
package business.logic.util;

import business.IAccountManagement;
import business.IBedTypeManagement;
import business.IBillableItemManagement;
import business.IBillingManagement;
import business.IBookingManagement;
import business.ICustomerManagement;
import business.IGuestManagement;
import business.IRoomExtraManagement;
import business.IRoomManagement;
import business.IServiceManagement;

import business.logic.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
 * @see business.logic.LogicPackage
 * @generated
 */
public class LogicSwitch {
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
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogicPackage.GUEST_MANAGEMENT_IMPL: {
				GuestManagementImpl guestManagementImpl = (GuestManagementImpl)theEObject;
				Object result = caseGuestManagementImpl(guestManagementImpl);
				if (result == null) result = caseIGuestManagement(guestManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ROOM_EXTRA_MANAGEMENT_IMPL: {
				RoomExtraManagementImpl roomExtraManagementImpl = (RoomExtraManagementImpl)theEObject;
				Object result = caseRoomExtraManagementImpl(roomExtraManagementImpl);
				if (result == null) result = caseIRoomExtraManagement(roomExtraManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ROOM_MANAGEMENT_IMPL: {
				RoomManagementImpl roomManagementImpl = (RoomManagementImpl)theEObject;
				Object result = caseRoomManagementImpl(roomManagementImpl);
				if (result == null) result = caseIRoomManagement(roomManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.SERVICE_MANAGEMENT_IMPL: {
				ServiceManagementImpl serviceManagementImpl = (ServiceManagementImpl)theEObject;
				Object result = caseServiceManagementImpl(serviceManagementImpl);
				if (result == null) result = caseIServiceManagement(serviceManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BED_TYPE_MANAGEMENT_IMPL: {
				BedTypeManagementImpl bedTypeManagementImpl = (BedTypeManagementImpl)theEObject;
				Object result = caseBedTypeManagementImpl(bedTypeManagementImpl);
				if (result == null) result = caseIBedTypeManagement(bedTypeManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT_IMPL: {
				BillableItemManagementImpl billableItemManagementImpl = (BillableItemManagementImpl)theEObject;
				Object result = caseBillableItemManagementImpl(billableItemManagementImpl);
				if (result == null) result = caseIBillableItemManagement(billableItemManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BILLING_MANAGEMENT_IMPL: {
				BillingManagementImpl billingManagementImpl = (BillingManagementImpl)theEObject;
				Object result = caseBillingManagementImpl(billingManagementImpl);
				if (result == null) result = caseIBillingManagement(billingManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.BOOKING_MANAGEMENT_IMPL: {
				BookingManagementImpl bookingManagementImpl = (BookingManagementImpl)theEObject;
				Object result = caseBookingManagementImpl(bookingManagementImpl);
				if (result == null) result = caseIBookingManagement(bookingManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.CUSTOMER_MANAGEMENT_IMPL: {
				CustomerManagementImpl customerManagementImpl = (CustomerManagementImpl)theEObject;
				Object result = caseCustomerManagementImpl(customerManagementImpl);
				if (result == null) result = caseICustomerManagement(customerManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicPackage.ACCOUNT_MANAGEMENT_IMPL: {
				AccountManagementImpl accountManagementImpl = (AccountManagementImpl)theEObject;
				Object result = caseAccountManagementImpl(accountManagementImpl);
				if (result == null) result = caseIAccountManagement(accountManagementImpl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGuestManagementImpl(GuestManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Extra Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Extra Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomExtraManagementImpl(RoomExtraManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRoomManagementImpl(RoomManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseServiceManagementImpl(ServiceManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bed Type Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bed Type Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBedTypeManagementImpl(BedTypeManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billable Item Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billable Item Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBillableItemManagementImpl(BillableItemManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billing Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBillingManagementImpl(BillingManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBookingManagementImpl(BookingManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomerManagementImpl(CustomerManagementImpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account Management Impl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account Management Impl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAccountManagementImpl(AccountManagementImpl object) {
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
	public Object caseIGuestManagement(IGuestManagement object) {
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
	public Object caseIRoomExtraManagement(IRoomExtraManagement object) {
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
	public Object caseIRoomManagement(IRoomManagement object) {
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
	public Object caseIServiceManagement(IServiceManagement object) {
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
	public Object caseIBedTypeManagement(IBedTypeManagement object) {
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
	public Object caseIBillableItemManagement(IBillableItemManagement object) {
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
	public Object caseIBillingManagement(IBillingManagement object) {
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
	public Object caseIBookingManagement(IBookingManagement object) {
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
	public Object caseICustomerManagement(ICustomerManagement object) {
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
	public Object caseIAccountManagement(IAccountManagement object) {
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
	public Object defaultCase(EObject object) {
		return null;
	}

} //LogicSwitch
