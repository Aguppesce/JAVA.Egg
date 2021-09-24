package Ejercicio03.entidades;

import Ejercicio03.enumercaciones.EnumPalo;

/**
 *
 * @author Agu
 */
public class Carta {
    private Integer numero;
    private EnumPalo palo;

    public Carta() {
    }

    public Carta(Integer numero, EnumPalo palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public EnumPalo getPalo() {
        return palo;
    }

    public void setPalo(EnumPalo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
}
