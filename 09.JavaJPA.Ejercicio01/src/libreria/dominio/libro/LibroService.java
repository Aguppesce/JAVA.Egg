package libreria.dominio.libro;

import libreria.dominio.editorial.EditorialService;
import libreria.dominio.autor.AutorService;
import libreria.dominio.libro.Libro;
import java.util.List;
import libreria.dominio.autor.Autor;
import libreria.dominio.editorial.Editorial;
import libreria.excepcion.ExcepcionLibreria;
import libreria.persistencia.LibroDAO;
import libreria.utilidad.Utilidad;

public class LibroService {

    private final LibroDAO daoLibro;        
    private final AutorService autorService;
    private final EditorialService editorialService;

    public LibroService() {
        this.daoLibro = new LibroDAO();        
        this.autorService = new AutorService();        
        this.editorialService = new EditorialService();
    }

    public void crearLibro(String titulo, Integer anio, String nombreAutor, String nombreEditorial) throws Exception {
        try {
            Libro libro = new Libro();     
            
            //VALIDACIÓN ISBN DE FORMA AUTOMÁTICA
            Long isbn;
            do {
                isbn = Long.parseLong(Utilidad.generarIsbn());
            } while (daoLibro.buscarLibroPorIsbn(isbn) != null);            
            libro.setIsbn(isbn);
            
            //VALIDACIÓN TÍTULO
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar un titulo");
            }
            validarTitulo(titulo);
            libro.setTitulo(titulo);
            
            //VALIDACIÓN AÑO           
            if (anio == null) {
                throw new Exception("Debe indicar un anio");
            }
            libro.setAnio(anio);
            
            //CARGO EJEMPLARES, PRESTADOS Y RESTANTES DE FORMA AUTOMÁTICA 
            Integer ejemplares = (int) (Math.random() * 6 + 3);
            libro.setEjemplares(ejemplares);
            
            Integer ejemplaresPrestados = (int) (Math.random() * 2 + 1);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            
            Integer ejemplaresRestantes = ejemplares - ejemplaresPrestados;
            libro.setEjemplaresRestantes(ejemplaresRestantes);                  
            
            //VALIDAR AUTOR            
            Autor nuevoAutor = autorService.crearAutor(nombreAutor);
            libro.setAutor(nuevoAutor);
            
            //VALIDAR EDITORIAL
            Editorial nuevaEditorial = editorialService.crearEditorial(nombreEditorial);            
            libro.setEditorial(nuevaEditorial);

            daoLibro.guardarLibro(libro);

        } catch (Exception e) {
            System.out.println("No se registró el libro! " + e.getMessage());
        }
    }    
    
    public boolean validarTitulo(String tituloI) throws ExcepcionLibreria {
        boolean validar = false;
        try {
            List<Libro> libros = daoLibro.buscarLibros();
            for (Libro aux : libros) {
                if (aux.getTitulo().equalsIgnoreCase(tituloI)) {
                    throw new ExcepcionLibreria("Título ya registrado, ingrese otro!");
                }
            }
            validar = true;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
        return validar;
    }

    public void imprimirUnLibro(String titulo) throws Exception {
        System.out.println(daoLibro.buscarLibroPorTitulo(titulo));
    }
    
    public void mostrarLibros() throws Exception {
        try{
            List<Libro> libros = daoLibro.buscarLibros();
            if(libros.isEmpty()){
                System.out.println("No se ha cargado ningún libro!");
            } else{
                System.out.println("\nLIBROS");
                System.out.printf("%-16s%-40s%-25s%-15s%-8s%-12s%-12s%n", "ISBN", "TÍTULO", "AUTOR", "EDITORIAL", "AÑO", "EJEMPLARES", "PRESTADOS", "RESTANTES");
                libros.forEach(System.out::print);
                System.out.println();
            }
        }catch(Exception e){
            throw e;
        }
    }

    public void modificarLibro(String titulo, Integer anio, String nombreAutor, String nombreEditorial) throws Exception {
        try {            
            //Buscar Libro
            Libro libro = buscarLibroPorTitulo(titulo);
            
            //Validación            
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar el título que quiere modificar");
            }
            validarTitulo(titulo);
            libro.setTitulo(titulo);
            
            
            if (anio == null || anio < 800) {
                throw new Exception("Debe indicar un anio");
            }
            libro.setAnio(anio);
            
            Autor modificarAutor = autorService.crearAutor(nombreAutor);
            libro.setAutor(modificarAutor);

            Editorial modificarEditorial = editorialService.crearEditorial(nombreEditorial);
            libro.setEditorial(modificarEditorial);

            daoLibro.modificarLibro(libro);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarLibro(String titulo) throws Exception {
        try {
            //Validamos
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar el título que quiere eliminar!");
            }
            daoLibro.eliminarLibroPorTitulo(titulo);
            System.out.println("Libro eliminado!");
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) throws Exception {
        try {
            //Validación
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar un titulo");
            }
            Libro libro = daoLibro.buscarLibroPorTitulo(titulo);
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }

    public Libro buscarLibroPorId(String id) throws Exception {
        try {
            //Validación
            if (id == null) {
                throw new Exception("Debe indicar el id");
            }
            Libro libro = daoLibro.buscarLibroPorId(id);
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }
}
