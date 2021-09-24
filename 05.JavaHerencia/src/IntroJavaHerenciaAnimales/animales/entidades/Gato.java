package IntroJavaHerenciaAnimales.animales.entidades;
/**
 *
 * @author Agu
 */
public final class Gato extends Animal {
    
    private String razaGatuna;

    public Gato(String razaGatuna, Integer patas, boolean cola, Integer anosDeVida, Double energia) {
        super(patas, cola, anosDeVida, energia);
        this.razaGatuna = razaGatuna;
    }

    public String getRazaGatuna() {
        return razaGatuna;
    }

    public void setRazaGatuna(String razaGatuna) {
        this.razaGatuna = razaGatuna;
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
    
   //------------------------------------------------------
    
    public void ronronear(){
        System.out.println("Prrrrrrrrrr....");
    }

    @Override
    public void calcularEdad(){
        System.out.println("La edad Gatuna para "+this.anosDeVida+" es "+(anosDeVida*8));
    }
    @Override
    public void hacerRuido() {
        super.hacerRuido();
        System.out.println("Miaaaaauuu");
    }
    
    
    
}
