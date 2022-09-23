package POO_06_Ejercicio.servicios;

import POO_06_Ejercicio.entidades.Cafetera;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCafetera {

    private Scanner leer = new Scanner(System.in);
    private Cafetera c1 = new Cafetera();

    public void llenarCafetera(Cafetera c) {
        c.setCantidadActual(200);
    }

    public void vaciarCafeter(Cafetera c) {
        c.setCantidadActual(0);
    }

    public int agregarCafe(Cafetera c) {
        System.out.println("Cuánto cafe desea agregar? (Recuerde que la capacidad máxima es 200ml)");
        int agregarCafe = leer.nextInt();
        if (c.getCantidadActual() + agregarCafe > c.getCapacidadMaxima()) {
            System.out.println("No puede agregar esa cantidad. Vuelva a intentar.");
        } else {
            c.setCantidadActual(c.getCantidadActual() + agregarCafe);
        }
        return c.getCantidadActual();
    }

    public int servirTaza(Cafetera c) {
        int opcion;
        System.out.println("Seleccione el tamaño de su taza:" +
                "\n1) Taza chica (25ml)" +
                "\n2) Taza mediana (50ml)" +
                "\n3) Taza grande (100ml)" +
                "\nIngrese su opción: ");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                if (c.getCantidadActual() - 25 < 0) {
                    System.out.println("No alcanza para llenar la taza.");

                } else {
                    c.setCantidadActual(c.getCantidadActual() - 25);
                    System.out.println("Disfrute el cafecito.");
                }
                break;
            case 2:
                if (c.getCantidadActual() - 50 < 0) {
                    System.out.println("No alcanza para llenar la taza.");
                } else {
                    c.setCantidadActual(c.getCantidadActual() - 50);
                    System.out.println("Disfrute el cafecito.");
                }
                break;
            case 3:
                if (c.getCantidadActual() - 100 < 0) {
                    System.out.println("No alcanza para llenar la taza.");
                } else {
                    c.setCantidadActual(c.getCantidadActual() - 100);
                    System.out.println("Disfrute el cafecito.");
                }
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }

        return c.getCantidadActual();
    }

    public int nivelActual(Cafetera c1) {
        return c1.getCantidadActual();
    }

    public void mostrarMenu() {
        System.out.printf("-----------MENÚ-----------\n" +
                "1) Llenar cafetera\n" +
                "2) Vaciar cafetera\n" +
                "3) Agregar café\n" +
                "4) Servir taza\n" +
                "5) Nivel actual\n" +
                "0) Salir\n" +
                "Ingrese su opción: ");
    }

    public void ejecutarMenuCafetera() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    llenarCafetera(c1);
                    break;
                case 2:
                    vaciarCafeter(c1);
                    break;
                case 3:
                    System.out.println("Nivel actual: " + agregarCafe(c1));
                    break;
                case 4:
                    System.out.println("Nivel actual: " + servirTaza(c1));
                    break;
                case 5:
                    System.out.println("Nivel actual: " + nivelActual(c1));
                    break;
                case 0:
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción inválida. Vuelva a intentar");
                    break;
            }
        } while (opcion != 0);
    }
}
