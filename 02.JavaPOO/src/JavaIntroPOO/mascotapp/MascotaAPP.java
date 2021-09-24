package JavaIntroPOO.mascotapp;

import JavaIntroPOO.mascotapp.entidades.Mascota;
import JavaIntroPOO.mascotapp.servicios.ServicioMascota;
/**
 *
 * @author Agu
 */
public class MascotaAPP {

    public static void main(String[] args) {

        //Scanner leer = new Scanner(System.in); 
        //Mascota m1 = new Mascota("Fernando Chiquito", leer.next(), "Perro");
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1.toString());
        
        m1=null;
        
        
        int a = 10;
        
        Mascota mm = new Mascota();
        
        modificador(a,mm);
        
        System.out.println("a "+a);;
        System.out.println("Mascota"+mm);
    }
    
    public static void modificador(int num, Mascota m){
        num=100;
        m.setApodo("Mascota Referencia");
    }
}
