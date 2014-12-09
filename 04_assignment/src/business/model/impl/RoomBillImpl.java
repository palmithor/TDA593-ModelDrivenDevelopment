/**
 */
package business.model.impl;

import business.model.BillableItem;
import business.model.ModelPackage;
import business.model.RoomBill;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link business.model.impl.RoomBillImpl#getBillableItem <em>Billable Item</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomBillImpl extends BillImpl implements RoomBill {
	/**
	 * The cached value of the '{@link #getBillableItem() <em>Billable Item</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillableItem()
	 * @generated
	 * @ordered
	 */
	protected EList billableItem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomBillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return ModelPackage.Literals.ROOM_BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBillableItem() {
		if (billableItem == null) {
			billableItem = new EObjectResolvingEList(BillableItem.class, this, ModelPackage.ROOM_BILL__BILLABLE_ITEM);
		}
		return billableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.ROOM_BILL__BILLABLE_ITEM:
				return getBillableItem();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.ROOM_BILL__BILLABLE_ITEM:
				getBillableItem().clear();
				getBillableItem().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.ROOM_BILL__BILLABLE_ITEM:
				getBillableItem().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.ROOM_BILL__BILLABLE_ITEM:
				return billableItem != null && !billableItem.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoomBillImpl
