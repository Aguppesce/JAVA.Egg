/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        String var1;
        String var2="eureka";
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese una palabra: ");
        var1 = leer.nextLine();
       
        if(var1.equals(var2)){
            System.out.print("Correcto! \n");
        }else{
            System.out.print("Incorrecto!\n");
        }   
    }   
}