/**
 */
package business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.Address#getId <em>Id</em>}</li>
 * <li>{@link business.model.Address#getAddressLine1 <em>Address Line1</em>}</li>
 * <li>{@link business.model.Address#getAddressLine2 <em>Address Line2</em>}</li>
 * <li>{@link business.model.Address#getZipCode <em>Zip Code</em>}</li>
 * <li>{@link business.model.Address#getCity <em>City</em>}</li>
 * <li>{@link business.model.Address#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getAddress()
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
     *
     * @return the value of the '<em>Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setId(String)
     * @see business.model.ModelPackage#getAddress_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.Address#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
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
     *
     * @return the value of the '<em>Address Line1</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setAddressLine1(String)
     * @see business.model.ModelPackage#getAddress_AddressLine1()
     */
    String getAddressLine1();

    /**
     * Sets the value of the '{@link business.model.Address#getAddressLine1 <em>Address Line1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Address Line1</em>' attribute.
     * @generated
     * @see #getAddressLine1()
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
     *
     * @return the value of the '<em>Address Line2</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setAddressLine2(String)
     * @see business.model.ModelPackage#getAddress_AddressLine2()
     */
    String getAddressLine2();

    /**
     * Sets the value of the '{@link business.model.Address#getAddressLine2 <em>Address Line2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Address Line2</em>' attribute.
     * @generated
     * @see #getAddressLine2()
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
     *
     * @return the value of the '<em>Zip Code</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setZipCode(String)
     * @see business.model.ModelPackage#getAddress_ZipCode()
     */
    String getZipCode();

    /**
     * Sets the value of the '{@link business.model.Address#getZipCode <em>Zip Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Zip Code</em>' attribute.
     * @generated
     * @see #getZipCode()
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
     *
     * @return the value of the '<em>City</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setCity(String)
     * @see business.model.ModelPackage#getAddress_City()
     */
    String getCity();

    /**
     * Sets the value of the '{@link business.model.Address#getCity <em>City</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>City</em>' attribute.
     * @generated
     * @see #getCity()
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
     *
     * @return the value of the '<em>Country</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setCountry(String)
     * @see business.model.ModelPackage#getAddress_Country()
     */
    String getCountry();

    /**
     * Sets the value of the '{@link business.model.Address#getCountry <em>Country</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Country</em>' attribute.
     * @generated
     * @see #getCountry()
     */
    void setCountry(String value);

} // Address
