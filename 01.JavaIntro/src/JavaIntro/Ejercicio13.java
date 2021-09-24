/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int nota;

        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una nota: ");
        nota = leer.nextInt();

        while (nota > 10 || nota < 0) {
            System.out.print("Vuela a ingresar una nota: ");
            nota = leer.nextInt();
        }
        System.out.println("Nota ingresada: " + nota);
    }
}
