/**
 */
package business.model.impl;

import business.model.BedType;
import business.model.ModelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link business.model.impl.BedTypeImpl#getId <em>Id</em>}</li>
 * <li>{@link business.model.impl.BedTypeImpl#getName <em>Name</em>}</li>
 * <li>{@link business.model.impl.BedTypeImpl#getLength <em>Length</em>}</li>
 * <li>{@link business.model.impl.BedTypeImpl#getWidth <em>Width</em>}</li>
 * <li>{@link business.model.impl.BedTypeImpl#getPlaces <em>Places</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BedTypeImpl extends MinimalEObjectImpl.Container implements BedType {
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
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getName()
     */
    protected static final String NAME_EDEFAULT = null;
    /**
     * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getLength()
     */
    protected static final int LENGTH_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getWidth()
     */
    protected static final int WIDTH_EDEFAULT = 0;
    /**
     * The default value of the '{@link #getPlaces() <em>Places</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPlaces()
     */
    protected static final int PLACES_EDEFAULT = 0;
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
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getName()
     */
    protected String name = NAME_EDEFAULT;
    /**
     * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getLength()
     */
    protected int length = LENGTH_EDEFAULT;
    /**
     * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getWidth()
     */
    protected int width = WIDTH_EDEFAULT;
    /**
     * The cached value of the '{@link #getPlaces() <em>Places</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getPlaces()
     */
    protected int places = PLACES_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected BedTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EClass eStaticClass() {
        return ModelPackage.Literals.BED_TYPE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BED_TYPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BED_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getLength() {
        return length;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setLength(int newLength) {
        int oldLength = length;
        length = newLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BED_TYPE__LENGTH, oldLength, length));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getWidth() {
        return width;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setWidth(int newWidth) {
        int oldWidth = width;
        width = newWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BED_TYPE__WIDTH, oldWidth, width));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public int getPlaces() {
        return places;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setPlaces(int newPlaces) {
        int oldPlaces = places;
        places = newPlaces;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.BED_TYPE__PLACES, oldPlaces, places));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ModelPackage.BED_TYPE__ID:
                return getId();
            case ModelPackage.BED_TYPE__NAME:
                return getName();
            case ModelPackage.BED_TYPE__LENGTH:
                return new Integer(getLength());
            case ModelPackage.BED_TYPE__WIDTH:
                return new Integer(getWidth());
            case ModelPackage.BED_TYPE__PLACES:
                return new Integer(getPlaces());
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
            case ModelPackage.BED_TYPE__ID:
                setId((String) newValue);
                return;
            case ModelPackage.BED_TYPE__NAME:
                setName((String) newValue);
                return;
            case ModelPackage.BED_TYPE__LENGTH:
                setLength(((Integer) newValue).intValue());
                return;
            case ModelPackage.BED_TYPE__WIDTH:
                setWidth(((Integer) newValue).intValue());
                return;
            case ModelPackage.BED_TYPE__PLACES:
                setPlaces(((Integer) newValue).intValue());
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
            case ModelPackage.BED_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case ModelPackage.BED_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ModelPackage.BED_TYPE__LENGTH:
                setLength(LENGTH_EDEFAULT);
                return;
            case ModelPackage.BED_TYPE__WIDTH:
                setWidth(WIDTH_EDEFAULT);
                return;
            case ModelPackage.BED_TYPE__PLACES:
                setPlaces(PLACES_EDEFAULT);
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
            case ModelPackage.BED_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ModelPackage.BED_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ModelPackage.BED_TYPE__LENGTH:
                return length != LENGTH_EDEFAULT;
            case ModelPackage.BED_TYPE__WIDTH:
                return width != WIDTH_EDEFAULT;
            case ModelPackage.BED_TYPE__PLACES:
                return places != PLACES_EDEFAULT;
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
        result.append(", name: ");
        result.append(name);
        result.append(", length: ");
        result.append(length);
        result.append(", width: ");
        result.append(width);
        result.append(", places: ");
        result.append(places);
        result.append(')');
        return result.toString();
    }

} //BedTypeImpl
