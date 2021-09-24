package Ejercicio02.enumeraciones;
/**
 *
 * @author Agu
 */
public enum ColorElectrodomestico {
    BLANCO("Blanco"), NEGRO("Negro"), ROJO("Rojo"), AZUL("Azul"),GRIS("Gris");
    
    private final String colorElectrodomestico;
    
    ColorElectrodomestico(String colorElectrodomestico){
        this.colorElectrodomestico = colorElectrodomestico;
    }

    public String getColorElectrodomestico() {
        return colorElectrodomestico;
    }    
}
