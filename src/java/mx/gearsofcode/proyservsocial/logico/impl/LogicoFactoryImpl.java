/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.impl;

import java.sql.SQLException;

import mx.gearsofcode.proyservsocial.logico.*;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicoFactoryImpl extends EFactoryImpl implements LogicoFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static LogicoFactory init() {
        try {
            LogicoFactory theLogicoFactory = (LogicoFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///proyservsocial/logico.ecore");
            if (theLogicoFactory != null) {
                return theLogicoFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new LogicoFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogicoFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case LogicoPackage.CONECTA_DB:
                try {
                    return createConectaDb();
                } catch (DBCreationException e) {
                    e.printStackTrace();
                    e.getCause();
                }
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName()
                    + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @throws DBCreationException 
     * @throws SQLException 
     * @generated
     */
    public ConectaDb createConectaDb() throws DBCreationException {
        ConectaDbImpl conectaDb = new ConectaDbImpl();
        return conectaDb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogicoPackage getLogicoPackage() {
        return (LogicoPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static LogicoPackage getPackage() {
        return LogicoPackage.eINSTANCE;
    }

} //LogicoFactoryImpl
