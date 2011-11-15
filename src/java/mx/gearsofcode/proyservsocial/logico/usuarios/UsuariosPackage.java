/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosFactory
 * @model kind="package"
 * @generated
 */
public interface UsuariosPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "usuarios";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///proyservsocial/logico/usuarios.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "proyservsocial.logico.usuarios";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UsuariosPackage eINSTANCE = mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl
            .init();

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl <em>Usuario Registrado</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getUsuarioRegistrado()
     * @generated
     */
    int USUARIO_REGISTRADO = 3;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__ID = 0;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__USERNAME = 1;

    /**
     * The feature id for the '<em><b>Contraseña</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__CONTRASEÑA = 2;

    /**
     * The feature id for the '<em><b>Tipo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__TIPO = 3;

    /**
     * The feature id for the '<em><b>Nombre</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__NOMBRE = 4;

    /**
     * The feature id for the '<em><b>Telefono</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__TELEFONO = 5;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__EMAIL = 6;

    /**
     * The feature id for the '<em><b>Sesion</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO__SESION = 7;

    /**
     * The number of structural features of the '<em>Usuario Registrado</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USUARIO_REGISTRADO_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl <em>Alumno</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getAlumno()
     * @generated
     */
    int ALUMNO = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__ID = USUARIO_REGISTRADO__ID;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__USERNAME = USUARIO_REGISTRADO__USERNAME;

    /**
     * The feature id for the '<em><b>Contraseña</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__CONTRASEÑA = USUARIO_REGISTRADO__CONTRASEÑA;

    /**
     * The feature id for the '<em><b>Tipo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__TIPO = USUARIO_REGISTRADO__TIPO;

    /**
     * The feature id for the '<em><b>Nombre</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__NOMBRE = USUARIO_REGISTRADO__NOMBRE;

    /**
     * The feature id for the '<em><b>Telefono</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__TELEFONO = USUARIO_REGISTRADO__TELEFONO;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__EMAIL = USUARIO_REGISTRADO__EMAIL;

    /**
     * The feature id for the '<em><b>Sesion</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__SESION = USUARIO_REGISTRADO__SESION;

    /**
     * The feature id for the '<em><b>Carrera</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__CARRERA = USUARIO_REGISTRADO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Porcentaje</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__PORCENTAJE = USUARIO_REGISTRADO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Estado</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO__ESTADO = USUARIO_REGISTRADO_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Alumno</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ALUMNO_FEATURE_COUNT = USUARIO_REGISTRADO_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AdminImpl <em>Admin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.AdminImpl
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getAdmin()
     * @generated
     */
    int ADMIN = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__ID = USUARIO_REGISTRADO__ID;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__USERNAME = USUARIO_REGISTRADO__USERNAME;

    /**
     * The feature id for the '<em><b>Contraseña</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__CONTRASEÑA = USUARIO_REGISTRADO__CONTRASEÑA;

    /**
     * The feature id for the '<em><b>Tipo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__TIPO = USUARIO_REGISTRADO__TIPO;

    /**
     * The feature id for the '<em><b>Nombre</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__NOMBRE = USUARIO_REGISTRADO__NOMBRE;

    /**
     * The feature id for the '<em><b>Telefono</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__TELEFONO = USUARIO_REGISTRADO__TELEFONO;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__EMAIL = USUARIO_REGISTRADO__EMAIL;

    /**
     * The feature id for the '<em><b>Sesion</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN__SESION = USUARIO_REGISTRADO__SESION;

    /**
     * The number of structural features of the '<em>Admin</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ADMIN_FEATURE_COUNT = USUARIO_REGISTRADO_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl <em>Responsable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getResponsable()
     * @generated
     */
    int RESPONSABLE = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__ID = USUARIO_REGISTRADO__ID;

    /**
     * The feature id for the '<em><b>Username</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__USERNAME = USUARIO_REGISTRADO__USERNAME;

    /**
     * The feature id for the '<em><b>Contraseña</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__CONTRASEÑA = USUARIO_REGISTRADO__CONTRASEÑA;

    /**
     * The feature id for the '<em><b>Tipo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__TIPO = USUARIO_REGISTRADO__TIPO;

    /**
     * The feature id for the '<em><b>Nombre</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__NOMBRE = USUARIO_REGISTRADO__NOMBRE;

    /**
     * The feature id for the '<em><b>Telefono</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__TELEFONO = USUARIO_REGISTRADO__TELEFONO;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__EMAIL = USUARIO_REGISTRADO__EMAIL;

    /**
     * The feature id for the '<em><b>Sesion</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__SESION = USUARIO_REGISTRADO__SESION;

    /**
     * The feature id for the '<em><b>Descripcion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__DESCRIPCION = USUARIO_REGISTRADO_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Sitioweb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__SITIOWEB = USUARIO_REGISTRADO_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Estado</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE__ESTADO = USUARIO_REGISTRADO_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Responsable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RESPONSABLE_FEATURE_COUNT = USUARIO_REGISTRADO_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno <em>Carrera Alumno</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getCarreraAlumno()
     * @generated
     */
    int CARRERA_ALUMNO = 4;



    /**
     * Returns the meta object for class '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno <em>Alumno</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Alumno</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Alumno
     * @generated
     */
    EClass getAlumno();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getCarrera <em>Carrera</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Carrera</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getCarrera()
     * @see #getAlumno()
     * @generated
     */
    EAttribute getAlumno_Carrera();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getPorcentaje <em>Porcentaje</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Porcentaje</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getPorcentaje()
     * @see #getAlumno()
     * @generated
     */
    EAttribute getAlumno_Porcentaje();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#isEstado <em>Estado</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Estado</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#isEstado()
     * @see #getAlumno()
     * @generated
     */
    EAttribute getAlumno_Estado();

    /**
     * Returns the meta object for class '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Admin <em>Admin</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Admin</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Admin
     * @generated
     */
    EClass getAdmin();

    /**
     * Returns the meta object for class '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable <em>Responsable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Responsable</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Responsable
     * @generated
     */
    EClass getResponsable();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#getDescripcion <em>Descripcion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Descripcion</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#getDescripcion()
     * @see #getResponsable()
     * @generated
     */
    EAttribute getResponsable_Descripcion();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#getSitioweb <em>Sitioweb</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Sitioweb</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#getSitioweb()
     * @see #getResponsable()
     * @generated
     */
    EAttribute getResponsable_Sitioweb();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#isEstado <em>Estado</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Estado</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#isEstado()
     * @see #getResponsable()
     * @generated
     */
    EAttribute getResponsable_Estado();

    /**
     * Returns the meta object for class '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado <em>Usuario Registrado</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Usuario Registrado</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado
     * @generated
     */
    EClass getUsuarioRegistrado();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getId()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Id();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getUsername <em>Username</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Username</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getUsername()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Username();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getContraseña <em>Contraseña</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Contraseña</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getContraseña()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Contraseña();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getTipo <em>Tipo</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Tipo</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getTipo()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Tipo();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getNombre <em>Nombre</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nombre</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getNombre()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Nombre();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getTelefono <em>Telefono</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Telefono</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getTelefono()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Telefono();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getEmail <em>Email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Email</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getEmail()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EAttribute getUsuarioRegistrado_Email();

    /**
     * Returns the meta object for the reference '{@link mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getSesion <em>Sesion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Sesion</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado#getSesion()
     * @see #getUsuarioRegistrado()
     * @generated
     */
    EReference getUsuarioRegistrado_Sesion();

    /**
     * Returns the meta object for enum '{@link mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno <em>Carrera Alumno</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Carrera Alumno</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno
     * @generated
     */
    EEnum getCarreraAlumno();


    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UsuariosFactory getUsuariosFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl <em>Alumno</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getAlumno()
         * @generated
         */
        EClass ALUMNO = eINSTANCE.getAlumno();

        /**
         * The meta object literal for the '<em><b>Carrera</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALUMNO__CARRERA = eINSTANCE.getAlumno_Carrera();

        /**
         * The meta object literal for the '<em><b>Porcentaje</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALUMNO__PORCENTAJE = eINSTANCE.getAlumno_Porcentaje();

        /**
         * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ALUMNO__ESTADO = eINSTANCE.getAlumno_Estado();

        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AdminImpl <em>Admin</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.AdminImpl
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getAdmin()
         * @generated
         */
        EClass ADMIN = eINSTANCE.getAdmin();

        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl <em>Responsable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getResponsable()
         * @generated
         */
        EClass RESPONSABLE = eINSTANCE.getResponsable();

        /**
         * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSABLE__DESCRIPCION = eINSTANCE
                .getResponsable_Descripcion();

        /**
         * The meta object literal for the '<em><b>Sitioweb</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSABLE__SITIOWEB = eINSTANCE.getResponsable_Sitioweb();

        /**
         * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RESPONSABLE__ESTADO = eINSTANCE.getResponsable_Estado();

        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl <em>Usuario Registrado</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getUsuarioRegistrado()
         * @generated
         */
        EClass USUARIO_REGISTRADO = eINSTANCE.getUsuarioRegistrado();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__ID = eINSTANCE.getUsuarioRegistrado_Id();

        /**
         * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__USERNAME = eINSTANCE
                .getUsuarioRegistrado_Username();

        /**
         * The meta object literal for the '<em><b>Contraseña</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__CONTRASEÑA = eINSTANCE
                .getUsuarioRegistrado_Contraseña();

        /**
         * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__TIPO = eINSTANCE
                .getUsuarioRegistrado_Tipo();

        /**
         * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__NOMBRE = eINSTANCE
                .getUsuarioRegistrado_Nombre();

        /**
         * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__TELEFONO = eINSTANCE
                .getUsuarioRegistrado_Telefono();

        /**
         * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute USUARIO_REGISTRADO__EMAIL = eINSTANCE
                .getUsuarioRegistrado_Email();

        /**
         * The meta object literal for the '<em><b>Sesion</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USUARIO_REGISTRADO__SESION = eINSTANCE
                .getUsuarioRegistrado_Sesion();

        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno <em>Carrera Alumno</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno
         * @see mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosPackageImpl#getCarreraAlumno()
         * @generated
         */
        EEnum CARRERA_ALUMNO = eINSTANCE.getCarreraAlumno();

    }

} //UsuariosPackage
