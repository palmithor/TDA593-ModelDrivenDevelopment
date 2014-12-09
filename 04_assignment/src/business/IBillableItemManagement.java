/**
 */
package business;

import business.model.BillableItem;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBillable Item Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see business.BusinessPackage#getIBillableItemManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IBillableItemManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	BillableItem createBillableItem(String name, BigDecimal price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billableItemRequired="true" billableItemOrdered="false"
	 * @generated
	 */
	BillableItem editBillableItem(BillableItem billableItem);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemsRequired="true" itemsOrdered="false"
	 * @generated
	 */
	void listBillableItems(BillableItem items);

} // IBillableItemManagement
