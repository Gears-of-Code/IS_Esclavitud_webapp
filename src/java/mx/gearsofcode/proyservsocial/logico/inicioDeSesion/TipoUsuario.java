/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * Representa los tipos de usuario que tiene el sistema'<em><b>Tipo Usuario</b></em>'.
 * Contiene una serie de metodos para acceder estos valores con facilidad.
 */
public enum TipoUsuario implements Enumerator {
    /**
     * Representacion del objeto '<em><b>Administrador</b></em>'.
     * 
     * @see #ADMINISTRADOR_VALUE
     */
    ADMINISTRADOR(0, "administrador", "administrador"),

    /**
     * Representacion del objeto '<em><b>Responsable</b></em>'.
     * 
     * @see #RESPONSABLE_VALUE
     */
    RESPONSABLE(1, "responsable", "responsable"),

    /**
     * Representacion del objeto '<em><b>Alumno</b></em>'.
     * 
     * @see #ALUMNO_VALUE
     */
    ALUMNO(2, "alumno", "alumno");

    /**
     * Valor que representa '<em><b>Administrador</b></em>'.
     * 
     * <p>
     * Representacion numerica del '<em><b>Administrador</b></em>'.
     * </p>
     * 
     * @see #ADMINISTRADOR
     * @model name="administrador"
     */
    public static final int ADMINISTRADOR_VALUE = 0;

    /**
     * Valor que representa'<em><b>Responsable</b></em>'.
     * 
     * <p>
     * Representacion numerica del '<em><b>Responsable</b></em>'.
     * </p>
     * 
     * @see #RESPONSABLE
     * @model name="responsable"
     */
    public static final int RESPONSABLE_VALUE = 1;

    /**
     * Valor que representa'<em><b>Alumno</b></em>'.
     * 
     * <p>
     * Representacion numerica del '<em><b>Alumno</b></em>'.
     * </p>
     * 
     * @see #ALUMNO
     * @model name="alumno"
     */
    public static final int ALUMNO_VALUE = 2;

    /**
     * Arreglo que contiene los elementos de '<em><b>Tipo Usuario</b></em>'.
     * Una pequeña tabla que contiene todos los elementos aqui definidos.
     */
    private static final TipoUsuario[] VALUES_ARRAY = new TipoUsuario[] {
            ADMINISTRADOR, RESPONSABLE, ALUMNO, };

    /**
     * Una lista de solo lectura que contiene a los arreglos de elementos de 
     * '<em><b>Tipo Usuario</b></em>' que hemos definido.
     */
    public static final List<TipoUsuario> VALUES = Collections
            .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Regresa el objeto '<em><b>Tipo Usuario</b></em>' que corresponde a la cadena
     * que recibe.
     * @param literal Una cadena para evaluar contra los elementos definidos.
     * @return Regresa un objeto TipoUsuario, si la cadena corresponde a algun elemento.
     */
    public static TipoUsuario get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TipoUsuario result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Regresa el objeto '<em><b>Tipo Usuario</b></em>' que corresponde al nombre
     * del elemento definido.
     * @param nombre Una cadena con el nombre de un elemento definido en el enum.
     * @return Regresa un objeto TipoUsuario correspondiente a la cadena solicitada.
     */
    public static TipoUsuario getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TipoUsuario result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Regresa el objeto '<em><b>Tipo Usuario</b></em>' que corresponde al valor
     * numerico de un elemento definido.
     * @param valor Entero correspondiente a un elemento definido en el enum.
     * @return Regresa un objeto TipoUsuario correspondiente al entero solicitad0.
     */
    public static TipoUsuario get(int value) {
        switch (value) {
        case ADMINISTRADOR_VALUE:
            return ADMINISTRADOR;
        case RESPONSABLE_VALUE:
            return RESPONSABLE;
        case ALUMNO_VALUE:
            return ALUMNO;
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
    private TipoUsuario(int value, String name, String literal) {
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

} //TipoUsuario
