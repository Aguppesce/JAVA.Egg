package tienda.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tienda.entidades.Producto;
import tienda.excepcion.TiendaExcepcion;

public final class ProductoDAO extends DAO {

    public void guardarProducto(Producto producto) throws TiendaExcepcion {
        try {
            if (producto == null) {
                throw new TiendaExcepcion("PRODUCTO INVÁLIDO");
            }

            String sql = "INSERT INTO Producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ('" + producto.getNombre() + "', '" + producto.getPrecio()
                    + "', '" + producto.getCodigoFabricante() + "' );";

            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL GUARDAR PRODUCTO");
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws TiendaExcepcion {
        try {
            if (producto == null) {
                throw new TiendaExcepcion("PRODUCTO INVÁLIDO");
            }

            String sql = "UPDATE Producto SET " + "nombre = '" + producto.getNombre() + "', "
                    + "precio = '" + producto.getPrecio() + "', codigo_fabricante = '"
                    + producto.getCodigoFabricante() + "' WHERE codigo = '" + producto.getCodigo() + "';";

            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL MODIFICAR PRODUCTO");
        }
    }

    public void eliminarProducto(String nombre) throws TiendaExcepcion {
        try {

            String sql = "DELETE FROM Producto WHERE nombre = '" + nombre + "';";

            System.out.println(sql);
            System.out.println();

            insertarModificarEliminar(sql);
        } catch (TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL ELIMINAR EL PRODUCTO");
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorNombre(String nombre) throws TiendaExcepcion {
        try {
            String sql = "SELECT * FROM Producto "
                    + "WHERE nombre = '" + nombre + "';";

            consultarBase(sql);

            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

            }
            desconectarBase();
            return producto;
        } catch (TiendaExcepcion | SQLException e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally {
            desconectarBase();
        }
    }

    public Producto buscarProductoPorCodigo(Integer codigo) throws TiendaExcepcion {
        try {
            String sql = "SELECT * FROM Producto " + "WHERE codigo = '" + codigo + "'";

            consultarBase(sql);

            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (TiendaExcepcion | SQLException e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTO");
        } finally {
            desconectarBase();
        }

    }

    //1RA FORMA DE HACER UNA QUERY
    public List<Producto> obtenerProductos() throws TiendaExcepcion {
        try {
            String sql = "SELECT * FROM Producto";

            consultarBase(sql);

            List<Producto> productos = new ArrayList();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();

                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }

            return productos;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    //2DA FORMA DE HACER UNA QUERY
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";

            consultarBase(sql);

            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));

                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public List<Producto> obtenerProductosPorNombre() throws TiendaExcepcion {
        try {
            String sql = "SELECT nombre FROM Producto";

            consultarBase(sql);

            List<Producto> productos = new ArrayList();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                productos.add(producto);
            }

            return productos;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }

    public List<Producto> obtenerProductosPorNombreYPrecio() throws TiendaExcepcion {
        try {
            String sql = "SELECT nombre,precio FROM Producto";

            consultarBase(sql);

            List<Producto> productos = new ArrayList();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    public List<Producto> obtenerProductosPorRangoPrecio() throws TiendaExcepcion {
        try {
            String sql = "SELECT nombre,precio FROM Producto WHERE precio >= 120 && precio <=202";

            consultarBase(sql);

            List<Producto> productos = new ArrayList();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    public List<Producto> obtenerProductosPorPortatil() throws TiendaExcepcion {
        try {
            String sql = "SELECT nombre FROM Producto WHERE nombre LIKE '%Portátil%'";

            consultarBase(sql);

            List<Producto> productos = new ArrayList();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));                
                productos.add(producto);
            }
            return productos;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    public List<Producto> obtenerProductoMasBarato() throws TiendaExcepcion {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio asc LIMIT 1;";

            consultarBase(sql);

            List<Producto> productos = new ArrayList();
            Producto producto = null;

            while (resultado.next()) {
                producto = new Producto();
                producto.setNombre(resultado.getString(1));                
                producto.setPrecio(resultado.getDouble(2));
                productos.add(producto);
            }
            return productos;
        } catch (SQLException | TiendaExcepcion e) {
            System.out.println(e.getMessage());
            throw new TiendaExcepcion("ERROR AL OBTENER PRODUCTOS");
        } finally {
            desconectarBase();
        }
    }
    
    //METODOS ALTERNATIVOS
    public void alterObtenerProd() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre: " + resultado.getString("nombre"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void alterObtenerProdPorNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Producto: " + resultado.getString("nombre"));
                System.out.println("Precio: " + resultado.getDouble("precio"));
            }

        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void alterObtenerProdPorRangoPrecio() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE precio BETWEEN 120 AND 202";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre: " + resultado.getString("nombre"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;

        }
    }

    public void alterObtenerProdPortatiles() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE nombre like 'Portatil%'";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre: " + resultado.getString("nombre") + " Precio: $" + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void alterObtenerProdMasBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            consultarBase(sql);
            while (resultado.next()) {
                System.out.println("Nombre: " + resultado.getString("nombre") + "\tPrecio: $" + resultado.getDouble("precio"));
            }
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void insertarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto is null");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + producto.getNombre()
                    + "', " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }

    public void modificarProducto(Producto producto, String nombreProducto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Producto is null");
            }
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante() + " WHERE nombre = '" + nombreProducto
                    + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            // TODO: handle exception
            throw e;
        }
    }
    
}
