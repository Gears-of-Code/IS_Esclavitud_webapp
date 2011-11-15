/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.impl;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.LogicoFactory;
import mx.gearsofcode.proyservsocial.logico.LogicoPackage;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionPackageImpl;

import mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage;

import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl;

import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;

import mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicoPackageImpl extends EPackageImpl implements LogicoPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conectaDbEClass = null;

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
     * @see mx.gearsofcode.proyservsocial.logico.LogicoPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private LogicoPackageImpl() {
        super(eNS_URI, LogicoFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link LogicoPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static LogicoPackage init() {
        if (isInited)
            return (LogicoPackage) EPackage.Registry.INSTANCE
                    .getEPackage(LogicoPackage.eNS_URI);

        // Obtain or create and register package
        LogicoPackageImpl theLogicoPackage = (LogicoPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof LogicoPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new LogicoPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        InicioDeSesionPackageImpl theInicioDeSesionPackage = (InicioDeSesionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI) instanceof InicioDeSesionPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI)
                : InicioDeSesionPackage.eINSTANCE);
        UsuariosPackageImpl theUsuariosPackage = (UsuariosPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI) instanceof UsuariosPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI)
                : UsuariosPackage.eINSTANCE);
        ProyectosPackageImpl theProyectosPackage = (ProyectosPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI) instanceof ProyectosPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI)
                : ProyectosPackage.eINSTANCE);

        // Create package meta-data objects
        theLogicoPackage.createPackageContents();
        theInicioDeSesionPackage.createPackageContents();
        theUsuariosPackage.createPackageContents();
        theProyectosPackage.createPackageContents();

        // Initialize created meta-data
        theLogicoPackage.initializePackageContents();
        theInicioDeSesionPackage.initializePackageContents();
        theUsuariosPackage.initializePackageContents();
        theProyectosPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theLogicoPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(LogicoPackage.eNS_URI, theLogicoPackage);
        return theLogicoPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConectaDb() {
        return conectaDbEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogicoFactory getLogicoFactory() {
        return (LogicoFactory) getEFactoryInstance();
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
        conectaDbEClass = createEClass(CONECTA_DB);
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
        InicioDeSesionPackage theInicioDeSesionPackage = (InicioDeSesionPackage) EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI);
        UsuariosPackage theUsuariosPackage = (UsuariosPackage) EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI);
        ProyectosPackage theProyectosPackage = (ProyectosPackage) EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI);

        // Add subpackages
        getESubpackages().add(theInicioDeSesionPackage);
        getESubpackages().add(theUsuariosPackage);
        getESubpackages().add(theProyectosPackage);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(conectaDbEClass, ConectaDb.class, "ConectaDb", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(conectaDbEClass, null, "verProyectosDb", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "proponerProyectoDBb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "autorizarProyectoDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "rechazarProyectoDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "verPostuladosDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "aceptarAlumnoProyectoDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "registrarDb", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "aceptarResponsableDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "rechazaAlumnoProyectoDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "rechazaResponsableDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "postularAProyectoDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(conectaDbEClass, null, "validaUsuarioDb", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //LogicoPackageImpl
