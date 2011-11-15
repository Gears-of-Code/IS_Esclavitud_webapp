/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.gearsofcode.proyservsocial.logico.util;

import mx.gearsofcode.proyservsocial.logico.ConectaDb;
import mx.gearsofcode.proyservsocial.logico.impl.LogicoFactoryImpl;

/**
 *
 * @author filloy
 */
public class Mapper {

    private int[] values;
    private int type;
    private String[] translated;

    public String[] getTranslated() {
        return translated;
    }

    public void setTranslated(String[] translated) {
        this.translated = translated;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int[] getValues() {
        return values;
    }

    public void setValues(int[] values) {
        this.values = values;
    }

    public Mapper() {
        values = null;
        type = -1;
        translated = null;
    }

    /**
     * Constructor que mapeará los valores según el tipo provisto.
     * Los tipos implementados son:
     * 0 --> Área de Conocimiento
     * 1 --> Carrera
     * @param translateValues Los valores que se desea traducir.
     * @param translateType El tipo de valores que se pasan.
     */
    public Mapper(int[] translateValues, int translateType) {
        this.values = translateValues;
        this.type = translateType;
        this.translated = new String[values.length];
    }

    public void map() throws DBConsultException, DBCreationException, UnsupportedOperationException {
        ConectaDb conexion = null;
        switch (this.type) {
            case 0:
                conexion = new LogicoFactoryImpl().createConectaDb();
                this.translated = conexion.translateAC(this.values);
                break;
            case 1:
                conexion = new LogicoFactoryImpl().createConectaDb();
                this.translated = conexion.translateCAR(this.values);
                break;
            default:
                throw new UnsupportedOperationException("Type:" + this.type + " is not enabled in this Mapper. Try again later.");
        }
    }
}
