/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio14 {

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
