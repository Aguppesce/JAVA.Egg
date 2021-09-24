/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        int grados;
        double fahrenheit;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese C°: ");
        grados = leer.nextInt();
        fahrenheit=32+(9*grados/5);
        System.out.print("Grados C° en F°: "+fahrenheit+"\n");
        
        
        
    }
    
}

