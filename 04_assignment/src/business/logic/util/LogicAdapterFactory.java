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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see business.logic.LogicPackage
 * @generated
 */
public class LogicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicSwitch modelSwitch =
		new LogicSwitch() {
			public Object caseGuestManagementImpl(GuestManagementImpl object) {
				return createGuestManagementImplAdapter();
			}
			public Object caseRoomExtraManagementImpl(RoomExtraManagementImpl object) {
				return createRoomExtraManagementImplAdapter();
			}
			public Object caseRoomManagementImpl(RoomManagementImpl object) {
				return createRoomManagementImplAdapter();
			}
			public Object caseServiceManagementImpl(ServiceManagementImpl object) {
				return createServiceManagementImplAdapter();
			}
			public Object caseBedTypeManagementImpl(BedTypeManagementImpl object) {
				return createBedTypeManagementImplAdapter();
			}
			public Object caseBillableItemManagementImpl(BillableItemManagementImpl object) {
				return createBillableItemManagementImplAdapter();
			}
			public Object caseBillingManagementImpl(BillingManagementImpl object) {
				return createBillingManagementImplAdapter();
			}
			public Object caseBookingManagementImpl(BookingManagementImpl object) {
				return createBookingManagementImplAdapter();
			}
			public Object caseCustomerManagementImpl(CustomerManagementImpl object) {
				return createCustomerManagementImplAdapter();
			}
			public Object caseAccountManagementImpl(AccountManagementImpl object) {
				return createAccountManagementImplAdapter();
			}
			public Object caseIGuestManagement(IGuestManagement object) {
				return createIGuestManagementAdapter();
			}
			public Object caseIRoomExtraManagement(IRoomExtraManagement object) {
				return createIRoomExtraManagementAdapter();
			}
			public Object caseIRoomManagement(IRoomManagement object) {
				return createIRoomManagementAdapter();
			}
			public Object caseIServiceManagement(IServiceManagement object) {
				return createIServiceManagementAdapter();
			}
			public Object caseIBedTypeManagement(IBedTypeManagement object) {
				return createIBedTypeManagementAdapter();
			}
			public Object caseIBillableItemManagement(IBillableItemManagement object) {
				return createIBillableItemManagementAdapter();
			}
			public Object caseIBillingManagement(IBillingManagement object) {
				return createIBillingManagementAdapter();
			}
			public Object caseIBookingManagement(IBookingManagement object) {
				return createIBookingManagementAdapter();
			}
			public Object caseICustomerManagement(ICustomerManagement object) {
				return createICustomerManagementAdapter();
			}
			public Object caseIAccountManagement(IAccountManagement object) {
				return createIAccountManagementAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link business.logic.GuestManagementImpl <em>Guest Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.GuestManagementImpl
	 * @generated
	 */
	public Adapter createGuestManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.RoomExtraManagementImpl <em>Room Extra Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.RoomExtraManagementImpl
	 * @generated
	 */
	public Adapter createRoomExtraManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.RoomManagementImpl <em>Room Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.RoomManagementImpl
	 * @generated
	 */
	public Adapter createRoomManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.ServiceManagementImpl <em>Service Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.ServiceManagementImpl
	 * @generated
	 */
	public Adapter createServiceManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.BedTypeManagementImpl <em>Bed Type Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.BedTypeManagementImpl
	 * @generated
	 */
	public Adapter createBedTypeManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.BillableItemManagementImpl <em>Billable Item Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.BillableItemManagementImpl
	 * @generated
	 */
	public Adapter createBillableItemManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.BillingManagementImpl <em>Billing Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.BillingManagementImpl
	 * @generated
	 */
	public Adapter createBillingManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.BookingManagementImpl <em>Booking Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.BookingManagementImpl
	 * @generated
	 */
	public Adapter createBookingManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.CustomerManagementImpl <em>Customer Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.CustomerManagementImpl
	 * @generated
	 */
	public Adapter createCustomerManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.logic.AccountManagementImpl <em>Account Management Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.logic.AccountManagementImpl
	 * @generated
	 */
	public Adapter createAccountManagementImplAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IGuestManagement <em>IGuest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IGuestManagement
	 * @generated
	 */
	public Adapter createIGuestManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IRoomExtraManagement <em>IRoom Extra Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IRoomExtraManagement
	 * @generated
	 */
	public Adapter createIRoomExtraManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IRoomManagement <em>IRoom Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IRoomManagement
	 * @generated
	 */
	public Adapter createIRoomManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IServiceManagement <em>IService Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IServiceManagement
	 * @generated
	 */
	public Adapter createIServiceManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IBedTypeManagement <em>IBed Type Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IBedTypeManagement
	 * @generated
	 */
	public Adapter createIBedTypeManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IBillableItemManagement <em>IBillable Item Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IBillableItemManagement
	 * @generated
	 */
	public Adapter createIBillableItemManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IBillingManagement <em>IBilling Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IBillingManagement
	 * @generated
	 */
	public Adapter createIBillingManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IBookingManagement <em>IBooking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IBookingManagement
	 * @generated
	 */
	public Adapter createIBookingManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.ICustomerManagement <em>ICustomer Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.ICustomerManagement
	 * @generated
	 */
	public Adapter createICustomerManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.IAccountManagement <em>IAccount Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.IAccountManagement
	 * @generated
	 */
	public Adapter createIAccountManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogicAdapterFactory
