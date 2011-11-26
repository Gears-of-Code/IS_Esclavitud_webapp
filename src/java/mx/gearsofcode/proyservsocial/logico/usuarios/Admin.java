/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import java.util.LinkedList;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Admin</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage#getAdmin()
 * @model
 * @generated
 */
public interface Admin extends UsuarioRegistrado {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @model
     * @generated
     */
    void aceptaResponsable(final int respID) throws DBModificationException, DBCreationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @model
     * @generated
     */
    void actualizaEstadoAlumno(final int studentID, boolean studentState) throws DBModificationException, DBCreationException;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @model
     * @generated
     */
    void autorizarAlumnoProyecto(final int studentID, final int proyectID) throws DBModificationException, DBCreationException;

    void autorizarProyecto(final int proyectID) throws DBModificationException, DBCreationException;

    void rechazarProyecto(final int proyectID) throws DBCreationException, DBModificationException;

    String [][] dameRespPendientes() throws DBConsultException, DBCreationException;

    String [][] dameAlumPendientes() throws DBConsultException, DBCreationException;

    void rechazarResponsable(final int respID)  throws DBCreationException, DBModificationException;

    void rechazarAlumnoProyecto(final int studentID, final int proyectID) throws DBCreationException, DBModificationException;
    
    //modulo de estadisticas
     LinkedList<String[]> alumnosPorCarreraDb () throws DBCreationException, DBConsultException;
    
    LinkedList<String[]> proyectosPorCarrerasDb () 
            throws DBCreationException, DBConsultException;
    
    LinkedList<String[]> proyectosPorAreaDb () throws DBCreationException, DBConsultException;
} // Admin
