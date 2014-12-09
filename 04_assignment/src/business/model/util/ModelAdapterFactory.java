/**
 */
package business.model.util;

import business.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see business.model.ModelPackage
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
	protected ModelSwitch modelSwitch =
		new ModelSwitch() {
			public Object caseAddress(Address object) {
				return createAddressAdapter();
			}
			public Object caseBedType(BedType object) {
				return createBedTypeAdapter();
			}
			public Object caseBill(Bill object) {
				return createBillAdapter();
			}
			public Object caseCardInformation(CardInformation object) {
				return createCardInformationAdapter();
			}
			public Object caseIBill(IBill object) {
				return createIBillAdapter();
			}
			public Object caseBillableItem(BillableItem object) {
				return createBillableItemAdapter();
			}
			public Object caseBooking(Booking object) {
				return createBookingAdapter();
			}
			public Object caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			public Object casePerson(Person object) {
				return createPersonAdapter();
			}
			public Object caseRoomReservation(RoomReservation object) {
				return createRoomReservationAdapter();
			}
			public Object caseGuest(Guest object) {
				return createGuestAdapter();
			}
			public Object caseRoomReservationType(RoomReservationType object) {
				return createRoomReservationTypeAdapter();
			}
			public Object caseRoom(Room object) {
				return createRoomAdapter();
			}
			public Object caseClassification(Classification object) {
				return createClassificationAdapter();
			}
			public Object caseRoomExtra(RoomExtra object) {
				return createRoomExtraAdapter();
			}
			public Object caseRoomBill(RoomBill object) {
				return createRoomBillAdapter();
			}
			public Object caseService(Service object) {
				return createServiceAdapter();
			}
			public Object caseBookingBill(BookingBill object) {
				return createBookingBillAdapter();
			}
			public Object caseRoomExtraTemplate(RoomExtraTemplate object) {
				return createRoomExtraTemplateAdapter();
			}
			public Object caseReceipt(Receipt object) {
				return createReceiptAdapter();
			}
			public Object caseReceiptItem(ReceiptItem object) {
				return createReceiptItemAdapter();
			}
			public Object caseUserAccount(UserAccount object) {
				return createUserAccountAdapter();
			}
			public Object caseCustomerUserAccount(CustomerUserAccount object) {
				return createCustomerUserAccountAdapter();
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
	 * Creates a new adapter for an object of class '{@link business.model.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.BedType <em>Bed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.BedType
	 * @generated
	 */
	public Adapter createBedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Bill
	 * @generated
	 */
	public Adapter createBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.CardInformation <em>Card Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.CardInformation
	 * @generated
	 */
	public Adapter createCardInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.IBill <em>IBill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.IBill
	 * @generated
	 */
	public Adapter createIBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.BillableItem <em>Billable Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.BillableItem
	 * @generated
	 */
	public Adapter createBillableItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.RoomReservation <em>Room Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.RoomReservation
	 * @generated
	 */
	public Adapter createRoomReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.RoomReservationType <em>Room Reservation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.RoomReservationType
	 * @generated
	 */
	public Adapter createRoomReservationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Classification <em>Classification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Classification
	 * @generated
	 */
	public Adapter createClassificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.RoomExtra <em>Room Extra</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.RoomExtra
	 * @generated
	 */
	public Adapter createRoomExtraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.RoomBill <em>Room Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.RoomBill
	 * @generated
	 */
	public Adapter createRoomBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.BookingBill <em>Booking Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.BookingBill
	 * @generated
	 */
	public Adapter createBookingBillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.RoomExtraTemplate <em>Room Extra Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.RoomExtraTemplate
	 * @generated
	 */
	public Adapter createRoomExtraTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.Receipt
	 * @generated
	 */
	public Adapter createReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.ReceiptItem <em>Receipt Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.ReceiptItem
	 * @generated
	 */
	public Adapter createReceiptItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.UserAccount <em>User Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.UserAccount
	 * @generated
	 */
	public Adapter createUserAccountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link business.model.CustomerUserAccount <em>Customer User Account</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see business.model.CustomerUserAccount
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
