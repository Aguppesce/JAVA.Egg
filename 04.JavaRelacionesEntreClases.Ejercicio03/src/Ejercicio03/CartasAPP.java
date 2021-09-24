package Ejercicio03;

import Ejercicio03.servicios.ServicioCarta;
import java.util.Scanner;

public class CartasAPP {

    public static void main(String[] args) {
        
        int sw;
        boolean flag = false;
        String opc;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioCarta servCart = new ServicioCarta();        
        
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Crear baraja");
            System.out.println("2. Barajar");
            System.out.println("3. Siguiente carta");
            System.out.println("4. Cartas disponibles");
            System.out.println("5. Dar Cartas");
            System.out.println("6. Mostrar");
            
            System.out.println("7. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:                    
                    servCart.crearBaraja();
                    break;                
                case 2:
                    servCart.barajar();
                    break;
                case 3:
                    servCart.siguienteCarta();
                    break;
                case 4:
                    servCart.cartasDisponibles();
                    break;
                case 5:
                    servCart.darCartas();
                    break;
                case 6:
                    servCart.mostrarBaraja();
                    break;
            }
        } while (sw != 7);
    }    
}
