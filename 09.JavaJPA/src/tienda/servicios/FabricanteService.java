package tienda.servicios;

import java.util.Collection;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.excepcion.TiendaExcepcion;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Agu
 */
public class FabricanteService {
    
    private FabricanteDAO fabricanteDAO;
    
    public FabricanteService(){
        this.fabricanteDAO = new FabricanteDAO();
        //también puede ser productoDAO = new ProductoDAO();
    }
    
    public void crearFabricante(String nombre) throws TiendaExcepcion {
        
        try {
            //Validamos            
            if(nombre == null || nombre.trim().isEmpty()){
                throw new TiendaExcepcion("DEBE INGRESAR UN NOMBRE");
            }
            
            Fabricante fabricante = new Fabricante();                   
            
            fabricante.setNombre(nombre);         
            
            fabricanteDAO.guardarFabricante(fabricante);
        } catch (TiendaExcepcion e){
            throw e;
        } catch (Exception e){
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }
    
    public void modificarFabricante(String nombre) throws TiendaExcepcion {
        try {
            // VALIDACIÓN
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new TiendaExcepcion("DEBE INGRESAR UN NOMBRE");
            }

            Fabricante fabricante = fabricanteDAO.buscarFabricantePorNombre(nombre);

            if (fabricante == null) {
                throw new TiendaExcepcion("EL NOMBRE INGRESADO NO ESTÁ ASOCIADO A NINGÚN FABRICNATE");
            }

            fabricante.setNombre(nombre);
            
            fabricanteDAO.modificarFabricante(fabricante);
            
        } catch (TiendaExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }

    public void eliminarFabricante(String nombre) throws TiendaExcepcion {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new TiendaExcepcion("DEBE INGRESAR UN FABRICANTE");
            }

            Fabricante fabricante = fabricanteDAO.buscarFabricantePorNombre(nombre);

            if (fabricante == null) {
                throw new TiendaExcepcion("EL NOMBRE INGRESADO NO ESTÁ ASOCIADO A NINGÚN FABRICANTE");
            }

            fabricanteDAO.eliminarFabricante(nombre);
        } catch (TiendaExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }

    public Collection<Fabricante> listarFabricante() throws Exception {

        try {

            Collection<Fabricante> fabricantes = fabricanteDAO.listarFabricantes();

            return fabricantes;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirListarFabricantes() throws Exception {
        try {

            //Listamos los usuarios
            Collection<Fabricante> fabricantes = listarFabricante();

            //Imprimimos los usuarios
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen fabricantes para imprimir");
            } else {
                for (Fabricante aux : fabricantes) {
                    System.out.println(aux);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    //2 EN 1 (listarFabricante() y imprimirListarFabricantes())
    public void imprimirFabricantes() throws TiendaExcepcion {
        try {
            List<Fabricante> fabricantes = fabricanteDAO.obtenerFabricantes();

            if (fabricantes.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN FABRICANTES");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                //System.out.printf("%-20s%-15s%-15s\n", "NOMBRE"); // FORMATO DE IMPRESIÓN
                for (Fabricante aux : fabricantes) {
                    System.out.println(aux);
                }
                System.out.println();
            }
        } catch (TiendaExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            Fabricante fabricante = fabricanteDAO.buscarFabricantePorNombre(nombre);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }

    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws Exception {

        try {

            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }

            Fabricante fabricante = fabricanteDAO.buscarFabricantePorCodigo(codigo);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
    
}