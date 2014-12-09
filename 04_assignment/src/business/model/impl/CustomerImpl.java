/**
 */
package business.model.impl;

import business.model.CardInformation;
import business.model.Customer;
import business.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link business.model.impl.CustomerImpl#getId <em>Id</em>}</li>
 *   <li>{@link business.model.impl.CustomerImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link business.model.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link business.model.impl.CustomerImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link business.model.impl.CustomerImpl#getCardInformation <em>Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends PersonImpl implements Customer {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList notes;

	/**
	 * The cached value of the '{@link #getCardInformation() <em>Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardInformation()
	 * @generated
	 * @ordered
	 */
	protected CardInformation cardInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNotes() {
		if (notes == null) {
			notes = new EDataTypeUniqueEList(String.class, this, ModelPackage.CUSTOMER__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInformation getCardInformation() {
		if (cardInformation != null && cardInformation.eIsProxy()) {
			InternalEObject oldCardInformation = (InternalEObject)cardInformation;
			cardInformation = (CardInformation)eResolveProxy(oldCardInformation);
			if (cardInformation != oldCardInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CUSTOMER__CARD_INFORMATION, oldCardInformation, cardInformation));
			}
		}
		return cardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardInformation basicGetCardInformation() {
		return cardInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardInformation(CardInformation newCardInformation) {
		CardInformation oldCardInformation = cardInformation;
		cardInformation = newCardInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER__CARD_INFORMATION, oldCardInformation, cardInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__ID:
				return getId();
			case ModelPackage.CUSTOMER__PHONE:
				return getPhone();
			case ModelPackage.CUSTOMER__EMAIL:
				return getEmail();
			case ModelPackage.CUSTOMER__NOTES:
				return getNotes();
			case ModelPackage.CUSTOMER__CARD_INFORMATION:
				if (resolve) return getCardInformation();
				return basicGetCardInformation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__ID:
				setId((String)newValue);
				return;
			case ModelPackage.CUSTOMER__PHONE:
				setPhone((String)newValue);
				return;
			case ModelPackage.CUSTOMER__EMAIL:
				setEmail((String)newValue);
				return;
			case ModelPackage.CUSTOMER__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection)newValue);
				return;
			case ModelPackage.CUSTOMER__CARD_INFORMATION:
				setCardInformation((CardInformation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.CUSTOMER__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case ModelPackage.CUSTOMER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ModelPackage.CUSTOMER__NOTES:
				getNotes().clear();
				return;
			case ModelPackage.CUSTOMER__CARD_INFORMATION:
				setCardInformation((CardInformation)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.CUSTOMER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.CUSTOMER__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case ModelPackage.CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ModelPackage.CUSTOMER__NOTES:
				return notes != null && !notes.isEmpty();
			case ModelPackage.CUSTOMER__CARD_INFORMATION:
				return cardInformation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", phone: ");
		result.append(phone);
		result.append(", email: ");
		result.append(email);
		result.append(", notes: ");
		result.append(notes);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
