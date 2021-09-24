package JavaManejoDeExcepciones;
/**
 *
 * @author Agu
 */
public class MascotaException extends Exception {

    /**
     * Creates a new instance of <code>MascotaException</code> without detail
     * message.
     */
    public MascotaException() {
    }

    /**
     * Constructs an instance of <code>MascotaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MascotaException(String msg) {
        super(msg);
    }
}
