package Ejercicio01.entidades;

/**
 *
 * @author Agu
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato se alimenta de: "+alimento);
    }

    
}
