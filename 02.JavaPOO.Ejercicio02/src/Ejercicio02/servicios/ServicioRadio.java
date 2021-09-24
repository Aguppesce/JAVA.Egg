package Ejercicio02.servicios;

import Ejercicio02.entidades.Circunferencia;
import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioRadio {
    
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
