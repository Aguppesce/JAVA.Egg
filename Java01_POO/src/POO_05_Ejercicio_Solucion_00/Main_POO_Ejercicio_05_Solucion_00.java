package POO_05_Ejercicio_Solucion_00;

import POO_05_Ejercicio_Solucion_00.entidades.Cuenta;
import POO_05_Ejercicio_Solucion_00.servicios.ServicioCuenta;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_05_Solucion_00 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServicioCuenta sc = new ServicioCuenta();
        System.out.println("Crear Cuenta 1");
        Cuenta c1 = sc.crearCuenta();

        System.out.println("Crear Cuenta 2");
        Cuenta c2 = sc.crearCuenta();
        System.out.println("************************\n");
        System.out.println("Ingrese el monto a transferir de la Cuenta 1 a la Cuenta 2");
        double deposito = leer.nextDouble();
        sc.retiro(c1, deposito);
        sc.ingreso(c2, deposito);
        System.out.println("************************\n");
        System.out.println("Consulta Saldo Cuenta 1 $ " + c1.getSaldoActual());
        System.out.println("Consulta Saldo Cuenta 2 $ " + c2.getSaldoActual());
        System.out.println("************************\n");
        System.out.println("Extraccion Rapida Cuenta 2");
        sc.extraccionRapida(c2);
        System.out.println("************************\n");
        System.out.println("Consulta Saldo Cuenta 2 $ " + c2.getSaldoActual());
        leer.close();
    }
}
