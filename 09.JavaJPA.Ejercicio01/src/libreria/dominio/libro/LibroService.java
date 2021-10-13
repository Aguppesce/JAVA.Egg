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
                    throw new ExcepcionLibreria("Este título ya está registrado. Ingrese otro!");
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
    
   public void imprimirLibros() throws ExcepcionLibreria {
        try {
            //Listamos los autores
            List<Libro> libros = daoLibro.buscarLibros();            
            //Imprimimos los autores - Solo algunos atributos....
            if (libros.isEmpty()) {
                throw new ExcepcionLibreria("No existen libro para imprimir!");
            } else {
                //System.out.printf("%-25s%-15s%-8s%-12s%-12s%-12s%-15s%-15s%n", "Nombre" , "ISBN", "Año", "Ejemplares", "Prestados", "Restantes", "Autor", "Editorial", "Alta");
                Integer i = 0;
                for (Libro aux : libros) {                    
                    System.out.println((i+1)+") Nombre: " + aux.getTitulo()
                            + " | ISBN: " + aux.getIsbn()
                            + " | Año: " + aux.getAnio()
                            + " | Ejemplares: " + aux.getEjemplares()
                            + " | Ejemplares Prestados: " + aux.getEjemplaresPrestados()
                            + " | Ejemplares Restantes: " + aux.getEjemplaresRestantes()
                            + " | Autor: " + aux.getAutor().getNombre()
                            + " | Editorial: " + aux.getEditorial().getNombre()
                            + " | Alta: " + aux.getAlta());
                    i++;
                }
            }
        } catch (ExcepcionLibreria e) {
            System.out.println(e.getMessage());
        }
    }

    public void modificarLibro(String modificarTitulo, String titulo, Integer anio, String nombreAutor, String nombreEditorial) throws Exception {
        try {            
            //Buscar Libro
            Libro libro = buscarLibroPorTitulo(modificarTitulo);
            
            //Validación            
            if (titulo == null || titulo.trim().isEmpty()) {
                throw new Exception("Debe indicar el título que quiere modificar");
            }            
            libro.setTitulo(titulo);
            
            
            if (anio == null) {
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

    public Libro buscarLibroPorIsbn(Long isbn) throws Exception {
        try {
            //Validación
            if (isbn == null) {
                throw new Exception("Debe indicar el id");
            }
            Libro libro = daoLibro.buscarLibroPorIsbn(isbn);
            return libro;
        } catch (Exception e) {
            throw e;
        }
    }
}
