package Ejercicio06.servicios;

import Ejercicio06.entidades.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioTienda {
    private Scanner leer;
    private HashMap<String, Double> productos;
    
    public ServicioTienda(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
    }
    
    public Tienda crearTienda(){
        System.out.print("Nombre producto: ");
        String producto = leer.next();
        System.out.print("Precio producto: $");
        Double precio = leer.nextDouble();
        
        Tienda t = new Tienda(producto, precio);
        return new Tienda(producto,precio);
    }
    
    public void agregarProducto(Tienda tienda){
        productos.put(tienda.getProducto(),tienda.getPrecio());
    }
    
    public void fabricaTienda(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Tienda tiendaCreada = crearTienda();
            
            agregarProducto(tiendaCreada);
        }
    }
    
    public void mostrarTienda(){
        System.out.println("Listado Productos: ");
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            System.out.print("\nProducto: "+key+" Precio: $"+value);
        }
    }
    
    public void modificarPrecio(String nombre){
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if(aux.getKey().equals(nombre)){
                System.out.print("Precio nuevo: $");
                Double precioNuevo = leer.nextDouble();
                aux.setValue(precioNuevo);
            }
        }
    }
    
    public void eliminar(String nombre){
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            if(aux.getKey().equals(nombre)){                                
                productos.remove(nombre);
                System.out.print("Producto eliminado exitosamente!");
            }
        }
    }
}
