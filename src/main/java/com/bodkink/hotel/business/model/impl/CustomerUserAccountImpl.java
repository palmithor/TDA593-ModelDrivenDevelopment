/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.CustomerUserAccount;
import com.bodkink.hotel.business.model.ModelPackage;
import com.bodkink.hotel.business.model.UserGroupEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer User Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.impl.CustomerUserAccountImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.CustomerUserAccountImpl#getUserGroupEnum <em>User Group Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerUserAccountImpl extends UserAccountImpl implements CustomerUserAccount {
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The default value of the '{@link #getUserGroupEnum() <em>User Group Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserGroupEnum()
	 * @generated
	 * @ordered
	 */
	protected static final UserGroupEnum USER_GROUP_ENUM_EDEFAULT = UserGroupEnum.ADMIN;

	/**
	 * The cached value of the '{@link #getUserGroupEnum() <em>User Group Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserGroupEnum()
	 * @generated
	 * @ordered
	 */
	protected UserGroupEnum userGroupEnum = USER_GROUP_ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerUserAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CUSTOMER_USER_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject)customer;
			customer = (Customer)eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.CUSTOMER_USER_ACCOUNT__CUSTOMER, oldCustomer, customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER_USER_ACCOUNT__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroupEnum getUserGroupEnum() {
		return userGroupEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserGroupEnum(UserGroupEnum newUserGroupEnum) {
		UserGroupEnum oldUserGroupEnum = userGroupEnum;
		userGroupEnum = newUserGroupEnum == null ? USER_GROUP_ENUM_EDEFAULT : newUserGroupEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM, oldUserGroupEnum, userGroupEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CUSTOMER_USER_ACCOUNT__CUSTOMER:
				if (resolve) return getCustomer();
				return basicGetCustomer();
			case ModelPackage.CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM:
				return getUserGroupEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.CUSTOMER_USER_ACCOUNT__CUSTOMER:
				setCustomer((Customer)newValue);
				return;
			case ModelPackage.CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM:
				setUserGroupEnum((UserGroupEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.CUSTOMER_USER_ACCOUNT__CUSTOMER:
				setCustomer((Customer)null);
				return;
			case ModelPackage.CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM:
				setUserGroupEnum(USER_GROUP_ENUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.CUSTOMER_USER_ACCOUNT__CUSTOMER:
				return customer != null;
			case ModelPackage.CUSTOMER_USER_ACCOUNT__USER_GROUP_ENUM:
				return userGroupEnum != USER_GROUP_ENUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (userGroupEnum: ");
		result.append(userGroupEnum);
		result.append(')');
		return result.toString();
	}

} //CustomerUserAccountImpl
