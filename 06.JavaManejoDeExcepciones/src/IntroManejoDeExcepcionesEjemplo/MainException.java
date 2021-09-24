/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroManejoDeExcepcionesEjemplo;

/**
 *
 * @author Agu
 */
public class MainException extends Exception {

    /**
     * Creates a new instance of <code>MainException</code> without detail
     * message.
     */
    public MainException() {
    }

    /**
     * Constructs an instance of <code>MainException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MainException(String msg) {
        super(msg);
    }
}
