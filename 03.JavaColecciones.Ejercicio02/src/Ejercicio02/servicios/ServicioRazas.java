package Ejercicio02.servicios;

import Ejercicio02.entidades.Raza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioRazas {

    private Scanner leer;
    private ArrayList<Raza> razas;

    public ServicioRazas() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }

    public Raza crearRaza() {
        System.out.print("Introducir nombre de la raza: ");
        String raza = leer.next();

        Raza r = new Raza(raza);

        return new Raza(raza);
    }

    public void agregarRaza(Raza raza) {
        razas.add(raza);
    }

    public void fabricaRaza(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Raza razaCreada = crearRaza();

            agregarRaza(razaCreada);

            //System.out.println(razaCreada.toString());
        }
    }

    public void mostrarRazas() {
        System.out.println("Lista Raza: ");
        for (Raza aux : razas) {
            System.out.println(aux.toString());
        }

        System.out.print("Cantidad: " + razas.size());
    }

    public void eliminarRazaPorNombre(String nombre) {
        Iterator<Raza> it = razas.iterator();
        
        while (it.hasNext()) {
            Raza aux = it.next();
            
            if (aux.getRaza().equals(nombre)) {
                it.remove();
            }else{
                System.out.println("El perro no se encuentra en la lista");
            }
        }
        //Collections.sort(razas);
    }
//    public void eliminarRazaPorNombre(String nombre) {
//        for (int i = 0; i < razas.size(); i++) {
//            Raza r = razas.get(i);
//            if(r.getRaza().equals(nombre)){
//                razas.remove(i);
//            }
//        }
//    }
}
