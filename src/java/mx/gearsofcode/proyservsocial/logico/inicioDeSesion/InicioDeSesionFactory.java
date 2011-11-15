/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion;


import org.eclipse.emf.ecore.EFactory;


/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage
 * @generated
 */
public interface InicioDeSesionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    InicioDeSesionFactory eINSTANCE = mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Sesion</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sesion</em>'.
     * @generated
     */
    Sesion createSesion();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    InicioDeSesionPackage getInicioDeSesionPackage();

} //InicioDeSesionFactory
