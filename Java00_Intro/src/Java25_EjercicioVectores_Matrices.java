import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * @autor Aguppesce
 */

//Ejercicio 25: Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre traspuesta. ¿Que es una matriz traspuesta?

public class Java25_EjercicioVectores_Matrices {
    public static void main(String[] args) {
        int aleatorio,c=4,f=4;
        int mat[][] = new int [c][f];
        Scanner leer = new Scanner(System.in);
        Random random=new Random();

        for(int i=0; i<f; i++){
            for(int j=0; j<c; j++){
                aleatorio =  random.nextInt(9) + 1;
                mat[i][j]=aleatorio;
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
        System.out.print("La matriz es: ");
        System.out.println(Arrays.deepToString(mat));
    }
}

//OTRA SOLUCIÓN
/*
//Funcion llena con aleatorios una Matriz cuadrada de indice N
    public static int[][] llenaMatriz(int matrix[][], int n) {
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 99 + 1);
            }
        }
        return matrix;
    }

    //Funcion para Mostrar una matriz cuadrada de indice N
    public static void muestraMatriz(int matrix[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(" ");
        }
    }


public static void main(String[] args) {

    int n = 4;
    int[][] matriz = new int[n][n];

    matriz = llenaMatriz(matriz, n);
    System.out.println("la matriz generada es:");
    muestraMatriz(matriz, n);
    System.out.println("Su transpuesta es:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("[" + matriz[j][i] + "]");
        }
        System.out.println(" ");
    }
}

*/
