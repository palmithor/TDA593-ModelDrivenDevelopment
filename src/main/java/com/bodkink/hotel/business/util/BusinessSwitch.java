/**
 */
package com.bodkink.hotel.business.util;

import com.bodkink.hotel.business.*;
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
 * @see com.bodkink.hotel.business.BusinessPackage
 * @generated
 */
public class BusinessSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BusinessPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessSwitch() {
		if (modelPackage == null) {
			modelPackage = BusinessPackage.eINSTANCE;
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
			case BusinessPackage.IGUEST_MANAGEMENT: {
				IGuestManagement iGuestManagement = (IGuestManagement)theEObject;
				T result = caseIGuestManagement(iGuestManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IROOM_EXTRA_MANAGEMENT: {
				IRoomExtraManagement iRoomExtraManagement = (IRoomExtraManagement)theEObject;
				T result = caseIRoomExtraManagement(iRoomExtraManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IROOM_MANAGEMENT: {
				IRoomManagement iRoomManagement = (IRoomManagement)theEObject;
				T result = caseIRoomManagement(iRoomManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IROOM_RESERVATION_MANAGEMENT: {
				IRoomReservationManagement iRoomReservationManagement = (IRoomReservationManagement)theEObject;
				T result = caseIRoomReservationManagement(iRoomReservationManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.ISERVICE_MANAGEMENT: {
				IServiceManagement iServiceManagement = (IServiceManagement)theEObject;
				T result = caseIServiceManagement(iServiceManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBED_TYPE_MANAGEMENT: {
				IBedTypeManagement iBedTypeManagement = (IBedTypeManagement)theEObject;
				T result = caseIBedTypeManagement(iBedTypeManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBILLABLE_ITEM_MANAGEMENT: {
				IBillableItemManagement iBillableItemManagement = (IBillableItemManagement)theEObject;
				T result = caseIBillableItemManagement(iBillableItemManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBILLING_MANAGEMENT: {
				IBillingManagement iBillingManagement = (IBillingManagement)theEObject;
				T result = caseIBillingManagement(iBillingManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBOOKING_MANAGEMENT: {
				IBookingManagement iBookingManagement = (IBookingManagement)theEObject;
				T result = caseIBookingManagement(iBookingManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.ICUSTOMER_MANAGEMENT: {
				ICustomerManagement iCustomerManagement = (ICustomerManagement)theEObject;
				T result = caseICustomerManagement(iCustomerManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IACCOUNT_MANAGEMENT: {
				IAccountManagement iAccountManagement = (IAccountManagement)theEObject;
				T result = caseIAccountManagement(iAccountManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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

} //BusinessSwitch
