package Ejercicio02;

import Ejercicio02.entidades.Circunferencia;
import Ejercicio02.servicios.ServicioRadio;
/**
 *
 * @author Agu
 */
public class RadioApp {

    public static void main(String[] args) {
        ServicioRadio sr = new ServicioRadio();
        
        Circunferencia c1 = sr.crearCircunferencia();
       
        System.out.println("El área es: "+sr.area(c1));
        System.out.println("El perímetro es: "+sr.perimetro(c1));
    }
    
}
