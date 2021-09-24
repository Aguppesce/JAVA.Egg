package EjercicioExtra02.servicios;

import EjercicioExtra02.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioPuntos {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        int x1=7;
        int y1=5;
        System.out.print("Ingrese putno x2: ");
        int x2=leer.nextInt();
        System.out.print("Ingrese putno y2: ");
        int y2=leer.nextInt();
        
        return new Puntos(x1,y1,x2,y2);        
    }
    
    public void calcular(Puntos puntos){
        int x1=puntos.getX1();
        int y1=puntos.getY1();
        int x2=puntos.getX2();
        int y2=puntos.getY2();
        double calculo=Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1),2)));        
        System.out.println("La distancia es: " +calculo);
    }
    
}
