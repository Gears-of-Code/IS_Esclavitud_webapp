/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico;

import java.sql.SQLException;

import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mx.gearsofcode.proyservsocial.logico.LogicoPackage
 * @generated
 */
public interface LogicoFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    LogicoFactory eINSTANCE = mx.gearsofcode.proyservsocial.logico.impl.LogicoFactoryImpl
            .init();

    /**
     * Returns a new object of class '<em>Conecta Db</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conecta Db</em>'.
     * @throws DBCreationException 
     * @throws SQLException 
     * @generated
     */
    ConectaDb createConectaDb() throws DBCreationException, SQLException;

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    LogicoPackage getLogicoPackage();

} //LogicoFactory
