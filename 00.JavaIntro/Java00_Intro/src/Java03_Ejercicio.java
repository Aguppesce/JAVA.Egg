//Ejercicio 02: Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma

import java.util.Scanner;

public class Java02_Ejercicio {
    public static void main(String[] args) {
        int num1,num2;

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese número 2: ");
        num2 = leer.nextInt();
        System.out.print("La suma es: "+(num1+num2)+"\n");
    }
}
