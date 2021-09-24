/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio03;

/**
 *
 * @author Agu
 */
public class DivisionNumeroException extends Exception {

    /**
     * Creates a new instance of <code>DivisionNumeroException</code> without
     * detail message.
     */
    public DivisionNumeroException() {
    }

    /**
     * Constructs an instance of <code>DivisionNumeroException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DivisionNumeroException(String msg) {
        super(msg);
    }
}
