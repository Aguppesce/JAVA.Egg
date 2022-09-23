/**
 * @autor Aguppesce
 * */

//Ejercicio 10: Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

import java.util.Scanner;

public class Java10_EjercicioCondicionales {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese una palabra o frase: ");
        String var = leer.nextLine();

        if(var.length() == 8){
            System.out.print("Correcto! \n");
        }else{
            System.out.print("Incorrecto!\n");
        }
    }
}
