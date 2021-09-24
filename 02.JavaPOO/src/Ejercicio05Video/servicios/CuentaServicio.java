package Ejercicio05Video.servicios;

import Ejercicio05Video.entidades.Cuenta;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class CuentaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Cuenta crearCuenta(){
        Cuenta c = new Cuenta();
        
        System.out.println("Bienvenido, ingrese sus datos para crear una cuenta");
//        System.out.print("Ingrese su número de cuenta: ");
//        int numeroCuenta = leer.nextInt();
        int numeroCuenta = new Random().nextInt(999999999);
        System.out.print("Ingrese su dni: ");
        long dni = leer.nextLong();
        System.out.print("Ingrese el saldo inicial: ");
        double saldoActual = leer.nextDouble();
        
        c.setNumeroCuenta(numeroCuenta);
        c.setDni(dni);        
        c.setSaldoActual(saldoActual);
        
        return c;
    }
    
    private void ingreso(Cuenta c, double ingreso){        
        c.setSaldoActual(c.getSaldoActual() + ingreso);        
        System.out.print("Ingreso exitoso. Saldo Actual: $" + c.getSaldoActual());
    }
    
    private void retirar(Cuenta c){        
        System.out.print("Ingrese la cantidad a retirar: ");
        double retiro = leer.nextDouble();
        
        if(c.getSaldoActual()<retiro){
            System.out.println("No hay suficiente saldo disponible");
        }else{
            c.setSaldoActual(c.getSaldoActual()-retiro);
            System.out.print("Retiro exitoso. Su saldo actual es: $"+c.getSaldoActual());
        }
    }
    
    private void extraccionRapida(Cuenta c){        
        System.out.print("Ingrese la cantidad a retirar: ");
        double retiro = leer.nextDouble();
        
        if(c.getSaldoActual()*0.2<retiro){
            System.out.print("El retiro no puede superar el 20% de su saldo en la extracción rápida.");
        }else{
            c.setSaldoActual(c.getSaldoActual()-retiro);
            System.out.print("Retiro exitoso. Su saldo actual es: $"+c.getSaldoActual());
        }
    }
    
    private void consultarSaldo(Cuenta c){
        System.out.print("Saldo disponible: $"+c.getSaldoActual());
    }
    
    private void consultarDatos(Cuenta c){        
        System.out.print("DNI: "+c.getDni()+"\n");
        System.out.print("Número de cuenta: "+c.getNumeroCuenta()+"\n");
        System.out.print("Saldo Actual: $"+c.getSaldoActual()+"\n");
    }
    
    private void mostrarMenu(){
        System.out.print("---------MENU--------\n"
                + "1 - Ingreso\n"
                + "2 - Extracción\n"
                + "3 - Extracción Rápido\n"
                + "4 - Consulta saldo disponible\n"
                + "5 - Consulta datos cuenta\n"
                + "6 - Salir\n\n"
                + "Elija una opción: ");
    }
    
    private int elegirOpcion(){
        int sel;
        do {
            sel = leer.nextInt();
            if(sel < 1 || sel > 6){
                System.out.println("Selección inválida. Intente nuevamente");
            }
        }while(sel < 1 || sel > 6);
        return sel;
    }
    
    public void ejecutarMenu(){
        Cuenta c1 = crearCuenta();
        mostrarMenu();
        int sel = 0;
        
        do{
            sel = elegirOpcion();
            
            switch(sel){
                case 1:
                    System.out.print("Digite el monto a ingresar: ");
                    double ingreso = leer.nextDouble();
                    ingreso(c1,ingreso);
                    break;
                case 2:
                    retirar(c1);
                    break;
                case 3:
                    extraccionRapida(c1);
                    break;
                case 4:
                    consultarSaldo(c1);
                    break;
                case 5:
                    consultarDatos(c1);
                    break;
                case 6:
                    System.out.println("Adiós");
                    break;
            }
            if( sel!=6){
                System.out.println("");
                mostrarMenu();
                System.out.println("");
            }            
        }while(sel !=6);
    }
}
