package POO_01_Ejercicio.servicios;

import POO_01_Ejercicio.entidades.Libro;

import java.util.Scanner;

public class ServicioLibro {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.printf("Ingresa el ISNB del Libro: ");
        String isnb = leer.next();
        System.out.printf("Ingresa el Titulo del Libro: ");
        String titulo = leer.next();
        System.out.printf("Ingresa el Autor del Libro: ");
        String autor = leer.next();
        System.out.printf("Ingresa la cantidad de Paginas: ");
        int nroPaginas = leer.nextInt();

        return new Libro(isnb, titulo, autor, nroPaginas);
    }

}
