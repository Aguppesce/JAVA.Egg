package Ejercicio02;

import Ejercicio02.servicios.ServicioJuego;
import Ejercicio02.servicios.ServicioJugador;
import Ejercicio02.servicios.ServicioRevolver;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class RuletaAPP {
    
    public static void main(String[] args) {
        
        int sw;
        boolean flag = false;
        String opc;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioJuego servJuego = new ServicioJuego();
               
        
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Crear juego");
            System.out.println("2. Ejecutar ronda");
            System.out.println("3. Lista jugadores");
            System.out.println("4. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:                    
                    servJuego.llenarJuego();                    
                    break;                
                case 2:
                    servJuego.ronda();
                    break;
                case 3:
                    servJuego.mostrarJugador();
                    break;
            }
        } while (sw != 4);
        System.out.println("");
    }
    
}
