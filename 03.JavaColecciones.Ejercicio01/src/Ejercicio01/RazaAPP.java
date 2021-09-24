package Ejercicio01;

import Ejercicio01.servicios.ServicioRaza;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class RazaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioRaza servRaza = new ServicioRaza();
        
        String opc;
        boolean flag = false;
        servRaza.fabricaRaza(1);
        do{
           System.out.print("Desea agregar otra raza (S/N)?");
            opc = leer.next();
            opc = opc.toUpperCase();
           if(opc.equals("S")){
               servRaza.fabricaRaza(1);                               
           }else if(opc.equals("N")){
               flag=true;
           }           
        }while(!flag);
        
        servRaza.mostrarRazas();
        System.out.println("");
        
    }
    
}
