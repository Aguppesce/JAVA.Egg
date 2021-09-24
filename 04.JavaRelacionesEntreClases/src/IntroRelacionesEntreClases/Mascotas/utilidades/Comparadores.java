package IntroRelacionesEntreClases.Mascotas.utilidades;
import IntroRelacionesEntreClases.Mascotas.entidades.Mascota;
import java.util.Comparator;
/**
 *
 * @author Agu
 */
public class Comparadores {
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t1, Mascota t2) {
            return t2.getNombre().compareTo(t1.getNombre());
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t1, Mascota t2) {
            return t2.getEdad().compareTo(t1.getEdad());
        }
    };
}
