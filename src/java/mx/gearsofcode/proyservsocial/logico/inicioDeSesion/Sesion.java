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

/**
 * Representacion de los elementos que la clase '<em><b>Sesion</b></em>'
 * debe cumplir.
 */
public interface Sesion {

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
