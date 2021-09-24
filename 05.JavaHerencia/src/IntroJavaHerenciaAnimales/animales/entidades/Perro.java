package IntroJavaHerenciaAnimales.animales.entidades;
/**
 *
 * @author Agu
 */
public final class Perro extends Animal {
    
    private String razaPerruna;

    public Perro(String razaPerruna, Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        super(patas, cola, anosDeVida, energia);
        this.razaPerruna = razaPerruna;
    }

    public String getRazaPerruna() {
        return razaPerruna;
    }

    public void setRazaPerruna(String razaPerruna) {
        this.razaPerruna = razaPerruna;
    }

    public Integer getPatas() {
        return patas;
    }

    public void setPatas(Integer patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public Integer getAnosDeVida() {
        return anosDeVida;
    }

    public void setAnosDeVida(Integer anosDeVida) {
        this.anosDeVida = anosDeVida;
    }

    public Double getEnergia() {
        return energia;
    }

    public void setEnergia(Double energia) {
        this.energia = energia;
    }

    //--------------------------------------------------------
    
    public void jugarEnParque(int tiempo){
        for (int i = 0; i < tiempo; i++) {
            energia -= 10;
        }
        System.out.println("La cantidad de energía restante es: "+this.energia);
    }
    
    @Override
    public void calcularEdad() {
        System.out.println("La edad perruna es paara "+this.anosDeVida+" es "+(anosDeVida*7));
    }
    
    @Override
    public void hacerRuido(){
        super.hacerRuido();
        System.out.println("Guaaaauuuu");
    }
    
    
}
