/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;


import mx.gearsofcode.proyservsocial.logico.usuarios.*;

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
public class UsuariosFactoryImpl extends EFactoryImpl implements
        UsuariosFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UsuariosFactory init() {
        try {
            UsuariosFactory theUsuariosFactory = (UsuariosFactory) EPackage.Registry.INSTANCE
                    .getEFactory("http:///proyservsocial/logico/usuarios.ecore");
            if (theUsuariosFactory != null) {
                return theUsuariosFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UsuariosFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsuariosFactoryImpl() {
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
        case UsuariosPackage.ALUMNO:
            return createAlumno();
        case UsuariosPackage.ADMIN:
            return createAdmin();
        case UsuariosPackage.RESPONSABLE:
            return createResponsable();
        case UsuariosPackage.USUARIO_REGISTRADO:
            return createUsuarioRegistrado();
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
        case UsuariosPackage.CARRERA_ALUMNO:
            return createCarreraAlumnoFromString(eDataType, initialValue);
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
        case UsuariosPackage.CARRERA_ALUMNO:
            return convertCarreraAlumnoToString(eDataType, instanceValue);
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
    public Alumno createAlumno() {
        AlumnoImpl alumno = new AlumnoImpl();
        return alumno;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Admin createAdmin() {
        AdminImpl admin = new AdminImpl();
        return admin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Responsable createResponsable() {
        ResponsableImpl responsable = new ResponsableImpl();
        return responsable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsuarioRegistrado createUsuarioRegistrado() {
        UsuarioRegistradoImpl usuarioRegistrado = new UsuarioRegistradoImpl();
        return usuarioRegistrado;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CarreraAlumno createCarreraAlumnoFromString(EDataType eDataType,
            String initialValue) {
        CarreraAlumno result = CarreraAlumno.get(initialValue);
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
    public String convertCarreraAlumnoToString(EDataType eDataType,
            Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsuariosPackage getUsuariosPackage() {
        return (UsuariosPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UsuariosPackage getPackage() {
        return UsuariosPackage.eINSTANCE;
    }

} //UsuariosFactoryImpl
