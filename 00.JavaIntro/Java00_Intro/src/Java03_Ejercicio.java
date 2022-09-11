/**
 * @autor Aguppesce
 * */

//Ejercicio 03: Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

import java.util.Scanner;

public class Java03_Ejercicio {
    public static void main(String[] args) {
        String var,nom;

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nom = leer.nextLine();
        var=nom;
        System.out.print("Su nombre es: "+var+"\n");


    }
}
