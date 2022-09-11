package POO_01_Ejercicio;

import POO_01_Ejercicio.entidades.Libro;
import POO_01_Ejercicio.servicios.ServicioLibro;

/**
* @author Aguppesce
* */
//Ejercicio 01: Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas,y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas.

public class Main_POO_Ejercicio_01 {
    public static void main(String[] args) {

        ServicioLibro servicioLibro = new ServicioLibro();

        Libro libro = servicioLibro.crearLibro();

        System.out.printf(libro.toString());


    }
}