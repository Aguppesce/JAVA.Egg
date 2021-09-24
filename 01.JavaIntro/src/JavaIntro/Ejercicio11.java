/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        String var1;
        String var2="A";
        
               
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese una palabra o frase: ");
        var1 = leer.nextLine();
       
        if(var1.substring(0,1).equals("A")){
            System.out.print("Correcto! \n");
        }else{
            System.out.print("Incorrecto!\n");
        }   
    }   
}