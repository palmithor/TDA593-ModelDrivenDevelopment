/**
 */
package com.bodkink.hotel.business.model.impl;

import com.bodkink.hotel.business.model.ModelPackage;
import com.bodkink.hotel.business.model.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.bodkink.hotel.business.model.impl.PersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.PersonImpl#getSurname <em>Surname</em>}</li>
 *   <li>{@link com.bodkink.hotel.business.model.impl.PersonImpl#getBirthYear <em>Birth Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected static final String SURNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected String surname = SURNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected int birthYear = BIRTH_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(String newSurname) {
		String oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__SURNAME, oldSurname, surname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthYear(int newBirthYear) {
		int oldBirthYear = birthYear;
		birthYear = newBirthYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PERSON__BIRTH_YEAR, oldBirthYear, birthYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PERSON__ID:
				return getId();
			case ModelPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case ModelPackage.PERSON__SURNAME:
				return getSurname();
			case ModelPackage.PERSON__BIRTH_YEAR:
				return getBirthYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.PERSON__ID:
				setId((String)newValue);
				return;
			case ModelPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case ModelPackage.PERSON__SURNAME:
				setSurname((String)newValue);
				return;
			case ModelPackage.PERSON__BIRTH_YEAR:
				setBirthYear((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.PERSON__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case ModelPackage.PERSON__SURNAME:
				setSurname(SURNAME_EDEFAULT);
				return;
			case ModelPackage.PERSON__BIRTH_YEAR:
				setBirthYear(BIRTH_YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.PERSON__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case ModelPackage.PERSON__SURNAME:
				return SURNAME_EDEFAULT == null ? surname != null : !SURNAME_EDEFAULT.equals(surname);
			case ModelPackage.PERSON__BIRTH_YEAR:
				return birthYear != BIRTH_YEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", Surname: ");
		result.append(surname);
		result.append(", BirthYear: ");
		result.append(birthYear);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
