package es.upgrade.modelo.persistencia;

import java.util.List;

import es.upgrade.modelo.entidad.Editorial;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class EditorialDao {
	private EntityManagerFactory factory;

    public EditorialDao(EntityManagerFactory factory) {
        this.factory = factory;
    }

    public void guardarEditorial(Editorial editorial) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(editorial);
        em.getTransaction().commit();
        em.close();
    }

    public List<Editorial> listarEditoriales() {
        EntityManager em = factory.createEntityManager();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e", Editorial.class).getResultList();
        em.close();
        return editoriales;
    }

}
