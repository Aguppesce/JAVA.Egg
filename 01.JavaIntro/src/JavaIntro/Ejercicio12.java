/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        int tipoMotor;
                
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese una opción entre 1 y 4: ");        
        tipoMotor = leer.nextInt();
       
        switch(tipoMotor){
            case 1: System.out.println("La bomba es una bomba de agua");
                    break;
            case 2: System.out.println("La bomba es una bomba de gasolina");
                    break;
            case 3: System.out.println("La bomba es una bomba de hormigón");
                    break;
            case 4: System.out.println("La bomba es una bomba de alimenticia");
                    break;
            default: System.out.println("No existe un valor válido para este tipo de bomba");
        }       
    }   
}