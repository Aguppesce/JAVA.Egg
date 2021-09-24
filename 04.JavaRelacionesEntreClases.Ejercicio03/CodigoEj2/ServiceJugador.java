/*
 ++ Disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Services;

public class ServiceJugador {

    ServiceRevolver arma = new ServiceRevolver();
    
    public boolean Disparo(ServiceRevolver arma){
        boolean mojado=false;
        if (arma.mojar()== true){
            mojado = true;
        }
        return mojado;
    }
}
