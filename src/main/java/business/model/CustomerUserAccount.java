/**
 */
package business.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer User Account</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.CustomerUserAccount#getCustomer <em>Customer</em>}</li>
 * <li>{@link business.model.CustomerUserAccount#getUserGroupEnum <em>User Group Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getCustomerUserAccount()
 */
public interface CustomerUserAccount extends UserAccount {
    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Customer</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setCustomer(Customer)
     * @see business.model.ModelPackage#getCustomerUserAccount_Customer()
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link business.model.CustomerUserAccount#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Customer</em>' reference.
     * @generated
     * @see #getCustomer()
     */
    void setCustomer(Customer value);

    /**
     * Returns the value of the '<em><b>User Group Enum</b></em>' attribute.
     * The literals are from the enumeration {@link business.model.UserGroupEnum}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>User Group Enum</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>User Group Enum</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see business.model.UserGroupEnum
     * @see #setUserGroupEnum(UserGroupEnum)
     * @see business.model.ModelPackage#getCustomerUserAccount_UserGroupEnum()
     */
    UserGroupEnum getUserGroupEnum();

    /**
     * Sets the value of the '{@link business.model.CustomerUserAccount#getUserGroupEnum <em>User Group Enum</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>User Group Enum</em>' attribute.
     * @generated
     * @see business.model.UserGroupEnum
     * @see #getUserGroupEnum()
     */
    void setUserGroupEnum(UserGroupEnum value);

} // CustomerUserAccount
