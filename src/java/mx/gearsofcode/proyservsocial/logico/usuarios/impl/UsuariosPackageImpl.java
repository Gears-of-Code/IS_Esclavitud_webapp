/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import mx.gearsofcode.proyservsocial.logico.LogicoPackage;

import mx.gearsofcode.proyservsocial.logico.impl.LogicoPackageImpl;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.InicioDeSesionPackageImpl;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage;

import mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage;

import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl;

import mx.gearsofcode.proyservsocial.logico.usuarios.Admin;
import mx.gearsofcode.proyservsocial.logico.usuarios.Alumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosFactory;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;

import org.eclipse.emf.ecore.EAttribute;
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
public class UsuariosPackageImpl extends EPackageImpl implements
        UsuariosPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass alumnoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass adminEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass responsableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass usuarioRegistradoEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum carreraAlumnoEEnum = null;



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
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UsuariosPackageImpl() {
        super(eNS_URI, UsuariosFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link UsuariosPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UsuariosPackage init() {
        if (isInited)
            return (UsuariosPackage) EPackage.Registry.INSTANCE
                    .getEPackage(UsuariosPackage.eNS_URI);

        // Obtain or create and register package
        UsuariosPackageImpl theUsuariosPackage = (UsuariosPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof UsuariosPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI) : new UsuariosPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        LogicoPackageImpl theLogicoPackage = (LogicoPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(LogicoPackage.eNS_URI) instanceof LogicoPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(LogicoPackage.eNS_URI) : LogicoPackage.eINSTANCE);
        InicioDeSesionPackageImpl theInicioDeSesionPackage = (InicioDeSesionPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI) instanceof InicioDeSesionPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(InicioDeSesionPackage.eNS_URI)
                : InicioDeSesionPackage.eINSTANCE);
        ProyectosPackageImpl theProyectosPackage = (ProyectosPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI) instanceof ProyectosPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(ProyectosPackage.eNS_URI)
                : ProyectosPackage.eINSTANCE);

        // Create package meta-data objects
        theUsuariosPackage.createPackageContents();
        theLogicoPackage.createPackageContents();
        theInicioDeSesionPackage.createPackageContents();
        theProyectosPackage.createPackageContents();

        // Initialize created meta-data
        theUsuariosPackage.initializePackageContents();
        theLogicoPackage.initializePackageContents();
        theInicioDeSesionPackage.initializePackageContents();
        theProyectosPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUsuariosPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UsuariosPackage.eNS_URI,
                theUsuariosPackage);
        return theUsuariosPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAlumno() {
        return alumnoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAlumno_Carrera() {
        return (EAttribute) alumnoEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAlumno_Porcentaje() {
        return (EAttribute) alumnoEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAlumno_Estado() {
        return (EAttribute) alumnoEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdmin() {
        return adminEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResponsable() {
        return responsableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResponsable_Descripcion() {
        return (EAttribute) responsableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResponsable_Sitioweb() {
        return (EAttribute) responsableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResponsable_Estado() {
        return (EAttribute) responsableEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUsuarioRegistrado() {
        return usuarioRegistradoEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Id() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Username() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Contraseña() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Tipo() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Nombre() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Telefono() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUsuarioRegistrado_Email() {
        return (EAttribute) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUsuarioRegistrado_Sesion() {
        return (EReference) usuarioRegistradoEClass.getEStructuralFeatures()
                .get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getCarreraAlumno() {
        return carreraAlumnoEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsuariosFactory getUsuariosFactory() {
        return (UsuariosFactory) getEFactoryInstance();
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
        alumnoEClass = createEClass(ALUMNO);
        createEAttribute(alumnoEClass, ALUMNO__CARRERA);
        createEAttribute(alumnoEClass, ALUMNO__PORCENTAJE);
        createEAttribute(alumnoEClass, ALUMNO__ESTADO);

        adminEClass = createEClass(ADMIN);

        responsableEClass = createEClass(RESPONSABLE);
        createEAttribute(responsableEClass, RESPONSABLE__DESCRIPCION);
        createEAttribute(responsableEClass, RESPONSABLE__SITIOWEB);
        createEAttribute(responsableEClass, RESPONSABLE__ESTADO);

        usuarioRegistradoEClass = createEClass(USUARIO_REGISTRADO);
        createEAttribute(usuarioRegistradoEClass, USUARIO_REGISTRADO__ID);
        createEAttribute(usuarioRegistradoEClass, USUARIO_REGISTRADO__USERNAME);
        createEAttribute(usuarioRegistradoEClass,
                USUARIO_REGISTRADO__CONTRASEÑA);
        createEAttribute(usuarioRegistradoEClass, USUARIO_REGISTRADO__TIPO);
        createEAttribute(usuarioRegistradoEClass, USUARIO_REGISTRADO__NOMBRE);
        createEAttribute(usuarioRegistradoEClass, USUARIO_REGISTRADO__TELEFONO);
        createEAttribute(usuarioRegistradoEClass, USUARIO_REGISTRADO__EMAIL);
        createEReference(usuarioRegistradoEClass, USUARIO_REGISTRADO__SESION);

        // Create enums
        carreraAlumnoEEnum = createEEnum(CARRERA_ALUMNO);

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

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        alumnoEClass.getESuperTypes().add(this.getUsuarioRegistrado());
        adminEClass.getESuperTypes().add(this.getUsuarioRegistrado());
        responsableEClass.getESuperTypes().add(this.getUsuarioRegistrado());

        // Initialize classes and features; add operations and parameters
        initEClass(alumnoEClass, Alumno.class, "Alumno", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAlumno_Carrera(), this.getCarreraAlumno(), "carrera",
                "", 1, 1, Alumno.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        initEAttribute(getAlumno_Porcentaje(), ecorePackage.getEInt(),
                "porcentaje", null, 1, 1, Alumno.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getAlumno_Estado(), ecorePackage.getEBoolean(),
                "estado", "false", 1, 1, Alumno.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        addEOperation(alumnoEClass, null, "postularseAProyecto", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        addEOperation(adminEClass, null, "aceptaResponsable", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(adminEClass, null, "actualizaEstadoAlumno", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(adminEClass, null, "autorizarAlumnoProyecto", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        initEClass(responsableEClass, Responsable.class, "Responsable",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResponsable_Descripcion(), ecorePackage.getEString(),
                "descripcion", null, 1, 1, Responsable.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getResponsable_Sitioweb(), ecorePackage.getEString(),
                "sitioweb", null, 1, 1, Responsable.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getResponsable_Estado(), ecorePackage.getEBoolean(),
                "estado", "false", 1, 1, Responsable.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);

        addEOperation(responsableEClass, null, "aceptaAlumnoProyecto", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        addEOperation(responsableEClass, null, "registrarse", 1, 1, IS_UNIQUE,
                !IS_ORDERED);

        addEOperation(responsableEClass, null, "seleccionarAlumnos", 1, 1,
                IS_UNIQUE, !IS_ORDERED);

        initEClass(usuarioRegistradoEClass, UsuarioRegistrado.class,
                "UsuarioRegistrado", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUsuarioRegistrado_Id(), ecorePackage.getEInt(), "id",
                "-1", 1, 1, UsuarioRegistrado.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEAttribute(getUsuarioRegistrado_Username(),
                ecorePackage.getEString(), "username", null, 1, 1,
                UsuarioRegistrado.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        initEAttribute(getUsuarioRegistrado_Contraseña(),
                ecorePackage.getEString(), "contraseña", null, 1, 1,
                UsuarioRegistrado.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);

        initEAttribute(getUsuarioRegistrado_Nombre(),
                ecorePackage.getEString(), "nombre", null, 1, 1,
                UsuarioRegistrado.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        initEAttribute(getUsuarioRegistrado_Telefono(),
                ecorePackage.getEString(), "telefono", null, 1, 1,
                UsuarioRegistrado.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
                !IS_ORDERED);
        initEAttribute(getUsuarioRegistrado_Email(), ecorePackage.getEString(),
                "email", null, 1, 1, UsuarioRegistrado.class, !IS_TRANSIENT,
                !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, !IS_ORDERED);
        initEReference(getUsuarioRegistrado_Sesion(),
                theInicioDeSesionPackage.getSesion(), null, "sesion", null, 1,
                1, UsuarioRegistrado.class, !IS_TRANSIENT, !IS_VOLATILE,
                IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(carreraAlumnoEEnum, CarreraAlumno.class, "CarreraAlumno");
        addEEnumLiteral(carreraAlumnoEEnum, CarreraAlumno.MATEMATICAS);
        addEEnumLiteral(carreraAlumnoEEnum, CarreraAlumno.ACTUARIA);
        addEEnumLiteral(carreraAlumnoEEnum,
                CarreraAlumno.CIENCIAS_COMPUTACIONALES);
        addEEnumLiteral(carreraAlumnoEEnum, CarreraAlumno.FISICA);
        addEEnumLiteral(carreraAlumnoEEnum, CarreraAlumno.BIOLOGIA);
        addEEnumLiteral(carreraAlumnoEEnum, CarreraAlumno.CIENCIAS_DE_LA_TIERRA);
        addEEnumLiteral(carreraAlumnoEEnum,
                CarreraAlumno.MANEJO_SUSTENTABLE_DE_ZONAS_COSTERAS);
        addEEnumLiteral(carreraAlumnoEEnum, CarreraAlumno.CIENCIAS_AMBIENTALES);


    }

} //UsuariosPackageImpl
