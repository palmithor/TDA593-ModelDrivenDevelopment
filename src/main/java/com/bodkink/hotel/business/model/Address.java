/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.Address#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Address#getAddressLine1 <em>Address Line1</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Address#getAddressLine2 <em>Address Line2</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Address#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Address#getCity <em>City</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Address#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress()
 * @model
 * @generated
 */
public interface Address extends EObject {
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
	 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Address#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Address Line1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Line1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Line1</em>' attribute.
	 * @see #setAddressLine1(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress_AddressLine1()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddressLine1();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Address#getAddressLine1 <em>Address Line1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Line1</em>' attribute.
	 * @see #getAddressLine1()
	 * @generated
	 */
	void setAddressLine1(String value);

	/**
	 * Returns the value of the '<em><b>Address Line2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address Line2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Line2</em>' attribute.
	 * @see #setAddressLine2(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress_AddressLine2()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddressLine2();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Address#getAddressLine2 <em>Address Line2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Line2</em>' attribute.
	 * @see #getAddressLine2()
	 * @generated
	 */
	void setAddressLine2(String value);

	/**
	 * Returns the value of the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zip Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zip Code</em>' attribute.
	 * @see #setZipCode(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress_ZipCode()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getZipCode();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Address#getZipCode <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zip Code</em>' attribute.
	 * @see #getZipCode()
	 * @generated
	 */
	void setZipCode(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress_City()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Address#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Country</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getAddress_Country()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Address#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

} // Address
