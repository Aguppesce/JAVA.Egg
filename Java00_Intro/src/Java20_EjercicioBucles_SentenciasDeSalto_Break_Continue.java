import java.util.Scanner;

/**
 * @autor Aguppesce
 */

//Ejercicio 20: Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

public class Java20_EjercicioBucles_SentenciasDeSalto_Break_Continue {
    public static void main(String[] args) {
        int num=0;
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 20: ");
        num=leer.nextInt();
        if(num>0 && num<=20){
            System.out.print(num+" ");
            for(int i=1; i<=num; i++){
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("Ingrese un número entre 1 y 20: ");
        num=leer.nextInt();
        if(num>0 && num<=20){
            System.out.print(num+" ");
            for(int i=1; i<=num; i++){
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.printf("Ingrese un número entre 1 y 20: ");
        num=leer.nextInt();
        if(num>0 && num<=20){
            System.out.print(num+" ");
            for(int i=1; i<=num; i++){
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.printf("Ingrese un número entre 1 y 20: ");
        num=leer.nextInt();
        if(num>0 && num<=20){
            System.out.print(num+" ");
            for(int i=1; i<=num; i++){
                System.out.print("*");
            }
        }

    }
}

//OTRA SOLUCIÓN
/*
* public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador = 0;
        int num;

        while (contador < 4) {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            for (int i = 0; i <= num; i++) {
                if (i == 0) {
                    System.out.print(num);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
            contador = contador + 1;
        }

    }*/
