package EjercicioExtra01;

import EjercicioExtra01.servicios.ServicioNumero;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class NumeroAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioNumero servNum = new ServicioNumero();

        String opc;
        int sw;
        boolean flag = false;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Suma y Promedio");
            System.out.println("4. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servNum.crearNumero();
                    break;
                case 2:
                    servNum.mostrarNum();
                    System.out.println("");
                    break;
                case 3:
                    servNum.sumaPromedio();
                    break;
            }
        } while (sw != 4);

        System.out.println("");

    }
}
