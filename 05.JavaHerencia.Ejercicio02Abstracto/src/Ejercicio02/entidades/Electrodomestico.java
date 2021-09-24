package Ejercicio02.entidades;

import Ejercicio02.enumeraciones.ColorElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public abstract class Electrodomestico {   

    protected Double precio;
    protected String color;
    protected Character consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, Character consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    private Character comprobarConsumoEnergetico(Character letra) {
        if (letra.equals('A') || letra.equals('B') || letra.equals('C') || letra.equals('D') || letra.equals('E') || letra.equals('F')) {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F';
        }
        return this.consumoEnergetico;
    }

    private String comprobarColor(String color) {        
        if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
            this.color = color;
        } else {
            this.color = "Blanco";
        }
        return this.color;
    }    
    
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese color: ");
        this.color = leer.next();
        comprobarColor(this.color);
        System.out.print("Ingrese consumo: ");
        this.consumoEnergetico = leer.next().toUpperCase().charAt(0);
        comprobarConsumoEnergetico(this.consumoEnergetico);
        System.out.print("Ingrese peso: ");
        this.peso = leer.nextDouble();                     
        System.out.println("Precio base: $"+(this.precio=1000d));
    }

    public void precioFinal() {        
        if (this.consumoEnergetico.equals('A')) {
            this.precio += 1000d;
        }
        if (this.consumoEnergetico.equals('B')) {
            this.precio += 800d;
        }
        if (this.consumoEnergetico.equals('C')) {
            this.precio += 600d;
        }
        if (this.consumoEnergetico.equals('D')) {
            this.precio += 300d;
        }
        if (this.consumoEnergetico.equals('F')) {
            this.precio += 100d;
        }
        if (this.peso > 1 && this.peso < 19) {
            this.precio += 100d;
        }
        if (this.peso > 20 && this.peso < 49) {
            this.precio += 500d;
        }
        if (this.peso > 50 && this.peso < 79) {
            this.precio += +800;
        }
        if (this.peso > 80) {
            this.precio += 1000d;
        }
    }

    @Override
    public String toString() {
        return "Precio: $" + precio + " |Color: " + color + " |ConsumoEnergetico: " + consumoEnergetico + " |Peso: " + peso + "kg ";
    }

}
