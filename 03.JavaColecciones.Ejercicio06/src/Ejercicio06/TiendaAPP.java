package Ejercicio06;

import Ejercicio06.servicios.ServicioTienda;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class TiendaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioTienda servTienda = new ServicioTienda();
        
        String opc, nombreProducto;
        int sw;
        boolean flag = false;
        
        do {
            System.out.println("\n-------MENU-------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Cambiar Precio");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servTienda.fabricaTienda(1);
                    do {
                        System.out.print("Desea agregar otro producto (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servTienda.fabricaTienda(1);
                        } else if (opc.equals("N")) {
                            servTienda.mostrarTienda();
                            flag = true;
                        }
                    } while (!flag);                    
                    break;
                
                case 2:
                    System.out.println("-----Listado Productos-----");
                    servTienda.mostrarTienda();
                    System.out.println("");
                    break;
                
                case 3:
                    System.out.print("Ingrese nombre del producto: ");
                    nombreProducto = leer.next();
                    servTienda.modificarPrecio(nombreProducto);
                    break;
                    
                case 4:
                    System.out.print("Ingrese nombre del producto: ");
                    nombreProducto = leer.next();
                    servTienda.eliminar(nombreProducto);
                    break;
            }
        } while (sw != 5);
        System.out.println("");
    }    
}
