package EjercicioExtra01.entidades;

import java.time.LocalDate;
/**
 *
 * @author Agu
 */
public final class YateDeLujo extends BarcoMotor {
    
    private Integer nroCamaratores;   

    public YateDeLujo() {
    }

    public YateDeLujo(Integer nroCamaratores) {
        this.nroCamaratores = nroCamaratores;
    }

    public YateDeLujo(Integer nroCamaratores, Double potenciaeEnCV) {
        super(potenciaeEnCV);
        this.nroCamaratores = nroCamaratores;
    }

    public YateDeLujo(Integer nroCamaratores, Double potenciaeEnCV, String matricula, Double esloraEnMetros, Integer anioFabricacion) {
        super(potenciaeEnCV, matricula, esloraEnMetros, anioFabricacion);
        this.nroCamaratores = nroCamaratores;
    }

    public YateDeLujo(Integer nroCamaratores, Double potenciaeEnCV, String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, Long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        super(potenciaeEnCV, matricula, esloraEnMetros, anioFabricacion, nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.nroCamaratores = nroCamaratores;
    }
     
    public Integer getNroCamaratores() {
        return nroCamaratores;
    }

    public void setNroCamaratores(Integer nroCamaratores) {
        this.nroCamaratores = nroCamaratores;
    }

    @Override
    public void alquiler(Double eslora){
        Long diaAlquiler = this.fechaAlquiler.toEpochDay();
        Long diaDevolucion = this.fechaDevolucion.toEpochDay();
        
        Double calculoAlquiler = ((diaAlquiler - diaDevolucion) * (this.esloraEnMetros*10))+this.nroCamaratores+this.getPotenciaeEnCV();
    }
    
    @Override
    public String toString() {
        return "YatesDeLujo{" + "nroCamaratores=" + nroCamaratores + '}';
    }

    
    
}
