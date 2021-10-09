package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class LibreriaAPP {

    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio01PU");
        EntityManager em = emf.createEntityManager();
        MenuLibreria nuevaEjecucion = new MenuLibreria();
        nuevaEjecucion.menu();
    }
    
}
