package Ejercicio03.servicios;

import Ejercicio03.entidades.Carta;
import Ejercicio03.enumercaciones.EnumPalo;
import static Ejercicio03.enumercaciones.EnumPalo.BASTO;
import static Ejercicio03.enumercaciones.EnumPalo.COPA;
import static Ejercicio03.enumercaciones.EnumPalo.ESPADA;
import static Ejercicio03.enumercaciones.EnumPalo.ORO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioCarta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Carta> barajas = new ArrayList();
    ArrayList<Carta> repartidas = new ArrayList();
    Carta c = new Carta();

    public void crearBaraja() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (i == 0) {
                    if (j != 8 && j != 9) {
                        c.setNumero(j);
                        c.setPalo(BASTO);
                        barajas.add(new Carta(c.getNumero(), c.getPalo()));
                    }
                }
                if (i == 1) {
                    if (j != 8 && j != 9) {
                        c.setNumero(j);
                        c.setPalo(ORO);
                        barajas.add(new Carta(c.getNumero(), c.getPalo()));
                    }
                }
                if (i == 2) {
                    if (j != 8 && j != 9) {
                        c.setNumero(j);
                        c.setPalo(ESPADA);
                        barajas.add(new Carta(c.getNumero(), c.getPalo()));
                    }
                }
                if (i == 3) {
                    if (j != 8 && j != 9) {
                        c.setNumero(j);
                        c.setPalo(COPA);
                        barajas.add(new Carta(c.getNumero(), c.getPalo()));
                    }
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(barajas);
    }

    public void siguienteCarta() {
        String sig;
        int i = 0;

        for (Carta aux : barajas) {
            System.out.print("Presione 'y' para la siguiente carta: ");
            sig = leer.next();
            if (sig.equalsIgnoreCase("y")) {
                System.out.println(aux);
                System.out.println(i++);
            } else {
                break;
            }
        }
    }

    public void cartasDisponibles() {
        System.out.println(barajas.size());
    }

    public void darCartas() {
        System.out.print("Cuántas cartas quiere?: ");
        Integer cantidad = leer.nextInt();
        Iterator<Carta> it = barajas.iterator();
        if (cantidad > barajas.size()) {
            System.out.println("Está pidiendo más cartas de las que tiene el mazo. Vuelva a pedir!");
            System.out.println("Cantidad actual: "+barajas.size());
        } else {            
            while (it.hasNext()) {
                Carta aux = it.next();
                barajas.remove(cantidad);
                
                repartidas.add(aux);
                
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Mazo original: "+barajas.size());
        System.out.println("Repartidas: "+repartidas.size());
        for (Carta aux : barajas) {
            System.out.println(aux);
        }
        
        
    }

}
