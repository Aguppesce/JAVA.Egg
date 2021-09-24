package Ejercicio01.servicios;

import Ejercicio01.entidades.Raza;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioRaza {
    
    private Scanner leer;
    private ArrayList<Raza> razas;
    
    public ServicioRaza(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.razas = new ArrayList();
    }
    
    public Raza crearRaza(){
        System.out.print("Introducir nombre de la raza: ");
        String raza = leer.next();
        
        Raza r= new Raza (raza);     
               
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
    
    public void mostrarRazas(){
        System.out.println("Lista Raza: ");
        for(Raza aux: razas){
            System.out.println(aux.toString());            
        }
        
        System.out.print("Cantidad: "+razas.size());
    }
}
