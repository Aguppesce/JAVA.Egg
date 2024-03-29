package POO_07_Ejercicio_Solucion_00.entidades;

/**
 * @author Aguppesce
 */
/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea
añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:

• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.

 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private float peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, float peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "\nPersona: "
                + "\nNombre: " + nombre
                + "\nEdad:   " + edad
                + "\nSexo:   " + sexo
                + "\nPeso:   " + peso + " kg"
                + "\nAltura: " + altura + " mts";
    }
}
