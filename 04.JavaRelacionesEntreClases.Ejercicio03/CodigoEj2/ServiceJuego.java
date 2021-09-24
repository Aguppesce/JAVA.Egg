  package Services;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.List;
import java.util.Scanner;

/**
 •  llenarJuego(ArrayList < Jugador > jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
public class ServiceJuego {
 
    public void llenarJuego( List <Jugador> jugadores, Revolver r){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Bienvenido al juego. Cargaremos los jugadores:");
        System.out.println("Digite la cantidad de jugadores que desea");
        int cantidad=sc.nextInt();
        if(cantidad>6){
             cantidad=6;
        }
        for (int i = 0; i < cantidad; i++) {
            
        }
        
    }
    
}
