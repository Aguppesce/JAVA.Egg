/**
 * @autor Aguppesce
 */

//Ejercicio 18: Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
/*      0-0-0
        0-0-1
        0-0-2
        0-0-E
        0-0-4
        .
        .
        0-1-2
        0-1-E   */
//Nota: investigar función equals() y como convertir números a String.

import java.util.Scanner;

public class Java18_EjercicioBucles_SentenciasDeSalto_Break_Continue {
    public static void main(String[] args) {
        String cadena;
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        String dig1;
        String dig2;
        String dig3;
        for (int i = 0; i < 10; i++) {
            if (digito1 == 3) {
                dig1 = "E";
            } else {
                dig1 = String.valueOf(digito1);
            }
            for (int j = 0; j < 10; j++) {
                if (digito2 == 3) {
                    dig2 = "E";
                } else {
                    dig2 = String.valueOf(digito2);
                }
                for (int a = 0; a < 10; a++) {
                    if (digito3 == 3) {
                        dig3 = "E";
                    } else {
                        dig3 = String.valueOf(digito3);
                    }
                    cadena = dig1 + " - " + dig2 + " - " + dig3;
                    digito1 = digito1 + 1;
                    if (digito1 == 10) {
                        digito1 = 0;
                        digito2 = digito2 + 1;
                    }
                    if (digito2 == 10) {
                        digito2 = 0;
                        digito3 += 1;
                    }
                    System.out.println(cadena);
                }
            }
        }
    }

}

