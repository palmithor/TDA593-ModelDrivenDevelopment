/**
 */
package com.bodkink.hotel.business;

import com.bodkink.hotel.business.model.Service;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IService Management</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.bodkink.hotel.business.BusinessPackage#getIServiceManagement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IServiceManagement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" titleRequired="true" titleOrdered="false" descriptionRequired="true" descriptionOrdered="false" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	Service createService(String title, String description, BigDecimal price);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" serviceRequired="true" serviceOrdered="false"
	 * @generated
	 */
	Service editService(Service service);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> listServices();

} // IServiceManagement
