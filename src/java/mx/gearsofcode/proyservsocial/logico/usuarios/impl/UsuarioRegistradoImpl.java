/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario;

import mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado;
import mx.gearsofcode.proyservsocial.logico.usuarios.Alumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;

import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.impl.ConectaDbImpl;

import mx.gearsofcode.proyservsocial.logico.proyectos.Proyecto;
import mx.gearsofcode.proyservsocial.logico.proyectos.impl.ProyectoImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashSet;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Clase que implementa la interfaz de '<em><b>Usuario Registrado</b></em>'.
 * Contiene los metodos para acceder a los datos basicos
 * y funciones generales de los usuarios del sistema
 */
public class UsuarioRegistradoImpl implements
        UsuarioRegistrado {

    /**
     * Valor por default que muestra  '{@link #getId() <em>Id</em>}'
     * si no hay un id.
     *
     * @see #getId()
     */
    protected static final int ID_EDEFAULT = -1;

    /**
     * Valor almacenado en '{@link #getId() <em>Id</em>}'.
     *
     * @see #getId()
     */
    protected int id = ID_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getUsername() <em>Username</em>}'
     * si no hay un username.
     *
     * @see #getUsername()
     */
    protected static final String USERNAME_EDEFAULT = "";

    /**
     * Valor almacenado en '{@link #getUsername() <em>Username</em>}'.
     *
     * @see #getUsername()
     */
    protected String username = USERNAME_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getContraseña() <em>Contraseña</em>}'
     * si no hay contraseña.
     *
     * @see #getContraseña()
     */
    protected static final String CONTRASEÑA_EDEFAULT = "";

    /**
     * Valor almacenado en '{@link #getContraseña() <em>Contraseña</em>}'.
     *
     * @see #getContraseña()
     */
    protected String contraseña = CONTRASEÑA_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getTipo() <em>Tipo</em>}'
     * si no hay un tipo definido.
     *
     * @see #getTipo()
     */
    protected static final int TIPO_EDEFAULT = -1;

    /**
     * Valor almacenado en '{@link #getTipo() <em>Tipo</em>}'.
     *
     * @see #getTipo()
     */
    protected int tipo = TIPO_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getNombre() <em>Nombre</em>}'
     * si no hay un nombre de usuario definido.
     *
     * @see #getNombre()
     */
    protected static final String NOMBRE_EDEFAULT = "";

    /**
     * Valor almacenado en '{@link #getNombre() <em>Nombre</em>}'.
     *
     * @see #getNombre()
     */
    protected String nombre = NOMBRE_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getTelefono() <em>Telefono</em>}'
     * si no hay un telefono definido.
     *
     * @see #getTelefono()
     */
    protected static final String TELEFONO_EDEFAULT = "";

    /**
     * Valor almacenado en '{@link #getTelefono() <em>Telefono</em>}'.
     *
     * @see #getTelefono()
     */
    protected String telefono = TELEFONO_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getEmail() <em>Email</em>}'
     * si no hay un email definido.
     *
     * @see #getEmail()
     */
    protected static final String EMAIL_EDEFAULT = "";

    /**
     * Valor almacenado en '{@link #getEmail() <em>Email</em>}'.
     *
     * @see #getEmail()
     */
    protected String email = EMAIL_EDEFAULT;

    /**
     * Se declara un elemento tipo ConectaDb.
     * Clase ConectaDb contiene los metodos de conexion a la base de datos.
     * Aqui se realizan los queries directamente a la base de datos.
     **/
    private ConectaDb conexion = null;

    /**
     * Constructor del objeto UsuarioRegistrado.
     */
    public UsuarioRegistradoImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public int getId() {
        return id;
    }

    /**
     * {@inheritDoc}
     */
    public void setId(int newId) {
        int oldId = id;
        id = newId;
    }

    /**
     * {@inheritDoc}
     */
    public String getUsername() {
        return username;
    }

    /**
     * {@inheritDoc}
     */
    public void setUsername(String newUsername) {
        String oldUsername = username;
        username = newUsername;
    }

    /**
     * {@inheritDoc}
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * {@inheritDoc}
     */
    public void setContraseña(String newContraseña) {
        String oldContraseña = contraseña;
        contraseña = newContraseña;
    }

    /**
     * {@inheritDoc}
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
     * {@inheritDoc}
     */
    public void setTipo(final int newTipo) {
        int oldTipo = tipo;
        tipo = (newTipo == -1) ? TIPO_EDEFAULT : newTipo;
    }

    /**
     * {@inheritDoc}
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * {@inheritDoc}
     */
    public void setNombre(String newNombre) {
        String oldNombre = nombre;
        nombre = newNombre;
    }

    /**
     * {@inheritDoc}
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * {@inheritDoc}
     */
    public void setTelefono(String newTelefono) {
        String oldTelefono = telefono;
        telefono = newTelefono;
    }

    /**
     * {@inheritDoc}
     */
    public String getEmail() {
        return email;
    }

    /**
     * {@inheritDoc}
     */
    public void setEmail(String newEmail) {
        String oldEmail = email;
        email = newEmail;
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

        conexion = new ConectaDbImpl();
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

        conexion = new ConectaDbImpl();
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
     *
     * @param queryResults Es una lista ligada de cadenas que contiene
     * los resultados del query a la base de datos.
     * @return Arreglo bidimensional con los datos solicitados de la
     * forma [id, nombre].
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
    public Proyecto verDetallesProyecto(final int idProyect) throws
        DBConsultException, DBCreationException {

        conexion = new ConectaDbImpl();
        ResultSet queryResult = conexion.verDetallesProyectoDb(idProyect);
        Proyecto unProyecto = new ProyectoImpl();
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
     *
     * @param queryResults Es una lista ligada de enteros que contiene
     * los resultados del query a la base de datos.
     * @return Arreglo con los datos solicitados de la
     * forma [id].
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


    public UsuarioRegistrado verDetallesUsuario(final int userId) throws DBConsultException {
        UsuarioRegistrado user = null;
        ResultSet queryResult = null;
        int userType = -1;

        try {
            conexion = new ConectaDbImpl();
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
                    user = new AdminImpl();
                    break;
                case 1:
                    user = new ResponsableImpl();
                    ((ResponsableImpl) user).setDescripcion(queryResult.getString("descripcion"));
                    ((ResponsableImpl) user).setSitioweb(queryResult.getString("sitioweb"));
                    status = (queryResult.getString("estado").compareToIgnoreCase("1") == 0) ? true : false;
                    ((ResponsableImpl) user).setEstado(status);
                    ((ResponsableImpl) user).setId(idUsuario);
                    break;
                case 2:
                    user = new AlumnoImpl();
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
