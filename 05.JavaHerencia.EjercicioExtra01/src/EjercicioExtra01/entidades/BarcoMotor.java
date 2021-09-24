package EjercicioExtra01.entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Agu
 */
public class BarcoMotor extends Barco {
    
    private Double potenciaeEnCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Double potenciaeEnCV) {
        this.potenciaeEnCV = potenciaeEnCV;
    }

    public BarcoMotor(Double potenciaeEnCV, String matricula, Double esloraEnMetros, Integer anioFabricacion) {
        super(matricula, esloraEnMetros, anioFabricacion);
        this.potenciaeEnCV = potenciaeEnCV;
    }

    public BarcoMotor(Double potenciaeEnCV, String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, Long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        super(matricula, esloraEnMetros, anioFabricacion, nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.potenciaeEnCV = potenciaeEnCV;
    }
    
    public Double getPotenciaeEnCV() {
        return potenciaeEnCV;
    }

    public void setPotenciaeEnCV(Double potenciaeEnCV) {
        this.potenciaeEnCV = potenciaeEnCV;
    }   

    @Override
    public void alquiler(Double eslora){
        Long diaAlquiler = this.fechaAlquiler.toEpochDay();
        Long diaDevolucion = this.fechaDevolucion.toEpochDay();
        
        Double calculoAlquiler = ((diaAlquiler - diaDevolucion) * (this.esloraEnMetros*10))+this.potenciaeEnCV;
    }
    
    @Override
    public String toString() {
        return "BarcosMotor{" + "potenciaeEnCV=" + potenciaeEnCV + '}';
    }
   
}
