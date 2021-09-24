/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio09.servicios;

import Ejercicio09.entidades.Matematica;
import Ejercicio09.utilidades.UtilidadMatematica;

/**
 *
 * @author Agu
 */
public class ServicioMatematica {
    
    public Matematica crearMatematica(){
        double num1=Math.random()*10;
        double num2=Math.random()*10;
        
        System.out.println("Número 1: "+num1);
        System.out.println("Número 2: "+num2);
        return new Matematica(num1,num2);
    }   
    
    public void numerosRandom(Matematica matematica1){        
        double num1=Math.random()*10;
        double num2=Math.random()*10;
        matematica1.setNum1(num1);
        matematica1.setNum2(num2);
        System.out.println("Número 1: "+matematica1.getNum1());//también puede ser ..."+num1);
        System.out.println("Número 2: "+num2);//también puede ser ..."+matematica1.getNum2());
    }
    public void devolverMayor(Matematica matematica1){        
        System.out.println("El mayor de los dos números es " + Math.max(matematica1.getNum1(), matematica1.getNum2()));
    }
    
    public void calcularPotencia(Matematica matematica1){
//        double num1=Math.round(matematica1.getNum1());
//        double num2=Math.round(matematica1.getNum2());
//        double num1=UtilidadMatematica.redondearNum(matematica1.getNum1());
//        double num2=UtilidadMatematica.redondearNum(matematica1.getNum2());
        if(UtilidadMatematica.redondearNum(matematica1.getNum1())>UtilidadMatematica.redondearNum(matematica1.getNum2())){
            System.out.println("El mayor es: "+matematica1.getNum1());
            System.out.println("Número redondeado: "+UtilidadMatematica.redondearNum(matematica1.getNum1()));
            System.out.println("La potencia del mayor es: "+Math.pow(UtilidadMatematica.redondearNum(matematica1.getNum1()), UtilidadMatematica.redondearNum(matematica1.getNum2())));
        }else{
            System.out.println("El mayor es: "+matematica1.getNum2());
            System.out.println("Número redondeado: "+UtilidadMatematica.redondearNum(matematica1.getNum2()));
            System.out.println("La potencia del mayor es: "+Math.pow(UtilidadMatematica.redondearNum(matematica1.getNum2()), UtilidadMatematica.redondearNum(matematica1.getNum1())));
        }
    }
    
    public void calcularRaiz(Matematica matematica1){
        double num1=Math.abs(matematica1.getNum1());
        double num2=Math.abs(matematica1.getNum2());       
//        double num1=UtilidadMatematica.numeroAbsoluto(matematica1.getNum1());
//        double num2=UtilidadMatematica.numeroAbsoluto(matematica1.getNum2());
        if(UtilidadMatematica.numeroAbsoluto(matematica1.getNum1())<UtilidadMatematica.numeroAbsoluto(matematica1.getNum2())){            
            System.out.println("El menor es: "+matematica1.getNum1());
            System.out.println("Número absoluto: "+num1);
            //System.out.println("Número absoluto: "+UtilidadMatematica.numeroAbsoluto(matematica1.getNum1()));
            System.out.println("La raiz es: "+Math.sqrt(UtilidadMatematica.numeroAbsoluto(matematica1.getNum1())));
        }else{            
            System.out.println("El menor es: "+matematica1.getNum2());
            System.out.println("Número absoluto: "+num2);
            //System.out.println("Número absoluto: "+UtilidadMatematica.numeroAbsoluto(matematica1.getNum2()));
            System.out.println("La raiz es: "+Math.sqrt(UtilidadMatematica.numeroAbsoluto(matematica1.getNum2())));
        }
    } 
   
}
