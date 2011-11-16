/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import java.util.logging.Level;
import java.util.logging.Logger;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion;

import mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import mx.gearsofcode.proyservsocial.logico.impl.LogicoFactoryImpl;
import mx.gearsofcode.proyservsocial.logico.ConectaDb;

import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;
import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectosFactoryImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario;
import mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usuario Registrado</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getId <em>Id</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getContraseña <em>Contraseña</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getTelefono <em>Telefono</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuarioRegistradoImpl#getSesion <em>Sesion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsuarioRegistradoImpl implements
        UsuarioRegistrado {

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final int ID_EDEFAULT = -1;
    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected int id = ID_EDEFAULT;
    /**
     * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected static final String USERNAME_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUsername()
     * @generated
     * @ordered
     */
    protected String username = USERNAME_EDEFAULT;
    /**
     * The default value of the '{@link #getContraseña() <em>Contraseña</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContraseña()
     * @generated
     * @ordered
     */
    protected static final String CONTRASEÑA_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getContraseña() <em>Contraseña</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContraseña()
     * @generated
     * @ordered
     */
    protected String contraseña = CONTRASEÑA_EDEFAULT;
    /**
     * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTipo()
     * @generated
     * @ordered
     */
    protected static final int TIPO_EDEFAULT = -1;
    /**
     * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTipo()
     * @generated
     * @ordered
     */
    protected int tipo = TIPO_EDEFAULT;
    /**
     * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNombre()
     * @generated
     * @ordered
     */
    protected static final String NOMBRE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNombre()
     * @generated
     * @ordered
     */
    protected String nombre = NOMBRE_EDEFAULT;
    /**
     * The default value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTelefono()
     * @generated
     * @ordered
     */
    protected static final String TELEFONO_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getTelefono() <em>Telefono</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTelefono()
     * @generated
     * @ordered
     */
    protected String telefono = TELEFONO_EDEFAULT;
    /**
     * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected static final String EMAIL_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmail()
     * @generated
     * @ordered
     */
    protected String email = EMAIL_EDEFAULT;
    /**
     * The cached value of the '{@link #getSesion() <em>Sesion</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSesion()
     * @generated
     * @ordered
     */
    protected Sesion sesion;
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
    protected UsuarioRegistradoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__ID, oldId, id));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUsername() {
        return username;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__USERNAME, oldUsername,
                    username));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContraseña(String newContraseña) {
        String oldContraseña = contraseña;
        contraseña = newContraseña;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__CONTRASEÑA,
                    oldContraseña, contraseña));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getTipo() {
        /*
         * LOGICO MAPPING
         * ADMIN ---> 0
         * RESP  ---> 1
         * ALUMN ---> 2
         * DB MAPPING
         * ADMIN ---> 1
         * RESP  ---> 3
         * ALUMN ---> 2
         */
        switch(this.tipo){
            case 0:
                return 1;
            case 1:
                return 3;
            case 2:
                return 2;
            default:
                return -1;
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTipo(final int newTipo) {
        int oldTipo = tipo;
        tipo = (newTipo == -1) ? TIPO_EDEFAULT : newTipo;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__TIPO, oldTipo, tipo));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNombre(String newNombre) {
        String oldNombre = nombre;
        nombre = newNombre;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__NOMBRE, oldNombre,
                    nombre));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTelefono(String newTelefono) {
        String oldTelefono = telefono;
        telefono = newTelefono;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__TELEFONO, oldTelefono,
                    telefono));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEmail(String newEmail) {
        String oldEmail = email;
        email = newEmail;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__EMAIL, oldEmail, email));
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sesion getSesion() {
        if (sesion != null && sesion.eIsProxy()) {
            InternalEObject oldSesion = (InternalEObject) sesion;
            sesion = (Sesion) eResolveProxy(oldSesion);
            if (sesion != oldSesion) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            UsuariosPackage.USUARIO_REGISTRADO__SESION,
                            oldSesion, sesion));
                }
            }
        }
        return sesion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Sesion basicGetSesion() {
        return sesion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSesion(Sesion newSesion) {
        Sesion oldSesion = sesion;
        sesion = newSesion;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.USUARIO_REGISTRADO__SESION, oldSesion,
                    sesion));
        }
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
        result.append(" (id: ");
        result.append(id);
        result.append(", username: ");
        result.append(username);
        result.append(", contraseña: ");
        result.append(contraseña);
        result.append(", tipo: ");
        result.append(tipo);
        result.append(", nombre: ");
        result.append(nombre);
        result.append(", telefono: ");
        result.append(telefono);
        result.append(", email: ");
        result.append(email);
        result.append(')');
        return result.toString();
    }

    /**
     * Llama a la base de datos para obtener y listar todos los proyectos
     * que se encuentran disponibles para el usuario.
     *
     * @throws DBConsultException
     * @throws DBCreationException
     */
    public String[][] verProyectos() throws DBConsultException, DBCreationException {

        conexion = new LogicoFactoryImpl().createConectaDb();
        LinkedList<String[]> queryResult = conexion.verProyectosDb(tipo, id);

        // String[] bloqueproyectos contiene ["id","Nombre"]
        // Nota anterior para saber en que orden esta la informacion (Capa de Interfaz)

        String[][] bloqueProyectos = armaArregloDeLista(queryResult);

        return bloqueProyectos;
    }

    /**
     * Llama a la base de datos y obtiene una vista reducida o filtada de
     * los proyectos dependiendo del caso de usuario que este realizando
     * la consulta.
     *
     * @throws DBConsultException
     * @throws DBCreationException
     */
    public String[][] verMisProyectos() throws DBConsultException, DBCreationException {

        conexion = new LogicoFactoryImpl().createConectaDb();
        boolean aux = (this.tipo == 2)? ((AlumnoImpl)this).estado: false;
        LinkedList<String[]> queryResult = conexion.verMisProyectosDb(tipo, id, aux); //Tipo de usuario y id de usuario.

        // String[] bloqueproyectos contiene ["id","Nombre"]
        // Nota anterior para saber en que orden esta la informacion (Capa de Interfaz)

        String[][] bloqueProyectos = armaArregloDeLista(queryResult);

        return bloqueProyectos;
    }

    /**
     * Funcion auxiliar que construye un arreglo bidimensional
     * a partir de una lista ligada.
     */
    private String[][] armaArregloDeLista(final LinkedList<String[]> queryResults) {

        int pos = 0;
        int misProy = queryResults.size();

        // String[] bloqueproyectos contiene ["id","Nombre"]
        String[][] bloque = new String[misProy][2];

        for (String[] unProy : queryResults) {
            bloque[pos] = unProy;
            pos++;
        }

        return bloque;
    }

    /**
     * Llama a la base de datos para obtener los datos detallados de un
     * proyecto y se los despliega al usuario.
     *
     * @param idProyecto Un identificador de algun proyecto.
     * @throws DBCreationException
     */
    public Proyecto verDetallesProyecto(final int idProyect) throws DBConsultException, DBCreationException {

        conexion = new LogicoFactoryImpl().createConectaDb();
        ResultSet queryResult = conexion.verDetallesProyectoDb(idProyect);
        Proyecto unProyecto = new ProyectosFactoryImpl().createProyecto();
        /*
        [1] -> nombre  responsable
        [2] -> nombre  proyectos
        [3] -> areas de conocimientos
        [4] -> carreras
        [5] -> email del poyecto
        [6] -> telefono del poyecto
        [7] -> direccion del poyecto
        [8] -> maximo Participantes
        [9] -> Descripcion del problema
         */
        String nomProy, descrProy, dirProy, mailProy;
        int[] areaDeConocimiento = null;
        int[] carreraProy = null;
        int capMax, id_resp, telProy;
        try {
            if (queryResult.next()) {
                nomProy = queryResult.getString("nombre");
                descrProy = (String) (queryResult.getString("descripcion"));
                dirProy = (String) (queryResult.getString("direccion"));
                mailProy = (String) (queryResult.getString("email"));
                telProy = ((Integer) (queryResult.getInt("telefono")));
                id_resp = ((Integer) (queryResult.getInt("id_u")));
                capMax = ((Integer) (queryResult.getInt("maxParticipantes")));

                LinkedHashSet<Integer> tmpCareer, tmpKnow;
                tmpCareer = new LinkedHashSet<Integer>();
                tmpKnow = new LinkedHashSet<Integer>();

                while (queryResult.next()) {
                    tmpCareer.add(queryResult.getInt("id_c"));
                    tmpKnow.add(queryResult.getInt("id_ac"));
                }

                carreraProy = armaArregloDeSet(tmpCareer);
                areaDeConocimiento = armaArregloDeSet(tmpKnow);

                unProyecto.setId(idProyect);
                unProyecto.setNombre(nomProy);
                unProyecto.setDescripcion(descrProy);
                unProyecto.setDireccion(dirProy);
                unProyecto.setEmail(mailProy);
                unProyecto.setTelefono(telProy);
                unProyecto.setMaxParticipantes(capMax);
                unProyecto.setResponsable(id_resp);
                unProyecto.setAreaConocimiento(areaDeConocimiento);
                unProyecto.setCarreras(carreraProy);
            } else {
                throw new DBConsultException("Could not get proyect with ID:" + idProyect);
            }

        } catch (SQLException dbException) {
            //TODO: do something meaningful with this exception
            DBConsultException e = new DBConsultException(dbException.getMessage() + "  " + dbException.getSQLState());
            throw e;
        }

        return unProyecto;
    }

    /**
     * Funcion auxiliar que construye un arreglo bidimensional
     * a partir de una lista ligada.
     */
    private int[] armaArregloDeSet(final LinkedHashSet<Integer> queryResults) {

        int pos = 0;
        int misProy = queryResults.size();

        // int[] bloque contiene ["id"]
        int[] bloque = new int[misProy];

        for (int elem : queryResults) {
            bloque[pos] = elem;
            pos++;
        }

        return bloque;
    }

    public UsuarioRegistrado verDetallesUsuario(int userId) throws DBConsultException {
        UsuarioRegistrado user = null;
        ResultSet queryResult = null;
        int userType = -1;

        try {
            conexion = new LogicoFactoryImpl().createConectaDb();
            userType = conexion.getUserType(userId);
            queryResult = conexion.fetchUserInfo(userId, userType);

        } catch (DBCreationException ex) {
            Logger.getLogger(UsuarioRegistradoImpl.class.getName()).log(Level.SEVERE, null, ex);
            DBConsultException exx = new DBConsultException(ex.getCause() + "  " + ex.getMessage());
            exx.setErrorCode(0);
            throw exx;
        }

        boolean status;
        String usuarioTipo = "";
        String usuarioNombre = "";
        String usuarioMail = "";
        int usuarioPhone = 0;
        int idUsuario = -1;

        try {
            queryResult.next();
            idUsuario = queryResult.getInt("id_u");
            switch (userType) {
                case 0:
                    user = new UsuariosFactoryImpl().createAdmin();
                    break;
                case 1:
                    user = new UsuariosFactoryImpl().createResponsable();
                    ((ResponsableImpl) user).setDescripcion(queryResult.getString("descripcion"));
                    ((ResponsableImpl) user).setSitioweb(queryResult.getString("sitioweb"));
                    status = (queryResult.getString("estado").compareToIgnoreCase("1") == 0) ? true : false;
                    ((ResponsableImpl) user).setEstado(status);
                    ((ResponsableImpl) user).setId(idUsuario);
                    break;
                case 2:
                    user = new UsuariosFactoryImpl().createAlumno();
                    ((AlumnoImpl) user).setCarrera(queryResult.getString("nombreCarrera"));
                    status = (queryResult.getString("estado").compareToIgnoreCase("1") == 0) ? true : false;
                    ((AlumnoImpl) user).setEstado(status);
                    ((AlumnoImpl) user).setPorcentaje(queryResult.getInt("porcentaje"));
                    break;
                default:
                    DBConsultException cons = new DBConsultException("Invalid user type");
                    cons.setErrorCode(8);
                    throw cons;
            }

            usuarioTipo = queryResult.getString("tipo"); // Obtengo el tipo de usuario
            // del query.
            usuarioNombre = queryResult.getString("nombreUsuario");
            usuarioMail = queryResult.getString("email");
            usuarioPhone = queryResult.getInt("telefono");
            usuarioTipo = usuarioTipo.toUpperCase();//los tipos estan en mayus, entonces hay que darle gusto.
            int tipoUsuario = TipoUsuario.valueOf(usuarioTipo).getValue(); // Mapea
            user.setTipo(tipoUsuario);
            user.setNombre(usuarioNombre);
            user.setEmail(usuarioMail);
            user.setId(idUsuario);
            user.setTelefono(usuarioPhone + "");
        } catch (SQLException ex) {
            DBConsultException cons = new DBConsultException(ex.getMessage() + "," + ex.getSQLState());
            cons.setErrorCode(0);
            throw cons;
        }
        return user;
    }
} //UsuarioRegistradoImpl
