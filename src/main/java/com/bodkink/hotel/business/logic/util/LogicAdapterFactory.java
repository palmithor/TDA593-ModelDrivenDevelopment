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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.logic.LogicPackage
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
	@Override
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
	protected LogicSwitch<Adapter> modelSwitch =
		new LogicSwitch<Adapter>() {
			@Override
			public Adapter caseGuestManagement(GuestManagement object) {
				return createGuestManagementAdapter();
			}
			@Override
			public Adapter caseRoomExtraManagement(RoomExtraManagement object) {
				return createRoomExtraManagementAdapter();
			}
			@Override
			public Adapter caseRoomManagement(RoomManagement object) {
				return createRoomManagementAdapter();
			}
			@Override
			public Adapter caseRoomReservationManagement(RoomReservationManagement object) {
				return createRoomReservationManagementAdapter();
			}
			@Override
			public Adapter caseServiceManagement(ServiceManagement object) {
				return createServiceManagementAdapter();
			}
			@Override
			public Adapter caseBedTypeManagement(BedTypeManagement object) {
				return createBedTypeManagementAdapter();
			}
			@Override
			public Adapter caseBillableItemManagement(BillableItemManagement object) {
				return createBillableItemManagementAdapter();
			}
			@Override
			public Adapter caseBillingManagement(BillingManagement object) {
				return createBillingManagementAdapter();
			}
			@Override
			public Adapter caseBookingManagement(BookingManagement object) {
				return createBookingManagementAdapter();
			}
			@Override
			public Adapter caseCustomerManagement(CustomerManagement object) {
				return createCustomerManagementAdapter();
			}
			@Override
			public Adapter caseAccountManagement(AccountManagement object) {
				return createAccountManagementAdapter();
			}
			@Override
			public Adapter caseIGuestManagement(IGuestManagement object) {
				return createIGuestManagementAdapter();
			}
			@Override
			public Adapter caseIRoomExtraManagement(IRoomExtraManagement object) {
				return createIRoomExtraManagementAdapter();
			}
			@Override
			public Adapter caseIRoomManagement(IRoomManagement object) {
				return createIRoomManagementAdapter();
			}
			@Override
			public Adapter caseIRoomReservationManagement(IRoomReservationManagement object) {
				return createIRoomReservationManagementAdapter();
			}
			@Override
			public Adapter caseIServiceManagement(IServiceManagement object) {
				return createIServiceManagementAdapter();
			}
			@Override
			public Adapter caseIBedTypeManagement(IBedTypeManagement object) {
				return createIBedTypeManagementAdapter();
			}
			@Override
			public Adapter caseIBillableItemManagement(IBillableItemManagement object) {
				return createIBillableItemManagementAdapter();
			}
			@Override
			public Adapter caseIBillingManagement(IBillingManagement object) {
				return createIBillingManagementAdapter();
			}
			@Override
			public Adapter caseIBookingManagement(IBookingManagement object) {
				return createIBookingManagementAdapter();
			}
			@Override
			public Adapter caseICustomerManagement(ICustomerManagement object) {
				return createICustomerManagementAdapter();
			}
			@Override
			public Adapter caseIAccountManagement(IAccountManagement object) {
				return createIAccountManagementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
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
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.GuestManagement <em>Guest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.GuestManagement
	 * @generated
	 */
	public Adapter createGuestManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.RoomExtraManagement <em>Room Extra Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.RoomExtraManagement
	 * @generated
	 */
	public Adapter createRoomExtraManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.RoomManagement <em>Room Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.RoomManagement
	 * @generated
	 */
	public Adapter createRoomManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.RoomReservationManagement <em>Room Reservation Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.RoomReservationManagement
	 * @generated
	 */
	public Adapter createRoomReservationManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.ServiceManagement <em>Service Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.ServiceManagement
	 * @generated
	 */
	public Adapter createServiceManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.BedTypeManagement <em>Bed Type Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.BedTypeManagement
	 * @generated
	 */
	public Adapter createBedTypeManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.BillableItemManagement <em>Billable Item Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.BillableItemManagement
	 * @generated
	 */
	public Adapter createBillableItemManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.BillingManagement <em>Billing Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.BillingManagement
	 * @generated
	 */
	public Adapter createBillingManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.BookingManagement <em>Booking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.BookingManagement
	 * @generated
	 */
	public Adapter createBookingManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.CustomerManagement <em>Customer Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.CustomerManagement
	 * @generated
	 */
	public Adapter createCustomerManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.logic.AccountManagement <em>Account Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.logic.AccountManagement
	 * @generated
	 */
	public Adapter createAccountManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IGuestManagement <em>IGuest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IGuestManagement
	 * @generated
	 */
	public Adapter createIGuestManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IRoomExtraManagement <em>IRoom Extra Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IRoomExtraManagement
	 * @generated
	 */
	public Adapter createIRoomExtraManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IRoomManagement <em>IRoom Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IRoomManagement
	 * @generated
	 */
	public Adapter createIRoomManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IRoomReservationManagement <em>IRoom Reservation Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IRoomReservationManagement
	 * @generated
	 */
	public Adapter createIRoomReservationManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IServiceManagement <em>IService Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IServiceManagement
	 * @generated
	 */
	public Adapter createIServiceManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IBedTypeManagement <em>IBed Type Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IBedTypeManagement
	 * @generated
	 */
	public Adapter createIBedTypeManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IBillableItemManagement <em>IBillable Item Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IBillableItemManagement
	 * @generated
	 */
	public Adapter createIBillableItemManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IBillingManagement <em>IBilling Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IBillingManagement
	 * @generated
	 */
	public Adapter createIBillingManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IBookingManagement <em>IBooking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IBookingManagement
	 * @generated
	 */
	public Adapter createIBookingManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.ICustomerManagement <em>ICustomer Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.ICustomerManagement
	 * @generated
	 */
	public Adapter createICustomerManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.IAccountManagement <em>IAccount Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.IAccountManagement
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
