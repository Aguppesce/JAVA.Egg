package EjercicioExtra02.servicios;

import EjercicioExtra02.entidades.Cantante;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioCantante {

    private Scanner leer;
    private HashMap<String, String> cantantes;

    public ServicioCantante() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.cantantes = new HashMap();
    }
    
    public Cantante crearCantante(){
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Disco más vendido: ");
        String discoMasVendido = leer.next();
        
        Cantante c = new Cantante(nombre, discoMasVendido);
        return new Cantante(nombre, discoMasVendido);
    }
    
    public void agregarCantante(Cantante cantante){
        cantantes.put(cantante.getNombre(), cantante.getDiscoConMasVentas());
    }
    
    public void fabricaCantante(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Cantante cantanteCreado = crearCantante();
            
            agregarCantante(cantanteCreado);
        }
    }
    
    public void mostrarCantante(){
        System.out.println("-------Listado Cantantes-------");
        for (Map.Entry<String, String> aux : cantantes.entrySet()) {
            String key = aux.getKey();
            String value = aux.getValue();
            System.out.println("Nombre: "+aux.getKey()+" Disco más vendido: "+aux.getValue());
            
        }
    }
    
    public void eliminar(String nombre){
        for (Map.Entry<String, String> aux : cantantes.entrySet()) {
            String key = aux.getKey();
            String value = aux.getValue();
            if(aux.getKey().equals(nombre)){                                
                cantantes.remove(nombre);
                System.out.print("Cantante eliminado exitosamente!");
            }
        }
    }
}
