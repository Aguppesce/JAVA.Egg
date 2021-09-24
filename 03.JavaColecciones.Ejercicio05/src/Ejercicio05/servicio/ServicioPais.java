package Ejercicio05.servicio;

import Ejercicio05.entidades.Pais;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Agu
 */
public class ServicioPais {
    private Scanner leer;
    private Set<Pais> paises;
    
    public ServicioPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.paises = new TreeSet();
    }
    
    public Pais crearPais(){
        System.out.print("Pais: ");
        String pais = leer.next();
        
        Pais p = new Pais(pais);
        return new Pais(pais);
    }
    
    public void agregarPais(Pais pais){
        paises.add(pais);
    }
    
    public void fabricaPais(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Pais paisCreado = crearPais();
            
            agregarPais(paisCreado);
        }
    }
    
    public void mostrarPais(){
        System.out.println("Listado Paises: ");
        for (Pais aux : paises) {
            System.out.println(aux.toString());
        }
    }    
    
}
