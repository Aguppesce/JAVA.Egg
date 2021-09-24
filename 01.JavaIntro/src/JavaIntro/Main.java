/**
 *
 * @author Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //TIPOS DE DATOS - DEFINIR
        int num; //tipo ENTERO
        double numReal = 0.0;//tipo REAL
        String cadena = "hola mundo";//tipo CADENA
        char caracter = 'A';//tipo CARACTER
        boolean logico = true;//tipo LOGICO               
    
        //ESCRIBIR (atajo: sout+tab)
        System.out.println("El texto que quiero mostrar");

        //LEER
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingresar una palabra!");
        String palabra = leer.next();//LEER CADENA

        System.out.println("palabra: " + palabra);

        System.out.println("Ingresar un número!");
        num = leer.nextInt();
        System.out.println("numero: " + num);

        System.out.println("Ingre un real");
        numReal = leer.nextDouble();
        System.out.println("real: " + numReal);

        System.out.println("Ingresar un valor booleano!");
        logico = leer.nextBoolean();
        System.out.println("lógico: " + logico);

        System.out.println("Ingresar un caracter");
        caracter = leer.next().charAt(0);
        System.out.println("caracter: " + caracter);
        
        
    }

}
