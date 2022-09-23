package POO_03_Ejercicio.servicios;


import POO_03_Ejercicio.entidades.Operacion;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioOperacion {

    private Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.printf("Valor número 1: ");
        Double numero1 = leer.nextDouble();
        System.out.printf("Valor número 2: ");
        Double numero2 = leer.nextDouble();

        return new Operacion(numero1, numero2);
    }

    public Double sumar(Operacion o) {
        Double resultado;
        resultado = o.getNumero1() + o.getNumero2();
        return resultado;
    }

    public Double restar(Operacion o) {
        Double resultado;
        resultado = o.getNumero1() - o.getNumero2();
        return resultado;
    }

    public Double multiplicar(Operacion o) {
        Double resultado;
        if (o.getNumero1() == 0 || o.getNumero2() == 0) {
            System.out.println("No se puede multiplicar por 0. Cambie los valores");
            return resultado = 0.0;
        } else {
            resultado = o.getNumero1() * o.getNumero2();
            return resultado;
        }
    }

    public Double dividir(Operacion o) {
        Double resultado;
        if (o.getNumero1() == 0 || o.getNumero2() == 0) {
            System.out.println("No se puede dividir por 0. Cambie los valores");
            return resultado = 0.0;
        } else {
            resultado = o.getNumero1() / o.getNumero2();
            return resultado;
        }
    }

    private void mostrarMenu() {
        System.out.printf("-----------MENÚ-----------\n" +
                "1) Suma\n" +
                "2) Resta\n" +
                "3) Multiplicar\n" +
                "4) Dividir\n" +
                "5) Cambiar valor de los números\n" +
                "0) Salir\n" +
                "Ingrese su opción: ");
    }

    private Integer elegirOpcion() {
        Integer opcion;
        do {
            opcion = leer.nextInt();
            if (opcion < 0 || opcion > 3) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
        return opcion;
    }

    public void ejecutarMenuOperacion() {
        Integer opcion;
        System.out.println("Para comenzar ingrese el valor de los números. ");
        Operacion operacion = crearOperacion();
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Resultado suma: " + sumar(operacion));
                    break;
                case 2:
                    System.out.println("Resultado resta: " + restar(operacion));
                    break;
                case 3:
                    System.out.println("Resultado multiplicación: " + multiplicar(operacion));
                    break;
                case 4:
                    System.out.println("Resultado división: " + dividir(operacion));
                    break;
                case 5:
                    System.out.print("Ingrese nuevo valor 1: ");
                    Double valor1 = leer.nextDouble();
                    operacion.setNumero1(valor1);
                    System.out.print("Ingrese nuevo valor 2: ");
                    Double valor2 = leer.nextDouble();
                    operacion.setNumero2(valor2);
                    break;
                case 0:
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida!");
                    break;
            }
        } while (opcion != 0);
    }
}
