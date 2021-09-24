/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio20 {   
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
