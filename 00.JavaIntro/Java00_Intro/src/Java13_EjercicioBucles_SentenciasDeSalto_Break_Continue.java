/**
 * @autor Aguppesce
 */

//Ejercicio 13: Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta

import java.util.Scanner;

public class Java13_EjercicioBucles_SentenciasDeSalto_Break_Continue {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        int nota = leer.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.print("Vuela a ingresar una nota: ");
            nota = leer.nextInt();
        }
        System.out.println("Nota ingresada: " + nota);
    }
}
