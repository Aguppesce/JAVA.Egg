package Ejercicio04;

import Ejercicio04.entidades.Rectangulo;
import Ejercicio04.servicios.ServicioRectangulo;

/**
 *
 * @author Agu
 */
public class RectanguloAPP {
    public static void main(String[] args) {
        
        ServicioRectangulo sr = new ServicioRectangulo();
                
        Rectangulo r1 = sr.crearRectangulo();
       
        System.out.println("La superficie es: "+sr.superficie());
        System.out.println("El perimetro es: "+sr.perimetro());
        
        sr.dibujar(r1);

    }
    
}
