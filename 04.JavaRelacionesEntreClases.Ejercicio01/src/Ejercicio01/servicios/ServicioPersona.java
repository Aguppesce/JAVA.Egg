package Ejercicio01.servicios;

;
import Ejercicio01.entidades.Perro;
import Ejercicio01.entidades.Persona;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agu
 */


public class ServicioPersona {

    private Scanner leer;
    private List<Persona> personas;
    private List<Perro> perros;

    public ServicioPersona() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.personas = new ArrayList();
    }

    public Persona crearPersona() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Apellido: ");
        String apellido = leer.next();
        System.out.print("Edad: ");
        Integer edad = leer.nextInt();
        System.out.print("Documento: ");
        Long documento = leer.nextLong();

        return new Persona(nombre, apellido, edad, documento);
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }

    public void fabricaPersona(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Persona personaCreada = crearPersona();
            agregarPersona(personaCreada);
            System.out.println(personaCreada.toString());
        }
    }

    public void mostrarPersona() {
        System.out.println("---Listado Perros---");
        for (Persona aux : personas) {
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad: " + personas.size());
    }

    public void asignarPerro(ServicioPerro perro, String nombre) {
        System.out.print("Ingrese su nombre: ");
        String nombrePersona = leer.next();
        for (Persona auxPersona : personas) {
            if (auxPersona.getNombre().equals(nombrePersona)) {
                for (Perro auxPerro : perro.getPerros()) {                    
                    if (auxPerro.getNombre().equals(nombre)) {
                        auxPersona.getPerros().add(auxPerro);
                        auxPerro.setTieneDuenio(true);
                    }
                }
            }
        }

    }
}
