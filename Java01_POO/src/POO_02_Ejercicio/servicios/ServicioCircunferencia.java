/**
 @author Aguppesce
 */

package POO_02_Ejercicio.servicios;

import POO_02_Ejercicio.entidades.Circunferencia;

import java.util.Scanner;

public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {

        System.out.printf("Ingrese radio: ");
        Double radio = leer.nextDouble();

        return new Circunferencia(radio);
    }

    public double calcularArea(Double radio) {
        Double resultadoArea;
        resultadoArea = Math.PI * Math.pow(radio, 2);
        return resultadoArea;
    }

    public double calcularPerimetro(Double radio) {
        Double resultadoPerimetro;
        resultadoPerimetro = 2 * Math.PI * radio;
        return resultadoPerimetro;
    }

    private void mostrarMenu() {
        System.out.printf("-----------MENÚ-----------\n" +
                "1) Cambiar radio\n" +
                "2) Calcular Área\n" +
                "3) Calcular Perímetro\n" +
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

    public void ejecutarMenuCircunferencia() {
        Integer opcion = 0;
        Circunferencia circunferencia = new Circunferencia();
        System.out.printf("Ingresar radio de la circunferencia: ");
        Double radioCircunferencia = leer.nextDouble();
        circunferencia.setRadio(radioCircunferencia);
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese radio: ");
                    radioCircunferencia = leer.nextDouble();
                    circunferencia.setRadio(radioCircunferencia);
                case 2:
                    System.out.println("Área: " + calcularArea(circunferencia.getRadio()));
                    break;
                case 3:
                    System.out.println("Radio: " + calcularPerimetro(circunferencia.getRadio()));
                    break;
                case 0:
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida!");
            }
        } while (opcion != 0);
    }
}
