package libreria.utilidad;
 
import java.util.Scanner;
import java.util.UUID;
import libreria.excepcion.ExcepcionLibreria;

public class Utilidad {
    
    private static Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public static String obtenerCampo(){
        String campo = null;
        
        try {
            campo = leer.next();
            
            if(campo.trim().isEmpty()){
                throw new ExcepcionLibreria("Campo obligatorio");
            }
            
            if(campo.matches("^-?[0-9]+$")){
                throw new ExcepcionLibreria("No se admiten números. Sólo carácteres");
            }
        } catch(ExcepcionLibreria e){
            System.out.println(e.getMessage());
            campo = obtenerCampo();
        }
        
        return campo;
    }
    
    public static String obtenerAnio(){
        String anio = null;
        
        try{
            anio = leer.next();
            
            if(anio.trim().isEmpty()){
                throw new ExcepcionLibreria("Campo obligatorio");
            }
            
            if(!anio.matches("\\d{4}")){
                throw new ExcepcionLibreria("Debe ingresar 4 dígitos");
            }
        } catch(ExcepcionLibreria e) {
            System.out.println(e.getMessage());
            anio = obtenerAnio();
        }
        return anio;
    }
    
    public static String obtenerIsbn(){
        String isbn = null;
        
        try{
            System.out.print("Ingrese el ISBN: ");
            isbn = leer.next();
            
            if(isbn.trim().isEmpty()){
                throw new ExcepcionLibreria("Campo obligatorio");
            }
            if(!isbn.matches("^[0-9]{13}$")){
                throw new ExcepcionLibreria("Debe ingresar 13 dígitos");
            }            
        } catch(ExcepcionLibreria e){
            System.out.println(e.getMessage());
            isbn = obtenerIsbn();
        }
        
        return isbn;
    }
    
    public static String generarIsbn(){
        return UUID.randomUUID().toString().replaceAll("[^0-9]","").substring(0,13);
    }
}
