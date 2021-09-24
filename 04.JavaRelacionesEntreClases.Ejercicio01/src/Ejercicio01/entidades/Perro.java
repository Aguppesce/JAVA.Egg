package Ejercicio01.entidades;

import Ejercicio01.enumeraciones.Raza;
import Ejercicio01.enumeraciones.Tamanio;
import java.time.LocalDate;

/**
 *
 * @author Agu
 */
public class Perro {
    private String nombre;
    private Raza raza;
    private Integer edad;
    private Tamanio tamanio;
    private boolean tieneDuenio;
    
    public Perro() {
    }

    public Perro(String nombre, Raza raza, Integer edad, Tamanio tamanio, boolean tieneDuenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.tieneDuenio = tieneDuenio;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + ", tieneDuenio=" + tieneDuenio + '}';
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isTieneDuenio() {
        return tieneDuenio;
    }

    public void setTieneDuenio(boolean tieneDuenio) {
        this.tieneDuenio = tieneDuenio;
    }
    
    
    
}
