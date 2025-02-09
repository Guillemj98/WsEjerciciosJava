package es.upgrade.modelo.persistencia;

import java.util.List;

import es.upgrade.modelo.entidad.Autor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AutorDao {
	private EntityManagerFactory factory;

	public AutorDao(EntityManagerFactory factory) {
        this.factory = factory;
    }

    public void guardarAutor(Autor autor) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        em.close();
    }

    public List<Autor> listarAutores() {
        EntityManager em = factory.createEntityManager();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a", Autor.class).getResultList();
        em.close();
        return autores;
    }
}
