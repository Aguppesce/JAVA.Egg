package Ejercicio02.enumeraciones;
/**
 *
 * @author Agu
 */
public enum ConsumoEnergetico {
    A('A'), B('B'), C('C'), D('D'), E('E'), F('F');
    
    private final Character consumoEnergetico;
    
    ConsumoEnergetico(Character consumoEnergetico){
        this.consumoEnergetico = consumoEnergetico;
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }   
    
}
