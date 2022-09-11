package POO_01_Ejercicio.entidades;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int nroPaginas;

    //Constructor vacío
    public Libro() {
    }

    public Libro(String isbn, String titulo, String autor, int nroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
    }

    //Getters(Para acceder al valor de los atributos) y Setters(Para setear los atributos)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    //Método toString, sirve para mostrar por pantalla los valores de cada atributo
    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", nroPaginas=" + nroPaginas +
                '}';
    }
}
