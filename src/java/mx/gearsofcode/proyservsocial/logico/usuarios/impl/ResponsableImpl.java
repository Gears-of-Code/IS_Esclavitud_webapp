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
import mx.gearsofcode.proyservsocial.logico.impl.ConectaDbImpl;

import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;

import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;
import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl;

/**
 * Clase que implementa la interfaz '<em><b>Responsable<b><em>'.
 * contiene las funciones y atributos particulares de un responsable.
 * <p>
 * Las siguientes funciones se encuentran disponibles:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl#getDescripcion <em>Descripcion</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl#getSitioweb <em>Sitioweb</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl#isEstado <em>Estado</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#aceptaAlumnoProyecto <em>Aceota Alumno Proyecto</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#registrarse <em>Registrarse</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Responsable#proponerProyecto <em>Proponer Proyecto</em>}</li>
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
     * Valor por default que muestra '{@link #getDescripcion() <em>Descripcion</em>}'
     * si no hay una descripcion disponible.
     *
     * @see #getDescripcion()
     */
    protected static final String DESCRIPCION_EDEFAULT = "No hay descripcion disponible.";

    /**
     * Valor almacenado en '{@link #getDescripcion() <em>Descripcion</em>}'.
     *
     * @see #getDescripcion()
     */
    protected String descripcion = DESCRIPCION_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getSitioweb() <em>Sitioweb</em>}'
     * si no hay un sitio web disponible.
     *
     * @see #getSitioweb()
     */
    protected static final String SITIOWEB_EDEFAULT = null;

    /**
     * Valor almacenado en '{@link #getSitioweb() <em>Sitioweb</em>}'.
     *
     * @see #getSitioweb()
     */
    protected String sitioweb = SITIOWEB_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #isEstado() <em>Estado</em>}'.
     * Este valor es con el que siempre inicia el responsable antes de ser
     * autorizado.
     *
     * @see #isEstado()
     */
    protected static final boolean ESTADO_EDEFAULT = false;

    /**
     * Valor almacenado en '{@link #isEstado() <em>Estado</em>}'.
     *
     * @see #isEstado()
     */
    protected boolean estado = ESTADO_EDEFAULT;

    /**
     * Se declara un elemento tipo ConectaDb.
     * Clase ConectaDb contiene los metodos de conexion a la base de datos.
     * Aqui se realizan los queries directamente a la base de datos.
     **/
    private ConectaDb conexion = null;

    /**
     * Constructor del objeto ResponsableImpl.
     */
    public ResponsableImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * {@inheritDoc}
     */
    public void setDescripcion(String newDescripcion) {
        String oldDescripcion = descripcion;
        descripcion = newDescripcion;
    }

    /**
     * {@inheritDoc}
     */
    public String getSitioweb() {
        return sitioweb;
    }

    /**
     * {@inheritDoc}
     */
    public void setSitioweb(String newSitioweb) {
        String oldSitioweb = sitioweb;
        sitioweb = newSitioweb;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * {@inheritDoc}
     */
    public void setEstado(boolean newEstado) {
        boolean oldEstado = estado;
        estado = newEstado;
    }

    /**
     * Se apoya de la conexion a la BD para aceptar a un alumno.
     *
     * @param proyectID El ID del proyecto donde se aceptaran los alumnos.
     * @param studentIDs La lista con IDs de los estudiantes a ser aceptados.
     * @throws DBCreationException
     */
    public void aceptaAlumnoProyecto(final int proyectID, int[] studentIDs) throws DBModificationException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        for (int i = 0; i < studentIDs.length; i++) {
            int studentID = studentIDs[i];
            conexion.aceptarAlumnoProyectoDb(proyectID, studentID);
        }
    }

    /**
     * Metodo con el que el objeto que llama se registra en la base de datos
     * usando la Conexion de ConectaDB
     *
     * @throws DBCreationException
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
        ConectaDb conexion = new ConectaDbImpl();
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
     *
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
        Proyecto nuevoProyecto = new ProyectoImpl();
        nuevoProyecto.setNombre(nomProy);
        nuevoProyecto.setDescripcion(descrProy);
        nuevoProyecto.setDireccion(dirProy);
        nuevoProyecto.setEmail(mailProy);
        nuevoProyecto.setTelefono(telProy);
        nuevoProyecto.setMaxParticipantes(capMax);
        nuevoProyecto.setResponsable(this.getId());
        nuevoProyecto.setAreaConocimiento(areaDeConocimiento);
        nuevoProyecto.setCarreras(carreraProy);
        conexion = new ConectaDbImpl();
        conexion.proponerProyectoDb(nuevoProyecto);
    }

    /**
     * Imprime todos los elementos del objeto en una cadena.
     *
     * @return String Cadena con toda la informacion
     * del objeto.
     */
    @Override
    public String toString() {

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
        ConectaDb conexion = new ConectaDbImpl();
        try {
            return conexion.fetchAC();
        } catch (DBConsultException ex) {
            Logger.getLogger(ResponsableImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new DBCreationException(ex.getMessage());
        }
    }

    public String[][] dameCAR() throws DBConsultException, DBCreationException {
        ConectaDb conexion = new ConectaDbImpl();
        try {
            return conexion.fetchCAR();
        } catch (DBConsultException ex) {
            Logger.getLogger(ResponsableImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new DBCreationException(ex.getMessage());
        }
    }
} //ResponsableImpl
