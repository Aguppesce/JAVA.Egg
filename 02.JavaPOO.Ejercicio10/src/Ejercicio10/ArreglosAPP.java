package Ejercicio10;

import Ejercicio10.entidades.Arreglo;
import Ejercicio10.servicios.ServicioArreglo;

/**
 *
 * @author Agu
 */
public class ArreglosAPP {
    public static void main(String[] args) {
        
        ServicioArreglo sa = new ServicioArreglo();
        
        Arreglo a = sa.crearArreglo();
        Arreglo b = sa.crearArreglo();
        
        sa.llenarArreglo(a);
        sa.llenarArreglo(b);
        
        System.out.println("Arreglo A: ");
        sa.mostrarArreglo(a);
        
        System.out.println("\n\nArreglo A ordenado: ");
        sa.ordenarArreglo(a);
        sa.mostrarArreglo(a);
        
        System.out.println("\n\nCopiar primeros 10 elementos del vector A al B: ");
        sa.copiarElementos(a, b);
        
        sa.mostrarArreglo(b);
    }
    
}
