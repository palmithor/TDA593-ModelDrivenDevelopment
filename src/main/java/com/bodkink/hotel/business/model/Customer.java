/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.Customer#getPhone <em>Phone</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Customer#getEmail <em>Email</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Customer#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Customer#getCardInformation <em>Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Person {
	/**
	 * Returns the value of the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone</em>' attribute.
	 * @see #setPhone(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomer_Phone()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPhone();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Customer#getPhone <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone</em>' attribute.
	 * @see #getPhone()
	 * @generated
	 */
	void setPhone(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomer_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Customer#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute listByDate.
	 * The listByDate contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute listByDate isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute listByDate.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomer_Notes()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getNotes();

	/**
	 * Returns the value of the '<em><b>Card Information</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Information</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Information</em>' reference.
	 * @see #setCardInformation(CardInformation)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomer_CardInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CardInformation getCardInformation();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Customer#getCardInformation <em>Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Information</em>' reference.
	 * @see #getCardInformation()
	 * @generated
	 */
	void setCardInformation(CardInformation value);

} // Customer
