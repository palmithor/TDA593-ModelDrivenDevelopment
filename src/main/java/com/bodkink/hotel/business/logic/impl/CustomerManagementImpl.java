/**
 */
package com.bodkink.hotel.business.logic.impl;


import com.bodkink.hotel.business.logic.CustomerManagement;
import com.bodkink.hotel.business.logic.LogicPackage;

import com.bodkink.hotel.business.model.CardInformation;
import com.bodkink.hotel.business.model.Customer;

import java.lang.reflect.InvocationTargetException;

import com.bodkink.hotel.business.model.ModelFactory;
import com.bodkink.hotel.business.util.ModelToEntityConverter;
import com.bodkink.hotel.persistence.ICustomerService;
import com.bodkink.hotel.persistence.model.CustomerEntity;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.mongodb.morphia.Key;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;

import javax.inject.Inject;
import javax.xml.soap.SOAPException;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CustomerManagementImpl extends MinimalEObjectImpl.Container implements CustomerManagement {

    @Inject
    ICustomerService customerService;

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerManagementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogicPackage.Literals.CUSTOMER_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer(String firstName, String lastName, String phone, String email, int birthYear, CardInformation cardInformation) throws SOAPException {
        // TODO: implement this method

        try {
            // Acquire CustomerRequires object
            se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
                    .instance();

            if (banking.isCreditCardValid(cardInformation.getCcNumber(), cardInformation.getCcv(), cardInformation.getExpiryMonth(), cardInformation.getExpiryYear(), cardInformation.getFirstName(), cardInformation.getLastName())) {
                // System.out.println("Valid credit card");
                // TODO: Create a customer here
                Customer customer = ModelFactory.eINSTANCE.createCustomer();


                customer.setFirstName(firstName);
                customer.setSurname(lastName);
                customer.setPhone(phone);
                customer.setEmail(email);
                customer.setBirthYear(birthYear);
                customer.setCardInformation(cardInformation);

                Key<CustomerEntity> key = customerService.persist(ModelToEntityConverter.convertCustomer(customer));

                customer.setId(key.getId().toString());

                return customer;
            } else{
                throw new UnsupportedOperationException("Error while adding credit card");
            }

        } catch(SOAPException e){
                System.err
                        .println("Error occurred while communicating with the bank");
                e.printStackTrace();
            throw e;
            }
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer editCustomer(Customer customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LogicPackage.CUSTOMER_MANAGEMENT___CREATE_CUSTOMER__STRING_STRING_STRING_STRING_INT_CARDINFORMATION:
				return createCustomer((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4), (CardInformation)arguments.get(5));
			case LogicPackage.CUSTOMER_MANAGEMENT___EDIT_CUSTOMER__CUSTOMER:
				return editCustomer((Customer)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomerManagementImpl
