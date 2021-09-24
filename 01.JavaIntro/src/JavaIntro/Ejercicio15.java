/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        int num1, num2, seleccion;
        char valSalida;

        System.out.println("Ingrese los 2 números enteros positivos con los que va a operar, en orden");
        num1 = pedirEntero();
        num2 = pedirEntero();

        while (num1 < 1 || num2 < 1) {
            System.out.println("Los números ingresados deben ser positivos");
            num1 = pedirEntero();
            num2 = pedirEntero();
        }

        do {
            mostrarMenu();
            seleccion = validarSeleccion();
            valSalida = ejecutarSeleccion(seleccion, num1, num2);
        } while (valSalida != 'S');
    }

    public static int pedirEntero() {
        Scanner leer = new Scanner(System.in);
        return leer.nextInt();
    }

    public static char pedirChar() {
        Scanner leer = new Scanner(System.in);
        return leer.next().charAt(0);
    }

    public static void mostrarMenu() {
        System.out.println("--------MENU--------\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir\n"
                + "5. Salir\n");
    }

    public static int validarSeleccion() {
        int seleccion = pedirEntero();

        while (seleccion < 1 || seleccion > 5) {
            System.out.println("La opción ingresada no es válida");
            System.out.println("Elija otra opción: ");
            seleccion = pedirEntero();
        }
        return seleccion;
    }

    public static char ejecutarSeleccion(int seleccion, int a, int b) {
        char valSalida = '\u0000';
        switch (seleccion) {
            case 1:
                System.out.println("El resultado de la suma es:" + (a + b));
                break;
            case 2:
                System.out.println("El resultado de la resta es:" + (a - b));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es:" + (a * b));
                break;
            case 4:
                double resultado = (double) a / b;
                System.out.println("El resultado de la división es:" + resultado);
                break;
            case 5:
                System.out.println("¿Estás seguro que desea salir del programa (S/N)?");
                valSalida = Character.toUpperCase(pedirChar());
                while (valSalida != 'S' && valSalida != 'N') {
                    System.out.println("Ingrese una opción válida");
                    valSalida = Character.toUpperCase(pedirChar());
                }
                break;
        }
        return valSalida;
    }
}

//public class Ejercicio15 {
//
//    public static void main(String[] args) {
//        int num1, num2,opcion;
//        String opc="";
//        Scanner leer = new Scanner(System.in);
//
//        System.out.print("Ingrese número 1: ");
//        num1 = leer.nextInt();
//        System.out.print("Ingrese número 2: ");
//        num2 = leer.nextInt();       
//        do {
//            System.out.print("\n\nElija opción: ");
//            System.out.println("    MENU");
//            System.out.println("1. Sumar");
//            System.out.println("2. Restar");
//            System.out.println("3. Multiplicar");
//            System.out.println("4. Dividir");
//            System.out.println("5. Salir");
//            opcion = leer.nextInt();
//            switch(opcion){
//                case 1: System.out.println("La suma es: "+(num1+num2));
//                    break;
//                case 2: System.out.println("La resta es: "+(num1-num2));
//                    break;
//                case 3: System.out.println("La multiplicaciónn es: "+(num1*num2));
//                    break;
//                case 4: System.out.println("La división es: "+(num1/num2));
//                    break;
//                case 5: System.out.println("¿Está seguro que desea salir del programa (S/N)?: ");                
//                        opc = leer.next();
//                        if(opc.equals("S") || opc.equals("s")){
//                            break;
//                        }else{
//                            if(opc.equals("N") || opc.equals("n")){
//                                System.out.println("Elija opción: ");                                
//                                opcion = leer.nextInt();
//                            }                            
//                        }                   
//            }       
//        }while(opcion!=5);
//    }
//}

