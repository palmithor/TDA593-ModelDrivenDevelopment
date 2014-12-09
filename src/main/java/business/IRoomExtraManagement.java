/**
 */
package business;

import business.model.RoomExtra;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRoom Extra Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see business.BusinessPackage#getIRoomExtraManagement()
 */
public interface IRoomExtraManagement extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" descriptionRequired="true" descriptionOrdered="false"
     * @generated
     */
    RoomExtra createRoomExtra(String name, String description);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" roomExtraRequired="true" roomExtraOrdered="false"
     * @generated
     */
    RoomExtra editRoomExtra(RoomExtra roomExtra);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model type="business.model.RoomExtra" ordered="false"
     * @generated
     */
    EList listRoomExtras();

} // IRoomExtraManagement
