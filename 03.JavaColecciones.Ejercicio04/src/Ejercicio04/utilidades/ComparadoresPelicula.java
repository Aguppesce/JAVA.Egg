package Ejercicio04.utilidades;

import Ejercicio04.entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Agu
 */
public class ComparadoresPelicula {
    public static Comparator<Pelicula> ordenarPorDuracionAsce = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t1, Pelicula t2) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };        
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t2, Pelicula t1) {
            return t2.getDuracion().compareTo(t1.getDuracion());
        }
    };        
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t2, Pelicula t1) {
            return t2.getTitulo().compareTo(t1.getTitulo());
        }
    };        
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t2, Pelicula t1) {
            return t2.getDirector().compareTo(t1.getDirector());
        }
    };        
}
