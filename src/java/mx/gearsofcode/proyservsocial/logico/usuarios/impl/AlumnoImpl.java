/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios.impl;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.impl.ConectaDbImpl;

import mx.gearsofcode.proyservsocial.logico.usuarios.Alumno;

import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

/**
 * Clase que implemente la interfaz de '<em><b>Alumno</b></em>'.
 * Contiene los metodos para acceder a los elementos de un alumno
 * y sus funciones particulares.
 * <p>
 * Las siguientes funciones se encuentran disponibles:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl#getCarrera <em>Carrera</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl#getPorcentaje <em>Porcentaje</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.impl.AlumnoImpl#isEstado <em>Estado</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#postularseAProyecto <em>Postularse</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#despostularseAProyecto <em>Despostularse</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#convierteCarrera <em>Convierte Carrera</em>}</li>
 * </ul>
 * </p>
 */
public class AlumnoImpl extends UsuarioRegistradoImpl implements Alumno {

    /**
     * Valor por default que muestra '{@link #getCarrera() <em>Carrera</em>}'
     * si no hay ningun valor seleccionado.
     *
     * @see #getCarrera()
     */
    protected static final String CARRERA_EDEFAULT = "unemployed";

    /**
     * Valor almacenado en '{@link #getCarrera() <em>Carrera</em>}'.
     *
     * @see #getCarrera()
     */
    protected String carrera = CARRERA_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #getPorcentaje() <em>Porcentaje</em>}'.
     *
     * @see #getPorcentaje()
     */
    protected static final int PORCENTAJE_EDEFAULT = 0;

    /**
     * Valor almacenado en '{@link #getPorcentaje() <em>Porcentaje</em>}'.
     *
     * @see #getPorcentaje()
     */
    protected int porcentaje = PORCENTAJE_EDEFAULT;

    /**
     * Valor por default que muestra '{@link #isEstado() <em>Estado</em>}'.
     *
     * @see #isEstado()
     */
    protected static final boolean ESTADO_EDEFAULT = false;

    /**
     * Valor almacenado en '{@link #isEstado() <em>Estado</em>}'.
     *
     * Si el estado del alumno es true, entonces el alumno ya fue autorizado
     * en algun proyecto.
     *
     * @see #isEstado()
     */
    protected boolean estado = ESTADO_EDEFAULT;

    /**
     * Constructor de un objeto tipo alumno.
     */
    public AlumnoImpl() {
        super();
    }

    /**
     * {@inheritDoc}
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * {@inheritDoc}
     */
    public void setCarrera(String newCarrera) {
        this.carrera = newCarrera;
    }

    /**
     * {@inheritDoc}
     */
    public int getPorcentaje() {
        return porcentaje;
    }

    /**
     * {@inheritDoc}
     */
    public void setPorcentaje(int newPorcentaje) {
        int oldPorcentaje = porcentaje;
        porcentaje = newPorcentaje;
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
     * Metodo que usa la conexion del alumno para registrar que queda postulado.
     * No debe ser usado si el alumno ya esta autorizado.
     *
     * @param proyectID ID del proyecto donde se postula el alumno.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    public void postularseAProyecto(int proyectID) throws DBModificationException, DBCreationException {
        if(!this.estado){
            ConectaDb conexion = new ConectaDbImpl();
            conexion.postularAProyectoDb(proyectID, this.id);
        }
        // No hay else puesto que el alumno ya estaba autorizado en otro proyecto.
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

    public void despostularseAProyecto(int proyectID) throws DBModificationException, DBCreationException {
        ConectaDbImpl con = new ConectaDbImpl();
        con.despostularAlumnoProyectoDb(proyectID, this.id);
    }

} //AlumnoImpl
