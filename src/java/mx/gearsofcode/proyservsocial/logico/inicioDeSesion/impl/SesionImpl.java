/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl;

import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.InicioDeSesionPackage;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.Sesion;
import mx.gearsofcode.proyservsocial.logico.inicioDeSesion.TipoUsuario;

import mx.gearsofcode.proyservsocial.logico.usuarios.Responsable;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuarioRegistrado;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;
import mx.gearsofcode.proyservsocial.logico.usuarios.impl.UsuariosFactoryImpl;
import mx.gearsofcode.proyservsocial.logico.util.DBConsultException;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import mx.gearsofcode.proyservsocial.logico.impl.ConectaDbImpl;
import mx.gearsofcode.proyservsocial.logico.usuarios.impl.AdminImpl;
import mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl;
import mx.gearsofcode.proyservsocial.logico.usuarios.impl.ResponsableImpl;


/**
 * La clase '<em><b>Sesion</b></em>' se encarga de manejar parte del inicio de
 * sesion del usuario en el sistema. Acepta o rechaza usuarios y les genera su
 * respectiva clase de trabajo.
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link mx.gearsofcode.proyservsocial.logico.inicioDeSesion.impl.SesionImpl#getUsuario
 * <em>Usuario</em>}</li>
 * </ul>
 * </p>
 * 
 */
public class SesionImpl implements Sesion {

    /**
     * The cached value of the '{@link #getUsuario() <em>Usuario</em>}'
     * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getUsuario()
     * @generated
     * @ordered
     */
    protected UsuarioRegistrado usuario;

    /**
     * Se declara un elemento tipo ConectaDb. Clase ConectaDb contiene los
     * metodos de conexion a la base de datos. Aqui se realizan los queries
     * directamente a la base de datos.
     **/
    private ConectaDb conexion = null;


    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SesionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UsuarioRegistrado getUsuario() {
        if (usuario != null && usuario.eIsProxy()) {
            InternalEObject oldUsuario = (InternalEObject) usuario;
            usuario = (UsuarioRegistrado) eResolveProxy(oldUsuario);
            if (usuario != oldUsuario) {
                if (eNotificationRequired()) {
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            InicioDeSesionPackage.SESION__USUARIO, oldUsuario,
                            usuario));
                }
            }
        }
        return usuario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public UsuarioRegistrado basicGetUsuario() {
        return usuario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setUsuario(UsuarioRegistrado newUsuario) {
        UsuarioRegistrado oldUsuario = usuario;
        usuario = newUsuario;
        if (eNotificationRequired()) {
            eNotify(new ENotificationImpl(this, Notification.SET,
                    InicioDeSesionPackage.SESION__USUARIO, oldUsuario, usuario));
        }
    }

    /**
     * Autenticar va a recibir los valores de un usuario y pasara los datos a un
     * metodo que los validara en la base de datos. Si existen en la base de
     * datos, se accede al sistema sino se manda un mensaje de error.
     * 
     * @param nombreUsuario Nombre del usuario.
     * @param passwd Contrasena del usuario, llega en texto plano.
     * @throws DBConsultException
     */
    public UsuarioRegistrado autenticar(final String nombreUsuario,
            final String md5passwd) throws DBConsultException, DBCreationException {
        UsuarioRegistrado inicioUsuario = null;
        ResultSet data = null;

        String usuarioTipo = "";
        String usuarioNombre = "";
        String usuarioMail = "";
        int usuarioPhone = 0;
        int idUsuario = -1;
        try {
            conexion = new ConectaDbImpl();
            data = conexion.validaUsuarioDb(nombreUsuario, md5passwd); 
	    // Data recibe los esultados del query.

            data.next();

            idUsuario = data.getInt("id_u");
            usuarioTipo = data.getString("tipo"); // Obtengo el tipo de usuario
            // del query.

            usuarioNombre = data.getString("nombre");
            usuarioMail = data.getString("email");
            usuarioPhone = data.getInt("telefono");
        } catch (SQLException e) {
            DBConsultException ex = new DBConsultException(e.getSQLState() + "   "
                    + e.getMessage());
            ex.setErrorCode(6);
            throw ex;

        } catch (DBCreationException dbe) {
            dbe.getCause();
            System.out.println(dbe.toString());
            throw new DBConsultException("uID" + idUsuario + " uTY[" + usuarioTipo + "]UPUP" + dbe.toString());
        }

//        if (1 < 2) {
//            throw new DBConsultException("uID" + idUsuario + " uTY[" + usuarioTipo + "]" + data.toString());
//        }
        usuarioTipo = usuarioTipo.toUpperCase(); // Los tipos estan en mayus, entonces hay que darle gusto.
        int tipoUsuario = TipoUsuario.valueOf(usuarioTipo).getValue(); 
	// TipoUsuario realiza un mapeo del tipo de usuario a int.

        // Dependiendo del tipo almacenado en la base de datos
        // mapeando a un int se ve que clase se debe generar.
        switch (tipoUsuario) {
            case TipoUsuario.ADMINISTRADOR_VALUE:
                UsuarioRegistrado admin = new UsuariosFactoryImpl().createAdmin();
                admin.setUsername(nombreUsuario);
                admin.setNombre(usuarioNombre);
                admin.setId(idUsuario);
                admin.setTipo(tipoUsuario);
                inicioUsuario = admin;
                break;

            case TipoUsuario.RESPONSABLE_VALUE:
                conexion = new ConectaDbImpl();
                ResultSet tmpRes = conexion.fetchUserInfo(idUsuario, tipoUsuario);
                try {
                    if (tmpRes.next()) {
                        try {
                            if (tmpRes.getBoolean("estado")) {
                                UsuarioRegistrado resp = new UsuariosFactoryImpl().createResponsable();
                                resp.setUsername(nombreUsuario);
                                ((Responsable) resp).setId(idUsuario); 
                                resp.setTipo(tipoUsuario);
                                resp.setNombre(usuarioNombre);
                                inicioUsuario = resp;
                            } else {
                                DBConsultException cons = new DBConsultException("El usuario aun no ha sido autorizado.");
                                cons.setErrorCode(7);
                                throw cons;
                            }
                        } catch (SQLException e) {
                            throw new DBConsultException("WEEEEEEEEEEEEEEEE" + e.getMessage() + "  " + e.getSQLState());
                        }
                    } else {
                            throw new DBConsultException("EMPTY SETT WTF");
                    }
                } catch (SQLException e) {
                    throw new DBConsultException("WOOOOOOOOOT" + e.getMessage() + "  " + e.getSQLState());

                }

                break;

            case TipoUsuario.ALUMNO_VALUE:
                UsuarioRegistrado alum = new AlumnoImpl();
                alum.setUsername(nombreUsuario);
                alum.setId(idUsuario);
                alum.setTipo(tipoUsuario);
                alum.setNombre(usuarioNombre);
                inicioUsuario = alum;
                break;

            default:
                DBConsultException cons = new DBConsultException("Tipo de usuario invalido.");
                cons.setErrorCode(8);
                throw cons;
		// El usuario tiene un tipo no valido.
        }

        inicioUsuario.setEmail(usuarioMail);
        inicioUsuario.setTelefono("" + usuarioPhone);
        return inicioUsuario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void cerrarSesion(final UsuarioRegistrado usuarioActivo) {

        // usuarioActivo.finalize();
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

} // SesionImpl
