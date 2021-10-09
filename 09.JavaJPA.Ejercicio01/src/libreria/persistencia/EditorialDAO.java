package libreria.persistencia;

import libreria.dominio.editorial.Editorial;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria.excepcion.ExcepcionLibreria;

public class EditorialDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio01PU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarEditorial(Editorial editorial) throws ExcepcionLibreria {
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
    }

    public void modificarEditorial(Editorial editorial) throws ExcepcionLibreria {
        em.getTransaction().begin();
        em.merge(editorial);
        em.getTransaction().commit();
    }

    public void eliminarEditorialPorId(Long id) throws ExcepcionLibreria {
        Editorial editorial = buscarEditorialPorId(id);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    public void eliminarEditorialPorNombre(String nombre) throws ExcepcionLibreria {
        Editorial editorial = buscarEditorialPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(editorial);
        em.getTransaction().commit();
    }

    //CONSULTA
    public Editorial buscarEditorialPorId(Long id) throws ExcepcionLibreria {
        Editorial editorial = em.find(Editorial.class, id);
        return editorial;
    }

    //CONSULTA CON PARÁMETROS
    public Editorial buscarEditorialPorNombre(String nombre) throws ExcepcionLibreria {
        try {
            Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre", Editorial.class)
                    .setParameter("nombre", nombre)
                    .getSingleResult();
            return editorial;
        } catch (NoResultException e) {
            return null;
        } catch (Exception e) {
            throw new ExcepcionLibreria("Error el buscar editorial por nombre");
        }

    }

    public Editorial buscarUnaEditorial() throws ExcepcionLibreria {
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e").getSingleResult();
        return editorial;
    }

    //CONSULTA SIN PARÁMETROS
    public List<Editorial> listarEditoriales() throws ExcepcionLibreria {
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e").
                getResultList();
        return editoriales;
    }
    
     //C: obtenerAutores -> List | A: listaAutores -> Collection
    public List<Editorial> listaEditoriales() throws ExcepcionLibreria {
        try {
            List<Editorial> editoriales = listarEditoriales();
            return editoriales;
        } catch (ExcepcionLibreria e) {
            System.out.println(e.getMessage());
            throw new ExcepcionLibreria("Error al obtener autores!");
        }
    }
}
