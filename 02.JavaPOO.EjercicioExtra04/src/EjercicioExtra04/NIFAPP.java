package EjercicioExtra04;

import EjercicioExtra04.entidades.NIF;
import EjercicioExtra04.servicios.ServicioNIF;

/**
 *
 * @author Agu
 */
public class NIFAPP {
    public static void main(String[] args) {
        ServicioNIF sn = new ServicioNIF();
        
        NIF n1 = sn.crearNif();
        sn.mostrar(n1);
    }
    
}
