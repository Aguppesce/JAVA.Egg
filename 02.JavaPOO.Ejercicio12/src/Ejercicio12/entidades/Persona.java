package Ejercicio12.entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Agu
 */
public class Persona {
    private String nombre;
    private LocalDate fechaNac;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + '}';
    }
    
    
    
    
    
    
}
