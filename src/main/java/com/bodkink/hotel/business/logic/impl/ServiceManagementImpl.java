/**
 */
package com.bodkink.hotel.business.logic.impl;

import com.bodkink.hotel.business.logic.LogicPackage;
import com.bodkink.hotel.business.logic.ServiceManagement;

import com.bodkink.hotel.business.model.ModelFactory;
import com.bodkink.hotel.business.model.Service;

import java.lang.reflect.InvocationTargetException;

import java.math.BigDecimal;
import java.util.List;

import com.bodkink.hotel.business.util.EntityToModelConverter;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.IServiceService;
import com.bodkink.hotel.persistence.model.ServiceEntity;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.BasicEList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mongodb.morphia.Key;

import javax.inject.Inject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ServiceManagementImpl extends MinimalEObjectImpl.Container implements ServiceManagement {

	@Inject
	IServiceService serviceService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.SERVICE_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Service createService(String title, String description, BigDecimal price) {
		Service service = ModelFactory.eINSTANCE.createService();
		service.setTitle(title);
		service.setDescription(description);
		service.setPrice(price);

		ServiceEntity serviceEntity = ModelToEntityConverter.convertService(service);
		serviceService.persist(serviceEntity);

		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Service editService(Service service) {
		ServiceEntity serviceEntity = ModelToEntityConverter.convertService(service);
		serviceService.edit(serviceEntity);
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Service> listServices() {
		List<ServiceEntity> serviceEntityList = serviceService.listAll();
		EList<Service> services = new BasicEList<>(serviceEntityList.size());
		serviceEntityList.forEach( entity -> {
			services.add(EntityToModelConverter.convertService(entity));
		});
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.SERVICE_MANAGEMENT___CREATE_SERVICE__STRING_STRING_BIGDECIMAL:
				return createService((String)arguments.get(0), (String)arguments.get(1), (BigDecimal)arguments.get(2));
			case LogicPackage.SERVICE_MANAGEMENT___EDIT_SERVICE__SERVICE:
				return editService((Service)arguments.get(0));
			case LogicPackage.SERVICE_MANAGEMENT___LIST_SERVICES:
				return listServices();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceManagementImpl
