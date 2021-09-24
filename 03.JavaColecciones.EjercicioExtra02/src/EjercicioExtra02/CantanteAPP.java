package EjercicioExtra02;

import EjercicioExtra02.servicios.ServicioCantante;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class CantanteAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioCantante servCantante = new ServicioCantante();

        String opc;
        int sw;
        boolean flag = false;

        do {
            System.out.println("\n-------MENU-------");
            System.out.println("1. Crear 5 cantantes");
            System.out.println("2. Crear 1 cantante más");
            System.out.println("3. Mostrar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servCantante.fabricaCantante(5);
                    break;
                case 2:
                    servCantante.fabricaCantante(1);
                    break;
                case 3:
                    servCantante.mostrarCantante();
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Nombre del cantante que va a eliminar: ");
                    String nombreCantante = leer.next();
                    servCantante.eliminar(nombreCantante);
                    break;
            }
        } while (sw != 5);
        System.out.println("");
    }
}
