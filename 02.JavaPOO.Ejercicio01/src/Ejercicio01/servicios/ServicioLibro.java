package Ejercicio01.servicios;

import Ejercicio01.entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioLibro {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearLibro(){
        System.out.print("Introducir ISBN: ");
        int isbn = leer.nextInt();
        System.out.print("Introducir Título: ");
        String titulo = leer.next();
        System.out.print("Introducir Autor: ");
        String autor = leer.next();
        System.out.print("Introducir Nro de Páginas: ");
        int nro_paginas = leer.nextInt();
        
        return new Libro(isbn, titulo, autor, nro_paginas);
    }
}
