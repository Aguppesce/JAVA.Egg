package Ejercicio08.servicios;

import Ejercicio08.entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Agu
 */
public class ServicioCadena {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String frase;
    int longitud,contVocales,contCaracter;
    
    public Cadena crearCadena(){
        System.out.print("Ingrese una frase: ");
        frase = leer.nextLine();
        
        int longitud = frase.length();
        
        return new Cadena(frase,longitud);
    }
    
    public void mostrarVocales(Cadena cadena1){
        System.out.print("\nVocales: ");
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i)=='a' || frase.charAt(i)=='e' || frase.charAt(i)=='i' || frase.charAt(i)=='o' || frase.charAt(i)=='u' || frase.charAt(i)=='A' || frase.charAt(i)=='E' || frase.charAt(i)=='I' || frase.charAt(i)=='O' || frase.charAt(i)=='U')
            {
                System.out.print(frase.charAt(i)+", ");
                contVocales=contVocales+1;
            }
        }
        System.out.println("\nCantidad de vocales: "+contVocales);        
    }
    
    public void invertirFrase(Cadena cadena1){
        System.out.print("Frase invertida: ");
        for(int i=frase.length()-1;i>=0;i--){
            System.out.print(frase.charAt(i));
        }
    }
    
    public String vecesRepetido(String letra){        
        System.out.print("¿Qué carácter desea buscar?: ");
        letra = leer.next();
        for(int i = 0; i < frase.length(); i++){
            if(frase.substring(i,(i+1)).equals(letra)){
                contCaracter=contCaracter+1;
            }
        }
        System.out.print("El carácter está repetido: "+contCaracter);
        return letra;
    }
    
    public String compararLongitud(String fraseComparada, Cadena cadena1){
        System.out.print("Ingrese una frase: ");
        fraseComparada = leer.next();
        int longitudComparada = fraseComparada.length();
        int fraseOriginal = cadena1.getLongitud();
        if(longitudComparada == fraseOriginal){
            System.out.println("Tiene la misma longitud");
        }else{
            System.out.println("No tiene la misma longitud");
        }
        return fraseComparada;        
    }
    
    public String unirFrases(String fraseParaUnir, Cadena cadena1){
        System.out.print("Ingrese la frase que quiere unir: ");
        fraseParaUnir = leer.next();
        String fraseOriginal = cadena1.getFrase();
        System.out.println("Frase unida: "+fraseOriginal+" "+fraseParaUnir);
        return fraseParaUnir;
    }
    
    public String reemplazar(String letra, Cadena cadena1){
        System.out.print("Reempalzar letras a por el carácter?: ");
        letra = leer.next();
        String fraseOriginal = cadena1.getFrase();
        System.out.println("Resultado: "+fraseOriginal.replace("a", letra));        
        return letra;
    }
    
    public String contiene(String letra){
        boolean flag=false;
        System.out.print("¿Qué carácter desea buscar?: ");
        letra = leer.next();
        for(int i = 0; i < frase.length(); i++){
            if(frase.substring(i,(i+1)).equals(letra)){                
                flag=true;
            }            
        }
        System.out.println(flag);
        return letra;
    }
}
