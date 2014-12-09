/**
 */
package business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.Person#getFirstName <em>First Name</em>}</li>
 * <li>{@link business.model.Person#getSurname <em>Surname</em>}</li>
 * <li>{@link business.model.Person#getBirthYear <em>Birth Year</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getPerson()
 */
public interface Person extends EObject {
    /**
     * Returns the value of the '<em><b>First Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>First Name</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setFirstName(String)
     * @see business.model.ModelPackage#getPerson_FirstName()
     */
    String getFirstName();

    /**
     * Sets the value of the '{@link business.model.Person#getFirstName <em>First Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>First Name</em>' attribute.
     * @generated
     * @see #getFirstName()
     */
    void setFirstName(String value);

    /**
     * Returns the value of the '<em><b>Surname</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Surname</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Surname</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setSurname(String)
     * @see business.model.ModelPackage#getPerson_Surname()
     */
    String getSurname();

    /**
     * Sets the value of the '{@link business.model.Person#getSurname <em>Surname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Surname</em>' attribute.
     * @generated
     * @see #getSurname()
     */
    void setSurname(String value);

    /**
     * Returns the value of the '<em><b>Birth Year</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Birth Year</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Birth Year</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
     * @generated
     * @see #setBirthYear(int)
     * @see business.model.ModelPackage#getPerson_BirthYear()
     */
    int getBirthYear();

    /**
     * Sets the value of the '{@link business.model.Person#getBirthYear <em>Birth Year</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Birth Year</em>' attribute.
     * @generated
     * @see #getBirthYear()
     */
    void setBirthYear(int value);

} // Person
