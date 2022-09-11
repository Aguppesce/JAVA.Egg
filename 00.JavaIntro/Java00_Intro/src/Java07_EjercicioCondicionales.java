/**
 * @autor Aguppesce
 * */

//Ejercicio 06: Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

import java.util.Scanner;

public class Java07_Ejercicio {
    public static void main(String[] args) {
        int num1,num2;

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        num1 = leer.nextInt();
        System.out.print("Ingrese número 2: ");
        num2 = leer.nextInt();

        if(num1>num2){
            System.out.print(num1+" es el mayor \n");
        }else{
            System.out.print(num2+" es el mayor \n");
        }
    }
}
