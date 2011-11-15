/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.*;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class InicioDeSesionFactoryImpl extends EFactoryImpl implements
        InicioDeSesionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static InicioDeSesionFactory init() {
        try {
            InicioDeSesionFactory theInicioDeSesionFactory = (InicioDeSesionFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///proyservsocial/logico/inicioDeSesion.ecore");
            if (theInicioDeSesionFactory != null) {
                return theInicioDeSesionFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new InicioDeSesionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InicioDeSesionFactoryImpl() {
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
        case InicioDeSesionPackage.SESION:
            return createSesion();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName()
                    + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sesion createSesion() {
        SesionImpl sesion = new SesionImpl();
        return sesion;
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case InicioDeSesionPackage.TIPO_USUARIO:
            return createTipoUsuarioFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '"
                    + eDataType.getName() + "' is not a valid classifier");
        }
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case InicioDeSesionPackage.TIPO_USUARIO:
            return convertTipoUsuarioToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '"
                    + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TipoUsuario createTipoUsuarioFromString(EDataType eDataType,
            String initialValue) {
        TipoUsuario result = TipoUsuario.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException("The value '" + initialValue
                    + "' is not a valid enumerator of '" + eDataType.getName()
                    + "'");
        return result;
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTipoUsuarioToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InicioDeSesionPackage getInicioDeSesionPackage() {
        return (InicioDeSesionPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static InicioDeSesionPackage getPackage() {
        return InicioDeSesionPackage.eINSTANCE;
    }

} //InicioDeSesionFactoryImpl
