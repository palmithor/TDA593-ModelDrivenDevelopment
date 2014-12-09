/**
 */
package business.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classification</b></em>'.
 * <!-- end-user-doc -->
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.Classification#getId <em>Id</em>}</li>
 * <li>{@link business.model.Classification#getTitle <em>Title</em>}</li>
 * <li>{@link business.model.Classification#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getClassification()
 */
public interface Classification extends EObject {
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
     * @see business.model.ModelPackage#getClassification_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.Classification#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
     */
    void setId(String value);

    /**
     * Returns the value of the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Title</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Title</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setTitle(String)
     * @see business.model.ModelPackage#getClassification_Title()
     */
    String getTitle();

    /**
     * Sets the value of the '{@link business.model.Classification#getTitle <em>Title</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Title</em>' attribute.
     * @generated
     * @see #getTitle()
     */
    void setTitle(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Description</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setDescription(String)
     * @see business.model.ModelPackage#getClassification_Description()
     */
    String getDescription();

    /**
     * Sets the value of the '{@link business.model.Classification#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Description</em>' attribute.
     * @generated
     * @see #getDescription()
     */
    void setDescription(String value);

} // Classification
