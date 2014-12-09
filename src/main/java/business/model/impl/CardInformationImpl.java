/**
 */
package business.model.impl;

import business.model.Address;
import business.model.CardInformation;
import business.model.ModelPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link business.model.impl.CardInformationImpl#getId <em>Id</em>}</li>
 * <li>{@link business.model.impl.CardInformationImpl#getCardNumber <em>Card Number</em>}</li>
 * <li>{@link business.model.impl.CardInformationImpl#getCardHolderName <em>Card Holder Name</em>}</li>
 * <li>{@link business.model.impl.CardInformationImpl#getExpirationDate <em>Expiration Date</em>}</li>
 * <li>{@link business.model.impl.CardInformationImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardInformationImpl extends MinimalEObjectImpl.Container implements CardInformation {
    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getId()
     */
    protected static final String ID_EDEFAULT = null;
    /**
     * The default value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCardNumber()
     */
    protected static final String CARD_NUMBER_EDEFAULT = null;
    /**
     * The default value of the '{@link #getCardHolderName() <em>Card Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCardHolderName()
     */
    protected static final String CARD_HOLDER_NAME_EDEFAULT = null;
    /**
     * The default value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getExpirationDate()
     */
    protected static final Date EXPIRATION_DATE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getId()
     */
    protected String id = ID_EDEFAULT;
    /**
     * The cached value of the '{@link #getCardNumber() <em>Card Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCardNumber()
     */
    protected String cardNumber = CARD_NUMBER_EDEFAULT;
    /**
     * The cached value of the '{@link #getCardHolderName() <em>Card Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getCardHolderName()
     */
    protected String cardHolderName = CARD_HOLDER_NAME_EDEFAULT;
    /**
     * The cached value of the '{@link #getExpirationDate() <em>Expiration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getExpirationDate()
     */
    protected Date expirationDate = EXPIRATION_DATE_EDEFAULT;

    /**
     * The cached value of the '{@link #getAddress() <em>Address</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getAddress()
     */
    protected Address address;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected CardInformationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EClass eStaticClass() {
        return ModelPackage.Literals.CARD_INFORMATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD_INFORMATION__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setCardNumber(String newCardNumber) {
        String oldCardNumber = cardNumber;
        cardNumber = newCardNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD_INFORMATION__CARD_NUMBER, oldCardNumber, cardNumber));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setCardHolderName(String newCardHolderName) {
        String oldCardHolderName = cardHolderName;
        cardHolderName = newCardHolderName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD_INFORMATION__CARD_HOLDER_NAME, oldCardHolderName, cardHolderName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setExpirationDate(Date newExpirationDate) {
        Date oldExpirationDate = expirationDate;
        expirationDate = newExpirationDate;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD_INFORMATION__EXPIRATION_DATE, oldExpirationDate, expirationDate));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Address getAddress() {
        if (address != null && address.eIsProxy()) {
            InternalEObject oldAddress = (InternalEObject) address;
            address = (Address) eResolveProxy(oldAddress);
            if (address != oldAddress) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CARD_INFORMATION__ADDRESS, oldAddress, address));
            }
        }
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setAddress(Address newAddress) {
        Address oldAddress = address;
        address = newAddress;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CARD_INFORMATION__ADDRESS, oldAddress, address));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Address basicGetAddress() {
        return address;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.CARD_INFORMATION__ID:
                return getId();
            case ModelPackage.CARD_INFORMATION__CARD_NUMBER:
                return getCardNumber();
            case ModelPackage.CARD_INFORMATION__CARD_HOLDER_NAME:
                return getCardHolderName();
            case ModelPackage.CARD_INFORMATION__EXPIRATION_DATE:
                return getExpirationDate();
            case ModelPackage.CARD_INFORMATION__ADDRESS:
                if (resolve) return getAddress();
                return basicGetAddress();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ModelPackage.CARD_INFORMATION__ID:
                setId((String) newValue);
                return;
            case ModelPackage.CARD_INFORMATION__CARD_NUMBER:
                setCardNumber((String) newValue);
                return;
            case ModelPackage.CARD_INFORMATION__CARD_HOLDER_NAME:
                setCardHolderName((String) newValue);
                return;
            case ModelPackage.CARD_INFORMATION__EXPIRATION_DATE:
                setExpirationDate((Date) newValue);
                return;
            case ModelPackage.CARD_INFORMATION__ADDRESS:
                setAddress((Address) newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void eUnset(int featureID) {
        switch (featureID) {
            case ModelPackage.CARD_INFORMATION__ID:
                setId(ID_EDEFAULT);
                return;
            case ModelPackage.CARD_INFORMATION__CARD_NUMBER:
                setCardNumber(CARD_NUMBER_EDEFAULT);
                return;
            case ModelPackage.CARD_INFORMATION__CARD_HOLDER_NAME:
                setCardHolderName(CARD_HOLDER_NAME_EDEFAULT);
                return;
            case ModelPackage.CARD_INFORMATION__EXPIRATION_DATE:
                setExpirationDate(EXPIRATION_DATE_EDEFAULT);
                return;
            case ModelPackage.CARD_INFORMATION__ADDRESS:
                setAddress((Address) null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case ModelPackage.CARD_INFORMATION__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ModelPackage.CARD_INFORMATION__CARD_NUMBER:
                return CARD_NUMBER_EDEFAULT == null ? cardNumber != null : !CARD_NUMBER_EDEFAULT.equals(cardNumber);
            case ModelPackage.CARD_INFORMATION__CARD_HOLDER_NAME:
                return CARD_HOLDER_NAME_EDEFAULT == null ? cardHolderName != null : !CARD_HOLDER_NAME_EDEFAULT.equals(cardHolderName);
            case ModelPackage.CARD_INFORMATION__EXPIRATION_DATE:
                return EXPIRATION_DATE_EDEFAULT == null ? expirationDate != null : !EXPIRATION_DATE_EDEFAULT.equals(expirationDate);
            case ModelPackage.CARD_INFORMATION__ADDRESS:
                return address != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (id: ");
        result.append(id);
        result.append(", cardNumber: ");
        result.append(cardNumber);
        result.append(", CardHolderName: ");
        result.append(cardHolderName);
        result.append(", expirationDate: ");
        result.append(expirationDate);
        result.append(')');
        return result.toString();
    }

} //CardInformationImpl
