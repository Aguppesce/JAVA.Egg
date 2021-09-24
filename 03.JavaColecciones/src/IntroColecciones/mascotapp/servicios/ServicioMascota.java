package IntroColecciones.mascotapp.servicios;

import IntroColecciones.mascotapp.entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioMascota {
    
    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n"); 
        this.mascotas = new ArrayList();
    }
    
    
    public Mascota crearMascota() {
        System.out.print("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.print("Introducir apodo: ");
        String apodo = leer.next();
        
        System.out.print("Introducir tipo: ");
        String tipo = leer.next();       
        
        return new Mascota(nombre, apodo, tipo);
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    public void mostrarMascotas(){
        System.out.println("Las mascotas actuales de la Lista Mascotas son");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+mascotas.size());
    }    
    /**
     * Crea Mascotas, Todos Chiquitos
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la 
     * lista
     */
    public void fabricaChiquitos(int cantidad){
        for (int i = 0; i < cantidad; i++) {
//            Mascota aux = new Mascota("Fer","Chiquito","Beagle");
//            mascotas.add(aux); 
            mascotas.add(new Mascota("Fer","Chiquito","Beagle")); //Ésta línea es equivalente a la línea 51 y 52         
        } 
    }    
    /**
     * Crea mascotas pidiendo datos por teclado
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    }
    
    //TODO Añadir Try and Catch
    //Opción 1
//    public void actualizarMascota(int index){
//        Mascota m = mascotas.get(index);
//        m.setApodo("Roberto");
//    }
    //Opción 2
    public void actualizarMascota(int index){
        
        if(index <= mascotas.size() -1 ){
            System.out.println("");
            System.out.println("------Actualizar------");
            Mascota m = crearMascota();
        
            mascotas.set(index, m);
        }else{
            System.out.println("Fallo al actualizar, el indice erroneo!");
        }
    }
    
    public void eliminarMascota(int index){
        
        if(index <= mascotas.size() -1 ){
            mascotas.remove(index);
        }else{
            System.out.println("Fallo al eliminar, el indice erroneo!");
        }
    }
    
    public void eliminarMascotaPorNombre(String nombre){
        for (int i=0; i< mascotas.size(); i++){
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombre)){
                mascotas.remove(i);//Podemos eliminarlo mediante el índice (remove(i)) o mediante el objeto (remove(m)). Es indistinto            
            }
        }
    }
    
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        for (int i=0; i< mascotas.size(); i++){
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);//Podemos eliminarlo mediante el índice (remove(i)) o mediante el objeto (remove(m)). Es indistinto            
            }
        }
    }
}
