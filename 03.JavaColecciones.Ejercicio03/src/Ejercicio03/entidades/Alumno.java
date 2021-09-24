package Ejercicio03.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agu
 */
public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;    

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {        
        return  "\nNombre: " + nombre + " Notas: " + notas;
    }
    
    public void promedioNotas(){
        int promedio=0;
        for (int i = 0; i < notas.size(); i++) {
            promedio=promedio+notas.get(i);
        }        
        System.out.println("Promedio: "+(promedio/notas.size()));
    }
    
}
