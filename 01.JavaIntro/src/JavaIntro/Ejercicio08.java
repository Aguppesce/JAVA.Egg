/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        int num;
        
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
       
        if(num%2==0){
            System.out.print("Par\n");
        }else{
            System.out.print("Impar\n");
        }   
    }   
}
