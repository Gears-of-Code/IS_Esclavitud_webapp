/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.impl.LogicoFactoryImpl;
import mx.gearsofcode.proyservsocial.logico.usuarios.Alumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.CarreraAlumno;
import mx.gearsofcode.proyservsocial.logico.usuarios.UsuariosPackage;
import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alumno</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl#getCarrera <em>Carrera</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl#getPorcentaje <em>Porcentaje</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl#isEstado <em>Estado</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlumnoImpl extends UsuarioRegistradoImpl implements Alumno {
    /**
     * The default value of the '{@link #getCarrera() <em>Carrera</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCarrera()
     * @generated
     * @ordered
     */
    protected static final String CARRERA_EDEFAULT = "unemployed";

    /**
     * The cached value of the '{@link #getCarrera() <em>Carrera</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCarrera()
     * @generated
     * @ordered
     */
    protected String carrera = CARRERA_EDEFAULT;

    /**
     * The default value of the '{@link #getPorcentaje() <em>Porcentaje</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPorcentaje()
     * @generated
     * @ordered
     */
    protected static final int PORCENTAJE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPorcentaje() <em>Porcentaje</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPorcentaje()
     * @generated
     * @ordered
     */
    protected int porcentaje = PORCENTAJE_EDEFAULT;

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
     * Si el estado del alumno es true, entonces el alumno ya esta autorizado en algun proyecto.
     * <!-- end-user-doc -->
     * @see #isEstado()
     * @generated
     * @ordered
     */
    protected boolean estado = ESTADO_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AlumnoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsuariosPackage.Literals.ALUMNO;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCarrera(String newCarrera) {
        this.carrera = newCarrera;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPorcentaje() {
        return porcentaje;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPorcentaje(int newPorcentaje) {
        int oldPorcentaje = porcentaje;
        porcentaje = newPorcentaje;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.ALUMNO__PORCENTAJE, oldPorcentaje,
                    porcentaje));
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
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    UsuariosPackage.ALUMNO__ESTADO, oldEstado, estado));
    }

    /**
     * <!-- begin-user-doc -->
     * Metodo que usa la conexion del alumno para registrar que queda postulado.
     * No debe ser usado si el alumno ya esta autorizado.
     * <!-- end-user-doc -->
     * @param proyectID ID del proyecto donde se postula el alumno.
     * @throws DBModificationException 
     * @throws DBCreationException 
     * @generated NOT
     */
    public void postularseAProyecto(int proyectID) throws DBModificationException, DBCreationException {
        if(!this.estado){
            ConectaDb conexion = new LogicoFactoryImpl().createConectaDb();
            conexion.postularAProyectoDb(proyectID, this.id);
        }else{
            // No se hace nada puesto que el alumno ya estaba autorizado en otro proyecto.
        }
    }

    /* Comienzan métodos auto-generados. */
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case UsuariosPackage.ALUMNO__CARRERA:
            return getCarrera();
        case UsuariosPackage.ALUMNO__PORCENTAJE:
            return getPorcentaje();
        case UsuariosPackage.ALUMNO__ESTADO:
            return isEstado();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case UsuariosPackage.ALUMNO__CARRERA:
            setCarrera((String) newValue);
            return;
        case UsuariosPackage.ALUMNO__PORCENTAJE:
            setPorcentaje((Integer) newValue);
            return;
        case UsuariosPackage.ALUMNO__ESTADO:
            setEstado((Boolean) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case UsuariosPackage.ALUMNO__CARRERA:
            setCarrera(CARRERA_EDEFAULT);
            return;
        case UsuariosPackage.ALUMNO__PORCENTAJE:
            setPorcentaje(PORCENTAJE_EDEFAULT);
            return;
        case UsuariosPackage.ALUMNO__ESTADO:
            setEstado(ESTADO_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case UsuariosPackage.ALUMNO__CARRERA:
            return carrera != CARRERA_EDEFAULT;
        case UsuariosPackage.ALUMNO__PORCENTAJE:
            return porcentaje != PORCENTAJE_EDEFAULT;
        case UsuariosPackage.ALUMNO__ESTADO:
            return estado != ESTADO_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (carrera: ");
        result.append(carrera);
        result.append(", porcentaje: ");
        result.append(porcentaje);
        result.append(", estado: ");
        result.append(estado);
        result.append(')');
        return result.toString();
    }

    
//            return MATEMATICAS;
//            return ACTUARIA;
//            return CIENCIAS_COMPUTACIONALES;
//            return FISICA;
//            return BIOLOGIA;
//            return CIENCIAS_DE_LA_TIERRA;
//            return MANEJO_SUSTENTABLE_DE_ZONAS_COSTERAS;
//            return CIENCIAS_AMBIENTALES;
    @Override
    public String convierteCarrera(int carrId) {
        switch(carrId){
            case 1:
                return "CIENCIAS DE LA COMPUTACION";
            case 2:
                return "BIOLOGIA";
            case 3:
                return "FISICA";
            case 4:
                return "MATEMATICAS";
        }
        
        throw new UnsupportedOperationException("Not supported yet.");
    }

} //AlumnoImpl
