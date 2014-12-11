/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.CardInformation;
import com.bodkink.hotel.business.model.Customer;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICustomer Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getICustomerManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ICustomerManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" firstNameRequired="true" firstNameOrdered="false" lastNameRequired="true" lastNameOrdered="false" phoneRequired="true" phoneOrdered="false" emailRequired="true" emailOrdered="false" birthYearRequired="true" birthYearOrdered="false" cardInformationRequired="true" cardInformationOrdered="false"
	 * @generated
	 */
	Customer createCustomer(String firstName, String lastName, String phone, String email, int birthYear, CardInformation cardInformation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	Customer editCustomer(Customer customer);

} // ICustomerManagement
