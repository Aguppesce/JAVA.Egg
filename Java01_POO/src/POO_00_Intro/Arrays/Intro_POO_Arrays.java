package POO_00_Intro.Arrays;

import java.util.Arrays;
/**
 *
 * @author Aguppesce
 */
public class Intro_POO_Arrays {
    public static void main(String[] args) {
        //Creamos un arreglo
        int arreglo1[] = {4,2,5,6,10};
        imprimirArreglo(arreglo1);

        //Método fill = Método para inicializar arreglo con un determinado
        int arreglo2[] = new int[5];
        Arrays.fill(arreglo2, 7);
        imprimirArreglo(arreglo2);

        //Método copyOf = Método que permite copiar el contenido de un arreglo en otor arreglo
        int arreglo3[] = Arrays.copyOf(arreglo1, 5);
        imprimirArreglo(arreglo3);

        //Método equal = Determina si dos arreglos son iguales.
        if(Arrays.equals(arreglo1, arreglo2)){
            System.out.println("Los arreglo son iguales");
        }else{
            System.out.println("Los arreglos son distintos");
        }

        if(Arrays.equals(arreglo1, arreglo3)){
            System.out.println("Los arreglos son iguales");
        }else{
            System.out.println("Los arreglos son distintos");
        }

        //Método sort - Método para ordenar arreglos.
        Arrays.sort(arreglo1);
        imprimirArreglo(arreglo1);

        //Método binarySearch - sirve para buscar un elemento determinado en un arreglo. El método devuelve la posición en la cual se encuentra el elemento
        int posicion = Arrays.binarySearch(arreglo1, 8);
        System.out.println("El elemento 8 se encuentra en la posición " + posicion);

    }

    public static void imprimirArreglo(int arreglo[]){
        System.out.println("******ARREGLO******");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
