/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario;

import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;

/**
 * Un '<em><b>Usuario Registrado</b></em>' se conforma de la informacion
 * basica de un usuario comun del sistema e incluye las funciones globales.
 *
 * <p>
 * Las siguientes funciones estan activas
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getId <em>Id</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getUsername <em>Username</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getContraseña <em>Contraseña</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getTipo <em>Tipo</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getNombre <em>Nombre</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getEmail <em>Email</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getSesion <em>Sesion</em>}</li>
 * </ul>
 * </p>
 */
public interface UsuarioRegistrado {

    /**
     * Constantes para los tipos de usuarios segun lo especificado
     * en la base de datos.
     *
     * Nota: Las constantes esta colocadas a proposito en este orden
     * para resaltar la diferencia con la base de datos.
     */
    public static int ADMINISTRADOR = 0;
    public static int RESPONSABLE = 2;
    public static int ALUMNO = 1;

    /**
     * Entrega el valor del '<em><b>Id</b></em>' del usuario.
     * El valor por default es <code>"-1"</code>.
     *
     * @return El '<em>Id</em>' del usuario.
     * @see #setId(int)
     */
    int getId();

    /**
     * Coloca el '<em><b>Id</b></em>' del usuario.
     *
     * @param value El valor del '<em>Id</em>' usuario.
     * @see #getId()
     */
    void setId(int value);

    /**
     * Entrega el '<em><b>Username</b></em>' del usuario.
     *
     * <p>
     * El '<em>Username</em>' es el nombre que ocupa el usuario
     * dentro del sistema.
     * </p>
     *
     * @return El '<em>Username</em>' que identifica al usuario
     * dentro del sistema.
     * @see #setUsername(String)
     */
    String getUsername();

    /**
     * Coloca el '<em><b>Username</b></em>' del usuario.
     *
     * @param value El valor del '<em>Username</em>' del usuario.
     * @see #getUsername()
     */
    void setUsername(String value);

    /**
     * Entrega la '<em><b>Contraseña</b></em>' del usuario.
     *
     * @return La '<em>Contraseña</em>' almacenada del usuario.
     * @see #setContraseña(String)
     */
    // TODO: Revisar si en algun lado se ocupa esto.
    String getContraseña();

    /**
     * Coloca la '<em><b>Contrasena</b></em>' del usuario.
     *
     * @param value La '<em>Contraseña</em>' del usuario.
     * @see #getContraseña()
     */
    void setContraseña(String value);

    /**
     * Entrega un numero que determina el '<em><b>Tipo</b></em>'
     * de usuario que esta en el sistema.
     * El tipo se utiliza para mapear a cada clase de usuario a
     * un objeto dentro del sistema.
     *
     * @return El valor numerico '<em>Tipo</em>' que define que
     * clase de usuario esta en el sistema.
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario
     * @see #setTipo(int)
     */
    int getTipo();

    /**
     * Coloca el '<em><b>Tipo</b></em>' del usuario al que pertenece
     * el usuario.
     *
     * @param value El '<em>Tipo</em>' correspondiente a la clase
     * de usuario que se necesita.
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario
     * @see #getTipo()
     */
    void setTipo(final int value);

    /**
     * Regresa el '<em><b>Nombre</b></em>' del usuario.
     *
     * <p>
     * El '<em>Nombre</em>' real de la persona que corresponde
     * a este usuario.
     * </p>
     *
     * @return El '<em>Nombre</em>' real de nuestro usuario.
     * @see #setNombre(String)
     */
    String getNombre();

    /**
     * Coloca el '<em><b>Nombre</b></em>' real del usuario.
     *
     * @param value El '<em>Nombre</em>' de la persona que representa
     * a este usuario.
     * @see #getNombre()
     */
    void setNombre(String value);

    /**
     * Entrega el '<em><b>Telefono</b></em>' del usuario.
     *
     * @return El '<em>Telefono</em>' del usuario.
     * @see #setTelefono(String)
     */
    String getTelefono();

    /**
     * Coloca el '<em><b>Telefono</b></em>' del usuario.
     *
     * @param value El '<em>Telefono</em>' del usuario.
     * @see #getTelefono()
     */
    void setTelefono(String value);

    /**
     * Entrega el '<em><b>Email</b></em>' registrado del usuario.
     *
     *<p>
     * La direccion de '<em>Email</em>' que el usuario tiene registrado
     * para poder enviarle notificaciones automaticas.
     * </p>
     *
     * @return La direccion de '<em>Email</em>' del usuario.
     * @see #setEmail(String)
     */
    String getEmail();

    /**
     *  Coloca el '<em><b>Email</b></em>' del usuario.
     *
     * @param value La direccion del '<em>Email</em>' del usuario.
     * @see #getEmail()
     */
    void setEmail(String value);

    /**
     * Consulta todos los proyectos a los que un usuario puede acceder.
     * Dependiendo del tipo de usuario los proyectos que se le muestran.
     *
     * @return Un arreglo con los datos de los proyectos a mostrar. El
     * arreglo viene de la forma [Id_Proyecto, Nombre_de_Proyecto].
     * @throws DBConsultException
     * @throws DBCreationException
     */
    String[][] verProyectos() throws DBConsultException, DBCreationException;

    /**
     * Muestra una lista reducida de los proyectos dependiendo de que id
     * y tipo de usuario se este usando.
     * El admin debe de ver los proyectos que esten pendientes de autorizar.
     * El responsable sus propios proyectos.
     * El alumno los proyectos a los que se ha psotulado.
     *
     * @return Un arreglo con los datos de los proyectos a mostrar. El
     * arreglo viene de la forma [Id_Proyecto, Nombre_de_Proyecto].
     * @throws DBConsultException
     * @throws DBCreationException
     */
    String[][] verMisProyectos() throws DBConsultException, DBCreationException;

    /**
     * Muestra la informacion detallada de un proyecto en particular.
     *
     * @param idProyect El identificador unico del proyecto.
     * @return Un objeto proyecto que contiene todos los datos del
     * proyecto solicitado.
     * @throws DBConsultException
     * @throws DBCreationException
     */
    Proyecto verDetallesProyecto(final int idProyect) throws
        DBConsultException, DBCreationException;

    /**
     * Muestra la informacion detallada de un usuario en particular.
     *
     * @param userId El identificador unico de un usuario.
     * @return Un objeto usuarioRegistrado que contiene todos los
     * datos del usuario solicitado.
     * @throws DBConsultException
     */
    UsuarioRegistrado verDetallesUsuario(final int userId) throws DBConsultException;

} // UsuarioRegistrado
