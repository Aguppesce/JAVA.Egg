package POO_07_Ejercicio_Solucion_01;

import POO_07_Ejercicio_Solucion_01.entidades.Persona;
import POO_07_Ejercicio_Solucion_01.servicios.ServicioPersona;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_07_Solucion_01 {
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();

        //Persona p1 = sp.crearPersona();

        Persona[] vectorPersonas = sp.crearPersonasTest();

        sp.porcentajesPeso(vectorPersonas);
        sp.porcentajeEdad(vectorPersonas);

    }
}
