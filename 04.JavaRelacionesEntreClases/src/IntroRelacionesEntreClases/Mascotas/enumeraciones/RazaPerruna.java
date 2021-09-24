package IntroRelacionesEntreClases.Mascotas.enumeraciones;
/**
 *
 * @author Agu
 */
public enum RazaPerruna { 
    BEAGLE(3123124,"Beagle"), COCKER(3124,"Cocker"), PITBULL(34,"Pitbull"), BORDER_COLLIE(312,"Border Collie"); 
    
    private Integer codigo;
    private String valor;
    
    private RazaPerruna(Integer codigo, String valor){
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
