/**
 * @autor Aguppesce
 * */

//Ejercicio 11: Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.

import java.util.Scanner;

public class Java11_EjercicioCondicionales {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String var1 = leer.nextLine();

        if(var1.substring(0,1).equals("A")){
            System.out.print("Correcto! \n");
        }else{
            System.out.print("Incorrecto!\n");
        }
    }
}
