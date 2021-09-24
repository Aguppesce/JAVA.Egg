package Ejercicio02.servicios;

import Ejercicio02.entidades.Jugador;

/**
 *
 * @author Agu
 */
public class ServicioJuego {

    ServicioRevolver servRev = new ServicioRevolver();
    ServicioJugador servJug = new ServicioJugador();

    public void llenarJuego() {
        servRev.llenarRevolver();
        servJug.fabricaJugadores();
    }

    public void ronda() {
        Boolean flag = false;
        do {
            for (Jugador aux : servJug.getJugadores()) {
                if (servRev.mojar() == false) {
                    System.out.println("El jugador " + aux.getNombre() + " se salvo!");
                    servRev.siguienteChorro();                    
                } else {
                    flag = true;
                    aux.setMojado(true);
                    System.out.println("El jugador " + aux.getNombre() + " perdió!");
                    System.out.println("Fin del juego!");                    
                    break;
                }
            }            
        } while (flag==false);
    }

    public void mostrarJugador() {
        servJug.mostrarJugador();
    }

}
