/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion;

import mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import org.eclipse.emf.ecore.EObject;

/**
 * Representacion de los elementos que la clase '<em><b>Sesion</b></em>'
 * debe cumplir.
 *
 * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage#getSesion()
 * @model
 */
public interface Sesion extends EObject {
    /**
     * Returns the value of the '<em><b>Usuario</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usuario</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usuario</em>' reference.
     * @see #setUsuario(UsuarioRegistrado)
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage#getSesion_Usuario()
     * @model required="true" ordered="false"
     * @generated
     */
    UsuarioRegistrado getUsuario();

    /**
     * Sets the value of the '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion#getUsuario <em>Usuario</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usuario</em>' reference.
     * @see #getUsuario()
     * @generated
     */
    void setUsuario(UsuarioRegistrado value);

    /**
     * Realiza el proceso de autenticar a un usuario en la base de datos.
     *
     * @return UsuarioRegistrado La clase activa de un usuario que ha sido
     * validado en el sistema por la base de datos.
     * @throws DBConsultException
     * @throws DBCreationException 
     */
    UsuarioRegistrado autenticar(final String nombreUsuario,
                                 final String password) throws DBConsultException, DBCreationException;

    /**
     * Elimina el objeto del usuario que mando llamar al mentodo.
     */
    void cerrarSesion(final UsuarioRegistrado unUsuario);

} // Sesion
