package Ejercicio06.entidades;
/**
 *
 * @author Agu
 */
public class Tienda {
    private String producto;
    private Double precio;

    public Tienda() {
    }

    public Tienda(String producto, Double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto: " + producto + " Precio: " + precio;
    }
    
    
}
