/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mx.gearsofcode.proyservsocial.logico.usuarios;

import mx.gearsofcode.proyservsocial.logico.util.DBCreationException;
import mx.gearsofcode.proyservsocial.logico.util.DBModificationException;

/**
 * La representacion de un '<em><b>Alumno</b></em>' se conforma de unos
 * cuantos elementos adicionales a un UsuarioRegistrado.
 * Aqui se enlistan dichos elementos y funciones que debe cumplir un
 * elemento tipo Alumno.
 *
 * <p>
 * Las siguientes funcionalidades deben implementarse:
 * <ul>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getCarrera <em>Carrera</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#getPorcentaje <em>Porcentaje</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#isEstado <em>Estado</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#postularseAProyecto <em>Postularse</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#despostularseAProyecto <em>Despostularse</em>}</li>
 *   <li>{@link mx.gearsofcode.proyservsocial.logico.usuarios.Alumno#convierteCarrera <em>Convierte Carrera</em>}</li>
 * </ul>
 * </p>
 */
public interface Alumno extends UsuarioRegistrado {

    /**
     * Entrega el valor de la '<em><b>Carrera</b></em>' a la
     * que pertenece el alumno.
     *
     * @return La carrera a la que el alumno pertenece.
     * @see #setCarrera(CarreraAlumno)
     */
    String getCarrera();

    /**
     * Coloca la '<em><b>Carrera<b></em>' a la que pertenece el alumno.
     *
     * @param value La '<em>Carrera</em>' a la que pertenece el alumno.
     * @see #getCarrera()
     */
    void setCarrera(String value);

    /**
     * Entrega el '<em><b>Porcentaje</b></em>' de avance de la
     * carrera que tiene el alumno.
     *
     * @return El '<em>Porcentaje</em>' de avance que tiene el alumno.
     * @see #setPorcentaje(int)
     */
    int getPorcentaje();

    /**
     * Coloca el '<em><b>Porcentaje<b></em>' de avance en la carrera que
     * tiene el alumno.
     *
     * @param value El '<em>Porcentaje</em>' de avance actual.
     * @see #getPorcentaje()
     */
    void setPorcentaje(int value);

    /**
     * El '<em><b>Estado</b></em>' es el valor en el que se encuentra
     * el alumno, inicialmente se encuentra es false que implica que
     * esta disponible.
     *
     * <p>
     * El '<em>Estado</em>' implica si el alumno se encuentra
     * seleccionado en algun proyecto o si se encuentra disponible
     * o en espera de ser aceptado.
     * Los valores son:
     * True = aceptado en algun proyecto o
     * False = en espera de ser aceptado o disponible.
     * </p>
     *
     * @return El '<em>Estado</em>' del alumno, true = aceptado o
     * false = disponible.
     * @see #setEstado(boolean)
     */
    boolean isEstado();

    /**
     * Cambia el '<em><b>Estado<b></em>' del alumno con respecto a
     * si ya fue aceptado en un proyecto o no.
     *
     * @param value El '<em>Estado</em>' en el que se encuentra el alumno.
     * @see #isEstado()
     */
    void setEstado(boolean value);

    /**
     * Un alumno se presenta como candidato a ser seleccionado para
     * participar en el proyecto seleccionado.
     *
     * @param proyectID El numero identificador del proyecto.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void postularseAProyecto(final int proyectID) throws DBModificationException, DBCreationException;

    /**
     *
     */
    // TODO: Documentacion de este metodo.
    String convierteCarrera(int carrId);

    /**
     * Un alumno retira su postulacion al proyecto seleccionado.
     *
     * @param proyectId El numero identificador del proyecto.
     * @throws DBModificationException
     * @throws DBCreationException
     */
    void despostularseAProyecto(int proyectID) throws DBModificationException, DBCreationException;

} // Alumno
