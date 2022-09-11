/**
 * @autor Aguppesce
 * */

//Ejercicio 08: Crear un programa que dado un numero determine si es par o impar.

import java.util.Scanner;

public class Java08_EjercicioCondicionales {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = leer.nextInt();

        if(num%2==0){
            System.out.print("Par\n");
        }else{
            System.out.print("Impar\n");
        }
    }
}
