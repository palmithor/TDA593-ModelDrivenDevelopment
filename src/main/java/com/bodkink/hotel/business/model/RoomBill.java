/**
 */
package com.bodkink.hotel.business.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.RoomBill#getBillableItem <em>Billable Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomBill()
 * @model
 * @generated
 */
public interface RoomBill extends Bill {
	/**
	 * Returns the value of the '<em><b>Billable Item</b></em>' reference listByDate.
	 * The listByDate contents are of type {@link com.bodkink.hotel.business.model.BillableItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billable Item</em>' reference listByDate isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billable Item</em>' reference listByDate.
	 * @see com.bodkink.hotel.business.model.ModelPackage#getRoomBill_BillableItem()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BillableItem> getBillableItem();

} // RoomBill
