package IntroJavaHerenciaAnimales.animales.entidades;
/**
 *
 * @author Agu
 */
public abstract class Animal {
    
    protected Integer patas;
    protected boolean cola;
    protected Integer anosDeVida;
    protected Double energia;

    public Animal(Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        this.patas = patas;
        this.cola = cola;
        this.anosDeVida = anosDeVida;
        this.energia = energia;
    }
    
    public abstract void calcularEdad();
    
    public void hacerRuido(){
        System.out.println("**respiración animal");
    }
}
