/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.proyectos;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage
 * @generated
 */
public interface ProyectosFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ProyectosFactory eINSTANCE = mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Proyecto</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Proyecto</em>'.
     * @generated
     */
    Proyecto createProyecto();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ProyectosPackage getProyectosPackage();

} //ProyectosFactory
