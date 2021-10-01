package tienda.menu;

import java.util.InputMismatchException;
import tienda.excepcion.TiendaExcepcion;
import java.util.Scanner;
import tienda.servicios.FabricanteService;
import tienda.servicios.ProductoService;

/**
 *
 * @author Agu
 */
public class TiendaMenu {
    
    private Scanner entrada;
    private ProductoService productoService;
    private FabricanteService fabricanteService;
    private int respuesta;

    public TiendaMenu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        productoService = new ProductoService();
        fabricanteService = new FabricanteService();
        respuesta = 0;
    }

    public void menuPrincipal() {
        do {
            try {
                System.out.println("ELIJA UNA OPCIÓN");
                System.out.println("1. CREAR PRODUCTO");
                System.out.println("2. MODIFICAR PRODUCTO");
                System.out.println("3. ELIMINAR PRODUCTO");
                System.out.println("4. CONSULTAS SQL");
                System.out.println("5. CREAR FABRICANTE");
                System.out.println("6. MODIFICAR FABRICANTE");
                System.out.println("7. ELIMINAR FABRICANTE");
                System.out.println("8. MOSTRAR FABRICANTE");
                System.out.println("9. SALIR");

                respuesta = entrada.nextInt();

                switch (respuesta) {
                    case 1:
                        crearProducto();
                        break;
                    case 2:
                        modificarProducto();
                        break;
                    case 3:
                        eliminarProducto();
                        break;
                    case 4:
                        System.out.println("ELIJA UNA OPCIÓN");
                        System.out.println("1. VER TODOS LOS PRODUCTOS");
                        System.out.println("2. VER PRODUCTOS POR NOMBRE");
                        System.out.println("3. VER PRODUCTOS POR NOMBRE Y PRECIO");
                        System.out.println("4. VER PRODUCTOS POR RANGO DE PRECIO ENTRE 120 Y 202");
                        System.out.println("5. VER PRODUCTOS QUE CONTENGAN 'PORTATIL'");
                        System.out.println("6. VER PRODUCTO MÁS BARATO");
                        respuesta = entrada.nextInt();                        
                        if(respuesta == 1){
                            productoService.imprimirProductos();
                        }
                        if(respuesta == 2){
                            productoService.imprimirProductosPorNombre();
                        }
                        if(respuesta == 3){
                            productoService.imprimirProductosPorNombreYPrecio();
                        }
                        if(respuesta == 4){
                            productoService.imprimirProductosPorRangoPrecio();
                        }
                        if(respuesta == 5){
                            productoService.imprimirProductosPorPortatil();
                        }
                        if(respuesta == 6){
                            productoService.imprimirProductoMasBarato();
                        }
                        break;
                    case 5:
                        crearFabricante();
                        break;
                    case 6:
                        modificarFabricante();                        
                        break;
                    case 7:
                        eliminarFabricante();
                        break;
                    case 8:
                        fabricanteService.imprimirFabricantes();
                        break;
                    case 9:
                        System.out.println("*** SESIÓN FINALIZADA ***");
                        break;
                    default:
                        System.out.println("LA OPCIÓN INGRESADA ES INVÁLIDA");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                entrada.next();
            } catch (TiendaExcepcion e) {
                System.out.println(e.getMessage());
            }
        } while (respuesta != 9);
    }

    // MÉTODO LECTURA DE DATOS
    public void crearProducto() {
        try {
            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            System.out.println("INGRESE PRECIO: ");
            Double precio = entrada.nextDouble();

            System.out.println("INGRESE CODIGO FABRICANTE: ");
            Integer codigoFabricante = entrada.nextInt();

            productoService.crearProducto(nombre, precio, codigoFabricante);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void crearFabricante() {
        try {
            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            fabricanteService.crearFabricante(nombre);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    // MÉTODO LECTURA DE DATOS
    public void modificarProducto() {
        try {
            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            System.out.println("INGRESE PRECIO: ");
            Double precio = entrada.nextDouble();

            System.out.println("INGRESE CODIGO FABRICANTE: ");
            Integer codigoFabricante = entrada.nextInt();

            productoService.modificarProducto(nombre, precio, codigoFabricante);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void modificarFabricante() {
        try {
            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            fabricanteService.modificarFabricante(nombre);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }

    // MÉTODO LECTURA DE DATOS
    public void eliminarProducto() {
        try {
            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            productoService.eliminarProducto(nombre);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void eliminarFabricante() {
        try {
            System.out.println("INGRESE NOMBRE: ");
            String nombre = entrada.next();

            fabricanteService.eliminarFabricante(nombre);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
    
}
