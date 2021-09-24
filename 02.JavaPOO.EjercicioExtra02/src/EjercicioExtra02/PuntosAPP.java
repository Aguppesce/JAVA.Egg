package EjercicioExtra02;

import EjercicioExtra02.entidades.Puntos;
import EjercicioExtra02.servicios.ServicioPuntos;

/**
 *
 * @author Agu
 */
public class PuntosAPP {
    public static void main(String[] args) {
        ServicioPuntos sp=new ServicioPuntos();
        Puntos p1 = sp.crearPuntos();
        
        sp.calcular(p1);
    }
    
}
