/**
 */
package business;

import business.model.BedType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBed Type Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see business.BusinessPackage#getIBedTypeManagement()
 */
public interface IBedTypeManagement extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" lengthRequired="true" lengthOrdered="false" widthRequired="true" widthOrdered="false" noOfSleepingSpotsRequired="true" noOfSleepingSpotsOrdered="false"
     * @generated
     */
    BedType createBedType(String name, int length, int width, int noOfSleepingSpots);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" bedTypeRequired="true" bedTypeOrdered="false"
     * @generated
     */
    BedType editBedType(BedType bedType);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model type="business.model.BedType" ordered="false"
     * @generated
     */
    EList listBedTypes();

} // IBedTypeManagement
