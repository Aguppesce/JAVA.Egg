package Ejercicio01;

import Ejercicio01.entidades.Animal;
import Ejercicio01.entidades.Caballo;
import Ejercicio01.entidades.Gato;
import Ejercicio01.entidades.Perro;

/**
 *
 * @author Agu
 */
public class AnimalAPP {
    public static void main(String[] args) {
        
        
        Animal caballo = new Caballo("Caballo", "Pasto", 22, "Mastin");
        caballo.alimentarse();
        
        Animal gato = new Gato("Gato", "Galletas", 3, "Persa");
        gato.alimentarse();
        
        Animal perro = new Perro("Perro", "Croquetas", 4, "Mastin");        
        perro.alimentarse();
        
        
        
    }
    
}
