package POO_02_Ejercicio_Solucion_00;

import POO_02_Ejercicio_Solucion_00.entidades.Circunferencia;
import POO_02_Ejercicio_Solucion_00.servicios.ServicioCircunferencia;

/**
 * @author Aguppesce
 */

public class Main_POO_Ejercicio_02_Solucion_00 {
    public static void main(String[] args) {
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia c = sc.crearCircunsferencia();
        System.out.println("El Area de la circunsferencia es " + sc.calculaArea(c));
        System.out.println("El Perimetro de la circunferencia es " + sc.calculaPerimetro(c));
    }

}
