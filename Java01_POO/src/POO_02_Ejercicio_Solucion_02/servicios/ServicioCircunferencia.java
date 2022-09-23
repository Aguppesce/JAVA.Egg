package POO_02_Ejercicio_Solucion_02.servicios;

import POO_02_Ejercicio_Solucion_02.entidades.Circunferencia;

import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * @author Aguppesce
 */
public class ServicioCircunferencia {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia(){

        System.out.print("Introducir radio: ");
        double radio = leer.nextInt();

        return new Circunferencia(radio);
    }

    public double area(Circunferencia c1){
        double radio = c1.getRadio();
        double area= PI * Math.pow(radio,2);
        return area;
    }

    public double perimetro(Circunferencia c1){
        double radio = c1.getRadio();
        double perimetro = 2*PI*radio;
        return perimetro;
    }
}
