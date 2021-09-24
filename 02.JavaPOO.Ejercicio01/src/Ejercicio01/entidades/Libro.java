package Ejercicio01.entidades;

/**
 *
 * @author Agu
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String Autor;
    private int nro_paginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String Autor, int nro_paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.Autor = Autor;
        this.nro_paginas = nro_paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", Autor=" + Autor + ", nro_paginas=" + nro_paginas + '}';
    }
    
    
}
