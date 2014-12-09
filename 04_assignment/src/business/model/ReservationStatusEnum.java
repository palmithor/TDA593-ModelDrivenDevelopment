/**
 */
package business.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reservation Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see business.model.ModelPackage#getReservationStatusEnum()
 * @model
 * @generated
 */
public final class ReservationStatusEnum extends AbstractEnumerator {
	/**
	 * The '<em><b>CHECKED IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECKED IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_IN = 0;

	/**
	 * The '<em><b>CHECKED OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECKED OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECKED_OUT = 1;

	/**
	 * The '<em><b>RESERVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESERVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERVED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVED = 2;

	/**
	 * The '<em><b>CHECKED IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_IN
	 * @generated
	 * @ordered
	 */
	public static final ReservationStatusEnum CHECKED_IN_LITERAL = new ReservationStatusEnum(CHECKED_IN, "CHECKED_IN", "CHECKED_IN");

	/**
	 * The '<em><b>CHECKED OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECKED_OUT
	 * @generated
	 * @ordered
	 */
	public static final ReservationStatusEnum CHECKED_OUT_LITERAL = new ReservationStatusEnum(CHECKED_OUT, "CHECKED_OUT", "CHECKED_OUT");

	/**
	 * The '<em><b>RESERVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVED
	 * @generated
	 * @ordered
	 */
	public static final ReservationStatusEnum RESERVED_LITERAL = new ReservationStatusEnum(RESERVED, "RESERVED", "RESERVED");

	/**
	 * An array of all the '<em><b>Reservation Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReservationStatusEnum[] VALUES_ARRAY =
		new ReservationStatusEnum[] {
			CHECKED_IN_LITERAL,
			CHECKED_OUT_LITERAL,
			RESERVED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Reservation Status Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reservation Status Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReservationStatusEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReservationStatusEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reservation Status Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReservationStatusEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReservationStatusEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reservation Status Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReservationStatusEnum get(int value) {
		switch (value) {
			case CHECKED_IN: return CHECKED_IN_LITERAL;
			case CHECKED_OUT: return CHECKED_OUT_LITERAL;
			case RESERVED: return RESERVED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ReservationStatusEnum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ReservationStatusEnum
