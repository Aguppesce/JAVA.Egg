package principal;

import libreria.dominio.libro.Libro;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;
import libreria.dominio.autor.AutorService;
import libreria.dominio.editorial.EditorialService;
import libreria.dominio.libro.LibroService;

public class MenuLibreria {

    private final Scanner leer;
    private final AutorService autorService;
    private final EditorialService editorialService;
    private final LibroService libroService;

    public MenuLibreria() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.autorService = new AutorService();
        this.editorialService = new EditorialService();
        this.libroService = new LibroService();
    }
    
    public void menu() throws Exception {
        Integer opcion;
        do {
            System.out.println("1) MENU LIBRO");//OK
            System.out.println("2) MENU AUTOR");//OK
            System.out.println("3) MENU EDITORIAL");//OK
            System.out.println("0) SALIR");
            System.out.print("Su opción: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    menuLibro();
                    break;
                case 2:
                    menuAutor();
                    break;
                case 3:
                    menuEditorial();
                    break;                
                case 0:
                    System.exit(0);
                    break;
            }            
            limpiarPantalla();
        } while (opcion!=0);
    }

    public void menuLibro() throws Exception {
        String respuesta;
        do {
            System.out.println("=====================================");
            System.out.println("Seleccione la opción:");
            System.out.println(" 1) Crear Libro");//OK
            System.out.println(" 2) Mostrar Libros");//OK
            System.out.println(" 3) Modificar Libro");//OK
            System.out.println(" 4) Eliminar Libro");//OK            
            System.out.print("Su opción: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    libroService.crearLibro(cargarTitulo(), cargarAnio(), cargarAutor(), cargarEditorial());
                    break;
                case 2:
                    libroService.imprimirLibros();
                    break;
                case 3:
                    libroService.imprimirLibros();
                    System.out.print("Escriba el título del libro que quiere modificar: ");
                    String modificarTitulo = leer.next();
                    libroService.modificarLibro(modificarTitulo, cargarTitulo(), cargarAnio(), cargarAutor(), cargarEditorial());
                    break;
                case 4:
                    System.out.print("Escriba el libro que quiere eliminar: ");
                    String libroAEliminar = leer.next();
                    libroService.eliminarLibro(libroAEliminar);
                    break;                
            }
            System.out.println("Realizar otra operación: SI | Volver al menu principal: Presione cualquier tecla");
            respuesta = leer.next();            
            respuesta = respuesta.toUpperCase();
            limpiarPantalla();
        } while ("SI".equals(respuesta));
    }

    public void menuAutor() throws Exception {
        String respuesta;
        do {
            System.out.println("=====================================");
            System.out.println("Seleccione la opción:");
            System.out.println(" 1) Crear Autor");//OK
            System.out.println(" 2) Mostrar Autores");//OK
            System.out.println(" 3) Modificar Autor");//OK
            System.out.println(" 4) Eliminar Autor");//OK            
            System.out.print("Su opción: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    autorService.crearAutor(cargarAutor());
                    break;
                case 2:
                    autorService.imprimirAutores();
                    break;
                case 3:
                    autorService.modificarAutor(cargarAutor());
                    break;
                case 4:
                    System.out.print("Escriba el autor que quiere eliminar: ");
                    String autorAEliminar = leer.next();
                    autorService.eliminarAutor(autorAEliminar);
                    break;               
            }
            System.out.println("Realizar otra operación: SI | Volver al menu principal: Presione cualquier tecla");
            respuesta = leer.next();
            respuesta = respuesta.toUpperCase();
            limpiarPantalla();
        } while ("SI".equals(respuesta));
    }

    public void menuEditorial() throws Exception {
        String respuesta;
        do {
            System.out.println("=====================================");
            System.out.println("Seleccione la opción:");
            System.out.println(" 1) Crear Editorial");//OK
            System.out.println(" 2) Mostrar Editoriales");//OK
            System.out.println(" 3) Modificar Editorial");//OK
            System.out.println(" 4) Eliminar Editorial");//OK            
            System.out.print("Su opción: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    editorialService.crearEditorial(cargarEditorial());
                    break;
                case 2:
                    editorialService.imprimirEditoriales();
                    break;
                case 3:
                    editorialService.modificarEditorial(cargarEditorial());
                    break;
                case 4:
                    System.out.print("Escriba la editorial que quiere eliminar: ");
                    String editorialAEliminar = leer.next();
                    autorService.eliminarAutor(editorialAEliminar);
                    break;                
            }
            System.out.println("Realizar otra operación: SI | Volver al menu principal: Presione cualquier tecla");
            respuesta = leer.next();
            respuesta = respuesta.toUpperCase();
            limpiarPantalla();
        } while ("SI".equals(respuesta));
    }    

    public void limpiarPantalla() throws AWTException {
        //Dejo este metodo para ir borrando la consola.. y que no sea un desorden.
        Robot pressbot = new Robot();
        pressbot.setAutoDelay(30); // Tiempo de espera antes de borrar
        pressbot.keyPress(17); // Orden para apretar CTRL key
        pressbot.keyPress(76);// Orden para apretar L key
        pressbot.keyRelease(17); // Orden para soltar CTRL key
        pressbot.keyRelease(76); // Orden para soltar L key

    }

    public String cargarTitulo() throws Exception {
        System.out.print("Ingrese el título: ");
        String tituloI = leer.next();
        try {
            if (libroService.validarTitulo(tituloI)) {
                System.out.println("Se ha registrado el título!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarTitulo();
        }
        return tituloI;
    }

    public String cargarAutor() throws Exception {
        System.out.print("Ingrese nombre del autor: ");
        String nombreAutor = leer.next();
        try {
            if (autorService.validarAutor(nombreAutor)) {
                System.out.println("Autor registrado!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarAutor();
        }
        return nombreAutor;
    }

    public String cargarEditorial() throws Exception {
        System.out.print("Ingrese nombre de la editorial: ");
        String nombreEditorial = leer.next();
        try {
            if (editorialService.validarEditorial(nombreEditorial)) {
                System.out.println("Editorial registrada!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            cargarEditorial();
        }
        return nombreEditorial;
    }

    public Integer cargarAnio() {
        System.out.print("Ingrese el año: ");
        Integer anioI = leer.nextInt();
        return anioI;
    }

    public String buscarLibroPorTitulo() throws Exception {
        System.out.print("Ingrese el título del libro");
        String tituloLibroI = leer.next();
        return tituloLibroI;
    }

    public String buscarAutorPorNombre() {
        System.out.print("Ingrese el nombre del autor: ");
        String nombreAutorI = leer.next();
        return nombreAutorI;
    }

    public String buscarEditorialPorNombre() {
        System.out.print("Ingrese el nombre de la editorial ");
        String nombreEditorialI = leer.next();
        return nombreEditorialI;
    }

    public Libro encontrarLibro() throws Exception {
        System.out.println("Ingrese el ID del libro");
        Long isbnLibro = leer.nextLong();
        Libro libro = libroService.buscarLibroPorIsbn(isbnLibro);
        return libro;
    }

}
