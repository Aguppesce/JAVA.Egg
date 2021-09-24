/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        int num;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
       
        System.out.print("El doble es: "+num*2+"\n");
        System.out.print("El triple es: "+num*3+"\n");
        System.out.print("La raíz es: "+Math.sqrt(num)+"\n");       
        
    }
    
}
