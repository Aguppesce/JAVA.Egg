package Ejercicio02;

import java.util.ArrayList;

public class ArrayAPP {

    public static void main(String[] args) {               
        try {           
            
            int [] numeros = new int[1];
            
            for (int i = 0; i < 3; i ++) {
                numeros[i] = i+1;
            }
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fuera de indice");
            System.out.println(e.toString());
        }
        
    }
    
}
