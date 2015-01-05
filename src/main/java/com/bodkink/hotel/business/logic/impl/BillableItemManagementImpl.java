/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.BillableItemManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.BillableItem;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.util.List;

import com.bodkink.hotel.business.model.ModelFactory;
import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IBillableItemService;
import com.bodkink.hotel.persistence.model.BillableItemEntity;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Billable Item Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class BillableItemManagementImpl extends MinimalEObjectImpl.Container implements BillableItemManagement {

	@Inject
	public IBillableItemService billableItemService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillableItemManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.BILLABLE_ITEM_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BillableItem createBillableItem(String name, BigDecimal price) {

		BillableItem billableItem = ModelFactory.eINSTANCE.createBillableItem();
		billableItem.setName(name);
		billableItem.setPrice(price);

		BillableItemEntity billableItemEntity = ModelToEntityConverter.convertBillableItem(billableItem);
		billableItemService.persist(billableItemEntity);

		return billableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BillableItem editBillableItem(BillableItem billableItem) {
		BillableItemEntity billableItemEntity = ModelToEntityConverter.convertBillableItem(billableItem);
		billableItemService.edit(billableItemEntity);
		return billableItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<BillableItem> listBillableItems() {
		List<BillableItemEntity> billableItemEntityList = billableItemService.listAll();
		EList<BillableItem> billableItems = new BasicEList<>(billableItemEntityList.size());
		billableItemEntityList.forEach(entity -> {
			billableItems.add(EntityToModelConverter.convertBillableItem(entity));
		});
		return billableItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT___CREATE_BILLABLE_ITEM__STRING_BIGDECIMAL:
				return createBillableItem((String)arguments.get(0), (BigDecimal)arguments.get(1));
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT___EDIT_BILLABLE_ITEM__BILLABLEITEM:
				return editBillableItem((BillableItem)arguments.get(0));
			case LogicPackage.BILLABLE_ITEM_MANAGEMENT___LIST_BILLABLE_ITEMS:
				return listBillableItems();
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillableItemManagementImpl
