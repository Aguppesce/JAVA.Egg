package POO_00_Intro.Ejemplo;

import POO_00_Intro.Ejemplo.entidades.Mascota;
import POO_00_Intro.Ejemplo.servicios.ServicioMascota;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Aguppesce
 */

public class Intro_POO_Ejemplo_Mascota {
    public static void main(String[] args) {
         /*Scanner leer = new Scanner(System.in);
        Random rdm = new Random();
        final float precioLitros = 182.2F;
        int cont=0;
        float total = 0, cantidadLitrosUno=0, cantidadLitros = 0;

        for(int i=0; i <= 5; i++){
            int codArt = rdm.nextInt(1000000)+1;
            System.out.print("Ingrese cantidad de litros: ");
            float litros = Float.parseFloat(leer.nextLine());

            if(i == 0){
                cantidadLitrosUno = litros*precioLitros;
            }
            if(i > 0){
                cantidadLitros = litros*precioLitros;
                if(cantidadLitros >= 600){
                    cont++;
                }
                System.out.println("Factura N°" + (i+1) + "\nTotal: " + cantidadLitros + "\nCódigo de Artículo: "+ codArt);
            }
            total=cantidadLitros+total;
        }
        System.out.println("Total arítculo 1:  " + cantidadLitrosUno);
        System.out.println("El total de toodo es: "+total);
        System.out.println("Cantidad de artículos que superan los $600: "+cont);*/


        Scanner leer = new Scanner(System.in);
        //Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");

        ServicioMascota sm = new ServicioMascota();

        Mascota m1 = sm.crearMascota();

        System.out.println(m1.toString());

        m1 = null;

        int a = 10;

        Mascota mm = new Mascota();

        modificador(a, mm);

        System.out.println("a " + a);
        ;
        System.out.println("Mascota" + mm);
    }

    public static void modificador(int num, Mascota m) {
        num = 100;
        m.setApodo("Mascota Referencia");
    }
}

