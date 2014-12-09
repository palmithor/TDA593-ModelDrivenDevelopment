/**
 */
package business.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Information</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.CardInformation#getId <em>Id</em>}</li>
 * <li>{@link business.model.CardInformation#getCardNumber <em>Card Number</em>}</li>
 * <li>{@link business.model.CardInformation#getCardHolderName <em>Card Holder Name</em>}</li>
 * <li>{@link business.model.CardInformation#getExpirationDate <em>Expiration Date</em>}</li>
 * <li>{@link business.model.CardInformation#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getCardInformation()
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
     *
     * @return the value of the '<em>Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setId(String)
     * @see business.model.ModelPackage#getCardInformation_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.CardInformation#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Card Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Card Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Card Number</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setCardNumber(String)
     * @see business.model.ModelPackage#getCardInformation_CardNumber()
     */
    String getCardNumber();

    /**
     * Sets the value of the '{@link business.model.CardInformation#getCardNumber <em>Card Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Card Number</em>' attribute.
     * @generated
     * @see #getCardNumber()
     */
    void setCardNumber(String value);

    /**
     * Returns the value of the '<em><b>Card Holder Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Card Holder Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Card Holder Name</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setCardHolderName(String)
     * @see business.model.ModelPackage#getCardInformation_CardHolderName()
     */
    String getCardHolderName();

    /**
     * Sets the value of the '{@link business.model.CardInformation#getCardHolderName <em>Card Holder Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Card Holder Name</em>' attribute.
     * @generated
     * @see #getCardHolderName()
     */
    void setCardHolderName(String value);

    /**
     * Returns the value of the '<em><b>Expiration Date</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expiration Date</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Expiration Date</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setExpirationDate(Date)
     * @see business.model.ModelPackage#getCardInformation_ExpirationDate()
     */
    Date getExpirationDate();

    /**
     * Sets the value of the '{@link business.model.CardInformation#getExpirationDate <em>Expiration Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Expiration Date</em>' attribute.
     * @generated
     * @see #getExpirationDate()
     */
    void setExpirationDate(Date value);

    /**
     * Returns the value of the '<em><b>Address</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Address</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Address</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setAddress(Address)
     * @see business.model.ModelPackage#getCardInformation_Address()
     */
    Address getAddress();

    /**
     * Sets the value of the '{@link business.model.CardInformation#getAddress <em>Address</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Address</em>' reference.
     * @generated
     * @see #getAddress()
     */
    void setAddress(Address value);

} // CardInformation
