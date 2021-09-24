package EjercicioExtra03.servicios;

import EjercicioExtra03.entidades.Raices;
import java.util.Scanner;
/**
 *
 * @author Agu
 */
public class ServicioRaices {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Raices crearRaices(){
        System.out.print("Ingrese valor de a: ");
        int a = leer.nextInt();
        System.out.print("Ingrese valor de b: ");
        int b = leer.nextInt();
        System.out.print("Ingrese valor de c: ");
        int c = leer.nextInt();
        
        return new Raices(a,b,c);
    }
        
    public boolean tieneRaices(Raices raices){        
        if(raices.getDiscriminate()>0){
            return true;
        }else{
            return false;
        }        
    }
    
    public boolean tieneRaiz(Raices raices){        
        if(raices.getDiscriminate()==0){
            return true;
        }else{
            return false;
        }
    }
    
    public void obtenerRaices(Raices raices){
        double resultadoPositivo;
        double resultadoNegativo;
        if(tieneRaices(raices)==true){            
            resultadoPositivo=(-raices.getB()+Math.sqrt((Math.pow(raices.getB(), 2)-4*raices.getA()*raices.getC())))/(2*raices.getA());
            resultadoNegativo=(-raices.getB()-Math.sqrt((Math.pow(raices.getB(), 2)-4*raices.getA()*raices.getC())))/(2*raices.getA());
            System.out.println("Resultado 1: "+resultadoPositivo);
            System.out.println("Resultado 2: "+resultadoNegativo);
        }
    }
    
    public void obtenerRaiz(Raices raices){
        double resultado;
        if(tieneRaiz(raices)==true){            
            resultado=(-raices.getB()+Math.sqrt((Math.pow(raices.getB(), 2)-4*raices.getA()*raices.getC())))/(2*raices.getA());
            System.out.println("Resultado: "+resultado);
        }
    }
    
    public void calcular(Raices raices){
        if(tieneRaices(raices)==true){
            obtenerRaices(raices);
        } else if(tieneRaiz(raices)==true){
            obtenerRaiz(raices);
        } else {
            System.out.println("No existe una solución!");
        }                
    }    
}
