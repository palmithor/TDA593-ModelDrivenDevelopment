/**
 */
package business;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see business.BusinessFactory
 * @model kind="package"
 * @generated
 */
public interface BusinessPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "business";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///business.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "business";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BusinessPackage eINSTANCE = business.impl.BusinessPackageImpl.init();

	/**
	 * The meta object id for the '{@link business.IGuestManagement <em>IGuest Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IGuestManagement
	 * @see business.impl.BusinessPackageImpl#getIGuestManagement()
	 * @generated
	 */
	int IGUEST_MANAGEMENT = 0;

	/**
	 * The number of structural features of the '<em>IGuest Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUEST_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IRoomExtraManagement <em>IRoom Extra Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IRoomExtraManagement
	 * @see business.impl.BusinessPackageImpl#getIRoomExtraManagement()
	 * @generated
	 */
	int IROOM_EXTRA_MANAGEMENT = 1;

	/**
	 * The number of structural features of the '<em>IRoom Extra Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_EXTRA_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IRoomManagement <em>IRoom Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IRoomManagement
	 * @see business.impl.BusinessPackageImpl#getIRoomManagement()
	 * @generated
	 */
	int IROOM_MANAGEMENT = 2;

	/**
	 * The number of structural features of the '<em>IRoom Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IServiceManagement <em>IService Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IServiceManagement
	 * @see business.impl.BusinessPackageImpl#getIServiceManagement()
	 * @generated
	 */
	int ISERVICE_MANAGEMENT = 3;

	/**
	 * The number of structural features of the '<em>IService Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICE_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IBedTypeManagement <em>IBed Type Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IBedTypeManagement
	 * @see business.impl.BusinessPackageImpl#getIBedTypeManagement()
	 * @generated
	 */
	int IBED_TYPE_MANAGEMENT = 4;

	/**
	 * The number of structural features of the '<em>IBed Type Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBED_TYPE_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IBillableItemManagement <em>IBillable Item Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IBillableItemManagement
	 * @see business.impl.BusinessPackageImpl#getIBillableItemManagement()
	 * @generated
	 */
	int IBILLABLE_ITEM_MANAGEMENT = 5;

	/**
	 * The number of structural features of the '<em>IBillable Item Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLABLE_ITEM_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IBillingManagement <em>IBilling Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IBillingManagement
	 * @see business.impl.BusinessPackageImpl#getIBillingManagement()
	 * @generated
	 */
	int IBILLING_MANAGEMENT = 6;

	/**
	 * The number of structural features of the '<em>IBilling Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLING_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IBookingManagement <em>IBooking Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IBookingManagement
	 * @see business.impl.BusinessPackageImpl#getIBookingManagement()
	 * @generated
	 */
	int IBOOKING_MANAGEMENT = 7;

	/**
	 * The number of structural features of the '<em>IBooking Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKING_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.ICustomerManagement <em>ICustomer Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.ICustomerManagement
	 * @see business.impl.BusinessPackageImpl#getICustomerManagement()
	 * @generated
	 */
	int ICUSTOMER_MANAGEMENT = 8;

	/**
	 * The number of structural features of the '<em>ICustomer Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMER_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IAccountManagement <em>IAccount Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IAccountManagement
	 * @see business.impl.BusinessPackageImpl#getIAccountManagement()
	 * @generated
	 */
	int IACCOUNT_MANAGEMENT = 9;

	/**
	 * The number of structural features of the '<em>IAccount Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNT_MANAGEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link business.IRoomReservationManagement <em>IRoom Reservation Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see business.IRoomReservationManagement
	 * @see business.impl.BusinessPackageImpl#getIRoomReservationManagement()
	 * @generated
	 */
	int IROOM_RESERVATION_MANAGEMENT = 10;

	/**
	 * The number of structural features of the '<em>IRoom Reservation Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IROOM_RESERVATION_MANAGEMENT_FEATURE_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link business.IGuestManagement <em>IGuest Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGuest Management</em>'.
	 * @see business.IGuestManagement
	 * @generated
	 */
	EClass getIGuestManagement();

	/**
	 * Returns the meta object for class '{@link business.IRoomExtraManagement <em>IRoom Extra Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Extra Management</em>'.
	 * @see business.IRoomExtraManagement
	 * @generated
	 */
	EClass getIRoomExtraManagement();

	/**
	 * Returns the meta object for class '{@link business.IRoomManagement <em>IRoom Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Management</em>'.
	 * @see business.IRoomManagement
	 * @generated
	 */
	EClass getIRoomManagement();

	/**
	 * Returns the meta object for class '{@link business.IServiceManagement <em>IService Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IService Management</em>'.
	 * @see business.IServiceManagement
	 * @generated
	 */
	EClass getIServiceManagement();

	/**
	 * Returns the meta object for class '{@link business.IBedTypeManagement <em>IBed Type Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBed Type Management</em>'.
	 * @see business.IBedTypeManagement
	 * @generated
	 */
	EClass getIBedTypeManagement();

	/**
	 * Returns the meta object for class '{@link business.IBillableItemManagement <em>IBillable Item Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBillable Item Management</em>'.
	 * @see business.IBillableItemManagement
	 * @generated
	 */
	EClass getIBillableItemManagement();

	/**
	 * Returns the meta object for class '{@link business.IBillingManagement <em>IBilling Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBilling Management</em>'.
	 * @see business.IBillingManagement
	 * @generated
	 */
	EClass getIBillingManagement();

	/**
	 * Returns the meta object for class '{@link business.IBookingManagement <em>IBooking Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBooking Management</em>'.
	 * @see business.IBookingManagement
	 * @generated
	 */
	EClass getIBookingManagement();

	/**
	 * Returns the meta object for class '{@link business.ICustomerManagement <em>ICustomer Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICustomer Management</em>'.
	 * @see business.ICustomerManagement
	 * @generated
	 */
	EClass getICustomerManagement();

	/**
	 * Returns the meta object for class '{@link business.IAccountManagement <em>IAccount Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAccount Management</em>'.
	 * @see business.IAccountManagement
	 * @generated
	 */
	EClass getIAccountManagement();

	/**
	 * Returns the meta object for class '{@link business.IRoomReservationManagement <em>IRoom Reservation Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRoom Reservation Management</em>'.
	 * @see business.IRoomReservationManagement
	 * @generated
	 */
	EClass getIRoomReservationManagement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BusinessFactory getBusinessFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link business.IGuestManagement <em>IGuest Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IGuestManagement
		 * @see business.impl.BusinessPackageImpl#getIGuestManagement()
		 * @generated
		 */
		EClass IGUEST_MANAGEMENT = eINSTANCE.getIGuestManagement();

		/**
		 * The meta object literal for the '{@link business.IRoomExtraManagement <em>IRoom Extra Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IRoomExtraManagement
		 * @see business.impl.BusinessPackageImpl#getIRoomExtraManagement()
		 * @generated
		 */
		EClass IROOM_EXTRA_MANAGEMENT = eINSTANCE.getIRoomExtraManagement();

		/**
		 * The meta object literal for the '{@link business.IRoomManagement <em>IRoom Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IRoomManagement
		 * @see business.impl.BusinessPackageImpl#getIRoomManagement()
		 * @generated
		 */
		EClass IROOM_MANAGEMENT = eINSTANCE.getIRoomManagement();

		/**
		 * The meta object literal for the '{@link business.IServiceManagement <em>IService Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IServiceManagement
		 * @see business.impl.BusinessPackageImpl#getIServiceManagement()
		 * @generated
		 */
		EClass ISERVICE_MANAGEMENT = eINSTANCE.getIServiceManagement();

		/**
		 * The meta object literal for the '{@link business.IBedTypeManagement <em>IBed Type Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IBedTypeManagement
		 * @see business.impl.BusinessPackageImpl#getIBedTypeManagement()
		 * @generated
		 */
		EClass IBED_TYPE_MANAGEMENT = eINSTANCE.getIBedTypeManagement();

		/**
		 * The meta object literal for the '{@link business.IBillableItemManagement <em>IBillable Item Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IBillableItemManagement
		 * @see business.impl.BusinessPackageImpl#getIBillableItemManagement()
		 * @generated
		 */
		EClass IBILLABLE_ITEM_MANAGEMENT = eINSTANCE.getIBillableItemManagement();

		/**
		 * The meta object literal for the '{@link business.IBillingManagement <em>IBilling Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IBillingManagement
		 * @see business.impl.BusinessPackageImpl#getIBillingManagement()
		 * @generated
		 */
		EClass IBILLING_MANAGEMENT = eINSTANCE.getIBillingManagement();

		/**
		 * The meta object literal for the '{@link business.IBookingManagement <em>IBooking Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IBookingManagement
		 * @see business.impl.BusinessPackageImpl#getIBookingManagement()
		 * @generated
		 */
		EClass IBOOKING_MANAGEMENT = eINSTANCE.getIBookingManagement();

		/**
		 * The meta object literal for the '{@link business.ICustomerManagement <em>ICustomer Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.ICustomerManagement
		 * @see business.impl.BusinessPackageImpl#getICustomerManagement()
		 * @generated
		 */
		EClass ICUSTOMER_MANAGEMENT = eINSTANCE.getICustomerManagement();

		/**
		 * The meta object literal for the '{@link business.IAccountManagement <em>IAccount Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IAccountManagement
		 * @see business.impl.BusinessPackageImpl#getIAccountManagement()
		 * @generated
		 */
		EClass IACCOUNT_MANAGEMENT = eINSTANCE.getIAccountManagement();

		/**
		 * The meta object literal for the '{@link business.IRoomReservationManagement <em>IRoom Reservation Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see business.IRoomReservationManagement
		 * @see business.impl.BusinessPackageImpl#getIRoomReservationManagement()
		 * @generated
		 */
		EClass IROOM_RESERVATION_MANAGEMENT = eINSTANCE.getIRoomReservationManagement();

	}

} //BusinessPackage
