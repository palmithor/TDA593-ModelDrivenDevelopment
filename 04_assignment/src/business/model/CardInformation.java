/**
 */
package business.model;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link business.model.CardInformation#getId <em>Id</em>}</li>
 *   <li>{@link business.model.CardInformation#getCardNumber <em>Card Number</em>}</li>
 *   <li>{@link business.model.CardInformation#getCardHolderName <em>Card Holder Name</em>}</li>
 *   <li>{@link business.model.CardInformation#getExpirationDate <em>Expiration Date</em>}</li>
 *   <li>{@link business.model.CardInformation#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see business.model.ModelPackage#getCardInformation()
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
	 * @see business.model.ModelPackage#getCardInformation_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link business.model.CardInformation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
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
	 * @return the value of the '<em>Card Number</em>' attribute.
	 * @see #setCardNumber(String)
	 * @see business.model.ModelPackage#getCardInformation_CardNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCardNumber();

	/**
	 * Sets the value of the '{@link business.model.CardInformation#getCardNumber <em>Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Number</em>' attribute.
	 * @see #getCardNumber()
	 * @generated
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
	 * @return the value of the '<em>Card Holder Name</em>' attribute.
	 * @see #setCardHolderName(String)
	 * @see business.model.ModelPackage#getCardInformation_CardHolderName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCardHolderName();

	/**
	 * Sets the value of the '{@link business.model.CardInformation#getCardHolderName <em>Card Holder Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Holder Name</em>' attribute.
	 * @see #getCardHolderName()
	 * @generated
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
	 * @return the value of the '<em>Expiration Date</em>' attribute.
	 * @see #setExpirationDate(Date)
	 * @see business.model.ModelPackage#getCardInformation_ExpirationDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getExpirationDate();

	/**
	 * Sets the value of the '{@link business.model.CardInformation#getExpirationDate <em>Expiration Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date</em>' attribute.
	 * @see #getExpirationDate()
	 * @generated
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
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see business.model.ModelPackage#getCardInformation_Address()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link business.model.CardInformation#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // CardInformation
