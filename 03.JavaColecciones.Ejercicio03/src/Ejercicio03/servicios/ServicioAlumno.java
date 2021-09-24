package Ejercicio03.servicios;

import Ejercicio03.entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Integer;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioAlumno {

    private Scanner leer;
    private ArrayList<Alumno> alumnos;    

    public ServicioAlumno() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();        
    }

    public Alumno crearAlumno() {
        ArrayList<Integer> notas = new ArrayList();
        System.out.print("Nombre del alumno: ");
        String nombre = leer.next();
        System.out.print("Nota 1: ");
        int nota1 = leer.nextInt();
        notas.add(nota1);
        System.out.print("Nota 2: ");
        int nota2 = leer.nextInt();
        notas.add(nota2);
        System.out.print("Nota 3: ");
        int nota3 = leer.nextInt();
        notas.add(nota3);
        
        Alumno a1 = new Alumno(nombre, notas);
        
        return new Alumno(nombre, notas);
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void fabricaAlumnos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Alumno alumnoCreado = crearAlumno();

            agregarAlumno(alumnoCreado);
        }
    }

    public void mostrarAlumno() {
        System.out.println("Listado alumnos: ");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toString());
        }
    }
    
    

    public void notaFinal(String nombre) {
        Iterator<Alumno> it = alumnos.iterator();
        
        while (it.hasNext()) {
            Alumno aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                aux.promedioNotas();
                break;
            }else{
                //System.out.println("El alumno no se encuentra en la lista");
            }
        }
    }
        
//    public void notaFinal(String nombre) {
//        Iterator<Alumno> it = alumnos.iterator();
//        int promedio = 0;
//        while (it.hasNext()) {
//            Alumno aux = it.next();
//            System.out.println(aux.getNombre());
//            if (aux.getNombre().equals(nombre)) {
//                for (int i = 0; i < aux.getNotas().size(); i++) {
//                    promedio = promedio + aux.getNotas().get(i);
//                }
//                System.out.println("Promedio: "+(promedio/3));
//            } else {
//                System.out.println("El alumno no se encuentra en la lista");
//            }
//        }
//    }
}
