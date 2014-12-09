/**
 */
package business.model;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Billable Item</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.BillableItem#getId <em>Id</em>}</li>
 * <li>{@link business.model.BillableItem#getName <em>Name</em>}</li>
 * <li>{@link business.model.BillableItem#getPrice <em>Price</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getBillableItem()
 */
public interface BillableItem extends EObject {
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
     * @see business.model.ModelPackage#getBillableItem_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.BillableItem#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setName(String)
     * @see business.model.ModelPackage#getBillableItem_Name()
     */
    String getName();

    /**
     * Sets the value of the '{@link business.model.BillableItem#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Name</em>' attribute.
     * @generated
     * @see #getName()
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Price</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Price</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Price</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setPrice(BigDecimal)
     * @see business.model.ModelPackage#getBillableItem_Price()
     */
    BigDecimal getPrice();

    /**
     * Sets the value of the '{@link business.model.BillableItem#getPrice <em>Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Price</em>' attribute.
     * @generated
     * @see #getPrice()
     */
    void setPrice(BigDecimal value);

} // BillableItem
