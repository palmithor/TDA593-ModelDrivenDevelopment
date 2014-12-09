/**
 */
package business.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bill Status Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 *
 * @model
 * @generated
 * @see business.model.ModelPackage#getBillStatusEnum()
 */
public final class BillStatusEnum extends AbstractEnumerator {
    /**
     * The '<em><b>PAID</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PAID</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #PAID_LITERAL
     */
    public static final int PAID = 0;

    /**
     * The '<em><b>NOT PAID</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>NOT PAID</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     *
     * @model
     * @generated
     * @ordered
     * @see #NOT_PAID_LITERAL
     */
    public static final int NOT_PAID = 1;

    /**
     * The '<em><b>PAID</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #PAID
     */
    public static final BillStatusEnum PAID_LITERAL = new BillStatusEnum(PAID, "PAID", "PAID");

    /**
     * The '<em><b>NOT PAID</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     * @see #NOT_PAID
     */
    public static final BillStatusEnum NOT_PAID_LITERAL = new BillStatusEnum(NOT_PAID, "NOT_PAID", "NOT_PAID");

    /**
     * An array of all the '<em><b>Bill Status Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private static final BillStatusEnum[] VALUES_ARRAY =
            new BillStatusEnum[]{
                    PAID_LITERAL,
                    NOT_PAID_LITERAL,
            };

    /**
     * A public read-only list of all the '<em><b>Bill Status Enum</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    private BillStatusEnum(int value, String name, String literal) {
        super(value, name, literal);
    }

    /**
     * Returns the '<em><b>Bill Status Enum</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
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
     *
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
     *
     * @generated
     */
    public static BillStatusEnum get(int value) {
        switch (value) {
            case PAID:
                return PAID_LITERAL;
            case NOT_PAID:
                return NOT_PAID_LITERAL;
        }
        return null;
    }

} //BillStatusEnum
