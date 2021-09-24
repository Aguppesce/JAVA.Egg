package Ejercicio05;

import Ejercicio05.entidades.Cuenta;
import Ejercicio05.servicios.ServicioCuenta;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class CuentaAPP {
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
