/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner 
para  leer  dos  números  en  forma  de  cadena.  A  continuación,  utilice  el  método 
parseInt() de la clase Integer, para convertir las cadenas al tipo int y guardarlas en 
dos  variables  de  tipo  int.  Por  ultimo  realizar  una  división  con  los  dos  numeros  y 
mostrar el resultado.  
Todas  estas  operaciones  puede  tirar  excepciones  a  manejar,  el  ingreso  por 
teclado puede causar una excepción de tipo InputMismatchException, el método 
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una 
NumberFormatException  y  además,  al  dividir  un  número  por  cero  surge  una 
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques 
try/catch para las distintas excepciones
 */
package Ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class DivisionNumero {

    public static void main(String[] args) throws DivisionNumeroException {
        validoDatos();
    }

    public static void ingresoDatos(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String num1, num2;
        
        System.out.print("Número 1: ");
        num1 = leer.next();

        System.out.print("Número 2: ");
        num2 = leer.next();
        
        Integer n1 = Integer.parseInt(num1);
        Integer n2 = Integer.parseInt(num2);
        
        Integer calculo = n1/n2;
    }
    
    public static void validoDatos(){        
        try{
            ingresoDatos();
        }catch (NumberFormatException e) {
            System.out.println("Formato no válido. Vuelva a ingresar los datos");
            System.out.println(e.toString());
            e.getMessage();
            ingresoDatos();
        }catch (InputMismatchException e) {
            System.out.println("Ingrese solo números enteros. Vuelva a ingresar los datos");
            System.out.println(e.toString());
            e.getMessage();
            ingresoDatos();
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por 0. Vuelva a ingresar los datos");
            System.out.println(e.toString());
            e.getMessage();
            ingresoDatos();
        }       
        
    }
    
}
