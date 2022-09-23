import java.util.Scanner;

/**
 * @autor Aguppesce
 */

//Ejercicio 19: Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//  * * * *
//  *     *
//  *     *
//  * * * *

public class Java19_EjercicioBucles_SentenciasDeSalto_Break_Continue {
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

//OTRA SOLUCIÓN
/*
* public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int a;
		int b;
		int n;
		System.out.println("ingrese un entero");
		n = leer.nextInt();
		for (a=1;a<=n;a++) {
			for (b=1;b<=n;b++) {
				if (a==1 || a==n || b==1 || b==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(" ");
		}
	}*/
