/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        String var;
               
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese una palabra o frase: ");
        var = leer.nextLine();
       
        if(var.length() == 8){
            System.out.print("Correcto! \n");
        }else{
            System.out.print("Incorrecto!\n");
        }   
    }   
}