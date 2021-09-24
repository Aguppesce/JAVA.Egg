/**
 *
 * @Agu 
 */
package JavaIntro;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        String nom;
        
        Scanner leer=new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        nom = leer.nextLine();
        System.out.print("Nombre en mayúscula: "+(nom.toUpperCase())+"\n");
        System.out.print("Nombre en minúscula: "+(nom.toLowerCase())+"\n");
        
        
    }
    
}
