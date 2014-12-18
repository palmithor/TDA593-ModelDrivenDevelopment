/**
 */
package com.bodkink.hotel.business.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Booking Bill Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.bodkink.hotel.business.model.ModelPackage#getBookingBillType()
 * @model
 * @generated
 */
public enum BookingBillType implements Enumerator {
	/**
	 * The '<em><b>RESERVATION FEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_FEE_VALUE
	 * @generated
	 * @ordered
	 */
	RESERVATION_FEE(0, "RESERVATION_FEE", "RESERVATION_FEE"),

	/**
	 * The '<em><b>FINALIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALIZE_VALUE
	 * @generated
	 * @ordered
	 */
	FINALIZE(1, "FINALIZE", "FINALIZE");

	/**
	 * The '<em><b>RESERVATION FEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESERVATION FEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_FEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVATION_FEE_VALUE = 0;

	/**
	 * The '<em><b>FINALIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINALIZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINALIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINALIZE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Booking Bill Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookingBillType[] VALUES_ARRAY =
		new BookingBillType[] {
			RESERVATION_FEE,
			FINALIZE,
		};

	/**
	 * A public read-only listByDate of all the '<em><b>Booking Bill Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BookingBillType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Booking Bill Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingBillType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookingBillType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Booking Bill Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingBillType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookingBillType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Booking Bill Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookingBillType get(int value) {
		switch (value) {
			case RESERVATION_FEE_VALUE: return RESERVATION_FEE;
			case FINALIZE_VALUE: return FINALIZE;
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
	private BookingBillType(int value, String name, String literal) {
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
	
} //BookingBillType
