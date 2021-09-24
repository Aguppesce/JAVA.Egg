package Ejercicio10.servicios;
import Ejercicio10.entidades.Arreglo;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class ServicioArreglo {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Arreglo crearArreglo(){
        System.out.print("Ingresar tamaño del arreglo: ");
        int tamanio=leer.nextInt();
        return new Arreglo(tamanio);
    }
    
    public void llenarArreglo(Arreglo arreglo1){
        
        float vector[] = new float[arreglo1.getTamanio()];
        float aleatorio;
        
        for (int i = 0; i < vector.length; i++) {
            aleatorio=(float)(Math.random()*10+1);
            vector[i]=aleatorio;
        }
        arreglo1.setArreglo(vector);
    }    

    public void mostrarArreglo(Arreglo arregloA){
        for (int i = 0; i < arregloA.getTamanio(); i++) {
            System.out.println("["+arregloA.getArreglo()[i]+"], ");            
        }            
    }
    
    public void ordenarArreglo(Arreglo arregloA){
        float vector[] = new float[arregloA.getTamanio()];
        vector = arregloA.getArreglo();
        Arrays.sort(vector);
        arregloA.setArreglo(vector);       
    }
    
    public void copiarElementos(Arreglo arregloA, Arreglo arregloB){
        float vector[] = new float[arregloB.getTamanio()];
        Arrays.fill(vector, 0.5F);
        
        System.arraycopy(arregloA.getArreglo(),0,vector,0, 10);
        
        arregloB.setArreglo(vector);
        
    }
    
    
    
}
