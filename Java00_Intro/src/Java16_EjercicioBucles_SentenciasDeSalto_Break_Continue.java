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

//OTRA SOLUCIÓN
/*
public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int suma = 0;
        int n1, cont = 0;

        do {//hacer
            cont++;
            System.out.println("Ingrese el numero " + cont);
            n1 = leer.nextInt();

            //si n1 es mayor que cero entonces hace una sumatoria tipo acumulacion
            //si es menor que cero quiere decir que es negativo entonces no hace nada
            if (n1 > 0) {
                suma = suma + n1;
            } else if (n1 == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }

        } while (cont < 20);//mientras n1 sea distinto de cero
        leer.close();//cierro el scanner porque ya no lo voy a usar mas
        System.out.println("La suma de los numeros capturados es " + suma);
    }
 */