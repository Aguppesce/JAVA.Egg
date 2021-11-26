package Ejercicio01;

import Ejercicio01.servicios.ServicioPerro;
import Ejercicio01.servicios.ServicioPersona;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class AdopcionAPP {
    public static void main(String[] args) {
        
        
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPerro servPerro = new ServicioPerro();
        ServicioPersona servPersona = new ServicioPersona();
        
        int sw;
        boolean flag = false;
        String opc,nombrePerro;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Agregar Persona");
            System.out.println("2. Agregar Perro");
            System.out.println("3. Mostrar Personas");
            System.out.println("4. Mostrar Perros");
            System.out.println("5. Asignar Perro a una Persona");
            System.out.println("6. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servPersona.fabricaPersona(1);
                    do {
                        System.out.print("Desea agregar otra persona (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servPersona.fabricaPersona(1);
                        } else if (opc.equals("N")) {
                            flag = true;
                        }
                    } while (!flag);                                        
                    break;
                case 2:
                    servPerro.fabricaPerro(1);
                    
                    do {
                        System.out.print("Desea agregar otro perro (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servPerro.fabricaPerro(1);
                        } else if (opc.equals("N")) {
                            flag = true;
                        }
                    } while (!flag);                    
                    break;
                case 3:
                    System.out.println("-----Listado Personas-----");
                    servPersona.mostrarPersona();
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("-----Listado Perros-----");
                    servPerro.mostrarPerros();
                    System.out.println("");
                    break;
                case 5:
                    servPerro.mostrarPerrosSinDuenio();
                    System.out.print("Nombre del perro que quiere adoptar: ");
                    nombrePerro = leer.next();
                    servPersona.asignarPerro(servPerro, nombrePerro);
                    break;                   
            }
        } while (sw != 6);
        System.out.println("");
    }    
}
