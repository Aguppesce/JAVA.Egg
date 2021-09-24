package Ejercicio04.servicios;

import Ejercicio04.entidades.Pelicula;
import Ejercicio04.utilidades.ComparadoresPelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioPelicula {
    
    private Scanner leer;
    private ArrayList<Pelicula> peliculas;
    
    public ServicioPelicula() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.peliculas = new ArrayList();
    }
    
    public Pelicula crearPelicula(){
        System.out.print("Titulo: ");
        String titulo=leer.next();
        System.out.print("Director: ");
        String director=leer.next();
        System.out.print("Duracion: ");
        Double duracion=leer.nextDouble();
        
        Pelicula p = new Pelicula(titulo, director, duracion);
        return new Pelicula(titulo, director, duracion);
    }
    
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    
    public void fabricaPelicula(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Pelicula peliculaCreada = crearPelicula();
            
            agregarPelicula(peliculaCreada);
        }
    }
    
    public void mostrarPelicula(){
        System.out.println("Listado Peliculas: ");
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }
    
    public void mostrarMasDeUnaHora(){
        System.out.println("Peliculas con duración mayor a una hora: ");
        for (Pelicula aux : peliculas) {
            if(aux.getDuracion()<1){
                System.out.println(aux.toString());
            }            
        }
    }
    
    public void mostrarMayorAMenor(){
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorDuracionAsce);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }
    
    public void mostrarMenorAMayor(){
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorDuracionDesc);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }
    public void mostrarPorTitulo(){
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorTitulo);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }
    public void mostrarPorDirector(){
        Collections.sort(peliculas, ComparadoresPelicula.ordenarPorDirector);
        for (Pelicula aux : peliculas) {
            System.out.println(aux.toString());
        }
    }
}
