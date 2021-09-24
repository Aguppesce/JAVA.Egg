package Ejercicio04;

import Ejercicio04.servicios.ServicioPelicula;
import Ejercicio04.utilidades.ComparadoresPelicula;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class PeliculaAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula servPelicula = new ServicioPelicula();
        
        String opc;
        int sw;
        boolean flag = false;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Más de una hora");            
            System.out.println("4. Mayor a menor");
            System.out.println("5. Menor a mayor");
            System.out.println("6. Por titulo");
            System.out.println("6. Por director");
            System.out.println("8. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servPelicula.fabricaPelicula(1);
                    do {
                        System.out.print("Desea agregar otro alumno (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servPelicula.fabricaPelicula(1);
                        } else if (opc.equals("N")) {
                            flag = true;
                        }
                    } while (!flag);                    
                    break;
                case 2:
                    System.out.println("-----Listado Pelicula-----");
                    servPelicula.mostrarPelicula();
                    System.out.println("");
                    break;
                case 3:
                    servPelicula.mostrarMasDeUnaHora();
                    break;
                case 4:
                    servPelicula.mostrarMayorAMenor();
                    break;
                case 5:
                    servPelicula.mostrarMenorAMayor();
                    break;
                case 6:
                    servPelicula.mostrarPorTitulo();
                    break;
                case 7:
                    servPelicula.mostrarPorDirector();
                    break;
            }
        } while (sw != 8);
        System.out.println("");
    }    
}
