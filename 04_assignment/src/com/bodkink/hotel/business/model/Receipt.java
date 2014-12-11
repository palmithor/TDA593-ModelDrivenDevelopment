/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.Receipt#getReceiptItem <em>Receipt Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * Returns the value of the '<em><b>Receipt Item</b></em>' reference list.
	 * The list contents are of type {@link com.bodkink.hotel.business.model.ReceiptItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Item</em>' reference list.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getReceipt_ReceiptItem()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReceiptItem> getReceiptItem();

} // Receipt
