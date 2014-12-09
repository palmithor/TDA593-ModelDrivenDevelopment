/**
 */
package business.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link business.model.RoomBill#getBillableItem <em>Billable Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see business.model.ModelPackage#getRoomBill()
 * @model
 * @generated
 */
public interface RoomBill extends Bill {
	/**
	 * Returns the value of the '<em><b>Billable Item</b></em>' reference list.
	 * The list contents are of type {@link business.model.BillableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billable Item</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billable Item</em>' reference list.
	 * @see business.model.ModelPackage#getRoomBill_BillableItem()
	 * @model type="business.model.BillableItem" ordered="false"
	 * @generated
	 */
	EList getBillableItem();

} // RoomBill
