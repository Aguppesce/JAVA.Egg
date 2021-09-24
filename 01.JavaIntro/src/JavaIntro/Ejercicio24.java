/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        int num,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
        
        boolean flag=false;
        Scanner leer = new Scanner(System.in);
        
        
        System.out.print("Ingrese tamaño del vector: ");
        num = leer.nextInt();
        int[] vec= new int [num];        
            
        for(int i=0; i<num; i++){      
            vec[i]=i;
        }
        for(int i=0; i<vec.length; i++){      
            if(vec[i]>0 && vec[i]<10){
                cont1=cont1+1;
            }
            if(vec[i]>10 && vec[i]<100){
                cont2=cont2+1;
            }
            if(vec[i]>100 && vec[i]<1000){
                cont3=cont3+1;
            }
            if(vec[i]>1000 && vec[i]<10000){
                cont4=cont4+1;
            }
            if(vec[i]>10000 && vec[i]<10000){
                cont5=cont5+1;
            }
        }
        System.out.println("Existen ["+cont1+"] números de 1 dígito\n"
                          +"Existen ["+cont2+"] números de 2 dígito\n"
                          +"Existen ["+cont3+"] números de 3 dígito\n"
                          +"Existen ["+cont4+"] números de 4 dígito\n"
                          +"Existen ["+cont5+"] números de 5 dígito\n");
        //Mostrar Vector
//        for(int i=0; i<num; i++){      
//            System.out.println("["+vec[i]+"]");
//        }
    }
}