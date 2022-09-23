
package POO_06_Ejercicio_Solucion_00.servicios;

import POO_06_Ejercicio_Solucion_00.entidades.Cafetera;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera crearCafetera(){
        System.out.println("Ingrese la cantidad Maxima de la cafetera en cm3");
        int cantMax = leer.nextInt();
        System.out.println("Ingrese la cantidad actual de la cafetera");
        int cantAct = leer.nextInt();
        return new Cafetera(cantMax,cantAct);
    }

    public void llenarCafetera(Cafetera c){
        int llenar = c.getCapacidadMaxima();
        c.setCantidadActual(llenar);
    }

    public void vaciarCafetera(Cafetera c){
        c.setCantidadActual(0);
    }

    public void servirTaza(Cafetera c){
        System.out.println("Tamaño de taza en cm3");
        int taza = leer.nextInt();

        if(c.getCantidadActual()>taza){
            int cantidad = c.getCantidadActual();
            cantidad -= taza;
            c.setCantidadActual(cantidad);
        }else{
            int resto = taza - c.getCantidadActual();
            c.setCantidadActual(0);
            System.out.println("Se sirvio la taza con "+resto+" cm3 y la cafetera quedo vacia");
        }
    }

    public void agregarCafe(Cafetera c, int cantCafe){
        if (c.getCapacidadMaxima()<=6 && cantCafe>25){
            System.out.println("para un cafetera de 6 o menos tazas se recomienda 20 gr de cafe");
        }else if(c.getCapacidadMaxima()<=12 && cantCafe>45){
            System.out.println("para un cafetera de entre 6 y 12 tazas se recomienda 40 gr de cafe");
        }else{
            c.setCantidadCafe(cantCafe);
        }

    }
}
