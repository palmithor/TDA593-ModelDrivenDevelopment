/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.AccountManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.Customer;
import com.bodkink.hotel.business.model.UserAccount;
import com.bodkink.hotel.business.model.UserGroupEnum;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AccountManagementImpl extends MinimalEObjectImpl.Container implements AccountManagement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.ACCOUNT_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCustomerAccount(String username, String password, Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createEmployeeAccount(String username, String password, UserGroupEnum userGroup) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAccount editUserAccount(UserAccount userAccount) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void login(String username, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoggedIn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.ACCOUNT_MANAGEMENT___CREATE_CUSTOMER_ACCOUNT__STRING_STRING_CUSTOMER:
				createCustomerAccount((String)arguments.get(0), (String)arguments.get(1), (Customer)arguments.get(2));
				return null;
			case LogicPackage.ACCOUNT_MANAGEMENT___CREATE_EMPLOYEE_ACCOUNT__STRING_STRING_USERGROUPENUM:
				createEmployeeAccount((String)arguments.get(0), (String)arguments.get(1), (UserGroupEnum)arguments.get(2));
				return null;
			case LogicPackage.ACCOUNT_MANAGEMENT___EDIT_USER_ACCOUNT__USERACCOUNT:
				return editUserAccount((UserAccount)arguments.get(0));
			case LogicPackage.ACCOUNT_MANAGEMENT___LOGIN__STRING_STRING:
				login((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case LogicPackage.ACCOUNT_MANAGEMENT___IS_LOGGED_IN:
				return isLoggedIn();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AccountManagementImpl
