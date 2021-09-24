package Ejercicio07Video;

import Ejercicio07Video.entidades.Persona;
import Ejercicio07Video.servicios.ServicioPersona;

/**
 *
 * @author Agu
 */
public class MainAPP {
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        
        //Persona p1 = sp.crearPersona();
        
        Persona[] vectorPersonas = sp.crearPersonasTest();
        
        sp.porcentajesPeso(vectorPersonas);
        sp.porcentajeEdad(vectorPersonas);
        
    }
    
}
