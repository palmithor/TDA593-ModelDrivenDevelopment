/**
 */
package business.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Booking Bill Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see business.model.ModelPackage#getBookingBillType()
 * @model
 * @generated
 */
public final class BookingBillType extends AbstractEnumerator {
	/**
	 * The '<em><b>RESERVATION FEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESERVATION FEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_FEE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESERVATION_FEE = 0;

	/**
	 * The '<em><b>FINALIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINALIZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINALIZE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FINALIZE = 1;

	/**
	 * The '<em><b>RESERVATION FEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESERVATION_FEE
	 * @generated
	 * @ordered
	 */
	public static final BookingBillType RESERVATION_FEE_LITERAL = new BookingBillType(RESERVATION_FEE, "RESERVATION_FEE", "RESERVATION_FEE");

	/**
	 * The '<em><b>FINALIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINALIZE
	 * @generated
	 * @ordered
	 */
	public static final BookingBillType FINALIZE_LITERAL = new BookingBillType(FINALIZE, "FINALIZE", "FINALIZE");

	/**
	 * An array of all the '<em><b>Booking Bill Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookingBillType[] VALUES_ARRAY =
		new BookingBillType[] {
			RESERVATION_FEE_LITERAL,
			FINALIZE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Booking Bill Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

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
			case RESERVATION_FEE: return RESERVATION_FEE_LITERAL;
			case FINALIZE: return FINALIZE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BookingBillType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //BookingBillType
