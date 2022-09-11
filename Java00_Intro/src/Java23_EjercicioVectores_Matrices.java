import java.util.Random;
import java.util.Scanner;

/**
 * @autor Aguppesce
 */

//Ejercicio 23: Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el numero y si se encuentra repetido

public class Java23_EjercicioVectores_Matrices {
    public static void main(String[] args) {
        int num,buscar,aleatorio,cont;
        boolean flag=false;
        cont=0;
        Scanner leer = new Scanner(System.in);
        Random random=new Random();

        System.out.print("Ingrese tamaño del vector: ");
        num = leer.nextInt();
        int[] vec= new int [num];

        for(int i=0; i<num; i++){
            aleatorio =  random.nextInt(10) + 1;
            vec[i]=aleatorio;

        }

        System.out.println("");
        System.out.print("¿Cuál número quiere buscar?: ");
        buscar = leer.nextInt();
        System.out.println("");
        for(int i=0; i<vec.length; i++ ){
            if(buscar==vec[i]){
                System.out.println("Su número está en la posición: "+(i+1));
                cont=cont+1;
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("Su número no está en el vector");
        }
        if(cont>0){
            System.out.println("El número se repitió: "+cont+" veces");
        }
        System.out.println("");
        System.out.print("El vector es: ");
        for(int a=0; a<vec.length; a++){
            System.out.print("["+vec[a]+"], ");
        }

    }
}

//OTRA SOLUCIÓN
/*
public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int n,busq,cont = 0;
        boolean bandera = false;
        System.out.println("Ingresa el tamaño del arreglo");
        n=leer.nextInt();

        int[] vectorN = new int[n];

        //lleno con enteros aleatorios del 1 al 60
        for (int i=0;i<n;i++){
        //fuerzo que los generados sean enteros con (int) y luego limito que sean
        //desde 0 a 60 los aleatorios pero al final le sumo +1 para que nunca
        //me toque el 0 como aleatorio
            vectorN[i]=(int)(Math.random()*60)+1;
        }

        System.out.println("Ingresa el numero a buscar");
        busq=leer.nextInt();
            for (int i=0;i<vectorN.length;i++){

                if (vectorN[i]==busq){
                    cont++;
                    System.out.println("Se encontro el numero en "+cont+" oportunidades");
                    System.out.println("En la posicion "+i);

                }else
                {
                   bandera = true;
                }

            }

            if (bandera==true && cont==0){

                System.out.println("No se encontro el Numero buscado "+busq);
                System.out.println("en el vector ");
                //muestro el vector
                for (int i=0;i<vectorN.length;i++){
                System.out.print("[" + vectorN[i] + "]");
                }
                System.out.println("");
            }
    }
*/
