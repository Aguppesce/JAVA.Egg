/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
       int num=0;
        System.out.printf("Ingrese tamaño del cuadrado: ");
        Scanner teclado0=new Scanner(System.in);
        num=teclado0.nextInt();
        if(num%2!=0){
            for(int i=0;i<num; i++){
                System.out.print("*");
            }
            System.out.println();
            for(int i=0;i<num-2; i++){
                System.out.print("*");
                for (int j=0; j<num-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for(int i=0;i<num; i++){
                System.out.print("*");
            }
        }else if(num%2==0){
            num=num+1;
            for(int i=0;i<num; i++){
                System.out.print("*");
            }
            System.out.println();
            for(int i=0;i<num-2; i++){
                System.out.print("*");
                for (int j=0; j<num-2; j++){
                    System.out.print(" ");
                }
                System.out.println("*");	
            }
            for(int i=0;i<num; i++){
                System.out.print("*");
            }
        }
        System.out.println("");
    }
}
