/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.BusinessPackage;

import com.bodkink.hotel.business.impl.BusinessPackageImpl;

import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.logic.impl.LogicPackageImpl;

import com.bodkink.hotel.business.model.Address;
import com.bodkink.hotel.business.model.BedType;
import com.bodkink.hotel.business.model.Bill;
import com.bodkink.hotel.business.model.BillStatusEnum;
import com.bodkink.hotel.business.model.BillableItem;
import com.bodkink.hotel.business.model.Booking;
import com.bodkink.hotel.business.model.BookingBill;
import com.bodkink.hotel.business.model.BookingBillType;
import com.bodkink.hotel.business.model.CardInformation;
import com.bodkink.hotel.business.model.Classification;
import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.CustomerUserAccount;
import com.bodkink.hotel.business.model.Guest;
import com.bodkink.hotel.business.model.ModelFactory;
import com.bodkink.hotel.business.model.ModelPackage;
import com.bodkink.hotel.business.model.Person;
import com.bodkink.hotel.business.model.Receipt;
import com.bodkink.hotel.business.model.ReceiptItem;
import com.bodkink.hotel.business.model.ReservationStatusEnum;
import com.bodkink.hotel.business.model.Room;
import com.bodkink.hotel.business.model.RoomBill;
import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.business.model.RoomExtraTemplate;
import com.bodkink.hotel.business.model.RoomReservation;
import com.bodkink.hotel.business.model.RoomReservationType;
import com.bodkink.hotel.business.model.Service;
import com.bodkink.hotel.business.model.UserAccount;
import com.bodkink.hotel.business.model.UserGroupEnum;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billableItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomReservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomReservationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomExtraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomBillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingBillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomExtraTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerUserAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum billStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reservationStatusEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bookingBillTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userGroupEnumEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.bodkink.hotel.business.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BusinessPackageImpl theBusinessPackage = (BusinessPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) instanceof BusinessPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BusinessPackage.eNS_URI) : BusinessPackage.eINSTANCE);
		LogicPackageImpl theLogicPackage = (LogicPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) instanceof LogicPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicPackage.eNS_URI) : LogicPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theBusinessPackage.createPackageContents();
		theLogicPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theBusinessPackage.initializePackageContents();
		theLogicPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Id() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_AddressLine1() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_AddressLine2() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_ZipCode() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Country() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBedType() {
		return bedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedType_Id() {
		return (EAttribute)bedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedType_Name() {
		return (EAttribute)bedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedType_Length() {
		return (EAttribute)bedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedType_Width() {
		return (EAttribute)bedTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBedType_Places() {
		return (EAttribute)bedTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Id() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_BillStatusEnum() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBill_CardInformation() {
		return (EReference)billEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardInformation() {
		return cardInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInformation_Id() {
		return (EAttribute)cardInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInformation_CardNumber() {
		return (EAttribute)cardInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInformation_CardHolderName() {
		return (EAttribute)cardInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardInformation_ExpirationDate() {
		return (EAttribute)cardInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardInformation_Address() {
		return (EReference)cardInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillableItem() {
		return billableItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillableItem_Id() {
		return (EAttribute)billableItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillableItem_Name() {
		return (EAttribute)billableItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBillableItem_Price() {
		return (EAttribute)billableItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Id() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Number() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Customer() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_RoomReservation() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_Service() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_BookingBill() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Phone() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Email() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Notes() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_CardInformation() {
		return (EReference)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Id() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_FirstName() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Surname() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_BirthYear() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomReservation() {
		return roomReservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_Id() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_StartDate() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_EndDate() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_Guest() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_RoomReservationType() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_Room() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomReservation_RoomBill() {
		return (EReference)roomReservationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservation_ReservationStatusEnum() {
		return (EAttribute)roomReservationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomReservationType() {
		return roomReservationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservationType_Id() {
		return (EAttribute)roomReservationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomReservationType_Type() {
		return (EAttribute)roomReservationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Id() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Number() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Description() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_AllowedGuests() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Size() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_NightPrice() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Pictures() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Classification() {
		return (EReference)roomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_BedType() {
		return (EReference)roomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_RoomExtra() {
		return (EReference)roomEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassification() {
		return classificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Id() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Title() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassification_Description() {
		return (EAttribute)classificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomExtra() {
		return roomExtraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtra_Id() {
		return (EAttribute)roomExtraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtra_Title() {
		return (EAttribute)roomExtraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtra_Description() {
		return (EAttribute)roomExtraEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomBill() {
		return roomBillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomBill_BillableItem() {
		return (EReference)roomBillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Id() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Title() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Description() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Price() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingBill() {
		return bookingBillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookingBill_BookingBillType() {
		return (EAttribute)bookingBillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomExtraTemplate() {
		return roomExtraTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtraTemplate_Id() {
		return (EAttribute)roomExtraTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomExtraTemplate_TemplateName() {
		return (EAttribute)roomExtraTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomExtraTemplate_RoomExtra() {
		return (EReference)roomExtraTemplateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceipt() {
		return receiptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceipt_ReceiptItem() {
		return (EReference)receiptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiptItem() {
		return receiptItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserAccount() {
		return userAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAccount_Id() {
		return (EAttribute)userAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAccount_Username() {
		return (EAttribute)userAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserAccount_Password() {
		return (EAttribute)userAccountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerUserAccount() {
		return customerUserAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerUserAccount_Customer() {
		return (EReference)customerUserAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomerUserAccount_UserGroupEnum() {
		return (EAttribute)customerUserAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBillStatusEnum() {
		return billStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReservationStatusEnum() {
		return reservationStatusEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBookingBillType() {
		return bookingBillTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserGroupEnum() {
		return userGroupEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__ID);
		createEAttribute(addressEClass, ADDRESS__ADDRESS_LINE1);
		createEAttribute(addressEClass, ADDRESS__ADDRESS_LINE2);
		createEAttribute(addressEClass, ADDRESS__ZIP_CODE);
		createEAttribute(addressEClass, ADDRESS__CITY);
		createEAttribute(addressEClass, ADDRESS__COUNTRY);

		bedTypeEClass = createEClass(BED_TYPE);
		createEAttribute(bedTypeEClass, BED_TYPE__ID);
		createEAttribute(bedTypeEClass, BED_TYPE__NAME);
		createEAttribute(bedTypeEClass, BED_TYPE__LENGTH);
		createEAttribute(bedTypeEClass, BED_TYPE__WIDTH);
		createEAttribute(bedTypeEClass, BED_TYPE__PLACES);

		billEClass = createEClass(BILL);
		createEAttribute(billEClass, BILL__ID);
		createEAttribute(billEClass, BILL__BILL_STATUS_ENUM);
		createEReference(billEClass, BILL__CARD_INFORMATION);

		cardInformationEClass = createEClass(CARD_INFORMATION);
		createEAttribute(cardInformationEClass, CARD_INFORMATION__ID);
		createEAttribute(cardInformationEClass, CARD_INFORMATION__CARD_NUMBER);
		createEAttribute(cardInformationEClass, CARD_INFORMATION__CARD_HOLDER_NAME);
		createEAttribute(cardInformationEClass, CARD_INFORMATION__EXPIRATION_DATE);
		createEReference(cardInformationEClass, CARD_INFORMATION__ADDRESS);

		billableItemEClass = createEClass(BILLABLE_ITEM);
		createEAttribute(billableItemEClass, BILLABLE_ITEM__ID);
		createEAttribute(billableItemEClass, BILLABLE_ITEM__NAME);
		createEAttribute(billableItemEClass, BILLABLE_ITEM__PRICE);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__ID);
		createEAttribute(bookingEClass, BOOKING__NUMBER);
		createEReference(bookingEClass, BOOKING__CUSTOMER);
		createEReference(bookingEClass, BOOKING__ROOM_RESERVATION);
		createEReference(bookingEClass, BOOKING__SERVICE);
		createEReference(bookingEClass, BOOKING__BOOKING_BILL);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__PHONE);
		createEAttribute(customerEClass, CUSTOMER__EMAIL);
		createEAttribute(customerEClass, CUSTOMER__NOTES);
		createEReference(customerEClass, CUSTOMER__CARD_INFORMATION);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__ID);
		createEAttribute(personEClass, PERSON__FIRST_NAME);
		createEAttribute(personEClass, PERSON__SURNAME);
		createEAttribute(personEClass, PERSON__BIRTH_YEAR);

		roomReservationEClass = createEClass(ROOM_RESERVATION);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__ID);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__START_DATE);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__END_DATE);
		createEReference(roomReservationEClass, ROOM_RESERVATION__GUEST);
		createEReference(roomReservationEClass, ROOM_RESERVATION__ROOM_RESERVATION_TYPE);
		createEReference(roomReservationEClass, ROOM_RESERVATION__ROOM);
		createEReference(roomReservationEClass, ROOM_RESERVATION__ROOM_BILL);
		createEAttribute(roomReservationEClass, ROOM_RESERVATION__RESERVATION_STATUS_ENUM);

		guestEClass = createEClass(GUEST);

		roomReservationTypeEClass = createEClass(ROOM_RESERVATION_TYPE);
		createEAttribute(roomReservationTypeEClass, ROOM_RESERVATION_TYPE__ID);
		createEAttribute(roomReservationTypeEClass, ROOM_RESERVATION_TYPE__TYPE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ID);
		createEAttribute(roomEClass, ROOM__NUMBER);
		createEAttribute(roomEClass, ROOM__DESCRIPTION);
		createEAttribute(roomEClass, ROOM__ALLOWED_GUESTS);
		createEAttribute(roomEClass, ROOM__SIZE);
		createEAttribute(roomEClass, ROOM__NIGHT_PRICE);
		createEAttribute(roomEClass, ROOM__PICTURES);
		createEReference(roomEClass, ROOM__CLASSIFICATION);
		createEReference(roomEClass, ROOM__BED_TYPE);
		createEReference(roomEClass, ROOM__ROOM_EXTRA);

		classificationEClass = createEClass(CLASSIFICATION);
		createEAttribute(classificationEClass, CLASSIFICATION__ID);
		createEAttribute(classificationEClass, CLASSIFICATION__TITLE);
		createEAttribute(classificationEClass, CLASSIFICATION__DESCRIPTION);

		roomExtraEClass = createEClass(ROOM_EXTRA);
		createEAttribute(roomExtraEClass, ROOM_EXTRA__ID);
		createEAttribute(roomExtraEClass, ROOM_EXTRA__TITLE);
		createEAttribute(roomExtraEClass, ROOM_EXTRA__DESCRIPTION);

		roomBillEClass = createEClass(ROOM_BILL);
		createEReference(roomBillEClass, ROOM_BILL__BILLABLE_ITEM);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__ID);
		createEAttribute(serviceEClass, SERVICE__TITLE);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__PRICE);

		bookingBillEClass = createEClass(BOOKING_BILL);
		createEAttribute(bookingBillEClass, BOOKING_BILL__BOOKING_BILL_TYPE);

		roomExtraTemplateEClass = createEClass(ROOM_EXTRA_TEMPLATE);
		createEAttribute(roomExtraTemplateEClass, ROOM_EXTRA_TEMPLATE__ID);
		createEAttribute(roomExtraTemplateEClass, ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME);
		createEReference(roomExtraTemplateEClass, ROOM_EXTRA_TEMPLATE__ROOM_EXTRA);

		receiptEClass = createEClass(RECEIPT);
		createEReference(receiptEClass, RECEIPT__RECEIPT_ITEM);

		receiptItemEClass = createEClass(RECEIPT_ITEM);

		userAccountEClass = createEClass(USER_ACCOUNT);
		createEAttribute(userAccountEClass, USER_ACCOUNT__ID);
		createEAttribute(userAccountEClass, USER_ACCOUNT__USERNAME);
		createEAttribute(userAccountEClass, USER_ACCOUNT__PASSWORD);

		customerUserAccountEClass = createEClass(CUSTOMER_USER_ACCOUNT);
		createEReference(customerUserAccountEClass, CUSTOMER_USER_ACCOUNT__CUSTOMER);
		createEAttribute(customerUserAccountEClass, CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM);

		// Create enums
		billStatusEnumEEnum = createEEnum(BILL_STATUS_ENUM);
		reservationStatusEnumEEnum = createEEnum(RESERVATION_STATUS_ENUM);
		bookingBillTypeEEnum = createEEnum(BOOKING_BILL_TYPE);
		userGroupEnumEEnum = createEEnum(USER_GROUP_ENUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customerEClass.getESuperTypes().add(this.getPerson());
		guestEClass.getESuperTypes().add(this.getPerson());
		roomBillEClass.getESuperTypes().add(this.getBill());
		bookingBillEClass.getESuperTypes().add(this.getBill());
		customerUserAccountEClass.getESuperTypes().add(this.getUserAccount());

		// Initialize classes, features, and operations; add parameters
		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Id(), theTypesPackage.getString(), "id", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_AddressLine1(), theTypesPackage.getString(), "addressLine1", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_AddressLine2(), theTypesPackage.getString(), "addressLine2", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_ZipCode(), theTypesPackage.getString(), "zipCode", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_City(), theTypesPackage.getString(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddress_Country(), theTypesPackage.getString(), "country", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bedTypeEClass, BedType.class, "BedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedType_Id(), theTypesPackage.getString(), "id", null, 1, 1, BedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBedType_Name(), theTypesPackage.getString(), "name", null, 1, 1, BedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBedType_Length(), theTypesPackage.getInteger(), "length", null, 1, 1, BedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBedType_Width(), theTypesPackage.getInteger(), "width", null, 1, 1, BedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBedType_Places(), theTypesPackage.getInteger(), "places", null, 1, 1, BedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_Id(), theTypesPackage.getString(), "id", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_BillStatusEnum(), this.getBillStatusEnum(), "billStatusEnum", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBill_CardInformation(), this.getCardInformation(), null, "cardInformation", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cardInformationEClass, CardInformation.class, "CardInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardInformation_Id(), theTypesPackage.getString(), "id", null, 1, 1, CardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCardInformation_CardNumber(), theTypesPackage.getString(), "cardNumber", null, 1, 1, CardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCardInformation_CardHolderName(), theTypesPackage.getString(), "CardHolderName", null, 1, 1, CardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCardInformation_ExpirationDate(), ecorePackage.getEDate(), "expirationDate", null, 1, 1, CardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCardInformation_Address(), this.getAddress(), null, "address", null, 1, 1, CardInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billableItemEClass, BillableItem.class, "BillableItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBillableItem_Id(), theTypesPackage.getString(), "id", null, 1, 1, BillableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBillableItem_Name(), theTypesPackage.getString(), "name", null, 1, 1, BillableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBillableItem_Price(), ecorePackage.getEBigDecimal(), "price", null, 1, 1, BillableItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_Id(), theTypesPackage.getString(), "id", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Number(), theTypesPackage.getReal(), "number", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Customer(), this.getCustomer(), null, "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_RoomReservation(), this.getRoomReservation(), null, "roomReservation", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_Service(), this.getService(), null, "service", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_BookingBill(), this.getBookingBill(), null, "bookingBill", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Phone(), theTypesPackage.getString(), "phone", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Email(), theTypesPackage.getString(), "email", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Notes(), theTypesPackage.getString(), "notes", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_CardInformation(), this.getCardInformation(), null, "cardInformation", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Id(), theTypesPackage.getString(), "id", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Surname(), theTypesPackage.getString(), "Surname", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_BirthYear(), theTypesPackage.getInteger(), "BirthYear", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomReservationEClass, RoomReservation.class, "RoomReservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomReservation_Id(), theTypesPackage.getString(), "id", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_StartDate(), ecorePackage.getEDate(), "startDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_EndDate(), ecorePackage.getEDate(), "endDate", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_Guest(), this.getGuest(), null, "guest", null, 0, -1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_RoomReservationType(), this.getRoomReservationType(), null, "roomReservationType", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_Room(), this.getRoom(), null, "room", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomReservation_RoomBill(), this.getRoomBill(), null, "roomBill", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservation_ReservationStatusEnum(), this.getReservationStatusEnum(), "reservationStatusEnum", null, 1, 1, RoomReservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roomReservationTypeEClass, RoomReservationType.class, "RoomReservationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomReservationType_Id(), theTypesPackage.getString(), "id", null, 1, 1, RoomReservationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomReservationType_Type(), theTypesPackage.getString(), "type", null, 1, 1, RoomReservationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_Id(), theTypesPackage.getString(), "id", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Number(), theTypesPackage.getString(), "number", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Description(), theTypesPackage.getString(), "description", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_AllowedGuests(), theTypesPackage.getInteger(), "allowedGuests", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Size(), ecorePackage.getEBigDecimal(), "size", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_NightPrice(), ecorePackage.getEBigDecimal(), "nightPrice", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Pictures(), theTypesPackage.getString(), "pictures", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_Classification(), this.getClassification(), null, "classification", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_BedType(), this.getBedType(), null, "bedType", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoom_RoomExtra(), this.getRoomExtra(), null, "roomExtra", null, 0, -1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(classificationEClass, Classification.class, "Classification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassification_Id(), theTypesPackage.getString(), "id", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassification_Title(), theTypesPackage.getString(), "title", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassification_Description(), theTypesPackage.getString(), "description", null, 1, 1, Classification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomExtraEClass, RoomExtra.class, "RoomExtra", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomExtra_Id(), theTypesPackage.getString(), "id", null, 1, 1, RoomExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomExtra_Title(), theTypesPackage.getString(), "title", null, 1, 1, RoomExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomExtra_Description(), theTypesPackage.getString(), "description", null, 1, 1, RoomExtra.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomBillEClass, RoomBill.class, "RoomBill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomBill_BillableItem(), this.getBillableItem(), null, "billableItem", null, 0, -1, RoomBill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Id(), theTypesPackage.getString(), "id", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Title(), theTypesPackage.getString(), "title", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Description(), theTypesPackage.getString(), "description", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Price(), ecorePackage.getEBigDecimal(), "price", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingBillEClass, BookingBill.class, "BookingBill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookingBill_BookingBillType(), this.getBookingBillType(), "bookingBillType", null, 1, 1, BookingBill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomExtraTemplateEClass, RoomExtraTemplate.class, "RoomExtraTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomExtraTemplate_Id(), theTypesPackage.getString(), "id", null, 1, 1, RoomExtraTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomExtraTemplate_TemplateName(), theTypesPackage.getString(), "templateName", null, 1, 1, RoomExtraTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomExtraTemplate_RoomExtra(), this.getRoomExtra(), null, "roomExtra", null, 0, -1, RoomExtraTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receiptEClass, Receipt.class, "Receipt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceipt_ReceiptItem(), this.getReceiptItem(), null, "receiptItem", null, 0, -1, Receipt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receiptItemEClass, ReceiptItem.class, "ReceiptItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userAccountEClass, UserAccount.class, "UserAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserAccount_Id(), theTypesPackage.getString(), "id", null, 1, 1, UserAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserAccount_Username(), ecorePackage.getEString(), "username", null, 1, 1, UserAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserAccount_Password(), ecorePackage.getEString(), "password", null, 1, 1, UserAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customerUserAccountEClass, CustomerUserAccount.class, "CustomerUserAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerUserAccount_Customer(), this.getCustomer(), null, "customer", null, 1, 1, CustomerUserAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomerUserAccount_UserGroupEnum(), this.getUserGroupEnum(), "userGroupEnum", null, 1, 1, CustomerUserAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(billStatusEnumEEnum, BillStatusEnum.class, "BillStatusEnum");
		addEEnumLiteral(billStatusEnumEEnum, BillStatusEnum.PAID);
		addEEnumLiteral(billStatusEnumEEnum, BillStatusEnum.NOT_PAID);

		initEEnum(reservationStatusEnumEEnum, ReservationStatusEnum.class, "ReservationStatusEnum");
		addEEnumLiteral(reservationStatusEnumEEnum, ReservationStatusEnum.CHECKED_IN);
		addEEnumLiteral(reservationStatusEnumEEnum, ReservationStatusEnum.CHECKED_OUT);
		addEEnumLiteral(reservationStatusEnumEEnum, ReservationStatusEnum.RESERVED);
		addEEnumLiteral(reservationStatusEnumEEnum, ReservationStatusEnum.CANCELED);

		initEEnum(bookingBillTypeEEnum, BookingBillType.class, "BookingBillType");
		addEEnumLiteral(bookingBillTypeEEnum, BookingBillType.RESERVATION_FEE);
		addEEnumLiteral(bookingBillTypeEEnum, BookingBillType.FINALIZE);

		initEEnum(userGroupEnumEEnum, UserGroupEnum.class, "UserGroupEnum");
		addEEnumLiteral(userGroupEnumEEnum, UserGroupEnum.ADMIN);
		addEEnumLiteral(userGroupEnumEEnum, UserGroupEnum.MANAGER);
		addEEnumLiteral(userGroupEnumEEnum, UserGroupEnum.CLERK);
		addEEnumLiteral(userGroupEnumEEnum, UserGroupEnum.CUSTOMER);
	}

} //ModelPackageImpl
