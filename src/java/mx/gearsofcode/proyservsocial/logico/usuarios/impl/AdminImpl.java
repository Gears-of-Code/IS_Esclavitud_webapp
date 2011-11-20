/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.impl.LogicoFactoryImpl;
import mx.gearsofcode.proyservsocial.logico.usuarios.Admin;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;
import mx.gearsofcode.proyservsocial.logico.util.Mailing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdminImpl extends UsuarioRegistradoImpl implements Admin {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AdminImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * Método que se manda llamar cuando un Administrador de Sistema pulsa aceptar, luego 
     * de haber seleccionado dentro de una lista a los responsables de proyecto que desea
     * autorizar.
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @generated NOT
     */
    public void aceptaResponsable(final int respID) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        conexion.aceptarResponsableDb(respID);
        try {
            Responsable res = (ResponsableImpl) (((UsuarioRegistradoImpl) this).verDetallesUsuario(respID));
            String userMail = res.getEmail();
            Mailing dove = new Mailing();
            String accepted = "Has sido aceptado al sistema de servicio social de la facultad de ciencias.";
            String content = "Este correo es para informarte que tu solicitud para ser un Responsable de Proyecto en nuestra facultad ha sido existosa. Te recordamos que las credenciales que proporcionaste en tu registro son:\nUsuario: "+res.getUsername()+"\nContraseña:"+res.getContraseña()+"\nSi tienes algun problema, favor de revisar el manual del usuaio o contactar al administrador del sistema.\n\n\nEste mensaje fue generado de forma automática y por tanto no hay necesidad de responderlo.";
            dove.sendmail(userMail,accepted, content);
        } catch (DBConsultException cons) {
            throw new DBCreationException(cons.getMessage());
        }

    }

    /**
     * <!-- begin-user-doc -->
     * Método que se utiliza para dejar constancia de que un alumno ha sido autorizado en un proyecto.
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @generated NOT
     */
    public void actualizaEstadoAlumno(final int studentID, boolean studentState) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        //falta metodo de ConectaDb modificarEstadoAlumno(final int studentID, boolean studentState)
        //se agrega temporalmente.
        conexion.modificarEstadoAlumno(studentID, studentState);
    }

    /**
     * <!-- begin-user-doc -->
     * Método que se utiliza para actualizar al alumno autorizado en un proyecto dado.
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @generated NOT
     */
    public void autorizarAlumnoProyecto(final int studentID, final int proyectID) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        //falta metodo de ConectaDb autorizarAlumnoProyecto(final int studentID, final int proyectID)
        //se agrega temporalmente.
        conexion.autorizarAlumnoProyecto(studentID, proyectID);
        this.actualizaEstadoAlumno(studentID, true);
        //TODO:sendmail
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
        //TODO:sendmail
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
        boolean rechazado = false;
        modificaProyecto(proyectID, rechazado);
        //TODO:sendmail
    }

    /**
     * Metodo auxiliar que se encarga de hacer la llamada 
     * para autorizar o rechar el proyecto.
     */
    private void modificaProyecto(final int proyectID, final boolean estado) throws DBCreationException, DBModificationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        conexion.autorizarProyectoDb(proyectID);
    }

    public String[][] dameRespPendientes() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        return conexion.pendingResp();
    }

    public String[][] dameAlumPendientes() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        return conexion.pendingAlum();
    }

    public void rechazarResponsable(final int respID) throws DBCreationException, DBModificationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        conexion.rechazaResponsableDb(respID);
        //TODO:sendmail
    }

    public void rechazarAlumnoProyecto(final int studentID, final int proyectID) throws DBCreationException, DBModificationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        conexion.rechazaAlumnoProyectoDb(proyectID, studentID);
        //TODO:sendmail
    }
} //AdminImpl
