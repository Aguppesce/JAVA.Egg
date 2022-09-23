package POO_05_Ejercicio_Solucion_02;

import POO_05_Ejercicio_Solucion_02.entidades.Cuenta;
import POO_05_Ejercicio_Solucion_02.servicios.ServicioCuenta;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class Main_POO_Ejercicio_05_Solucion_02 {
    public static void main(String[] args) {
        int opc;

        Scanner leer = new Scanner(System.in);
        ServicioCuenta sc = new ServicioCuenta();
        Cuenta c1 = sc.crearCuenta();

        do{
            System.out.println("----------MENU------------");
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Extracción Rápida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            opc = leer.nextInt();
            switch(opc){
                case 1: sc.ingresar(c1);
                    break;
                case 2: sc.retirar(c1);
                    break;
                case 3: sc.extraccionRapida(c1);
                    break;
                case 4: sc.consultarSaldo(c1);
                    break;
                case 5: sc.datos(c1);
                    break;
            }
        }while(opc!=6);
    }
}

