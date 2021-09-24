package Ejercicio02.entidades;

import java.util.Scanner;

/**
 *
 * @author Agu
 */
public final class Televisor extends Electrodomestico {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private Integer resolucion;
    private Boolean tdt;

    public Televisor() {
        super();
    }

//    public Televisor(Integer resolucion, Boolean tdt) {
//        this.resolucion = resolucion;
//        this.tdt = tdt;
//    }

    public Televisor(Integer resolucion, Boolean tdt, Double precio, String color, Character consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }
    
    

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public void precioFinal() {
        if (this.resolucion > 40) {
            super.setPrecio(super.getPrecio() + (super.getPrecio() * 0.30d));
        }
        if (this.getTdt() == true) {
            super.setPrecio(super.getPrecio() + 500d);
        }        
    }
    
    public void crearTelevisor() {
        System.out.print("Ingrese resolucion: ");
        resolucion = leer.nextInt();
        System.out.print("Tiene sintonizador? S/N : ");
        String opc = leer.next().toUpperCase();                
        switch (opc) {
            case "S":
                this.tdt = true;        
                break;
            case "N":
                this.tdt = false;
                break;
            default:
                System.out.println("Ha elegido una opción incorrecta. Por defecto queda sin sintonizador");
                this.tdt = false;
                break;
        }
        crearElectrodomestico();        
        super.precioFinal();
        precioFinal();
    }  

    @Override
    public String toString() {
        return "Televisor ->" + " Resolucion: " + resolucion + "| Tdt: " + tdt + " |" + super.toString();
    }

}
