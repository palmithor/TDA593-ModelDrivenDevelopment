/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicFactoryImpl extends EFactoryImpl implements LogicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogicFactory init() {
		try {
			LogicFactory theLogicFactory = (LogicFactory)EPackage.Registry.INSTANCE.getEFactory(LogicPackage.eNS_URI);
			if (theLogicFactory != null) {
				return theLogicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogicPackage.GUEST_MANAGEMENT: return createGuestManagement();
			case LogicPackage.ROOM_EXTRA_MANAGEMENT: return createRoomExtraManagement();
			case LogicPackage.ROOM_MANAGEMENT: return createRoomManagement();
			case LogicPackage.ROOM_RESERVATION_MANAGEMENT: return createRoomReservationManagement();
			case LogicPackage.SERVICE_MANAGEMENT: return createServiceManagement();
			case LogicPackage.BED_TYPE_MANAGEMENT: return createBedTypeManagement();
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT: return createBillableItemManagement();
			case LogicPackage.BILLING_MANAGEMENT: return createBillingManagement();
			case LogicPackage.BOOKING_MANAGEMENT: return createBookingManagement();
			case LogicPackage.CUSTOMER_MANAGEMENT: return createCustomerManagement();
			case LogicPackage.ACCOUNT_MANAGEMENT: return createAccountManagement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestManagement createGuestManagement() {
		GuestManagementImpl guestManagement = new GuestManagementImpl();
		return guestManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomExtraManagement createRoomExtraManagement() {
		RoomExtraManagementImpl roomExtraManagement = new RoomExtraManagementImpl();
		return roomExtraManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomManagement createRoomManagement() {
		RoomManagementImpl roomManagement = new RoomManagementImpl();
		return roomManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomReservationManagement createRoomReservationManagement() {
		RoomReservationManagementImpl roomReservationManagement = new RoomReservationManagementImpl();
		return roomReservationManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceManagement createServiceManagement() {
		ServiceManagementImpl serviceManagement = new ServiceManagementImpl();
		return serviceManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BedTypeManagement createBedTypeManagement() {
		BedTypeManagementImpl bedTypeManagement = new BedTypeManagementImpl();
		return bedTypeManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillableItemManagement createBillableItemManagement() {
		BillableItemManagementImpl billableItemManagement = new BillableItemManagementImpl();
		return billableItemManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingManagement createBillingManagement() {
		BillingManagementImpl billingManagement = new BillingManagementImpl();
		return billingManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingManagement createBookingManagement() {
		BookingManagementImpl bookingManagement = new BookingManagementImpl();
		return bookingManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerManagement createCustomerManagement() {
		CustomerManagementImpl customerManagement = new CustomerManagementImpl();
		return customerManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountManagement createAccountManagement() {
		AccountManagementImpl accountManagement = new AccountManagementImpl();
		return accountManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicPackage getLogicPackage() {
		return (LogicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogicPackage getPackage() {
		return LogicPackage.eINSTANCE;
	}

} //LogicFactoryImpl
