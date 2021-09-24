package Ejercicio02.servicios;

import Ejercicio02.entidades.Revolver;
import java.util.Random;
        
/**
 *
 * @author Agu
 */
public class ServicioRevolver {

    
    Revolver rev = new Revolver();
    

    public void llenarRevolver() {
        Random random = new Random();
        rev.setPosicionActual(random.nextInt(6) + 1);
        rev.setPosicionAgua(random.nextInt(6) + 1);
        System.out.println(rev.toString());        
    }

    public boolean mojar() {        
        if (rev.getPosicionActual() == rev.getPosicionAgua()) {
            return true;
        }
        return false;                
    }

    public void siguienteChorro() {
        if (rev.getPosicionActual()==6) {
            rev.setPosicionActual(1);
        }else{
            rev.setPosicionActual(rev.getPosicionActual() +1);
        }
        System.out.println("Posición Actual: " + rev.getPosicionActual());        
    }

    public Revolver getRev() {
        return rev;
    }

    public void setRev(Revolver rev) {
        this.rev = rev;
    }

}
