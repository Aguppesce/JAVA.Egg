/**
 * @autor Aguppesce
 * */

//Ejercicio 06: Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

import java.util.Scanner;

public class Java06_Ejercicio {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();

        System.out.print("El doble es: "+num*2+"\n");
        System.out.print("El triple es: "+num*3+"\n");
        System.out.print("La raíz es: "+Math.sqrt(num)+"\n");
    }
}
