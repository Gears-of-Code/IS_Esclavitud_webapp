/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.proyectos;

import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Proyecto</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getId <em>
 * Id</em>}</li>
 * <li>{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getNombre
 * <em>Nombre</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getResponsable
 * <em>Responsable</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getAreaConocimiento
 * <em>Area Conocimiento</em>}</li>
 * <li>{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEmail
 * <em>Email</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getTelefono
 * <em>Telefono</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDireccion
 * <em>Direccion</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getCarrera
 * <em>Carrera</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getMaxParticipante
 * <em>Max Participante</em>}</li>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDescripcion
 * <em>Descripcion</em>}</li>
 * <li>{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEstado
 * <em>Estado</em>}</li>
 * </ul>
 * </p>
 * 
 * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto()
 * @model
 * @generated
 */
public interface Proyecto {
    /**
     * Regresa el valor del '<em><b>Id</b></em>' del proyecto.
     * 
     * <p>
     * El '<em>Id</em>' es la referencia unica de un proyecto por medio de esta
     * se le puede referenciar de manera directa.
     * </p>
     * 
     * @return Un entero que identifica al proyecto.
     * @see #setId(int)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Id()
     */
    int getId();

    /**
     * Coloca el '{@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getId <em>Id</em>}'
     * del proyecto, esto lo debe hacer la base de datos cuando lo almacena.
     * 
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     */
    void setId(int value);

    /**
     * Returns the value of the '<em><b>Nombre</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nombre</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Nombre</em>' attribute.
     * @see #setNombre(String)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Nombre()
     * @model required="true" ordered="false"
     * @generated
     */
    String getNombre();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getNombre
     * <em>Nombre</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value the new value of the '<em>Nombre</em>' attribute.
     * @see #getNombre()
     * @generated
     */
    void setNombre(String value);

    /**
     * Returns the value of the '<em><b>Responsable</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Responsable</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Responsable</em>' attribute.
     * @see #setResponsable(int)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Responsable()
     * @model required="true" ordered="false"
     * @generated
     */
    int getResponsable();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getResponsable
     * <em>Responsable</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value the new value of the '<em>Responsable</em>' attribute.
     * @see #getResponsable()
     * @generated
     */
    void setResponsable(int value);

    /**
     * Returns the value of the '<em><b>Area Conocimiento</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Area Conocimiento</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Area Conocimiento</em>' attribute.
     * @see #setAreaConocimiento(String)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_AreaConocimiento()
     * @model required="true" ordered="false"
     * @generated
     */
    
    int[] getAreaConocimiento();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getAreaConocimiento
     * <em>Area Conocimiento</em>}' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @param value the new value of the '<em>Area Conocimiento</em>' attribute.
     * @see #getAreaConocimiento()
     * @generated
     */
    void setAreaConocimiento(final int[] value);

    /**
     * Returns the value of the '<em><b>Email</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Email</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Email</em>' attribute.
     * @see #setEmail(String)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Email()
     * @model required="true" ordered="false"
     * @generated
     */
    String getEmail();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getEmail
     * <em>Email</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Email</em>' attribute.
     * @see #getEmail()
     * @generated
     */
    void setEmail(String value);

    /**
     * Returns the value of the '<em><b>Telefono</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Telefono</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Telefono</em>' attribute.
     * @see #setTelefono(int)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Telefono()
     * @model required="true" ordered="false"
     * @generated
     */
    int getTelefono();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getTelefono
     * <em>Telefono</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value the new value of the '<em>Telefono</em>' attribute.
     * @see #getTelefono()
     * @generated
     */
    void setTelefono(int value);

    /**
     * Returns the value of the '<em><b>Direccion</b></em>' attribute. <!--
     * begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Direccion</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Direccion</em>' attribute.
     * @see #setDireccion(String)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Direccion()
     * @model required="true" ordered="false"
     * @generated
     */
    String getDireccion();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDireccion
     * <em>Direccion</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value the new value of the '<em>Direccion</em>' attribute.
     * @see #getDireccion()
     * @generated
     */
    void setDireccion(String value);

    /**
     * Returns the value of the '<em><b>Carrera</b></em>' attribute. The
     * literals are from the enumeration
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Carrera</em>' attribute isn't clear, there
     * really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Carrera</em>' attribute.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto
     * @see #setCarrera(CarreraProyecto)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Carrera()
     * @model required="true" ordered="false"
     * @generated
     */
    int[] getCarreras();

    /**
     * Sets the value of the '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getCarrera
     * <em>Carrera</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @param value the new value of the '<em>Carrera</em>' attribute.
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.CarreraProyecto
     * @see #getCarreras()
     * @generated
     */
    void setCarreras(final int[] value);

    /**
     * Obtiene el valor del atributo '<em><b>Max Participante</b></em>'.
     * 
     * <p>
     * Nos regresa el numero maximo de participantes que puede haber en el proyecto.
     * </p>
     * 
     * @return El numero maximo de participantes.
     * @see #setMaxParticipantes(int)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_MaxParticipante()
     */
    int getMaxParticipantes();

    /**
     * Cambia o coloca el numero maximo de paricipantes en un proyecto. Coloca el valor del atributo '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getMaxParticipante
     * <em>Max Participante</em>}' 
     * 
     * @param value El numero maximo de participantes permitido.
     * @see #getMaxParticipantes()
     */
    void setMaxParticipantes(int value);

    /**
     * Obtiene el valor del atributo '<em><b>Descripcion</b></em>'.
     *
     * <p>
     * La descripcion breve del proyecto que se esta consultando.
     * </p>
     * 
     * @return La descripcion del proyecto que estamos consultando.
     * @see #setDescripcion(String)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Descripcion()
     */
    String getDescripcion();

    /**
     * Cambia o coloca la descripcion del proyecto. Coloca el valor del atributo '
     * {@link mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto#getDescripcion
     * <em>Descripcion</em>}'. 
     * 
     * 
     * @param value Descripcion del proyecto.
     * @see #getDescripcion()
     * @generated
     */
    void setDescripcion(String value);

    /**
     * Devuelve el estado del proyecto.
     * 
     * <p>
     * El valor del '<em>Estado</em>' se refiere a si el proyecto se encuentra
     * autorizado por el administrador o aun esta en espera de autorizacion.
     * </p>
     * 
     * @return True = Aceptado o False = En proceso de autorizacion
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.EstadoProyecto
     * @see #setEstado(EstadoProyecto)
     * @see mx.gearsofcode.proyservsocial.logico.proyectos.ProyectosPackage#getProyecto_Estado()
     */
    boolean getEstado();

    /**
     * Muestra el bloque de usuarios que se han postulado a un proyecto.
     * 
     * @param idUsuario Solo los ids de responsable y administrador pueden usar
     *            este metodo.
     * @return int[][] 
     * @throws DBConsultException 
     */
    String[][] verListaPostulados(final int idUsuario) throws DBConsultException;

} // Proyecto
