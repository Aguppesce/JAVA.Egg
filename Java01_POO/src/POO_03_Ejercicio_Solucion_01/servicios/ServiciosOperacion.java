
package POO_03_Ejercicio_Solucion_01.servicios;


import POO_03_Ejercicio_Solucion_01.entidades.Operacion;

import java.util.Scanner;

public class ServiciosOperacion {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
    return new Operacion(num1,num2);
    }
    
    public int sumar(Operacion c){
        return c.getNumero1()+c.getNumero2();
    }
    
    public int restar(Operacion c){
        return c.getNumero1()-c.getNumero2();
        
    }
    
    public int multiplicar(Operacion c){
        
        if (c.getNumero1()==0 || c.getNumero2()==0){
            System.out.println("Uno de los factores es 0");   
        return 0;
        }else {
            return c.getNumero1()*c.getNumero2();
        }
    }
    
    public float dividir(Operacion c){
        if (c.getNumero1()==0 || c.getNumero2()==0){
            System.out.println("Dividendo o Divisor es 0");   
        return 0;
        }else {
            return c.getNumero1()/c.getNumero2();
        }
    }
    
}
