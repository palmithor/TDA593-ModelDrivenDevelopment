/**
 */
package business.model;

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
 *   <li>{@link business.model.Receipt#getReceiptItem <em>Receipt Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see business.model.ModelPackage#getReceipt()
 * @model
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * Returns the value of the '<em><b>Receipt Item</b></em>' reference list.
	 * The list contents are of type {@link business.model.ReceiptItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Item</em>' reference list.
	 * @see business.model.ModelPackage#getReceipt_ReceiptItem()
	 * @model type="business.model.ReceiptItem" ordered="false"
	 * @generated
	 */
	EList getReceiptItem();

} // Receipt
