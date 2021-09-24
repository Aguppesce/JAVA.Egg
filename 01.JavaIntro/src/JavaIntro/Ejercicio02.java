/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        int num1,num2;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese número 1: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese número 2: ");
        num2 = leer.nextInt();
        System.out.print("La suma es: "+(num1+num2)+"\n");
        
        
    }
    
}
