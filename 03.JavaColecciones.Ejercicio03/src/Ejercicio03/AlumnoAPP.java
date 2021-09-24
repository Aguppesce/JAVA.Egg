package Ejercicio03;

import Ejercicio03.servicios.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class AlumnoAPP {
    public static void main(String[] args) {                
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAlumno servAlumno = new ServicioAlumno();
        
        String opc,nombre;
        int sw;
        boolean flag = false;
        do {
            System.out.println("-------MENU-------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Promedio");            
            System.out.println("4. Salir");
            System.out.print("Su opción: ");
            sw = leer.nextInt();
            switch (sw) {
                case 1:
                    servAlumno.fabricaAlumnos(1);
                    do {
                        System.out.print("Desea agregar otro alumno (S/N)?");
                        opc = leer.next();
                        opc = opc.toUpperCase();
                        if (opc.equals("S")) {
                            servAlumno.fabricaAlumnos(1);
                        } else if (opc.equals("N")) {
                            flag = true;
                        }
                    } while (!flag);                    
                    break;
                case 2:
                    System.out.println("-----Listado Alumnos-----");
                    servAlumno.mostrarAlumno();
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Ingrese nombre del alumno: ");
                    nombre = leer.next();
                    servAlumno.notaFinal(nombre);
            }
        } while (sw != 4);
        System.out.println("");
    }
    
}
