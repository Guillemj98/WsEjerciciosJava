package es.upgrade.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import es.upgrade.modelo.entidad.Autor;
import es.upgrade.modelo.entidad.Editorial;
import es.upgrade.modelo.entidad.Libreria;
import es.upgrade.modelo.entidad.Libro;
import es.upgrade.modelo.persistencia.AutorDao;
import es.upgrade.modelo.persistencia.EditorialDao;
import es.upgrade.modelo.persistencia.LibreriaDao;
import es.upgrade.modelo.persistencia.LibroDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.QueryHint;

public class Main {

	public static void main(String[] args) throws ParseException {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("libreriaPU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		AutorDao autorDao = new AutorDao(emf);
		LibroDao libroDao = new LibroDao(emf);
		LibreriaDao libreriaDao = new LibreriaDao(emf);
		EditorialDao editorialDao = new EditorialDao(emf);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");  // Formato de fecha: año-mes-día
        
        // Crear fechas de nacimiento
        Date fechaNacimiento1 = sdf.parse("25-11-1951");
        Date fechaNacimiento2 = sdf.parse("06-03-1927");
        Date fechaNacimiento3 = sdf.parse("15-09-1890");
        
		
		
        Autor autor1 = new Autor("Arturo", "Perez Reverte", sdf.parse("25-11-1951"));
        Autor autor2 = new Autor("Gabriel", "Garcia Marquez", sdf.parse("06-03-1927"));
        Autor autor3 = new Autor("Agatha", "Christie", sdf.parse("15-09-1890"));

        autorDao.guardarAutor(autor1);
        autorDao.guardarAutor(autor2);
        autorDao.guardarAutor(autor3);

        // 2️⃣ Crear y guardar editoriales
        Editorial editorial1 = new Editorial("Planeta", "Calle falsa 321");
        Editorial editorial2 = new Editorial("Anaya", "Calle Ficticia 123");

        editorialDao.guardarEditorial(editorial1);
        editorialDao.guardarEditorial(editorial2);

        // 3️⃣ Crear y guardar libros
        Libro libro1 = new Libro("Poirot investiga", 30, autor3, editorial1);
        Libro libro2 = new Libro("El misterio de Pale Horse", 25, autor3, editorial1);
        Libro libro3 = new Libro("Cien años de soledad", 12.99, autor2, editorial1);
        Libro libro4 = new Libro("El capitán Alatriste", 18.30, autor1, editorial2);

        libroDao.guardarLibro(libro1);
        libroDao.guardarLibro(libro2);
        libroDao.guardarLibro(libro3);
        libroDao.guardarLibro(libro4);

        // 4️⃣ Crear y guardar librerías
        Libreria libreria1 = new Libreria("Librería de Félix", "Hortaleza 34", "Félix", List.of(libro1, libro2));
        Libreria libreria2 = new Libreria("Librería de Muñones", "Colegio Corazonista", "El cocas", List.of(libro3, libro4));

        libreriaDao.guardarLibreria(libreria1);
        libreriaDao.guardarLibreria(libreria2);

        // 5️⃣ Consultar datos y mostrarlos en consola
        System.out.println("\n📚 Listado de libros con su autor y editorial:");
        List<Libro> libros = libroDao.listarLibros();
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo() + " - Autor: " + libro.getAutor().getNombre() +
                               " - Editorial: " + libro.getEditorial().getNombre());
        }

        System.out.println("\n👨‍🎨 Listado de autores con sus libros:");
        List<Autor> autores = autorDao.listarAutores();
        for (Autor autor : autores) {
            System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellidos());
            for (Libro libro : autor.getListaLibros()) {
                System.out.println("  📖 " + libro.getTitulo());
            }
        }

        System.out.println("\n🏠 Listado de librerías con sus libros:");
        List<Libreria> librerias = libreriaDao.listarLibrerias();
        for (Libreria libreria : librerias) {
            System.out.println("Librería: " + libreria.getNombre() + " - Dirección: " + libreria.getDireccion());
            for (Libro libro : libreria.getColeccionLibros()) {
                System.out.println("  📘 " + libro.getTitulo());
            }
        }

        
   
		
		emf.close();

	}
}


