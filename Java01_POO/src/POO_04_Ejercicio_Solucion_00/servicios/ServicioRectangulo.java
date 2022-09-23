package POO_04_Ejercicio_Solucion_00.servicios;

import POO_04_Ejercicio_Solucion_00.entidades.Rectangulo;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioRectangulo {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        System.out.println("Ingresa la base del rectangulo");
        int base = leer.nextInt();
        System.out.println("Ingresa la altura del rectangulo");
        int altura = leer.nextInt();
        return new Rectangulo(base, altura);
    }

    public int superficie(Rectangulo r) {
        int base = r.getBase();
        int altura = r.getAltura();
        return base * altura;
    }

    public int perimetro(Rectangulo r) {
        int base = r.getBase();
        int altura = r.getAltura();
        return (base + altura) * 2;
    }

    public void dibujar(Rectangulo r){
        int base = r.getBase();
        int altura = r.getAltura();
        int i=0,j=0;
        while(i<altura) {
            while(j<base) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            j=0;
            i++;
        }
    }
}
