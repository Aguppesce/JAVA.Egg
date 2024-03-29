package POO_02_Ejercicio_Solucion_00.servicios;

import POO_02_Ejercicio_Solucion_00.entidades.Circunferencia;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCircunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Circunferencia crearCircunsferencia() {
        System.out.println("Ingresa el radio de la circunsferencia");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);
    }

    public double calculaArea(Circunferencia c) {
        double radio = c.getRadio();
        double area = Math.PI * (radio * radio);
        return area;
    }

    public double calculaPerimetro(Circunferencia c) {
        double radio = c.getRadio();
        double perimetro = (2 * Math.PI) * radio;
        return perimetro;
    }
}
