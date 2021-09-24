package EjercicioExtra01.entidades;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Agu
 */
public final class Velero extends Barco {
    
    private Integer nroMastiles;

    public Velero() {
    }

    public Velero(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    public Velero(Integer nroMastiles, String matricula, Double esloraEnMetros, Integer anioFabricacion) {
        super(matricula, esloraEnMetros, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public Velero(Integer nroMastiles, String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, Long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        super(matricula, esloraEnMetros, anioFabricacion, nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.nroMastiles = nroMastiles;
    }  

    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public void alquiler(Double eslora){
        Long diaAlquiler = this.fechaAlquiler.toEpochDay();
        Long diaDevolucion = this.fechaDevolucion.toEpochDay();
        
        Double calculoAlquiler = ((diaAlquiler - diaDevolucion) * (this.esloraEnMetros*10))+this.nroMastiles;
    }
    
    @Override
    public String toString() {
        return "Veleros{" + "nroMastiles=" + nroMastiles + '}';
    }
    
    
}
