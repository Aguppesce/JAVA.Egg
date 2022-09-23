package POO_06_Ejercicio.entidades;

/**
 * @author Aguppesce
 */
public class Cafetera {
    private int capacidadMaxima = 200;
    private int cantidadActual = 0;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" +
                "capacidadMaxima=" + capacidadMaxima +
                ", cantidadActual=" + cantidadActual +
                '}';
    }
}
