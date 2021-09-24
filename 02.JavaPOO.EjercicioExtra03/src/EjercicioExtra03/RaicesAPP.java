package EjercicioExtra03;

import EjercicioExtra03.entidades.Raices;
import EjercicioExtra03.servicios.ServicioRaices;

/**
 *
 * @author Agu
 */
public class RaicesAPP {
    public static void main(String[] argSs) {
        
        ServicioRaices sr = new ServicioRaices();
        
        Raices r1 = sr.crearRaices();
                
        sr.calcular(r1);
        
    }    
}
