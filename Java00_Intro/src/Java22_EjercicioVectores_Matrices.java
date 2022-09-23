import java.util.Scanner;

/**
 * @autor Aguppesce
 */

//Ejercicio 22: Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.

public class Java22_EjercicioVectores_Matrices {
    public static void main(String[] args) {
        int[] vec= new int [100];
        for(int i=vec.length; i>=0; i--){
            System.out.println(vec[i]);
        }
        System.out.println("");
    }
}

//OTRA SOLUCIÓN
/*
public static void main(String[] args) {

        int[] vectorN = new int[100];
        //lleno
        for (int i=0;i<100;i++){
        vectorN[i]=i+1;
        //muestro
        System.out.print("[" + vectorN[i] + "]");//Es "print" sin "ln" o sea sin saltar de linea
        }

        System.out.println(" ");//este solo lo uso para el salto de linea final

        //para mostrarlos de forma descendiente
            for(int i=99;i>=0;i--){
             System.out.print("[" + vectorN[i] + "]");
            }
            System.out.println(" ");
    }
*/
