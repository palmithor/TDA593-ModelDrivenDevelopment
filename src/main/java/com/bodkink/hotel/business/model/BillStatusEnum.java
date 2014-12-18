/**
 */
package com.bodkink.hotel.business.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bill Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.model.ModelPackage#getBillStatusEnum()
 * @model
 * @generated
 */
public enum BillStatusEnum implements Enumerator {
	/**
	 * The '<em><b>PAID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAID_VALUE
	 * @generated
	 * @ordered
	 */
	PAID(0, "PAID", "PAID"),

	/**
	 * The '<em><b>NOT PAID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_PAID_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PAID(1, "NOT_PAID", "NOT_PAID");

	/**
	 * The '<em><b>PAID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAID_VALUE = 0;

	/**
	 * The '<em><b>NOT PAID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT PAID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_PAID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PAID_VALUE = 1;

	/**
	 * An array of all the '<em><b>Bill Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BillStatusEnum[] VALUES_ARRAY =
		new BillStatusEnum[] {
			PAID,
			NOT_PAID,
		};

	/**
	 * A public read-only listByDate of all the '<em><b>Bill Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BillStatusEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bill Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BillStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bill Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BillStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bill Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillStatusEnum get(int value) {
		switch (value) {
			case PAID_VALUE: return PAID;
			case NOT_PAID_VALUE: return NOT_PAID;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BillStatusEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //BillStatusEnum
