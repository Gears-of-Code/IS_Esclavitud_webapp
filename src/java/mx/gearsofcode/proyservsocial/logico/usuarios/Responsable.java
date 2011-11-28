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
 * La representacion de un '<em><b>Responsable</b></em>' se conforma
 * de unos cuantos elementos adicionales a un UsuarioRegistrado.
 * Aqui se enlistan dichos elementos y funciiones que debe cumplir un
 * elemento tipo Responsable.
 *
 * <p>
 * Las siguientes funcionalidades deben implementarse:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#getSitioweb <em>Sitioweb</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#isEstado <em>Estado</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#aceptaAlumnoProyecto <em>Aceota Alumno Proyecto</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#registrarse <em>Registrarse</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#proponerProyecto <em>Proponer Proyecto</em>}</li>
 * </ul>
 * </p>
 */
public interface Responsable extends UsuarioRegistrado {

    /**
     * Entrega una breve '<em><b>Descripcion</b></em>' de quien es
     * el responsable.
     * <p>
     * Breve '<em>Descripcion</em>' implica saber quien es, que
     * hace o en que eventos o investigaciones ha participado. Es
     * parte del perfil del responsable.
     * </p>
     *
     * @return La '<em>Descripcion</em>' del responsable.
     * @see #setDescripcion(String)
     */
    String getDescripcion();

    /**
     * Coloca la '<em><b>Descripcion<b></em>}' del responsable.
     *
     * @param value La '<em>Descripcion</em>' breve de un responsable.
     * @see #getDescripcion()
     */
    void setDescripcion(String value);

    /**
     * Entrega la direccion del '<em><b>Sitioweb</b></em>' donde
     * se puede encontrar mas informacion sobre el responsable.
     * Es un atributo opcional.
     *
     * @return El URL del '<em>Sitioweb</em>' del responsable.
     * @see #setSitioweb(String)
     */
    String getSitioweb();

    /**
     * Coloca la URL del '<em><b>Sitioweb<b></em>}' del responsable.
     *
     * @param value La URL del '<em>Sitioweb</em>'.
     * @see #getSitioweb()
     */
    void setSitioweb(String value);

    /**
     * Entrega el '<em><b>Estado</b></em>' ya sea aceptado o no
     * autorizado del responsable.
     * El valor por omision <code>"false"</code> que equivale a no
     * autorizado.
     * <p>
     * El '<em>Estado</em>' determina si el responsable ya fue
     * autorizado o si se encuentra en proceso de autorizacion por
     * parte del administrador.
     * </p>
     *
     * @return El '<em>Estado</em>' del responsable, true es autorizado
     * false es en proceso de autorizacion.
     * @see #setEstado(boolean)
     */
    boolean isEstado();

    /**
     * Coloca el '<em><b>Estado<b></em>}' del responsable.
     * False es no autorizado o en proceso de autorizacion por el
     * responsable, True es aceptado como responsable.
     *
     * @param value El '<em>Estado</em>' al que se cambia un
     * responsable.
     * @see #isEstado()
     */
    void setEstado(boolean value);

    /**
     * Metodo que coloca a un alumno en espera de ser autorizado por el
     * administrador del sistema.
     *
     * @param proyectID El ID del proyecto donde se aceptaran los alumnos.
     * @param studentIDs La lista con IDs de los estudiantes a ser aceptados.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void aceptaAlumnoProyecto(int proyectID, int [] studentIDs) throws DBModificationException, DBCreationException;

    /**
     * Metodo con el cual un candidato a responsable pide ser aceptado
     * por un administrador en el sistema para poder proponer proyectos.
     *
     * @param password Cadena con el password encriptado.
     * @param description Breve descripcion del responsable.
     * @param mail Correo de contacto del responsable.
     * @param phone Telefono de contacto del responsable.
     * @param name Nombre del candidato.
     * @param website URL del sitio web de contacto del responsable.
     * @param type Valor numerico que representa a un responsable.
     * @param login Nombre de usuario dentro del sistema.
     * @throws DBCreationException
     */
    void registrarse(String password, String description, String mail, String phone, String name, String website, int type, String login) throws DBCreationException;

    /**
     * Metodo que utiliza un responsable para dar de alta un nuevo proyecto
     * para que este sea revisado por el administrador y proceda a ser
     * aceptado o rechazado.
     *
     * @param nomProy Nombre del proyecto.
     * @param descrProy Descripcion general del objetivo del proyecto.
     * @param dirProy Direccion donde se realizara el proyecto.
     * @param mailProy Correo de contacto para informacion sobre el proyecto.
     * @param telProy Telefono de contacto para informacion sobre el proyecto.
     * @param capMax Numero maximo de alumnos que se aceptaran en el proyecto.
     * @param carreraProy Carreras de las que se solicitan alumnos.
     * @param areaDeConocimiento Areas de conocimiento que se ven involucradas
     * en el desarollo del proyecto.
     * @throws DBCreationException
     */
    void proponerProyecto(final String nomProy, final String descrProy,
            final String dirProy, final String mailProy, final int telProy,
            final int capMax, final int[] carreraProy, final int[] areaDeConocimiento) throws DBCreationException;

    // TODO: Documentacion de estos metodos.
    String [][] dameAC() throws DBConsultException, DBCreationException;

    String [][] dameCAR() throws DBConsultException, DBCreationException;

} // Responsable
