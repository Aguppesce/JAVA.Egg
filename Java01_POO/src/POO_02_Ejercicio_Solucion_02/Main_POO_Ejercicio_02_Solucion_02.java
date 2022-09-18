package POO_02_Ejercicio_Solucion_02;

import POO_02_Ejercicio_Solucion_02.entidades.Circunferencia;
import POO_02_Ejercicio_Solucion_02.servicios.ServicioCircunferencia;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_02_Solucion_02 {
    public static void main(String[] args) {
        ServicioCircunferencia sr = new ServicioCircunferencia();

        Circunferencia c1 = sr.crearCircunferencia();

        System.out.println("El área es: " + sr.area(c1));
        System.out.println("El perímetro es: " + sr.perimetro(c1));

    }
}
