/**
 * @autor Aguppesce
 * */

//Ejercicio 07: Implementar un programa que dado dos números enteros determine cuál es el mayor y lo muestre por pantalla.

import java.util.Scanner;

public class Java07_EjercicioCondicionales {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese número 2: ");
        int num2 = leer.nextInt();

        if(num1>num2){
            System.out.print(num1+" es el mayor \n");
        }else{
            System.out.print(num2+" es el mayor \n");
        }
    }
}
