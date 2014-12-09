/**
 */
package business.model.impl;

import business.model.ModelPackage;
import business.model.RoomExtra;
import business.model.RoomExtraTemplate;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Extra Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link business.model.impl.RoomExtraTemplateImpl#getId <em>Id</em>}</li>
 * <li>{@link business.model.impl.RoomExtraTemplateImpl#getTemplateName <em>Template Name</em>}</li>
 * <li>{@link business.model.impl.RoomExtraTemplateImpl#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomExtraTemplateImpl extends MinimalEObjectImpl.Container implements RoomExtraTemplate {
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
     * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTemplateName()
     */
    protected static final String TEMPLATE_NAME_EDEFAULT = null;
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
     * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #getTemplateName()
     */
    protected String templateName = TEMPLATE_NAME_EDEFAULT;

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
    protected RoomExtraTemplateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected EClass eStaticClass() {
        return ModelPackage.Literals.ROOM_EXTRA_TEMPLATE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_EXTRA_TEMPLATE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public void setTemplateName(String newTemplateName) {
        String oldTemplateName = templateName;
        templateName = newTemplateName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME, oldTemplateName, templateName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public EList getRoomExtra() {
        if (roomExtra == null) {
            roomExtra = new EObjectResolvingEList(RoomExtra.class, this, ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA);
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
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ID:
                return getId();
            case ModelPackage.ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME:
                return getTemplateName();
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA:
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
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ID:
                setId((String) newValue);
                return;
            case ModelPackage.ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME:
                setTemplateName((String) newValue);
                return;
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA:
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
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ID:
                setId(ID_EDEFAULT);
                return;
            case ModelPackage.ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME:
                setTemplateName(TEMPLATE_NAME_EDEFAULT);
                return;
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA:
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
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case ModelPackage.ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME:
                return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
            case ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA:
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
        result.append(", templateName: ");
        result.append(templateName);
        result.append(')');
        return result.toString();
    }

} //RoomExtraTemplateImpl
