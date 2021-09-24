package Ejercicio04.entidades;

import Ejercicio04.interfaces.calculosFormas;

/**
 *
 * @author Agu
 */
public class Rectangulo implements calculosFormas {
    
    private Double base;
    private Double altura;

    public Rectangulo(){
        
    }
    
    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }   
    
    @Override
    public void calculoArea() {
       Double calculo = this.base * this.altura;
       System.out.println("Área del rectángulo: "+calculo);
    }

    @Override
    public void calculoPerimetro() {        
        Double calculo =this.altura + this.base;
        System.out.println("Perímetro del rectángulo: "+calculo);
    }

    @Override
    public String toString() {
        return "Rectángulo -> " + " Base: " + base + " |Altura: " + altura;
    }

       
}
