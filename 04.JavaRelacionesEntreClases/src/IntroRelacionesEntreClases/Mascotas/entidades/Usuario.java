package IntroRelacionesEntreClases.Mascotas.entidades;
import IntroRelacionesEntreClases.Mascotas.enumeraciones.SexoHumano;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Agu
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
    private Mascota mascotaFavorita;
    //private Mascota mascota; //descomentar para que quede relación 1 a 1
    private List<Mascota> mascotas; //relación uno a muchos, es decir un usario se puede vincular a ninguna o a muchas mascotas
    
    public Usuario() {
        
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ",\n dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + ",\n mascotaFavorita=" + mascotaFavorita + ",\n mascotas=" + mascotas + '}';
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    public Mascota getMascotaFavorita() {
        return mascotaFavorita;
    }

    public void setMascotaFavorita(Mascota mascotaFavorita) {
        this.mascotaFavorita = mascotaFavorita;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

}

