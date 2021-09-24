package IntroManejoDeExcepcionesEjemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("INICIO PROGRAMA");
        Scanner leer = new Scanner(System.in);

//        try {
//            String aux = null;
//        System.out.println(aux.toLowerCase());
//        } catch(NullPointerException e){
//            System.out.println("Intentaste trabajar con un objeto nulo");
//        }


//        try {
//            int a = 10;
//            System.out.println("Ingrese un número");
//            int b = leer.nextInt();
//            System.out.println(a / b);
//        } catch (ArithmeticException e){ //también se puede usar de la sguiente forma (ArithmeticException | InputMismatchException e)
//            System.out.println("Intentaste dividir por 0");
//        } catch (InputMismatchException e){
//            System.out.println("Ingresaste letras en lugar de números");
//        } finally {
//            System.out.println("Entre al finally");
//        }

    try{        
        System.out.println("Ingrese un número");
        int a = leer.nextInt();
        validar(a);
    } catch(Exception e){
        e.printStackTrace();
    }
        
          
        System.out.println("FIN PROGRAMA");
    }
    
    public static void validar(int numero) throws Exception{
        if(numero<0){
            throw new MainException("El número es menor que 0");
        }
    }

}
