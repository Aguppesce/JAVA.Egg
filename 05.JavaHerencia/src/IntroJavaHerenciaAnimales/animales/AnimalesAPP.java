package IntroJavaHerenciaAnimales.animales;

import IntroJavaHerenciaAnimales.animales.entidades.Animal;
import IntroJavaHerenciaAnimales.animales.entidades.Gato;
import IntroJavaHerenciaAnimales.animales.entidades.Perro;

/**
 *
 * @author Agu
 */
public class AnimalesAPP {
    public static void main(String[] args) {
        
        //Gato g = new Gato("NARANJOSO", 4, true, 5, 1000d);
        //Perro p  = new Perro("BEAGLE", 4, true, 13, 1000d);
        
        Animal g = new Gato("NARANJOSO", 4, true, 5, 1000d);
        Animal p  = new Perro("BEAGLE", 4, true, 13, 1000d);
        g.calcularEdad();
        g.hacerRuido();
        //Método propio de Gato
        //g.ronronear();
        
        System.out.println("-----------------------");
        
        p.calcularEdad();
        p.hacerRuido();
        //Método propio de Perro
        //p.jugarEnParque(4);
    }
    
}
