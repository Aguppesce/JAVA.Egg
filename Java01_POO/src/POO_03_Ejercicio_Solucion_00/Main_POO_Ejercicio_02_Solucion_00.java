package POO_03_Ejercicio_Solucion_00;

import POO_03_Ejercicio_Solucion_00.entidades.Operacion;
import POO_03_Ejercicio_Solucion_00.servicios.ServicioOperacion;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_02_Solucion_00 {
    public static void main(String[] args) {
        ServicioOperacion so= new ServicioOperacion();

        Operacion o1 = so.crearOperacion();
        System.out.println("La suma es: "+so.sumar());
        System.out.println("La resta es: "+so.restar());
        System.out.println(so.multiplicar());
        System.out.println(so.dividir());
    }
}
