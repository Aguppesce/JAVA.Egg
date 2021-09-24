package Ejercicio11;
/**
 *
 * @author Agu
 */
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DateAPP {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        
//        Date fecha = new Date();       
//        System.out.println(fecha);
//        ChronoUnit.YEARS.between(fecha_nacimiento, fecha_actual);
        
        int dia, mes, anio;
        System.out.print("Ingrese Mes: ");
        mes=leer.nextInt();
        System.out.print("Ingrese Día: ");
        dia=leer.nextInt();
        System.out.print("Ingrese Año: ");
        anio=leer.nextInt();    
        
        
        LocalDate fechaUsuario = LocalDate.of(anio, mes, dia);
        System.out.println("Fecha que ingreso: " +fechaUsuario);
        
        LocalDate fechaActual = LocalDate.now();
        Period diferenciaAnios = Period.between(fechaUsuario, fechaActual);
        System.out.println("Tiempo transcurrido entre la fecha actual y la que ingreso: "+diferenciaAnios);
        System.out.println("Su edad es: "+diferenciaAnios.getYears());
        
//        System.out.println("Edad: "+ChronoUnit.YEARS.between(fechaUsuario, fechaActual));
        
        
        LocalDate fechaAumen = fechaUsuario.plusDays(15);//plusMonths, plusYears, plusWeeks
        System.out.println("El día correspondiente luego de 15 días a la fecha que ingreso es: "+fechaAumen);
        
        System.out.println("Año bisiesto: "+fechaUsuario.isLeapYear());
        
        long auxi1 = fechaUsuario.toEpochDay();
        long auxi2 = fechaActual.toEpochDay();
        long diferenciaDias = (auxi2-auxi1);        
        System.out.println("Días totales transcurrido desde fecha ingresada hoy: "+diferenciaDias);
        
        System.out.println("El mes ingresado contiene "+fechaUsuario.lengthOfMonth()+" dias");
        diferenciaAnios.toTotalMonths();
        

        
    }
    
}
