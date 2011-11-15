/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage
 * @generated
 */
public interface UsuariosFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UsuariosFactory eINSTANCE = mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Alumno</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Alumno</em>'.
     * @generated
     */
    Alumno createAlumno();

    /**
     * Returns a new object of class '<em>Admin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Admin</em>'.
     * @generated
     */
    Admin createAdmin();

    /**
     * Returns a new object of class '<em>Responsable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Responsable</em>'.
     * @generated
     */
    Responsable createResponsable();

    /**
     * Returns a new object of class '<em>Usuario Registrado</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Usuario Registrado</em>'.
     * @generated
     */
    UsuarioRegistrado createUsuarioRegistrado();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UsuariosPackage getUsuariosPackage();

} //UsuariosFactory
