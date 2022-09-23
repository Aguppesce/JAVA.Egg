package POO_04_Ejercicio_Solucion_01;

import POO_04_Ejercicio_Solucion_01.entidades.Rectangulo;
import POO_04_Ejercicio_Solucion_01.servicios.ServicioRectangulo;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_04_Solucion_01 {
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();

        Rectangulo r1 = sr.crearRectangulo();

        System.out.println("La superficie es: "+sr.superficie());
        System.out.println("El perimetro es: "+sr.perimetro());

        sr.dibujar(r1);
    }
}
