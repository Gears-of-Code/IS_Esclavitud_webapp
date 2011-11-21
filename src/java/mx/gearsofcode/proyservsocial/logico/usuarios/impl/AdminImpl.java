/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import java.util.logging.Level;
import java.util.logging.Logger;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.impl.ConectaDbImpl;

import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;

import mx.gearsofcode.proyservsocial.logico.usuarios.Admin;
import mx.gearsofcode.proyservsocial.logico.usuarios.Alumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;

import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;
import mx.gearsofcode.proyservsocial.logico.util.Mailing;

/**
 * Clase que implementa la interfaz '<em><b>Admin</b></em>'.
 * contiene las funciones particulares de un administrador.
 *
 * <p>
 * Las siguientes funciones se encuentran disponibles:
 * </p>
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
public class AdminImpl extends UsuarioRegistradoImpl implements Admin {

    /**
     * Constructor de un objeto tipo administrador.
     */
    public  AdminImpl() {
        super();
    }

    /**
     * Método que se manda llamar cuando un Administrador de Sistema pulsa aceptar, luego 
     * de haber seleccionado dentro de una lista a los responsables de proyecto que desea
     * autorizar.
     *
     * @throws DBModificationException 
     * @throws DBCreationException
     */
    public void aceptaResponsable(final int respID) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        conexion.aceptarResponsableDb(respID);
        try {
            Responsable res = (ResponsableImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(respID));
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Has sido aceptado al sistema de servicio social de la facultad de ciencias.";
            String content = "Este correo es para informarte que tu solicitud para ser un Responsable de Proyecto en nuestra facultad ha sido existosa. Te recordamos que no debes perder las credenciales que proporcionaste en tu registro.\nSi tienes algun problema, favor de revisar el manual del usuaio o contactar al administrador del sistema.\n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail, accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }

    }

    /**
     * Método que se utiliza para dejar constancia de que un alumno
     * ha sido autorizado en un proyecto.
     *
     * @throws DBModificationException 
     * @throws DBCreationException
     */
    public void actualizaEstadoAlumno(final int studentID, boolean studentState) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        conexion.modificarEstadoAlumno(studentID, studentState);
    }

    /**
     * Método que se utiliza para actualizar al alumno autorizado 
     * en un proyecto dado.
     *
     * @throws DBModificationException 
     * @throws DBCreationException
     */
    public void autorizarAlumnoProyecto(final int studentID, final int proyectID) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        conexion.autorizarAlumnoProyecto(studentID, proyectID);
        this.actualizaEstadoAlumno(studentID, true);

        try {

            Alumno res = (AlumnoImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(studentID));
            Proyecto proy = this.verDetallesProyecto(proyectID);
            String proyectName = proy.getNombre();
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Has sido aceptado en un proyecto.";
            String content = "Este correo es para informarte que tu solicitud para participar en el proyecto: " + proyectName + " de nuestra facultad ha sido existosa. \n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail, accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }
    }

    /**
     * Este metodo solo lo ejecuta el administrador. Sirve para autorizar un
     * proyecto, lo cual hace que pase el estado de false -> true. Al cambiar
     * este valor el proceso queda "Aceptado".
     * 
     * @param idAdmin El tipo del usuario que llama este metodo, debe coincidir
     *            con el tipo del administrador.
     * @throws DBModificationException 
     */
    public void autorizarProyecto(final int proyectID) throws DBModificationException, DBCreationException {
        boolean aceptado = true;
        modificaProyecto(proyectID, aceptado);

        try {
            Proyecto proy = this.verDetallesProyecto(proyectID);

            Responsable res = (ResponsableImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(proy.getResponsable()));
            String proyectName = proy.getNombre();
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Proyecto aceptado.";
            String content = "Este correo es para informarte que tu solicitud para postular el proyecto: " + proyectName + " en el sistema de servicio social de nuestra facultad ha sido existosa.\nLos alumnos podrán, a partir de ahora, postularse para participar en tu proyecto. Debes mantenerte al tanto de dichas solicitudes y revisar a los participantes, a fin de tener los mejores resultados. \n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail, accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }
    }

    /**
     * Este metodo solo lo ejecuta el administrador. Sirve para rechazar un
     * proyecto, lo cual hace que el proyecto sea eliminado de la base de datos
     * directamente.
     * 
     * @param idAdmin El tipo del usuario que llama este metodo, debe coincidir
     *            con el tipo del administrador.
     */
    public void rechazarProyecto(final int proyectID) throws DBCreationException, DBModificationException {
       
        try {

            Proyecto proy = this.verDetallesProyecto(proyectID);

            Responsable res = (ResponsableImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(proy.getResponsable()));
            String proyectName = proy.getNombre();
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Proyecto rechazado.";
            String content = "Este correo es para informarte que tu solicitud para postular el proyecto: " + proyectName + " en el sistema de servicio social de nuestra facultad ha fracasado.\nCualquier duda sobre esta decisión deberás llevarla con el administrador del sistema, contactándolo en el correo pre-determinado para esta función.. \n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail, accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }
         boolean rechazado = false;
        modificaProyecto(proyectID, rechazado);

    }

    /**
     * Metodo auxiliar que se encarga de hacer la llamada 
     * para autorizar o rechar el proyecto.
     */
    private void modificaProyecto(final int proyectID, final boolean estado) throws DBCreationException, DBModificationException {
        ConectaDb conexion = new ConectaDbImpl();
        conexion.autorizarProyectoDb(proyectID);
    }

    /**
     * {@inheritDoc}
     */
    public String[][] dameRespPendientes() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        return conexion.pendingResp();
    }

    /**
     * {@inheritDoc}
     */
    public String[][] dameAlumPendientes() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        return conexion.pendingAlum();
    }

    /**
     * {@inheritDoc}
     */
    public void rechazarResponsable(final int respID) throws DBCreationException, DBModificationException {
        try {
            Responsable res = (ResponsableImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(respID));
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Has sido rechazado en el sistema de servicio social de la facultad de ciencias.";
            String content = "Este correo es para informarte que tu solicitud para ser un Responsable de Proyecto en nuestra facultad ha fracasado. \nCualquier duda sobre esta decisión deberás llevarla con el administrador del sistema, contactándolo en el correo pre-determinado para esta función.. \n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail, accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }
        ConectaDb conexion = new ConectaDbImpl();
        conexion.rechazaResponsableDb(respID);
    }

    /**
     * {@inheritDoc}
     */
    public void rechazarAlumnoProyecto(final int studentID, final int proyectID) throws DBCreationException, DBModificationException {
        
        try {

            Alumno res = (AlumnoImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(studentID));
            Proyecto proy = this.verDetallesProyecto(proyectID);
            String proyectName = proy.getNombre();
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Has sido rechazado en un proyecto.";
            String content = "Este correo es para informarte que tu solicitud para participar en el proyecto: " + proyectName + " de nuestra facultad ha fracasado.Cualquier duda sobre esta decisión deberás llevarla con el administrador del sistema, contactándolo en el correo pre-determinado para esta función.. \n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail, accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }
        ConectaDb conexion = new ConectaDbImpl();
        conexion.rechazaAlumnoProyectoDb(proyectID, studentID);
    }
} //AdminImpl
