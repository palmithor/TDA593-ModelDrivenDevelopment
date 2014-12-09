/**
 */
package business.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Extra Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link business.model.RoomExtraTemplate#getId <em>Id</em>}</li>
 *   <li>{@link business.model.RoomExtraTemplate#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link business.model.RoomExtraTemplate#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see business.model.ModelPackage#getRoomExtraTemplate()
 * @model
 * @generated
 */
public interface RoomExtraTemplate extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see business.model.ModelPackage#getRoomExtraTemplate_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link business.model.RoomExtraTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Name</em>' attribute.
	 * @see #setTemplateName(String)
	 * @see business.model.ModelPackage#getRoomExtraTemplate_TemplateName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTemplateName();

	/**
	 * Sets the value of the '{@link business.model.RoomExtraTemplate#getTemplateName <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' attribute.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Room Extra</b></em>' reference list.
	 * The list contents are of type {@link business.model.RoomExtra}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Extra</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Extra</em>' reference list.
	 * @see business.model.ModelPackage#getRoomExtraTemplate_RoomExtra()
	 * @model type="business.model.RoomExtra" ordered="false"
	 * @generated
	 */
	EList getRoomExtra();

} // RoomExtraTemplate
