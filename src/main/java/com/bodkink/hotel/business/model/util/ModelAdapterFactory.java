/**
 */
package com.bodkink.hotel.business.model.util;

import com.bodkink.hotel.business.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseBedType(BedType object) {
				return createBedTypeAdapter();
			}
			@Override
			public Adapter caseBill(Bill object) {
				return createBillAdapter();
			}
			@Override
			public Adapter caseCardInformation(CardInformation object) {
				return createCardInformationAdapter();
			}
			@Override
			public Adapter caseIBill(IBill object) {
				return createIBillAdapter();
			}
			@Override
			public Adapter caseBillableItem(BillableItem object) {
				return createBillableItemAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseRoomReservation(RoomReservation object) {
				return createRoomReservationAdapter();
			}
			@Override
			public Adapter caseGuest(Guest object) {
				return createGuestAdapter();
			}
			@Override
			public Adapter caseRoomReservationType(RoomReservationType object) {
				return createRoomReservationTypeAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			@Override
			public Adapter caseRoomExtra(RoomExtra object) {
				return createRoomExtraAdapter();
			}
			@Override
			public Adapter caseRoomBill(RoomBill object) {
				return createRoomBillAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseBookingBill(BookingBill object) {
				return createBookingBillAdapter();
			}
			@Override
			public Adapter caseRoomExtraTemplate(RoomExtraTemplate object) {
				return createRoomExtraTemplateAdapter();
			}
			@Override
			public Adapter caseReceipt(Receipt object) {
				return createReceiptAdapter();
			}
			@Override
			public Adapter caseReceiptItem(ReceiptItem object) {
				return createReceiptItemAdapter();
			}
			@Override
			public Adapter caseUserAccount(UserAccount object) {
				return createUserAccountAdapter();
			}
			@Override
			public Adapter caseCustomerUserAccount(CustomerUserAccount object) {
				return createCustomerUserAccountAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.BedType <em>Bed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.BedType
	 * @generated
	 */
	public Adapter createBedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.CardInformation <em>Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.CardInformation
	 * @generated
	 */
	public Adapter createCardInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.IBill <em>IBill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.IBill
	 * @generated
	 */
	public Adapter createIBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.BillableItem <em>Billable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.BillableItem
	 * @generated
	 */
	public Adapter createBillableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.RoomReservation <em>Room Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.RoomReservation
	 * @generated
	 */
	public Adapter createRoomReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.RoomReservationType <em>Room Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.RoomReservationType
	 * @generated
	 */
	public Adapter createRoomReservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.RoomExtra <em>Room Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.RoomExtra
	 * @generated
	 */
	public Adapter createRoomExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.RoomBill <em>Room Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.RoomBill
	 * @generated
	 */
	public Adapter createRoomBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.BookingBill
	 * @generated
	 */
	public Adapter createBookingBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.RoomExtraTemplate <em>Room Extra Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.RoomExtraTemplate
	 * @generated
	 */
	public Adapter createRoomExtraTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.Receipt
	 * @generated
	 */
	public Adapter createReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.ReceiptItem <em>Receipt Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.ReceiptItem
	 * @generated
	 */
	public Adapter createReceiptItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.UserAccount <em>User Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.UserAccount
	 * @generated
	 */
	public Adapter createUserAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.bodkink.hotel.business.model.CustomerUserAccount <em>Customer User Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.bodkink.hotel.business.model.CustomerUserAccount
	 * @generated
	 */
	public Adapter createCustomerUserAccountAdapter() {
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

} //ModelAdapterFactory
