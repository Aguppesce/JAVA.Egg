package Ejercicio01;

import Ejercicio01.entidades.Libro;
import Ejercicio01.servicios.ServicioLibro;

/**
 *
 * @author Agu
 */
public class LibroApp {
    public static void main(String[] args) {
        
        ServicioLibro sl=new ServicioLibro();
        
        Libro l1 = sl.crearLibro();
        
        System.out.println(l1.toString());
        

    }
    
}
