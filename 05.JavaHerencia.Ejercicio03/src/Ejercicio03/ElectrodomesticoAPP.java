package Ejercicio03;

import Ejercicio03.entidades.Electrodomestico;
import Ejercicio03.entidades.Lavadora;
import Ejercicio03.entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agu
 */
public class ElectrodomesticoAPP {

    public static void main(String[] args) {
        
        double contLv=0, contTv=0;
        
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        //Integer carga, Double precio, String color, char consumoEnergetico, Double peso
        //Integer resolucion, Boolean tdt, Double precio, String color, char consumoEnergetico, Double peso

        Lavadora lv1 = new Lavadora(31, 3000d, "gris", 'A', 81d);
        Lavadora lv2 = new Lavadora(20, 1000d, "azul", 'F', 17d);
        Televisor tv1 = new Televisor(42, true, 3000d, "negro", 'A', 81d);        
        Televisor tv2 = new Televisor(22, false, 1000d, "rojo", 'F', 17d);
                
        electrodomesticos.add(lv1);
        electrodomesticos.add(lv2);
        electrodomesticos.add(tv1);
        electrodomesticos.add(tv2);
        
        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal(aux.getConsumoEnergetico(),aux.getPeso());
            if (aux instanceof Lavadora) {
                Lavadora object = (Lavadora) aux;
                System.out.println("Precios de lavadora por separado: "+aux.getPrecio());
                contLv=aux.getPrecio()+contLv;
                continue;                    
            }
            if (aux instanceof Televisor) {
                Televisor object = (Televisor) aux;
                System.out.println("Precios  de televisor por separado: "+aux.getPrecio());
                contTv=aux.getPrecio()+contTv;
                continue;                
            }            
        }
        System.out.println("Suma de todos los electrodomésticos: "+(contTv+contLv));
    }

}
