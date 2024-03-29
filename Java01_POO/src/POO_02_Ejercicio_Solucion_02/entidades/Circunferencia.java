package POO_02_Ejercicio_Solucion_02.entidades;

/**
 * @author Aguppesce
 */
public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "Radio: " + radio + '}';
    }
}
