package Ejercicio01.entidades;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Agu
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Long documento; 

    private List<Perro> perros = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Long documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }
    
     public void buscarPerro(){        
        System.out.println("Perros disponibles: ");
        for (int i = 0; i < perros.size(); i++) {
            System.out.print(perros.toString());
        }                
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", perros=" + perros + '}';
    }
    
    
}
