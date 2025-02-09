package es.upgrade.modelo.persistencia;

import java.util.List;

import es.upgrade.modelo.entidad.Libreria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class LibreriaDao {
	private EntityManagerFactory factory;

	public LibreriaDao(EntityManagerFactory factory) {
        this.factory = factory;
    }

    public void guardarLibreria(Libreria libreria) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(libreria);
        em.getTransaction().commit();
        em.close();
    }

    public List<Libreria> listarLibrerias() {
        EntityManager em = factory.createEntityManager();
        List<Libreria> librerias = em.createQuery("SELECT l FROM Libreria l", Libreria.class).getResultList();
        em.close();
        return librerias;
    }
	

}
