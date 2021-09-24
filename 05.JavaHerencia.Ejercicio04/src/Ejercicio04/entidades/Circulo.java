package Ejercicio04.entidades;

import Ejercicio04.interfaces.calculosFormas;
/**
 *
 * @author Agu
 */
public class Circulo implements calculosFormas {

    private Double radio;
    private Double diametro;

    public Circulo() {
    }
    
    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }   
    
    @Override
    public void calculoArea() {                
        Double calculo = pi * Math.pow(this.radio, 2);
        System.out.println("Área del círculo: "+calculo);        
    }

    @Override
    public void calculoPerimetro() {        
        Double calculo = pi * this.diametro;
        System.out.println("Perímetro del círculo: "+calculo);
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
        
    @Override
    public String toString() {
        return "Círculo -> " + " Radio: " + radio + " |Diametro: " + diametro;
                
    }
    
    
}
