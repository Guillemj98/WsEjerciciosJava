package modelo.negocio;

import java.sql.SQLException;

import entidad.Coche;
import modelo.persitencia.Dao;

public class Gestor {
	private static Gestor instance = null;
	private Gestor() {
		
	}
	public static Gestor getInstance() {
		if(instance == null) {
			instance = new Gestor();
		}
		return instance;
	}
	public void guardarCoche(Coche coche) throws SQLException {
		validarCoche(coche);
		// Al hacer el dao singletone debemos hacer esto para
		// podeer usar los metodos del dao, es decir, no usamos
		// la palabra reservada NEW.
		Dao dao = Dao.getInstance();
		// Invocamos el metodo que inserta el coche con la BBDD
		dao.insertarCoches(coche);
		
	}

	private void validarCoche(Coche coche ) {
		// Establecemos lo que pone el ejercicio que los datos introducidos
		// no pueden estar vacios.
		if(coche.getMarca() == null || coche.getMarca().isEmpty()) {
			System.out.println("La marca no puede ser null o estar vacía");
		}
		// Se que el ID tendria que hacerlo que se genere solo en vez de que lo 
		// ponga la persona para que sea unico, pero para el ejercicio vale asi.
		if(coche.getId() < 0 ) {
			System.out.println("El id no puede ser negativo");
		}
		if(coche.getModelo() == null || coche.getMarca().isEmpty()) {
			System.out.println("El modelo no puede ser null o estar vacío");
		}
		if(coche.getTipoMotor() == null || coche.getMarca().isEmpty()) {
			System.out.println("El tipo motor no puede ser null o estar vacío");
		}
		if(coche.getKm() < 0 ) {
			System.out.println("Los Km no pueden ser negativos");
		}
		
		
		
	}

}
