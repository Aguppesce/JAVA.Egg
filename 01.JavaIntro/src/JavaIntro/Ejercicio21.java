/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        double euros;
        String opcion;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese cantidad de euros: ");
        euros = leer.nextInt();
        
        do{
            menu();
            opcion = leer.nextLine();
            switch(opcion){
                case "libras": System.out.print("La cantidad de euros convertidos a libras son: ");
                        aLibras(euros);
                        break;
                case "dolares": System.out.print("La cantidad de euros convertidos a dolares son: ");
                        aDolares(euros);
                        break;
                case "yenes": System.out.print("La cantidad de euros convertidos a yenes son: ");
                        aYenes(euros);
                        break;
                case "salir": 
                    break;        
                default: System.out.println("Ingresó una opción inválida");                                         
            }            
        }while(opcion != "salir");        
    }
    
    public static void aLibras(double euros){
        System.out.println(euros*0.86+"\n");           
    }
    public static void aDolares(double euros){        
        System.out.print(euros*1.28611+"\n");              
    }
    public static void aYenes(double euros){    
        System.out.println(euros*129.852+"\n");              
    }
    public static void menu(){
        System.out.println("\n--------MENU--------\n"
                + "1. Para convertir a Libras, escriba 'libras'\n"
                + "2. Para convertir a Dolares, escriba 'dolares'\n"
                + "3. Para convertir a Yenes, escriba 'yenes'\n"
                + "4. Para Salir, escriba 'salir'\n");
        System.out.print("Escriba una opción: ");
    }
}
