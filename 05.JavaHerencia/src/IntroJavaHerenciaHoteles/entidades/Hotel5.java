package IntroJavaHerenciaHoteles.entidades;
/**
 *
 * @author Agu
 */
public class Hotel5 extends Hotel4{
    
    protected boolean casino = true;
    protected boolean restaurant = true;

    public Hotel5(Double precio, Double superficie, Integer cantidadHabitaciones) {
        super(precio, superficie, cantidadHabitaciones);
    }
    
    
}
