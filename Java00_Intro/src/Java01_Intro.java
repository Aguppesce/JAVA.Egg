/**
 * @autor Aguppesce
 * */
//Java Intro: Tipos de datos primitivos
import java.util.Scanner;

public class Java01_Intro {

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

        System.out.print("Ingresar un dato de tipo string/palabra/cadena de caracteres: ");
        String palabra = leer.next();//LEER CADENA
        System.out.println("Dato de tipo string/cadena/palabra: " + palabra);

        System.out.print("Ingresar un dato de tipo número entero: ");
        num = leer.nextInt();
        System.out.println("Número entero: " + num);

        System.out.print("Ingrese un dato de tipo número real: ");
        numReal = leer.nextDouble();
        System.out.println("Número real: " + numReal);

        System.out.print("Ingresar un dato de tipo booleano: ");
        logico = leer.nextBoolean();
        System.out.println("Dato de tipo lógico/booleano: " + logico);

        System.out.println("Ingresar un dato de tipo caracter");
        caracter = leer.next().charAt(0);
        System.out.println("Dato de tipo aracter: " + caracter);


    }

}
