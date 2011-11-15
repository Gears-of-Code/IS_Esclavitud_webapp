/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.proyectos.impl;

import mx.gearsofcode.proyservsocial.logico.proyectos.*;

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
public class ProyectosFactoryImpl extends EFactoryImpl implements
        ProyectosFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ProyectosFactory init() {
        try {
            ProyectosFactory theProyectosFactory = (ProyectosFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///proyservsocial/logico/proyectos.ecore");
            if (theProyectosFactory != null) {
                return theProyectosFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ProyectosFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProyectosFactoryImpl() {
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
        case ProyectosPackage.PROYECTO:
            return createProyecto();
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
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case ProyectosPackage.CARRERA_PROYECTO:
            return createCarreraProyectoFromString(eDataType, initialValue);
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
        case ProyectosPackage.CARRERA_PROYECTO:
            return convertCarreraProyectoToString(eDataType, instanceValue);
        case ProyectosPackage.ESTADO_PROYECTO:
            return convertEstadoProyectoToString(eDataType, instanceValue);
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
    public Proyecto createProyecto() {
        ProyectoImpl proyecto = new ProyectoImpl();
        return proyecto;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CarreraProyecto createCarreraProyectoFromString(EDataType eDataType,
            String initialValue) {
        CarreraProyecto result = CarreraProyecto.get(initialValue);
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
    public String convertCarreraProyectoToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEstadoProyectoToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProyectosPackage getProyectosPackage() {
        return (ProyectosPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ProyectosPackage getPackage() {
        return ProyectosPackage.eINSTANCE;
    }

} //ProyectosFactoryImpl
