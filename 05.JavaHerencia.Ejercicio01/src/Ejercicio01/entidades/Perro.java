package Ejercicio01.entidades;
/**
 *
 * @author Agu
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro se alimenta de: "+alimento);
    }
    
}
