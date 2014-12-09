/**
 */
package business;

import business.model.Service;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * @model interface="true" abstract="true"
 * @generated
 * @see business.BusinessPackage#getIServiceManagement()
 */
public interface IServiceManagement extends EObject {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" nameRequired="true" nameOrdered="false" descriptionRequired="true" descriptionOrdered="false" widthRequired="true" widthOrdered="false"
     * @generated
     */
    Service createService(String name, String description, BigDecimal width);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model required="true" ordered="false" serviceRequired="true" serviceOrdered="false"
     * @generated
     */
    Service editService(Service service);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @model type="business.model.Service" ordered="false"
     * @generated
     */
    EList listServices();

} // IServiceManagement
