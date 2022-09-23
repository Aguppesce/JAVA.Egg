package POO_02_Ejercicio_Solucion_01;

import java.util.Scanner;

/**
 * @author Aguppesce
 */

public class Circunferencia {

    private Double radio;

    public Circunferencia() {
    }

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        Double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }

    public Double area(Circunferencia c) {
        Double resultado;
        resultado = Math.PI * Math.pow(c.getRadio(), 2);
        return resultado;
    }

    public Double perimetro(Circunferencia c){
        Double resultado;
        resultado = 2 * Math.PI * c.getRadio();
        return resultado;
    }

    public void menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cree la circunferencia: ");
        Circunferencia c = crearCircunferencia();

        Integer opcion;
        Double radio;
        do {
            System.out.println("Menú");
            System.out.println("1. Calcular área");
            System.out.println("2. Calcular perímetro");
            System.out.println("3. Cambiar radio");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("El área es: " + area(c));
                    break;
                case 2:
                    System.out.println("El perímetro es: " + perimetro(c));
                    break;
                case 3:
                    System.out.print("Ingrese nuevo radio: ");
                    radio = leer.nextDouble();
                    c.setRadio(radio);
                case 0:
                    System.out.println("Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);
    }
}
