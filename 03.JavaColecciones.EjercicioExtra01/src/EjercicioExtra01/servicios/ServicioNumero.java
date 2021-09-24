package EjercicioExtra01.servicios;

import EjercicioExtra01.entidades.Numero;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioNumero {

    private Scanner leer;
    private ArrayList<Integer> numeros;
    private Integer num,cont=0,prom=0;
    public ServicioNumero() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.numeros = new ArrayList();
    }

    public Numero crearNumero() {        
        do {
            System.out.print("Ingrese un número: ");
            num = leer.nextInt();
            if (num != -99) {
                numeros.add(num);
                cont=cont+num;
                prom=prom+1;
            }
        }while(num!=-99);     
        
        return new Numero(num);
    }

    public void mostrarNum() {
        System.out.println("-------Todos los números-------");
        for (Integer aux : numeros) {
            System.out.println(aux.toString());
        }
    }
    
    public void sumaPromedio(){
        System.out.println("La suma de todos los números es: "+cont);
        System.out.println("El promedio es: "+cont/prom);
    }
}
