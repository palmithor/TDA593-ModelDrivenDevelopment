/**
 */
package business.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>User Group Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see business.model.ModelPackage#getUserGroupEnum()
 * @model
 * @generated
 */
public final class UserGroupEnum extends AbstractEnumerator {
	/**
	 * The '<em><b>ADMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMIN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN = 0;

	/**
	 * The '<em><b>MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER = 1;

	/**
	 * The '<em><b>CLERK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLERK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLERK_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLERK = 2;

	/**
	 * The '<em><b>CUSTOMER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOMER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER = 3;

	/**
	 * The '<em><b>ADMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @generated
	 * @ordered
	 */
	public static final UserGroupEnum ADMIN_LITERAL = new UserGroupEnum(ADMIN, "ADMIN", "ADMIN");

	/**
	 * The '<em><b>MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGER
	 * @generated
	 * @ordered
	 */
	public static final UserGroupEnum MANAGER_LITERAL = new UserGroupEnum(MANAGER, "MANAGER", "MANAGER");

	/**
	 * The '<em><b>CLERK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLERK
	 * @generated
	 * @ordered
	 */
	public static final UserGroupEnum CLERK_LITERAL = new UserGroupEnum(CLERK, "CLERK", "CLERK");

	/**
	 * The '<em><b>CUSTOMER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER
	 * @generated
	 * @ordered
	 */
	public static final UserGroupEnum CUSTOMER_LITERAL = new UserGroupEnum(CUSTOMER, "CUSTOMER", "CUSTOMER");

	/**
	 * An array of all the '<em><b>User Group Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UserGroupEnum[] VALUES_ARRAY =
		new UserGroupEnum[] {
			ADMIN_LITERAL,
			MANAGER_LITERAL,
			CLERK_LITERAL,
			CUSTOMER_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>User Group Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>User Group Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserGroupEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserGroupEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Group Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserGroupEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserGroupEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>User Group Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserGroupEnum get(int value) {
		switch (value) {
			case ADMIN: return ADMIN_LITERAL;
			case MANAGER: return MANAGER_LITERAL;
			case CLERK: return CLERK_LITERAL;
			case CUSTOMER: return CUSTOMER_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private UserGroupEnum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //UserGroupEnum
