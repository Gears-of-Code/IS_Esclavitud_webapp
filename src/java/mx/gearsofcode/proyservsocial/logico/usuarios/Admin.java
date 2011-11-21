/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

/**
 * La representacion de un '<em><b>Admin</b></em>' se conforma de unos
 * cuantos elementos adicionales a un UsuarioRegistrado.
 * Aqui se enlistan dichos elementos y funciones qeu debe cumplir un
 * elemento de tipo Admin.
 *
 *  * <p>
 * Las siguientes funcionalidades deben implementarse:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#aceptaResponsable <em>Acepta Responsable</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#rechazarResponsable <em>Rechaza Responsable</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#actualizaEstadoAlumno <em>Actualiza Estado Alumno</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#autorizarAlumnoProyecto <em>Autorizar Alumno Proyecto</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#rechazarAlumnoProyecto <em>Rechazar Alumno Proyecto</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#autorizarProyecto <em>Autorizar Proyecto</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#rechazarProyecto <em>Rechazar Proyecto</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#dameRespPendientes <em>Dame Responsables Pendientes</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin#dameAlumPendientes <em>Dame Alumnos Pendientes</em>}</li>
 * </ul>
 * </p>
 */
public interface Admin extends UsuarioRegistrado {

    /**
     * Metodo con el cual se acepta a un responsables en el sistema.
     * Al ejecutar este metodo al responsable se le cambia el estado
     * a autorizado en la base de datos y se le envia una notificacion
     * por correo electronico a la direccion que proporciono.
     *
     * @param respID El identificador unico del responsable que se
     * va autorizar.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void aceptaResponsable(final int respID) throws
        DBModificationException, DBCreationException;

    /**
     * Metodo con el cual se rechazaa a un responsables en el sistema.
     * Al ejecutar este metodo al responsable se le se le envia una
     * notificacion por correo electronico a la direccion que proporciono
     * y se le elimina de la base de datos.
     *
     * @param respID El identificador unico del responsable que se
     * va rechazar.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void rechazarResponsable(final int respID) throws
        DBCreationException, DBModificationException;

    /**
     * Metodo que cambia el estado de un alumno. Se usa para dejar
     * constancia de que el alumno ya fue autorizado a participar
     * en un proyecto.
     *
     * @param studentID El identificador unico del alumno.
     * @param studentState Estado al que se va cambiar el alumno.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void actualizaEstadoAlumno(final int studentID, boolean studentState) throws
        DBModificationException, DBCreationException;

    /**
     * Método que se utiliza para actualizar al alumno autorizado
     * en un proyecto dado.
     *
     * @param studentID El identificador unico del alumno.
     * @param proyectID El identificador unico del proyecto.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void autorizarAlumnoProyecto(final int studentID, final int proyectID)
        throws DBModificationException, DBCreationException;

    /**
     * Método que se utiliza para actualizar al alumno rechazado
     * en un proyecto dado.
     *
     * @param studentID El identificador unico del alumno.
     * @param proyectID El identificador unico del proyecto.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void rechazarAlumnoProyecto(final int studentID, final int proyectID)
        throws DBCreationException, DBModificationException;

    /**
     * Sirve para autorizar un proyecto en el sistema, lo que hace
     * que pase el estado de false a true. Al cambiar este valor el
     * proyecto queda aceptado.
     * Es un metodo que solo lo debe de ejecutar un administrador.
     *
     * @param proyectID El identificador unico del proyecto.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void autorizarProyecto(final int proyectID)
        throws DBModificationException, DBCreationException;

    /**
     * Sirve para rechazar un proyecto en el sistema, lo que hace
     * que se elimine el proyecto de la base de datos.
     * Es un metodo que solo lo debe de ejecutar un administrador.
     *
     * @param proyectID El identificador unico del proyecto.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void rechazarProyecto(final int proyectID) throws DBCreationException,
                                                      DBModificationException;

    /**
     * Entrega un listado de los responsables que estan pendientes
     * de autorizacion en el sistema.
     *
     * @return Un arreglo bidimensional que contiene la siguiente
     * estructura [Resp_Id, Nombre]
     * @throws DBConsultException
     * @throws DBCreationException
     */
    String[][] dameRespPendientes() throws DBConsultException,
                                           DBCreationException;

    /**
     * Entrega un listado con los alumnos que estan pendientes
     * de ser autorizados en algun proyecto.
     *
     * @return Un arreglo bidimensional que contiene la siguiente
     * estructura [Id_Alumno, Nombre]
     * @throws DBConsultException
     * @throws DBCreationException
     */
    String[][] dameAlumPendientes() throws DBConsultException, DBCreationException;

} // Admin
