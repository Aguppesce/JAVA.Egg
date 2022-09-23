package POO_05_Ejercicio_Solucion_00.servicios;

import POO_05_Ejercicio_Solucion_00.entidades.Cuenta;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCuenta {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        System.out.println("Ingrese el Nro de la Cuenta");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el DNI del titular de la Cuenta");
        long dni = leer.nextLong();
        System.out.println("Ingrese el Saldo");
        double saldoActual = leer.nextDouble();
        System.out.println("Ingrese el Interes de la cuenta");
        double interes = leer.nextDouble();
        return new Cuenta(numeroCuenta, dni, saldoActual, interes);
    }

    public void ingreso(Cuenta c, double ingreso) {
        double saldoActual = c.getSaldoActual();
        c.setSaldoActual(saldoActual + ingreso);
    }

    public void retiro(Cuenta c, double retiro) {

        if (c.getSaldoActual() > retiro) {
            double saldoActual = c.getSaldoActual();
            c.setSaldoActual(saldoActual - retiro);
        } else {
            c.setSaldoActual(0);
        }
    }

    public void extraccionRapida(Cuenta c) {
        double saldoActual = c.getSaldoActual();
        double retiro = saldoActual * .20;
        c.setSaldoActual(saldoActual - retiro);
        System.out.println("Monto a retirar $ " + retiro);
    }
}
