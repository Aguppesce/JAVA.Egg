package libreria.dominio.editorial;

import libreria.dominio.editorial.Editorial;
import libreria.excepcion.ExcepcionLibreria;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import libreria.persistencia.EditorialDAO;
import libreria.utilidad.Utilidad;


public class EditorialService {

    private EditorialDAO daoEditorial;
    private final Scanner leer;

    public EditorialService() {
        this.daoEditorial = new EditorialDAO();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Editorial crearEditorial(String nombre) throws ExcepcionLibreria {
        try {
            Editorial editorial = new Editorial();
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new ExcepcionLibreria("Debe indicar un nombre");
            }
            validarEditorial(nombre);
            editorial.setNombre(nombre);
            
            Long id;
            do {
                id = Long.parseLong(Utilidad.generarIsbn());
            } while (daoEditorial.buscarEditorialPorId(id) != null);            
            editorial.setId(id);
            
            editorial.setAlta(Boolean.TRUE);
            daoEditorial.guardarEditorial(editorial);

            return editorial;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }
    
    public boolean validarEditorial(String nombreEditorial) throws ExcepcionLibreria {
        boolean validar = false;
        try {
            List<Editorial> editoriales = daoEditorial.listaEditoriales();
            for (Editorial aux : editoriales) {
                if (aux.getNombre().equalsIgnoreCase(nombreEditorial)) {
                    throw new ExcepcionLibreria("Editorial ya registrada, ingrese otra");
                }
            }
            validar = true;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
        return validar;
    }    

    public void modificarEditorial(String nombre) throws ExcepcionLibreria {
        try {
            
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new ExcepcionLibreria("Debe indicar un nombre");
            }
            //Buscamos
            Editorial editorial = buscarEditorialPorNombre(nombre);
            //Validamos
            if(!editorial.getNombre().equalsIgnoreCase(nombre)){
                throw new ExcepcionLibreria("El nombre no está registrado en el sistema!");
            }
            //Modificamos
            editorial.setNombre(nombre);
            daoEditorial.modificarEditorial(editorial);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void eliminarEditorial(Editorial editorial) throws ExcepcionLibreria {
        try {
            //Validamos
            if (editorial == null) {
                throw new ExcepcionLibreria("Debe indicar un nombre");
            }
            daoEditorial.modificarEditorial(editorial);
            System.out.println("Autor eliminado con éxito!");
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }
   

    //C: mostrarAutores | A: imprimirAutores
    public void imprimirEditoriales() throws ExcepcionLibreria {
        try {
            //Listamos los autores
            List<Editorial> editoriales = daoEditorial.listaEditoriales();

            //Imprimimos los autores - Solo algunos atributos....
            if (editoriales.isEmpty()) {
                throw new ExcepcionLibreria("No existe autores para mostrar");
            } else {
                for (Editorial aux : editoriales) {
                    System.out.println("*****************************************");
                    System.out.println(+aux.getId()+") " + aux.getNombre());
                }
            }
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }

    public void imprimirUnaEditorial(String nombre) throws ExcepcionLibreria {
        System.out.println(daoEditorial.buscarEditorialPorNombre(nombre));
    }
    
    public Editorial buscarEditorialPorNombre(String nombre) throws Exception {
        try {
            //Validación
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar un titulo");
            }
            Editorial editorial = daoEditorial.buscarEditorialPorNombre(nombre);
            return editorial;
        } catch (Exception e) {
            throw e;
        }
    }

    public Editorial buscarEditorialPorId(Long id) throws ExcepcionLibreria {
        try {
            //Validación
            if (id == null) {
                throw new ExcepcionLibreria("Debe indicar el id");
            }
            Editorial editorial = daoEditorial.buscarEditorialPorId(id);
            return editorial;
        } catch (ExcepcionLibreria e) {
            throw e;
        }
    }
}
