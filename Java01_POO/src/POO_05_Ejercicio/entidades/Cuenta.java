package POO_05_Ejercicio.entidades;

/**
 * @author Aguppesce
 */
public class Cuenta {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual, interes;


    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long dniCliente, double saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return ".....:Cuenta:....." +
               "\nNumero de cuenta: " + numeroCuenta +
               "\nDNI: " + dniCliente +
               "\nSaldo Actual: " + saldoActual +
               "\nInteres: " + interes;
    }
}
