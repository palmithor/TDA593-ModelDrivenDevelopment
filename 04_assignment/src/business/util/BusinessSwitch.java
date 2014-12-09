/**
 */
package business.util;

import business.*;

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
 * @see business.BusinessPackage
 * @generated
 */
public class BusinessSwitch {
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
			case BusinessPackage.IGUEST_MANAGEMENT: {
				IGuestManagement iGuestManagement = (IGuestManagement)theEObject;
				Object result = caseIGuestManagement(iGuestManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IROOM_EXTRA_MANAGEMENT: {
				IRoomExtraManagement iRoomExtraManagement = (IRoomExtraManagement)theEObject;
				Object result = caseIRoomExtraManagement(iRoomExtraManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IROOM_MANAGEMENT: {
				IRoomManagement iRoomManagement = (IRoomManagement)theEObject;
				Object result = caseIRoomManagement(iRoomManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.ISERVICE_MANAGEMENT: {
				IServiceManagement iServiceManagement = (IServiceManagement)theEObject;
				Object result = caseIServiceManagement(iServiceManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBED_TYPE_MANAGEMENT: {
				IBedTypeManagement iBedTypeManagement = (IBedTypeManagement)theEObject;
				Object result = caseIBedTypeManagement(iBedTypeManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBILLABLE_ITEM_MANAGEMENT: {
				IBillableItemManagement iBillableItemManagement = (IBillableItemManagement)theEObject;
				Object result = caseIBillableItemManagement(iBillableItemManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBILLING_MANAGEMENT: {
				IBillingManagement iBillingManagement = (IBillingManagement)theEObject;
				Object result = caseIBillingManagement(iBillingManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IBOOKING_MANAGEMENT: {
				IBookingManagement iBookingManagement = (IBookingManagement)theEObject;
				Object result = caseIBookingManagement(iBookingManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.ICUSTOMER_MANAGEMENT: {
				ICustomerManagement iCustomerManagement = (ICustomerManagement)theEObject;
				Object result = caseICustomerManagement(iCustomerManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IACCOUNT_MANAGEMENT: {
				IAccountManagement iAccountManagement = (IAccountManagement)theEObject;
				Object result = caseIAccountManagement(iAccountManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BusinessPackage.IROOM_RESERVATION_MANAGEMENT: {
				IRoomReservationManagement iRoomReservationManagement = (IRoomReservationManagement)theEObject;
				Object result = caseIRoomReservationManagement(iRoomReservationManagement);
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
	public Object caseIRoomReservationManagement(IRoomReservationManagement object) {
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

} //BusinessSwitch
