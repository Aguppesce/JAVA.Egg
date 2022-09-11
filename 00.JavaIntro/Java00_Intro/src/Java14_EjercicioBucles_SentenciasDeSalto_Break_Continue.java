/**
 * @autor Aguppesce
 */

//Ejercicio 14: Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.

import java.util.Scanner;

public class Java14_EjercicioBucles_SentenciasDeSalto_Break_Continue {
    public static void main(String[] args) {
        int numLim, cont, num;
        cont = 0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número límite: ");
        numLim = leer.nextInt();
        while (cont <= numLim) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            cont = cont + num;
        }
        System.out.println("Supero el limite, el total es: " + cont);
    }
}
