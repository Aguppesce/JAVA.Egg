/**
 * @autor Aguppesce
 */

//Ejercicio 16: Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.

import java.util.Scanner;

public class Java16_EjercicioBucles_SentenciasDeSalto_Break_Continue {
    public static void main(String[] args) {
        int num, cont, suma;
        cont = 1;
        suma = 1;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 20 números: ");
        System.out.print("Ingrese número " + cont + ": ");
        num = leer.nextInt();
        if (num != 0) {
            while (cont < 20 && num != 0) {
                cont = cont + 1;
                System.out.print("Ingrese número " + cont + ": ");
                num = leer.nextInt();
                suma = suma + num;
                if (num == 0) {
                    System.out.println("Se capturo el número 0");
                    break;
                }
            }
            System.out.println("La suma es: " + suma);
        } else {
            System.out.println("Se capturo el número 0");
        }
    }
}