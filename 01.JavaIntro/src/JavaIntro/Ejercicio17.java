/**
 *
 * @Agu
 */
package JavaIntro;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.substring;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Ejercicio17 {

    public static void main(String[] args) {
        int longitud,cont,cont2;
        cont=0;
        cont2=0;
        String cadena = "";
        Scanner leer = new Scanner(System.in);
        do {
            System.out.print("Ingrese una cadena de un máximo de 5 carácteres: ");
            cadena = leer.nextLine();
            toUpperCase(cadena);
            longitud = cadena.length();
            cont=cont+1;
            if("&&&&&".equals(cadena)){
                break;
            }
        }while((longitud==5) && ("x".equals(substring(cadena,0,1))) &&("o".equals(substring(cadena,longitud-1,longitud))));
        do{
            cadena=leer.next();
            cont2=cont2+1;
            if("&&&&&".equals(cadena)){
                break;
            }
        }while((longitud==5) || (!"x".equals(substring(cadena,0,1))) &&(!"o".equals(substring(cadena,longitud-1,longitud))));
        System.out.println("Correcto: "+cont);
        System.out.println("Incorrecto: "+cont2);
    }
}
