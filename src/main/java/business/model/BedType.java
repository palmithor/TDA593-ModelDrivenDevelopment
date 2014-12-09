/**
 */
package business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bed Type</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.BedType#getId <em>Id</em>}</li>
 * <li>{@link business.model.BedType#getName <em>Name</em>}</li>
 * <li>{@link business.model.BedType#getLength <em>Length</em>}</li>
 * <li>{@link business.model.BedType#getWidth <em>Width</em>}</li>
 * <li>{@link business.model.BedType#getPlaces <em>Places</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getBedType()
 */
public interface BedType extends EObject {
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
     * @see business.model.ModelPackage#getBedType_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.BedType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Name</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setName(String)
     * @see business.model.ModelPackage#getBedType_Name()
     */
    String getName();

    /**
     * Sets the value of the '{@link business.model.BedType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Name</em>' attribute.
     * @generated
     * @see #getName()
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Length</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Length</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
     * @generated
     * @see #setLength(int)
     * @see business.model.ModelPackage#getBedType_Length()
     */
    int getLength();

    /**
     * Sets the value of the '{@link business.model.BedType#getLength <em>Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Length</em>' attribute.
     * @generated
     * @see #getLength()
     */
    void setLength(int value);

    /**
     * Returns the value of the '<em><b>Width</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Width</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Width</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
     * @generated
     * @see #setWidth(int)
     * @see business.model.ModelPackage#getBedType_Width()
     */
    int getWidth();

    /**
     * Sets the value of the '{@link business.model.BedType#getWidth <em>Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Width</em>' attribute.
     * @generated
     * @see #getWidth()
     */
    void setWidth(int value);

    /**
     * Returns the value of the '<em><b>Places</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Places</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Places</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
     * @generated
     * @see #setPlaces(int)
     * @see business.model.ModelPackage#getBedType_Places()
     */
    int getPlaces();

    /**
     * Sets the value of the '{@link business.model.BedType#getPlaces <em>Places</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Places</em>' attribute.
     * @generated
     * @see #getPlaces()
     */
    void setPlaces(int value);

} // BedType
