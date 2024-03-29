package POO_07_Ejercicio_Solucion_00;

import POO_07_Ejercicio_Solucion_00.entidades.Persona;
import POO_07_Ejercicio_Solucion_00.servicios.ServicioPersona;

/**
 * @author Aguppesce
 */
/*Realizar una clase llamada Persona que tenga los siguientes atributos: nombre,
        edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea
        añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:

        • Un constructor por defecto.
        • Un constructor con todos los atributos como parámetro.
        • Métodos getters y setters de cada atributo.
        • Metodo crearPersona(): el método crear persona, le pide los valores de los
        atributos al usuario y después se le asignan a sus respectivos atributos para
        llenar el objeto Persona. Además, comprueba que el sexo introducido sea
        correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
        • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
        kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
        la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y
        25 (incluidos), significa que el peso está por debajo de su peso ideal y la
        función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor
        mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve
        un 1. Se recomienda hacer uso de constantes para devolver estos valores.
        • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
        devuelve un booleano.

        A continuación, en la clase main hacer lo siguiente:
        Crear 4 objetos de tipo Persona con distintos valores, a continuación,
        llamaremos todos los métodos para cada objeto, deberá comprobar si la persona
        está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e
        indicar para cada objeto si la persona es mayor de edad.
        Por último, guardaremos los resultados de los métodos calcularIMC y
        esMayorDeEdad en distintas variables, para después en el main, calcular un
        porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
        su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
        cuantos son mayores de edad y cuantos menores.

        */
public class Main_POO_Ejercicio_07_Solucion_00 {
    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();
        //String nombre, int edad, String sexo, float peso, float altura
        Persona p1 = new Persona();
        p1.setNombre("Adrian");
        p1.setEdad(42);
        p1.setSexo("H");
        p1.setPeso(98);
        p1.setAltura((1.80));
        //Persona p1 = sp.crearPersona();

        Persona p2 = new Persona("William", 33, "H", 78, (1.86));
        //Persona p2 = sp.crearPersona();

        Persona p3 = new Persona("Alina", 9, "M", 37, (1.52));
        //Persona p3 = sp.crearPersona();

        Persona p4 = sp.crearPersona();

        System.out.println(p1);
        sp.calcularIMC(p1);
        sp.esMayorDeEdad(p1);
        System.out.println(p2);
        sp.calcularIMC(p2);
        sp.esMayorDeEdad(p2);
        System.out.println(p3);
        sp.calcularIMC(p3);
        sp.esMayorDeEdad(p3);
        System.out.println(p4);
        sp.calcularIMC(p4);
        sp.esMayorDeEdad(p4);
        sp.estadistica(4);
    }
}
