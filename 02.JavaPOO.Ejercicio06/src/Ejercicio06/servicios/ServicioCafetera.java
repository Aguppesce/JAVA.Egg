package Ejercicio06.servicios;

import Ejercicio06.entidades.Cafetera;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class ServicioCafetera {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera crearCafetera(){
        int capacidadMaxima = 0;
        int cantidadActual = 0;        
        return new Cafetera (capacidadMaxima, cantidadActual);
    }
    
    public void llenarCafetera(Cafetera c1){
        int cantidadMaxima = 100;
        c1.setCapacidadActual(cantidadMaxima);
        System.out.println("Capacidad actual: "+c1.getCapacidadActual());
    }
    
    public int servirTaza(Cafetera c1, int tamTaza){        
        System.out.print("Ingrese tamaño de la taza: ");
        tamTaza = leer.nextInt();
        if(c1.getCapacidadActual()<tamTaza){
            tamTaza=c1.getCapacidadActual();
            System.out.print("No se lleno la taza, pero quedo en: "+tamTaza+"\n");
            c1.setCapacidadActual(0);
            System.out.print("Capacidad actual: "+c1.getCapacidadActual());
        }else{
            tamTaza=tamTaza;
            System.out.print("Se lleno la taza: "+tamTaza+"\n");
            c1.setCapacidadActual(c1.getCapacidadActual()-tamTaza);
            System.out.print("Capacidad actual: "+c1.getCapacidadActual());
        }        
        return c1.getCapacidadActual();
    }
    public void vaciarCafetera(Cafetera c1){
        c1.setCapacidadActual(0);
        System.out.print("Capacidad actual: "+c1.getCapacidadActual());        
    }
    public int agregarCafe(Cafetera c1, int cafe){
        System.out.println("Tenga en cuenta que el nivel actual de la cafetera es: "+c1.getCapacidadActual()+" y su capacidad máxima es 100");
        System.out.print("Cuánto café desea agregar?: ");
        cafe = leer.nextInt();        
        if((cafe+c1.getCapacidadActual())>100){
            System.out.println("Cafetera rebalsada");
        }else{
            c1.setCapacidadActual(cafe+c1.getCapacidadActual());
            System.out.print("Capacidad actual: "+c1.getCapacidadActual());
        }        
        return c1.getCapacidadActual();
    }
}
