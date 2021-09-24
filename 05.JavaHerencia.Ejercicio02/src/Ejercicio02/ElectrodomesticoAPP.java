package Ejercicio02;

import Ejercicio02.entidades.Electrodomestico;
import Ejercicio02.entidades.Lavadora;
import Ejercicio02.entidades.Televisor;

/**
 *
 * @author Agu
 */
public class ElectrodomesticoAPP {
    
    public static void main(String[] args) {
        
        Lavadora lv = new Lavadora();
        //Electrodomestico lv = new Lavadora(12, 0d, "violeta", 'n', 10d);
        //Integer carga, Double precio, String color, char consumoEnergetico, Double peso
        
        Televisor tv = new Televisor();
        //Electrodomestico tv = new Televisor(22,true,200d,"negro",'d',20d);
        //Integer resolucion, Boolean tdt, Double precio, String color, char consumoEnergetico, Double peso
        
        lv.crearLavadora();        
        System.out.println(lv.toString());
        
        tv.crearTelevisor();       
        System.out.println(tv.toString());
    }
    //PROBAR CAMBIAR THIS.PRECIO POR THIS.GETPRECIO()
}
