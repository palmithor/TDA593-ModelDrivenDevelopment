/**
 */
package business.model;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link business.model.ReceiptItem#getDescription <em>Description</em>}</li>
 *   <li>{@link business.model.ReceiptItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link business.model.ReceiptItem#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see business.model.ModelPackage#getReceiptItem()
 * @model
 * @generated
 */
public interface ReceiptItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see business.model.ModelPackage#getReceiptItem_Description()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link business.model.ReceiptItem#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(Integer)
	 * @see business.model.ModelPackage#getReceiptItem_Quantity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Integer getQuantity();

	/**
	 * Sets the value of the '{@link business.model.ReceiptItem#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(BigDecimal)
	 * @see business.model.ModelPackage#getReceiptItem_TotalAmount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getTotalAmount();

	/**
	 * Sets the value of the '{@link business.model.ReceiptItem#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(BigDecimal value);

} // ReceiptItem
