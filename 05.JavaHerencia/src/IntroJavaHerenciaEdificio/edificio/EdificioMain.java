package IntroJavaHerenciaEdificio.edificio;

import IntroJavaHerenciaEdificio.edificio.entidades.CasaCampo;
import IntroJavaHerenciaEdificio.edificio.entidades.Edificio;
import IntroJavaHerenciaEdificio.edificio.entidades.Estructura;

/**
 *
 * @author Agu
 */
public class EdificioMain {

    public static void main(String[] args) {
        
        //Estructura es = new Estructura(); //No se puede instanciar un objeto de la clase Estructura por ser abstracta
        
        CasaCampo e1 = new CasaCampo(true, 1000d);
        e1.calcularSuperficie(10, 30);
        System.out.println(e1.getSuperficieCubierta()+" mt2");
        
        Edificio e2 = new Edificio(4, 300d);
        e2.calcularSuperficie(10, 30);
        System.out.println(e2.getSuperficieCubierta()+" mt2");
    }
    
}
