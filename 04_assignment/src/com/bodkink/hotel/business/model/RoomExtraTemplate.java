/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Extra Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomExtraTemplate()
 * @model
 * @generated
 */
public interface RoomExtraTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomExtraTemplate_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' attribute.
	 * @see #setTemplateName(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomExtraTemplate_TemplateName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTemplateName();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.RoomExtraTemplate#getTemplateName <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' attribute.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Room Extra</b></em>' reference listByDate.
	 * The listByDate contents are of type {@link com.bodkink.hotel.business.model.RoomExtra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Extra</em>' reference listByDate isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Extra</em>' reference listByDate.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomExtraTemplate_RoomExtra()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomExtra> getRoomExtra();

} // RoomExtraTemplate
