package Ejercicio02.servicios;

import Ejercicio02.entidades.Jugador;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioJugador {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private List<Jugador> jugadores = new ArrayList();

    public Jugador crearJugador() {
        Integer id = 0;
        System.out.print("Nombre: ");
        String nombre = leer.next();
        Boolean mojado = false;
        return new Jugador(id, nombre, mojado);
    }

    public void agregarJugador(Jugador jug) {
        jugadores.add(jug);
    }

    public void fabricaJugadores() {
        System.out.print("Cantidad de jugadores (no pueden ser más de 6): ");
        Integer cantidad = leer.nextInt();
        if (cantidad < 1 || cantidad > 6) {
            cantidad = 6;
        }
        Integer id = 0;
        for (int i = 0; i < cantidad; i++) {
            id = id + 1;
            Jugador jugadorCreado = crearJugador();
            jugadorCreado.setId(id);
            agregarJugador(jugadorCreado);
            System.out.println(jugadorCreado.toString());
        }
    }

    public void mostrarJugador() {
        System.out.println("----Lista Jugadores----");
        for (Jugador aux : jugadores) {
            System.out.println(aux.toString());
        }
    }

    public boolean disparo(ServicioRevolver serRev) {
        Boolean flag = false;        
        for (Jugador aux : jugadores) {
            if (serRev.mojar() != true) {
                serRev.siguienteChorro();
            } else {
                aux.setMojado(true);
                flag = true;                
            }
        }        
        return flag;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

}
