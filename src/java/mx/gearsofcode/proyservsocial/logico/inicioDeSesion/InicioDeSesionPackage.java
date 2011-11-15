/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionFactory
 * @model kind="package"
 * @generated
 */
public interface InicioDeSesionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "inicioDeSesion";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///proyservsocial/logico/inicioDeSesion.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "proyservsocial.logico.inicioDeSesion";
    
    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario <em>Tipo Usuario</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getTipoUsuario()
     * @generated
     */
    int TIPO_USUARIO = 5;

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InicioDeSesionPackage eINSTANCE = mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionPackageImpl
            .init();

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.SesionImpl <em>Sesion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.SesionImpl
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionPackageImpl#getSesion()
     * @generated
     */
    int SESION = 0;

    /**
     * The feature id for the '<em><b>Usuario</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESION__USUARIO = 0;

    /**
     * The number of structural features of the '<em>Sesion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESION_FEATURE_COUNT = 1;

    /**
     * Returns the meta object for class '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion <em>Sesion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sesion</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion
     * @generated
     */
    EClass getSesion();

    /**
     * Returns the meta object for the reference '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion#getUsuario <em>Usuario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Usuario</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion#getUsuario()
     * @see #getSesion()
     * @generated
     */
    EReference getSesion_Usuario();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    InicioDeSesionFactory getInicioDeSesionFactory();
    
    /**
     * Returns the meta object for enum '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario <em>Tipo Usuario</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Tipo Usuario</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario
     * @generated
     */
    EEnum getTipoUsuario();


    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.SesionImpl <em>Sesion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.SesionImpl
         * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionPackageImpl#getSesion()
         * @generated
         */
        EClass SESION = eINSTANCE.getSesion();

        /**
         * The meta object literal for the '<em><b>Usuario</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SESION__USUARIO = eINSTANCE.getSesion_Usuario();
        
        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario <em>Tipo Usuario</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getTipoUsuario()
         * @generated
         */
        EEnum TIPO_USUARIO = eINSTANCE.getTipoUsuario();

    }

} //InicioDeSesionPackage
