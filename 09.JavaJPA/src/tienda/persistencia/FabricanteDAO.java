package tienda.persistencia;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tienda.entidades.Fabricante;
import tienda.excepcion.TiendaExcepcion;

public final class FabricanteDAO extends DAO {
    
    public void guardarFabricante(Fabricante fabricante) throws TiendaExcepcion{
        try {
            if (fabricante == null){
                throw new TiendaExcepcion("FABRICANTE INVÁLIDO");
            }
            
            String sql = "INSERT INTO Fabricante (nombre)" 
                    + "VALUES ('" + fabricante.getNombre() + "' );";
            
            System.out.println(sql);
            System.out.println();
            
            insertarModificarEliminar(sql);
        } catch(TiendaExcepcion e){
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL GUARDAR FABRICANTE");
        } finally {
            desconectarBase();           
        }        
    }
    
    public void modificarFabricante(Fabricante fabricante) throws TiendaExcepcion{
        try {
            if (fabricante == null){
                throw new TiendaExcepcion("PRODUCTO INVÁLIDO");
            }
            
            String sql = "UPDATE Fabricante SET " + "nombre = '" 
                    + "' WHERE codigo = '" + fabricante.getCodigo() + "';";
            
            System.out.println(sql);
            System.out.println();
            
            insertarModificarEliminar(sql);
        } catch(TiendaExcepcion e){
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL MODIFICAR FABRICANTE");
        }
    }
    
    public void eliminarFabricante(String nombre) throws TiendaExcepcion {
        try {

            String sql = "DELETE FROM Fabricante WHERE nombre = '" + nombre + "';";

            System.out.println(sql);
            System.out.println();
            
            insertarModificarEliminar(sql);                        
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL ELIMINAR FABRICANTE");
        } finally {
            desconectarBase();
        }
    }
    
    public Fabricante buscarFabricantePorNombre(String nombre) throws TiendaExcepcion {
        try {
            String sql = "SELECT * FROM Fabricante "
                    + "WHERE nombre = '" + nombre + "';";
            
            consultarBase(sql);
            
            Fabricante fabricante = null;
            
            while (resultado.next()) {
                fabricante = new Fabricante();
                
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));                                
            }
            desconectarBase();
            return fabricante;
        }catch(TiendaExcepcion | SQLException e){
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER FABRICANTE");
        }finally{
            desconectarBase();
        }
    }
    
    public Fabricante buscarFabricantePorCodigo(Integer codigo) throws TiendaExcepcion {
        try {
            String sql = "SELECT * FROM Fabricante " + "WHERE codigo = '" + codigo + "'";
            
            consultarBase(sql);
            
            Fabricante fabricante = null;
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));               
            }
            desconectarBase();
            return fabricante;
        }catch(TiendaExcepcion | SQLException e){
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER FABRICANTE");
        }finally{
            desconectarBase();
        }     
        
    }
    
    //1RA FORMA DE HACER UNA QUERY
    public List<Fabricante> obtenerFabricantes() throws TiendaExcepcion{
        try {
            String sql = "SELECT * FROM Fabricante ";

            consultarBase(sql);
            
            List<Fabricante> fabricantes = new ArrayList();
            Fabricante fabricante = null;
            
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));                          
                
                fabricantes.add(fabricante);
            }
            
            return fabricantes;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());            
            throw new TiendaExcepcion("ERROR AL OBTENER FABRICANTES");
        } finally {
            desconectarBase();
        }
    }
    
    //2DA FORMA DE HACER UNA QUERY 
    public Collection<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante";

            consultarBase(sql);

            Fabricante fabricante = null;
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));                          
                
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
