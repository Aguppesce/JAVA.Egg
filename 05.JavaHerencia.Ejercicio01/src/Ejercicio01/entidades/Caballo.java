package Ejercicio01.entidades;
/**
 *
 * @author Agu
 */
public class Caballo extends Animal {    
    
    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);        
    }

    @Override
    public void alimentarse() {
        System.out.println("El caballo se alimenta de: "+alimento);//podemos llamarlo con super.alimento o this.alimento
    }

    
}
