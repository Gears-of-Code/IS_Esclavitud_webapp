/**
 * 
 */
package mx.gearsofcode.proyservsocial.logico.util;

/**
 * Clase utilizada para identificar cuando una operacion de consulta en la
 * base de datos tuvo algun problema.
 * 
 * @author snowingheart
 * 
 */
public class DBConsultException extends Exception {

    private int errorCode;

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    /**
     * 
     */
    public DBConsultException() {
        // TODO Auto-generated constructor stub
    }

     public DBConsultException(String message, int error){
         super(message);
         this.setErrorCode(error);
    }
    
    /**
     * @param message
     */
    public DBConsultException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param cause
     */
    public DBConsultException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * @param message
     * @param cause
     */
    public DBConsultException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }
}
