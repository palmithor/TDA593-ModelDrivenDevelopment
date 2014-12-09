/**
 */
package business.model.impl;

import business.model.BedType;
import business.model.Classification;
import business.model.ModelPackage;
import business.model.Room;
import business.model.RoomExtra;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link business.model.impl.RoomImpl#getId <em>Id</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getNumber <em>Number</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getDescription <em>Description</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getAllowedGuests <em>Allowed Guests</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getSize <em>Size</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getNightPrice <em>Night Price</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getPictures <em>Pictures</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getClassification <em>Classification</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getBedType <em>Bed Type</em>}</li>
 * <li>{@link business.model.impl.RoomImpl#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends MinimalEObjectImpl.Container implements Room {
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
     * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getNumber()
     */
    protected static final String NUMBER_EDEFAULT = null;
    /**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDescription()
     */
    protected static final String DESCRIPTION_EDEFAULT = null;
    /**
     * The default value of the '{@link #getAllowedGuests() <em>Allowed Guests</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getAllowedGuests()
     */
    protected static final int ALLOWED_GUESTS_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getSize()
     */
    protected static final BigDecimal SIZE_EDEFAULT = null;
    /**
     * The default value of the '{@link #getNightPrice() <em>Night Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getNightPrice()
     */
    protected static final BigDecimal NIGHT_PRICE_EDEFAULT = null;
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
     * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getNumber()
     */
    protected String number = NUMBER_EDEFAULT;
    /**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getDescription()
     */
    protected String description = DESCRIPTION_EDEFAULT;
    /**
     * The cached value of the '{@link #getAllowedGuests() <em>Allowed Guests</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getAllowedGuests()
     */
    protected int allowedGuests = ALLOWED_GUESTS_EDEFAULT;
    /**
     * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getSize()
     */
    protected BigDecimal size = SIZE_EDEFAULT;
    /**
     * The cached value of the '{@link #getNightPrice() <em>Night Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getNightPrice()
     */
    protected BigDecimal nightPrice = NIGHT_PRICE_EDEFAULT;

    /**
     * The cached value of the '{@link #getPictures() <em>Pictures</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPictures()
     */
    protected EList pictures;

    /**
     * The cached value of the '{@link #getClassification() <em>Classification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getClassification()
     */
    protected Classification classification;

    /**
     * The cached value of the '{@link #getBedType() <em>Bed Type</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getBedType()
     */
    protected EList bedType;

    /**
     * The cached value of the '{@link #getRoomExtra() <em>Room Extra</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getRoomExtra()
     */
    protected EList roomExtra;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected RoomImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EClass eStaticClass() {
        return ModelPackage.Literals.ROOM;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getNumber() {
        return number;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setNumber(String newNumber) {
        String oldNumber = number;
        number = newNumber;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__NUMBER, oldNumber, number));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__DESCRIPTION, oldDescription, description));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getAllowedGuests() {
        return allowedGuests;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setAllowedGuests(int newAllowedGuests) {
        int oldAllowedGuests = allowedGuests;
        allowedGuests = newAllowedGuests;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__ALLOWED_GUESTS, oldAllowedGuests, allowedGuests));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BigDecimal getSize() {
        return size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setSize(BigDecimal newSize) {
        BigDecimal oldSize = size;
        size = newSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__SIZE, oldSize, size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public BigDecimal getNightPrice() {
        return nightPrice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setNightPrice(BigDecimal newNightPrice) {
        BigDecimal oldNightPrice = nightPrice;
        nightPrice = newNightPrice;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__NIGHT_PRICE, oldNightPrice, nightPrice));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList getPictures() {
        if (pictures == null) {
            pictures = new EDataTypeUniqueEList(String.class, this, ModelPackage.ROOM__PICTURES);
        }
        return pictures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Classification getClassification() {
        if (classification != null && classification.eIsProxy()) {
            InternalEObject oldClassification = (InternalEObject) classification;
            classification = (Classification) eResolveProxy(oldClassification);
            if (classification != oldClassification) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.ROOM__CLASSIFICATION, oldClassification, classification));
            }
        }
        return classification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setClassification(Classification newClassification) {
        Classification oldClassification = classification;
        classification = newClassification;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM__CLASSIFICATION, oldClassification, classification));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Classification basicGetClassification() {
        return classification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList getBedType() {
        if (bedType == null) {
            bedType = new EObjectResolvingEList(BedType.class, this, ModelPackage.ROOM__BED_TYPE);
        }
        return bedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList getRoomExtra() {
        if (roomExtra == null) {
            roomExtra = new EObjectResolvingEList(RoomExtra.class, this, ModelPackage.ROOM__ROOM_EXTRA);
        }
        return roomExtra;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.ROOM__ID:
                return getId();
            case ModelPackage.ROOM__NUMBER:
                return getNumber();
            case ModelPackage.ROOM__DESCRIPTION:
                return getDescription();
            case ModelPackage.ROOM__ALLOWED_GUESTS:
                return new Integer(getAllowedGuests());
            case ModelPackage.ROOM__SIZE:
                return getSize();
            case ModelPackage.ROOM__NIGHT_PRICE:
                return getNightPrice();
            case ModelPackage.ROOM__PICTURES:
                return getPictures();
            case ModelPackage.ROOM__CLASSIFICATION:
                if (resolve) return getClassification();
                return basicGetClassification();
            case ModelPackage.ROOM__BED_TYPE:
                return getBedType();
            case ModelPackage.ROOM__ROOM_EXTRA:
                return getRoomExtra();
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
            case ModelPackage.ROOM__ID:
                setId((String) newValue);
                return;
            case ModelPackage.ROOM__NUMBER:
                setNumber((String) newValue);
                return;
            case ModelPackage.ROOM__DESCRIPTION:
                setDescription((String) newValue);
                return;
            case ModelPackage.ROOM__ALLOWED_GUESTS:
                setAllowedGuests(((Integer) newValue).intValue());
                return;
            case ModelPackage.ROOM__SIZE:
                setSize((BigDecimal) newValue);
                return;
            case ModelPackage.ROOM__NIGHT_PRICE:
                setNightPrice((BigDecimal) newValue);
                return;
            case ModelPackage.ROOM__PICTURES:
                getPictures().clear();
                getPictures().addAll((Collection) newValue);
                return;
            case ModelPackage.ROOM__CLASSIFICATION:
                setClassification((Classification) newValue);
                return;
            case ModelPackage.ROOM__BED_TYPE:
                getBedType().clear();
                getBedType().addAll((Collection) newValue);
                return;
            case ModelPackage.ROOM__ROOM_EXTRA:
                getRoomExtra().clear();
                getRoomExtra().addAll((Collection) newValue);
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
            case ModelPackage.ROOM__ID:
                setId(ID_EDEFAULT);
                return;
            case ModelPackage.ROOM__NUMBER:
                setNumber(NUMBER_EDEFAULT);
                return;
            case ModelPackage.ROOM__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case ModelPackage.ROOM__ALLOWED_GUESTS:
                setAllowedGuests(ALLOWED_GUESTS_EDEFAULT);
                return;
            case ModelPackage.ROOM__SIZE:
                setSize(SIZE_EDEFAULT);
                return;
            case ModelPackage.ROOM__NIGHT_PRICE:
                setNightPrice(NIGHT_PRICE_EDEFAULT);
                return;
            case ModelPackage.ROOM__PICTURES:
                getPictures().clear();
                return;
            case ModelPackage.ROOM__CLASSIFICATION:
                setClassification((Classification) null);
                return;
            case ModelPackage.ROOM__BED_TYPE:
                getBedType().clear();
                return;
            case ModelPackage.ROOM__ROOM_EXTRA:
                getRoomExtra().clear();
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
            case ModelPackage.ROOM__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ModelPackage.ROOM__NUMBER:
                return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
            case ModelPackage.ROOM__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case ModelPackage.ROOM__ALLOWED_GUESTS:
                return allowedGuests != ALLOWED_GUESTS_EDEFAULT;
            case ModelPackage.ROOM__SIZE:
                return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
            case ModelPackage.ROOM__NIGHT_PRICE:
                return NIGHT_PRICE_EDEFAULT == null ? nightPrice != null : !NIGHT_PRICE_EDEFAULT.equals(nightPrice);
            case ModelPackage.ROOM__PICTURES:
                return pictures != null && !pictures.isEmpty();
            case ModelPackage.ROOM__CLASSIFICATION:
                return classification != null;
            case ModelPackage.ROOM__BED_TYPE:
                return bedType != null && !bedType.isEmpty();
            case ModelPackage.ROOM__ROOM_EXTRA:
                return roomExtra != null && !roomExtra.isEmpty();
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
        result.append(", number: ");
        result.append(number);
        result.append(", description: ");
        result.append(description);
        result.append(", allowedGuests: ");
        result.append(allowedGuests);
        result.append(", size: ");
        result.append(size);
        result.append(", nightPrice: ");
        result.append(nightPrice);
        result.append(", pictures: ");
        result.append(pictures);
        result.append(')');
        return result.toString();
    }

} //RoomImpl
