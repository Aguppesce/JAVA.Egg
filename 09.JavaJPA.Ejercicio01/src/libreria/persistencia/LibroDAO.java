package libreria.persistencia;

import libreria.dominio.editorial.Editorial;
import libreria.dominio.libro.Libro;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.excepcion.ExcepcionLibreria;

public class LibroDAO {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio01PU");
    private final EntityManager em = emf.createEntityManager();

    public void guardarLibro(Libro libro) throws ExcepcionLibreria {
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }

    public void modificarLibro(Libro libro) throws ExcepcionLibreria {
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }

    public void eliminarLibroPorId(String id) throws ExcepcionLibreria {
        Libro libro = buscarLibroPorId(id);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

    public void eliminarLibroPorTitulo(String titulo) throws ExcepcionLibreria {
        Libro libro = buscarLibroPorTitulo(titulo);
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }

    //CONSULTA
    public Libro buscarLibroPorId(String id) throws ExcepcionLibreria {
        Libro libro = em.find(Libro.class, id);
        return libro;
    }

    public Libro buscarLibroPorIsbn(Long isbn) throws ExcepcionLibreria {
        try {
            return em.find(Libro.class, isbn);
        } catch (Exception e) {
            throw new ExcepcionLibreria("Error al buscar autor por isbn");
        }
    }

    //CONSULTA CON PARÁMETROS
    public Libro buscarLibroPorTitulo(String titulo) throws ExcepcionLibreria {
        Libro libro = (Libro) em.createQuery("SELECT l "
                + " FROM Libro l"
                + " WHERE l.tiulo LIKE :titulo").
                setParameter("titulo", titulo).
                getSingleResult();
        return libro;
    }

    public Libro buscarUnLibro() throws ExcepcionLibreria {
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l").getSingleResult();
        return libro;
    }
    
    public List<Libro> buscarLibros() throws ExcepcionLibreria{ //listarLibros
	try{
		//Forma Completa
		List<Libro> libros=em.createQuery("SELECT l FROM Libro", Libro.class).getResultList();
		return libros;	
	}catch(Exception e){			
		throw new ExcepcionLibreria("Error al buscar libros");
	}
}

    
}
