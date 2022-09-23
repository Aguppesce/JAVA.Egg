package POO_06_Ejercicio_Solucion_01;

import POO_06_Ejercicio_Solucion_01.entidades.Cafetera;
import POO_06_Ejercicio_Solucion_01.servicios.ServicioCafetera;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_06_Solucion_01 {
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
