package Ejercicio08;

import Ejercicio08.entidades.Cadena;
import Ejercicio08.servicios.ServicioCadena;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class CadenaAPP {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");        
        String letra="";
        int opc;        
        
        ServicioCadena sc = new ServicioCadena();
                
        Cadena c1 = sc.crearCadena();
        
        System.out.println(c1.toString());
        System.out.println("\n----------MENU------------");          
        System.out.println("1. Cantidad de vocales");
        System.out.println("2. Invertir frase");
        System.out.println("3. Carácter repetido");
        System.out.println("4. Comparar longitud");            
        System.out.println("5. Unir frase");
        System.out.println("6. Reemplazar carácter a");
        System.out.println("7. Comprobar si contiene el carácter");
        System.out.println("8. Salir");
        do{                        
            System.out.print("\nElija una opción: ");
            opc = leer.nextInt();
            switch(opc){
                case 1: sc.mostrarVocales(c1);
                    break;
                case 2: sc.invertirFrase(c1);
                    break;
                case 3: sc.vecesRepetido(letra);
                    break;
                case 4: sc.compararLongitud(letra, c1);
                    break;
                case 5: sc.unirFrases(letra, c1);
                    break;
                case 6: sc.reemplazar(letra, c1);
                    break;
                case 7: sc.contiene(letra);
                    break;
            }            
        }while(opc != 8);
    }    
}
