package Ejercicio09;

import Ejercicio09.entidades.Matematica;
import Ejercicio09.servicios.ServicioMatematica;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class MatematicaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");                
        int opc;        
        
        ServicioMatematica sm = new ServicioMatematica();
                
        
        
        Matematica m1 = sm.crearMatematica();                        
        
        System.out.println("\n----------MENU------------");                  
        System.out.println("1. Número random");
        System.out.println("2. Número mayor");
        System.out.println("3. Calcular potencia");
        System.out.println("4. Calcular raiz");
        System.out.println("5. Salir");
        do{                        
            System.out.print("\nElija una opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1: sm.numerosRandom(m1);
                    break;
                case 2: sm.devolverMayor(m1);
                    break;
                case 3: sm.calcularPotencia(m1);
                    break;
                case 4: sm.calcularRaiz(m1);
                    break;
            }            
        }while(opc != 5);
    }   
}
