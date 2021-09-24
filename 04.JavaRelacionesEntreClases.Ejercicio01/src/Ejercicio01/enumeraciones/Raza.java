package Ejercicio01.enumeraciones;
/**
 *
 * @author Agu
 */
public enum Raza {
    BEAGLE(1,"Beagle"), COCKER(2,"Cocker"), PITBULL(3,"Pitbull"), BORDER_COLLIE(4,"Border Collie"); 
    
    private Integer codigo;
    private String valor;
    
    private Raza(Integer codigo, String valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getValor() {
        return valor;
    }
}

