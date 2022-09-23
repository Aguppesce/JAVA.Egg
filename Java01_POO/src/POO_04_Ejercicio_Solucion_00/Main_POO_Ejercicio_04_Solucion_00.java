package POO_04_Ejercicio_Solucion_00;

import POO_04_Ejercicio_Solucion_00.entidades.Rectangulo;
import POO_04_Ejercicio_Solucion_00.servicios.ServicioRectangulo;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_04_Solucion_00 {
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo r = sr.crearRectangulo();
        sr.dibujar(r);

        System.out.println("La Superficie del rectangulo es "+sr.superficie(r));
        System.out.println("El perimetro del rectangulo es "+sr.perimetro(r));
    }
}
