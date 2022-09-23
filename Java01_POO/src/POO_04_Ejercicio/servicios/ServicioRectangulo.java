package POO_04_Ejercicio.servicios;
/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes. Superficie = base * altura / Perímetro = (base + altura) * 2 */

import POO_04_Ejercicio.entidades.Rectangulo;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioRectangulo {

    private Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        System.out.print("Ingrese base del rectángulo: ");
        double base = leer.nextDouble();
        System.out.print("Ingrese altura del rectángulo: ");
        double altura = leer.nextDouble();
        return new Rectangulo(base, altura);
    }

    public double calcularSuperficie(Rectangulo r) {
        return r.getBase() * r.getAltura();
    }

    public double calcularPerimetro(Rectangulo r) {
        return (r.getBase() + r.getAltura()) * 2;
    }

    public void dibujarRectangulo(Rectangulo r) {
        for (int i = 1; i <= r.getAltura(); i++) {
            for (int j = 1; j <= r.getBase(); j++) {
                System.out.print(" ");
                if (i == 1 || i == r.getAltura() || j == 1 || j == r.getBase()) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    private void mostrarMenu() {
        System.out.printf("..........:MENÚ:..........\n" +
                "1) Calcular superficie\n" +
                "2) Calcular perímetro\n" +
                "3) Dibujar rectángulo\n" +
                "4) Cambiar altura\n" +
                "5) Cambiar base\n" +
                "0) Salir\n" +
                "Ingrese su opción: ");
    }

    public void ejecutarMenuRectangulo() {
        System.out.println("Para comenzar a utilizar el programa defina la base y altura del rectángulo:");
        Rectangulo r = crearRectangulo();
        int opcion;
        do {
            mostrarMenu();
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Superficie del rectángulo: " + calcularSuperficie(r));
                    break;
                case 2:
                    System.out.println("Perímetro del rectángulo: " + calcularPerimetro(r));
                    break;
                case 3:
                    dibujarRectangulo(r);
                    break;
                case 4:
                    System.out.print("Ingrese nueva altura: ");
                    double altura = leer.nextDouble();
                    r.setAltura(altura);
                    break;
                case 5:
                    System.out.print("Ingrese nueva base: ");
                    double base = leer.nextDouble();
                    r.setBase(base);
                    break;
                case 6:
                    System.out.println("Vuelva pronto!");
                    break;
            }
        } while (opcion != 0);
    }
}
