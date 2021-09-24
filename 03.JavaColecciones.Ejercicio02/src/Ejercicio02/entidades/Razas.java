package Ejercicio02.entidades;
/**
 *
 * @author Agu
 */
public class Razas {
    private String raza;

    public Razas() {
    }

    public Razas(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "" + raza;
    }    
}
