package tienda.servicios;

import tienda.entidades.Producto;
import tienda.excepcion.TiendaExcepcion;
import tienda.persistencia.ProductoDAO;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import tienda.persistencia.FabricanteDAO;

public class ProductoService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ProductoDAO productoDAO;
    private FabricanteDAO fabricanteDAO;
    //private ProductoDAO dao;
    
    public ProductoService(){
        this.productoDAO = new ProductoDAO();
        //también puede ser productoDAO = new ProductoDAO();
    }
    
    public void crearProducto(String nombre, Double precio, Integer codigoFabricante) throws TiendaExcepcion {
        
        try {
            //Validamos            
            if(nombre == null || nombre.trim().isEmpty()){
                throw new TiendaExcepcion("DEBE INGRESAR UN NOMBRE");
            }
            if(precio == null){
                throw new TiendaExcepcion("DEBE INGRESAR UN PRECIO");
            }
            if(precio < 0.1){
                throw new TiendaExcepcion("EL PRECIO NO PUEDE SER MENOR A 0,1");
            }
            if(codigoFabricante == null){
                throw new TiendaExcepcion("DEBE INGRESAR UN CÓDIGO DE FABRICANTE");
            }
            
            Producto producto = new Producto();                   
            
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            
            productoDAO.guardarProducto(producto);
        } catch (TiendaExcepcion e){
            throw e;
        } catch (Exception e){
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }
    
    public void modificarProducto(String nombre, Double precio, Integer codigoFabricante) throws TiendaExcepcion {
        try {
            // VALIDACIÓN
            if (nombre == null | nombre.trim().isEmpty()) {
                throw new TiendaExcepcion("DEBE INGRESAR UN NOMBRE");
            }
            if(precio == null ){
                throw new TiendaExcepcion("DEBE INGRESAR UN PRECIO");
            }
            if(precio < 0.1){
                throw new TiendaExcepcion("EL PRECIO NO PUEDE SER MENOR A 0,1");
            }
            if(codigoFabricante == null ){
                throw new TiendaExcepcion("DEBE INGRESAR UN CÓDIGO DE FABRICANTE");
            }

            Producto producto = productoDAO.buscarProductoPorNombre(nombre);

            if (producto == null) {
                throw new TiendaExcepcion("EL NOMBRE INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
            }

            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);

            productoDAO.modificarProducto(producto);
            
        } catch (TiendaExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }

    public void eliminarProducto(String nombre) throws TiendaExcepcion {
        try {
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new TiendaExcepcion("DEBE INGRESAR UN PRODUCTO");
            }

            Producto producto = productoDAO.buscarProductoPorNombre(nombre);

            if (producto == null) {
                throw new TiendaExcepcion("EL NOMBRE INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
            }

            productoDAO.eliminarProducto(nombre);
        } catch (TiendaExcepcion e) {
            // e.printStackTrace();
            throw e;
        } catch (Exception e) {
            // e.printStackTrace();
            throw new TiendaExcepcion("ERROR DE SISTEMA");
        }
    }

    public Collection<Producto> listarProducto() throws Exception {

        try {

            Collection<Producto> productos = productoDAO.listarProductos();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void imprimirListarProductos() throws Exception {
        try {

            //Listamos los usuarios
            Collection<Producto> productos = listarProducto();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (Producto aux : productos) {
                    System.out.println(aux);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    //2 EN 1 (listarProducto() e imprimirListarProductos())
    public void imprimirProductos() throws TiendaExcepcion {
        try {
            List<Producto> productos = productoDAO.obtenerProductos();

            if (productos.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN PRODUCTOS");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");
                System.out.printf("%-20s%-15s%-15s\n", "NOMBRE", "PRECIO", "CODIGO DE FABRICANTE"); // FORMATO DE IMPRESIÓN
                for (Producto aux : productos) {                    
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
    
    public void imprimirProductosPorNombre() throws TiendaExcepcion {
        try {
            List<Producto> productos = productoDAO.obtenerProductosPorNombre();

            if (productos.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN PRODUCTOS");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");                
                for (Producto aux : productos) {                    
                    System.out.println("NOMBRE: " + aux.getNombre());                    
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
    
    public void imprimirProductosPorNombreYPrecio() throws TiendaExcepcion {
        try {
            List<Producto> productos = productoDAO.obtenerProductosPorNombreYPrecio();

            if (productos.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN PRODUCTOS");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");                
                for (Producto aux : productos) {                    
                    System.out.println("NOMBRE: " + aux.getNombre() + " |PRECIO: "+aux.getPrecio());                    
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
    
    public void imprimirProductosPorRangoPrecio() throws TiendaExcepcion {
        try {
            List<Producto> productos = productoDAO.obtenerProductosPorRangoPrecio();
            
            
            if (productos.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN PRODUCTOS");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");                
                for (Producto aux : productos) {                    
                    System.out.println("NOMBRE: " + aux.getNombre() + " |PRECIO: "+aux.getPrecio());                    
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
    
    public void imprimirProductosPorPortatil() throws TiendaExcepcion {
        try {
            List<Producto> productos = productoDAO.obtenerProductosPorPortatil();

            if (productos.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN PRODUCTOS");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");                
                for (Producto aux : productos) {                    
                    System.out.println("NOMBRE: " + aux.getNombre());                    
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
    
    public void imprimirProductoMasBarato() throws TiendaExcepcion {
        try {
            List<Producto> productos = productoDAO.obtenerProductoMasBarato();

            if (productos.isEmpty()) {
                throw new TiendaExcepcion("NO EXISTEN PRODUCTOS");
            } else {
                System.out.println("*** LISTA DE PRODUCTOS ***");                
                for (Producto aux : productos) {                    
                    System.out.println("NOMBRE: " + aux.getNombre() + "| PRECIO: "+ aux.getPrecio());                    
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
    
    public Producto buscarProductoPorNombre(String nombre) throws Exception {

        try {

            //Validamos
            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre");
            }

            Producto producto = productoDAO.buscarProductoPorNombre(nombre);

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public Producto buscarUsuarioPorCodigo(Integer codigo) throws Exception {

        try {

            //Validamos
            if (codigo == null) {
                throw new Exception("Debe indicar el codigo");
            }

            Producto producto = productoDAO.buscarProductoPorCodigo(codigo);

            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
    
    //METODOS ALTERNATIVOS
//    
//     public void alterImprimirObtenerProd() {
//        try {
//            productoDAO.alterObtenerProd();
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void alterImprimirProdPorNombrePrecio() {
//        try {
//            productoDAO.alterObtenerProdPorNombrePrecio();
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void alterImprimirProdPorRangoPrecio() {
//        try {
//            productoDAO.alterObtenerProdPorRangoPrecio();
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void alterImprimirProdPortatiles() {
//        try {
//            productoDAO.alterObtenerProdPortatiles();
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void alterImprimirProdMasBarato() {
//        try {
//            productoDAO.alterObtenerProdMasBarato();
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void alterInsertarProd() {
//        try {
//            String nombre;
//            double precio;
//            int codigo;
//            System.out.println("Ingrese el nombre del producto");
//            nombre = leer.nextLine();
//            System.out.println("Ingrese el precio del producto");
//            precio = leer.nextDouble();
//            System.out.println("Ingrese el codigo del fabricante");
//            fabricanteDAO.seleccionarFabricantes();
//            codigo = scan.nextInt();
//            Producto producto = new Producto();
//            producto.setNombre(nombre);
//            producto.setPrecio(precio);
//            producto.setCodigoFabricante(codigo);
//            prod.insertarProducto(producto);
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public void modificarProducto() {
//        try {
//            System.out.println("Ingrese el nombre del producto a modificar");
//            String nombreProducto = scan.nextLine();
//            System.out.println("Ingrese el nombre del nuevo producto");
//            String nombre = scan.nextLine();
//            System.out.println("Ingrese el precio del nuevo producto");
//            double precio = scan.nextDouble();
//            System.out.println("Ingrese el codigo de fabricante del nuevo producto");
//            fab.seleccionarFabricantes();
//            int fabricante = scan.nextInt();
//            Producto producto = new Producto();
//            producto.setNombre(nombre);
//            producto.setPrecio(precio);
//            producto.setCodigoFabricante(fabricante);
//            prod.modificarProducto(producto, nombreProducto);
//        } catch (Exception e) {
//            // TODO: handle exception
//            System.out.println(e.getMessage());
//        }
//    }
//    
    
}
