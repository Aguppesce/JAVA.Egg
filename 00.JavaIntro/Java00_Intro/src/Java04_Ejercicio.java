/**
 * @autor Aguppesce
 * */

//Ejercicio 04: Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

import java.util.Scanner;

public class Java04_Ejercicio {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nom = leer.nextLine();
        System.out.print("Nombre en mayúscula: "+(nom.toUpperCase())+"\n");
        System.out.print("Nombre en minúscula: "+(nom.toLowerCase())+"\n");
    }
}
