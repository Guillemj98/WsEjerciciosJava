package es.upgrade.modelo.persistencia;

import java.util.List;

import es.upgrade.modelo.entidad.Libro;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibroDao {
	private EntityManagerFactory factory;

	public LibroDao(EntityManagerFactory factory) {
        this.factory = factory;
    }

    public void guardarLibro(Libro libro) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
        em.close();
    }

    public List<Libro> listarLibros() {
        EntityManager em = factory.createEntityManager();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
        em.close();
        return libros;
    }
	

}
