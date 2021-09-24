/*
 * llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package Services;

import Entidades.Revolver;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;

 
public class ServiceRevolver {
    Revolver r = new Revolver();   // creo un revolver
    Random random = new Random();  //creo un ob random
    
    
    public void llenarRevolver(){  //metodo para setear llenado
         
        r.setPosicionActual(random.nextInt(6 + 1) + 1); 
        r.setPosicionAgua(random.nextInt(6 + 1) + 1);
    }
            
            
    public boolean mojar(){
        boolean mojado = false;
        if (r.getPosicionActual()==r.getPosicionAgua()){
            mojado = true;
        }
        return mojado;
    }
    
    public void siguienteChorro(){
        if (r.getPosicionActual()==6){
            r.setPosicionActual(1);
        } else {
            r.setPosicionActual(r.getPosicionActual()+1);
        }
    }
    
    public void imprimirPosiciones(){
        
        System.out.println("Posicion  actual  => "+r.getPosicionActual());
        System.out.println("Posicion con agua => "+r.getPosicionAgua());
    }
}
