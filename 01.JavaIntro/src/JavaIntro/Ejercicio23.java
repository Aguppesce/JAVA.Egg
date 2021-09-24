/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {

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