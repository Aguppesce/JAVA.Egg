package Ejercicio12.servicios;

import Ejercicio12.entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioPersona {
    
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        
        System.out.println("Fecha de nacimiento");
        System.out.print("Día (dd): ");
        int dia = leer.nextInt();
        
        System.out.print("Mes (mm): ");
        int mes = leer.nextInt();
        
        System.out.print("Año: ");
        int anio = leer.nextInt();
        
        System.out.print("Nombre: ");
        String nombre=leer.next();
        LocalDate fechaNac = LocalDate.of(anio,mes,dia);
        return new Persona(nombre, fechaNac);
    }
    
    public void calcularEdad(Persona persona){
        LocalDate fechaActual = LocalDate.now();
        Period diferencia = Period.between(persona.getFechaNac(), fechaActual);
        System.out.println("Fecha de Nacimiento: "+persona.getFechaNac());
        System.out.println("Edad o cantidad de años entre fecha de nacimiento y la fecha actual: "+diferencia.getYears());
    }
    
    public boolean menorQue(Persona persona, int edad){       
        LocalDate fechaActual = LocalDate.now();
        int anio = fechaActual.getYear() - persona.getFechaNac().getYear();
        return edad>anio;
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNac());
    }
}
