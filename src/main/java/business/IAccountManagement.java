/**
 */
package business;

import business.model.Customer;
import business.model.UserAccount;
import business.model.UserGroupEnum;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAccount Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see business.BusinessPackage#getIAccountManagement()
 */
public interface IAccountManagement extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model usernameRequired="true" usernameOrdered="false" passwordRequired="true" passwordOrdered="false" customerRequired="true" customerOrdered="false"
     * @generated
     */
    void createCustomerAccount(String username, String password, Customer customer);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" usernameRequired="true" usernameOrdered="false" passwordRequired="true" passwordOrdered="false" userGroupRequired="true" userGroupOrdered="false"
     * @generated
     */
    UserAccount createEmployeeAccount(String username, String password, UserGroupEnum userGroup);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" userAccountRequired="true" userAccountOrdered="false"
     * @generated
     */
    UserAccount editUserAccount(UserAccount userAccount);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model usernameRequired="true" usernameOrdered="false" passwordRequired="true" passwordOrdered="false"
     * @generated
     */
    void login(String username, String password);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model kind="operation" required="true" ordered="false"
     * @generated
     */
    boolean isLoggedIn();

} // IAccountManagement
