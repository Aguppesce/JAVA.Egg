package Ejercicio02;

import Ejercicio02.servicios.ServicioRazas;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class RazasAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioRazas servRaza = new ServicioRazas();
        
        String opc;
        int sw;
        boolean flag = false;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servRaza.fabricaRaza(1);
                    do {
                        System.out.print("Desea agregar otra raza (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servRaza.fabricaRaza(1);
                        } else if (opc.equals("N")) {
                            flag = true;
                        }
                    } while (!flag);                    
                    break;
                case 2:
                    System.out.print("Nombre de la raza: ");
                    String nombreRaza = leer.next();
                    servRaza.eliminarRazaPorNombre(nombreRaza);                    
                    break;                            
                case 3:
                    servRaza.mostrarRazas();
                    System.out.println("");
            }
        } while (sw != 4);

        System.out.println("");
        
    }
    
}

