package IntroJavaHerenciaMascotapp.mascotapp.entidades;
import IntroJavaHerenciaMascotapp.mascotapp.enumeraciones.SexoAnimal;

/**
 *
 * @author Agu
 */
public class Mascota <T>{ //agregar "implements Comparable<Mascota>" para usar el compareTo
    private String nombre;
    private String apodo;
    //Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private Integer edad;
    private boolean cola;    
    private SexoAnimal sexo;
    private T raza;
    
    private int energia = 1000;    
    
    public Mascota(){
        this.energia = 1000;
    }

    
    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }
//    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, boolean cola, SexoAnimal sexo, T raza) {
//        this.nombre = nombre;
//        this.apodo = apodo;
//        this.tipo = tipo;
//        this.color = color;
//        this.edad = edad;
//        this.cola = cola;
//        this.sexo = sexo;
//        this.raza = raza;
//    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", sexo=" + sexo + ", raza=" + raza + ", energia=" + energia + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }

    public T getRaza() {
        return raza;
    }

    public void setRaza(T raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    
}
