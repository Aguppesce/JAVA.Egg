/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
 */
package Entidades;
  
import java.util.List;

public class Juego {
    
    private List<Jugador> partida;
    
    private Revolver armaDeAgua;

    public Juego() {
    }

    public Juego(List<Jugador> partida, Revolver armaDeAgua) {
        this.partida = partida;
        this.armaDeAgua = armaDeAgua;
    }

    public List<Jugador> getPartida() {
        return partida;
    }

    public void setPartida(List<Jugador> partida) {
        this.partida = partida;
    }

    public Revolver getArmaDeAgua() {
        return armaDeAgua;
    }

    public void setArmaDeAgua(Revolver armaDeAgua) {
        this.armaDeAgua = armaDeAgua;
    }
    
}
