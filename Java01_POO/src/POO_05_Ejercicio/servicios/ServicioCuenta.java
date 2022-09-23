package POO_05_Ejercicio.servicios;

import POO_05_Ejercicio.entidades.Cuenta;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCuenta {
    private Scanner leer = new Scanner(System.in);

    public Cuenta crearCuentaBancaria() {
        int numeroCuenta = new Random().nextInt(9999999);
        System.out.printf("Número de cuenta asignado automáticamente: " + numeroCuenta);
        System.out.printf("\nIngrese su DNI: ");
        long dniCliente = leer.nextLong();
        System.out.printf("Saldo actual: ");
        double saldoActual = leer.nextDouble();
        System.out.printf("Interes de la cuenta: ");
        double interes = leer.nextDouble();

        return new Cuenta(numeroCuenta, dniCliente, saldoActual, interes);
    }

    public double ingresar(Cuenta c) {
        System.out.printf("Cuánto desea agregar?: ");
        double saldoIngresado = leer.nextDouble();
        if (saldoIngresado <= 0) {
            System.out.println("Debe ingresar números positivos");
            return c.getSaldoActual();
        } else {
            c.setSaldoActual(c.getSaldoActual()+saldoIngresado);
            return c.getSaldoActual();
        }
    }

    public double retirar(Cuenta c) {
        System.out.printf("Cuánto desea retirar?: ");
        double saldoRetirado = leer.nextDouble();
        if (saldoRetirado > c.getSaldoActual()) {
            System.out.println("No posee esa cantidad de dinero. Vuelva a intentar");
            return c.getSaldoActual();
        } else {
            c.setSaldoActual(c.getSaldoActual() - saldoRetirado);
            return c.getSaldoActual();
        }
    }

    public void extraccionRapida(Cuenta c) {
        System.out.printf("Ingrese monto a retirar: ");
        double montoExtraccionRapida = leer.nextDouble();
        if (montoExtraccionRapida > (c.getSaldoActual() * 0.20)) {
            System.out.println("Solo puede extraer el 20% \nEl 20% de su saldo es: " +(c.getSaldoActual()*0.20));
        } else {
            c.setSaldoActual(c.getSaldoActual() - montoExtraccionRapida);
            System.out.print("Su saldo quedo en: " + c.getSaldoActual());
        }
    }

    public double consultarSaldo(Cuenta c) {
        return c.getSaldoActual();
    }

    public void consultarDatos(Cuenta c) {
        System.out.println(c.toString());
    }

    private void mostrarMenu() {
        System.out.printf("\n..........:MENÚ:..........\n" +
                "1) Depositar\n" +
                "2) Retirar\n" +
                "3) Extraccion Rápida\n" +
                "4) Consultar saldo\n" +
                "5) Consultar datos\n" +
                "0) Salir\n" +
                "Ingrese su opción: ");
    }

    public void ejecutarMenuCuenta() {
        boolean flag = false;
        Cuenta c = crearCuentaBancaria();
        int opcion;
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    ingresar(c);
                    break;
                case 2:
                    retirar(c);
                    break;
                case 3:
                    extraccionRapida(c);
                    break;
                case 4:
                    System.out.println("Saldo actual: " + consultarSaldo(c));
                    break;
                case 5:
                    consultarDatos(c);
                    break;
            }
        }while (opcion != 0);
    }
}
