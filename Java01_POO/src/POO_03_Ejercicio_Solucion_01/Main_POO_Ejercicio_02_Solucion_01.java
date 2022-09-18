package POO_03_Ejercicio_Solucion_01;

import POO_03_Ejercicio_Solucion_01.entidades.Operacion;
import POO_03_Ejercicio_Solucion_01.servicios.ServiciosOperacion;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_02_Solucion_01 {
    public static void main(String[] args) {
        ServiciosOperacion so = new ServiciosOperacion();
        Operacion op = so.crearOperacion();
        System.out.println("la suma de los numeros es "+so.sumar(op));
        System.out.println("la resta de los numeros es "+so.restar(op));
        System.out.println("el producto es "+so.multiplicar(op));
        System.out.println("la division es "+so.dividir(op));
    }

}
