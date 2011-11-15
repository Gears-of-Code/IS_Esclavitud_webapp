/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.proyectos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosFactory
 * @model kind="package"
 * @generated
 */
public interface ProyectosPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "proyectos";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http:///proyservsocial/logico/proyectos.ecore";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "proyservsocial.logico.proyectos";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ProyectosPackage eINSTANCE = mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl
            .init();

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl <em>Proyecto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl#getProyecto()
     * @generated
     */
    int PROYECTO = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__ID = 0;

    /**
     * The feature id for the '<em><b>Nombre</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__NOMBRE = 1;

    /**
     * The feature id for the '<em><b>Responsable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__RESPONSABLE = 2;

    /**
     * The feature id for the '<em><b>Area Conocimiento</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__AREA_CONOCIMIENTO = 3;

    /**
     * The feature id for the '<em><b>Email</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__EMAIL = 4;

    /**
     * The feature id for the '<em><b>Telefono</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__TELEFONO = 5;

    /**
     * The feature id for the '<em><b>Direccion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__DIRECCION = 6;

    /**
     * The feature id for the '<em><b>Carrera</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__CARRERA = 7;

    /**
     * The feature id for the '<em><b>Max Participante</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__MAX_PARTICIPANTE = 8;

    /**
     * The feature id for the '<em><b>Descripcion</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__DESCRIPCION = 9;

    /**
     * The feature id for the '<em><b>Estado</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO__ESTADO = 10;

    /**
     * The number of structural features of the '<em>Proyecto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROYECTO_FEATURE_COUNT = 11;

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto <em>Carrera Proyecto</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl#getCarreraProyecto()
     * @generated
     */
    int CARRERA_PROYECTO = 1;

    /**
     * The meta object id for the '{@link mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto <em>Estado Proyecto</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl#getEstadoProyecto()
     * @generated
     */
    int ESTADO_PROYECTO = 2;

    /**
     * Returns the meta object for class '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto <em>Proyecto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Proyecto</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto
     * @generated
     */
    EClass getProyecto();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getId()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Id();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getNombre <em>Nombre</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Nombre</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getNombre()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Nombre();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getResponsable <em>Responsable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Responsable</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getResponsable()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Responsable();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getAreaConocimiento <em>Area Conocimiento</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Area Conocimiento</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getAreaConocimiento()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_AreaConocimiento();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEmail <em>Email</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Email</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEmail()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Email();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getTelefono <em>Telefono</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Telefono</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getTelefono()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Telefono();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDireccion <em>Direccion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direccion</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDireccion()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Direccion();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getCarrera <em>Carrera</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Carrera</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getCarreras()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Carrera();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getMaxParticipante <em>Max Participante</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Participante</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getMaxParticipantes()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_MaxParticipante();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDescripcion <em>Descripcion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Descripcion</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDescripcion()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Descripcion();

    /**
     * Returns the meta object for the attribute '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEstado <em>Estado</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Estado</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEstado()
     * @see #getProyecto()
     * @generated
     */
    EAttribute getProyecto_Estado();

    /**
     * Returns the meta object for enum '{@link mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto <em>Carrera Proyecto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Carrera Proyecto</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto
     * @generated
     */
    EEnum getCarreraProyecto();

    /**
     * Returns the meta object for enum '{@link mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto <em>Estado Proyecto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Estado Proyecto</em>'.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto
     * @generated
     */
    EEnum getEstadoProyecto();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ProyectosFactory getProyectosFactory();

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
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl <em>Proyecto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl
         * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl#getProyecto()
         * @generated
         */
        EClass PROYECTO = eINSTANCE.getProyecto();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__ID = eINSTANCE.getProyecto_Id();

        /**
         * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__NOMBRE = eINSTANCE.getProyecto_Nombre();

        /**
         * The meta object literal for the '<em><b>Responsable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__RESPONSABLE = eINSTANCE.getProyecto_Responsable();

        /**
         * The meta object literal for the '<em><b>Area Conocimiento</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__AREA_CONOCIMIENTO = eINSTANCE
                .getProyecto_AreaConocimiento();

        /**
         * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__EMAIL = eINSTANCE.getProyecto_Email();

        /**
         * The meta object literal for the '<em><b>Telefono</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__TELEFONO = eINSTANCE.getProyecto_Telefono();

        /**
         * The meta object literal for the '<em><b>Direccion</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__DIRECCION = eINSTANCE.getProyecto_Direccion();

        /**
         * The meta object literal for the '<em><b>Carrera</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__CARRERA = eINSTANCE.getProyecto_Carrera();

        /**
         * The meta object literal for the '<em><b>Max Participante</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__MAX_PARTICIPANTE = eINSTANCE
                .getProyecto_MaxParticipante();

        /**
         * The meta object literal for the '<em><b>Descripcion</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__DESCRIPCION = eINSTANCE.getProyecto_Descripcion();

        /**
         * The meta object literal for the '<em><b>Estado</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROYECTO__ESTADO = eINSTANCE.getProyecto_Estado();

        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto <em>Carrera Proyecto</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto
         * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl#getCarreraProyecto()
         * @generated
         */
        EEnum CARRERA_PROYECTO = eINSTANCE.getCarreraProyecto();

        /**
         * The meta object literal for the '{@link mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto <em>Estado Proyecto</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto
         * @see mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosPackageImpl#getEstadoProyecto()
         * @generated
         */
        EEnum ESTADO_PROYECTO = eINSTANCE.getEstadoProyecto();

    }

} //ProyectosPackage
