/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIntro;

/**
 *
 * @author Agu
 */
public class Integrador {
    
    public static void main(String[] args) {
        
        System.out.println(parCieloPiso(4, 1.4, 6));
        System.out.println(geringoso("murcielago"));
        System.out.println(inversa("MURCIELAGO"));
        
    }
    
    public static boolean parCieloPiso(int numEnt, double numReal, long numLargo) {
        
        
        if ((numEnt % 2 == 0) && Math.round(numReal) == Math.floor(numReal)&& numLargo>0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static String geringoso(String palabra){

        String resultado = palabra;

        resultado = resultado.replaceAll("a", "apa").replaceAll("e", "epe").replaceAll("i", "ipi").replaceAll("o", "opo").replaceAll("u", "upu");
        System.out.println(resultado);
        return resultado;

    }

    public static String inversa(String palabra){        
        String resultado="";
        
        for(int i = 0; i < palabra.length(); i++){
            resultado = palabra.charAt(i)+resultado;
        }
        
        return resultado.toLowerCase();
    }
}
