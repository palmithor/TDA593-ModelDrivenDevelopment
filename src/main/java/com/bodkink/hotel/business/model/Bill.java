/**
 */
package com.bodkink.hotel.business.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.Bill#getBillStatusEnum <em>Bill Status Enum</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.Bill#getCardInformation <em>Card Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends IBill {
	/**
	 * Returns the value of the '<em><b>Bill Status Enum</b></em>' attribute.
	 * The literals are from the enumeration {@link com.bodkink.hotel.business.model.BillStatusEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill Status Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill Status Enum</em>' attribute.
	 * @see com.bodkink.hotel.business.model.BillStatusEnum
	 * @see #setBillStatusEnum(BillStatusEnum)
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBill_BillStatusEnum()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BillStatusEnum getBillStatusEnum();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Bill#getBillStatusEnum <em>Bill Status Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bill Status Enum</em>' attribute.
	 * @see com.bodkink.hotel.business.model.BillStatusEnum
	 * @see #getBillStatusEnum()
	 * @generated
	 */
	void setBillStatusEnum(BillStatusEnum value);

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
	 * @see com.bodkink.hotel.business.model.ModelPackage#getBill_CardInformation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CardInformation getCardInformation();

	/**
	 * Sets the value of the '{@link com.bodkink.hotel.business.model.Bill#getCardInformation <em>Card Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Information</em>' reference.
	 * @see #getCardInformation()
	 * @generated
	 */
	void setCardInformation(CardInformation value);

} // Bill
