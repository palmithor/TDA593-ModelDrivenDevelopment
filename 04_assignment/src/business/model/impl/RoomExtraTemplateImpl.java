/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.ModelPackage;
import com.bodkink.hotel.business.model.RoomExtra;
import com.bodkink.hotel.business.model.RoomExtraTemplate;

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
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomExtraTemplateImpl#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.RoomExtraTemplateImpl#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomExtraTemplateImpl extends MinimalEObjectImpl.Container implements RoomExtraTemplate {
	/**
	 * The default value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String templateName = TEMPLATE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomExtra() <em>Room Extra</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomExtra()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomExtra> roomExtra;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomExtraTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_EXTRA_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @generated
	 */
	public EList<RoomExtra> getRoomExtra() {
		if (roomExtra == null) {
			roomExtra = new EObjectResolvingEList<RoomExtra>(RoomExtra.class, this, ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA);
		}
		return roomExtra;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ROOM_EXTRA_TEMPLATE__TEMPLATE_NAME:
				setTemplateName((String)newValue);
				return;
			case ModelPackage.ROOM_EXTRA_TEMPLATE__ROOM_EXTRA:
				getRoomExtra().clear();
				getRoomExtra().addAll((Collection<? extends RoomExtra>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
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
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
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
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (templateName: ");
		result.append(templateName);
		result.append(')');
		return result.toString();
	}

} //RoomExtraTemplateImpl
