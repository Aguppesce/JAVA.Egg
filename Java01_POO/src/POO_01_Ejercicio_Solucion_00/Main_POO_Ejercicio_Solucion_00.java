package POO_01_Ejercicio_Solucion_00;

import POO_01_Ejercicio_Solucion_00.entidades.Libro;
import POO_01_Ejercicio_Solucion_00.servicios.ServicioLibro;

public class Main_POO_Ejercicio_Solucion_00 {
    public static void main(String[] args) {
        ServicioLibro sl=new ServicioLibro();


        Libro l1 = sl.crearLibro();

        System.out.println(l1.toString());
    }
}
