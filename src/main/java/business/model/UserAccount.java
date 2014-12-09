/**
 */
package business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Account</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.UserAccount#getId <em>Id</em>}</li>
 * <li>{@link business.model.UserAccount#getUsername <em>Username</em>}</li>
 * <li>{@link business.model.UserAccount#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getUserAccount()
 */
public interface UserAccount extends EObject {
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
     * @see business.model.ModelPackage#getUserAccount_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.UserAccount#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Username</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Username</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setUsername(String)
     * @see business.model.ModelPackage#getUserAccount_Username()
     */
    String getUsername();

    /**
     * Sets the value of the '{@link business.model.UserAccount#getUsername <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Username</em>' attribute.
     * @generated
     * @see #getUsername()
     */
    void setUsername(String value);

    /**
     * Returns the value of the '<em><b>Password</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Password</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Password</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setPassword(String)
     * @see business.model.ModelPackage#getUserAccount_Password()
     */
    String getPassword();

    /**
     * Sets the value of the '{@link business.model.UserAccount#getPassword <em>Password</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Password</em>' attribute.
     * @generated
     * @see #getPassword()
     */
    void setPassword(String value);

} // UserAccount
