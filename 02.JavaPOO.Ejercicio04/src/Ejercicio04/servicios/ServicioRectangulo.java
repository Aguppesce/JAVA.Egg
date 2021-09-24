package Ejercicio04.servicios;

import Ejercicio04.entidades.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class ServicioRectangulo {
    int altura, base;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Rectangulo crearRectangulo(){
        System.out.print("Ingrese altura: ");
        altura = leer.nextInt();
        System.out.print("Ingrese base: ");
        base = leer.nextInt();
        
        return new Rectangulo(altura,base);
    }
    
    public int superficie(){
        return base*altura;
    }
    
    public int perimetro(){
        return (base+altura)*2;
    }
    
    public void dibujar(Rectangulo r1){
        int al=r1.getAltura();
        int ba=r1.getBase();
        for (int i = 0; i < ba; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < al-2; i++) {
            System.out.print("*");
            for (int j = 0; j < ba-2; j++) {
                System.out.print(" ");
            }
        }
        System.out.println("");
        for (int i = 0; i < ba; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }    
}
