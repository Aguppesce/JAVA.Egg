package EjercicioExtra01.entidades;
/**
 *
 * @author Agu
 */
public class Numero {
    private Integer numero;

    public Numero() {
    }

    public Numero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero: "+numero;
    }
    
}
