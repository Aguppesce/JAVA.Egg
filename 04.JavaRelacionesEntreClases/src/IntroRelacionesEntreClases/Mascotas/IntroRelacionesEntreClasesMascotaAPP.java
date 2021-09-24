package IntroRelacionesEntreClases.Mascotas;

import IntroRelacionesEntreClases.Mascotas.entidades.Mascota;
import IntroRelacionesEntreClases.Mascotas.entidades.Usuario;
import IntroRelacionesEntreClases.Mascotas.enumeraciones.RazaGatuna;
import IntroRelacionesEntreClases.Mascotas.enumeraciones.RazaPerruna;
import IntroRelacionesEntreClases.Mascotas.enumeraciones.SexoHumano;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Agu
 */
public class IntroRelacionesEntreClasesMascotaAPP {
    public static void main(String[] args) {
        
        Mascota m1 = new Mascota("Fer", "Chiquito", "Perro");
        Mascota m2 = new Mascota("Pepa", "Filomena", "Perro");        
        
        List<Mascota> mascotas = new ArrayList();
        mascotas.add(m1);
        mascotas.add(m2);
        
        Usuario u = new Usuario();
        
        u.setApellido("Fiorde");
        u.setSexo(SexoHumano.HOMBRE);
        u.setNacimiento(new Date("01/11/1991"));
        
        u.setMascotaFavorita(m1);
        
        u.setMascotas(mascotas);
        
        System.out.println(u.toString());
        
//        
//        Mascota m1 = new Mascota<RazaPerruna>("Fer", "Chiquito", "Perro");
//        m1.setRaza(RazaPerruna.BEAGLE);        
//        System.out.println(m1.toString());
//        
//        Mascota m2 = new Mascota<RazaGatuna>("Pepa", "Lola", "Gato");
//        m2.setRaza(RazaGatuna.NARANJOSO);
//        System.out.println(m2.toString());
        
////        String razaInput = "BEAGLE";     
////        
////        System.out.println(RazaPerruna.BEAGLE.toString()); //Muestra todos los atributos
////        System.out.println(RazaPerruna.BEAGLE.getCodigo()); //Acceder a los atributos de un enum específico
////        System.out.println(RazaPerruna.BEAGLE.getValor()); //Acceder a los atributos de un enum específico
//        
//        Usuario u = new Usuario();
//        
//        u.setSexo(SexoHumano.MUJER);
//        
//        
//        System.out.println(u.getSexo());
//        
//        for (RazaPerruna aux : RazaPerruna.values()) {
//            if(aux.toString().equals(razaInput)){
//                System.out.println("RazaPerruna input es igual al enum "+aux);
//            }
//        }
//        
//        for (RazaPerruna aux : RazaPerruna.values()) {
//            System.out.println(aux.ordinal());//muestra la posicion que ocupa dentro del enum
//        }
//        
//        for (RazaPerruna aux : RazaPerruna.values()) {
//            System.out.println(aux.name());//muestra todos los nombres de las razas que tiene el enum
//        }
    }
    
}
