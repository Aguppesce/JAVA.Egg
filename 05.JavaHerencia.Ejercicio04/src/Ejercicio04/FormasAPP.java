package Ejercicio04;

import Ejercicio04.entidades.Circulo;
import Ejercicio04.entidades.Rectangulo;

/**
 *
 * @author Agu
 */
public class FormasAPP {
    
    public static void main(String[] args) {
        
        Circulo c1 = new Circulo (2d , 3d);
        Rectangulo r1 = new Rectangulo ( 5d, 2d);
        
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        
        c1.calculoArea();
        c1.calculoPerimetro();
        
        r1.calculoArea();
        r1.calculoPerimetro();
        
        
    }
    
}
