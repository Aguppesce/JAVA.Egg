package Ejercicio02.entidades;
/**
 *
 * @author Agu
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer id, String nombre, Boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador " + id + " | Nombre: " + nombre + " | Mojado?: " + mojado;
    }
    
    
}
