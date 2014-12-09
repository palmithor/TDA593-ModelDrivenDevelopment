/**
 */
package business.model;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt Item</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.ReceiptItem#getDescription <em>Description</em>}</li>
 * <li>{@link business.model.ReceiptItem#getQuantity <em>Quantity</em>}</li>
 * <li>{@link business.model.ReceiptItem#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getReceiptItem()
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
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setDescription(String)
     * @see business.model.ModelPackage#getReceiptItem_Description()
     */
    String getDescription();

    /**
     * Sets the value of the '{@link business.model.ReceiptItem#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Description</em>' attribute.
     * @generated
     * @see #getDescription()
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
     *
     * @return the value of the '<em>Quantity</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setQuantity(Integer)
     * @see business.model.ModelPackage#getReceiptItem_Quantity()
     */
    Integer getQuantity();

    /**
     * Sets the value of the '{@link business.model.ReceiptItem#getQuantity <em>Quantity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Quantity</em>' attribute.
     * @generated
     * @see #getQuantity()
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
     *
     * @return the value of the '<em>Total Amount</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setTotalAmount(BigDecimal)
     * @see business.model.ModelPackage#getReceiptItem_TotalAmount()
     */
    BigDecimal getTotalAmount();

    /**
     * Sets the value of the '{@link business.model.ReceiptItem#getTotalAmount <em>Total Amount</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Total Amount</em>' attribute.
     * @generated
     * @see #getTotalAmount()
     */
    void setTotalAmount(BigDecimal value);

} // ReceiptItem
