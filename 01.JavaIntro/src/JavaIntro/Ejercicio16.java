/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        int num, cont,suma;
        cont = 1;
        suma=1;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese 20 números: ");
        System.out.print("Ingrese número " + cont + ": ");
        num = leer.nextInt();
        if (num != 0) {
            while (cont < 20 && num != 0) {
                cont = cont + 1;
                System.out.print("Ingrese número " + cont + ": ");
                num = leer.nextInt();
                suma=suma+num;
                if (num == 0) {
                    System.out.println("Se capturo el número 0");
                    break;
                }                
            }
            System.out.println("La suma es: "+suma);
        }
        else{
            System.out.println("Se capturo el número 0");            
        }
    }
}
