/**
 * @autor Aguppesce
 * */

//Ejercicio 05: Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class Java05_Ejercicio {
    public static void main(String[] args) {
        int grados;
        double fahrenheit;

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese C°: ");
        grados = leer.nextInt();
        fahrenheit=32+(9*grados/5);
        System.out.print("Grados C° en F°: "+fahrenheit+"\n");
    }
}
