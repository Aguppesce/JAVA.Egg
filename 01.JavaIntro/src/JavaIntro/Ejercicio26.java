/**
 *
 * @Agu
 *   Redondear Número:
 *   BigDecimal bd = new BigDecimal("1.23456789");
 *   System.out.println(bd.setScale(3,BigDecimal.ROUND_HALF_UP));
 */
package JavaIntro;

import static java.lang.Math.random;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        int aleatorio, c = 4, f = 4;
        int mat[][] = new int[c][f];
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                aleatorio = random.nextInt(9) + 1;
                mat[i][j] = aleatorio;
            }
        }
        System.out.println("La matriz es:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("");

        System.out.println("La traspuesta es:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i] + "  ");
            }
            System.out.println();
        }
        
        System.out.println("La antisimétrica es:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
//                if(mat[i][j]){
//                    
//                }
            }
            System.out.println();
        }
    }
}
