package Ejercicio10.entidades;
/**
 *
 * @author Agu
 */
public class Arreglo {

    private int tamanio;
    private float arreglo[] = new float[tamanio];

    public Arreglo() {
    }

    public Arreglo(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public float[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(float[] arregloB) {
        this.arreglo = arregloB;
    }

        
}
