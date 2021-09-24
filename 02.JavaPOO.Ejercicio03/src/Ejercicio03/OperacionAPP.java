package Ejercicio03;

import Ejercicio03.entidades.Operacion;
import Ejercicio03.servicios.ServicioOperacion;

/**
 *
 * @author Agu
 */
public class OperacionAPP {

    public static void main(String[] args) {
        
        ServicioOperacion so= new ServicioOperacion();
                
        Operacion o1 = so.crearOperacion();
       
        System.out.println("La suma es: "+so.sumar());
        System.out.println("La resta es: "+so.restar());
        System.out.println(so.multiplicar());
        System.out.println(so.dividir());
    }
    
}
