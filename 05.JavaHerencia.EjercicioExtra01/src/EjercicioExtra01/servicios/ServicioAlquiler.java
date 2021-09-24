package EjercicioExtra01.servicios;

import EjercicioExtra01.entidades.Barco;
import EjercicioExtra01.entidades.BarcoMotor;
import EjercicioExtra01.entidades.Velero;
import EjercicioExtra01.entidades.YateDeLujo;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioAlquiler {
    
    private Scanner leer; 
    Barco velero = null;
    Barco barcoMotor = null;
    Barco yate = null;
    private List<Barco> barcos;
    
    public ServicioAlquiler(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.barcos = new ArrayList();
    }
    
    public Velero crearVelero(){
        
        //Integer nroMastiles, String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, Long documentoCliente, 
        //LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco
        
        System.out.print("Ingrese números de mástiles: "); Integer nroMastiles = leer.nextInt();
        System.out.print("Ingrese matrícula: "); String matricula = leer.next();
        System.out.print("Ingrese eslora(Mts): "); Double esloraEnMetros = leer.nextDouble();                
        System.out.print("Ingrese año de fabricación: "); Integer fabric=leer.nextInt();            
        System.out.print("Ingrese nombre: "); String nombre = leer.next();
        System.out.print("Ingrese documento: "); Long documentoCliente = leer.nextLong();      
        
        System.out.println("Ingrese fecha alquiler DD/MM/YYYY: ");
        System.out.print("Ingrese Día: "); Integer diaAlq=leer.nextInt();
        System.out.print("Ingrese Mes: "); Integer mesAlq=leer.nextInt();        
        System.out.print("Ingrese Año: "); Integer anioAlq=leer.nextInt();
        LocalDate fechaAlquiler = LocalDate.of(anioAlq, mesAlq, diaAlq);
        
        System.out.println("Ingrese fecha devolución DD/MM/YYYY: ");
        System.out.print("Ingrese Día: "); Integer diaDev=leer.nextInt();
        System.out.print("Ingrese Mes: "); Integer mesDev=leer.nextInt();        
        System.out.print("Ingrese Año: "); Integer anioDev=leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anioDev, mesDev, diaDev);
        
        System.out.print("Posición amarre: "); Integer posicionAmarre = leer.nextInt();

        barcos.add(velero);
        
        return new Velero (nroMastiles, matricula, esloraEnMetros, fabric, nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, velero);
    }
    
    public BarcoMotor crearBarcoMotor(){

        //Integer nroMastiles, String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, Long documentoCliente, 
        //LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco
        
        System.out.print("Ingrese potencia en CV: "); Double potenciaEnCV = leer.nextDouble();
        System.out.print("Ingrese matrícula: "); String matricula = leer.next();
        System.out.print("Ingrese eslora(Mts): "); Double esloraEnMetros = leer.nextDouble();                
        System.out.print("Ingrese año de fabricación: "); Integer fabric=leer.nextInt();            
        System.out.print("Ingrese nombre: "); String nombre = leer.next();
        System.out.print("Ingrese documento: "); Long documentoCliente = leer.nextLong();      
        
        System.out.println("Ingrese fecha alquiler DD/MM/YYYY: ");
        System.out.print("Ingrese Día: "); Integer diaAlq=leer.nextInt();
        System.out.print("Ingrese Mes: "); Integer mesAlq=leer.nextInt();        
        System.out.print("Ingrese Año: "); Integer anioAlq=leer.nextInt();
        LocalDate fechaAlquiler = LocalDate.of(anioAlq, mesAlq, diaAlq);
        
        System.out.println("Ingrese fecha devolución DD/MM/YYYY: ");
        System.out.print("Ingrese Día: "); Integer diaDev=leer.nextInt();
        System.out.print("Ingrese Mes: "); Integer mesDev=leer.nextInt();        
        System.out.print("Ingrese Año: "); Integer anioDev=leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anioDev, mesDev, diaDev);
        
        System.out.print("Posición amarre: "); Integer posicionAmarre = leer.nextInt();

        barcos.add(barcoMotor);
        
        return new BarcoMotor (potenciaEnCV, matricula, esloraEnMetros, fabric, nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, barcoMotor);
    }
    
    public YateDeLujo crearYate(){

        //Integer nroCamaratores, Double potenciaeEnCV, String matricula, Double esloraEnMetros, Integer anioFabricacion, String nombre, 
        //Long documentoCliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, Integer posicionAmarre, Barco barco
        
        System.out.print("Ingrese nro de Camarotes: "); Integer nroCamarotes=leer.nextInt();            
        System.out.print("Ingrese potencia en CV: "); Double potenciaEnCV = leer.nextDouble();
        System.out.print("Ingrese matrícula: "); String matricula = leer.next();
        System.out.print("Ingrese eslora(Mts): "); Double esloraEnMetros = leer.nextDouble();                
        System.out.print("Ingrese año de fabricación: "); Integer fabric=leer.nextInt();            
        System.out.print("Ingrese nombre: "); String nombre = leer.next();
        System.out.print("Ingrese documento: "); Long documentoCliente = leer.nextLong();      
        
        System.out.println("Ingrese fecha alquiler DD/MM/YYYY: ");
        System.out.print("Ingrese Día: "); Integer diaAlq=leer.nextInt();
        System.out.print("Ingrese Mes: "); Integer mesAlq=leer.nextInt();        
        System.out.print("Ingrese Año: "); Integer anioAlq=leer.nextInt();
        LocalDate fechaAlquiler = LocalDate.of(anioAlq, mesAlq, diaAlq);
        
        System.out.println("Ingrese fecha devolución DD/MM/YYYY: ");
        System.out.print("Ingrese Día: "); Integer diaDev=leer.nextInt();
        System.out.print("Ingrese Mes: "); Integer mesDev=leer.nextInt();        
        System.out.print("Ingrese Año: "); Integer anioDev=leer.nextInt();
        LocalDate fechaDevolucion = LocalDate.of(anioDev, mesDev, diaDev);
        
        System.out.print("Posición amarre: "); Integer posicionAmarre = leer.nextInt();
                
        barcos.add(yate);
        
        return new YateDeLujo (nroCamarotes, potenciaEnCV, matricula, esloraEnMetros, fabric, nombre, documentoCliente, fechaAlquiler, fechaDevolucion, posicionAmarre, yate);
    }   
    
    public void menu(){
        
            System.out.println("-------ALQUILER DE BARCOS-------");
            System.out.println("1. Agregar barco");
            System.out.println("2. Agregar Perro");
            System.out.println("3. Mostrar Personas");
            System.out.println("4. Mostrar Perros");
            System.out.println("5. Asignar Perro a una Persona");
            System.out.println("6. Salir");
            System.out.print("Su opción: ");
            Integer sw = leer.nextInt();
        }
    
    
}
