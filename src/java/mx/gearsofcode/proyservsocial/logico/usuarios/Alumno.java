/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getCarrera <em>Carrera</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getPorcentaje <em>Porcentaje</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#isEstado <em>Estado</em>}</li>
 * </ul>
 * </p>
 *
 * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage#getAlumno()
 * @model
 * @generated
 */
public interface Alumno extends UsuarioRegistrado {
    /**
     * Returns the value of the '<em><b>Carrera</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Carrera</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Carrera</em>' attribute.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno
     * @see #setCarrera(CarreraAlumno)
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage#getAlumno_Carrera()
     * @model default="" required="true" ordered="false"
     * @generated
     */
    String getCarrera();

    /**
     * Sets the value of the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getCarrera <em>Carrera</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Carrera</em>' attribute.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno
     * @see #getCarrera()
     * @generated
     */
    void setCarrera(String value);

    /**
     * Returns the value of the '<em><b>Porcentaje</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Porcentaje</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Porcentaje</em>' attribute.
     * @see #setPorcentaje(int)
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage#getAlumno_Porcentaje()
     * @model required="true" ordered="false"
     * @generated
     */
    int getPorcentaje();

    /**
     * Sets the value of the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getPorcentaje <em>Porcentaje</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Porcentaje</em>' attribute.
     * @see #getPorcentaje()
     * @generated
     */
    void setPorcentaje(int value);

    /**
     * Returns the value of the '<em><b>Estado</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Estado</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Estado</em>' attribute.
     * @see #setEstado(boolean)
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage#getAlumno_Estado()
     * @model default="false" required="true" ordered="false"
     * @generated
     */
    boolean isEstado();

    /**
     * Sets the value of the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#isEstado <em>Estado</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Estado</em>' attribute.
     * @see #isEstado()
     * @generated
     */
    void setEstado(boolean value);

    /**
     * <!-- begin-user-doc -->a
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @model
     * @generated
     */
    void postularseAProyecto(int proyectID) throws DBModificationException, DBCreationException ;

    String convierteCarrera(int carrId);
    
} // Alumno
