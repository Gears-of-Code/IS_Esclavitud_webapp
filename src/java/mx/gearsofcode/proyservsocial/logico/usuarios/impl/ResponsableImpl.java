/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

import mx.gearsofcode.proyservsocial.logico.impl.LogicoFactoryImpl;
import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosFactoryImpl;
import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Responsable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl#getSitioweb <em>Sitioweb</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl#isEstado <em>Estado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsableImpl extends UsuarioRegistradoImpl implements
        Responsable {

//    protected static final int ID_RESP = -1;
    //  protected int id_resp = ID_RESP;
    /**
     * The default value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescripcion()
     * @generated
     * @ordered
     */
    protected static final String DESCRIPCION_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getDescripcion() <em>Descripcion</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDescripcion()
     * @generated
     * @ordered
     */
    protected String descripcion = DESCRIPCION_EDEFAULT;
    /**
     * The default value of the '{@link #getSitioweb() <em>Sitioweb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSitioweb()
     * @generated
     * @ordered
     */
    protected static final String SITIOWEB_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getSitioweb() <em>Sitioweb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSitioweb()
     * @generated
     * @ordered
     */
    protected String sitioweb = SITIOWEB_EDEFAULT;
    /**
     * The default value of the '{@link #isEstado() <em>Estado</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEstado()
     * @generated
     * @ordered
     */
    protected static final boolean ESTADO_EDEFAULT = false;
    /**
     * The cached value of the '{@link #isEstado() <em>Estado</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isEstado()
     * @generated
     * @ordered
     */
    protected boolean estado = ESTADO_EDEFAULT;
    /**
     * Se declara un elemento tipo ConectaDb.
     * Clase ConectaDb contiene los metodos de conexion a la base de datos.
     * Aqui se realizan los queries directamente a la base de datos.
     **/
    private ConectaDb conexion = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResponsableImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDescripcion(String newDescripcion) {
        String oldDescripcion = descripcion;
        descripcion = newDescripcion;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.RESPONSABLE__DESCRIPCION, oldDescripcion,
                    descripcion));
        }
    }

    /*    public int getIdResp() {
    return id_resp;
    }
    
    public void setIdResp(final int idresponsable) {
    id_resp = idresponsable;
    }
     */
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSitioweb() {
        return sitioweb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSitioweb(String newSitioweb) {
        String oldSitioweb = sitioweb;
        sitioweb = newSitioweb;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.RESPONSABLE__SITIOWEB, oldSitioweb,
                    sitioweb));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEstado(boolean newEstado) {
        boolean oldEstado = estado;
        estado = newEstado;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.RESPONSABLE__ESTADO, oldEstado, estado));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * Se apoya de la conexion a la BD para aceptar a un alumno.
     * @param proyectID El ID del proyecto donde se aceptaran los alumnos.
     * @param studentIDs La lista con IDs de los estudiantes a ser aceptados.
     * <!-- end-user-doc -->
     * @throws DBCreationException 
     * @generated NOT
     */
    public void aceptaAlumnoProyecto(final int proyectID, int[] studentIDs) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        for (int i = 0; i < studentIDs.length; i++) {
            int studentID = studentIDs[i];
            conexion.aceptarAlumnoProyectoDb(proyectID, studentID);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * Metodo con el que el objeto que llama se registra en la base de datos
     * usando la Conexion de ConectaDB
     * <!-- end-user-doc -->
     * @param password 
     * @param description 
     * @param mail 
     * @param phone 
     * @param name 
     * @param website 
     * @param type 
     * @param login 
     * @throws DBCreationException 
     * @generated NOT
     */
    public void registrarse(String password, String description, String mail, String phone, String name, String website, int type, String login) throws DBCreationException {
        this.contraseña = password;
        this.descripcion = description;
        this.email = mail;
        this.telefono = phone;
        this.nombre = name;
        this.sitioweb = website;
        this.tipo = type;
        this.username = login;
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        try {
            conexion.registrarDb(this);
        } catch (DBConsultException ex) {
            Logger.getLogger(ResponsableImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new DBCreationException(ex.getMessage());
        }
    }

    /**
     * Metodo que dara de alta un nuevo proyecto en la base
     * de datos. Este proyecto siempre esta en estado false 
     * que implica que esta en "proceso de autorizacion".
     * @param nomProy Nombre del proyecto.
     * @param descrProy Descripcion de lo que se hara en el proyecto.
     * @param dirProy Direccion del sitio donde se realizara el proyecto.
     * @param mailProy Direccion de correo electronico del proyecto.
     * @param telProy Telefono de contacto.
     * @param capMax Numero maximo de participantes para este proyecto.
     * @param carreraProy A que carreras esta dirigido o se prefieren para este servicio social.
     * @param areaDeConocimiento A que areas de conocimiento esta dirigido el proyecto.
     * @throws DBCreationException 
     */
    public void proponerProyecto(final String nomProy, final String descrProy,
            final String dirProy, final String mailProy, final int telProy,
            final int capMax, final int[] carreraProy, final int[] areaDeConocimiento) throws DBCreationException {
        Proyecto nuevoProyecto = new ProyectosFactoryImpl().createProyecto();
        nuevoProyecto.setNombre(nomProy);
        nuevoProyecto.setDescripcion(descrProy);
        nuevoProyecto.setDireccion(dirProy);
        nuevoProyecto.setEmail(mailProy);
        nuevoProyecto.setTelefono(telProy);
        nuevoProyecto.setMaxParticipantes(capMax);
        nuevoProyecto.setResponsable(this.getId());
        nuevoProyecto.setAreaConocimiento(areaDeConocimiento);
        nuevoProyecto.setCarreras(carreraProy);
        conexion = new LogicoFactoryImpl().createConectaDb();
        conexion.proponerProyectoDb(nuevoProyecto);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) {
            return super.toString();
        }

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (descripcion: ");
        result.append(descripcion);
        result.append(", sitioweb: ");
        result.append(sitioweb);
        result.append(", estado: ");
        result.append(estado);
        result.append(')');
        return result.toString();
    }

    public String[][] dameAC() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        try {
            return conexion.fetchAC();
        } catch (DBConsultException ex) {
            Logger.getLogger(ResponsableImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new DBCreationException(ex.getMessage());
        }
    }

    public String[][] dameCAR() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
        try {
            return conexion.fetchCAR();
        } catch (DBConsultException ex) {
            Logger.getLogger(ResponsableImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new DBCreationException(ex.getMessage());
        }
    }
} //ResponsableImpl
