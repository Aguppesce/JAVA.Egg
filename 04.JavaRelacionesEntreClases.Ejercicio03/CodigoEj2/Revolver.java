 
package Entidades;

 
public class Revolver {
    private int posicionAgua;
    private int posicionActual;

    public Revolver() {
    }

    public Revolver(int posicionAgua, int posicionActual) {
        this.posicionAgua = posicionAgua;
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionAgua=" + posicionAgua + ", posicionActual=" + posicionActual + '}';
    }
    
    
    
}
