/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico;

import java.sql.ResultSet;
import java.util.LinkedList;

import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conecta Db</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see mx.gearsofcode.proyservsocial.logico.LogicoPackage#getConectaDb()
 * @model
 * @generated
 */
public interface ConectaDb extends EObject {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    LinkedList<String[]> verProyectosDb(final int tipoUsuario, final int idUsuario)
            throws DBConsultException, DBCreationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void proponerProyectoDb(final Proyecto unProyecto) throws DBCreationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void autorizarProyectoDb(final int idProy) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void rechazarProyectoDb(final int idProy) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return 
     * @model
     * @generated
     */
    LinkedList<String[]> verPostuladosDb(final int idProy) throws DBConsultException, DBCreationException;

    /**
     * @model
     * @generated
     */
    void aceptarAlumnoProyectoDb(final int idProy, final int idAlum) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void registrarDb(final Responsable unResponsable) throws DBCreationException, DBConsultException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void aceptarResponsableDb(final int idResp) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void rechazaAlumnoProyectoDb(final int idProy, final int idAlum) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void rechazaResponsableDb(final int idResp) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    void postularAProyectoDb(final int idProy, final int idAlum) throws DBCreationException, DBModificationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model
     * @generated
     */
    ResultSet validaUsuarioDb(final String nombreUsuario, final String contrasena) throws DBCreationException;

    void modificarEstadoAlumno(final int idAlumno, final boolean estadoAlumno) throws DBCreationException, DBModificationException;

    void autorizarAlumnoProyecto(final int idAlumno, final int idProyecto) throws DBCreationException, DBModificationException;

    ResultSet verDetallesProyectoDb(final int idProyecto) throws DBCreationException;

    LinkedList<String[]> verMisProyectosDb(final int tipoUsuario, final int idUsuario, boolean aux) throws DBCreationException, DBConsultException;

    ResultSet fetchUserInfo(int userId, int userTIpo) throws DBCreationException, DBConsultException;

    int getUserType(int userID) throws DBCreationException, DBConsultException;

    String[][] pendingResp() throws DBCreationException;

    String[][] pendingAlum() throws DBCreationException;

    String[][] fetchAC() throws DBConsultException, DBCreationException;

    String[][] fetchCAR() throws DBConsultException, DBCreationException;
    
    String[] translateAC(int [] array) throws DBConsultException, DBCreationException;
    
    String[] translateCAR(int [] array) throws DBConsultException, DBCreationException;
} // ConectaDb
