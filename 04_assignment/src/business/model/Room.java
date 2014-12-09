/**
 */
package business.model;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link business.model.Room#getId <em>Id</em>}</li>
 *   <li>{@link business.model.Room#getNumber <em>Number</em>}</li>
 *   <li>{@link business.model.Room#getDescription <em>Description</em>}</li>
 *   <li>{@link business.model.Room#getAllowedGuests <em>Allowed Guests</em>}</li>
 *   <li>{@link business.model.Room#getSize <em>Size</em>}</li>
 *   <li>{@link business.model.Room#getNightPrice <em>Night Price</em>}</li>
 *   <li>{@link business.model.Room#getPictures <em>Pictures</em>}</li>
 *   <li>{@link business.model.Room#getClassification <em>Classification</em>}</li>
 *   <li>{@link business.model.Room#getBedType <em>Bed Type</em>}</li>
 *   <li>{@link business.model.Room#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see business.model.ModelPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends EObject {
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
	 * @see business.model.ModelPackage#getRoom_Id()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link business.model.Room#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see business.model.ModelPackage#getRoom_Number()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link business.model.Room#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see business.model.ModelPackage#getRoom_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link business.model.Room#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Allowed Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Guests</em>' attribute.
	 * @see #setAllowedGuests(int)
	 * @see business.model.ModelPackage#getRoom_AllowedGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getAllowedGuests();

	/**
	 * Sets the value of the '{@link business.model.Room#getAllowedGuests <em>Allowed Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Guests</em>' attribute.
	 * @see #getAllowedGuests()
	 * @generated
	 */
	void setAllowedGuests(int value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(BigDecimal)
	 * @see business.model.ModelPackage#getRoom_Size()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getSize();

	/**
	 * Sets the value of the '{@link business.model.Room#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Night Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Night Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Night Price</em>' attribute.
	 * @see #setNightPrice(BigDecimal)
	 * @see business.model.ModelPackage#getRoom_NightPrice()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigDecimal getNightPrice();

	/**
	 * Sets the value of the '{@link business.model.Room#getNightPrice <em>Night Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Night Price</em>' attribute.
	 * @see #getNightPrice()
	 * @generated
	 */
	void setNightPrice(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Pictures</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pictures</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pictures</em>' attribute list.
	 * @see business.model.ModelPackage#getRoom_Pictures()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList getPictures();

	/**
	 * Returns the value of the '<em><b>Classification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classification</em>' reference.
	 * @see #setClassification(Classification)
	 * @see business.model.ModelPackage#getRoom_Classification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classification getClassification();

	/**
	 * Sets the value of the '{@link business.model.Room#getClassification <em>Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classification</em>' reference.
	 * @see #getClassification()
	 * @generated
	 */
	void setClassification(Classification value);

	/**
	 * Returns the value of the '<em><b>Bed Type</b></em>' reference list.
	 * The list contents are of type {@link business.model.BedType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bed Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bed Type</em>' reference list.
	 * @see business.model.ModelPackage#getRoom_BedType()
	 * @model type="business.model.BedType" ordered="false"
	 * @generated
	 */
	EList getBedType();

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
	 * @see business.model.ModelPackage#getRoom_RoomExtra()
	 * @model type="business.model.RoomExtra" ordered="false"
	 * @generated
	 */
	EList getRoomExtra();

} // Room
