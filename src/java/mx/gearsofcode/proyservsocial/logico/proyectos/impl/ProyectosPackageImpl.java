/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.proyectos.impl;

import mx.gearsofcode.proyservsocial.logico.LogicoPackage;

import mx.gearsofcode.proyservsocial.logico.impl.LogicoPackageImpl;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionPackageImpl;

import mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto;
import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;
import mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosFactory;
import mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage;

import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;

import mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProyectosPackageImpl extends EPackageImpl implements
        ProyectosPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass proyectoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum carreraProyectoEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum estadoProyectoEEnum = null;

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
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ProyectosPackageImpl() {
        super(eNS_URI, ProyectosFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link ProyectosPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ProyectosPackage init() {
        if (isInited)
            return (ProyectosPackage) EPackage.Registry.INSTANCE
                    .getEPackage(ProyectosPackage.eNS_URI);

        // Obtain or create and register package
        ProyectosPackageImpl theProyectosPackage = (ProyectosPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof ProyectosPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new ProyectosPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        LogicoPackageImpl theLogicoPackage = (LogicoPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(LogicoPackage.eNS_URI) instanceof LogicoPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(LogicoPackage.eNS_URI) : LogicoPackage.eINSTANCE);
        InicioDeSesionPackageImpl theInicioDeSesionPackage = (InicioDeSesionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI) instanceof InicioDeSesionPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI)
                : InicioDeSesionPackage.eINSTANCE);
        UsuariosPackageImpl theUsuariosPackage = (UsuariosPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI) instanceof UsuariosPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(UsuariosPackage.eNS_URI)
                : UsuariosPackage.eINSTANCE);

        // Create package meta-data objects
        theProyectosPackage.createPackageContents();
        theLogicoPackage.createPackageContents();
        theInicioDeSesionPackage.createPackageContents();
        theUsuariosPackage.createPackageContents();

        // Initialize created meta-data
        theProyectosPackage.initializePackageContents();
        theLogicoPackage.initializePackageContents();
        theInicioDeSesionPackage.initializePackageContents();
        theUsuariosPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theProyectosPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ProyectosPackage.eNS_URI,
                theProyectosPackage);
        return theProyectosPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProyecto() {
        return proyectoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Id() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Nombre() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Responsable() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_AreaConocimiento() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Email() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Telefono() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Direccion() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Carrera() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_MaxParticipante() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Descripcion() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProyecto_Estado() {
        return (EAttribute) proyectoEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCarreraProyecto() {
        return carreraProyectoEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getEstadoProyecto() {
        return estadoProyectoEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProyectosFactory getProyectosFactory() {
        return (ProyectosFactory) getEFactoryInstance();
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
        proyectoEClass = createEClass(PROYECTO);
        createEAttribute(proyectoEClass, PROYECTO__ID);
        createEAttribute(proyectoEClass, PROYECTO__NOMBRE);
        createEAttribute(proyectoEClass, PROYECTO__RESPONSABLE);
        createEAttribute(proyectoEClass, PROYECTO__AREA_CONOCIMIENTO);
        createEAttribute(proyectoEClass, PROYECTO__EMAIL);
        createEAttribute(proyectoEClass, PROYECTO__TELEFONO);
        createEAttribute(proyectoEClass, PROYECTO__DIRECCION);
        createEAttribute(proyectoEClass, PROYECTO__CARRERA);
        createEAttribute(proyectoEClass, PROYECTO__MAX_PARTICIPANTE);
        createEAttribute(proyectoEClass, PROYECTO__DESCRIPCION);
        createEAttribute(proyectoEClass, PROYECTO__ESTADO);

        // Create enums
        carreraProyectoEEnum = createEEnum(CARRERA_PROYECTO);
        estadoProyectoEEnum = createEEnum(ESTADO_PROYECTO);
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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes and features; add operations and parameters
        initEClass(proyectoEClass, Proyecto.class, "Proyecto", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProyecto_Id(), ecorePackage.getEInt(), "id", null, 1,
                1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Nombre(), ecorePackage.getEString(),
                "nombre", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Responsable(), ecorePackage.getEInt(),
                "responsable", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_AreaConocimiento(),
                ecorePackage.getEString(), "areaConocimiento", null, 1, 1,
                Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Email(), ecorePackage.getEString(), "email",
                null, 1, 1, Proyecto.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        initEAttribute(getProyecto_Telefono(), ecorePackage.getEInt(),
                "telefono", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Direccion(), ecorePackage.getEString(),
                "direccion", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Carrera(), this.getCarreraProyecto(),
                "carrera", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_MaxParticipante(), ecorePackage.getEInt(),
                "maxParticipante", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Descripcion(), ecorePackage.getEString(),
                "descripcion", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getProyecto_Estado(), this.getEstadoProyecto(),
                "estado", null, 1, 1, Proyecto.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        addEOperation(proyectoEClass, null, "verProyectos", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(proyectoEClass, null, "propProyectos", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(proyectoEClass, null, "autorizarProyecto", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(proyectoEClass, null, "rechazarProyecto", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(proyectoEClass, null, "verListaPostulados", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(carreraProyectoEEnum, CarreraProyecto.class,
                "CarreraProyecto");
        addEEnumLiteral(carreraProyectoEEnum, CarreraProyecto.MATEMATICAS);
        addEEnumLiteral(carreraProyectoEEnum, CarreraProyecto.ACTUARIA);
        addEEnumLiteral(carreraProyectoEEnum,
                CarreraProyecto.CIENCIAS_COMPUTACIONALES);
        addEEnumLiteral(carreraProyectoEEnum, CarreraProyecto.FISICA);
        addEEnumLiteral(carreraProyectoEEnum,
                CarreraProyecto.CIENCIAS_DE_LA_TIERRA);
        addEEnumLiteral(carreraProyectoEEnum,
                CarreraProyecto.CIENCIAS_AMBIENTALES);
        addEEnumLiteral(carreraProyectoEEnum, CarreraProyecto.BIOLOGIA);
        addEEnumLiteral(carreraProyectoEEnum,
                CarreraProyecto.MANEJO_SUSTENTABLE_DE_ZONAS_COSTERAS);

    }

} //ProyectosPackageImpl
