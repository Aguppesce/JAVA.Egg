package JavaIntroPOO.mascotapp.servicios;

import JavaIntroPOO.mascotapp.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        System.out.print("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);       
        
    }
}
