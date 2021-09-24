package Ejercicio01.servicios;

import Ejercicio01.entidades.Perro;
import Ejercicio01.enumeraciones.Raza;
import Ejercicio01.enumeraciones.Tamanio;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioPerro {

    private Scanner leer;
    private List<Perro> perros;
    Raza razaPerro = null;
    Tamanio tamanioPerro = null;
    
    
    public ServicioPerro() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.perros = new ArrayList();
    }

    public Perro crearPerro() {
        System.out.print("Ingrese nombre del perro: "); String nombre = leer.next();
        System.out.println("Listado de Razas");
        for (Raza aux : Raza.values()) {
            System.out.println(aux);
        }        
        System.out.print("Seleccione raza del perro: "); String nombRaza = leer.next();
        for (Raza aux : Raza.values()) {
            if (nombRaza.equalsIgnoreCase(aux.toString())) {
                razaPerro = aux;
            }
        }
        for (Tamanio aux : Tamanio.values()) {
            System.out.println(aux);
        }        
        System.out.print("Seleccione tamaño del perro: "); String tamPerro = leer.next();
        for (Tamanio aux : Tamanio.values()) {
            if (tamPerro.equalsIgnoreCase(aux.toString())) {
                tamanioPerro = aux;
            }
        }
        System.out.print("Edad: "); Integer edad = leer.nextInt();
        Boolean tieneDuenio = false;
        
        return new Perro(nombre, razaPerro, edad, tamanioPerro, tieneDuenio );
        
    }    

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }

    public void fabricaPerro(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Perro perroCreado = crearPerro();
            agregarPerro(perroCreado);
            System.out.println(perroCreado.toString());
        }
    }

    public void mostrarPerros() {
        System.out.println("---Listado Perros---");
        for (Perro aux : perros) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad: " + perros.size());
    }
    
    public List<Perro> getPerros(){
        return perros;
    }
    
    public void setListaPerros(List<Perro> perros){
        this.perros = perros;
    }
    
    public void mostrarPerrosSinDuenio(){
        for (Perro aux: perros) {
            if(aux.isTieneDuenio()==false){
                System.out.println(aux);
            }            
        }
    }
    
    
}
