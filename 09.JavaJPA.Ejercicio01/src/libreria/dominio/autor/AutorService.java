package libreria.dominio.autor;

import java.util.List;
import libreria.dominio.autor.Autor;
import libreria.excepcion.ExcepcionLibreria;
import libreria.persistencia.AutorDAO;
import libreria.utilidad.Utilidad;

public class AutorService {

    private AutorDAO daoAutor;
    
    public AutorService() {
        this.daoAutor = new AutorDAO();        
    }

    public Autor crearAutor(String nombre) throws ExcepcionLibreria {
        try {
            Autor autor = new Autor();  
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new ExcepcionLibreria("Debe indicar un nombre");
            }         
            validarAutor(nombre);
            autor.setNombre(nombre);
            
            Long id;
            do {
                id = Long.parseLong(Utilidad.generarIsbn());
            } while (daoAutor.buscarAutorPorId(id) != null);            
            autor.setId(id);
            
            daoAutor.guardarAutor(autor);
            return autor;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }
    
    public boolean validarAutor(String nombreAutor) throws ExcepcionLibreria {
        boolean validar = false;
        try {
            List<Autor> autores = daoAutor.buscarAutores();
            for (Autor aux : autores) { 
                if (aux.getNombre().equalsIgnoreCase(nombreAutor)) {
                    throw new ExcepcionLibreria("Autor ya registrado, ingrese otro");
                }
            }
            validar = true;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
        return validar;
    }   

    //C: mostrarAutores | A: imprimirAutores
    public void imprimirAutores() throws ExcepcionLibreria {
        try {
            //Listamos los autores
            List<Autor> autores = daoAutor.buscarAutores();

            //Imprimimos los autores - Solo algunos atributos....
            if (autores.isEmpty()) {
                throw new ExcepcionLibreria("No existe autores para mostrar");
            } else {
                Integer i = 0;
                System.out.println("--------------LISTA DE AUTORES--------------");
                for (Autor aux : autores) {                    
                    System.out.println((i+1)+") "+ aux.getNombre());
                    i++;
                }
            }
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }

    public void imprimirUnAutor(String nombre) throws ExcepcionLibreria {
        System.out.println(daoAutor.buscarAutorPorNombre(nombre));
    }

    public void modificarAutor(String nombre) throws ExcepcionLibreria {
        try {
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new ExcepcionLibreria("Debe indicar un nombre");
            }
            //Buscamos
            Autor autor = buscarAutorPorNombre(nombre);
            //Validamos
            if(!autor.getNombre().equalsIgnoreCase(nombre)){
                throw new ExcepcionLibreria("El nombre no está registrado en el sistema!");
            }
            //Modificamos
            autor.setNombre(nombre);
            daoAutor.modificarAutor(autor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarAutor(String nombre) throws ExcepcionLibreria {
        try {
            //Validamos
            if (nombre == null) {
                throw new ExcepcionLibreria("Debe indicar un nombre");
            }
            daoAutor.eliminarAutorPorNombre(nombre);
            System.out.println("Autor eliminado con éxito!");
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }

    public Autor buscarAutorPorId(Long id) throws ExcepcionLibreria {
        try {
            //Validación
            if (id == null) {
                throw new ExcepcionLibreria("Debe indicar el id");
            }
            Autor autor = daoAutor.buscarAutorPorId(id);
            return autor;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }
    
    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        try {
            //Validación
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un titulo");
            }
            Autor autor = daoAutor.buscarAutorPorNombre(nombre);
            return autor;
        } catch (Exception e) {
            throw e;
        }
    }

}
