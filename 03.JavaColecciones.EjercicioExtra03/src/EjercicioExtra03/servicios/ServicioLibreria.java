package EjercicioExtra03.servicios;
/**
 *
 * @author Agu
 */
public class ServicioLibreria {
    private String titulo;
    private String autor;
    private Integer ejemplares;
    private Integer ejemplaresPrestados;

    public ServicioLibreria() {
    }
    

    public ServicioLibreria(String titulo, String autor, Integer ejemeplares, Integer ejemeplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemeplares;
        this.ejemplaresPrestados = ejemeplaresPrestados;
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

    public Integer getEjemeplares() {
        return ejemplares;
    }

    public void setEjemeplares(Integer ejemeplares) {
        this.ejemplares = ejemeplares;
    }

    public Integer getEjemeplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemeplaresPrestados(Integer ejemeplaresPrestados) {
        this.ejemplaresPrestados = ejemeplaresPrestados;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + " Autor: " + autor + " Ejemeplares: " + ejemplares + " Ejemeplares Prestados: " + ejemplaresPrestados;
    }
    
    
}
