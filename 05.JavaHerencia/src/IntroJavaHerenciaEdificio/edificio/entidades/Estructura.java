package IntroJavaHerenciaEdificio.edificio.entidades;
/**
 *
 * @author Agu
 */
public abstract class Estructura {
    
    protected Double superficieCubierta;
    protected Double superficieTotal;
    
    public Estructura(Double superficieTotal){
        this.superficieTotal = superficieTotal;
    }

    //Los geter y seter no son necesarios ya que las clases CasaCampo y Edificio heredan los atributos de esta clase
    //Además al ser una clase abstracta y no poder instanciar objetos de tipo Estructura los geter y seter son innesesarios
//    public Double getSuperficieCubierta() {
//        return superficieCubierta;
//    }
//
//    public void setSuperficieCubierta(Double superficieCubierta) {
//        this.superficieCubierta = superficieCubierta;
//    }
//
//    public Double getSuperficieTotal() {
//        return superficieTotal;
//    }
//
//    public void setSuperficieTotal(Double superficieTotal) {
//        this.superficieTotal = superficieTotal;
//    }
    
    public abstract void calcularSuperficie(double ancho, double largo);
}
