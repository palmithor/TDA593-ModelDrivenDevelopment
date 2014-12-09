/**
 */
package business.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.Customer#getId <em>Id</em>}</li>
 * <li>{@link business.model.Customer#getPhone <em>Phone</em>}</li>
 * <li>{@link business.model.Customer#getEmail <em>Email</em>}</li>
 * <li>{@link business.model.Customer#getNotes <em>Notes</em>}</li>
 * <li>{@link business.model.Customer#getCardInformation <em>Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getCustomer()
 */
public interface Customer extends Person {
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
     * @see business.model.ModelPackage#getCustomer_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.Customer#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Phone</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phone</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Phone</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setPhone(String)
     * @see business.model.ModelPackage#getCustomer_Phone()
     */
    String getPhone();

    /**
     * Sets the value of the '{@link business.model.Customer#getPhone <em>Phone</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Phone</em>' attribute.
     * @generated
     * @see #getPhone()
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
     *
     * @return the value of the '<em>Email</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setEmail(String)
     * @see business.model.ModelPackage#getCustomer_Email()
     */
    String getEmail();

    /**
     * Sets the value of the '{@link business.model.Customer#getEmail <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Email</em>' attribute.
     * @generated
     * @see #getEmail()
     */
    void setEmail(String value);

    /**
     * Returns the value of the '<em><b>Notes</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notes</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Notes</em>' attribute list.
     * @model dataType="org.eclipse.uml2.types.String" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getCustomer_Notes()
     */
    EList getNotes();

    /**
     * Returns the value of the '<em><b>Card Information</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Card Information</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Card Information</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCardInformation(CardInformation)
     * @see business.model.ModelPackage#getCustomer_CardInformation()
     */
    CardInformation getCardInformation();

    /**
     * Sets the value of the '{@link business.model.Customer#getCardInformation <em>Card Information</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Card Information</em>' reference.
     * @generated
     * @see #getCardInformation()
     */
    void setCardInformation(CardInformation value);

} // Customer
