/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl;

import mx.gearsofcode.proyservsocial.logico.LogicoPackage;


import mx.gearsofcode.proyservsocial.logico.impl.LogicoPackageImpl;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionFactory;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario;

import mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage;

import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl;

import mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;

import mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InicioDeSesionPackageImpl extends EPackageImpl implements
        InicioDeSesionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sesionEClass = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum tipoUsuarioEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private InicioDeSesionPackageImpl() {
        super(eNS_URI, InicioDeSesionFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link InicioDeSesionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static InicioDeSesionPackage init() {
        if (isInited)
            return (InicioDeSesionPackage) EPackage.Registry.INSTANCE
                    .getEPackage(InicioDeSesionPackage.eNS_URI);

        // Obtain or create and register package
        InicioDeSesionPackageImpl theInicioDeSesionPackage = (InicioDeSesionPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof InicioDeSesionPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new InicioDeSesionPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        LogicoPackageImpl theLogicoPackage = (LogicoPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(LogicoPackage.eNS_URI) instanceof LogicoPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(LogicoPackage.eNS_URI) : LogicoPackage.eINSTANCE);
        UsuariosPackageImpl theUsuariosPackage = (UsuariosPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI) instanceof UsuariosPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI)
                : UsuariosPackage.eINSTANCE);
        ProyectosPackageImpl theProyectosPackage = (ProyectosPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI) instanceof ProyectosPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI)
                : ProyectosPackage.eINSTANCE);

        // Create package meta-data objects
        theInicioDeSesionPackage.createPackageContents();
        theLogicoPackage.createPackageContents();
        theUsuariosPackage.createPackageContents();
        theProyectosPackage.createPackageContents();

        // Initialize created meta-data
        theInicioDeSesionPackage.initializePackageContents();
        theLogicoPackage.initializePackageContents();
        theUsuariosPackage.initializePackageContents();
        theProyectosPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theInicioDeSesionPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(InicioDeSesionPackage.eNS_URI,
                theInicioDeSesionPackage);
        return theInicioDeSesionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSesion() {
        return sesionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSesion_Usuario() {
        return (EReference) sesionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTipoUsuario() {
        return tipoUsuarioEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InicioDeSesionFactory getInicioDeSesionFactory() {
        return (InicioDeSesionFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        sesionEClass = createEClass(SESION);
        createEReference(sesionEClass, SESION__USUARIO);
        
        tipoUsuarioEEnum = createEEnum(TIPO_USUARIO);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        UsuariosPackage theUsuariosPackage = (UsuariosPackage) EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(sesionEClass, Sesion.class, "Sesion", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSesion_Usuario(),
                theUsuariosPackage.getUsuarioRegistrado(), null, "usuario",
                null, 1, 1, Sesion.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        addEOperation(sesionEClass, null, "autenticar", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(sesionEClass, null, "cerrarSesion", 1, 1, IS_UNIQUE,
                !IS_ORDERED);
        
        initEAttribute(theUsuariosPackage.getUsuarioRegistrado_Tipo(), this.getTipoUsuario(),
                "tipo", null, 1, 1, UsuarioRegistrado.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        
        initEEnum(tipoUsuarioEEnum, TipoUsuario.class, "TipoUsuario");
        addEEnumLiteral(tipoUsuarioEEnum, TipoUsuario.ADMINISTRADOR);
        addEEnumLiteral(tipoUsuarioEEnum, TipoUsuario.RESPONSABLE);
        addEEnumLiteral(tipoUsuarioEEnum, TipoUsuario.ALUMNO);
    }

} //InicioDeSesionPackageImpl
