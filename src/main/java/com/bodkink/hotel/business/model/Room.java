/**
 */
package com.bodkink.hotel.business.model;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getDescription <em>Description</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getAllowedGuests <em>Allowed Guests</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getSize <em>Size</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getNightPrice <em>Night Price</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getPictures <em>Pictures</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getClassification <em>Classification</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getBedType <em>Bed Type</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Room#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
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
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_Number()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Guests</em>' attribute.
	 * @see #setAllowedGuests(int)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_AllowedGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAllowedGuests();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getAllowedGuests <em>Allowed Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Guests</em>' attribute.
	 * @see #getAllowedGuests()
	 * @generated
	 */
	void setAllowedGuests(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigDecimal)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getSize();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Night Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Night Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Night Price</em>' attribute.
	 * @see #setNightPrice(BigDecimal)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_NightPrice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getNightPrice();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getNightPrice <em>Night Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Night Price</em>' attribute.
	 * @see #getNightPrice()
	 * @generated
	 */
	void setNightPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pictures</b></em>' attribute listByDate.
	 * The listByDate contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pictures</em>' attribute listByDate isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pictures</em>' attribute listByDate.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_Pictures()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getPictures();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' reference.
	 * @see #setClassification(Classification)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_Classification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classification getClassification();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Room#getClassification <em>Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification value);

	/**
	 * Returns the value of the '<em><b>Bed Type</b></em>' reference listByDate.
	 * The listByDate contents are of type {@link com.bodkink.hotel.business.model.BedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bed Type</em>' reference listByDate isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bed Type</em>' reference listByDate.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_BedType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BedType> getBedType();

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
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoom_RoomExtra()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RoomExtra> getRoomExtra();

} // Room
