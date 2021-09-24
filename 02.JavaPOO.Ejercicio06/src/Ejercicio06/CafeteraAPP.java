package Ejercicio06;

import Ejercicio06.entidades.Cafetera;
import Ejercicio06.servicios.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class CafeteraAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc,tamTaza=0,cafe=0;
        
        
        Scanner leer = new Scanner(System.in);
        
        ServicioCafetera sc = new ServicioCafetera();
                
        Cafetera c1 = sc.crearCafetera();
       
        do{
            System.out.println("\n----------MENU------------");          
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar cafe");            
            System.out.println("5. Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1: sc.llenarCafetera(c1);
                    break;
                case 2: sc.servirTaza(c1, tamTaza);
                    break;
                case 3: sc.vaciarCafetera(c1);
                    break;
                case 4: sc.agregarCafe(c1, cafe);
                    break;
                case 5:
                    break;
            }
        }while(opc!=5);       
    }
    
}
