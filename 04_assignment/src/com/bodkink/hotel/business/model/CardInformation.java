/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getCcNumber <em>Cc Number</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getCcv <em>Ccv</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getExpiryMonth <em>Expiry Month</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getExpiryYear <em>Expiry Year</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CardInformation#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation()
 * @model
 * @generated
 */
public interface CardInformation extends EObject {
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
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cc Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc Number</em>' attribute.
	 * @see #setCcNumber(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_CcNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcNumber();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getCcNumber <em>Cc Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc Number</em>' attribute.
	 * @see #getCcNumber()
	 * @generated
	 */
	void setCcNumber(String value);

	/**
	 * Returns the value of the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ccv</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ccv</em>' attribute.
	 * @see #setCcv(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_Ccv()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCcv();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getCcv <em>Ccv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ccv</em>' attribute.
	 * @see #getCcv()
	 * @generated
	 */
	void setCcv(String value);

	/**
	 * Returns the value of the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Month</em>' attribute.
	 * @see #setExpiryMonth(int)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_ExpiryMonth()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpiryMonth();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getExpiryMonth <em>Expiry Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Month</em>' attribute.
	 * @see #getExpiryMonth()
	 * @generated
	 */
	void setExpiryMonth(int value);

	/**
	 * Returns the value of the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expiry Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiry Year</em>' attribute.
	 * @see #setExpiryYear(int)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_ExpiryYear()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExpiryYear();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getExpiryYear <em>Expiry Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiry Year</em>' attribute.
	 * @see #getExpiryYear()
	 * @generated
	 */
	void setExpiryYear(int value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_FirstName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_LastName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCardInformation_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CardInformation#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // CardInformation
