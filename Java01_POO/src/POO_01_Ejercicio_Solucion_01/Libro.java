package POO_01_Ejercicio_Solucion_01;

import java.util.Scanner;

/**
 * @author Aguppesce
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void pedirDatos(){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el ISBN: ");
        isbn = leer.nextLine();

        System.out.print("Ingrese el Título: ");
        titulo = leer.nextLine();

        System.out.print("Ingrese el Autor: ");
        autor = leer.nextLine();

        System.out.print("Ingrese el Número de páginas: ");
        numPaginas = leer.nextInt();
    }

    public Libro crearLibro(){

        pedirDatos();

        return new Libro(isbn, titulo, autor, numPaginas);
    }

    @Override
    public String toString() {
        return "Libro:" +
               "ISBN: '" + isbn + "\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Número Páginas: " + numPaginas;
    }
}
