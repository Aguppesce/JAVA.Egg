package EjercicioExtra01.entidades;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Agu
 */
public class Alquiler {
    
    protected String nombre;
    protected Long documentoCliente;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected Integer posicionAmarre;
    protected Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, Long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(Long documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    public void alquiler(Double eslora){
        Long diaAlquiler = this.fechaAlquiler.toEpochDay();
        Long diaDevolucion = this.fechaDevolucion.toEpochDay();
        
        Double calculoAlquiler = (diaAlquiler - diaDevolucion) * (eslora*10);
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documentoCliente=" + documentoCliente + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", posicionAmarre=" + posicionAmarre + ", barco=" + barco + '}';
    }
    
    
}
