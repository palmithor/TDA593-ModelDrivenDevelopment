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
 * <p/>
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link business.model.Room#getId <em>Id</em>}</li>
 * <li>{@link business.model.Room#getNumber <em>Number</em>}</li>
 * <li>{@link business.model.Room#getDescription <em>Description</em>}</li>
 * <li>{@link business.model.Room#getAllowedGuests <em>Allowed Guests</em>}</li>
 * <li>{@link business.model.Room#getSize <em>Size</em>}</li>
 * <li>{@link business.model.Room#getNightPrice <em>Night Price</em>}</li>
 * <li>{@link business.model.Room#getPictures <em>Pictures</em>}</li>
 * <li>{@link business.model.Room#getClassification <em>Classification</em>}</li>
 * <li>{@link business.model.Room#getBedType <em>Bed Type</em>}</li>
 * <li>{@link business.model.Room#getRoomExtra <em>Room Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getRoom()
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
     *
     * @return the value of the '<em>Id</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setId(String)
     * @see business.model.ModelPackage#getRoom_Id()
     */
    String getId();

    /**
     * Sets the value of the '{@link business.model.Room#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Id</em>' attribute.
     * @generated
     * @see #getId()
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
     *
     * @return the value of the '<em>Number</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setNumber(String)
     * @see business.model.ModelPackage#getRoom_Number()
     */
    String getNumber();

    /**
     * Sets the value of the '{@link business.model.Room#getNumber <em>Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Number</em>' attribute.
     * @generated
     * @see #getNumber()
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
     *
     * @return the value of the '<em>Description</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
     * @generated
     * @see #setDescription(String)
     * @see business.model.ModelPackage#getRoom_Description()
     */
    String getDescription();

    /**
     * Sets the value of the '{@link business.model.Room#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Description</em>' attribute.
     * @generated
     * @see #getDescription()
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
     *
     * @return the value of the '<em>Allowed Guests</em>' attribute.
     * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
     * @generated
     * @see #setAllowedGuests(int)
     * @see business.model.ModelPackage#getRoom_AllowedGuests()
     */
    int getAllowedGuests();

    /**
     * Sets the value of the '{@link business.model.Room#getAllowedGuests <em>Allowed Guests</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Allowed Guests</em>' attribute.
     * @generated
     * @see #getAllowedGuests()
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
     *
     * @return the value of the '<em>Size</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setSize(BigDecimal)
     * @see business.model.ModelPackage#getRoom_Size()
     */
    BigDecimal getSize();

    /**
     * Sets the value of the '{@link business.model.Room#getSize <em>Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Size</em>' attribute.
     * @generated
     * @see #getSize()
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
     *
     * @return the value of the '<em>Night Price</em>' attribute.
     * @model required="true" ordered="false"
     * @generated
     * @see #setNightPrice(BigDecimal)
     * @see business.model.ModelPackage#getRoom_NightPrice()
     */
    BigDecimal getNightPrice();

    /**
     * Sets the value of the '{@link business.model.Room#getNightPrice <em>Night Price</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Night Price</em>' attribute.
     * @generated
     * @see #getNightPrice()
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
     *
     * @return the value of the '<em>Pictures</em>' attribute list.
     * @model dataType="org.eclipse.uml2.types.String" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getRoom_Pictures()
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
     *
     * @return the value of the '<em>Classification</em>' reference.
     * @model required="true" ordered="false"
     * @generated
     * @see #setClassification(Classification)
     * @see business.model.ModelPackage#getRoom_Classification()
     */
    Classification getClassification();

    /**
     * Sets the value of the '{@link business.model.Room#getClassification <em>Classification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @param value the new value of the '<em>Classification</em>' reference.
     * @generated
     * @see #getClassification()
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
     *
     * @return the value of the '<em>Bed Type</em>' reference list.
     * @model type="business.model.BedType" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getRoom_BedType()
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
     *
     * @return the value of the '<em>Room Extra</em>' reference list.
     * @model type="business.model.RoomExtra" ordered="false"
     * @generated
     * @see business.model.ModelPackage#getRoom_RoomExtra()
     */
    EList getRoomExtra();

} // Room
