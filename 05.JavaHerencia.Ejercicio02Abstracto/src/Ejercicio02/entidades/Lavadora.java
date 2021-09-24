package Ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author Agu
 */
public final class Lavadora extends Electrodomestico{
    
    private Integer carga;
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Lavadora() {
        super();
    }   

    public Lavadora(Integer carga, Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }   
    
    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal(){
        //super.precioFinal();
        if(this.carga>30){
            super.setPrecio(super.getPrecio()+500);
        }
        //System.out.println("Precio final lavadora: $"+super.getPrecio());        
    }
    
    public void crearLavadora(){
        System.out.print("Introduzca tipo de carga: ");
        this.carga = leer.nextInt();        
        crearElectrodomestico();        
        super.precioFinal();
//        precioFinal();
    }

    @Override
    public String toString() {
        return "Lavadora -> " + " Carga: " + carga + " |" + super.toString();
    }

    
    
    
}
