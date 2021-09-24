package Ejercicio12;

import Ejercicio12.entidades.Persona;
import Ejercicio12.servicios.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class PersonaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioPersona sp = new ServicioPersona();
        
        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        
        sp.calcularEdad(p1);
        
        System.out.print("Ingrese edad: ");
        int e=leer.nextInt();
        
        System.out.println("Es menor: "+sp.menorQue(p1, e));
        
        sp.mostrarPersona(p1); 
    }
    
}
