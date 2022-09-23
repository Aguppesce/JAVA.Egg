package POO_05_Ejercicio_Solucion_02.servicios;

import POO_05_Ejercicio_Solucion_02.entidades.Cuenta;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCuenta {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cuenta crearCuenta() {
        System.out.print("Ingrese su número de cuenta: ");
        int numeroCuenta = leer.nextInt();

        System.out.print("Ingrese su DNI: ");
        int dniCliente = leer.nextInt();

        System.out.print("Ingrese su saldo actual: ");
        double saldoActual = leer.nextDouble();

        return new Cuenta(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(Cuenta c1) {
        double total = c1.getSaldoActual();
        System.out.print("Cuánto dinero quiere ingresar?: ");
        double ingreso = leer.nextDouble();
        c1.setSaldoActual(total + ingreso);
        System.out.print("Su saldo es de: "+c1.getSaldoActual());
    }

    public void retirar(Cuenta c1) {
        double total = c1.getSaldoActual();
        System.out.print("Cuánto dinero quiere retirar?: ");
        double retiro = leer.nextDouble();
        if (retiro > c1.getSaldoActual()) {
            System.out.print("Saldo insuficiente: 0");
            c1.setSaldoActual(0);
        } else {
            c1.setSaldoActual(total - retiro);
            System.out.print("Le quedan: "+c1.getSaldoActual());
        }
    }

    public void extraccionRapida(Cuenta c1) {
        double total = c1.getSaldoActual();
        double extRapida = total * 0.2;
        System.out.print("Retiró: " + extRapida);
        c1.setSaldoActual(total-extRapida);
        System.out.print("Saldo restante: " + c1.getSaldoActual());
    }

    public void consultarSaldo(Cuenta c1) {
        System.out.print("Saldo actual: "+c1.getSaldoActual());
    }

    public void datos(Cuenta c1) {
        System.out.println("DNI: " + c1.getDniCliente());
        System.out.println("Número de cuenta: " + c1.getNumeroCuenta());
    }
}
