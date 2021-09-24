package EjercicioExtra01.entidades;

import java.time.LocalDate;

/**
 *
 * @author Agu
 */
public abstract class Barco extends Alquiler {    
    
    protected String matricula;
    protected Double esloraEnMetros;
    protected Integer anioFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double esloraEnMetros, Integer anioFabricacion) {
        this.matricula = matricula;
        this.esloraEnMetros = esloraEnMetros;
        this.anioFabricacion = anioFabricacion;
    }

    public Barco(String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, Long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco) {
        super(nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barco);
        this.matricula = matricula;
        this.esloraEnMetros = esloraEnMetros;
        this.anioFabricacion = anioFabricacion;
    }

    

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", esloraEnMetros=" + esloraEnMetros + ", anioFabricacion=" + anioFabricacion + '}';
    }
   
} 

