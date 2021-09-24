package Ejercicio05;

import Ejercicio05.servicio.ServicioPais;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class PaisAPP {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPais servPais = new ServicioPais();
        
        String opc;
        int sw;
        boolean flag = false;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servPais.fabricaPais(1);
                    do {
                        System.out.print("Desea agregar otro alumno (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servPais.fabricaPais(1);
                        } else if (opc.equals("N")) {
                            servPais.mostrarPais();
                            flag = true;
                        }
                    } while (!flag);                    
                    break;
                case 2:
                    System.out.println("-----Listado Paises-----");
                    servPais.mostrarPais();
                    System.out.println("");
                    break;
                
            }
        } while (sw != 3);
        System.out.println("");
    }
    
}
