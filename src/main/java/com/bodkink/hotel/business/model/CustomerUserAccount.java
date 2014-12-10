/**
 */
package com.bodkink.hotel.business.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer User Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.CustomerUserAccount#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.CustomerUserAccount#getUserGroupEnum <em>User Group Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomerUserAccount()
 * @model
 * @generated
 */
public interface CustomerUserAccount extends UserAccount {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomerUserAccount_Customer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CustomerUserAccount#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>User Group Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link com.bodkink.hotel.business.model.UserGroupEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Group Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Group Enum</em>' attribute.
	 * @see com.bodkink.hotel.business.model.UserGroupEnum
	 * @see #setUserGroupEnum(UserGroupEnum)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getCustomerUserAccount_UserGroupEnum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserGroupEnum getUserGroupEnum();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.CustomerUserAccount#getUserGroupEnum <em>User Group Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Group Enum</em>' attribute.
	 * @see com.bodkink.hotel.business.model.UserGroupEnum
	 * @see #getUserGroupEnum()
	 * @generated
	 */
	void setUserGroupEnum(UserGroupEnum value);

} // CustomerUserAccount
