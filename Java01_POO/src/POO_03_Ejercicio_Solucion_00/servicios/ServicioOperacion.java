package POO_03_Ejercicio_Solucion_00.servicios;

import POO_03_Ejercicio_Solucion_00.entidades.Operacion;

import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class ServicioOperacion {
    int numero1, numero2;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {
        System.out.print("Ingrese número 1: ");
        numero1 = leer.nextInt();

        System.out.print("Ingrese número 2: ");
        numero2 = leer.nextInt();

        return new Operacion(numero1, numero2);
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {

        if (numero1 == 0 || numero2 == 0) {
            System.out.print("Ha ingresado un 0, resultado: ");
            return 0;
        } else {
            System.out.print("La mutiplicación es: ");
            return numero1 * numero2;
        }
    }

    public float dividir() {

        if (numero1 == 0 || numero2 == 0) {
            System.out.print("Ha ingresado un 0, resultado: ");
            return 0;
        } else {
            System.out.print("La mutiplicación es: ");
            return numero1 / numero2;
        }
    }
}
