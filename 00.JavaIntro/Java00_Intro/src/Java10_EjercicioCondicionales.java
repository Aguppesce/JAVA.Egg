/**
 * @autor Aguppesce
 * */

//Ejercicio 09: Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

import java.util.Scanner;

public class Java09_EjercicioCondicionales {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String var1 = leer.nextLine();

        if(var1.equals("eureka")){
            System.out.print("Correcto!\n");
        }else{
            System.out.print("Incorrecto!\n");
        }
    }
}
