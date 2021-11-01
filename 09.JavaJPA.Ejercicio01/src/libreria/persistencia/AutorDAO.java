package libreria.persistencia;

import libreria.dominio.autor.Autor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import libreria.excepcion.ExcepcionLibreria;

public class AutorDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio01PU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarAutor(Autor autor) throws ExcepcionLibreria {
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }

    public void modificarAutor(Autor autor) throws ExcepcionLibreria {
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }

    public void eliminarAutorPorId(Long id) throws ExcepcionLibreria {
        Autor autor = buscarAutorPorId(id);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }

    public void eliminarAutorPorNombre(String nombre) throws ExcepcionLibreria {
        Autor autor = buscarAutorPorNombre(nombre);
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }

    //CONSULTA
    public Autor buscarAutorPorId(Long id) throws ExcepcionLibreria {
        Autor autor = em.find(Autor.class, id);
        return autor;
    }
    
    public Autor buscarAutorPorNombre(String nombre) throws ExcepcionLibreria {
        Autor autor = (Autor) em.createQuery("SELECT a"
                + " FROM Autor a"
                + " WHERE a.nombre LIKE :nombre").
                setParameter("nombre", nombre).
                getSingleResult();
        return autor;
    }


    public Autor buscarUnAutor() throws ExcepcionLibreria {
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a").getSingleResult();
        return autor;
    }   
    
    public List<Autor> buscarAutores() throws ExcepcionLibreria { //listarLibros
        try {
            //Forma Completa
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
            return autores;
        } catch (Exception e) {
            throw new ExcepcionLibreria("Error al buscar autores");
        }
    }

}



//MÉTODOS ALTERNATIVOS
//CONSULTA SIN PARÁMETROS
//    public List<Autor> listarAutores() throws ExcepcionLibreria {
//        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").
//                getResultList();
//        return autores;
//    }
//    
//    //C: obtenerAutores -> List | A: listaAutores -> Collection
//    public List<Autor> listaAutores() throws ExcepcionLibreria {
//        try {
//            List<Autor> autores = listarAutores();
//            return autores;
//        } catch (ExcepcionLibreria e) {
//            System.out.println(e.getMessage());
//            throw new ExcepcionLibreria("Error al obtener autores!");
//        }
//    }
//CONSULTA CON PARÁMETROS
//    public Autor buscarAutorPorNombre(String nombreAutor) throws ExcepcionLibreria {
//        try {
//            Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombreAutor", Autor.class)
//                    .setParameter("nombre", nombreAutor)
//                    .getSingleResult();
//            return autor;
//        } catch(NoResultException e){
//            return null;
//        } catch(Exception e){
//            throw new ExcepcionLibreria("Error al buscar autor por nombre");
//        }
//    }