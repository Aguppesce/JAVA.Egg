package Ejercicio01.entidades;
/**
 *
 * @author Agu
 */
public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }   
    
//    public void Alimentarse(){
//        if (this instanceof Caballo) {
//            Caballo object = (Caballo) this;            
//            System.out.println("Alimento: "+this.alimento);              
//        }
//        
//        if (this instanceof Gato) {
//            Gato object = (Gato) this;
//            System.out.println("Alimento: "+this.alimento);            
//        }
//        
//        if (this instanceof Perro) {
//            Perro object = (Perro) this;
//            System.out.println("Alimento: " + this.alimento);            
//        }
//    }
    
    public abstract void alimentarse();
    
}
